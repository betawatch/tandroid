// default package

/* loaded from: classes.dex */
public abstract class o2e {
    public static final z2e a;

    static {
        a = (x1e.f && x1e.e) ? new z2e((byte) 1) : new z2e((byte) 0);
    }

    public static int a(int i, int i2, byte[] bArr) {
        int i3;
        int i4 = bArr[i - 1];
        int i5 = i2 - i;
        if (i5 == 0) {
            if (i4 > -12) {
                return -1;
            }
            return i4;
        }
        if (i5 == 1) {
            int i6 = bArr[i];
            if (i4 > -12 || i6 > -65) {
                return -1;
            }
            i3 = i6 << 8;
        } else {
            if (i5 != 2) {
                zo4.f();
                return 0;
            }
            int i7 = bArr[i];
            int i8 = bArr[i + 1];
            if (i4 > -12 || i7 > -65 || i8 > -65) {
                return -1;
            }
            i4 ^= i7 << 8;
            i3 = i8 << 16;
        }
        return i4 ^ i3;
    }
}
