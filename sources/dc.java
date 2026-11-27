// default package

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
import java.util.ArrayList;
import java.util.Random;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class dc {
    public float[] D;
    public float[] E;
    public float[] F;
    public int G;
    public long I;
    public final bx1 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final mm e;
    public final mm f;
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
    public final ArrayList Q = new ArrayList();

    public dc(bx1 bx1Var) {
        this.a = bx1Var;
        Random random = new Random(31249L);
        float[] fArr = {-1.0f, 1.0f, -0.6f, 0.7f, -0.85f};
        for (int i = 0; i < 5; i++) {
            this.L[i] = random.nextFloat() * 2.0f;
            this.M[i] = ik8.e(random, 0.55f, 0.75f);
            this.N[i] = fArr[i] * hl.L(random.nextInt(5) + 9);
            this.O[i] = hl.L((random.nextFloat() * 1.4f) + 1.6f);
            this.P[i] = hl.L(random.nextInt(6) + 6);
        }
        this.e = new mm(bx1Var, 0L, 420L, k43.h);
        this.f = new mm(bx1Var, 0L, 360L, k43.g);
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

    public final void a(float f, int i) {
        if (this.t == f && this.u == i) {
            return;
        }
        this.t = f;
        this.u = i;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f * 2.2f, 0.0f, new int[]{16777215, 16777215, 956301311, 16777215, 16777215}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.REPEAT);
        this.r = linearGradient;
        this.j.setShader(linearGradient);
        SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, new int[]{9497855, 9497855, -1935871745, -421988097, -1}, new float[]{0.0f, 0.55f, 0.8f, 0.95f, 1.0f});
        this.s = sweepGradient;
        this.k.setShader(sweepGradient);
        int f2 = vm2.f(0.55f, i, -6297345) & 16777215;
        this.n.setShader(new RadialGradient(0.0f, 0.0f, f + hl.L(4.0f), new int[]{f2, Integer.MIN_VALUE | f2, f2}, new float[]{(f - hl.L(1.0f)) / (hl.L(4.0f) + f), (hl.L(0.5f) + f) / (f + hl.L(4.0f)), 1.0f}, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x033a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, RectF rectF, int i, int i2) {
        float f;
        float f2;
        mm mmVar;
        float f3;
        float f4;
        float f5;
        boolean[] zArr;
        int i3;
        float f6;
        float f7;
        float f8;
        float[] fArr;
        long[] jArr;
        float[] fArr2;
        float[] fArr3;
        int[] iArr;
        float[] fArr4;
        int i4;
        int nextInt;
        int i5;
        float[] fArr5;
        float[] fArr6;
        long[] jArr2;
        boolean z = this.c;
        mm mmVar2 = this.f;
        float d = mmVar2.d(z);
        boolean z2 = (!this.b || this.c || this.d) ? false : true;
        mm mmVar3 = this.e;
        float d2 = mmVar3.d(z2);
        float height = rectF.height() / 2.0f;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z3 = (!this.b || this.c || this.d) ? false : true;
        boolean[] zArr2 = this.B;
        if (d2 > 0.003f) {
            float f9 = 1.0f;
            if (this.H != height) {
                this.H = height;
                Path d3 = hve.d("M6.232,35.046C22.115,28.147 32.706,23.599 38.006,21.401C53.136,15.126 56.28,14.036 58.329,14C58.78,13.992 59.788,14.104 60.441,14.632C60.992,15.078 61.143,15.68 61.216,16.103C61.289,16.526 61.379,17.489 61.307,18.241C60.487,26.831 56.939,47.675 55.134,57.295C54.371,61.366 52.867,62.731 51.411,62.865C48.247,63.155 45.844,60.78 42.78,58.777C37.985,55.643 35.276,53.692 30.621,50.634C25.242,47.1 28.729,45.157 31.795,41.983C32.597,41.152 46.537,28.51 46.807,27.363C46.841,27.22 46.872,26.685 46.554,26.403C46.235,26.12 45.765,26.217 45.426,26.294C44.945,26.402 37.284,31.451 22.444,41.438C20.27,42.927 18.3,43.652 16.536,43.614C14.591,43.572 10.849,42.518 8.067,41.616C4.655,40.51 2.448,39.938 2.684,38.06C2.807,37.082 3.99,36.077 6.232,35.046Z");
                f4 = 0.0f;
                Matrix matrix = new Matrix();
                matrix.setTranslate(-36.0f, -36.0f);
                matrix.postScale(hl.L(24.0f) / 72.0f, hl.L(24.0f) / 72.0f);
                d3.transform(matrix);
                int i6 = (int) height;
                int i7 = (-i6) - 2;
                int i8 = i6 + 2;
                Region region = new Region(i7, i7, i8, i8);
                Region region2 = new Region();
                region2.setPath(d3, region);
                this.D = new float[jn7.y2];
                this.E = new float[jn7.y2];
                this.F = new float[jn7.y2];
                this.G = 0;
                float f10 = height * 0.09f;
                float f11 = 0.2f * height;
                float L = hl.L(1.5f);
                f5 = d2;
                zArr = zArr2;
                int i9 = 0;
                while (true) {
                    f2 = d;
                    if (i9 >= 13) {
                        break;
                    }
                    int i10 = 0;
                    for (int i11 = 13; i10 < i11; i11 = 13) {
                        float f12 = -height;
                        float f13 = height * 2.0f;
                        float f14 = (((i10 + 0.5f) * f13) / 13.0f) + f12;
                        int i12 = i10;
                        float f15 = (((i9 + 0.5f) * f13) / 13.0f) + f12;
                        long j = uptimeMillis;
                        double d4 = f14;
                        boolean z4 = z3;
                        float f16 = L;
                        double d5 = f15;
                        mm mmVar4 = mmVar3;
                        float f17 = centerX;
                        float hypot = (float) Math.hypot(d4, d5);
                        float f18 = f11;
                        while (true) {
                            if (f18 < f10 - 0.01f) {
                                i3 = i9;
                                f6 = f14;
                                f18 = 0.0f;
                                f7 = f15;
                                break;
                            }
                            i3 = i9;
                            if (hypot + f18 <= height - hl.L(2.5f)) {
                                float f19 = f18 + f16;
                                f8 = hypot;
                                f6 = f14;
                                if (!region2.contains((int) f14, (int) f15)) {
                                    int i13 = 0;
                                    while (true) {
                                        f7 = f15;
                                        if (i13 >= 12) {
                                            break;
                                        }
                                        double d6 = (i13 * 3.141592653589793d) / 6.0d;
                                        int i14 = i13;
                                        float f20 = 0.5f;
                                        while (f20 <= 1.0f) {
                                            double cos = Math.cos(d6);
                                            double d7 = d6;
                                            double d8 = f19;
                                            double d9 = cos * d8;
                                            double d10 = f20;
                                            float f21 = f19;
                                            float f22 = f20;
                                            if (region2.contains((int) ((d9 * d10) + d4), (int) ((Math.sin(d7) * d8 * d10) + d5))) {
                                                break;
                                            }
                                            f20 = f22 + 0.5f;
                                            d6 = d7;
                                            f19 = f21;
                                        }
                                        i13 = i14 + 1;
                                        f15 = f7;
                                    }
                                } else {
                                    f7 = f15;
                                }
                            } else {
                                f6 = f14;
                                f7 = f15;
                                f8 = hypot;
                            }
                            f18 = qd4.x(f11, f10, 4.0f, f18);
                            hypot = f8;
                            f14 = f6;
                            i9 = i3;
                            f15 = f7;
                        }
                        if (f18 > 0.0f) {
                            float[] fArr7 = this.D;
                            int i15 = this.G;
                            fArr7[i15] = f6;
                            this.E[i15] = f7;
                            this.F[i15] = f18;
                            this.G = i15 + 1;
                        }
                        i10 = i12 + 1;
                        uptimeMillis = j;
                        z3 = z4;
                        L = f16;
                        mmVar3 = mmVar4;
                        centerX = f17;
                        i9 = i3;
                    }
                    i9++;
                    d = f2;
                }
            } else {
                f5 = d2;
                zArr = zArr2;
                f4 = 0.0f;
                f2 = d;
            }
            mmVar = mmVar3;
            f3 = centerX;
            long j2 = uptimeMillis;
            boolean z5 = z3;
            float[] fArr8 = this.y;
            long[] jArr3 = this.z;
            int[] iArr2 = this.A;
            float[] fArr9 = this.v;
            float[] fArr10 = this.w;
            float[] fArr11 = this.x;
            if (z5 && this.G != 0) {
                long j3 = this.I;
                if (j3 == 0) {
                    j3 = j2 + 120;
                    this.I = j3;
                }
                if (j2 >= j3) {
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = -1;
                    while (i16 < 3) {
                        if (zArr[i16]) {
                            fArr6 = fArr8;
                            jArr2 = jArr3;
                            if (j2 - jArr3[i16] < iArr2[i16]) {
                                i17++;
                                i16++;
                                fArr8 = fArr6;
                                jArr3 = jArr2;
                            }
                        } else {
                            fArr6 = fArr8;
                            jArr2 = jArr3;
                        }
                        if (i18 < 0) {
                            i18 = i16;
                        }
                        i16++;
                        fArr8 = fArr6;
                        jArr3 = jArr2;
                    }
                    fArr = fArr8;
                    jArr = jArr3;
                    Random random = this.C;
                    if (i18 < 0) {
                        this.I = j2 + 200 + random.nextInt(jn7.W4);
                        iArr = iArr2;
                        f = height;
                        fArr3 = fArr9;
                        fArr2 = fArr10;
                        fArr4 = fArr11;
                        Paint paint = this.h;
                        paint.setColor(i);
                        i4 = 0;
                        while (i4 < 3) {
                            if (zArr[i4]) {
                                float f23 = (j2 - jArr[i4]) / iArr[i4];
                                if (f23 >= f9) {
                                    zArr[i4] = false;
                                } else {
                                    float f24 = f9;
                                    float interpolation = k43.j.getInterpolation(Math.min(f24, (f24 - f23) / 0.4f)) * k43.g.getInterpolation(Math.min(f24, f23 / 0.3f));
                                    float z6 = xnb.z(interpolation, 0.75f, 0.25f, fArr4[i4] * f5);
                                    paint.setAlpha((int) (f5 * 255.0f * interpolation));
                                    canvas.save();
                                    canvas.translate(f3 + fArr3[i4], fArr2[i4] + centerY);
                                    canvas.rotate((f23 - 0.5f) * fArr[i4]);
                                    canvas.scale(z6, z6);
                                    canvas.drawPath(this.i, paint);
                                    canvas.restore();
                                }
                            }
                            i4++;
                            f9 = 1.0f;
                        }
                    } else {
                        int i19 = 0;
                        while (true) {
                            if (i19 >= 24) {
                                iArr = iArr2;
                                f = height;
                                fArr3 = fArr9;
                                fArr2 = fArr10;
                                fArr4 = fArr11;
                                break;
                            }
                            int nextInt2 = random.nextInt(this.G);
                            float f25 = this.D[nextInt2];
                            float f26 = this.E[nextInt2];
                            float f27 = this.F[nextInt2];
                            float f28 = this.H * 0.09f;
                            iArr = iArr2;
                            float max = (Math.max(f4, f27 - f28) * random.nextFloat()) + f28;
                            if (Float.isNaN(this.J)) {
                                f = height;
                                fArr3 = fArr9;
                                fArr2 = fArr10;
                            } else {
                                f = height;
                                fArr3 = fArr9;
                                fArr2 = fArr10;
                                if (Math.hypot(f25 - this.J, f26 - this.K) < this.H * 0.45f) {
                                    fArr5 = fArr11;
                                    i19++;
                                    fArr11 = fArr5;
                                    height = f;
                                    iArr2 = iArr;
                                    fArr9 = fArr3;
                                    fArr10 = fArr2;
                                    f4 = 0.0f;
                                }
                            }
                            int i20 = 0;
                            while (i20 < 3) {
                                if (zArr[i20]) {
                                    fArr5 = fArr11;
                                    if (Math.hypot(f25 - fArr3[i20], f26 - fArr2[i20]) < fArr5[i20] + max + hl.L(2.0f)) {
                                        break;
                                    }
                                } else {
                                    fArr5 = fArr11;
                                }
                                i20++;
                                fArr11 = fArr5;
                            }
                            fArr4 = fArr11;
                            fArr3[i18] = f25;
                            fArr2[i18] = f26;
                            fArr4[i18] = max;
                            fArr[i18] = (random.nextInt(14) + 10) * (random.nextBoolean() ? 1 : -1);
                            jArr[i18] = j2;
                            iArr[i18] = random.nextInt(700) + 900;
                            zArr[i18] = true;
                            this.J = f25;
                            this.K = f26;
                        }
                        if (i17 == 0) {
                            nextInt = random.nextInt(jn7.Y3);
                            i5 = jn7.d3;
                        } else {
                            nextInt = random.nextInt(600);
                            i5 = jn7.W4;
                        }
                        this.I = j2 + nextInt + i5;
                        Paint paint2 = this.h;
                        paint2.setColor(i);
                        i4 = 0;
                        while (i4 < 3) {
                        }
                    }
                }
            }
            fArr = fArr8;
            jArr = jArr3;
            iArr = iArr2;
            f = height;
            fArr3 = fArr9;
            fArr2 = fArr10;
            fArr4 = fArr11;
            Paint paint22 = this.h;
            paint22.setColor(i);
            i4 = 0;
            while (i4 < 3) {
            }
        } else {
            f = height;
            f2 = d;
            mmVar = mmVar3;
            f3 = centerX;
            for (int i21 = 0; i21 < 3; i21++) {
                zArr2[i21] = false;
            }
            this.I = 0L;
        }
        if (f2 > 0.003f) {
            float f29 = f;
            a(f29, i2);
            float e = e();
            canvas.save();
            canvas.translate(f3, centerY);
            float f30 = e / 1.1f;
            float sin = ((((f30 % 1.0f) - (((float) Math.sin((r3 * 2.0f) * 3.141592653589793d)) * 0.06f)) + ((float) Math.floor(f30))) * 360.0f) + 90.0f;
            Matrix matrix2 = this.q;
            matrix2.reset();
            matrix2.setRotate(sin - 360.0f);
            this.s.setLocalMatrix(matrix2);
            float L2 = f29 - hl.L(2.2f);
            float f31 = -L2;
            RectF rectF2 = this.p;
            rectF2.set(f31, f31, L2, L2);
            float L3 = hl.L(2.6f);
            Paint paint3 = this.k;
            paint3.setStrokeWidth(L3);
            int i22 = (int) (f2 * 255.0f);
            paint3.setAlpha(i22);
            canvas.drawArc(rectF2, sin - 160.0f, 160.0f, false, paint3);
            double radians = Math.toRadians(sin);
            float cos2 = ((float) Math.cos(radians)) * L2;
            float sin2 = ((float) Math.sin(radians)) * L2;
            int argb = Color.argb((int) (f2 * 110.0f), jn7.d3, jn7.T3, jn7.d4);
            Paint paint4 = this.l;
            paint4.setColor(argb);
            canvas.drawCircle(cos2, sin2, hl.L(3.6f), paint4);
            paint4.setColor(Color.argb(i22, jn7.d4, jn7.d4, jn7.d4));
            canvas.drawCircle(cos2, sin2, hl.L(1.7f), paint4);
            canvas.restore();
        }
        if (d2 > 0.003f || f2 > 0.003f || mmVar.i || mmVar2.i) {
            c();
        }
    }

    public final void c() {
        this.a.invalidate();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i)).invalidate();
            i++;
        }
    }

    public final void d(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        if (z) {
            this.g = SystemClock.uptimeMillis();
        }
        this.f.g = z ? 300L : 560L;
        c();
    }

    public final float e() {
        return (SystemClock.uptimeMillis() - this.g) / 1000.0f;
    }
}
