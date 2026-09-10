package c2;

import java.util.Arrays;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class j {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public double w;

    public j(int i10, float f7, int i11, float f10, int i12) {
        this.a = i10;
        this.b = i11;
        this.c = f7;
        this.d = f10;
        this.e = i10 / i12;
        this.f = i10 / 400;
        int i13 = i10 / 65;
        this.g = i13;
        int i14 = i13 * 2;
        this.h = i14;
        this.i = new short[i14];
        this.j = new short[i14 * i11];
        this.l = new short[i14 * i11];
        this.n = new short[i14 * i11];
    }

    public static void e(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        short[] c10 = c(this.l, this.m, i11);
        this.l = c10;
        int i12 = this.b;
        System.arraycopy(sArr, i10 * i12, c10, this.m * i12, i12 * i11);
        this.m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.h / i11;
        int i13 = this.b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i15 * i11) {
                i16 = i11;
                i15 = i18;
            }
            if (i18 * i14 > i17 * i11) {
                i14 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.u = i15 / i16;
        this.v = i17 / i14;
        return i16;
    }

    public final void f() {
        float f7;
        double d;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j3;
        long j10;
        int i18 = this.m;
        float f10 = this.c;
        float f11 = this.d;
        double d10 = f10 / f11;
        float f12 = this.e * f11;
        int i19 = this.a;
        int i20 = 1;
        int i21 = this.b;
        int i22 = 0;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            int i23 = this.k;
            int i24 = this.h;
            if (i23 >= i24) {
                int i25 = 0;
                while (true) {
                    int i26 = this.r;
                    if (i26 > 0) {
                        int min = Math.min(i24, i26);
                        a(this.j, i25, min);
                        this.r -= min;
                        i25 += min;
                        f7 = f12;
                        d = d10;
                    } else {
                        short[] sArr = this.j;
                        int i27 = i19 > 4000 ? i19 / 4000 : 1;
                        int i28 = this.g;
                        int i29 = this.f;
                        if (i21 == i20 && i27 == i20) {
                            i10 = d(sArr, i25, i29, i28);
                            f7 = f12;
                            d = d10;
                        } else {
                            b(sArr, i25, i27);
                            f7 = f12;
                            d = d10;
                            short[] sArr2 = this.i;
                            int d11 = d(sArr2, i22, i29 / i27, i28 / i27);
                            if (i27 != 1) {
                                int i30 = d11 * i27;
                                int i31 = i27 * 4;
                                int i32 = i30 - i31;
                                int i33 = i30 + i31;
                                if (i32 >= i29) {
                                    i29 = i32;
                                }
                                if (i33 <= i28) {
                                    i28 = i33;
                                }
                                if (i21 == 1) {
                                    i10 = d(sArr, i25, i29, i28);
                                } else {
                                    b(sArr, i25, 1);
                                    i10 = d(sArr2, i22, i29, i28);
                                }
                            } else {
                                i10 = d11;
                            }
                        }
                        int i34 = this.u;
                        int i35 = this.v;
                        if (i34 == 0 || (i11 = this.s) == 0 || i35 > i34 * 3 || i34 * 2 <= this.t * 3) {
                            i11 = i10;
                        }
                        this.t = i34;
                        this.s = i10;
                        if (d > 1.0d) {
                            short[] sArr3 = this.j;
                            if (d >= 2.0d) {
                                i13 = i25;
                                double d12 = (i11 / (d - 1.0d)) + this.w;
                                int round = (int) Math.round(d12);
                                this.w = d12 - round;
                                i14 = round;
                            } else {
                                i13 = i25;
                                double d13 = (((2.0d - d) * i11) / (d - 1.0d)) + this.w;
                                int round2 = (int) Math.round(d13);
                                this.r = round2;
                                this.w = d13 - round2;
                                i14 = i11;
                            }
                            short[] c10 = c(this.l, this.m, i14);
                            this.l = c10;
                            int i36 = i13;
                            e(i14, this.b, c10, this.m, sArr3, i36, sArr3, i36 + i11);
                            this.m += i14;
                            i25 = i11 + i14 + i36;
                        } else {
                            int i37 = i25;
                            short[] sArr4 = this.j;
                            if (d < 0.5d) {
                                double d14 = ((i11 * d) / (1.0d - d)) + this.w;
                                int round3 = (int) Math.round(d14);
                                this.w = d14 - round3;
                                i12 = round3;
                            } else {
                                double d15 = ((((2.0d * d) - 1.0d) * i11) / (1.0d - d)) + this.w;
                                int round4 = (int) Math.round(d15);
                                this.r = round4;
                                this.w = d15 - round4;
                                i12 = i11;
                            }
                            int i38 = i11 + i12;
                            short[] c11 = c(this.l, this.m, i38);
                            this.l = c11;
                            System.arraycopy(sArr4, i37 * i21, c11, this.m * i21, i11 * i21);
                            e(i12, this.b, this.l, this.m + i11, sArr4, i37 + i11, sArr4, i37);
                            this.m += i38;
                            i25 = i37 + i12;
                        }
                    }
                    if (i25 + i24 > i23) {
                        break;
                    }
                    f12 = f7;
                    d10 = d;
                    i20 = 1;
                    i22 = 0;
                }
                int i39 = this.k - i25;
                short[] sArr5 = this.j;
                System.arraycopy(sArr5, i25 * i21, sArr5, 0, i39 * i21);
                this.k = i39;
                if (f7 != 1.0f || this.m == i18) {
                }
                long j11 = (long) (i19 / f7);
                long j12 = i19;
                while (j11 != 0 && j12 != 0 && j11 % 2 == 0 && j12 % 2 == 0) {
                    j11 /= 2;
                    j12 /= 2;
                }
                int i40 = this.m - i18;
                short[] c12 = c(this.n, this.o, i40);
                this.n = c12;
                System.arraycopy(this.l, i18 * i21, c12, this.o * i21, i40 * i21);
                this.m = i18;
                this.o += i40;
                int i41 = 0;
                while (true) {
                    i15 = this.o;
                    i16 = i15 - 1;
                    if (i41 >= i16) {
                        break;
                    }
                    while (true) {
                        i17 = this.p + 1;
                        j3 = i17;
                        long j13 = j3 * j11;
                        j10 = this.q;
                        if (j13 <= j10 * j12) {
                            break;
                        }
                        this.l = c(this.l, this.m, 1);
                        int i42 = 0;
                        while (i42 < i21) {
                            short[] sArr6 = this.l;
                            int i43 = (this.m * i21) + i42;
                            short[] sArr7 = this.n;
                            int i44 = (i41 * i21) + i42;
                            short s10 = sArr7[i44];
                            short s11 = sArr7[i44 + i21];
                            int i45 = i41;
                            long j14 = (r12 + 1) * j11;
                            long j15 = j14 - (this.q * j12);
                            long j16 = j14 - (this.p * j11);
                            sArr6[i43] = (short) ((((j16 - j15) * s11) + (s10 * j15)) / j16);
                            i42++;
                            i41 = i45;
                        }
                        this.q++;
                        this.m++;
                        i41 = i41;
                    }
                    int i46 = i41;
                    this.p = i17;
                    if (j3 == j12) {
                        this.p = 0;
                        e2.d.g(j10 == j11);
                        this.q = 0;
                    }
                    i41 = i46 + 1;
                }
                if (i16 == 0) {
                    return;
                }
                short[] sArr8 = this.n;
                System.arraycopy(sArr8, i16 * i21, sArr8, 0, (i15 - i16) * i21);
                this.o -= i16;
                return;
            }
        } else {
            a(this.j, 0, this.k);
            this.k = 0;
        }
        f7 = f12;
        if (f7 != 1.0f) {
        }
    }
}
