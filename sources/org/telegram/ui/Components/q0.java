package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.SystemClock;
import android.view.View;
import java.util.Random;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class q0 {
    public float[] D;
    public float[] E;
    public float[] F;
    public int G;
    public long I;
    public final View a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final d6 e;
    public final d6 f;
    public long g;
    public LinearGradient r;
    public SweepGradient s;
    public int u;
    public final Paint h = new Paint(1);
    public final Path i = new Path();
    public final Paint j = new Paint(1);
    public final Paint k = new Paint(1);
    public final Paint l = new Paint(1);
    public final Paint m = new Paint(1);
    public final Paint n = new Paint(1);
    public final Path o = new Path();
    public final RectF p = new RectF();
    public final Matrix q = new Matrix();
    public float t = -1.0f;
    public final float[] v = new float[3];
    public final float[] w = new float[3];
    public final float[] x = new float[3];
    public final float[] y = new float[3];
    public final long[] z = new long[3];
    public final int[] A = new int[3];
    public final boolean[] B = new boolean[3];
    public final Random C = new Random(5905022);
    public float H = -1.0f;
    public float J = Float.NaN;
    public float K = Float.NaN;
    public final float[] L = new float[5];
    public final float[] M = new float[5];
    public final float[] N = new float[5];
    public final float[] O = new float[5];
    public final float[] P = new float[5];

    public q0(re reVar) {
        this.a = reVar;
        Random random = new Random(31249L);
        float[] fArr = {-1.0f, 1.0f, -0.6f, 0.7f, -0.85f};
        for (int i7 = 0; i7 < 5; i7++) {
            this.L[i7] = random.nextFloat() * 2.0f;
            this.M[i7] = org.telegram.ui.Cells.c0.h(random, 0.55f, 0.75f);
            this.N[i7] = fArr[i7] * org.telegram.messenger.g0.L(random.nextInt(5) + 9);
            this.O[i7] = org.telegram.messenger.g0.L((random.nextFloat() * 1.4f) + 1.6f);
            this.P[i7] = org.telegram.messenger.g0.L(random.nextInt(6) + 6);
        }
        this.e = new d6(reVar, 0L, 420L, nr.h);
        this.f = new d6(reVar, 0L, 360L, nr.g);
        this.i.moveTo(0.0f, -1.0f);
        this.i.quadTo(0.2f, -0.2f, 1.0f, 0.0f);
        this.i.quadTo(0.2f, 0.2f, 0.0f, 1.0f);
        this.i.quadTo(-0.2f, 0.2f, -1.0f, 0.0f);
        this.i.quadTo(-0.2f, -0.2f, 0.0f, -1.0f);
        this.i.close();
        Paint paint = this.k;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.k;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.m.setStyle(style);
        this.m.setStrokeCap(cap);
    }

    public final void a(float f10, int i7) {
        if (this.t == f10 && this.u == i7) {
            return;
        }
        this.t = f10;
        this.u = i7;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f10 * 2.2f, 0.0f, new int[]{16777215, 16777215, 956301311, 16777215, 16777215}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.REPEAT);
        this.r = linearGradient;
        this.j.setShader(linearGradient);
        SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, new int[]{9497855, 9497855, -1935871745, -421988097, -1}, new float[]{0.0f, 0.55f, 0.8f, 0.95f, 1.0f});
        this.s = sweepGradient;
        this.k.setShader(sweepGradient);
        int f11 = i0.a.f(0.55f, i7, -6297345) & 16777215;
        this.n.setShader(new RadialGradient(0.0f, 0.0f, f10 + org.telegram.messenger.g0.L(4.0f), new int[]{f11, Integer.MIN_VALUE | f11, f11}, new float[]{(f10 - org.telegram.messenger.g0.L(1.0f)) / (org.telegram.messenger.g0.L(4.0f) + f10), (org.telegram.messenger.g0.L(0.5f) + f10) / (f10 + org.telegram.messenger.g0.L(4.0f)), 1.0f}, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x034d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, RectF rectF, int i7, int i10) {
        float f10;
        float f11;
        d6 d6Var;
        float f12;
        float f13;
        float f14;
        boolean[] zArr;
        int i11;
        float f15;
        float f16;
        float f17;
        float[] fArr;
        long[] jArr;
        float[] fArr2;
        float[] fArr3;
        int[] iArr;
        float[] fArr4;
        int i12;
        int nextInt;
        int i13;
        float[] fArr5;
        float[] fArr6;
        long[] jArr2;
        boolean z10 = this.c;
        d6 d6Var2 = this.f;
        float d = d6Var2.d(z10);
        boolean z11 = (!this.b || this.c || this.d) ? false : true;
        d6 d6Var3 = this.e;
        float d2 = d6Var3.d(z11);
        float height = rectF.height() / 2.0f;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z12 = (!this.b || this.c || this.d) ? false : true;
        boolean[] zArr2 = this.B;
        if (d2 > 0.003f) {
            float f18 = 1.0f;
            if (this.H != height) {
                this.H = height;
                Path d10 = c8.l0.d("M6.232,35.046C22.115,28.147 32.706,23.599 38.006,21.401C53.136,15.126 56.28,14.036 58.329,14C58.78,13.992 59.788,14.104 60.441,14.632C60.992,15.078 61.143,15.68 61.216,16.103C61.289,16.526 61.379,17.489 61.307,18.241C60.487,26.831 56.939,47.675 55.134,57.295C54.371,61.366 52.867,62.731 51.411,62.865C48.247,63.155 45.844,60.78 42.78,58.777C37.985,55.643 35.276,53.692 30.621,50.634C25.242,47.1 28.729,45.157 31.795,41.983C32.597,41.152 46.537,28.51 46.807,27.363C46.841,27.22 46.872,26.685 46.554,26.403C46.235,26.12 45.765,26.217 45.426,26.294C44.945,26.402 37.284,31.451 22.444,41.438C20.27,42.927 18.3,43.652 16.536,43.614C14.591,43.572 10.849,42.518 8.067,41.616C4.655,40.51 2.448,39.938 2.684,38.06C2.807,37.082 3.99,36.077 6.232,35.046Z");
                f13 = 0.0f;
                Matrix matrix = new Matrix();
                matrix.setTranslate(-36.0f, -36.0f);
                matrix.postScale(org.telegram.messenger.g0.L(24.0f) / 72.0f, org.telegram.messenger.g0.L(24.0f) / 72.0f);
                d10.transform(matrix);
                int i14 = (int) height;
                int i15 = (-i14) - 2;
                int i16 = i14 + 2;
                Region region = new Region(i15, i15, i16, i16);
                Region region2 = new Region();
                region2.setPath(d10, region);
                this.D = new float[org.telegram.messenger.ls.z2];
                this.E = new float[org.telegram.messenger.ls.z2];
                this.F = new float[org.telegram.messenger.ls.z2];
                this.G = 0;
                float f19 = height * 0.09f;
                float f20 = 0.2f * height;
                float L = org.telegram.messenger.g0.L(1.5f);
                f14 = d2;
                zArr = zArr2;
                int i17 = 0;
                while (true) {
                    f11 = d;
                    if (i17 >= 13) {
                        break;
                    }
                    int i18 = 0;
                    for (int i19 = 13; i18 < i19; i19 = 13) {
                        float f21 = -height;
                        float f22 = height * 2.0f;
                        float f23 = (((i18 + 0.5f) * f22) / 13.0f) + f21;
                        int i20 = i18;
                        float f24 = (((i17 + 0.5f) * f22) / 13.0f) + f21;
                        long j3 = uptimeMillis;
                        double d11 = f23;
                        boolean z13 = z12;
                        float f25 = L;
                        double d12 = f24;
                        d6 d6Var4 = d6Var3;
                        float f26 = centerX;
                        float hypot = (float) Math.hypot(d11, d12);
                        float f27 = f20;
                        while (true) {
                            if (f27 < f19 - 0.01f) {
                                i11 = i17;
                                f15 = f23;
                                f27 = 0.0f;
                                break;
                            }
                            i11 = i17;
                            if (hypot + f27 <= height - org.telegram.messenger.g0.L(2.5f)) {
                                float f28 = f27 + f25;
                                f16 = hypot;
                                f15 = f23;
                                if (!region2.contains((int) f23, (int) f24)) {
                                    int i21 = 0;
                                    while (i21 < 12) {
                                        f17 = f24;
                                        double d13 = (i21 * 3.141592653589793d) / 6.0d;
                                        int i22 = i21;
                                        float f29 = 0.5f;
                                        while (f29 <= 1.0f) {
                                            double cos = Math.cos(d13);
                                            double d14 = d13;
                                            double d15 = f28;
                                            double d16 = cos * d15;
                                            double d17 = f29;
                                            float f30 = f28;
                                            float f31 = f29;
                                            if (region2.contains((int) ((d16 * d17) + d11), (int) ((Math.sin(d14) * d15 * d17) + d12))) {
                                                break;
                                            }
                                            f29 = f31 + 0.5f;
                                            d13 = d14;
                                            f28 = f30;
                                        }
                                        i21 = i22 + 1;
                                        f24 = f17;
                                    }
                                    break;
                                }
                                f17 = f24;
                            } else {
                                f15 = f23;
                                f17 = f24;
                                f16 = hypot;
                            }
                            f27 = org.telegram.messenger.f3.y(f20, f19, 4.0f, f27);
                            hypot = f16;
                            f23 = f15;
                            i17 = i11;
                            f24 = f17;
                        }
                        float f32 = f24;
                        if (f27 > 0.0f) {
                            float[] fArr7 = this.D;
                            int i23 = this.G;
                            fArr7[i23] = f15;
                            this.E[i23] = f32;
                            this.F[i23] = f27;
                            this.G = i23 + 1;
                        }
                        i18 = i20 + 1;
                        uptimeMillis = j3;
                        z12 = z13;
                        L = f25;
                        d6Var3 = d6Var4;
                        centerX = f26;
                        i17 = i11;
                    }
                    i17++;
                    d = f11;
                }
            } else {
                f14 = d2;
                zArr = zArr2;
                f13 = 0.0f;
                f11 = d;
            }
            d6Var = d6Var3;
            f12 = centerX;
            long j10 = uptimeMillis;
            boolean z14 = z12;
            float[] fArr8 = this.y;
            long[] jArr3 = this.z;
            int[] iArr2 = this.A;
            float[] fArr9 = this.v;
            float[] fArr10 = this.w;
            float[] fArr11 = this.x;
            if (z14 && this.G != 0) {
                if (this.I == 0) {
                    this.I = j10 + 120;
                }
                if (j10 >= this.I) {
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = -1;
                    while (i24 < 3) {
                        if (zArr[i24]) {
                            fArr6 = fArr8;
                            jArr2 = jArr3;
                            if (j10 - jArr3[i24] < iArr2[i24]) {
                                i25++;
                                i24++;
                                fArr8 = fArr6;
                                jArr3 = jArr2;
                            }
                        } else {
                            fArr6 = fArr8;
                            jArr2 = jArr3;
                        }
                        if (i26 < 0) {
                            i26 = i24;
                        }
                        i24++;
                        fArr8 = fArr6;
                        jArr3 = jArr2;
                    }
                    fArr = fArr8;
                    jArr = jArr3;
                    Random random = this.C;
                    if (i26 < 0) {
                        this.I = j10 + 200 + random.nextInt(org.telegram.messenger.ls.X4);
                        iArr = iArr2;
                        f10 = height;
                        fArr3 = fArr9;
                        fArr2 = fArr10;
                        fArr4 = fArr11;
                        Paint paint = this.h;
                        paint.setColor(i7);
                        i12 = 0;
                        while (i12 < 3) {
                            if (zArr[i12]) {
                                float f33 = (j10 - jArr[i12]) / iArr[i12];
                                if (f33 >= f18) {
                                    zArr[i12] = false;
                                } else {
                                    float f34 = f18;
                                    float interpolation = nr.j.getInterpolation(Math.min(f34, (f34 - f33) / 0.4f)) * nr.g.getInterpolation(Math.min(f34, f33 / 0.3f));
                                    float B = com.google.android.gms.internal.vision.e2.B(interpolation, 0.75f, 0.25f, fArr4[i12] * f14);
                                    paint.setAlpha((int) (f14 * 255.0f * interpolation));
                                    canvas.save();
                                    canvas.translate(f12 + fArr3[i12], fArr2[i12] + centerY);
                                    canvas.rotate((f33 - 0.5f) * fArr[i12]);
                                    canvas.scale(B, B);
                                    canvas.drawPath(this.i, paint);
                                    canvas.restore();
                                }
                            }
                            i12++;
                            f18 = 1.0f;
                        }
                    } else {
                        int i27 = 0;
                        while (true) {
                            if (i27 >= 24) {
                                iArr = iArr2;
                                f10 = height;
                                fArr3 = fArr9;
                                fArr2 = fArr10;
                                fArr4 = fArr11;
                                break;
                            }
                            int nextInt2 = random.nextInt(this.G);
                            float f35 = this.D[nextInt2];
                            float f36 = this.E[nextInt2];
                            float f37 = this.F[nextInt2];
                            float f38 = this.H * 0.09f;
                            iArr = iArr2;
                            float max = (Math.max(f13, f37 - f38) * random.nextFloat()) + f38;
                            if (Float.isNaN(this.J)) {
                                f10 = height;
                                fArr3 = fArr9;
                                fArr2 = fArr10;
                            } else {
                                f10 = height;
                                fArr3 = fArr9;
                                fArr2 = fArr10;
                                if (Math.hypot(f35 - this.J, f36 - this.K) < this.H * 0.45f) {
                                    fArr5 = fArr11;
                                    i27++;
                                    fArr11 = fArr5;
                                    height = f10;
                                    iArr2 = iArr;
                                    fArr9 = fArr3;
                                    fArr10 = fArr2;
                                    f13 = 0.0f;
                                }
                            }
                            int i28 = 0;
                            while (i28 < 3) {
                                if (zArr[i28]) {
                                    fArr5 = fArr11;
                                    if (Math.hypot(f35 - fArr3[i28], f36 - fArr2[i28]) < fArr5[i28] + max + org.telegram.messenger.g0.L(2.0f)) {
                                        break;
                                    }
                                } else {
                                    fArr5 = fArr11;
                                }
                                i28++;
                                fArr11 = fArr5;
                            }
                            fArr4 = fArr11;
                            fArr3[i26] = f35;
                            fArr2[i26] = f36;
                            fArr4[i26] = max;
                            fArr[i26] = (random.nextInt(14) + 10) * (random.nextBoolean() ? 1 : -1);
                            jArr[i26] = j10;
                            iArr[i26] = random.nextInt(700) + 900;
                            zArr[i26] = true;
                            this.J = f35;
                            this.K = f36;
                        }
                        if (i25 == 0) {
                            nextInt = random.nextInt(org.telegram.messenger.ls.Z3);
                            i13 = org.telegram.messenger.ls.e3;
                        } else {
                            nextInt = random.nextInt(600);
                            i13 = org.telegram.messenger.ls.X4;
                        }
                        this.I = j10 + nextInt + i13;
                        Paint paint2 = this.h;
                        paint2.setColor(i7);
                        i12 = 0;
                        while (i12 < 3) {
                        }
                    }
                }
            }
            fArr = fArr8;
            jArr = jArr3;
            iArr = iArr2;
            f10 = height;
            fArr3 = fArr9;
            fArr2 = fArr10;
            fArr4 = fArr11;
            Paint paint22 = this.h;
            paint22.setColor(i7);
            i12 = 0;
            while (i12 < 3) {
            }
        } else {
            f10 = height;
            f11 = d;
            d6Var = d6Var3;
            f12 = centerX;
            for (int i29 = 0; i29 < 3; i29++) {
                zArr2[i29] = false;
            }
            this.I = 0L;
        }
        if (f11 > 0.003f) {
            float f39 = f10;
            a(f39, i10);
            float d18 = d();
            canvas.save();
            canvas.translate(f12, centerY);
            float f40 = d18 / 1.1f;
            float sin = ((((f40 % 1.0f) - (((float) Math.sin((r3 * 2.0f) * 3.141592653589793d)) * 0.06f)) + ((float) Math.floor(f40))) * 360.0f) + 90.0f;
            Matrix matrix2 = this.q;
            matrix2.reset();
            matrix2.setRotate(sin - 360.0f);
            this.s.setLocalMatrix(matrix2);
            float L2 = f39 - org.telegram.messenger.g0.L(2.2f);
            float f41 = -L2;
            RectF rectF2 = this.p;
            rectF2.set(f41, f41, L2, L2);
            float L3 = org.telegram.messenger.g0.L(2.6f);
            Paint paint3 = this.k;
            paint3.setStrokeWidth(L3);
            int i30 = (int) (f11 * 255.0f);
            paint3.setAlpha(i30);
            canvas.drawArc(rectF2, sin - 160.0f, 160.0f, false, paint3);
            double radians = Math.toRadians(sin);
            float cos2 = ((float) Math.cos(radians)) * L2;
            float sin2 = ((float) Math.sin(radians)) * L2;
            int argb = Color.argb((int) (f11 * 110.0f), org.telegram.messenger.ls.e3, org.telegram.messenger.ls.U3, org.telegram.messenger.ls.e4);
            Paint paint4 = this.l;
            paint4.setColor(argb);
            canvas.drawCircle(cos2, sin2, org.telegram.messenger.g0.L(3.6f), paint4);
            paint4.setColor(Color.argb(i30, org.telegram.messenger.ls.e4, org.telegram.messenger.ls.e4, org.telegram.messenger.ls.e4));
            canvas.drawCircle(cos2, sin2, org.telegram.messenger.g0.L(1.7f), paint4);
            canvas.restore();
        }
        if (d2 > 0.003f || f11 > 0.003f || d6Var.i || d6Var2.i) {
            this.a.invalidate();
        }
    }

    public final void c(boolean z10) {
        if (this.c == z10) {
            return;
        }
        this.c = z10;
        if (z10) {
            this.g = SystemClock.uptimeMillis();
        }
        this.f.g = z10 ? 300L : 560L;
        this.a.invalidate();
    }

    public final float d() {
        return (SystemClock.uptimeMillis() - this.g) / 1000.0f;
    }
}
