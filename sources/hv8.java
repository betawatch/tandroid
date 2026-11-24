// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import java.util.HashMap;
import java.util.Random;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hv8 {
    public static final float S;
    public static final float T;
    public static Bitmap U;
    public long A;
    public float B;
    public float C;
    public long E;
    public boolean F;
    public boolean G;
    public Bitmap H;
    public Bitmap J;
    public float[] L;
    public float[] M;
    public float[] N;
    public float[] O;
    public int[] P;
    public int[] Q;
    public short[] R;
    public int l;
    public gv8 m;
    public gv8 n;
    public long p;
    public boolean[] s;
    public PorterDuffColorFilter z;
    public final float[] a = new float[2400];
    public final float[] b = new float[2400];
    public final float[] c = new float[2400];
    public final float[] d = new float[2400];
    public final float[] e = new float[2400];
    public final float[] f = new float[2400];
    public final float[] g = new float[2400];
    public final float[] h = new float[2400];
    public final float[] i = new float[2400];
    public final float[] j = new float[2400];
    public final byte[] k = new byte[2400];
    public float o = 1.0f;
    public int q = 0;
    public final RectF r = new RectF();
    public final Paint t = new Paint(3);
    public final Paint u = new Paint(1);
    public final Rect v = new Rect();
    public final RectF w = new RectF();
    public final Random x = new Random();
    public int y = -16777216;
    public float D = -1.0f;
    public final Paint I = new Paint(3);
    public final Paint K = new Paint(3);

    static {
        float f;
        float f2;
        int i = 0;
        int i2 = 0;
        while (true) {
            f = 0.5f;
            if (i2 > 1000) {
                break;
            }
            float f3 = i2 / 1000.0f;
            if (p(f3 * 0.467f) >= 0.5f) {
                f = f3;
                break;
            }
            i2++;
        }
        while (true) {
            f2 = 0.8f;
            if (i > 1000) {
                break;
            }
            float f4 = i / 1000.0f;
            if (p(f4 * 0.467f) >= 0.8f) {
                f2 = f4;
                break;
            }
            i++;
        }
        S = f;
        T = f2;
    }

    public static synchronized Bitmap b() {
        Bitmap bitmap;
        synchronized (hv8.class) {
            if (U == null) {
                U = Bitmap.createBitmap(384, 48, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(U);
                Paint paint = new Paint(1);
                paint.setColor(-1);
                RectF rectF = new RectF();
                for (int i = 0; i < 8; i++) {
                    rectF.set((i * 48) + 1.5f, 1.5f, (r7 + 48) - 1.5f, 46.5f);
                    float f = (1.0f - ((i * 0.7f) / 7.0f)) * 22.5f;
                    canvas.drawRoundRect(rectF, f, f, paint);
                }
            }
            bitmap = U;
        }
        return bitmap;
    }

    public static gv8 c(String str, int i, w34 w34Var, float f, ColorDrawable colorDrawable) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(n24.a, w34Var);
            hashMap.put(n24.c, 0);
            igb igbVar = new igb((byte) 0);
            if (colorDrawable != null) {
                igbVar.g = colorDrawable;
            }
            gv8 gv8Var = new gv8();
            Bitmap a = igbVar.a(str, i, i, hashMap, null, f, 0, -1);
            gv8Var.b = a.getWidth();
            int i2 = ((rj0) p24.b(str, w34Var, hashMap).f).b;
            gv8Var.e = i2;
            gv8Var.f = (gv8Var.b - 32.0f) / i2;
            int i3 = i2 * i2;
            gv8Var.g = new boolean[i3];
            gv8Var.h = new float[i3];
            Random random = new Random(str.hashCode());
            for (int i4 = 0; i4 < gv8Var.e; i4++) {
                for (int i5 = 0; i5 < gv8Var.e; i5++) {
                    float f2 = i5 + 0.5f;
                    float f3 = gv8Var.f;
                    int i6 = (int) ((f2 * f3) + 16.0f);
                    int v = (int) de9.v(i4, 0.5f, f3, 16.0f);
                    boolean z = false;
                    for (int i7 = -1; i7 <= 1 && !z; i7++) {
                        z = Color.alpha(a.getPixel(Math.max(0, Math.min(gv8Var.b - 1, ((int) ((((float) i7) * gv8Var.f) * 0.3f)) + i6)), v)) > 40;
                    }
                    boolean[] zArr = gv8Var.g;
                    int i8 = (gv8Var.e * i4) + i5;
                    zArr[i8] = z;
                    gv8Var.h[i8] = random.nextFloat();
                }
            }
            Bitmap b = b();
            int i9 = gv8Var.b;
            gv8Var.d = i9 + 2;
            gv8Var.a = Bitmap.createBitmap(Math.max(i9, b.getWidth()), gv8Var.d + b.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(gv8Var.a);
            canvas.drawBitmap(a, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(b, 0.0f, gv8Var.d, (Paint) null);
            a.recycle();
            gv8Var.a.prepareToDraw();
            Rect rect = gv8Var.c;
            int i10 = gv8Var.b;
            rect.set(0, 0, i10, i10);
            int i11 = igbVar.e;
            gv8Var.k = i11;
            int round = Math.round(i11 / gv8Var.f) + 2;
            int i12 = (gv8Var.e - round) / 2;
            gv8Var.i = i12;
            gv8Var.j = i12 + round;
            return gv8Var;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int d(float f) {
        return Math.max(0, Math.min(kk7.d4, Math.round(f * 255.0f)));
    }

    public static float h(gv8 gv8Var, float f) {
        float f2 = 1.0f - f;
        return de9.v(gv8Var.e, 6.0f, 1.0f - (((f2 * 0.45f) + 0.55f) * (f2 * f2)), -1.5f);
    }

    public static boolean i(gv8 gv8Var, int i, int i2) {
        if (i < 7 && i2 < 7) {
            return true;
        }
        int i3 = gv8Var.e;
        if (i < i3 - 7 || i2 >= 7) {
            return i < 7 && i2 >= i3 - 7;
        }
        return true;
    }

    public static float j(float f) {
        return f <= 0.0031308f ? f * 12.92f : (((float) Math.pow(f, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int k(float f, int i, int i2) {
        if (f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float q = q(Color.red(i) / 255.0f);
        float q2 = q(Color.green(i) / 255.0f);
        float q3 = q(Color.blue(i) / 255.0f);
        float q4 = q(Color.red(i2) / 255.0f);
        float q5 = q(Color.green(i2) / 255.0f);
        float q6 = q(Color.blue(i2) / 255.0f);
        float f2 = q3 * 0.051445995f;
        float cbrt = (float) Math.cbrt(f2 + (q2 * 0.53633255f) + (q * 0.41222146f));
        float f3 = q3 * 0.10739696f;
        float cbrt2 = (float) Math.cbrt(f3 + (q2 * 0.6806995f) + (q * 0.2119035f));
        float f4 = q3 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f4 + (q2 * 0.28171885f) + (q * 0.08830246f));
        float f5 = 0.051445995f * q6;
        float cbrt4 = (float) Math.cbrt(f5 + (0.53633255f * q5) + (0.41222146f * q4));
        float f6 = 0.10739696f * q6;
        float cbrt5 = (float) Math.cbrt(f6 + (0.6806995f * q5) + (0.2119035f * q4));
        float f7 = q6 * 0.6299787f;
        float cbrt6 = (float) Math.cbrt(f7 + (q5 * 0.28171885f) + (q4 * 0.08830246f));
        float A = tb4.A(cbrt4, cbrt, f, cbrt);
        float A2 = tb4.A(cbrt5, cbrt2, f, cbrt2);
        float A3 = tb4.A(cbrt6, cbrt3, f, cbrt3);
        float f8 = A * A * A;
        float f9 = A2 * A2 * A2;
        float f10 = A3 * A3 * A3;
        return Color.argb((int) (((Color.alpha(i2) - Color.alpha(i)) * f) + Color.alpha(i)), d(j((0.23096994f * f10) + ((4.0767417f * f8) - (3.3077116f * f9)))), d(j(((2.6097574f * f9) + ((-1.268438f) * f8)) - (0.34131938f * f10))), d(j((f10 * 1.7076147f) + ((f8 * (-0.0041960864f)) - (f9 * 0.7034186f)))));
    }

    public static float l(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f < 0.6f) {
            float f2 = 1.0f - (f / 0.6f);
            return (1.0f - ((f2 * f2) * f2)) * 1.08f;
        }
        float f3 = (f - 0.6f) / 0.4f;
        return 1.08f - ((3.0f - (f3 * 2.0f)) * ((0.08f * f3) * f3));
    }

    public static void m(gv8 gv8Var) {
        int i;
        int i2;
        if (gv8Var.m == null) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= gv8Var.e) {
                    break;
                }
                for (int i5 = 0; i5 < gv8Var.e; i5++) {
                    int i6 = gv8Var.i;
                    if (i5 < i6 || i5 >= (i2 = gv8Var.j) || i3 < i6 || i3 >= i2) {
                        i4++;
                    }
                }
                i3++;
            }
            gv8Var.l = i4;
            gv8Var.m = new float[i4];
            gv8Var.n = new float[i4];
            gv8Var.o = new float[i4];
            gv8Var.p = new boolean[i4];
            gv8Var.q = new int[i4 << 2];
            float f = 1.4142f * ((r4 - 1) / 2.0f);
            int i7 = 0;
            for (int i8 = 0; i8 < gv8Var.e; i8++) {
                int i9 = 0;
                while (true) {
                    int i10 = gv8Var.e;
                    if (i9 < i10) {
                        int i11 = gv8Var.i;
                        if (i9 < i11 || i9 >= (i = gv8Var.j) || i8 < i11 || i8 >= i) {
                            int i12 = (i10 * i8) + i9;
                            float hypot = ((float) Math.hypot(r8 - r2, r11 - r2)) / f;
                            float f2 = gv8Var.h[i12] * 3.17f;
                            float floor = f2 - ((float) Math.floor(f2));
                            boolean i13 = i(gv8Var, i9, i8);
                            float[] fArr = gv8Var.m;
                            float f3 = gv8Var.f;
                            fArr[i7] = ((i9 + 0.5f) * f3) + 16.0f;
                            gv8Var.n[i7] = de9.v(i8, 0.5f, f3, 16.0f);
                            float f4 = hypot * 0.5f;
                            gv8Var.o[i7] = i13 ? f4 * 0.85f : f4 + (floor * 0.06f);
                            gv8Var.p[i7] = gv8Var.g[i12];
                            int[] iArr = gv8Var.q;
                            int i14 = i7 << 2;
                            iArr[i14] = i9;
                            iArr[i14 + 1] = i8;
                            i7++;
                        }
                        i9++;
                    }
                }
            }
        }
    }

    public static void n(float[] fArr, float[] fArr2, int[] iArr, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i2) {
        int i3 = i << 3;
        fArr[i3] = f;
        int i4 = i3 + 1;
        fArr[i4] = f2;
        int i5 = i3 + 2;
        fArr[i5] = f3;
        int i6 = i3 + 3;
        fArr[i6] = f2;
        int i7 = i3 + 4;
        fArr[i7] = f3;
        int i8 = i3 + 5;
        fArr[i8] = f4;
        int i9 = i3 + 6;
        fArr[i9] = f;
        int i10 = i3 + 7;
        fArr[i10] = f4;
        fArr2[i3] = f5;
        fArr2[i4] = f6;
        fArr2[i5] = f7;
        fArr2[i6] = f6;
        fArr2[i7] = f7;
        fArr2[i8] = f8;
        fArr2[i9] = f5;
        fArr2[i10] = f8;
        int i11 = i << 2;
        iArr[i11] = i2;
        iArr[i11 + 1] = i2;
        iArr[i11 + 2] = i2;
        iArr[i11 + 3] = i2;
    }

    public static float p(float f) {
        double d = f;
        double d2 = 4.417382225408931d * d;
        return (float) Math.min(1.0d, (1.0d - (((Math.sin(d2) * 2.0647416048350564d) + Math.cos(d2)) * Math.exp((-9.120752865260691d) * d))) * 1.02d);
    }

    public static float q(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public final void a(gv8 gv8Var) {
        this.m = gv8Var;
        this.n = null;
        this.q = 2;
        this.o = 0.0f;
        this.p = 0L;
        this.E = 0L;
        this.F = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x031d, code lost:
    
        r7 = r7 + 1;
        r5 = r91;
        r9 = 2400;
        r15 = 1.0f;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x09e5  */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51, types: [int] */
    /* JADX WARN: Type inference failed for: r5v97 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, float f, float f2, float f3) {
        float f4;
        float f5;
        byte[] bArr;
        float f6;
        Canvas canvas2;
        float f7;
        hv8 hv8Var;
        Canvas canvas3;
        float f8;
        boolean z;
        RectF rectF;
        float f9;
        float f10;
        float f11;
        float f12;
        gv8 gv8Var;
        Paint paint;
        Paint paint2;
        Rect rect;
        gv8 gv8Var2;
        RectF rectF2;
        float f13;
        float f14;
        int i;
        Rect rect2;
        float f15;
        float f16;
        float f17;
        float f18;
        gv8 gv8Var3;
        Random random;
        int i2;
        ?? r5;
        gv8 gv8Var4;
        float f19;
        float f20;
        float f21;
        int i3;
        float f22;
        int i4;
        int i5;
        int i6;
        float f23;
        float f24;
        float x;
        float f25;
        float f26;
        float f27;
        float f28;
        float L;
        float max;
        long currentTimeMillis = System.currentTimeMillis();
        float min = this.A == 0 ? 0.016f : Math.min(0.05f, (currentTimeMillis - r3) / 1000.0f);
        this.A = currentTimeMillis;
        if (this.m != null) {
            float f29 = 1.0f;
            if (this.q == 2 && this.o < 1.0f && canvas.isHardwareAccelerated() && (Build.VERSION.SDK_INT < 29 || gba.o() != 2)) {
                if (this.p == 0) {
                    this.p = currentTimeMillis;
                }
                this.o = 1.0f;
                this.F = false;
            }
            int i7 = this.q;
            long j = 450;
            if (i7 != 1 && i7 == 2) {
                j = 380;
            }
            float f30 = this.o;
            if (f30 < 1.0f && this.p == 0) {
                this.p = currentTimeMillis;
            }
            if (i7 != 2 || (this.D < 0.0f && !this.F)) {
                f4 = 0.01f;
                if (f30 < 1.0f) {
                    this.o = Math.min(1.0f, (currentTimeMillis - this.p) / j);
                }
            } else {
                long j2 = this.E;
                if (j2 == 0) {
                    this.E = currentTimeMillis;
                    j2 = currentTimeMillis;
                }
                this.F = true;
                long j3 = currentTimeMillis - j2;
                float[] fArr = lcd.b;
                float min2 = Math.min(1.0f, j3 / Math.max(100.0f, fArr[51]));
                float f31 = fArr[53] / 100.0f;
                if (f31 > 0.01f) {
                    float f32 = S;
                    min2 = min2 < f31 ? (min2 * f32) / f31 : (((1.0f - f32) * (min2 - f31)) / Math.max(0.01f, 1.0f - f31)) + f32;
                }
                float p = p(min2 * 0.467f);
                float f33 = fArr[52];
                if (f33 > 0.0f) {
                    float f34 = T;
                    if (min2 > f34) {
                        float p2 = p(f34 * 0.467f);
                        float f35 = 1.0f - f34;
                        f4 = 0.01f;
                        float min3 = Math.min(((p((f34 + 0.002f) * 0.467f) - p2) / 0.002f) * f35, (1.0f - p2) * 3.0f);
                        float f36 = (min2 - f34) / f35;
                        float f37 = f36 * f36;
                        float f38 = f37 * f36;
                        float f39 = f37 * 3.0f;
                        p = ((((((f38 * (-2.0f)) + f39) * 1.0f) + ((((f38 - (f37 * 2.0f)) + f36) * min3) + ((((f38 * 2.0f) - f39) + 1.0f) * p2))) - p) * f33) + p;
                        max = Math.max(f30, min2 < 1.0f ? 1.0f : Math.min(1.0f, p));
                        this.o = max;
                        if (max >= 1.0f) {
                            this.F = false;
                        }
                    }
                }
                f4 = 0.01f;
                max = Math.max(f30, min2 < 1.0f ? 1.0f : Math.min(1.0f, p));
                this.o = max;
                if (max >= 1.0f) {
                }
            }
            PorterDuffColorFilter porterDuffColorFilter = this.z;
            Paint paint3 = this.t;
            paint3.setColorFilter(porterDuffColorFilter);
            float f40 = f3 / 2.0f;
            this.B = f + f40;
            this.C = f2 + f40;
            int i8 = this.q;
            RectF rectF3 = this.w;
            float[] fArr2 = this.j;
            float[] fArr3 = this.i;
            float[] fArr4 = this.h;
            float[] fArr5 = this.g;
            float[] fArr6 = this.f;
            float[] fArr7 = this.d;
            float[] fArr8 = this.c;
            float[] fArr9 = this.e;
            float[] fArr10 = this.b;
            float[] fArr11 = this.a;
            byte[] bArr2 = this.k;
            if (i8 == 2) {
                float f41 = this.o;
                if (f41 < 1.0f) {
                    f6 = 0.3f;
                    bArr = bArr2;
                    f(canvas, this.m, f, f2, f3, f41);
                    hv8Var = this;
                    canvas3 = canvas;
                    f12 = 0.0f;
                    rectF = rectF3;
                    f9 = min;
                    f10 = 1.6f;
                    f11 = 255.0f;
                    i6 = hv8Var.l - 1;
                    while (i6 >= 0) {
                        float f42 = fArr5[i6] + f9;
                        fArr5[i6] = f42;
                        if (f42 >= fArr6[i6]) {
                            int i9 = hv8Var.l - 1;
                            hv8Var.l = i9;
                            fArr11[i6] = fArr11[i9];
                            fArr10[i6] = fArr10[i9];
                            fArr8[i6] = fArr8[i9];
                            fArr7[i6] = fArr7[i9];
                            fArr9[i6] = fArr9[i9];
                            fArr6[i6] = fArr6[i9];
                            fArr5[i6] = fArr5[i9];
                            fArr4[i6] = fArr4[i9];
                            fArr3[i6] = fArr3[i9];
                            fArr2[i6] = fArr2[i9];
                            bArr[i6] = bArr[i9];
                        } else {
                            boolean isNaN = Float.isNaN(fArr2[i6]);
                            RectF rectF4 = hv8Var.r;
                            Paint paint4 = hv8Var.u;
                            if (isNaN) {
                                fArr7[i6] = fArr7[i6] - (gl.L(20.0f) * f9);
                                float f43 = fArr8[i6];
                                f23 = f9;
                                fArr8[i6] = yjb.B(f23, 2.4f, 1.0f, f43);
                                fArr7[i6] = yjb.B(f23, 3.0f, 1.0f, fArr7[i6]);
                                if (!rectF4.isEmpty() && fArr10[i6] < rectF4.top - gl.L(56.0f)) {
                                    fArr7[i6] = fArr7[i6] * 0.85f;
                                }
                            } else if (fArr5[i6] < f12) {
                                paint4.setColor(hv8Var.y);
                                paint4.setAlpha(kk7.d4);
                                float f44 = fArr9[i6];
                                float f45 = fArr11[i6];
                                float f46 = f44 / 2.0f;
                                float f47 = fArr10[i6];
                                rectF.set(f45 - f46, f47 - f46, f45 + f46, f47 + f46);
                                float f48 = f44 * f6;
                                canvas3.drawRoundRect(rectF, f48, f48, paint4);
                            } else {
                                float max2 = Math.max(f12, 1.0f - (f9 * 6.5f));
                                fArr8[i6] = fArr8[i6] * max2;
                                fArr7[i6] = (fArr7[i6] * max2) - (gl.L(260.0f) * f9);
                                f23 = f9;
                            }
                            fArr11[i6] = (fArr8[i6] * f23) + fArr11[i6];
                            fArr10[i6] = (fArr7[i6] * f23) + fArr10[i6];
                            fArr4[i6] = (fArr3[i6] * f23) + fArr4[i6];
                            float f49 = fArr5[i6] / fArr6[i6];
                            if (isNaN) {
                                f24 = 56.0f;
                                if (f49 < 0.08f) {
                                    f25 = f49 / 0.08f;
                                    x = f25;
                                    if (isNaN) {
                                    }
                                    f26 = 1.0f;
                                    float f50 = f26 - f49;
                                    float f51 = fArr9[i6] * (f26 - ((f26 - (f50 * f50)) * (!isNaN ? 0.35f : 0.85f)));
                                    if (bArr[i6] == 2) {
                                    }
                                } else {
                                    x = tb4.x(f49, 0.08f, 0.92f, 1.0f);
                                    if (isNaN) {
                                    }
                                    f26 = 1.0f;
                                    float f502 = f26 - f49;
                                    float f512 = fArr9[i6] * (f26 - ((f26 - (f502 * f502)) * (!isNaN ? 0.35f : 0.85f)));
                                    if (bArr[i6] == 2) {
                                    }
                                }
                            } else if (f49 < 0.35f) {
                                f24 = 56.0f;
                                x = 1.0f;
                                if (isNaN && !rectF4.isEmpty()) {
                                    L = (rectF4.top - gl.L(f24)) - fArr10[i6];
                                    if (L > 0.0f) {
                                        f26 = 1.0f;
                                        x *= Math.max(0.0f, 1.0f - (L / gl.L(24.0f)));
                                        float f5022 = f26 - f49;
                                        float f5122 = fArr9[i6] * (f26 - ((f26 - (f5022 * f5022)) * (!isNaN ? 0.35f : 0.85f)));
                                        if (bArr[i6] == 2) {
                                            paint4.setColor(-1);
                                            float f52 = x * f11;
                                            paint4.setAlpha((int) (f52 * 0.9f));
                                            canvas3.drawCircle(fArr11[i6], fArr10[i6], f5122, paint4);
                                            paint4.setAlpha((int) (f52 * 0.22f));
                                            canvas3.drawCircle(fArr11[i6], fArr10[i6], f5122 * 2.6f, paint4);
                                        } else {
                                            if (rectF4.isEmpty()) {
                                                f27 = 0.0f;
                                                f28 = 0.0f;
                                            } else {
                                                float f53 = rectF4.left;
                                                float f54 = fArr11[i6];
                                                f27 = 0.0f;
                                                float max3 = Math.max(f53 - f54, Math.max(0.0f, f54 - rectF4.right));
                                                float f55 = rectF4.top;
                                                float f56 = fArr10[i6];
                                                f28 = Math.min(1.0f, Math.max(max3, Math.max(f55 - f56, Math.max(0.0f, f56 - rectF4.bottom))) / gl.L(36.0f));
                                            }
                                            int i10 = hv8Var.y;
                                            if (f28 > f27) {
                                                i10 = k(f28, i10, -1);
                                            }
                                            paint4.setColor(i10);
                                            paint4.setAlpha((int) (x * f11));
                                            canvas3.save();
                                            canvas3.rotate(fArr4[i6], fArr11[i6], fArr10[i6]);
                                            float f57 = fArr11[i6];
                                            float f58 = f5122 / 2.0f;
                                            float f59 = fArr10[i6];
                                            rectF.set(f57 - f58, f59 - f58, f57 + f58, f59 + f58);
                                            float f60 = f5122 * f6;
                                            canvas3.drawRoundRect(rectF, f60, f60, paint4);
                                            if (bArr[i6] == 1) {
                                                float sin = (float) Math.sin(Math.min(1.0f, f49 * f10) * 3.141592653589793d);
                                                paint4.setColor(-1);
                                                paint4.setAlpha((int) (x * 200.0f * sin));
                                                canvas3.drawRoundRect(rectF, f60, f60, paint4);
                                            }
                                            canvas3.restore();
                                        }
                                    }
                                }
                                f26 = 1.0f;
                                float f50222 = f26 - f49;
                                float f51222 = fArr9[i6] * (f26 - ((f26 - (f50222 * f50222)) * (!isNaN ? 0.35f : 0.85f)));
                                if (bArr[i6] == 2) {
                                }
                            } else {
                                f25 = tb4.x(f49, 0.35f, 0.65f, 1.0f);
                                f24 = 56.0f;
                                x = f25;
                                if (isNaN) {
                                    L = (rectF4.top - gl.L(f24)) - fArr10[i6];
                                    if (L > 0.0f) {
                                    }
                                }
                                f26 = 1.0f;
                                float f502222 = f26 - f49;
                                float f512222 = fArr9[i6] * (f26 - ((f26 - (f502222 * f502222)) * (!isNaN ? 0.35f : 0.85f)));
                                if (bArr[i6] == 2) {
                                }
                            }
                            i6--;
                            f9 = f23;
                            f12 = 0.0f;
                        }
                        f23 = f9;
                        i6--;
                        f9 = f23;
                        f12 = 0.0f;
                    }
                }
                f5 = 3.0f;
                f6 = 0.3f;
                canvas2 = canvas;
                bArr = bArr2;
            } else {
                f5 = 3.0f;
                bArr = bArr2;
                f6 = 0.3f;
                canvas2 = canvas;
            }
            float f61 = f;
            int i11 = 2400;
            Random random2 = this.x;
            float f62 = f5;
            float f63 = 0.5f;
            float f64 = 16.0f;
            if (i8 != 1 || (gv8Var4 = this.n) == null) {
                f7 = f2;
                hv8Var = this;
                canvas3 = canvas2;
                f8 = f61;
                z = true;
            } else {
                z = true;
                if (this.o < 1.0f) {
                    if (this.G) {
                        this.G = false;
                        float f65 = f3 / gv8Var4.b;
                        int i12 = 0;
                        loop1: while (i12 < gv8Var4.e) {
                            int i13 = 0;
                            f19 = 0.45f;
                            while (true) {
                                int i14 = gv8Var4.e;
                                if (i13 < i14) {
                                    if (gv8Var4.g[(i14 * i12) + i13] && ((i13 < (i4 = gv8Var4.i) || i13 >= (i5 = gv8Var4.j) || i12 < i4 || i12 >= i5) && random2.nextFloat() >= 0.4f)) {
                                        int i15 = this.l;
                                        if (i15 >= i11) {
                                            i15 = -1;
                                        } else {
                                            this.l = i15 + 1;
                                        }
                                        if (i15 < 0) {
                                            break loop1;
                                        }
                                        float f66 = gv8Var4.f;
                                        float g = oo1.g(i13 + 0.5f, f66, f64, f65, f61);
                                        f22 = f64;
                                        float f67 = ((((i12 + 0.5f) * f66) + f22) * f65) + f2;
                                        float f68 = g - this.B;
                                        float max4 = Math.max(f29, Math.abs(f68));
                                        f21 = f65;
                                        float nextFloat = (random2.nextFloat() * gl.L(900.0f)) + gl.L(1000.0f);
                                        i3 = i13;
                                        float radians = (float) Math.toRadians((random2.nextFloat() - 0.5f) * 36.0f);
                                        bArr[i15] = (byte) (random2.nextFloat() < 0.12f ? 1 : 0);
                                        fArr11[i15] = g;
                                        fArr10[i15] = f67;
                                        fArr9[i15] = ((random2.nextFloat() * 0.6f) + 0.7f) * gv8Var4.f * f21;
                                        double d = radians;
                                        fArr8[i15] = (Math.min(1.0f, max4 / (f3 * 0.5f)) * Math.signum(f68) * nextFloat * 0.18f) + (((float) Math.sin(d)) * nextFloat);
                                        fArr7[i15] = (-((float) Math.cos(d))) * nextFloat;
                                        fArr6[i15] = ug8.e(random2, 0.06f, 0.24f);
                                        fArr5[i15] = (-(((gv8Var4.e - 1) - i12) / 4)) * 0.018f;
                                        fArr4[i15] = random2.nextFloat() * 90.0f;
                                        fArr3[i15] = (random2.nextFloat() - 0.5f) * 720.0f;
                                        fArr2[i15] = 1.0f;
                                    } else {
                                        f21 = f65;
                                        i3 = i13;
                                        f22 = f64;
                                    }
                                    i13 = i3 + 1;
                                    f61 = f;
                                    f64 = f22;
                                    f65 = f21;
                                    i11 = 2400;
                                    f29 = 1.0f;
                                }
                            }
                        }
                    }
                    f19 = 0.45f;
                    float max5 = Math.max(0.0f, this.o / 0.92f);
                    if (max5 > 0.0f) {
                        if (max5 >= 1.0f) {
                            f20 = 1.0f;
                        } else if (max5 < f19) {
                            float f69 = 1.0f - (max5 / f19);
                            f20 = ((1.0f - (f69 * f69)) * 0.12f) + 0.92f;
                        } else {
                            float f70 = (max5 - f19) / 0.55f;
                            f20 = 1.04f - ((f62 - (f70 * 2.0f)) * ((0.04f * f70) * f70));
                        }
                        canvas2.save();
                        canvas2.scale(f20, f20, this.B, this.C);
                        Canvas canvas4 = canvas2;
                        f(canvas4, this.m, f, f2, f3, max5);
                        hv8Var = this;
                        canvas3 = canvas4;
                        canvas3.restore();
                    } else {
                        hv8Var = this;
                        canvas3 = canvas2;
                    }
                    rectF = rectF3;
                    f9 = min;
                    f10 = 1.6f;
                    f11 = 255.0f;
                    f12 = 0.0f;
                    i6 = hv8Var.l - 1;
                    while (i6 >= 0) {
                    }
                }
                f7 = f2;
                hv8Var = this;
                canvas3 = canvas2;
                f8 = f61;
            }
            float f71 = 16.0f;
            float f72 = 0.45f;
            if (hv8Var.o >= 1.0f || (gv8Var = hv8Var.n) == null) {
                float f73 = f7;
                rectF = rectF3;
                f9 = min;
                float f74 = f8;
                f10 = 1.6f;
                f11 = 255.0f;
                f12 = 0.0f;
                gv8 gv8Var5 = hv8Var.m;
                int i16 = gv8Var5.b;
                rectF.set(f74, f73, f74 + f3, f73 + f3);
                canvas3.drawBitmap(gv8Var5.a, gv8Var5.c, rectF, paint3);
            } else {
                gv8 gv8Var6 = hv8Var.m;
                m(gv8Var);
                m(gv8Var6);
                Rect rect3 = gv8Var6.c;
                hv8Var.g(Math.max(gv8Var.l, gv8Var6.l));
                Bitmap bitmap = hv8Var.H;
                Bitmap bitmap2 = gv8Var.a;
                Paint paint5 = hv8Var.I;
                if (bitmap != bitmap2) {
                    Bitmap bitmap3 = gv8Var.a;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint5.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
                    hv8Var.H = gv8Var.a;
                }
                Bitmap bitmap4 = hv8Var.J;
                Bitmap bitmap5 = gv8Var6.a;
                Paint paint6 = hv8Var.K;
                if (bitmap4 != bitmap5) {
                    Bitmap bitmap6 = gv8Var6.a;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    paint6.setShader(new BitmapShader(bitmap6, tileMode2, tileMode2));
                    hv8Var.J = gv8Var6.a;
                }
                float h = h(gv8Var, hv8Var.o);
                float h2 = h(gv8Var6, hv8Var.o);
                float f75 = f3 / gv8Var.b;
                float f76 = f3 / gv8Var6.b;
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    paint = paint5;
                    if (i17 >= gv8Var.l) {
                        break;
                    }
                    if (gv8Var.p[i17]) {
                        int[] iArr = gv8Var.q;
                        int i19 = i17 << 2;
                        int i20 = iArr[i19];
                        int i21 = iArr[i19 + 1];
                        i = i17;
                        int i22 = (i21 * gv8Var.e) + i20;
                        float f77 = (gv8Var.h[i22] * 3.2f) + ((r7 - 1) - i21);
                        if (h > f77) {
                            boolean[] zArr = hv8Var.s;
                            if (zArr[i22]) {
                                rect2 = rect3;
                                f15 = f76;
                            } else {
                                zArr[i22] = z;
                                float f78 = i20 + 0.5f;
                                float f79 = gv8Var.f;
                                f16 = min;
                                float f80 = f71;
                                float g2 = oo1.g(f78, f79, f80, f75, f8);
                                float f81 = ((((i21 + 0.5f) * f79) + f80) * f75) + f7;
                                float f82 = f79 * f75;
                                float f83 = g2 - hv8Var.B;
                                float f84 = f81 - hv8Var.C;
                                rect2 = rect3;
                                f15 = f76;
                                float max6 = Math.max(1.0f, (float) Math.hypot(f83, f84));
                                float f85 = f83 / max6;
                                float f86 = f84 / max6;
                                float nextFloat2 = random2.nextFloat();
                                int i23 = (nextFloat2 > 0.12f ? 1 : (nextFloat2 == 0.12f ? 0 : -1));
                                int i24 = i23 < 0 ? 2 : nextFloat2 < 0.7f ? 3 : 5;
                                int i25 = 0;
                                while (i25 < i24) {
                                    int i26 = i24;
                                    int i27 = hv8Var.l;
                                    int i28 = i23;
                                    if (i27 >= 2400) {
                                        i27 = -1;
                                    } else {
                                        hv8Var.l = i27 + 1;
                                    }
                                    if (i27 < 0) {
                                        break;
                                    }
                                    boolean z2 = (i25 <= 0 || random2.nextFloat() >= f6) ? false : z;
                                    if (z2) {
                                        i2 = i27;
                                        r5 = 2;
                                    } else if (random2.nextFloat() < 0.14f) {
                                        i2 = i27;
                                        r5 = z;
                                    } else {
                                        i2 = i27;
                                        r5 = 0;
                                    }
                                    bArr[i2] = (byte) r5;
                                    fArr11[i2] = ((random2.nextFloat() - 0.5f) * f82 * 0.5f) + g2;
                                    fArr10[i2] = ((random2.nextFloat() - 0.5f) * f82 * 0.5f) + f81;
                                    if (z2) {
                                        fArr9[i2] = gl.N((random2.nextFloat() * 0.9f) + 0.9f);
                                    } else if (i25 != 0 || i28 >= 0) {
                                        fArr9[i2] = ((random2.nextFloat() * 0.55f) + f6) * f82;
                                    } else {
                                        fArr9[i2] = ((random2.nextFloat() * f72) + 1.25f) * f82;
                                    }
                                    float nextFloat3 = (random2.nextFloat() * gl.L(150.0f)) + gl.L(110.0f);
                                    float f87 = f72;
                                    float f88 = f86;
                                    float f89 = f81;
                                    float e = ug8.e(random2, 0.35f, f87);
                                    fArr8[i2] = ((random2.nextFloat() - 0.5f) * gl.L(90.0f)) + (f85 * nextFloat3 * e);
                                    fArr7[i2] = ls6.B(1.0f, e, nextFloat3, (f88 * nextFloat3) * e) - gl.L(30.0f);
                                    fArr6[i2] = ug8.e(random2, 0.2f, f6);
                                    fArr5[i2] = 0.0f;
                                    fArr4[i2] = random2.nextFloat() * 90.0f;
                                    fArr3[i2] = (random2.nextFloat() - 0.5f) * 720.0f;
                                    fArr2[i2] = Float.NaN;
                                    i25++;
                                    f86 = f88;
                                    i24 = i26;
                                    i23 = i28;
                                    f81 = f89;
                                    f72 = 0.45f;
                                }
                                gv8Var3 = gv8Var;
                                random = random2;
                                i17 = i + 1;
                                gv8Var = gv8Var3;
                                paint5 = paint;
                                min = f16;
                                rect3 = rect2;
                                f76 = f15;
                                random2 = random;
                                f6 = 0.3f;
                                f72 = 0.45f;
                                f71 = 16.0f;
                            }
                        } else {
                            rect2 = rect3;
                            f15 = f76;
                            f16 = min;
                            float min4 = 1.0f - Math.min(1.0f, (f77 - h) / 2.2f);
                            if (min4 > 0.0f) {
                                f17 = min4;
                                f18 = gl.N(1.4f) * ((float) Math.sin((hv8Var.o * 60.0f) + (i21 * 7) + (i20 * 13))) * f17;
                            } else {
                                f17 = min4;
                                f18 = 0.0f;
                            }
                            float N = gl.N(1.5f) * (-f17);
                            float f90 = i20;
                            float f91 = gv8Var.f;
                            float f92 = (f90 * f91) + 16.0f;
                            float f93 = (i21 * f91) + 16.0f;
                            gv8Var3 = gv8Var;
                            float f94 = f92 + f91;
                            float f95 = f91 + f93;
                            random = random2;
                            n(hv8Var.L, hv8Var.M, hv8Var.P, i18, ir2.i(f92, f75, f8, f18), ir2.i(f93, f75, f7, N), ir2.i(f94, f75, f8, f18), ir2.i(f95, f75, f7, N), f92, f93, f94, f95, (((int) yjb.B(f17, 0.25f, 1.0f, 255.0f)) << 24) | hv8Var.o());
                            i18++;
                            i17 = i + 1;
                            gv8Var = gv8Var3;
                            paint5 = paint;
                            min = f16;
                            rect3 = rect2;
                            f76 = f15;
                            random2 = random;
                            f6 = 0.3f;
                            f72 = 0.45f;
                            f71 = 16.0f;
                        }
                    } else {
                        rect2 = rect3;
                        f15 = f76;
                        i = i17;
                    }
                    f16 = min;
                    gv8Var3 = gv8Var;
                    random = random2;
                    i17 = i + 1;
                    gv8Var = gv8Var3;
                    paint5 = paint;
                    min = f16;
                    rect3 = rect2;
                    f76 = f15;
                    random2 = random;
                    f6 = 0.3f;
                    f72 = 0.45f;
                    f71 = 16.0f;
                }
                Rect rect4 = rect3;
                float f96 = f76;
                f9 = min;
                f12 = 0.0f;
                float f97 = 3.2f;
                boolean z3 = z;
                int i29 = 0;
                int i30 = 0;
                while (i29 < gv8Var6.l) {
                    if (gv8Var6.p[i29]) {
                        int[] iArr2 = gv8Var6.q;
                        int i31 = i29 << 2;
                        int i32 = iArr2[i31];
                        int i33 = iArr2[i31 + 1];
                        float i34 = ir2.i(gv8Var6.h[(i33 * gv8Var6.e) + i32], f97, (r7 - 1) - i33, 1.6f);
                        if (h2 <= i34) {
                            f14 = f96;
                            z3 = false;
                            f97 = 3.2f;
                        } else {
                            float min5 = Math.min(1.0f, (h2 - i34) / 2.4f);
                            float f98 = gv8Var6.f;
                            float f99 = (i32 * f98) + 16.0f;
                            float f100 = (i33 * f98) + 16.0f;
                            float f101 = f99 + f98;
                            float f102 = f100 + f98;
                            float f103 = min5 - 1.0f;
                            f97 = 3.2f;
                            float f104 = (((f103 * 2.2f * f103) + (f103 * 3.2f * f103 * f103) + 1.0f) * 0.65f) + 0.35f;
                            if (min5 >= 1.0f || (min5 > 0.4f && Math.abs(f104 - 1.0f) < f4)) {
                                f14 = f96;
                                n(hv8Var.N, hv8Var.O, hv8Var.Q, i30, (f99 * f14) + f8, (f100 * f14) + f7, (f101 * f14) + f8, (f102 * f14) + f7, f99, f100, f101, f102, hv8Var.o() | (-16777216));
                                i30++;
                            } else {
                                float f105 = ((f99 + f101) * f63 * f96) + f8;
                                float f106 = ((f100 + f102) * f63 * f96) + f7;
                                f14 = f96;
                                float C = yjb.C(gv8Var6.f, f63, f14, f104);
                                n(hv8Var.N, hv8Var.O, hv8Var.Q, i30, f105 - C, f106 - C, f105 + C, f106 + C, f99, f100, f101, f102, (((int) (Math.min(1.0f, min5 * 2.5f) * 255.0f)) << 24) | hv8Var.o());
                                i30++;
                                z3 = false;
                            }
                        }
                    } else {
                        f14 = f96;
                    }
                    i29++;
                    f96 = f14;
                    f63 = 0.5f;
                }
                float f107 = f96;
                f11 = 255.0f;
                if (i18 == 0 && z3) {
                    hv8Var.o = 1.0f;
                    rectF3.set(f8, f7, f8 + f3, f7 + f3);
                    canvas3.drawBitmap(gv8Var6.a, rect4, rectF3, paint3);
                    rectF = rectF3;
                    f10 = 1.6f;
                    f6 = 0.3f;
                } else {
                    if (i18 > 0) {
                        gv8Var2 = gv8Var6;
                        f13 = f107;
                        paint2 = paint3;
                        rectF2 = rectF3;
                        rect = rect4;
                        f10 = 1.6f;
                        f6 = 0.3f;
                        canvas3.drawVertices(Canvas.VertexMode.TRIANGLES, i18 << 3, hv8Var.L, 0, hv8Var.M, 0, hv8Var.P, 0, hv8Var.R, 0, i18 * 6, paint);
                    } else {
                        paint2 = paint3;
                        rect = rect4;
                        gv8Var2 = gv8Var6;
                        rectF2 = rectF3;
                        f13 = f107;
                        f10 = 1.6f;
                        f6 = 0.3f;
                    }
                    if (i30 > 0) {
                        canvas3 = canvas;
                        canvas3.drawVertices(Canvas.VertexMode.TRIANGLES, i30 << 3, hv8Var.N, 0, hv8Var.O, 0, hv8Var.Q, 0, hv8Var.R, 0, i30 * 6, paint6);
                    } else {
                        canvas3 = canvas;
                    }
                    float f108 = gv8Var2.i;
                    float f109 = gv8Var2.f;
                    float z4 = yjb.z(f108, f109, 16.0f, f13);
                    float z5 = yjb.z(gv8Var2.j, f109, 16.0f, f13);
                    canvas3.save();
                    canvas3.clipRect(z4 + f, z4 + f2, z5 + f, z5 + f2);
                    rectF = rectF2;
                    rectF.set(f, f2, f + f3, f2 + f3);
                    canvas3.drawBitmap(gv8Var2.a, rect, rectF, paint2);
                    canvas3.restore();
                }
            }
            i6 = hv8Var.l - 1;
            while (i6 >= 0) {
            }
        }
    }

    public final void f(Canvas canvas, gv8 gv8Var, float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        Paint paint;
        float v;
        int i;
        float f7;
        float f8;
        float f9;
        float f10;
        float x;
        hv8 hv8Var = this;
        float f11 = f4;
        int i2 = hv8Var.q;
        Paint paint2 = hv8Var.t;
        RectF rectF = hv8Var.w;
        float f12 = 16.0f;
        float f13 = 1.0f;
        int i3 = 1;
        if (i2 != 2) {
            int i4 = 0;
            float f14 = 2.0f;
            float f15 = 0.05f;
            float f16 = f3 / gv8Var.b;
            float f17 = (gv8Var.e - 1) / 2.0f;
            float f18 = 1.4142f * f17;
            int i5 = 0;
            while (i5 < gv8Var.e) {
                int i6 = i4;
                while (true) {
                    int i7 = gv8Var.e;
                    if (i6 < i7) {
                        int i8 = (i7 * i5) + i6;
                        if (!gv8Var.g[i8] || i(gv8Var, i6, i5)) {
                            f5 = f17;
                            f6 = f18;
                            paint = paint2;
                        } else {
                            float f19 = i6;
                            Paint paint3 = paint2;
                            float f20 = i5;
                            f5 = f17;
                            float A = (f4 - ((gv8Var.h[i8] * 0.06f) + b00.A((float) Math.hypot(f19 - f17, f20 - f17), f18, 0.52f, f15))) / 0.367f;
                            if (A > 0.0f) {
                                if (A >= 1.0f) {
                                    v = 1.0f;
                                } else {
                                    float f21 = 1.0f - A;
                                    v = oo1.v(f21, f21, f21, 1.0f);
                                }
                                float l = hv8Var.q == 2 ? (0.6f * v) + 0.4f : l(A);
                                if (hv8Var.q != 2) {
                                    v = Math.min(1.0f, A * 6.0f);
                                }
                                int i9 = gv8Var.i;
                                if (i6 < i9 || i6 >= (i = gv8Var.j) || i5 < i9 || i5 >= i) {
                                    float f22 = gv8Var.f;
                                    int i10 = (int) ((f19 * f22) + 16.0f);
                                    int i11 = (int) ((f20 * f22) + 16.0f);
                                    float f23 = l;
                                    int ceil = (int) Math.ceil(((i6 + 1) * f22) + 16.0f);
                                    f6 = f18;
                                    int ceil2 = (int) Math.ceil(((i5 + 1) * gv8Var.f) + 16.0f);
                                    Rect rect = hv8Var.v;
                                    rect.set(i10, i11, ceil, ceil2);
                                    float f24 = i10 + ceil;
                                    float f25 = f14;
                                    float A2 = b00.A(f24, f25, f16, f);
                                    float A3 = b00.A(i11 + ceil2, f25, f16, f2);
                                    float f26 = ((ceil - i10) / f25) * f16 * f23;
                                    float f27 = ((ceil2 - i11) / f25) * f16 * f23;
                                    rectF.set(A2 - f26, A3 - f27, A2 + f26, A3 + f27);
                                    paint = paint3;
                                    paint.setAlpha((int) (v * 255.0f));
                                    canvas.drawBitmap(gv8Var.a, rect, rectF, paint);
                                    paint.setAlpha(kk7.d4);
                                }
                            }
                            f6 = f18;
                            paint = paint3;
                        }
                        i6++;
                        hv8Var = this;
                        paint2 = paint;
                        f18 = f6;
                        f17 = f5;
                        f14 = 2.0f;
                        f15 = 0.05f;
                    }
                }
                i5++;
                hv8Var = this;
                i4 = 0;
                f14 = 2.0f;
                f15 = 0.05f;
            }
            Paint paint4 = paint2;
            float f28 = f3 / gv8Var.b;
            int i12 = 0;
            while (i12 < 3) {
                int i13 = i12 == i3 ? gv8Var.e - 7 : 0;
                int i14 = i12 == 2 ? gv8Var.e - 7 : 0;
                float f29 = f4 / 0.32f;
                if (f29 > 0.0f) {
                    float f30 = gv8Var.f;
                    float f31 = f12;
                    float g = oo1.g(i13, f30, f31, f28, f);
                    float g2 = oo1.g(i14, f30, f31, f28, f2);
                    float g3 = oo1.g(i13 + 7, f30, f31, f28, f);
                    float g4 = oo1.g(i14 + 7, f30, f31, f28, f2);
                    float l2 = l(f29);
                    canvas.save();
                    canvas.scale(l2, l2, (g + g3) / 2.0f, (g2 + g4) / 2.0f);
                    canvas.clipRect(g - 1.0f, g2 - 1.0f, g3 + 1.0f, g4 + 1.0f);
                    rectF.set(f, f2, f + f3, f2 + f3);
                    paint4.setAlpha(kk7.d4);
                    canvas.drawBitmap(gv8Var.a, gv8Var.c, rectF, paint4);
                    canvas.restore();
                }
                i12++;
                f12 = 16.0f;
                i3 = 1;
            }
            paint4.setAlpha(kk7.d4);
            return;
        }
        m(gv8Var);
        int i15 = gv8Var.l << 1;
        int i16 = gv8Var.e;
        hv8Var.g((i16 * i16) + i15);
        Bitmap bitmap = hv8Var.J;
        Bitmap bitmap2 = gv8Var.a;
        Paint paint5 = hv8Var.K;
        if (bitmap != bitmap2) {
            Bitmap bitmap3 = gv8Var.a;
            f7 = 0.05f;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint5.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
            hv8Var.J = gv8Var.a;
        } else {
            f7 = 0.05f;
        }
        float f32 = f3 / gv8Var.b;
        float min = Math.min(1.0f, Math.max(0.0f, f11) / 0.1f);
        float f33 = gv8Var.f * 0.5f;
        boolean z = true;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < gv8Var.l) {
            float f34 = (f11 - gv8Var.o[i17]) / 0.434f;
            if (f34 < 0.0f) {
                f34 = 0.0f;
            } else if (f34 > f13) {
                f34 = f13;
            }
            float f35 = f13;
            if (f34 < 0.5f) {
                f8 = yjb.C(f34, 4.0f, f34, f34);
            } else {
                float f36 = (f34 * (-2.0f)) + 2.0f;
                f8 = f35 - (((f36 * f36) * f36) * 0.5f);
            }
            float f37 = (gv8Var.m[i17] * f32) + f;
            float f38 = (gv8Var.n[i17] * f32) + f2;
            if (gv8Var.p[i17]) {
                float f39 = f8 > 0.75f ? 4.0f * (f8 - 0.75f) : 0.0f;
                f9 = f32;
                if (f39 < f35) {
                    float z2 = yjb.z(f8, 0.8f, 0.2f, f33 * f9);
                    int min2 = Math.min(7, (int) ((f8 * 7.0f) + 0.5f));
                    float f40 = (f35 - f39) * min;
                    if (f40 > 0.004f) {
                        n(hv8Var.L, hv8Var.M, hv8Var.P, i18, f37 - z2, f38 - z2, f37 + z2, f38 + z2, min2 * 48, gv8Var.d, r6 + 48, r5 + 48, (((int) (f40 * 255.0f)) << 24) | hv8Var.o());
                        i18++;
                    }
                    z = false;
                }
                if (f39 > 0.0f) {
                    int[] iArr = gv8Var.q;
                    float f41 = iArr[i17 << 2];
                    float f42 = gv8Var.f;
                    float f43 = (f41 * f42) + 16.0f;
                    float f44 = (iArr[r5 + 1] * f42) + 16.0f;
                    float f45 = f43 + f42;
                    float f46 = f44 + f42;
                    n(hv8Var.N, hv8Var.O, hv8Var.Q, i19, (f43 * f9) + f, (f44 * f9) + f2, (f45 * f9) + f, (f46 * f9) + f2, f43, f44, f45, f46, (((int) (min * 255.0f)) << 24) | hv8Var.o());
                    i19++;
                }
            } else {
                f9 = f32;
                float f47 = (f35 - f8) * 0.2f;
                boolean z3 = f8 < f35 ? false : z;
                if (f8 < 0.7f) {
                    f10 = f47;
                    x = f35;
                } else {
                    f10 = f47;
                    x = tb4.x(f8, 0.7f, 0.3f, f35);
                }
                float f48 = 0.9f * min * x;
                if (f10 <= 0.01f || f48 <= 0.004f) {
                    z = z3;
                } else {
                    float f49 = f33 * f9 * f10;
                    n(hv8Var.L, hv8Var.M, hv8Var.P, i18, f37 - f49, f38 - f49, f37 + f49, f38 + f49, 0.0f, gv8Var.d, 48.0f, r9 + 48, (((int) (f48 * 255.0f)) << 24) | hv8Var.o());
                    z = z3;
                    i18++;
                }
            }
            i17++;
            f11 = f4;
            f32 = f9;
            f13 = 1.0f;
        }
        float f50 = f32;
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, (f4 - f7) / 0.45f));
        float v2 = oo1.v(max, max, max, 1.0f);
        if (v2 > 0.0f) {
            int i20 = gv8Var.i;
            while (i20 < gv8Var.j) {
                int i21 = i19;
                for (int i22 = gv8Var.i; i22 < gv8Var.j; i22++) {
                    if (gv8Var.g[(gv8Var.e * i20) + i22]) {
                        float f51 = gv8Var.f;
                        float f52 = (i22 * f51) + 16.0f;
                        float f53 = (i20 * f51) + 16.0f;
                        float f54 = f52 + f51;
                        float f55 = f53 + f51;
                        n(hv8Var.N, hv8Var.O, hv8Var.Q, i21, (f52 * f50) + f, (f53 * f50) + f2, (f54 * f50) + f, (f55 * f50) + f2, f52, f53, f54, f55, (((int) ((min * 255.0f) * v2)) << 24) | hv8Var.o());
                        i21++;
                    }
                }
                i20++;
                i19 = i21;
            }
        }
        if (z && min >= 1.0f) {
            rectF.set(f, f2, f + f3, f2 + f3);
            canvas.drawBitmap(gv8Var.a, gv8Var.c, rectF, paint2);
            return;
        }
        if (i18 > 0) {
            int i23 = i19 << 3;
            int i24 = i18 << 3;
            System.arraycopy(hv8Var.L, 0, hv8Var.N, i23, i24);
            System.arraycopy(hv8Var.M, 0, hv8Var.O, i23, i24);
            System.arraycopy(hv8Var.P, 0, hv8Var.Q, i19 << 2, i18 << 2);
        }
        int i25 = i19 + i18;
        if (i25 > 0) {
            canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i25 << 3, hv8Var.N, 0, hv8Var.O, 0, hv8Var.Q, 0, hv8Var.R, 0, i25 * 6, paint5);
        }
    }

    public final void g(int i) {
        float[] fArr = this.L;
        if (fArr == null || fArr.length < (i << 3)) {
            int i2 = i << 3;
            this.L = new float[i2];
            this.M = new float[i2];
            int i3 = i << 2;
            this.P = new int[i3];
            this.N = new float[i2];
            this.O = new float[i2];
            this.Q = new int[i3];
            this.R = new short[i * 6];
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 << 2;
                short[] sArr = this.R;
                int i6 = i4 * 6;
                short s = (short) i5;
                sArr[i6] = s;
                sArr[i6 + 1] = (short) (i5 + 1);
                short s2 = (short) (i5 + 2);
                sArr[i6 + 2] = s2;
                sArr[i6 + 3] = s;
                sArr[i6 + 4] = s2;
                sArr[i6 + 5] = (short) (i5 + 3);
            }
        }
    }

    public final int o() {
        return this.y & 16777215;
    }
}
