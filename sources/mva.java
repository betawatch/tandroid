// default package

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;
import android.view.animation.AnimationUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mva {
    public static final int[] V = {-10504961, -13056257, -9445121, -5841665, -11544336, -7362817, -8468225, -3870977};
    public static final int[] W = {-15233051, -14054705, -14776080, -14575888, -15233051, -14975018, -13984526, -11554059};
    public static final int[] X = {-12739585, -13662465, -11554561, -13730817, -10831617, -12939275, -13994776, -10305281};
    public static int[] Y;
    public final float[] A;
    public final boolean[] B;
    public int C;
    public int D;
    public int E;
    public final float[] F;
    public final float[] G;
    public final int[] H = new int[72];
    public final int[] I = new int[72];
    public final short[] J;
    public int K;
    public final Paint L;
    public final Paint M;
    public boolean N;
    public long O;
    public float P;
    public int Q;
    public float R;
    public float S;
    public float T;
    public long U;
    public boolean a;
    public int[] b;
    public final short c;
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
    public final float[] o;
    public final byte[] p;
    public final byte[] q;
    public final byte[] r;
    public final boolean[] s;
    public boolean t;
    public int[] u;
    public float v;
    public final float[] w;
    public final float[] x;
    public final float[] y;
    public final float[] z;

    /* JADX WARN: Multi-variable type inference failed */
    public mva(int i) {
        Paint paint = new Paint(1);
        this.L = paint;
        Paint paint2 = new Paint(1);
        this.M = paint2;
        this.Q = 49734321;
        this.R = hl.L(16.0f);
        this.c = i;
        this.d = new float[i];
        this.e = new float[i];
        this.f = new float[i];
        this.g = new float[i];
        this.h = new float[i];
        this.i = new float[i];
        this.j = new float[i];
        this.k = new float[i];
        this.l = new float[i];
        this.m = new float[i];
        this.n = new float[i];
        this.o = new float[i];
        this.p = new byte[i];
        this.q = new byte[i];
        this.r = new byte[i];
        this.s = new boolean[i];
        this.J = new short[i];
        int i2 = i << 1;
        this.F = new float[i2];
        this.G = new float[i2];
        this.w = new float[i2];
        this.x = new float[i];
        this.y = new float[i];
        this.z = new float[i];
        this.A = new float[i];
        this.B = new boolean[i];
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStrokeCap(cap);
    }

    public static int[] l(int i, boolean z) {
        int i2 = i | (-16777216);
        int[] iArr = Y;
        if (iArr != null && iArr[8] == i2) {
            if ((iArr[9] != 0) == z) {
                return Arrays.copyOf(iArr, 8);
            }
        }
        float[] fArr = new float[8];
        if (z) {
            fArr[0] = 0.0f;
            fArr[1] = 0.1f;
            fArr[2] = 0.22f;
            fArr[3] = -0.06f;
            fArr[4] = 0.3f;
            fArr[5] = 0.14f;
            fArr[6] = -0.03f;
            fArr[7] = 0.4f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = -0.08f;
            fArr[2] = 0.1f;
            fArr[3] = -0.04f;
            fArr[4] = 0.18f;
            fArr[5] = -0.12f;
            fArr[6] = 0.05f;
            fArr[7] = 0.28f;
        }
        int[] iArr2 = new int[10];
        for (int i3 = 0; i3 < 8; i3++) {
            float f = fArr[i3];
            iArr2[i3] = f >= 0.0f ? vm2.f(f, i2, -1) : vm2.f(-f, i2, -16777216);
        }
        iArr2[8] = i2;
        iArr2[9] = z ? 1 : 0;
        Y = iArr2;
        return Arrays.copyOf(iArr2, 8);
    }

    public final void a() {
        for (int i = 0; i < this.c; i++) {
            this.i[i] = 0.0f;
        }
        this.E = 0;
        this.O = 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x035b  */
    /* JADX WARN: Type inference failed for: r3v131, types: [int] */
    /* JADX WARN: Type inference failed for: r3v151, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Canvas canvas, float f) {
        int i;
        long j;
        float min;
        int[] iArr;
        float[] fArr;
        short s;
        float[] fArr2;
        float[] fArr3;
        int i2;
        short[] sArr;
        int i3;
        float[] fArr4;
        float[] fArr5;
        int[] iArr2;
        float[] fArr6;
        Paint paint;
        Paint paint2;
        int[] iArr3;
        float f2;
        float f3;
        int i4;
        float[] fArr7;
        int[] iArr4;
        float B;
        float B2;
        boolean z;
        float sin;
        if (this.E <= 0) {
            this.O = 0L;
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        float f4 = 0.05f;
        float f5 = 0.1f;
        if (this.O == 0) {
            min = 0.016f;
            if (this.U != 0) {
                i = 0;
                j = uptimeMillis;
                min = qu6.w(AnimationUtils.currentAnimationTimeMillis() - this.U, 1000.0f, 0.1f, 0.016f);
            } else {
                i = 0;
                j = uptimeMillis;
            }
        } else {
            i = 0;
            j = uptimeMillis;
            min = Math.min(0.05f, (j - r8) / 1000.0f);
        }
        this.U = 0L;
        this.O = j;
        this.P += min;
        float f6 = hl.p;
        float pow = (float) Math.pow(0.35d, min);
        int i5 = i;
        while (true) {
            iArr = this.H;
            if (i5 >= 72) {
                break;
            }
            iArr[i5] = i;
            i5++;
        }
        this.K = i;
        this.C = i;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            fArr = this.i;
            s = this.c;
            fArr2 = this.G;
            float f7 = f4;
            fArr3 = this.w;
            float f8 = f5;
            i2 = 8;
            sArr = this.J;
            i3 = 3;
            fArr4 = this.e;
            fArr5 = this.d;
            if (i6 >= s) {
                break;
            }
            if (fArr[i6] <= 0.0f) {
                sArr[i6] = -1;
            } else {
                float[] fArr8 = this.h;
                float f9 = fArr8[i6] + min;
                fArr8[i6] = f9;
                float f10 = fArr[i6];
                if (f9 >= f10) {
                    fArr[i6] = 0.0f;
                    sArr[i6] = -1;
                } else {
                    i7++;
                    if (f9 < 0.0f) {
                        sArr[i6] = -1;
                    } else {
                        float f11 = f9 / f10;
                        float f12 = this.j[i6];
                        f2 = f6;
                        byte b = this.p[i6];
                        byte[] bArr = this.r;
                        byte b2 = bArr[i6];
                        f3 = pow;
                        float[] fArr9 = this.m;
                        float[] fArr10 = this.o;
                        float[] fArr11 = this.l;
                        float[] fArr12 = this.f;
                        float[] fArr13 = this.n;
                        float[] fArr14 = this.g;
                        if (b2 == 2) {
                            boolean z2 = this.B[i6];
                            float[] fArr15 = this.y;
                            float[] fArr16 = this.x;
                            if (z2) {
                                float A = qd4.A(f11, 1.0f, 0.8f * f11 * f11, f11);
                                float f13 = 1.0f - A;
                                float f14 = f13 * f13 * f13;
                                float f15 = f13 * 3.0f;
                                float f16 = f15 * f13 * A;
                                float f17 = f15 * A * A;
                                float f18 = A * A * A;
                                i4 = i6;
                                fArr7 = fArr4;
                                iArr4 = iArr;
                                fArr5[i4] = uh9.v(fArr11[i4], this.S, f18, (fArr12[i4] * f17) + (this.z[i4] * f16) + (fArr13[i6] * f14));
                                fArr7[i4] = uh9.v(fArr9[i4], this.T, f18, (f17 * fArr14[i4]) + (f16 * this.A[i4]) + (f14 * fArr10[i4]));
                                if (fArr16[i4] != 0.0f || fArr15[i4] != 0.0f) {
                                    float z3 = qd4.z(1.0f, (float) Math.exp((-fArr8[i4]) / 0.045f), f13, f13);
                                    fArr5[i4] = (fArr16[i4] * z3) + fArr5[i4];
                                    fArr7[i4] = (fArr15[i4] * z3) + fArr7[i4];
                                }
                                if (A > 0.6f) {
                                    b = Math.max(0, b - 1);
                                }
                                if (A > 0.85f) {
                                    b = 0;
                                }
                                B2 = Math.min(1.0f, f11 / f7) * (A > 0.9f ? f13 / f8 : 1.0f);
                            } else {
                                i4 = i6;
                                fArr7 = fArr4;
                                iArr4 = iArr;
                                float pow2 = (float) Math.pow(f11, 2.1d);
                                float f19 = 1.0f - pow2;
                                float f20 = f19 * f19;
                                float f21 = f19 * 2.0f * pow2;
                                float f22 = pow2 * pow2;
                                fArr5[i4] = uh9.v(fArr11[i4], this.S, f22, (fArr12[i4] * f21) + (fArr13[i4] * f20));
                                fArr7[i4] = uh9.v(fArr9[i4], this.T, f22, (f21 * fArr14[i4]) + (fArr10[i4] * f20));
                                if (fArr16[i4] != 0.0f || fArr15[i4] != 0.0f) {
                                    float z4 = qd4.z(1.0f, (float) Math.exp((-fArr8[i4]) / 0.045f), f19, f19);
                                    fArr5[i4] = (fArr16[i4] * z4) + fArr5[i4];
                                    fArr7[i4] = (fArr15[i4] * z4) + fArr7[i4];
                                }
                                if (pow2 > 0.55f) {
                                    b = Math.max(0, b - 1);
                                }
                                if (pow2 > 0.8f) {
                                    b = 0;
                                }
                                z = pow2 > 0.72f && !this.t;
                                B = (pow2 > 0.9f ? f19 / f8 : 1.0f) * Math.min(1.0f, f11 / 0.07f);
                                sin = ((((float) Math.sin((fArr8[i4] * 11.0f) + (2.0f * f12))) * 0.22f) + 0.78f) * B * f;
                                if (sin < 0.03f) {
                                    sArr[i4] = -1;
                                } else {
                                    boolean z5 = this.s[i4];
                                    float[] fArr17 = this.k;
                                    int i8 = (((b << 3) + (z5 ? (int) fArr17[i4] : ((int) ((this.P * 5.0f) + fArr17[i4])) % 8)) * 3) + (sin > 0.66f ? 2 : sin > 0.33f ? 1 : 0);
                                    sArr[i4] = (short) i8;
                                    iArr4[i8] = iArr4[i8] + 1;
                                    if (!this.a) {
                                        boolean z6 = this.t;
                                        byte[] bArr2 = this.q;
                                        if (!z6 || bArr[i4] != 2) {
                                            if (!z || sin <= 0.3f) {
                                                if (bArr2[i4] != 0) {
                                                    if (((float) Math.sin((fArr8[i4] * 24.0f) + (f12 * 3.0f))) > 0.35f) {
                                                        if (sin <= 0.3f) {
                                                        }
                                                    }
                                                }
                                            }
                                            int i9 = this.K;
                                            int i10 = i9 + 1;
                                            this.K = i10;
                                            fArr2[i9] = fArr5[i4];
                                            this.K = i9 + 2;
                                            fArr2[i10] = fArr7[i4];
                                        } else if (bArr2[i4] != 0 && sin > 0.2f) {
                                            if (((float) Math.sin((fArr8[i4] * 13.0f) + (f12 * 3.0f))) > -0.1f) {
                                                int i11 = this.C;
                                                int i12 = i11 + 1;
                                                this.C = i12;
                                                fArr3[i11] = fArr5[i4];
                                                this.C = i11 + 2;
                                                fArr3[i12] = fArr7[i4];
                                            }
                                        }
                                    }
                                }
                                i6 = i4 + 1;
                                f4 = f7;
                                f5 = f8;
                                f6 = f2;
                                pow = f3;
                                iArr = iArr4;
                            }
                        } else {
                            i4 = i6;
                            fArr7 = fArr4;
                            iArr4 = iArr;
                            if (b2 != 0) {
                                float f23 = 1.0f - f11;
                                float v = bp1.v(f23, f23, f23, 1.0f);
                                float f24 = f23 * 2.2f * f2;
                                float f25 = fArr13[i4];
                                fArr5[i4] = (((float) Math.sin((f9 * 17.0f) + f12)) * f24) + qd4.A(fArr11[i4], f25, v, f25);
                                float f26 = fArr10[i4];
                                fArr7[i4] = (f24 * ((float) Math.cos((fArr8[i4] * 15.0f) + (1.3f * f12)))) + qd4.A(fArr9[i4], f26, v, f26);
                                B2 = xnb.B(f11, f11, 1.0f, Math.min(1.0f, f11 / 0.15f));
                            } else {
                                fArr12[i4] = fArr12[i4] * f3;
                                fArr14[i4] = (fArr14[i4] * f3) - (this.R * min);
                                fArr5[i4] = bp1.g(9.0f * f2, (float) Math.sin((fArr8[i4] * 6.5f) + f12), fArr12[i4], min, fArr5[i4]);
                                fArr7[i4] = bp1.g(7.0f * f2, (float) Math.cos((fArr8[i4] * 5.5f) + (1.7f * f12)), fArr14[i4], min, fArr7[i4]);
                                B = xnb.B(f11, 0.35f, 1.0f, (1.0f - f11) * Math.min(1.0f, f11 / 0.07f));
                                z = false;
                                sin = ((((float) Math.sin((fArr8[i4] * 11.0f) + (2.0f * f12))) * 0.22f) + 0.78f) * B * f;
                                if (sin < 0.03f) {
                                }
                                i6 = i4 + 1;
                                f4 = f7;
                                f5 = f8;
                                f6 = f2;
                                pow = f3;
                                iArr = iArr4;
                            }
                        }
                        B = B2;
                        z = false;
                        sin = ((((float) Math.sin((fArr8[i4] * 11.0f) + (2.0f * f12))) * 0.22f) + 0.78f) * B * f;
                        if (sin < 0.03f) {
                        }
                        i6 = i4 + 1;
                        f4 = f7;
                        f5 = f8;
                        f6 = f2;
                        pow = f3;
                        iArr = iArr4;
                    }
                }
            }
            f2 = f6;
            f3 = pow;
            i4 = i6;
            iArr4 = iArr;
            i6 = i4 + 1;
            f4 = f7;
            f5 = f8;
            f6 = f2;
            pow = f3;
            iArr = iArr4;
        }
        float f27 = f6;
        int[] iArr5 = iArr;
        int i13 = 1;
        this.E = i7;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            iArr2 = this.I;
            if (i14 >= 72) {
                break;
            }
            iArr2[i14] = i15;
            i15 += iArr5[i14] << 1;
            iArr5[i14] = 0;
            i14++;
        }
        int i16 = 0;
        while (true) {
            fArr6 = this.F;
            if (i16 >= s) {
                break;
            }
            short s2 = sArr[i16];
            if (s2 >= 0 && fArr[i16] > 0.0f) {
                int i17 = iArr2[s2];
                int i18 = iArr5[s2];
                int i19 = i17 + (i18 << 1);
                fArr6[i19] = fArr5[i16];
                fArr6[i19 + 1] = fArr4[i16];
                iArr5[s2] = i18 + 1;
            }
            i16++;
        }
        int[] iArr6 = this.b;
        if (iArr6 == null) {
            if (this.a) {
                iArr6 = X;
            } else {
                iArr6 = this.u;
                if (iArr6 == null) {
                    iArr6 = this.N ? V : W;
                }
            }
        }
        int i20 = 0;
        while (true) {
            paint = this.L;
            paint2 = this.M;
            if (i20 >= i3) {
                break;
            }
            float max = Math.max(1.0f, (i20 == 0 ? 0.6f : i20 == i13 ? 1.0f : 1.5f) * f27);
            int i21 = 0;
            for (int i22 = i2; i21 < i22; i22 = 8) {
                int i23 = 0;
                while (i23 < 3) {
                    int i24 = (((i20 << 3) + i21) * 3) + i23;
                    int i25 = iArr5[i24];
                    if (i25 == 0) {
                        iArr3 = iArr6;
                    } else {
                        float f28 = ((i23 * 0.35f) + 0.3f) * 1.0f;
                        if (this.N && i20 == 2 && !this.a) {
                            paint2.setColor(iArr6[i21]);
                            paint2.setAlpha((int) (f28 * 255.0f * 0.14f));
                            paint2.setStrokeWidth(2.6f * max);
                            iArr3 = iArr6;
                            canvas.drawPoints(fArr6, iArr2[i24], i25 << 1, paint2);
                        } else {
                            iArr3 = iArr6;
                        }
                        paint.setColor(iArr3[i21]);
                        paint.setAlpha((int) (Math.min(1.0f, f28 * (this.N ? 1.0f : 1.15f)) * 255.0f));
                        paint.setStrokeWidth(max);
                        canvas.drawPoints(fArr6, iArr2[i24], i25 << 1, paint);
                    }
                    i23++;
                    iArr6 = iArr3;
                }
                i21++;
            }
            i20++;
            i2 = 8;
            i3 = 3;
            i13 = 1;
        }
        int[] iArr7 = iArr6;
        int i26 = this.K;
        int i27 = jn7.d4;
        if (i26 > 0) {
            int[] iArr8 = this.b;
            paint2.setColor(iArr8 != null ? iArr8[7] : this.N ? -7347457 : -10700555);
            paint2.setAlpha(this.N ? 90 : 100);
            paint2.setStrokeWidth(f27 * (this.N ? 2.4f : 2.0f));
            canvas.drawPoints(fArr2, 0, this.K, paint2);
            paint.setColor(-1);
            paint.setAlpha(jn7.d4);
            paint.setStrokeWidth(Math.max(1.0f, f27 * 0.9f));
            canvas.drawPoints(fArr2, 0, this.K, paint);
        }
        if (this.C <= 0) {
            return true;
        }
        paint2.setColor(iArr7[7]);
        paint2.setAlpha(this.N ? 80 : 90);
        paint2.setStrokeWidth(1.9f * f27);
        canvas.drawPoints(fArr3, 0, this.C, paint2);
        paint.setColor(-1);
        if (this.N) {
            i27 = 235;
        }
        paint.setAlpha(i27);
        paint.setStrokeWidth(Math.max(1.0f, 0.75f * f27));
        canvas.drawPoints(fArr3, 0, this.C, paint);
        return true;
    }

    public final void c(float f, float f2, int i) {
        this.i[i] = Math.max(0.05f, f);
        this.h[i] = -f2;
        this.j[i] = d() * 6.2832f;
        this.k[i] = d() * 8.0f;
        this.s[i] = false;
        float d = d();
        this.p[i] = (byte) (d < 0.5f ? 0 : d < 0.86f ? 1 : 2);
        this.q[i] = (byte) (d() < 0.07f ? 1 : 0);
    }

    public final float d() {
        int i = this.Q;
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        this.Q = i3 ^ (i3 << 5);
        return (r0 >>> 8) / 1.6777216E7f;
    }

    public final void e(boolean z) {
        this.a = z;
        this.N = z;
        if (Build.VERSION.SDK_INT >= 29) {
            this.M.setBlendMode(z ? BlendMode.PLUS : BlendMode.SRC_OVER);
        }
    }

    public final void f(float f) {
        int i = this.D;
        short s = this.c;
        int i2 = ((i + s) - 1) % s;
        this.B[i2] = true;
        float f2 = this.n[i2];
        float[] fArr = this.i;
        this.z[i2] = qu6.d(f, fArr[i2], 3.0f, f2);
        this.A[i2] = qu6.d(0.0f, fArr[i2], 3.0f, this.o[i2]);
    }

    public final int g() {
        int i = this.D;
        this.D = (i + 1) % this.c;
        if (this.i[i] <= 0.0f) {
            this.E++;
        }
        return i;
    }

    public final void h(float f, float f2, float f3, float f4, float f5, float f6) {
        int g = g();
        this.d[g] = f;
        this.e[g] = f2;
        this.f[g] = f3;
        this.g[g] = f4;
        this.r[g] = 0;
        c(f5, f6, g);
    }

    public final void i(float f, float f2, float f3, float f4, float f5) {
        int g = g();
        this.d[g] = f;
        this.n[g] = f;
        this.o[g] = f2;
        this.e[g] = f2;
        this.l[g] = f3;
        this.m[g] = f4;
        this.g[g] = 0.0f;
        this.f[g] = 0.0f;
        this.r[g] = 1;
        c(f5, 0.0f, g);
    }

    public final void j(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        int g = g();
        this.d[g] = f;
        this.n[g] = f;
        this.e[g] = f2;
        this.o[g] = f2;
        this.l[g] = f5;
        this.m[g] = f6;
        this.f[g] = f3;
        this.g[g] = f4;
        this.r[g] = 2;
        c(f7, f8, g);
        this.y[g] = 0.0f;
        this.x[g] = 0.0f;
        this.B[g] = false;
        if (this.t) {
            byte b = (byte) (d() < this.v ? 1 : 0);
            this.q[g] = b;
            if (b != 0) {
                this.p[g] = 0;
            }
        }
    }

    public final void k(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        j(f, f2, f3, f4, f5, f6, f7, f8);
        int i2 = this.D;
        short s = this.c;
        int i3 = ((i2 + s) - 1) % s;
        this.k[i3] = Math.max(0, Math.min(7, i));
        this.s[i3] = true;
    }
}
