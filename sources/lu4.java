// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class lu4 {
    public static final lu4 h = new lu4(4201, TLObject.FLAG_12, 1);
    public static final lu4 i = new lu4(1033, 1024, 1);
    public static final lu4 j = new lu4(67, 64, 1);
    public static final lu4 k = new lu4(19, 16, 1);
    public static final lu4 l = new lu4(jn7.H4, 256, 0);
    public static final lu4 m = new lu4(jn7.X4, 256, 1);
    public final int[] a;
    public final int[] b;
    public final mu4 c;
    public final mu4 d;
    public final short e;
    public final short f;
    public final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public lu4(int i2, int i3, int i4) {
        this.f = i2;
        this.e = i3;
        this.g = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new mu4(this, new int[]{0});
        this.d = new mu4(this, new int[]{1});
    }

    public final mu4 a(int i2, int i3) {
        if (i2 < 0) {
            iy8.d();
            return null;
        }
        if (i3 == 0) {
            return this.c;
        }
        int[] iArr = new int[i2 + 1];
        iArr[0] = i3;
        return new mu4(this, iArr);
    }

    public final int b(int i2) {
        if (i2 == 0) {
            throw new ArithmeticException();
        }
        return this.a[(this.e - this.b[i2]) - 1];
    }

    public final int c(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.a[(iArr[i2] + iArr[i3]) % (this.e - 1)];
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f) + ',' + ((int) this.e) + ')';
    }
}
