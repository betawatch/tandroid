package e5;

import com.googlecode.mp4parser.e;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class c extends e {
    static {
        rc.c.a(c.class);
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
