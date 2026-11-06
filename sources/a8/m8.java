package a8;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class m8 {
    public static String a(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c10 = charArray[i7];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i7] = (char) (c10 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }
}
