package h5;

import com.googlecode.mp4parser.e;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
