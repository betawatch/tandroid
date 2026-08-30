package l3;

import java.util.Arrays;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class r0 {
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

    public r0(int i10, float f10, int i11, float f11, int i12) {
        this.a = i10;
        this.b = i11;
        this.c = f10;
        this.d = f11;
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
        short[] c3 = c(this.l, this.m, i11);
        this.l = c3;
        int i12 = this.b;
        System.arraycopy(sArr, i10 * i12, c3, this.m * i12, i12 * i11);
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
        float f10;
        float f11;
        float f12;
        double d;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.m;
        float f13 = this.c;
        float f14 = this.d;
        float f15 = f13 / f14;
        float f16 = this.e * f14;
        double d10 = f15;
        int i19 = this.a;
        int i20 = 1;
        int i21 = this.b;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            int i22 = this.k;
            int i23 = this.h;
            if (i22 >= i23) {
                int i24 = 0;
                while (true) {
                    int i25 = this.r;
                    if (i25 > 0) {
                        int min = Math.min(i23, i25);
                        a(this.j, i24, min);
                        this.r -= min;
                        i24 += min;
                        f11 = f15;
                        f12 = f16;
                        d = d10;
                        f10 = 1.0f;
                    } else {
                        short[] sArr = this.j;
                        int i26 = i19 > 4000 ? i19 / 4000 : 1;
                        f10 = 1.0f;
                        int i27 = this.g;
                        int i28 = this.f;
                        if (i21 == i20 && i26 == i20) {
                            i10 = d(sArr, i24, i28, i27);
                            f11 = f15;
                            f12 = f16;
                            d = d10;
                        } else {
                            b(sArr, i24, i26);
                            f11 = f15;
                            f12 = f16;
                            short[] sArr2 = this.i;
                            d = d10;
                            int d11 = d(sArr2, 0, i28 / i26, i27 / i26);
                            if (i26 != 1) {
                                int i29 = d11 * i26;
                                int i30 = i26 * 4;
                                int i31 = i29 - i30;
                                int i32 = i29 + i30;
                                if (i31 >= i28) {
                                    i28 = i31;
                                }
                                if (i32 <= i27) {
                                    i27 = i32;
                                }
                                if (i21 == 1) {
                                    i10 = d(sArr, i24, i28, i27);
                                } else {
                                    b(sArr, i24, 1);
                                    i10 = d(sArr2, 0, i28, i27);
                                }
                            } else {
                                i10 = d11;
                            }
                        }
                        int i33 = this.u;
                        int i34 = this.v;
                        if (i33 == 0 || (i11 = this.s) == 0 || i34 > i33 * 3 || i33 * 2 <= this.t * 3) {
                            i11 = i10;
                        }
                        this.t = i33;
                        this.s = i10;
                        if (d > 1.0d) {
                            short[] sArr3 = this.j;
                            if (f11 >= 2.0f) {
                                i13 = (int) (i11 / (f11 - 1.0f));
                            } else {
                                this.r = (int) (((2.0f - f11) * i11) / (f11 - 1.0f));
                                i13 = i11;
                            }
                            short[] c3 = c(this.l, this.m, i13);
                            this.l = c3;
                            int i35 = i24 + i11;
                            int i36 = i24;
                            int i37 = i13;
                            e(i37, this.b, c3, this.m, sArr3, i36, sArr3, i35);
                            this.m += i37;
                            i24 = i11 + i37 + i36;
                        } else {
                            int i38 = i24;
                            short[] sArr4 = this.j;
                            if (f11 < 0.5f) {
                                i12 = (int) ((i11 * f11) / (1.0f - f11));
                            } else {
                                this.r = (int) ((((2.0f * f11) - 1.0f) * i11) / (1.0f - f11));
                                i12 = i11;
                            }
                            int i39 = i11 + i12;
                            short[] c10 = c(this.l, this.m, i39);
                            this.l = c10;
                            System.arraycopy(sArr4, i38 * i21, c10, this.m * i21, i11 * i21);
                            e(i12, this.b, this.l, this.m + i11, sArr4, i38 + i11, sArr4, i38);
                            this.m += i39;
                            i24 = i38 + i12;
                        }
                    }
                    if (i24 + i23 > i22) {
                        break;
                    }
                    f15 = f11;
                    f16 = f12;
                    d10 = d;
                    i20 = 1;
                }
                int i40 = this.k - i24;
                short[] sArr5 = this.j;
                System.arraycopy(sArr5, i24 * i21, sArr5, 0, i40 * i21);
                this.k = i40;
                if (f12 != f10 || this.m == i18) {
                }
                int i41 = (int) (i19 / f12);
                while (true) {
                    if (i41 <= 16384 && i19 <= 16384) {
                        break;
                    }
                    i41 /= 2;
                    i19 /= 2;
                }
                int i42 = this.m - i18;
                short[] c11 = c(this.n, this.o, i42);
                this.n = c11;
                System.arraycopy(this.l, i18 * i21, c11, this.o * i21, i42 * i21);
                this.m = i18;
                this.o += i42;
                int i43 = 0;
                while (true) {
                    i14 = this.o;
                    i15 = i14 - 1;
                    if (i43 >= i15) {
                        break;
                    }
                    while (true) {
                        i16 = this.p + 1;
                        int i44 = i16 * i41;
                        i17 = this.q;
                        if (i44 <= i17 * i19) {
                            break;
                        }
                        this.l = c(this.l, this.m, 1);
                        for (int i45 = 0; i45 < i21; i45++) {
                            short[] sArr6 = this.l;
                            int i46 = (this.m * i21) + i45;
                            short[] sArr7 = this.n;
                            int i47 = (i43 * i21) + i45;
                            short s6 = sArr7[i47];
                            short s9 = sArr7[i47 + i21];
                            int i48 = this.q * i19;
                            int i49 = this.p;
                            int i50 = i49 * i41;
                            int i51 = (i49 + 1) * i41;
                            int i52 = i51 - i48;
                            int i53 = i51 - i50;
                            sArr6[i46] = (short) ((((i53 - i52) * s9) + (s6 * i52)) / i53);
                        }
                        this.q++;
                        this.m++;
                    }
                    this.p = i16;
                    if (i16 == i19) {
                        this.p = 0;
                        h5.a.i(i17 == i41);
                        this.q = 0;
                    }
                    i43++;
                }
                if (i15 == 0) {
                    return;
                }
                short[] sArr8 = this.n;
                System.arraycopy(sArr8, i15 * i21, sArr8, 0, (i14 - i15) * i21);
                this.o -= i15;
                return;
            }
        } else {
            a(this.j, 0, this.k);
            this.k = 0;
        }
        f12 = f16;
        f10 = 1.0f;
        if (f12 != f10) {
        }
    }
}
