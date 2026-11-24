// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ewa {
    public static final ewa f = new ewa(wpb.b, 0, 0, 0);
    public final int a;
    public final wpb b;
    public final int c;
    public final int d;
    public final byte e;

    public ewa(wpb wpbVar, int i, int i2, int i3) {
        this.b = wpbVar;
        this.a = i;
        this.c = i2;
        this.d = i3;
        this.e = i2 > 62 ? (byte) 21 : i2 > 31 ? (byte) 20 : i2 > 0 ? (byte) 10 : (byte) 0;
    }

    public final ewa a(int i) {
        wpb wpbVar = this.b;
        int i2 = this.a;
        int i3 = this.d;
        if (i2 == 4 || i2 == 2) {
            int[] iArr = ae5.b[i2];
            i2 = 0;
            int i4 = iArr[0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            wpbVar.getClass();
            i3 += i6;
            wpbVar = new kia(wpbVar, i5, i6);
        }
        int i7 = this.c;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        int i9 = i7 + 1;
        ewa ewaVar = new ewa(wpbVar, i2, i9, i3 + i8);
        return i9 == 2078 ? ewaVar.b(i + 1) : ewaVar;
    }

    public final ewa b(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        wpb wpbVar = this.b;
        wpbVar.getClass();
        return new ewa(new oi0(wpbVar, i - i2, i2), this.a, 0, this.d);
    }

    public final boolean c(ewa ewaVar) {
        int i = this.d + (ae5.b[this.a][ewaVar.a] >> 16);
        int i2 = ewaVar.c;
        int i3 = this.c;
        if (i3 < i2) {
            i += ewaVar.e - this.e;
        } else if (i3 > i2 && i2 > 0) {
            i += 10;
        }
        return i <= ewaVar.d;
    }

    public final ewa d(int i, int i2) {
        int i3 = this.d;
        wpb wpbVar = this.b;
        int i4 = this.a;
        if (i != i4) {
            int i5 = ae5.b[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            wpbVar.getClass();
            i3 += i7;
            wpbVar = new kia(wpbVar, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        wpbVar.getClass();
        return new ewa(new kia(wpbVar, i2, i8), i, 0, i3 + i8);
    }

    public final ewa e(int i, int i2) {
        int i3 = this.a;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = ae5.d[i3][i];
        wpb wpbVar = this.b;
        wpbVar.getClass();
        return new ewa(new kia(new kia(wpbVar, i5, i4), i2, 5), i3, 0, this.d + i4 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", ae5.a[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
