import java.util.Scanner;

public class Main {

    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         
 		int time = scanner.nextInt();
 		int minute = scanner.nextInt();
 		
 		int t;
 		int m;
 		
 		if (minute < 45 && time != 0) {
 			m = 60-(45-minute);
 			t = time-1;
 			System.out.println(t);
 			System.out.println(m);
 		} else if(minute < 45 && time == 0) {
 			m = 60-(45-minute);
 			t = 23;
 			System.out.println(t);
 			System.out.println(m);
 		}
 		if (minute >= 45 && time != 0) {
 			m = minute - 45;
 			t = time;
 			System.out.println(t);
 			System.out.println(m);
 		} else if (minute >= 45 && time == 0) {
 			m = minute - 45;
 			t = time;
 			System.out.println(t);
 			System.out.println(m);
 		}
     }
 }