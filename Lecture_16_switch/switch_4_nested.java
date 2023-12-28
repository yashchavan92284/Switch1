public class switch_4_nested {
    public static void main(String args []){
        String str = "Netflix";
        // String str3 = "Prime video";
        
        switch(str){
            case "Netflix":{
                    String str1 ="Movies";
                        switch(str1){
                            case "Web series":{
                                System.out.println("WEB SERIES REACHED IN NETFLIX");
                            }
                                break;
                            case "Movies":{
                                 System.out.println("MOVIES REACHED IN NETFLIX");
                            }
                            break;
                            default:System.out.println("Default IN NETFLIX");
                            break;
                    }
            }
        case "Prime video":{
            String str3 = "Web series";
               switch(str3){
                            case "Web series":{
                                System.out.println("WEB SERIES REACHED IN Prime Video");
                            }
                                break;
                            case "Movies":{
                                 System.out.println("MOVIES REACHED IN Prime Video");
                            }
                            break;
                             default:System.out.println("Default IN Prime video");
                             break;
                    }
        }
        }
    }
}
