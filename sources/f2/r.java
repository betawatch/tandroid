package f2;

import a8.ia;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class r {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final q i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public double q;

    public r(int i7, int i10, float f10, float f11, int i11, boolean z9) {
        this.a = i7;
        this.b = i10;
        this.c = f10;
        this.d = f11;
        this.e = i7 / i11;
        this.f = i7 / 400;
        int i12 = i7 / 65;
        this.g = i12;
        this.h = i12 * 2;
        this.i = z9 ? new p(this) : new cc.e(this);
    }

    public final void a(int i7, int i10) {
        q qVar = this.i;
        qVar.i(i10);
        Object g10 = qVar.g();
        int i11 = this.b;
        System.arraycopy(g10, i7 * i11, qVar.h(), this.k * i11, i11 * i10);
        this.k += i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        float f10;
        int i7;
        double d;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j3;
        long j10;
        int i17 = this.k;
        float f11 = this.c;
        float f12 = this.d;
        double d2 = f11 / f12;
        float f13 = this.e * f12;
        int i18 = this.a;
        int i19 = 1;
        q qVar = this.i;
        int i20 = this.b;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i21 = this.j;
            int i22 = this.h;
            if (i21 >= i22) {
                int i23 = 0;
                while (true) {
                    int i24 = this.o;
                    if (i24 > 0) {
                        int min = Math.min(i22, i24);
                        a(i23, min);
                        this.o -= min;
                        i23 += min;
                        f10 = f13;
                        d = d2;
                        i12 = i19;
                        i10 = i22;
                    } else {
                        int i25 = i18 > 4000 ? i18 / 4000 : i19;
                        int i26 = this.g;
                        int i27 = this.f;
                        if (i20 == i19 && i25 == i19) {
                            i7 = qVar.e(i23, i27, i26);
                            f10 = f13;
                        } else {
                            qVar.d(i23, i25);
                            f10 = f13;
                            int q10 = qVar.q(i27 / i25, i26 / i25);
                            if (i25 != i19) {
                                int i28 = q10 * i25;
                                int i29 = i25 * 4;
                                int i30 = i28 - i29;
                                int i31 = i28 + i29;
                                if (i30 >= i27) {
                                    i27 = i30;
                                }
                                if (i31 <= i26) {
                                    i26 = i31;
                                }
                                if (i20 == i19) {
                                    i7 = qVar.e(i23, i27, i26);
                                } else {
                                    qVar.d(i23, i19);
                                    i7 = qVar.q(i27, i26);
                                }
                            } else {
                                i7 = q10;
                            }
                        }
                        int i32 = qVar.j() ? this.p : i7;
                        qVar.f();
                        this.p = i7;
                        if (d2 > 1.0d) {
                            if (d2 >= 2.0d) {
                                i13 = i19;
                                double d10 = (i32 / (d2 - 1.0d)) + this.q;
                                i14 = (int) Math.round(d10);
                                d = d2;
                                this.q = d10 - i14;
                                qVar = qVar;
                            } else {
                                d = d2;
                                i13 = i19;
                                double d11 = (((2.0d - d) * i32) / (d - 1.0d)) + this.q;
                                int round = (int) Math.round(d11);
                                this.o = round;
                                this.q = d11 - round;
                                i14 = i32;
                            }
                            qVar.i(i14);
                            int i33 = i22;
                            int i34 = i14;
                            qVar.m(i34, this.b, this.k, i23, i23 + i32);
                            this.k += i34;
                            i23 = i32 + i34 + i23;
                            i10 = i33;
                            i12 = i13;
                        } else {
                            d = d2;
                            int i35 = i19;
                            int i36 = i22;
                            if (d < 0.5d) {
                                i10 = i36;
                                double d12 = ((i32 * d) / (1.0d - d)) + this.q;
                                int round2 = (int) Math.round(d12);
                                this.q = d12 - round2;
                                i11 = round2;
                            } else {
                                i10 = i36;
                                double d13 = ((((d * 2.0d) - 1.0d) * i32) / (1.0d - d)) + this.q;
                                int round3 = (int) Math.round(d13);
                                this.o = round3;
                                this.q = d13 - round3;
                                i11 = i32;
                            }
                            int i37 = i32 + i11;
                            qVar.i(i37);
                            i12 = i35;
                            System.arraycopy(qVar.g(), i23 * i20, qVar.h(), this.k * i20, i32 * i20);
                            int i38 = i23;
                            qVar.m(i11, this.b, this.k + i32, i32 + i23, i38);
                            this.k += i37;
                            i23 = i38 + i11;
                        }
                    }
                    if (i23 + i10 > i21) {
                        break;
                    }
                    i22 = i10;
                    f13 = f10;
                    i19 = i12;
                    d2 = d;
                }
                int i39 = this.j - i23;
                System.arraycopy(qVar.g(), i23 * i20, qVar.g(), 0, i39 * i20);
                this.j = i39;
                if (f10 != 1.0f || this.k == i17) {
                }
                long j11 = (long) (i18 / f10);
                long j12 = i18;
                while (j11 != 0 && j12 != 0 && j11 % 2 == 0 && j12 % 2 == 0) {
                    j11 /= 2;
                    j12 /= 2;
                }
                int i40 = this.k - i17;
                qVar.n(i40);
                System.arraycopy(qVar.h(), i17 * i20, qVar.l(), this.l * i20, i40 * i20);
                this.k = i17;
                this.l += i40;
                int i41 = 0;
                while (true) {
                    i15 = this.l - 1;
                    if (i41 >= i15) {
                        break;
                    }
                    while (true) {
                        i16 = this.m + 1;
                        j3 = i16;
                        long j13 = j3 * j11;
                        j10 = this.n;
                        if (j13 <= j10 * j12) {
                            break;
                        }
                        int i42 = i12;
                        qVar.i(i42);
                        qVar.k(j12, i41, j11);
                        this.n += i42;
                        this.k += i42;
                    }
                    int i43 = i12;
                    this.m = i16;
                    if (j3 == j12) {
                        this.m = 0;
                        ia.p(j10 == j11 ? i43 : 0);
                        this.n = 0;
                    }
                    i41++;
                    i12 = i43;
                }
                if (i15 == 0) {
                    return;
                }
                System.arraycopy(qVar.l(), i15 * i20, qVar.l(), 0, (this.l - i15) * i20);
                this.l -= i15;
                return;
            }
        } else {
            a(0, this.j);
            this.j = 0;
        }
        f10 = f13;
        i12 = 1;
        if (f10 != 1.0f) {
        }
    }
}
