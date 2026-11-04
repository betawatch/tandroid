package g5;

import com.googlecode.mp4parser.e;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class c extends e {
    static {
        mc.c.a(c.class);
    }

    public static byte[] d(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i3 = 0; i3 < Math.min(4, str.length()); i3++) {
                bArr[i3] = (byte) str.charAt(i3);
            }
        }
        return bArr;
    }
}
