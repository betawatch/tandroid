// default package

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lta {
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
    public final short b;
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

    /* JADX WARN: Multi-variable type inference failed */
    public lta(int i) {
        Paint paint = new Paint(1);
        this.K = paint;
        Paint paint2 = new Paint(1);
        this.L = paint2;
        this.P = 49734321;
        this.Q = gm.L(16.0f);
        this.b = i;
        this.c = new float[i];
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
        this.o = new byte[i];
        this.p = new byte[i];
        this.q = new byte[i];
        this.r = new boolean[i];
        this.I = new short[i];
        int i2 = i << 1;
        this.E = new float[i2];
        this.F = new float[i2];
        this.v = new float[i2];
        this.w = new float[i];
        this.x = new float[i];
        this.y = new float[i];
        this.z = new float[i];
        this.A = new boolean[i];
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStrokeCap(cap);
    }

    public final void a() {
        for (int i = 0; i < this.b; i++) {
            this.h[i] = 0.0f;
        }
        this.D = 0;
        this.N = 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0340  */
    /* JADX WARN: Type inference failed for: r3v104, types: [int] */
    /* JADX WARN: Type inference failed for: r3v124, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Canvas canvas, float f) {
        int[] iArr;
        float[] fArr;
        short s;
        float[] fArr2;
        float[] fArr3;
        float f2;
        int i;
        int i2;
        short[] sArr;
        float[] fArr4;
        float[] fArr5;
        int i3;
        int[] iArr2;
        float[] fArr6;
        Paint paint;
        Paint paint2;
        int[] iArr3;
        float f3;
        int[] iArr4;
        float f4;
        float[] fArr7;
        float f5;
        int i4;
        float B;
        boolean z;
        float sin;
        if (this.D <= 0) {
            this.N = 0L;
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        float f6 = 0.05f;
        float min = this.N == 0 ? 0.016f : Math.min(0.05f, (uptimeMillis - r8) / 1000.0f);
        this.N = uptimeMillis;
        this.O += min;
        float f7 = gm.p;
        float pow = (float) Math.pow(0.35d, min);
        int i5 = 0;
        while (true) {
            iArr = this.G;
            if (i5 >= 72) {
                break;
            }
            iArr[i5] = 0;
            i5++;
        }
        this.J = 0;
        this.B = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            fArr = this.h;
            s = this.b;
            fArr2 = this.F;
            float f8 = f6;
            fArr3 = this.v;
            f2 = 0.3f;
            i = 8;
            i2 = 3;
            sArr = this.I;
            fArr4 = this.d;
            fArr5 = this.c;
            i3 = 1;
            if (i6 >= s) {
                break;
            }
            if (fArr[i6] <= 0.0f) {
                sArr[i6] = -1;
            } else {
                float[] fArr8 = this.g;
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
                        float f12 = this.i[i6];
                        byte b = this.o[i6];
                        byte[] bArr = this.q;
                        byte b2 = bArr[i6];
                        f4 = f7;
                        float[] fArr9 = this.l;
                        float[] fArr10 = this.n;
                        float[] fArr11 = this.k;
                        float[] fArr12 = this.e;
                        float[] fArr13 = this.m;
                        float[] fArr14 = this.f;
                        if (b2 == 2) {
                            boolean z2 = this.A[i6];
                            float[] fArr15 = this.x;
                            float[] fArr16 = this.w;
                            if (z2) {
                                float A = td4.A(f11, 1.0f, 0.8f * f11 * f11, f11);
                                float f13 = 1.0f - A;
                                float f14 = f13 * f13 * f13;
                                float f15 = f13 * 3.0f;
                                float f16 = f15 * f13 * A;
                                float f17 = f15 * A * A;
                                float f18 = A * A * A;
                                fArr7 = fArr5;
                                f5 = pow;
                                i4 = i6;
                                fArr7[i4] = hg9.u(fArr11[i6], this.R, f18, (fArr12[i6] * f17) + (this.y[i6] * f16) + (fArr13[i6] * f14));
                                fArr4[i4] = hg9.u(fArr9[i4], this.S, f18, (f17 * fArr14[i4]) + (f16 * this.z[i4]) + (f14 * fArr10[i4]));
                                if (fArr16[i4] != 0.0f || fArr15[i4] != 0.0f) {
                                    float z3 = td4.z(1.0f, (float) Math.exp((-fArr8[i4]) / 0.045f), f13, f13);
                                    fArr7[i4] = (fArr16[i4] * z3) + fArr7[i4];
                                    fArr4[i4] = (fArr15[i4] * z3) + fArr4[i4];
                                }
                                if (A > 0.6f) {
                                    b = Math.max(0, b - 1);
                                }
                                if (A > 0.85f) {
                                    b = 0;
                                }
                                B = Math.min(1.0f, f11 / f8) * (A > 0.9f ? f13 / 0.1f : 1.0f);
                            } else {
                                fArr7 = fArr5;
                                f5 = pow;
                                i4 = i6;
                                float pow2 = (float) Math.pow(f11, 2.1d);
                                float f19 = 1.0f - pow2;
                                float f20 = f19 * f19;
                                float f21 = f19 * 2.0f * pow2;
                                float f22 = pow2 * pow2;
                                fArr7[i4] = hg9.u(fArr11[i4], this.R, f22, (fArr12[i4] * f21) + (fArr13[i4] * f20));
                                fArr4[i4] = hg9.u(fArr9[i4], this.S, f22, (f21 * fArr14[i4]) + (fArr10[i4] * f20));
                                if (fArr16[i4] != 0.0f || fArr15[i4] != 0.0f) {
                                    float z4 = td4.z(1.0f, (float) Math.exp((-fArr8[i4]) / 0.045f), f19, f19);
                                    fArr7[i4] = (fArr16[i4] * z4) + fArr7[i4];
                                    fArr4[i4] = (fArr15[i4] * z4) + fArr4[i4];
                                }
                                if (pow2 > 0.55f) {
                                    b = Math.max(0, b - 1);
                                }
                                if (pow2 > 0.8f) {
                                    b = 0;
                                }
                                boolean z5 = pow2 > 0.72f && !this.s;
                                float min2 = (pow2 > 0.9f ? f19 / 0.1f : 1.0f) * Math.min(1.0f, f11 / 0.07f);
                                z = z5;
                                B = min2;
                                sin = ((((float) Math.sin((fArr8[i4] * 11.0f) + (2.0f * f12))) * 0.22f) + 0.78f) * B * f;
                                if (sin >= 0.03f) {
                                    sArr[i4] = -1;
                                } else {
                                    boolean z6 = this.r[i4];
                                    float[] fArr17 = this.j;
                                    int i8 = (((b << 3) + (z6 ? (int) fArr17[i4] : ((int) ((this.O * 5.0f) + fArr17[i4])) % 8)) * 3) + (sin > 0.66f ? 2 : sin > 0.33f ? 1 : 0);
                                    sArr[i4] = (short) i8;
                                    iArr[i8] = iArr[i8] + 1;
                                    boolean z7 = this.s;
                                    byte[] bArr2 = this.p;
                                    if (!z7 || bArr[i4] != 2) {
                                        if (!z || sin <= 0.3f) {
                                            if (bArr2[i4] != 0) {
                                                if (((float) Math.sin((fArr8[i4] * 24.0f) + (f12 * 3.0f))) > 0.35f) {
                                                    if (sin <= 0.3f) {
                                                    }
                                                }
                                            }
                                        }
                                        int i9 = this.J;
                                        int i10 = i9 + 1;
                                        this.J = i10;
                                        fArr2[i9] = fArr7[i4];
                                        this.J = i9 + 2;
                                        fArr2[i10] = fArr4[i4];
                                    } else if (bArr2[i4] != 0 && sin > 0.2f) {
                                        if (((float) Math.sin((fArr8[i4] * 13.0f) + (f12 * 3.0f))) > -0.1f) {
                                            int i11 = this.B;
                                            int i12 = i11 + 1;
                                            this.B = i12;
                                            fArr3[i11] = fArr7[i4];
                                            this.B = i11 + 2;
                                            fArr3[i12] = fArr4[i4];
                                        }
                                    }
                                }
                                i6 = i4 + 1;
                                f6 = f8;
                                f7 = f4;
                                pow = f5;
                            }
                        } else {
                            fArr7 = fArr5;
                            f5 = pow;
                            i4 = i6;
                            if (b2 != 0) {
                                float f23 = 1.0f - f11;
                                float v = aq1.v(f23, f23, f23, 1.0f);
                                float f24 = f23 * 2.2f * f4;
                                float f25 = fArr13[i4];
                                fArr7[i4] = (((float) Math.sin((f9 * 17.0f) + f12)) * f24) + td4.A(fArr11[i4], f25, v, f25);
                                float f26 = fArr10[i4];
                                fArr4[i4] = (f24 * ((float) Math.cos((fArr8[i4] * 15.0f) + (1.3f * f12)))) + td4.A(fArr9[i4], f26, v, f26);
                                B = mlb.B(f11, f11, 1.0f, Math.min(1.0f, f11 / 0.15f));
                            } else {
                                fArr12[i4] = fArr12[i4] * f5;
                                fArr14[i4] = (fArr14[i4] * f5) - (this.Q * min);
                                fArr7[i4] = aq1.g(9.0f * f4, (float) Math.sin((fArr8[i4] * 6.5f) + f12), fArr12[i4], min, fArr7[i4]);
                                fArr4[i4] = aq1.g(7.0f * f4, (float) Math.cos((fArr8[i4] * 5.5f) + (1.7f * f12)), fArr14[i4], min, fArr4[i4]);
                                B = mlb.B(f11, 0.35f, 1.0f, (1.0f - f11) * Math.min(1.0f, f11 / 0.07f));
                            }
                        }
                        z = false;
                        sin = ((((float) Math.sin((fArr8[i4] * 11.0f) + (2.0f * f12))) * 0.22f) + 0.78f) * B * f;
                        if (sin >= 0.03f) {
                        }
                        i6 = i4 + 1;
                        f6 = f8;
                        f7 = f4;
                        pow = f5;
                    }
                }
            }
            f4 = f7;
            f5 = pow;
            i4 = i6;
            i6 = i4 + 1;
            f6 = f8;
            f7 = f4;
            pow = f5;
        }
        float f27 = f7;
        this.D = i7;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            iArr2 = this.H;
            if (i13 >= 72) {
                break;
            }
            iArr2[i13] = i14;
            i14 += iArr[i13] << 1;
            iArr[i13] = 0;
            i13++;
        }
        int i15 = 0;
        while (true) {
            fArr6 = this.E;
            if (i15 >= s) {
                break;
            }
            short s2 = sArr[i15];
            if (s2 >= 0 && fArr[i15] > 0.0f) {
                int i16 = iArr2[s2];
                int i17 = iArr[s2];
                int i18 = i16 + (i17 << 1);
                fArr6[i18] = fArr5[i15];
                fArr6[i18 + 1] = fArr4[i15];
                iArr[s2] = i17 + 1;
            }
            i15++;
        }
        int[] iArr5 = this.a;
        if (iArr5 == null && (iArr5 = this.t) == null) {
            iArr5 = this.M ? T : U;
        }
        int i19 = 0;
        while (true) {
            paint = this.K;
            paint2 = this.L;
            if (i19 >= i2) {
                break;
            }
            float max = Math.max(1.0f, (i19 == 0 ? 0.6f : i19 == i3 ? 1.0f : 1.5f) * f27);
            int i20 = i;
            int i21 = 0;
            while (i21 < i20) {
                int i22 = 0;
                while (i22 < 3) {
                    int i23 = (((i19 << 3) + i21) * 3) + i22;
                    int i24 = iArr[i23];
                    if (i24 == 0) {
                        iArr3 = iArr5;
                        f3 = f2;
                        iArr4 = iArr2;
                    } else {
                        iArr3 = iArr5;
                        f3 = f2;
                        iArr4 = iArr2;
                        float A2 = mlb.A(i22, 0.35f, f3, 1.0f);
                        if (this.M && i19 == 2) {
                            paint2.setColor(iArr3[i21]);
                            paint2.setAlpha((int) (A2 * 255.0f * 0.14f));
                            paint2.setStrokeWidth(2.6f * max);
                            canvas.drawPoints(fArr6, iArr4[i23], i24 << 1, paint2);
                        }
                        paint.setColor(iArr3[i21]);
                        paint.setAlpha((int) (Math.min(1.0f, A2 * (this.M ? 1.0f : 1.15f)) * 255.0f));
                        paint.setStrokeWidth(max);
                        canvas.drawPoints(fArr6, iArr4[i23], i24 << 1, paint);
                    }
                    i22++;
                    iArr5 = iArr3;
                    iArr2 = iArr4;
                    f2 = f3;
                }
                i21++;
                i20 = 8;
                f2 = f2;
            }
            i19++;
            i = 8;
            i2 = 3;
            i3 = 1;
            f2 = f2;
        }
        int[] iArr6 = iArr5;
        int i25 = this.J;
        int i26 = nm7.d4;
        if (i25 > 0) {
            int[] iArr7 = this.a;
            paint2.setColor(iArr7 != null ? iArr7[7] : this.M ? -7347457 : -10700555);
            paint2.setAlpha(this.M ? 90 : 100);
            paint2.setStrokeWidth(f27 * (this.M ? 2.4f : 2.0f));
            canvas.drawPoints(fArr2, 0, this.J, paint2);
            paint.setColor(-1);
            paint.setAlpha(nm7.d4);
            paint.setStrokeWidth(Math.max(1.0f, f27 * 0.9f));
            canvas.drawPoints(fArr2, 0, this.J, paint);
        }
        if (this.B <= 0) {
            return true;
        }
        paint2.setColor(iArr6[7]);
        paint2.setAlpha(this.M ? 80 : 90);
        paint2.setStrokeWidth(f27 * 1.9f);
        canvas.drawPoints(fArr3, 0, this.B, paint2);
        paint.setColor(-1);
        if (this.M) {
            i26 = 235;
        }
        paint.setAlpha(i26);
        paint.setStrokeWidth(Math.max(1.0f, f27 * 0.75f));
        canvas.drawPoints(fArr3, 0, this.B, paint);
        return true;
    }

    public final void c(float f, float f2, int i) {
        this.h[i] = Math.max(0.05f, f);
        this.g[i] = -f2;
        this.i[i] = d() * 6.2832f;
        this.j[i] = d() * 8.0f;
        this.r[i] = false;
        float d = d();
        this.o[i] = (byte) (d < 0.5f ? 0 : d < 0.86f ? 1 : 2);
        this.p[i] = (byte) (d() < 0.07f ? 1 : 0);
    }

    public final float d() {
        int i = this.P;
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        this.P = i3 ^ (i3 << 5);
        return (r0 >>> 8) / 1.6777216E7f;
    }

    public final void e(boolean z) {
        this.M = z;
        if (Build.VERSION.SDK_INT >= 29) {
            this.L.setBlendMode(z ? BlendMode.PLUS : BlendMode.SRC_OVER);
        }
    }

    public final int f() {
        int i = this.C;
        this.C = (i + 1) % this.b;
        if (this.h[i] <= 0.0f) {
            this.D++;
        }
        return i;
    }

    public final void g(float f, float f2, float f3, float f4, float f5, float f6) {
        int f7 = f();
        this.c[f7] = f;
        this.d[f7] = f2;
        this.e[f7] = f3;
        this.f[f7] = f4;
        this.q[f7] = 0;
        c(f5, f6, f7);
    }

    public final void h(float f, float f2, float f3, float f4, float f5) {
        int f6 = f();
        this.c[f6] = f;
        this.m[f6] = f;
        this.n[f6] = f2;
        this.d[f6] = f2;
        this.k[f6] = f3;
        this.l[f6] = f4;
        this.f[f6] = 0.0f;
        this.e[f6] = 0.0f;
        this.q[f6] = 1;
        c(f5, 0.0f, f6);
    }

    public final void i(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        int f9 = f();
        this.c[f9] = f;
        this.m[f9] = f;
        this.d[f9] = f2;
        this.n[f9] = f2;
        this.k[f9] = f5;
        this.l[f9] = f6;
        this.e[f9] = f3;
        this.f[f9] = f4;
        this.q[f9] = 2;
        c(f7, f8, f9);
        this.x[f9] = 0.0f;
        this.w[f9] = 0.0f;
        this.A[f9] = false;
        if (this.s) {
            byte b = (byte) (d() < this.u ? 1 : 0);
            this.p[f9] = b;
            if (b != 0) {
                this.o[f9] = 0;
            }
        }
    }

    public final void j(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        i(f, f2, f3, f4, f5, f6, f7, f8);
        int i2 = this.C;
        short s = this.b;
        int i3 = ((i2 + s) - 1) % s;
        this.j[i3] = Math.max(0, Math.min(7, i));
        this.r[i3] = true;
    }
}
