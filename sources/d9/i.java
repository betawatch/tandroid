package d9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class i implements l {
    public static String a(char c10) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static i b(String str) {
        int length = str.length();
        return length != 0 ? length != 1 ? length != 2 ? new c(str) : new f(str.charAt(0), str.charAt(1)) : new e(str.charAt(0), 0) : b.f;
    }

    public abstract boolean c(char c10);

    public i d() {
        return new c(this);
    }
}
