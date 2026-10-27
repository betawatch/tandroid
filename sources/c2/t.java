package c2;

import a8.yb;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class t {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final r i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public double q;

    public t(int i10, int i11, float f7, float f10, int i12, boolean z10) {
        this.a = i10;
        this.b = i11;
        this.c = f7;
        this.d = f10;
        this.e = i10 / i12;
        this.f = i10 / 400;
        int i13 = i10 / 65;
        this.g = i13;
        this.h = i13 * 2;
        this.i = z10 ? new q(this) : new s(this);
    }

    public final void a(int i10, int i11) {
        r rVar = this.i;
        rVar.j(i11);
        Object h = rVar.h();
        int i12 = this.b;
        System.arraycopy(h, i10 * i12, rVar.i(), this.k * i12, i12 * i11);
        this.k += i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        float f7;
        int i10;
        double d;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j10;
        long j11;
        int i18 = this.k;
        float f10 = this.c;
        float f11 = this.d;
        double d10 = f10 / f11;
        float f12 = this.e * f11;
        int i19 = this.a;
        int i20 = 1;
        r rVar = this.i;
        int i21 = this.b;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            int i22 = this.j;
            int i23 = this.h;
            if (i22 >= i23) {
                int i24 = 0;
                while (true) {
                    int i25 = this.o;
                    if (i25 > 0) {
                        int min = Math.min(i23, i25);
                        a(i24, min);
                        this.o -= min;
                        i24 += min;
                        f7 = f12;
                        d = d10;
                        i13 = i20;
                        i11 = i23;
                    } else {
                        int i26 = i19 > 4000 ? i19 / 4000 : i20;
                        int i27 = this.g;
                        int i28 = this.f;
                        if (i21 == i20 && i26 == i20) {
                            i10 = rVar.f(i24, i28, i27);
                            f7 = f12;
                        } else {
                            rVar.e(i24, i26);
                            f7 = f12;
                            int q5 = rVar.q(i28 / i26, i27 / i26);
                            if (i26 != i20) {
                                int i29 = q5 * i26;
                                int i30 = i26 * 4;
                                int i31 = i29 - i30;
                                int i32 = i29 + i30;
                                if (i31 >= i28) {
                                    i28 = i31;
                                }
                                if (i32 <= i27) {
                                    i27 = i32;
                                }
                                if (i21 == i20) {
                                    i10 = rVar.f(i24, i28, i27);
                                } else {
                                    rVar.e(i24, i20);
                                    i10 = rVar.q(i28, i27);
                                }
                            } else {
                                i10 = q5;
                            }
                        }
                        int i33 = rVar.k() ? this.p : i10;
                        rVar.g();
                        this.p = i10;
                        if (d10 > 1.0d) {
                            if (d10 >= 2.0d) {
                                i14 = i20;
                                double d11 = (i33 / (d10 - 1.0d)) + this.q;
                                i15 = (int) Math.round(d11);
                                d = d10;
                                this.q = d11 - i15;
                                rVar = rVar;
                            } else {
                                d = d10;
                                i14 = i20;
                                double d12 = (((2.0d - d) * i33) / (d - 1.0d)) + this.q;
                                int round = (int) Math.round(d12);
                                this.o = round;
                                this.q = d12 - round;
                                i15 = i33;
                            }
                            rVar.j(i15);
                            int i34 = i23;
                            int i35 = i15;
                            rVar.m(i35, this.b, this.k, i24, i24 + i33);
                            this.k += i35;
                            i24 = i33 + i35 + i24;
                            i11 = i34;
                            i13 = i14;
                        } else {
                            d = d10;
                            int i36 = i20;
                            int i37 = i23;
                            if (d < 0.5d) {
                                i11 = i37;
                                double d13 = ((i33 * d) / (1.0d - d)) + this.q;
                                int round2 = (int) Math.round(d13);
                                this.q = d13 - round2;
                                i12 = round2;
                            } else {
                                i11 = i37;
                                double d14 = ((((d * 2.0d) - 1.0d) * i33) / (1.0d - d)) + this.q;
                                int round3 = (int) Math.round(d14);
                                this.o = round3;
                                this.q = d14 - round3;
                                i12 = i33;
                            }
                            int i38 = i33 + i12;
                            rVar.j(i38);
                            i13 = i36;
                            System.arraycopy(rVar.h(), i24 * i21, rVar.i(), this.k * i21, i33 * i21);
                            int i39 = i24;
                            rVar.m(i12, this.b, this.k + i33, i33 + i24, i39);
                            this.k += i38;
                            i24 = i39 + i12;
                        }
                    }
                    if (i24 + i11 > i22) {
                        break;
                    }
                    i23 = i11;
                    f12 = f7;
                    i20 = i13;
                    d10 = d;
                }
                int i40 = this.j - i24;
                System.arraycopy(rVar.h(), i24 * i21, rVar.h(), 0, i40 * i21);
                this.j = i40;
                if (f7 != 1.0f || this.k == i18) {
                }
                long j12 = (long) (i19 / f7);
                long j13 = i19;
                while (j12 != 0 && j13 != 0 && j12 % 2 == 0 && j13 % 2 == 0) {
                    j12 /= 2;
                    j13 /= 2;
                }
                int i41 = this.k - i18;
                rVar.n(i41);
                System.arraycopy(rVar.i(), i18 * i21, rVar.l(), this.l * i21, i41 * i21);
                this.k = i18;
                this.l += i41;
                int i42 = 0;
                while (true) {
                    i16 = this.l - 1;
                    if (i42 >= i16) {
                        break;
                    }
                    while (true) {
                        i17 = this.m + 1;
                        j10 = i17;
                        long j14 = j10 * j12;
                        j11 = this.n;
                        if (j14 <= j11 * j13) {
                            break;
                        }
                        int i43 = i13;
                        rVar.j(i43);
                        rVar.c(i42, j13, j12);
                        this.n += i43;
                        this.k += i43;
                    }
                    int i44 = i13;
                    this.m = i17;
                    if (j10 == j13) {
                        this.m = 0;
                        yb.p(j11 == j12 ? i44 : 0);
                        this.n = 0;
                    }
                    i42++;
                    i13 = i44;
                }
                if (i16 == 0) {
                    return;
                }
                System.arraycopy(rVar.l(), i16 * i21, rVar.l(), 0, (this.l - i16) * i21);
                this.l -= i16;
                return;
            }
        } else {
            a(0, this.j);
            this.j = 0;
        }
        f7 = f12;
        i13 = 1;
        if (f7 != 1.0f) {
        }
    }
}
