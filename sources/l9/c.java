package l9;

import java.util.Arrays;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class c {
    public static final byte[] a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < 10; i7++) {
            bArr[i7 + 48] = (byte) i7;
        }
        for (int i10 = 0; i10 < 26; i10++) {
            byte b10 = (byte) (i10 + 10);
            bArr[i10 + 65] = b10;
            bArr[i10 + 97] = b10;
        }
        a = bArr;
    }
}
