// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class h0b {
    public static final h0b f = new h0b(xtb.b, 0, 0, 0);
    public final int a;
    public final xtb b;
    public final int c;
    public final int d;
    public final byte e;

    public h0b(xtb xtbVar, int i, int i2, int i3) {
        this.b = xtbVar;
        this.a = i;
        this.c = i2;
        this.d = i3;
        this.e = i2 > 62 ? (byte) 21 : i2 > 31 ? (byte) 20 : i2 > 0 ? (byte) 10 : (byte) 0;
    }

    public final h0b a(int i) {
        xtb xtbVar = this.b;
        int i2 = this.a;
        int i3 = this.d;
        if (i2 == 4 || i2 == 2) {
            int[] iArr = bg5.b[i2];
            i2 = 0;
            int i4 = iArr[0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            xtbVar.getClass();
            i3 += i6;
            xtbVar = new fma(xtbVar, i5, i6);
        }
        int i7 = this.c;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        int i9 = i7 + 1;
        h0b h0bVar = new h0b(xtbVar, i2, i9, i3 + i8);
        return i9 == 2078 ? h0bVar.b(i + 1) : h0bVar;
    }

    public final h0b b(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        xtb xtbVar = this.b;
        xtbVar.getClass();
        return new h0b(new pi0(xtbVar, i - i2, i2), this.a, 0, this.d);
    }

    public final boolean c(h0b h0bVar) {
        int i = this.d + (bg5.b[this.a][h0bVar.a] >> 16);
        int i2 = h0bVar.c;
        int i3 = this.c;
        if (i3 < i2) {
            i += h0bVar.e - this.e;
        } else if (i3 > i2 && i2 > 0) {
            i += 10;
        }
        return i <= h0bVar.d;
    }

    public final h0b d(int i, int i2) {
        int i3 = this.d;
        xtb xtbVar = this.b;
        int i4 = this.a;
        if (i != i4) {
            int i5 = bg5.b[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            xtbVar.getClass();
            i3 += i7;
            xtbVar = new fma(xtbVar, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        xtbVar.getClass();
        return new h0b(new fma(xtbVar, i2, i8), i, 0, i3 + i8);
    }

    public final h0b e(int i, int i2) {
        int i3 = this.a;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = bg5.d[i3][i];
        xtb xtbVar = this.b;
        xtbVar.getClass();
        return new h0b(new fma(new fma(xtbVar, i5, i4), i2, 5), i3, 0, this.d + i4 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", bg5.a[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
