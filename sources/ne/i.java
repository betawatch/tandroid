package ne;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class i {
    public static final String[] a;
    public static final byte[] b;

    static {
        String[] strArr = new String[93];
        for (int i3 = 0; i3 < 32; i3++) {
            strArr[i3] = "\\u" + a(i3 >> 12) + a(i3 >> 8) + a(i3 >> 4) + a(i3);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        a = strArr;
        byte[] bArr = new byte[93];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr[i10] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        b = bArr;
    }

    public static final char a(int i3) {
        int i10 = i3 & 15;
        return (char) (i10 < 10 ? i10 + 48 : i10 + 87);
    }
}
