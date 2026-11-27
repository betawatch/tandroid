// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class foa {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final doa i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public double q;

    public foa(int i, int i2, float f, float f2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        this.h = i4 << 1;
        this.i = z ? new coa(this) : new eoa(this);
    }

    public final void a(int i, int i2) {
        doa doaVar = this.i;
        doaVar.i(i2);
        Object g = doaVar.g();
        int i3 = this.b;
        System.arraycopy(g, i * i3, doaVar.h(), this.k * i3, i3 * i2);
        this.k += i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        float f;
        int i;
        double d;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        long j2;
        int i9;
        int i10 = this.k;
        float f2 = this.c;
        float f3 = this.d;
        double d2 = f2 / f3;
        float f4 = this.e * f3;
        int i11 = this.a;
        int i12 = 1;
        doa doaVar = this.i;
        int i13 = this.b;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i14 = this.j;
            int i15 = this.h;
            if (i14 >= i15) {
                int i16 = 0;
                while (true) {
                    int i17 = this.o;
                    if (i17 > 0) {
                        int min = Math.min(i15, i17);
                        a(i16, min);
                        this.o -= min;
                        i16 += min;
                        f = f4;
                        d = d2;
                        i4 = i12;
                        i2 = i15;
                    } else {
                        int i18 = i11 > 4000 ? i11 / 4000 : i12;
                        int i19 = this.g;
                        int i20 = this.f;
                        if (i13 == i12 && i18 == i12) {
                            i = doaVar.e(i16, i20, i19);
                            f = f4;
                        } else {
                            doaVar.d(i16, i18);
                            f = f4;
                            int q = doaVar.q(i20 / i18, i19 / i18);
                            if (i18 != i12) {
                                int i21 = q * i18;
                                int i22 = i18 << 2;
                                int i23 = i21 - i22;
                                int i24 = i21 + i22;
                                if (i23 >= i20) {
                                    i20 = i23;
                                }
                                if (i24 <= i19) {
                                    i19 = i24;
                                }
                                if (i13 == i12) {
                                    i = doaVar.e(i16, i20, i19);
                                } else {
                                    doaVar.d(i16, i12);
                                    i = doaVar.q(i20, i19);
                                }
                            } else {
                                i = q;
                            }
                        }
                        int i25 = doaVar.j() ? this.p : i;
                        doaVar.f();
                        this.p = i;
                        double d3 = this.q;
                        if (d2 > 1.0d) {
                            if (d2 >= 2.0d) {
                                i5 = i12;
                                double d4 = (i25 / (d2 - 1.0d)) + d3;
                                i6 = (int) Math.round(d4);
                                d = d2;
                                this.q = d4 - i6;
                                doaVar = doaVar;
                            } else {
                                d = d2;
                                i5 = i12;
                                double d5 = (((2.0d - d) * i25) / (d - 1.0d)) + d3;
                                int round = (int) Math.round(d5);
                                this.o = round;
                                this.q = d5 - round;
                                i6 = i25;
                            }
                            doaVar.i(i6);
                            int i26 = i15;
                            int i27 = i6;
                            doaVar.m(i27, this.b, this.k, i16, i16 + i25);
                            this.k += i27;
                            i16 = i25 + i27 + i16;
                            i2 = i26;
                            i4 = i5;
                        } else {
                            d = d2;
                            int i28 = i12;
                            i2 = i15;
                            if (d < 0.5d) {
                                double d6 = ((i25 * d) / (1.0d - d)) + d3;
                                i3 = (int) Math.round(d6);
                                this.q = d6 - i3;
                            } else {
                                double d7 = ((((2.0d * d) - 1.0d) * i25) / (1.0d - d)) + d3;
                                int round2 = (int) Math.round(d7);
                                this.o = round2;
                                this.q = d7 - round2;
                                i3 = i25;
                            }
                            int i29 = i25 + i3;
                            doaVar.i(i29);
                            i4 = i28;
                            System.arraycopy(doaVar.g(), i16 * i13, doaVar.h(), this.k * i13, i25 * i13);
                            int i30 = i16;
                            doaVar.m(i3, this.b, this.k + i25, i25 + i16, i30);
                            this.k += i29;
                            i16 = i30 + i3;
                        }
                    }
                    if (i16 + i2 > i14) {
                        break;
                    }
                    i15 = i2;
                    f4 = f;
                    i12 = i4;
                    d2 = d;
                }
                int i31 = this.j - i16;
                System.arraycopy(doaVar.g(), i16 * i13, doaVar.g(), 0, i31 * i13);
                this.j = i31;
                if (f != 1.0f || this.k == i10) {
                }
                long j3 = (long) (i11 / f);
                long j4 = i11;
                while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                    j3 /= 2;
                    j4 /= 2;
                }
                int i32 = this.k - i10;
                doaVar.n(i32);
                System.arraycopy(doaVar.h(), i10 * i13, doaVar.l(), this.l * i13, i32 * i13);
                this.k = i10;
                this.l += i32;
                int i33 = 0;
                while (true) {
                    i7 = this.l - 1;
                    if (i33 >= i7) {
                        break;
                    }
                    while (true) {
                        i8 = this.m + 1;
                        j = i8;
                        long j5 = j * j3;
                        j2 = this.n;
                        i9 = i4;
                        if (j5 <= j2 * j4) {
                            break;
                        }
                        doaVar.i(i9);
                        doaVar.k(j4, i33, j3);
                        this.n += i9;
                        this.k += i9;
                    }
                    this.m = i8;
                    if (j == j4) {
                        this.m = 0;
                        yve.p(j2 == j3 ? i9 : 0);
                        this.n = 0;
                    }
                    i33++;
                    i4 = i9;
                }
                if (i7 != 0) {
                    System.arraycopy(doaVar.l(), i7 * i13, doaVar.l(), 0, (this.l - i7) * i13);
                    this.l -= i7;
                    return;
                }
                return;
            }
        } else {
            a(0, this.j);
            this.j = 0;
        }
        f = f4;
        i4 = 1;
        if (f != 1.0f) {
        }
    }
}
