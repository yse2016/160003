import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Aloha{
	public static void main(String[] args) {
		window win =new window();
		
	}
}

class window  {
	JFrame frame;
	JButton button;
	JPanel panel;
	JTextField fileNameField;

	public window() {
		
		frame = new JFrame("window");
		frame.setLocation(400,400);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button = new JButton("Click");
		fileNameField = new JTextField("ALOHA",15);

		panel = new JPanel();
		panel.add(fileNameField);
		panel.add(button);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2,1));
		con.add(panel);


		
		frame.setVisible(true);
	}

	public void ActionPerformed(ActionEvent ae) {
		fileNameField.setText("Hello");
	}
}