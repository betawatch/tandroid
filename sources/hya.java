// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hya {
    public static final hya f = new hya(xrb.b, 0, 0, 0);
    public final int a;
    public final xrb b;
    public final int c;
    public final int d;
    public final byte e;

    public hya(xrb xrbVar, int i, int i2, int i3) {
        this.b = xrbVar;
        this.a = i;
        this.c = i2;
        this.d = i3;
        this.e = i2 > 62 ? (byte) 21 : i2 > 31 ? (byte) 20 : i2 > 0 ? (byte) 10 : (byte) 0;
    }

    public final hya a(int i) {
        xrb xrbVar = this.b;
        int i2 = this.a;
        int i3 = this.d;
        if (i2 == 4 || i2 == 2) {
            int[] iArr = yf5.b[i2];
            i2 = 0;
            int i4 = iArr[0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            xrbVar.getClass();
            i3 += i6;
            xrbVar = new mka(xrbVar, i5, i6);
        }
        int i7 = this.c;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        int i9 = i7 + 1;
        hya hyaVar = new hya(xrbVar, i2, i9, i3 + i8);
        return i9 == 2078 ? hyaVar.b(i + 1) : hyaVar;
    }

    public final hya b(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        xrb xrbVar = this.b;
        xrbVar.getClass();
        return new hya(new oj0(xrbVar, i - i2, i2), this.a, 0, this.d);
    }

    public final boolean c(hya hyaVar) {
        int i = this.d + (yf5.b[this.a][hyaVar.a] >> 16);
        int i2 = hyaVar.c;
        int i3 = this.c;
        if (i3 < i2) {
            i += hyaVar.e - this.e;
        } else if (i3 > i2 && i2 > 0) {
            i += 10;
        }
        return i <= hyaVar.d;
    }

    public final hya d(int i, int i2) {
        int i3 = this.d;
        xrb xrbVar = this.b;
        int i4 = this.a;
        if (i != i4) {
            int i5 = yf5.b[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            xrbVar.getClass();
            i3 += i7;
            xrbVar = new mka(xrbVar, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        xrbVar.getClass();
        return new hya(new mka(xrbVar, i2, i8), i, 0, i3 + i8);
    }

    public final hya e(int i, int i2) {
        int i3 = this.a;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = yf5.d[i3][i];
        xrb xrbVar = this.b;
        xrbVar.getClass();
        return new hya(new mka(new mka(xrbVar, i5, i4), i2, 5), i3, 0, this.d + i4 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", yf5.a[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
