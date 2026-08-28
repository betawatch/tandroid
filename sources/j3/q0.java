package j3;

import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q0 {
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

    public q0(int i9, float f10, int i10, float f11, int i11) {
        this.a = i9;
        this.b = i10;
        this.c = f10;
        this.d = f11;
        this.e = i9 / i11;
        this.f = i9 / 400;
        int i12 = i9 / 65;
        this.g = i12;
        int i13 = i12 * 2;
        this.h = i13;
        this.i = new short[i13];
        this.j = new short[i13 * i10];
        this.l = new short[i13 * i10];
        this.n = new short[i13 * i10];
    }

    public static void e(int i9, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i9; i18++) {
                sArr[i15] = (short) (((sArr3[i16] * i18) + ((i9 - i18) * sArr2[i17])) / i9);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    public final void a(short[] sArr, int i9, int i10) {
        short[] c10 = c(this.l, this.m, i10);
        this.l = c10;
        int i11 = this.b;
        System.arraycopy(sArr, i9 * i11, c10, this.m * i11, i11 * i10);
        this.m += i10;
    }

    public final void b(short[] sArr, int i9, int i10) {
        int i11 = this.h / i10;
        int i12 = this.b;
        int i13 = i10 * i12;
        int i14 = i9 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            this.i[i15] = (short) (i16 / i13);
        }
    }

    public final short[] c(short[] sArr, int i9, int i10) {
        int length = sArr.length;
        int i11 = this.b;
        int i12 = length / i11;
        return i9 + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int d(short[] sArr, int i9, int i10, int i11) {
        int i12 = i9 * this.b;
        int i13 = 255;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int i17 = 0;
            for (int i18 = 0; i18 < i10; i18++) {
                i17 += Math.abs(sArr[i12 + i18] - sArr[(i12 + i10) + i18]);
            }
            if (i17 * i15 < i14 * i10) {
                i15 = i10;
                i14 = i17;
            }
            if (i17 * i13 > i16 * i10) {
                i13 = i10;
                i16 = i17;
            }
            i10++;
        }
        this.u = i14 / i15;
        this.v = i16 / i13;
        return i15;
    }

    public final void f() {
        float f10;
        float f11;
        float f12;
        double d;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.m;
        float f13 = this.c;
        float f14 = this.d;
        float f15 = f13 / f14;
        float f16 = this.e * f14;
        double d9 = f15;
        int i18 = this.a;
        int i19 = 1;
        int i20 = this.b;
        if (d9 > 1.00001d || d9 < 0.99999d) {
            int i21 = this.k;
            int i22 = this.h;
            if (i21 >= i22) {
                int i23 = 0;
                while (true) {
                    int i24 = this.r;
                    if (i24 > 0) {
                        int min = Math.min(i22, i24);
                        a(this.j, i23, min);
                        this.r -= min;
                        i23 += min;
                        f11 = f15;
                        f12 = f16;
                        d = d9;
                        f10 = 1.0f;
                    } else {
                        short[] sArr = this.j;
                        int i25 = i18 > 4000 ? i18 / 4000 : 1;
                        f10 = 1.0f;
                        int i26 = this.g;
                        int i27 = this.f;
                        if (i20 == i19 && i25 == i19) {
                            i9 = d(sArr, i23, i27, i26);
                            f11 = f15;
                            f12 = f16;
                            d = d9;
                        } else {
                            b(sArr, i23, i25);
                            f11 = f15;
                            f12 = f16;
                            short[] sArr2 = this.i;
                            d = d9;
                            int d10 = d(sArr2, 0, i27 / i25, i26 / i25);
                            if (i25 != 1) {
                                int i28 = d10 * i25;
                                int i29 = i25 * 4;
                                int i30 = i28 - i29;
                                int i31 = i28 + i29;
                                if (i30 >= i27) {
                                    i27 = i30;
                                }
                                if (i31 <= i26) {
                                    i26 = i31;
                                }
                                if (i20 == 1) {
                                    i9 = d(sArr, i23, i27, i26);
                                } else {
                                    b(sArr, i23, 1);
                                    i9 = d(sArr2, 0, i27, i26);
                                }
                            } else {
                                i9 = d10;
                            }
                        }
                        int i32 = this.u;
                        int i33 = this.v;
                        if (i32 == 0 || (i10 = this.s) == 0 || i33 > i32 * 3 || i32 * 2 <= this.t * 3) {
                            i10 = i9;
                        }
                        this.t = i32;
                        this.s = i9;
                        if (d > 1.0d) {
                            short[] sArr3 = this.j;
                            if (f11 >= 2.0f) {
                                i12 = (int) (i10 / (f11 - 1.0f));
                            } else {
                                this.r = (int) (((2.0f - f11) * i10) / (f11 - 1.0f));
                                i12 = i10;
                            }
                            short[] c10 = c(this.l, this.m, i12);
                            this.l = c10;
                            int i34 = i23 + i10;
                            int i35 = i23;
                            int i36 = i12;
                            e(i36, this.b, c10, this.m, sArr3, i35, sArr3, i34);
                            this.m += i36;
                            i23 = i10 + i36 + i35;
                        } else {
                            int i37 = i23;
                            short[] sArr4 = this.j;
                            if (f11 < 0.5f) {
                                i11 = (int) ((i10 * f11) / (1.0f - f11));
                            } else {
                                this.r = (int) ((((2.0f * f11) - 1.0f) * i10) / (1.0f - f11));
                                i11 = i10;
                            }
                            int i38 = i10 + i11;
                            short[] c11 = c(this.l, this.m, i38);
                            this.l = c11;
                            System.arraycopy(sArr4, i37 * i20, c11, this.m * i20, i10 * i20);
                            e(i11, this.b, this.l, this.m + i10, sArr4, i37 + i10, sArr4, i37);
                            this.m += i38;
                            i23 = i37 + i11;
                        }
                    }
                    if (i23 + i22 > i21) {
                        break;
                    }
                    f15 = f11;
                    f16 = f12;
                    d9 = d;
                    i19 = 1;
                }
                int i39 = this.k - i23;
                short[] sArr5 = this.j;
                System.arraycopy(sArr5, i23 * i20, sArr5, 0, i39 * i20);
                this.k = i39;
                if (f12 != f10 || this.m == i17) {
                }
                int i40 = (int) (i18 / f12);
                while (true) {
                    if (i40 <= 16384 && i18 <= 16384) {
                        break;
                    }
                    i40 /= 2;
                    i18 /= 2;
                }
                int i41 = this.m - i17;
                short[] c12 = c(this.n, this.o, i41);
                this.n = c12;
                System.arraycopy(this.l, i17 * i20, c12, this.o * i20, i41 * i20);
                this.m = i17;
                this.o += i41;
                int i42 = 0;
                while (true) {
                    i13 = this.o;
                    i14 = i13 - 1;
                    if (i42 >= i14) {
                        break;
                    }
                    while (true) {
                        i15 = this.p + 1;
                        int i43 = i15 * i40;
                        i16 = this.q;
                        if (i43 <= i16 * i18) {
                            break;
                        }
                        this.l = c(this.l, this.m, 1);
                        for (int i44 = 0; i44 < i20; i44++) {
                            short[] sArr6 = this.l;
                            int i45 = (this.m * i20) + i44;
                            short[] sArr7 = this.n;
                            int i46 = (i42 * i20) + i44;
                            short s10 = sArr7[i46];
                            short s11 = sArr7[i46 + i20];
                            int i47 = this.q * i18;
                            int i48 = this.p;
                            int i49 = i48 * i40;
                            int i50 = (i48 + 1) * i40;
                            int i51 = i50 - i47;
                            int i52 = i50 - i49;
                            sArr6[i45] = (short) ((((i52 - i51) * s11) + (s10 * i51)) / i52);
                        }
                        this.q++;
                        this.m++;
                    }
                    this.p = i15;
                    if (i15 == i18) {
                        this.p = 0;
                        d5.a.i(i16 == i40);
                        this.q = 0;
                    }
                    i42++;
                }
                if (i14 == 0) {
                    return;
                }
                short[] sArr8 = this.n;
                System.arraycopy(sArr8, i14 * i20, sArr8, 0, (i13 - i14) * i20);
                this.o -= i14;
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
