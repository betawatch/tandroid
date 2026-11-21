package h5;

import com.googlecode.mp4parser.e;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class c extends e {
    static {
        pc.c.a(c.class);
    }

    public static byte[] d(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i7 = 0; i7 < Math.min(4, str.length()); i7++) {
                bArr[i7] = (byte) str.charAt(i7);
            }
        }
        return bArr;
    }
}
