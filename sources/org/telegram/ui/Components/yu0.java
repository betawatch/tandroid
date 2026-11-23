package org.telegram.ui.Components;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class yu0 {
    public static final int[] T = {-10504961, -13056257, -9445121, -5841665, -11544336, -7362817, -8468225, -3870977};
    public static final int[] U = {-15233051, -14054705, -14776080, -14575888, -15233051, -14975018, -13984526, -11554059};
    public final boolean[] A;
    public int B;
    public int C;
    public int D;
    public final float[] E;
    public final float[] F;
    public final int[] G = new int[72];
    public final int[] H = new int[72];
    public final short[] I;
    public int J;
    public final Paint K;
    public final Paint L;
    public boolean M;
    public long N;
    public float O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public int[] a;
    public final int b;
    public final float[] c;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public final float[] g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public final float[] l;
    public final float[] m;
    public final float[] n;
    public final byte[] o;
    public final byte[] p;
    public final byte[] q;
    public final boolean[] r;
    public boolean s;
    public int[] t;
    public float u;
    public final float[] v;
    public final float[] w;
    public final float[] x;
    public final float[] y;
    public final float[] z;

    public yu0(int i7) {
        Paint paint = new Paint(1);
        this.K = paint;
        Paint paint2 = new Paint(1);
        this.L = paint2;
        this.P = 49734321;
        this.Q = org.telegram.messenger.g0.L(16.0f);
        this.b = i7;
        this.c = new float[i7];
        this.d = new float[i7];
        this.e = new float[i7];
        this.f = new float[i7];
        this.g = new float[i7];
        this.h = new float[i7];
        this.i = new float[i7];
        this.j = new float[i7];
        this.k = new float[i7];
        this.l = new float[i7];
        this.m = new float[i7];
        this.n = new float[i7];
        this.o = new byte[i7];
        this.p = new byte[i7];
        this.q = new byte[i7];
        this.r = new boolean[i7];
        this.I = new short[i7];
        int i10 = i7 * 2;
        this.E = new float[i10];
        this.F = new float[i10];
        this.v = new float[i10];
        this.w = new float[i7];
        this.x = new float[i7];
        this.y = new float[i7];
        this.z = new float[i7];
        this.A = new boolean[i7];
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStrokeCap(cap);
    }

    public final void a() {
        for (int i7 = 0; i7 < this.b; i7++) {
            this.h[i7] = 0.0f;
        }
        this.D = 0;
        this.N = 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x033b  */
    /* JADX WARN: Type inference failed for: r4v115, types: [int] */
    /* JADX WARN: Type inference failed for: r4v64, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Canvas canvas, float f10) {
        int[] iArr;
        float[] fArr;
        int i7;
        float[] fArr2;
        float[] fArr3;
        float f11;
        int i10;
        int i11;
        short[] sArr;
        float[] fArr4;
        float[] fArr5;
        int i12;
        int[] iArr2;
        float[] fArr6;
        Paint paint;
        Paint paint2;
        int[] iArr3;
        float f12;
        int[] iArr4;
        float f13;
        float f14;
        int i13;
        float[] fArr7;
        float C;
        boolean z10;
        float sin;
        if (this.D <= 0) {
            this.N = 0L;
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        float f15 = 0.05f;
        float min = this.N == 0 ? 0.016f : Math.min(0.05f, (uptimeMillis - r8) / 1000.0f);
        this.N = uptimeMillis;
        this.O += min;
        float f16 = org.telegram.messenger.g0.p;
        float pow = (float) Math.pow(0.35d, min);
        int i14 = 0;
        while (true) {
            iArr = this.G;
            if (i14 >= 72) {
                break;
            }
            iArr[i14] = 0;
            i14++;
        }
        this.J = 0;
        this.B = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            fArr = this.h;
            i7 = this.b;
            fArr2 = this.F;
            float f17 = f15;
            fArr3 = this.v;
            f11 = 0.3f;
            i10 = 3;
            i11 = 8;
            sArr = this.I;
            fArr4 = this.d;
            fArr5 = this.c;
            i12 = 1;
            if (i15 >= i7) {
                break;
            }
            if (fArr[i15] <= 0.0f) {
                sArr[i15] = -1;
            } else {
                float[] fArr8 = this.g;
                float f18 = fArr8[i15] + min;
                fArr8[i15] = f18;
                float f19 = fArr[i15];
                if (f18 >= f19) {
                    fArr[i15] = 0.0f;
                    sArr[i15] = -1;
                } else {
                    i16++;
                    if (f18 < 0.0f) {
                        sArr[i15] = -1;
                    } else {
                        float f20 = f18 / f19;
                        float f21 = this.i[i15];
                        f13 = f16;
                        byte b10 = this.o[i15];
                        byte[] bArr = this.q;
                        byte b11 = bArr[i15];
                        float[] fArr9 = this.l;
                        float[] fArr10 = this.n;
                        float[] fArr11 = this.k;
                        float[] fArr12 = this.e;
                        float[] fArr13 = this.m;
                        float[] fArr14 = this.x;
                        float[] fArr15 = this.w;
                        float[] fArr16 = this.f;
                        if (b11 == 2 && this.A[i15]) {
                            float z11 = com.google.android.gms.internal.vision.e2.z(f20, 1.0f, 0.8f * f20 * f20, f20);
                            float f22 = 1.0f - z11;
                            float f23 = f22 * f22 * f22;
                            float f24 = f22 * 3.0f;
                            float f25 = f24 * f22 * z11;
                            float f26 = f24 * z11 * z11;
                            float f27 = z11 * z11 * z11;
                            f14 = pow;
                            i13 = i15;
                            fArr7 = fArr4;
                            fArr5[i13] = org.telegram.messenger.o10.b(fArr11[i13], this.R, f27, (fArr12[i15] * f26) + (this.y[i15] * f25) + (fArr13[i15] * f23));
                            fArr7[i13] = org.telegram.messenger.o10.b(fArr9[i13], this.S, f27, (f26 * fArr16[i13]) + (f25 * this.z[i13]) + (f23 * fArr10[i13]));
                            if (fArr15[i13] != 0.0f || fArr14[i13] != 0.0f) {
                                float A = org.telegram.messenger.f3.A(1.0f, (float) Math.exp((-fArr8[i13]) / 0.045f), f22, f22);
                                fArr5[i13] = (fArr15[i13] * A) + fArr5[i13];
                                fArr7[i13] = (fArr14[i13] * A) + fArr7[i13];
                            }
                            if (z11 > 0.6f) {
                                b10 = Math.max(0, b10 - 1);
                            }
                            if (z11 > 0.85f) {
                                b10 = 0;
                            }
                            C = Math.min(1.0f, f20 / f17) * (z11 > 0.9f ? f22 / 0.1f : 1.0f);
                        } else {
                            f14 = pow;
                            i13 = i15;
                            fArr7 = fArr4;
                            if (b11 == 2) {
                                float pow2 = (float) Math.pow(f20, 2.1d);
                                float f28 = 1.0f - pow2;
                                float f29 = f28 * f28;
                                float f30 = f28 * 2.0f * pow2;
                                float f31 = pow2 * pow2;
                                fArr5[i13] = org.telegram.messenger.o10.b(fArr11[i13], this.R, f31, (fArr12[i13] * f30) + (fArr13[i13] * f29));
                                fArr7[i13] = org.telegram.messenger.o10.b(fArr9[i13], this.S, f31, (f30 * fArr16[i13]) + (f29 * fArr10[i13]));
                                if (fArr15[i13] != 0.0f || fArr14[i13] != 0.0f) {
                                    float A2 = org.telegram.messenger.f3.A(1.0f, (float) Math.exp((-fArr8[i13]) / 0.045f), f28, f28);
                                    fArr5[i13] = (fArr15[i13] * A2) + fArr5[i13];
                                    fArr7[i13] = (fArr14[i13] * A2) + fArr7[i13];
                                }
                                if (pow2 > 0.55f) {
                                    b10 = Math.max(0, b10 - 1);
                                }
                                if (pow2 > 0.8f) {
                                    b10 = 0;
                                }
                                boolean z12 = pow2 > 0.72f && !this.s;
                                float min2 = (pow2 > 0.9f ? f28 / 0.1f : 1.0f) * Math.min(1.0f, f20 / 0.07f);
                                z10 = z12;
                                C = min2;
                                sin = ((((float) Math.sin((fArr8[i13] * 11.0f) + (f21 * 2.0f))) * 0.22f) + 0.78f) * C * f10;
                                if (sin >= 0.03f) {
                                    sArr[i13] = -1;
                                } else {
                                    boolean z13 = this.r[i13];
                                    float[] fArr17 = this.j;
                                    int i17 = (((b10 * 8) + (z13 ? (int) fArr17[i13] : ((int) ((this.O * 5.0f) + fArr17[i13])) % 8)) * 3) + (sin > 0.66f ? 2 : sin > 0.33f ? 1 : 0);
                                    sArr[i13] = (short) i17;
                                    iArr[i17] = iArr[i17] + 1;
                                    if (!this.s || bArr[i13] != 2) {
                                        if (!z10 || sin <= 0.3f) {
                                            if (this.p[i13] != 0) {
                                                if (((float) Math.sin((fArr8[i13] * 24.0f) + (f21 * 3.0f))) > 0.35f) {
                                                    if (sin <= 0.3f) {
                                                    }
                                                }
                                            }
                                        }
                                        int i18 = this.J;
                                        int i19 = i18 + 1;
                                        this.J = i19;
                                        fArr2[i18] = fArr5[i13];
                                        this.J = i18 + 2;
                                        fArr2[i19] = fArr7[i13];
                                    } else if (this.p[i13] != 0 && sin > 0.2f) {
                                        if (((float) Math.sin((fArr8[i13] * 13.0f) + (f21 * 3.0f))) > -0.1f) {
                                            int i20 = this.B;
                                            int i21 = i20 + 1;
                                            this.B = i21;
                                            fArr3[i20] = fArr5[i13];
                                            this.B = i20 + 2;
                                            fArr3[i21] = fArr7[i13];
                                        }
                                    }
                                }
                                i15 = i13 + 1;
                                f15 = f17;
                                f16 = f13;
                                pow = f14;
                            } else if (b11 != 0) {
                                float f32 = 1.0f - f20;
                                float z14 = org.telegram.ui.Cells.c0.z(f32, f32, f32, 1.0f);
                                float f33 = f32 * 2.2f * f13;
                                float f34 = fArr13[i13];
                                fArr5[i13] = (((float) Math.sin((f18 * 17.0f) + f21)) * f33) + com.google.android.gms.internal.vision.e2.z(fArr11[i13], f34, z14, f34);
                                float f35 = fArr10[i13];
                                fArr7[i13] = (f33 * ((float) Math.cos((fArr8[i13] * 15.0f) + (1.3f * f21)))) + com.google.android.gms.internal.vision.e2.z(fArr9[i13], f35, z14, f35);
                                C = com.google.android.gms.internal.vision.e2.C(f20, f20, 1.0f, Math.min(1.0f, f20 / 0.15f));
                            } else {
                                fArr12[i13] = fArr12[i13] * f14;
                                fArr16[i13] = (fArr16[i13] * f14) - (this.Q * min);
                                fArr5[i13] = org.telegram.ui.Cells.c0.g(9.0f * f13, (float) Math.sin((fArr8[i13] * 6.5f) + f21), fArr12[i13], min, fArr5[i13]);
                                fArr7[i13] = org.telegram.ui.Cells.c0.g(7.0f * f13, (float) Math.cos((fArr8[i13] * 5.5f) + (1.7f * f21)), fArr16[i13], min, fArr7[i13]);
                                C = com.google.android.gms.internal.vision.e2.C(f20, 0.35f, 1.0f, (1.0f - f20) * Math.min(1.0f, f20 / 0.07f));
                            }
                        }
                        z10 = false;
                        sin = ((((float) Math.sin((fArr8[i13] * 11.0f) + (f21 * 2.0f))) * 0.22f) + 0.78f) * C * f10;
                        if (sin >= 0.03f) {
                        }
                        i15 = i13 + 1;
                        f15 = f17;
                        f16 = f13;
                        pow = f14;
                    }
                }
            }
            f13 = f16;
            f14 = pow;
            i13 = i15;
            i15 = i13 + 1;
            f15 = f17;
            f16 = f13;
            pow = f14;
        }
        float f36 = f16;
        this.D = i16;
        int i22 = 0;
        int i23 = 0;
        while (true) {
            iArr2 = this.H;
            if (i22 >= 72) {
                break;
            }
            iArr2[i22] = i23;
            i23 += iArr[i22] * 2;
            iArr[i22] = 0;
            i22++;
        }
        int i24 = 0;
        while (true) {
            fArr6 = this.E;
            if (i24 >= i7) {
                break;
            }
            short s5 = sArr[i24];
            if (s5 >= 0 && fArr[i24] > 0.0f) {
                int i25 = iArr2[s5];
                int i26 = iArr[s5];
                int i27 = (i26 * 2) + i25;
                fArr6[i27] = fArr5[i24];
                fArr6[i27 + 1] = fArr4[i24];
                iArr[s5] = i26 + 1;
            }
            i24++;
        }
        int[] iArr5 = this.a;
        if (iArr5 == null && (iArr5 = this.t) == null) {
            iArr5 = this.M ? T : U;
        }
        int i28 = 0;
        while (true) {
            paint = this.K;
            paint2 = this.L;
            if (i28 >= i10) {
                break;
            }
            float max = Math.max(1.0f, (i28 == 0 ? 0.6f : i28 == i12 ? 1.0f : 1.5f) * f36);
            int i29 = i11;
            int i30 = 0;
            while (i30 < i29) {
                int i31 = 0;
                while (i31 < 3) {
                    int i32 = (((i28 * 8) + i30) * 3) + i31;
                    int i33 = iArr[i32];
                    if (i33 == 0) {
                        iArr3 = iArr5;
                        f12 = f11;
                        iArr4 = iArr2;
                    } else {
                        iArr3 = iArr5;
                        f12 = f11;
                        iArr4 = iArr2;
                        float B = com.google.android.gms.internal.vision.e2.B(i31, 0.35f, f12, 1.0f);
                        if (this.M && i28 == 2) {
                            paint2.setColor(iArr3[i30]);
                            paint2.setAlpha((int) (255.0f * B * 0.14f));
                            paint2.setStrokeWidth(2.6f * max);
                            canvas.drawPoints(fArr6, iArr4[i32], i33 * 2, paint2);
                        }
                        paint.setColor(iArr3[i30]);
                        paint.setAlpha((int) (Math.min(1.0f, B * (this.M ? 1.0f : 1.15f)) * 255.0f));
                        paint.setStrokeWidth(max);
                        canvas.drawPoints(fArr6, iArr4[i32], i33 * 2, paint);
                    }
                    i31++;
                    iArr5 = iArr3;
                    iArr2 = iArr4;
                    f11 = f12;
                }
                i30++;
                i29 = 8;
                f11 = f11;
            }
            i28++;
            i10 = 3;
            i11 = 8;
            i12 = 1;
            f11 = f11;
        }
        int[] iArr6 = iArr5;
        if (this.J > 0) {
            int[] iArr7 = this.a;
            paint2.setColor(iArr7 != null ? iArr7[7] : this.M ? -7347457 : -10700555);
            paint2.setAlpha(this.M ? 90 : 100);
            paint2.setStrokeWidth(f36 * (this.M ? 2.4f : 2.0f));
            canvas.drawPoints(fArr2, 0, this.J, paint2);
            paint.setColor(-1);
            paint.setAlpha(org.telegram.messenger.ls.e4);
            paint.setStrokeWidth(Math.max(1.0f, f36 * 0.9f));
            canvas.drawPoints(fArr2, 0, this.J, paint);
        }
        if (this.B <= 0) {
            return true;
        }
        paint2.setColor(iArr6[7]);
        paint2.setAlpha(this.M ? 80 : 90);
        paint2.setStrokeWidth(f36 * 1.9f);
        canvas.drawPoints(fArr3, 0, this.B, paint2);
        paint.setColor(-1);
        paint.setAlpha(this.M ? org.telegram.messenger.ls.L3 : org.telegram.messenger.ls.e4);
        paint.setStrokeWidth(Math.max(1.0f, f36 * 0.75f));
        canvas.drawPoints(fArr3, 0, this.B, paint);
        return true;
    }

    public final void c(float f10, float f11, int i7) {
        this.h[i7] = Math.max(0.05f, f10);
        this.g[i7] = -f11;
        this.i[i7] = d() * 6.2832f;
        this.j[i7] = d() * 8.0f;
        this.r[i7] = false;
        float d = d();
        this.o[i7] = (byte) (d < 0.5f ? 0 : d < 0.86f ? 1 : 2);
        this.p[i7] = (byte) (d() < 0.07f ? 1 : 0);
    }

    public final float d() {
        int i7 = this.P;
        int i10 = i7 ^ (i7 << 13);
        int i11 = i10 ^ (i10 >>> 17);
        this.P = i11 ^ (i11 << 5);
        return (r0 >>> 8) / 1.6777216E7f;
    }

    public final void e(boolean z10) {
        this.M = z10;
        if (Build.VERSION.SDK_INT >= 29) {
            this.L.setBlendMode(z10 ? BlendMode.PLUS : BlendMode.SRC_OVER);
        }
    }

    public final int f() {
        int i7 = this.C;
        this.C = (i7 + 1) % this.b;
        if (this.h[i7] <= 0.0f) {
            this.D++;
        }
        return i7;
    }

    public final void g(float f10, float f11, float f12, float f13, float f14, float f15) {
        int f16 = f();
        this.c[f16] = f10;
        this.d[f16] = f11;
        this.e[f16] = f12;
        this.f[f16] = f13;
        this.q[f16] = 0;
        c(f14, f15, f16);
    }

    public final void h(float f10, float f11, float f12, float f13, float f14) {
        int f15 = f();
        this.c[f15] = f10;
        this.m[f15] = f10;
        this.n[f15] = f11;
        this.d[f15] = f11;
        this.k[f15] = f12;
        this.l[f15] = f13;
        this.f[f15] = 0.0f;
        this.e[f15] = 0.0f;
        this.q[f15] = 1;
        c(f14, 0.0f, f15);
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        int f18 = f();
        this.c[f18] = f10;
        this.m[f18] = f10;
        this.d[f18] = f11;
        this.n[f18] = f11;
        this.k[f18] = f14;
        this.l[f18] = f15;
        this.e[f18] = f12;
        this.f[f18] = f13;
        this.q[f18] = 2;
        c(f16, f17, f18);
        this.x[f18] = 0.0f;
        this.w[f18] = 0.0f;
        this.A[f18] = false;
        if (this.s) {
            byte b10 = (byte) (d() < this.u ? 1 : 0);
            this.p[f18] = b10;
            if (b10 != 0) {
                this.o[f18] = 0;
            }
        }
    }

    public final void j(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i7) {
        i(f10, f11, f12, f13, f14, f15, f16, f17);
        int i10 = this.C;
        int i11 = this.b;
        int i12 = ((i10 + i11) - 1) % i11;
        this.j[i12] = Math.max(0, Math.min(7, i7));
        this.r[i12] = true;
    }
}
