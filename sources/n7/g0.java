package n7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class g0 {
    public static final char[] a = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof g0) {
            byte[] bArr = ((f0) this).b;
            int length = bArr.length * 8;
            byte[] bArr2 = ((f0) ((g0) obj)).b;
            if (length == bArr2.length * 8) {
                if (bArr.length == bArr2.length) {
                    z10 = true;
                    for (int i10 = 0; i10 < bArr.length; i10++) {
                        z10 &= bArr[i10] == bArr2[i10];
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((f0) this).b;
        if (bArr.length * 8 < 32) {
            int i10 = bArr[0] & 255;
            for (int i11 = 1; i11 < bArr.length; i11++) {
                i10 |= (bArr[i11] & 255) << (i11 * 8);
            }
            return i10;
        }
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(a.c("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public final String toString() {
        byte[] bArr = ((f0) this).b;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            char[] cArr = a;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
