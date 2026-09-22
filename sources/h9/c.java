package h9;

import java.util.Arrays;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class c {
    public static final byte[] a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < 10; i10++) {
            bArr[i10 + 48] = (byte) i10;
        }
        for (int i11 = 0; i11 < 26; i11++) {
            byte b10 = (byte) (i11 + 10);
            bArr[i11 + 65] = b10;
            bArr[i11 + 97] = b10;
        }
        a = bArr;
    }
}
