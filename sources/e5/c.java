package e5;

import com.googlecode.mp4parser.e;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class c extends e {
    static {
        jc.c.a(c.class);
    }

    public static byte[] d(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i10 = 0; i10 < Math.min(4, str.length()); i10++) {
                bArr[i10] = (byte) str.charAt(i10);
            }
        }
        return bArr;
    }
}
