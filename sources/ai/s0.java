package ai;

import android.graphics.BlendMode;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.os.Build;
import android.os.SystemClock;
import java.util.Random;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.vu0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class s0 {
    public static float U;
    public final int[] A;
    public final int[] B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public final float[] I;
    public final float[] J;
    public final float[] K;
    public final float[] L;
    public final float[] M;
    public final float[] N;
    public final float[] O;
    public final float[] P;
    public final int[] Q;
    public final boolean[] R;
    public final boolean[] S;
    public float T;
    public final Paint a;
    public final Object b;
    public final Paint c;
    public final Paint d;
    public final Matrix e;
    public final Paint f;
    public final RectF g;
    public boolean h;
    public final long i;
    public final float[] j;
    public final float[] k;
    public final float[] l;
    public final float[] m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public final float[] q;
    public final int[] r;
    public final boolean[] s;
    public final Random t;
    public long u;
    public float v;
    public float w;
    public final Path x;
    public final RectF y;
    public final float[] z;

    public s0() {
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Matrix();
        this.f = new Paint(1);
        this.g = new RectF();
        this.h = true;
        this.i = SystemClock.uptimeMillis();
        this.j = new float[ks.W1];
        this.k = new float[ks.W1];
        this.l = new float[ks.W1];
        this.m = new float[ks.W1];
        this.n = new float[ks.W1];
        this.o = new float[ks.W1];
        this.p = new float[ks.W1];
        this.q = new float[ks.W1];
        this.r = new int[ks.W1];
        this.s = new boolean[ks.W1];
        this.t = new Random();
        this.x = new Path();
        this.y = new RectF();
        this.z = new float[]{0.08f, 0.73f, 0.76f, 0.1f, 0.74f, 0.52f, 0.19f, 0.6f, 0.93f, 0.72f, 0.98f, 0.9f};
        this.A = new int[]{-15420490, -14699385, -13787165};
        this.B = new int[7];
        this.C = -1.0f;
        this.E = 1.0f;
        this.F = 1.0f;
        this.G = 1.0f;
        this.I = new float[ks.W1];
        this.J = new float[ks.W1];
        this.K = new float[ks.W1];
        this.L = new float[ks.W1];
        this.M = new float[ks.W1];
        this.N = new float[ks.W1];
        this.O = new float[ks.W1];
        this.P = new float[ks.W1];
        this.Q = new int[ks.W1];
        this.R = new boolean[ks.W1];
        this.S = new boolean[ks.W1];
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                r0.c();
                RuntimeShader a10 = r0.a();
                this.b = a10;
                paint.setShader(a10);
            } catch (Throwable unused) {
                this.b = null;
            }
        }
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.d.setStyle(style);
    }

    public static boolean c(int i7) {
        return org.telegram.messenger.g0.B(i7) < 0.5f;
    }

    public static int d(int i7) {
        if (U == 0.0f) {
            return i7;
        }
        float[] fArr = {(((U + 205.0f) % 360.0f) + 360.0f) % 360.0f, 0.0f, 0.0f};
        Color.colorToHSV(i7, fArr);
        return Color.HSVToColor(Color.alpha(i7), fArr);
    }

    public static int e(int i7) {
        if (U == 0.0f) {
            return i7;
        }
        float[] fArr = new float[3];
        Color.colorToHSV(i7, fArr);
        fArr[0] = (((fArr[0] + U) % 360.0f) + 360.0f) % 360.0f;
        return Color.HSVToColor(Color.alpha(i7), fArr);
    }

    public static void h(int i7) {
        float f10 = 0.0f;
        if (i7 != 0) {
            float[] fArr = new float[3];
            Color.colorToHSV(i7 | (-16777216), fArr);
            if (fArr[1] >= 0.25f && fArr[2] >= 0.25f) {
                float f11 = fArr[0] - 205.0f;
                while (f11 > 180.0f) {
                    f11 -= 360.0f;
                }
                while (f11 < -180.0f) {
                    f11 += 360.0f;
                }
                if (Math.abs(f11) >= 12.0f) {
                    f10 = f11;
                }
            }
        }
        U = f10;
    }

    public static int[] k(boolean z10) {
        if (U == 0.0f) {
            return null;
        }
        int[] iArr = z10 ? (int[]) vu0.T.clone() : (int[]) vu0.U.clone();
        for (int i7 = 0; i7 < iArr.length; i7++) {
            iArr[i7] = e(iArr[i7]);
        }
        return iArr;
    }

    public final int a(float f10, float f11, RectF rectF) {
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        if (rectF == null || rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            return 0;
        }
        float uptimeMillis = (((SystemClock.uptimeMillis() - this.i) % 3600000) / 1000.0f) * (this.h ? 1.0f : t0.c(8));
        float atan2 = (float) Math.atan2((f11 - rectF.centerY()) / Math.max(rectF.height() / 2.0f, 1.0f), (f10 - rectF.centerX()) / Math.max(rectF.width() / 2.0f, 1.0f));
        float max = (f10 - rectF.left) / Math.max(rectF.height(), 1.0f);
        if (this.h) {
            f18 = 0.12f;
            f19 = 0.22f;
            f20 = 0.33f;
            f15 = 1.0f;
            f14 = 0.86f;
            f16 = 0.43f;
            f12 = 0.4f;
            f17 = 1.0f;
            f13 = 1.0f;
        } else {
            float[] fArr = this.z;
            float f21 = fArr[0];
            f12 = fArr[1];
            f13 = fArr[2];
            float f22 = fArr[3];
            f14 = fArr[4];
            f15 = fArr[5];
            f16 = fArr[6];
            float f23 = fArr[7];
            f17 = fArr[8];
            f18 = f21;
            f19 = f22;
            f20 = f23;
        }
        float sin = (((float) Math.sin((0.9f * uptimeMillis) + atan2)) * 0.5f) + 0.5f;
        float sin2 = (((float) Math.sin((1.3f * max) + ((atan2 * 2.0f) - (uptimeMillis * 0.6f)))) * 0.5f) + 0.5f;
        float z10 = com.google.android.gms.internal.vision.e2.z(f19, f18, sin, f18);
        float z11 = com.google.android.gms.internal.vision.e2.z(f14, f12, sin, f12);
        float z12 = com.google.android.gms.internal.vision.e2.z(f15, f13, sin, f13);
        int rgb = Color.rgb(Math.round(Math.min(1.0f, com.google.android.gms.internal.vision.e2.z(f16, z10, sin2, z10)) * 255.0f), Math.round(Math.min(1.0f, com.google.android.gms.internal.vision.e2.z(f20, z11, sin2, z11)) * 255.0f), Math.round(Math.min(1.0f, com.google.android.gms.internal.vision.e2.z(f17, z12, sin2, z12)) * 255.0f));
        return this.h ? e(rgb) : rgb;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x06c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(float f10, float f11, float f12, float f13, Canvas canvas, RectF rectF) {
        float f14;
        Canvas canvas2;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        Canvas canvas3;
        float f22;
        float f23;
        float f24;
        boolean equals;
        boolean z10;
        float f25;
        int i7;
        int i10;
        int i11;
        int i12;
        float[] fArr;
        float[] fArr2;
        int[] iArr;
        boolean[] zArr;
        float f26;
        float f27;
        float f28;
        double d;
        int i13;
        float sin;
        float f29;
        float f30;
        float f31;
        boolean z11;
        boolean z12;
        float f32;
        float f33;
        float h;
        float f34;
        int i14;
        float f35;
        float f36;
        if (f11 <= 0.001f || rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            this.u = 0L;
            return;
        }
        float uptimeMillis = (((SystemClock.uptimeMillis() - this.i) % 3600000) / 1000.0f) * (this.h ? 1.0f : t0.c(8));
        float max = (Math.max(0.0f, Math.min(1.0f, f13)) * (this.h ? org.telegram.messenger.g0.L(4.0f) : org.telegram.messenger.g0.L(10.0f))) + org.telegram.messenger.g0.L(26.0f);
        float f37 = 0.45f;
        float f38 = 0.7f;
        int i15 = 1;
        int i16 = 3;
        Object obj = this.b;
        if (obj == null) {
            f14 = 4.0f;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                RuntimeShader runtimeShader = (RuntimeShader) obj;
                f20 = 12.0f;
                runtimeShader.setFloatUniform("uSize", rectF.width(), rectF.height());
                runtimeShader.setFloatUniform("uOrigin", rectF.left, rectF.top);
                runtimeShader.setFloatUniform("uRadius", Math.min(f10, rectF.height() / 2.0f));
                runtimeShader.setFloatUniform("uTime", uptimeMillis);
                runtimeShader.setFloatUniform("uIntensity", f11);
                runtimeShader.setFloatUniform("uSweep", f12);
                runtimeShader.setFloatUniform("uDark", this.h ? 1.0f : 0.0f);
                float C = a8.p0.C(rectF.height() - org.telegram.messenger.g0.L(52.0f), org.telegram.messenger.g0.L(70.0f) - org.telegram.messenger.g0.L(52.0f), 1.0f, 0.0f);
                runtimeShader.setFloatUniform("uHue", U / 360.0f);
                runtimeShader.setFloatUniform("uNStroke", this.E);
                runtimeShader.setFloatUniform("uNGlow", this.F);
                runtimeShader.setFloatUniform("uNSat", this.G);
                runtimeShader.setFloatUniform("uThin", 1.0f - ((3.0f - (C * 2.0f)) * (C * C)));
                runtimeShader.setFloatUniform("uHalo", max);
                runtimeShader.setFloatUniform("uDp", org.telegram.messenger.g0.p);
                runtimeShader.setFloatUniform("uLevel", f13);
                runtimeShader.setFloatUniform("uPulse", this.C);
                runtimeShader.setFloatUniform("uPulseAng", this.D);
                float[] fArr3 = this.z;
                runtimeShader.setFloatUniform("uL0", fArr3[0], fArr3[1], fArr3[2]);
                runtimeShader.setFloatUniform("uL1", fArr3[3], fArr3[4], fArr3[5]);
                runtimeShader.setFloatUniform("uL2", fArr3[6], fArr3[7], fArr3[8]);
                runtimeShader.setFloatUniform("uLHi", fArr3[9], fArr3[10], fArr3[11]);
                runtimeShader.setFloatUniform("uHaloW", t0.c(3));
                runtimeShader.setFloatUniform("uHaloS", t0.c(4));
                runtimeShader.setFloatUniform("uLift", t0.c(5));
                runtimeShader.setFloatUniform("uRimW", t0.c(6));
                runtimeShader.setFloatUniform("uRimB", t0.c(7));
                int[] iArr2 = this.B;
                runtimeShader.setFloatUniform("uRim", Color.red(iArr2[4]) / 255.0f, Color.green(iArr2[4]) / 255.0f, Color.blue(iArr2[4]) / 255.0f);
                BlendMode blendMode = this.h ? BlendMode.PLUS : BlendMode.SRC_OVER;
                Paint paint = this.a;
                paint.setBlendMode(blendMode);
                f16 = 3.0f;
                f17 = 0.0f;
                f15 = 1.0f;
                f18 = 0.9f;
                f19 = 0.8f;
                f14 = 4.0f;
                canvas.drawRect(rectF.left - max, rectF.top - max, rectF.right + max, rectF.bottom + max, paint);
                canvas2 = canvas;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                float f39 = f15;
                float min = this.u != 0 ? 0.016f : Math.min(0.05f, (uptimeMillis2 - r5) / 1000.0f);
                this.u = uptimeMillis2;
                Random random = this.t;
                if (f11 <= 0.3f) {
                    float f40 = f18;
                    float f41 = 0.35f;
                    if (f12 >= f17 && f12 > 0.05f && f12 < 0.95f) {
                        float f42 = 0.3f;
                        this.v = (95.0f * min) + this.v;
                        while (true) {
                            float f43 = this.v;
                            if (f43 < f39) {
                                break;
                            }
                            this.v = f43 - f39;
                            float z13 = com.google.android.gms.internal.vision.e2.z(rectF.height(), org.telegram.messenger.g0.L(8.0f), random.nextFloat(), rectF.top + org.telegram.messenger.g0.L(f14));
                            float width = ((((rectF.width() * ((1.7f * f12) - 0.35f)) + rectF.left) - ((z13 - rectF.centerY()) * f40)) - (random.nextFloat() * org.telegram.messenger.g0.L(70.0f))) + org.telegram.messenger.g0.L(f20);
                            float L = org.telegram.messenger.g0.L((random.nextFloat() * 6.0f) + 2.0f);
                            j(width, z13, (random.nextFloat() - f42) * L, L * (random.nextFloat() - 0.5f), org.telegram.ui.Cells.c0.h(random, f37, f41), org.telegram.ui.Cells.c0.h(random, f37, 0.32f));
                            canvas2 = canvas;
                            min = min;
                            f41 = 0.35f;
                            f37 = 0.45f;
                            f42 = 0.3f;
                        }
                    }
                    float f44 = min;
                    canvas3 = canvas2;
                    f24 = 6.0f;
                    float f45 = this.C;
                    if (f45 >= f17) {
                        this.H = (32.0f * f44 * ((float) Math.sin(f45 * 3.141592653589793d))) + this.H;
                        while (true) {
                            float f46 = this.H;
                            if (f46 < f39) {
                                break;
                            }
                            this.H = f46 - f39;
                            double nextFloat = ((this.C * 3.77f) + this.D) - (random.nextFloat() * 0.5f);
                            float cos = (float) Math.cos(nextFloat);
                            float sin2 = (float) Math.sin(nextFloat);
                            float max2 = f39 / Math.max(Math.abs(cos), Math.abs(sin2));
                            float width2 = ((rectF.width() * (cos * max2)) / 2.0f) + rectF.centerX();
                            float height = ((rectF.height() * (max2 * sin2)) / 2.0f) + rectF.centerY();
                            float max3 = Math.max(rectF.left + org.telegram.messenger.g0.L(6.0f), Math.min(rectF.right - org.telegram.messenger.g0.L(6.0f), width2));
                            float max4 = Math.max(rectF.top + org.telegram.messenger.g0.L(f39), Math.min(rectF.bottom - org.telegram.messenger.g0.L(f39), height));
                            float L2 = org.telegram.messenger.g0.L((random.nextFloat() * 8.0f) + f14);
                            j(max3, max4, com.google.android.gms.internal.vision.e2.B(sin2, f19, cos * 0.6f, L2), com.google.android.gms.internal.vision.e2.C(cos, f19, sin2 * 0.6f, L2), org.telegram.ui.Cells.c0.h(random, 0.3f, 0.4f), org.telegram.ui.Cells.c0.h(random, 0.35f, 0.3f));
                        }
                    }
                    f22 = 0.3f;
                    f23 = 0.4f;
                    this.w = (((random.nextFloat() * f19) + 0.6f) * f44 * (f12 >= f17 ? 2.0f : (f13 * f16) + 3.6f)) + this.w;
                    while (true) {
                        float f47 = this.w;
                        if (f47 < f39) {
                            break;
                        }
                        this.w = f47 - f39;
                        float width3 = rectF.width();
                        float height2 = rectF.height();
                        float nextFloat2 = random.nextFloat() * (width3 + height2) * 2.0f;
                        float nextFloat3 = (random.nextFloat() * org.telegram.messenger.g0.L(f14)) + org.telegram.messenger.g0.L(f39);
                        if (nextFloat2 < width3) {
                            f35 = rectF.left + nextFloat2;
                            f36 = rectF.top + nextFloat3;
                        } else {
                            float f48 = nextFloat2 - width3;
                            if (f48 < height2) {
                                f35 = rectF.right - nextFloat3;
                                f36 = rectF.top + f48;
                            } else {
                                float f49 = f48 - height2;
                                if (f49 < width3) {
                                    f35 = rectF.right - f49;
                                    f36 = rectF.bottom - nextFloat3;
                                } else {
                                    float f50 = f49 - width3;
                                    f35 = rectF.left + nextFloat3;
                                    f36 = rectF.bottom - f50;
                                }
                            }
                        }
                        float max5 = Math.max(rectF.left + org.telegram.messenger.g0.L(10.0f), Math.min(rectF.right - org.telegram.messenger.g0.L(10.0f), f35));
                        float max6 = Math.max(rectF.top + org.telegram.messenger.g0.L(2.0f), Math.min(rectF.bottom - org.telegram.messenger.g0.L(2.0f), f36));
                        float L3 = org.telegram.messenger.g0.L((random.nextFloat() * 3.5f) + 1.5f);
                        double nextFloat4 = random.nextFloat() * 3.141592653589793d * 2.0d;
                        j(max5, max6, ((float) Math.cos(nextFloat4)) * L3, (((float) Math.sin(nextFloat4)) * L3) - org.telegram.messenger.g0.L(f39), org.telegram.ui.Cells.c0.h(random, 1.1f, f40), org.telegram.ui.Cells.c0.h(random, 0.38f, 0.3f));
                        f19 = f19;
                        f44 = f44;
                    }
                    f21 = f44;
                } else {
                    f21 = min;
                    canvas3 = canvas2;
                    f22 = 0.3f;
                    f23 = 0.4f;
                    f24 = 6.0f;
                }
                float f51 = f19;
                RectF rectF2 = this.y;
                equals = rectF2.equals(rectF);
                Path path = this.x;
                if (!equals) {
                    rectF2.set(rectF);
                    path.rewind();
                    path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                }
                z10 = this.h;
                int[] iArr3 = this.A;
                Paint paint2 = this.f;
                if (z10) {
                    float[] fArr4 = this.P;
                    f25 = 0.02f;
                    float[] fArr5 = this.O;
                    int[] iArr4 = this.Q;
                    float f52 = f22;
                    float[] fArr6 = this.L;
                    float[] fArr7 = this.K;
                    boolean[] zArr2 = this.R;
                    float[] fArr8 = this.N;
                    float[] fArr9 = this.J;
                    float[] fArr10 = this.I;
                    boolean[] zArr3 = this.S;
                    float[] fArr11 = this.M;
                    if (f11 > 0.3f) {
                        fArr = fArr11;
                        fArr2 = fArr5;
                        iArr = iArr4;
                        zArr = zArr2;
                        float f53 = f21;
                        this.T = org.telegram.ui.Cells.c0.g(f13, 55.0f, 30.0f, f53, this.T);
                        while (true) {
                            float f54 = this.T;
                            if (f54 < f39) {
                                break;
                            }
                            this.T = f54 - f39;
                            int i17 = 0;
                            while (true) {
                                if (i17 >= 140) {
                                    i17 = -1;
                                    break;
                                } else if (!zArr[i17]) {
                                    break;
                                } else {
                                    i17++;
                                }
                            }
                            if (i17 < 0) {
                                f28 = f53;
                                i14 = i16;
                                f34 = f24;
                            } else {
                                float min2 = Math.min(f10, rectF.height() / 2.0f);
                                float max7 = Math.max(f17, rectF.width() - (min2 * 2.0f));
                                f28 = f53;
                                float nextFloat5 = random.nextFloat() * ((max7 * 2.0f) + ((float) (min2 * 6.283185307179586d)));
                                if (nextFloat5 < max7) {
                                    f29 = rectF.left + min2 + nextFloat5;
                                    f30 = rectF.top;
                                    sin = -1.0f;
                                    i13 = i17;
                                } else {
                                    float f55 = nextFloat5 - max7;
                                    if (f55 < max7) {
                                        f29 = (rectF.right - min2) - f55;
                                        f30 = rectF.bottom;
                                        i13 = i17;
                                        sin = f39;
                                    } else {
                                        double d2 = (f55 - max7) / min2;
                                        boolean z14 = d2 < 3.141592653589793d;
                                        if (z14) {
                                            d = -1.5707963267948966d;
                                        } else {
                                            d = 1.5707963267948966d;
                                            d2 -= 3.141592653589793d;
                                        }
                                        double d10 = d2 + d;
                                        float f56 = z14 ? rectF.right - min2 : rectF.left + min2;
                                        float centerY = rectF.centerY();
                                        i13 = i17;
                                        float cos2 = (float) Math.cos(d10);
                                        sin = (float) Math.sin(d10);
                                        f29 = (cos2 * min2) + f56;
                                        f30 = (sin * min2) + centerY;
                                        f31 = cos2;
                                        z11 = random.nextFloat() >= f52;
                                        if (z11) {
                                            z12 = z11;
                                            f32 = f30;
                                            f33 = f24;
                                            h = org.telegram.ui.Cells.c0.h(random, f20, f33);
                                        } else {
                                            float f57 = f16;
                                            f32 = f30;
                                            z12 = z11;
                                            h = org.telegram.ui.Cells.c0.h(random, f14, f57);
                                            f33 = f24;
                                        }
                                        float L4 = org.telegram.messenger.g0.L(h);
                                        f34 = f33;
                                        float nextFloat6 = (random.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(f34);
                                        fArr10[i13] = f29;
                                        fArr9[i13] = f32;
                                        float f58 = -sin;
                                        fArr7[i13] = (f58 * nextFloat6) + ((!z12 ? -f31 : f31) * L4);
                                        if (z12) {
                                            sin = f58;
                                        }
                                        fArr6[i13] = (f31 * nextFloat6) + (sin * L4);
                                        f17 = 0.0f;
                                        fArr[i13] = 0.0f;
                                        fArr8[i13] = org.telegram.ui.Cells.c0.h(random, 1.2f, 1.1f);
                                        fArr2[i13] = org.telegram.messenger.g0.N((random.nextFloat() * 0.6f) + 0.55f);
                                        fArr4[i13] = random.nextFloat() * 6.28f;
                                        i14 = i16;
                                        iArr[i13] = random.nextInt(i14);
                                        zArr3[i13] = z12;
                                        zArr[i13] = true;
                                    }
                                }
                                f31 = 0.0f;
                                if (random.nextFloat() >= f52) {
                                }
                                if (z11) {
                                }
                                float L42 = org.telegram.messenger.g0.L(h);
                                f34 = f33;
                                float nextFloat62 = (random.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(f34);
                                fArr10[i13] = f29;
                                fArr9[i13] = f32;
                                float f582 = -sin;
                                fArr7[i13] = (f582 * nextFloat62) + ((!z12 ? -f31 : f31) * L42);
                                if (z12) {
                                }
                                fArr6[i13] = (f31 * nextFloat62) + (sin * L42);
                                f17 = 0.0f;
                                fArr[i13] = 0.0f;
                                fArr8[i13] = org.telegram.ui.Cells.c0.h(random, 1.2f, 1.1f);
                                fArr2[i13] = org.telegram.messenger.g0.N((random.nextFloat() * 0.6f) + 0.55f);
                                fArr4[i13] = random.nextFloat() * 6.28f;
                                i14 = i16;
                                iArr[i13] = random.nextInt(i14);
                                zArr3[i13] = z12;
                                zArr[i13] = true;
                            }
                            i16 = i14;
                            f53 = f28;
                            f24 = f34;
                            f16 = 3.0f;
                            f14 = 4.0f;
                            f20 = 12.0f;
                        }
                        f21 = f53;
                    } else {
                        fArr = fArr11;
                        fArr2 = fArr5;
                        iArr = iArr4;
                        zArr = zArr2;
                    }
                    int i18 = 0;
                    int i19 = 2;
                    while (i18 < i19) {
                        int i20 = i15;
                        if (i18 == i20) {
                            canvas3.save();
                            canvas3.clipPath(path);
                        }
                        int i21 = 0;
                        while (i21 < 140) {
                            if (zArr[i21]) {
                                if (zArr3[i21] == (i18 == i20)) {
                                    if (i18 == 0) {
                                        float f59 = fArr[i21] + f21;
                                        fArr[i21] = f59;
                                        if (f59 >= fArr8[i21]) {
                                            zArr[i21] = false;
                                        } else {
                                            fArr10[i21] = (fArr7[i21] * f21) + fArr10[i21];
                                            fArr9[i21] = (fArr6[i21] * f21) + fArr9[i21];
                                            float f60 = f39 - (f21 * 0.6f);
                                            fArr7[i21] = fArr7[i21] * f60;
                                            fArr6[i21] = fArr6[i21] * f60;
                                        }
                                    }
                                    float f61 = fArr[i21] / fArr8[i21];
                                    float f62 = f39;
                                    float min3 = Math.min(f62, f61 / 0.15f);
                                    float f63 = f62 - f61;
                                    f26 = f38;
                                    f27 = f52;
                                    float B = com.google.android.gms.internal.vision.e2.B((float) Math.sin((fArr[i21] * 9.0f) + fArr4[i21]), f27, f26, com.google.android.gms.internal.vision.e2.D(min3, f63, f63, f11));
                                    if (B > 0.02f) {
                                        paint2.setColor(zArr3[i21] ? i0.a.f(f27, iArr3[iArr[i21]], -1) : i0.a.f(0.82f, iArr3[iArr[i21]], -1));
                                        paint2.setAlpha((int) (Math.min(1.0f, B * (zArr3[i21] ? f51 : 1.0f)) * 255.0f));
                                        canvas3.drawCircle(fArr10[i21], fArr9[i21], fArr2[i21], paint2);
                                        i21++;
                                        f38 = f26;
                                        f52 = f27;
                                        i20 = 1;
                                        f39 = 1.0f;
                                    }
                                    i21++;
                                    f38 = f26;
                                    f52 = f27;
                                    i20 = 1;
                                    f39 = 1.0f;
                                }
                            }
                            f26 = f38;
                            f27 = f52;
                            i21++;
                            f38 = f26;
                            f52 = f27;
                            i20 = 1;
                            f39 = 1.0f;
                        }
                        float f64 = f38;
                        float f65 = f52;
                        if (i18 == i20) {
                            canvas3.restore();
                        }
                        i18++;
                        f38 = f64;
                        f52 = f65;
                        i19 = 2;
                        i15 = 1;
                        f39 = 1.0f;
                    }
                    i7 = -1;
                    for (int i22 = 0; i22 < 140; i22++) {
                        if (zArr[i22] && zArr3[i22]) {
                            float f66 = fArr[i22] + f21;
                            fArr[i22] = f66;
                            if (f66 >= fArr8[i22]) {
                                zArr[i22] = false;
                            } else {
                                fArr10[i22] = (fArr7[i22] * f21) + fArr10[i22];
                                fArr9[i22] = (fArr6[i22] * f21) + fArr9[i22];
                                float f67 = 1.0f - (f21 * 0.6f);
                                fArr7[i22] = fArr7[i22] * f67;
                                fArr6[i22] = fArr6[i22] * f67;
                            }
                        }
                    }
                } else {
                    f25 = 0.02f;
                    i7 = -1;
                }
                canvas3.save();
                canvas3.clipPath(path);
                for (i10 = 0; i10 < 140; i10++) {
                    boolean[] zArr4 = this.s;
                    if (zArr4[i10]) {
                        float[] fArr12 = this.o;
                        float f68 = fArr12[i10] + f21;
                        fArr12[i10] = f68;
                        float[] fArr13 = this.n;
                        if (f68 >= fArr13[i10]) {
                            zArr4[i10] = false;
                        } else {
                            float[] fArr14 = this.j;
                            float f69 = fArr14[i10];
                            float[] fArr15 = this.l;
                            fArr14[i10] = (fArr15[i10] * f21) + f69;
                            float[] fArr16 = this.k;
                            float f70 = fArr16[i10];
                            float[] fArr17 = this.m;
                            fArr16[i10] = (fArr17[i10] * f21) + f70;
                            float f71 = 1.0f - (f21 * f51);
                            fArr15[i10] = fArr15[i10] * f71;
                            fArr17[i10] = fArr17[i10] * f71;
                            float f72 = fArr12[i10] / fArr13[i10];
                            float sin3 = ((((float) Math.sin((fArr12[i10] * 14.0f) + this.q[i10])) * f23) + 0.6f) * com.google.android.gms.internal.vision.e2.C(f72, f72, 1.0f, Math.min(1.0f, f72 / 0.12f)) * f11;
                            if (sin3 > f25) {
                                boolean z15 = this.h;
                                int[] iArr5 = this.r;
                                if (z15) {
                                    int i23 = iArr5[i10];
                                    i11 = e(i23 == 0 ? i7 : i23 == 1 ? -4200705 : -2964225);
                                    i12 = e(iArr5[i10] == 2 ? -6652929 : -9455873);
                                } else {
                                    i11 = iArr3[iArr5[i10]];
                                    i12 = -6295334;
                                }
                                paint2.setColor(i12);
                                paint2.setAlpha((int) (sin3 * 255.0f * (this.h ? 0.22f : 0.18f)));
                                float f73 = fArr14[i10];
                                float f74 = fArr16[i10];
                                float[] fArr18 = this.p;
                                canvas3.drawCircle(f73, f74, fArr18[i10] * 2.4f, paint2);
                                paint2.setColor(i11);
                                paint2.setAlpha((int) (Math.min(1.0f, sin3 * (this.h ? 1.0f : 0.85f)) * 255.0f));
                                canvas3.drawCircle(fArr14[i10], fArr16[i10], fArr18[i10], paint2);
                            }
                        }
                    }
                }
                canvas3.restore();
            }
            f14 = 4.0f;
        }
        canvas2 = canvas;
        f15 = 1.0f;
        f16 = 3.0f;
        f17 = 0.0f;
        f18 = 0.9f;
        f19 = 0.8f;
        f20 = 12.0f;
        int e10 = this.h ? e(-14717953) : -13712186;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, rectF.width(), 0.0f, new int[]{e10, this.h ? e(-13051649) : -12793440, this.h ? e(-9546241) : -11553808, e10}, (float[]) null, Shader.TileMode.MIRROR);
        Matrix matrix = this.e;
        matrix.reset();
        matrix.postRotate(uptimeMillis * 40.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
        matrix.postTranslate(rectF.left, rectF.top);
        linearGradient.setLocalMatrix(matrix);
        Paint paint3 = this.c;
        paint3.setShader(linearGradient);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(10.0f));
        paint3.setMaskFilter(new BlurMaskFilter(org.telegram.messenger.g0.L(12.0f), BlurMaskFilter.Blur.NORMAL));
        paint3.setAlpha((int) (Math.min(1.0f, ((0.2f * f13) + 0.8f) * (this.h ? this.F * 0.7f : 0.45f) * f11) * 255.0f));
        canvas2.drawRoundRect(rectF, f10, f10, paint3);
        Paint paint4 = this.d;
        paint4.setShader(linearGradient);
        paint4.setStrokeWidth(org.telegram.messenger.g0.L(1.3f));
        paint4.setAlpha((int) (Math.min(1.0f, f11 * 0.9f * (this.h ? this.E : 1.0f)) * 255.0f));
        RectF rectF3 = this.g;
        rectF3.set(rectF);
        rectF3.inset(org.telegram.messenger.g0.L(0.6f), org.telegram.messenger.g0.L(0.6f));
        canvas2.drawRoundRect(rectF3, f10, f10, paint4);
        long uptimeMillis22 = SystemClock.uptimeMillis();
        float f392 = f15;
        if (this.u != 0) {
        }
        this.u = uptimeMillis22;
        Random random2 = this.t;
        if (f11 <= 0.3f) {
        }
        float f512 = f19;
        RectF rectF22 = this.y;
        equals = rectF22.equals(rectF);
        Path path2 = this.x;
        if (!equals) {
        }
        z10 = this.h;
        int[] iArr32 = this.A;
        Paint paint22 = this.f;
        if (z10) {
        }
        canvas3.save();
        canvas3.clipPath(path2);
        while (i10 < 140) {
        }
        canvas3.restore();
    }

    public final void f() {
        for (int i7 = 0; i7 < 140; i7++) {
            this.R[i7] = false;
        }
        for (int i10 = 0; i10 < 140; i10++) {
            this.s[i10] = false;
        }
    }

    public final void g(int i7, int i10) {
        char c10;
        char c11;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        t0.f();
        float[] fArr = t0.f;
        float f16 = fArr[2];
        float f17 = fArr[1];
        float[] i11 = t0.i(i7);
        float f18 = i11[0];
        float h = t0.h(i7);
        float h7 = t0.h(i10);
        boolean z10 = ((float) Math.hypot((double) i11[1], (double) i11[2])) < 0.035f;
        int i12 = t0.e;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    c10 = 1;
                    f14 = 30.0f;
                    f15 = 350.0f;
                    f12 = 60.0f;
                } else if (i12 != 4) {
                    float f19 = fArr[9];
                    float f20 = z10 ? h7 : h;
                    float f21 = f20 - (0.7f * f19);
                    float f22 = (f19 * 0.6f) + f20;
                    f14 = t0.d(f20);
                    f15 = t0.d(f21);
                    f12 = t0.d(f22);
                    c10 = 1;
                    f16 = n10.A(f18, 0.16f, 0.95f, f16);
                } else {
                    c10 = 1;
                    f15 = h7 - 28.0f;
                    f12 = h7 + 28.0f;
                    c11 = 4;
                    f10 = h7;
                    f11 = f15;
                }
                c11 = 4;
            } else {
                c10 = 1;
                f14 = 160.0f;
                f15 = 285.0f;
                c11 = 4;
                f12 = 205.0f;
            }
            f10 = f14;
            f11 = f15;
        } else {
            c10 = 1;
            c11 = 4;
            f10 = 230.0f;
            f11 = 200.0f;
            f12 = 255.0f;
        }
        int a10 = t0.a(f16, f17, f10);
        int[] iArr = this.B;
        iArr[0] = a10;
        iArr[c10] = t0.a(f16, f17, f11);
        iArr[2] = t0.a(f16, f17, f12);
        iArr[3] = t0.g(Math.min(0.98f, f16 + 0.12f), 0.5f * f17, f10);
        if (t0.e != 0) {
            f13 = Math.min(0.62f, f16 - 0.1f);
        } else {
            f17 = 0.2f;
            f13 = 0.55f;
            if (!z10) {
                int i13 = t0.c;
                if (i13 == 0) {
                    f10 = fArr[0] + h;
                } else if (i13 != 2) {
                    f13 = Math.max(0.42f, Math.min(0.58f, f18 - 0.12f));
                    f17 = 0.24f;
                    f10 = h;
                }
            }
            f10 = h7;
        }
        iArr[c11] = t0.g(f13, f17, f10);
        float max = Math.max(205.0f, Math.min(235.0f, ((((((h - h7) % 360.0f) + 540.0f) % 360.0f) - 180.0f) * fArr[10]) + h7));
        iArr[5] = t0.g(0.62f, 0.16f, max - 12.0f);
        iArr[6] = t0.g(0.58f, 0.18f, max + 4.0f);
        int i14 = 0;
        while (true) {
            float[] fArr2 = this.z;
            if (i14 >= 3) {
                fArr2[9] = Color.red(iArr[3]) / 255.0f;
                fArr2[10] = Color.green(iArr[3]) / 255.0f;
                fArr2[11] = Color.blue(iArr[3]) / 255.0f;
                return;
            } else {
                int i15 = i14 * 3;
                fArr2[i15] = Color.red(iArr[i14]) / 255.0f;
                fArr2[i15 + 1] = Color.green(iArr[i14]) / 255.0f;
                fArr2[i15 + 2] = Color.blue(iArr[i14]) / 255.0f;
                this.A[i14] = iArr[i14];
                i14++;
            }
        }
    }

    public final void i() {
        this.E = 0.7f;
        this.F = 0.6f;
        this.G = 0.85f;
    }

    public final void j(float f10, float f11, float f12, float f13, float f14, float f15) {
        float[] fArr;
        float[] fArr2;
        boolean[] zArr;
        int i7 = 0;
        float f16 = -1.0f;
        int i10 = 0;
        while (true) {
            fArr = this.n;
            fArr2 = this.o;
            zArr = this.s;
            if (i7 >= 140) {
                i7 = i10;
                break;
            } else {
                if (!zArr[i7]) {
                    break;
                }
                float f17 = fArr2[i7] / fArr[i7];
                if (f17 > f16) {
                    i10 = i7;
                    f16 = f17;
                }
                i7++;
            }
        }
        this.j[i7] = f10;
        this.k[i7] = f11;
        this.l[i7] = f12;
        this.m[i7] = f13;
        fArr[i7] = f14;
        fArr2[i7] = 0.0f;
        this.p[i7] = org.telegram.messenger.g0.L(f15);
        Random random = this.t;
        this.q[i7] = random.nextFloat() * 6.28f;
        this.r[i7] = random.nextInt(3);
        zArr[i7] = true;
    }
}
