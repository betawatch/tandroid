package bi;

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
import org.telegram.messenger.az;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.pz;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f {
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
    public e m;
    public e n;
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
        float f10;
        float f11;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            f10 = 0.5f;
            if (i10 > 1000) {
                break;
            }
            float f12 = i10 / 1000.0f;
            if (p(f12 * 0.467f) >= 0.5f) {
                f10 = f12;
                break;
            }
            i10++;
        }
        while (true) {
            f11 = 0.8f;
            if (i3 > 1000) {
                break;
            }
            float f13 = i3 / 1000.0f;
            if (p(f13 * 0.467f) >= 0.8f) {
                f11 = f13;
                break;
            }
            i3++;
        }
        S = f10;
        T = f11;
    }

    public static synchronized Bitmap b() {
        Bitmap bitmap;
        synchronized (f.class) {
            try {
                if (U == null) {
                    U = Bitmap.createBitmap(384, 48, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(U);
                    Paint paint = new Paint(1);
                    paint.setColor(-1);
                    RectF rectF = new RectF();
                    for (int i3 = 0; i3 < 8; i3++) {
                        rectF.set((i3 * 48) + 1.5f, 1.5f, (r7 + 48) - 1.5f, 46.5f);
                        float f10 = (1.0f - ((i3 * 0.7f) / 7.0f)) * 22.5f;
                        canvas.drawRoundRect(rectF, f10, f10, paint);
                    }
                }
                bitmap = U;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmap;
    }

    public static e c(String str, int i3, dc.b bVar, float f10, ColorDrawable colorDrawable) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(yb.b.a, bVar);
            hashMap.put(yb.b.c, 0);
            pz pzVar = new pz();
            if (colorDrawable != null) {
                pzVar.g = colorDrawable;
            }
            e eVar = new e();
            Bitmap a10 = pzVar.a(str, i3, i3, hashMap, null, f10, 0, -1);
            eVar.b = a10.getWidth();
            int i10 = ((d4.d) fc.b.b(str, bVar, hashMap).f).b;
            eVar.e = i10;
            eVar.f = (eVar.b - (eVar.g * 2.0f)) / i10;
            int i11 = i10 * i10;
            eVar.h = new boolean[i11];
            eVar.i = new float[i11];
            Random random = new Random(str.hashCode());
            for (int i12 = 0; i12 < eVar.e; i12++) {
                for (int i13 = 0; i13 < eVar.e; i13++) {
                    float f11 = eVar.g;
                    float f12 = i13 + 0.5f;
                    float f13 = eVar.f;
                    int i14 = (int) ((f12 * f13) + f11);
                    int b10 = (int) org.telegram.messenger.camera.q.b(i12, 0.5f, f13, f11);
                    boolean z10 = false;
                    for (int i15 = -1; i15 <= 1 && !z10; i15++) {
                        z10 = Color.alpha(a10.getPixel(Math.max(0, Math.min(eVar.b - 1, ((int) ((((float) i15) * eVar.f) * 0.3f)) + i14)), b10)) > 40;
                    }
                    boolean[] zArr = eVar.h;
                    int i16 = (eVar.e * i12) + i13;
                    zArr[i16] = z10;
                    eVar.i[i16] = random.nextFloat();
                }
            }
            Bitmap b11 = b();
            int i17 = eVar.b;
            eVar.d = i17 + 2;
            eVar.a = Bitmap.createBitmap(Math.max(i17, b11.getWidth()), eVar.d + b11.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(eVar.a);
            canvas.drawBitmap(a10, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(b11, 0.0f, eVar.d, (Paint) null);
            a10.recycle();
            eVar.a.prepareToDraw();
            Rect rect = eVar.c;
            int i18 = eVar.b;
            rect.set(0, 0, i18, i18);
            int i19 = pzVar.f;
            eVar.l = i19;
            int round = Math.round(i19 / eVar.f) + 2;
            int i20 = (eVar.e - round) / 2;
            eVar.j = i20;
            eVar.k = i20 + round;
            return eVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int d(float f10) {
        return Math.max(0, Math.min(hs.e4, Math.round(f10 * 255.0f)));
    }

    public static float h(e eVar, float f10) {
        float f11 = 1.0f - f10;
        return org.telegram.messenger.camera.q.b(eVar.e, 6.0f, 1.0f - (((f11 * 0.45f) + 0.55f) * (f11 * f11)), -1.5f);
    }

    public static boolean i(e eVar, int i3, int i10) {
        if (i3 < 7 && i10 < 7) {
            return true;
        }
        int i11 = eVar.e;
        if (i3 < i11 - 7 || i10 >= 7) {
            return i3 < 7 && i10 >= i11 - 7;
        }
        return true;
    }

    public static float j(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (((float) Math.pow(f10, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int k(float f10, int i3, int i10) {
        if (f10 <= 0.0f) {
            return i3;
        }
        if (f10 >= 1.0f) {
            return i10;
        }
        float q10 = q(Color.red(i3) / 255.0f);
        float q11 = q(Color.green(i3) / 255.0f);
        float q12 = q(Color.blue(i3) / 255.0f);
        float q13 = q(Color.red(i10) / 255.0f);
        float q14 = q(Color.green(i10) / 255.0f);
        float q15 = q(Color.blue(i10) / 255.0f);
        float f11 = q12 * 0.051445995f;
        float cbrt = (float) Math.cbrt(f11 + (q11 * 0.53633255f) + (q10 * 0.41222146f));
        float f12 = q12 * 0.10739696f;
        float cbrt2 = (float) Math.cbrt(f12 + (q11 * 0.6806995f) + (q10 * 0.2119035f));
        float f13 = q12 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f13 + (q11 * 0.28171885f) + (q10 * 0.08830246f));
        float f14 = 0.051445995f * q15;
        float cbrt4 = (float) Math.cbrt(f14 + (0.53633255f * q14) + (0.41222146f * q13));
        float f15 = 0.10739696f * q15;
        float cbrt5 = (float) Math.cbrt(f15 + (0.6806995f * q14) + (0.2119035f * q13));
        float f16 = q15 * 0.6299787f;
        float cbrt6 = (float) Math.cbrt(f16 + (q14 * 0.28171885f) + (q13 * 0.08830246f));
        float y9 = com.google.android.recaptcha.internal.a.y(cbrt4, cbrt, f10, cbrt);
        float y10 = com.google.android.recaptcha.internal.a.y(cbrt5, cbrt2, f10, cbrt2);
        float y11 = com.google.android.recaptcha.internal.a.y(cbrt6, cbrt3, f10, cbrt3);
        float f17 = y9 * y9 * y9;
        float f18 = y10 * y10 * y10;
        float f19 = y11 * y11 * y11;
        return Color.argb((int) (((Color.alpha(i10) - Color.alpha(i3)) * f10) + Color.alpha(i3)), d(j((0.23096994f * f19) + ((4.0767417f * f17) - (3.3077116f * f18)))), d(j(((2.6097574f * f18) + ((-1.268438f) * f17)) - (0.34131938f * f19))), d(j((f19 * 1.7076147f) + ((f17 * (-0.0041960864f)) - (f18 * 0.7034186f)))));
    }

    public static float l(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 < 0.6f) {
            float f11 = 1.0f - (f10 / 0.6f);
            return (1.0f - ((f11 * f11) * f11)) * 1.08f;
        }
        float f12 = (f10 - 0.6f) / 0.4f;
        return 1.08f - ((3.0f - (f12 * 2.0f)) * ((0.08f * f12) * f12));
    }

    public static void m(e eVar) {
        int i3;
        int i10;
        if (eVar.n != null) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= eVar.e) {
                break;
            }
            for (int i13 = 0; i13 < eVar.e; i13++) {
                int i14 = eVar.j;
                if (i13 < i14 || i13 >= (i10 = eVar.k) || i11 < i14 || i11 >= i10) {
                    i12++;
                }
            }
            i11++;
        }
        eVar.m = i12;
        eVar.n = new float[i12];
        eVar.o = new float[i12];
        eVar.p = new float[i12];
        eVar.q = new boolean[i12];
        eVar.r = new int[i12 * 4];
        float f10 = 1.4142f * ((r4 - 1) / 2.0f);
        int i15 = 0;
        for (int i16 = 0; i16 < eVar.e; i16++) {
            int i17 = 0;
            while (true) {
                int i18 = eVar.e;
                if (i17 < i18) {
                    int i19 = eVar.j;
                    if (i17 < i19 || i17 >= (i3 = eVar.k) || i16 < i19 || i16 >= i3) {
                        int i20 = (i18 * i16) + i17;
                        float hypot = ((float) Math.hypot(r8 - r2, r11 - r2)) / f10;
                        float f11 = eVar.i[i20] * 3.17f;
                        float floor = f11 - ((float) Math.floor(f11));
                        boolean i21 = i(eVar, i17, i16);
                        float[] fArr = eVar.n;
                        float f12 = eVar.g;
                        float f13 = eVar.f;
                        fArr[i15] = ((i17 + 0.5f) * f13) + f12;
                        eVar.o[i15] = org.telegram.messenger.camera.q.b(i16, 0.5f, f13, f12);
                        float f14 = hypot * 0.5f;
                        eVar.p[i15] = i21 ? f14 * 0.85f : f14 + (floor * 0.06f);
                        eVar.q[i15] = eVar.h[i20];
                        int[] iArr = eVar.r;
                        int i22 = i15 * 4;
                        iArr[i22] = i17;
                        iArr[i22 + 1] = i16;
                        i15++;
                    }
                    i17++;
                }
            }
        }
    }

    public static void n(float[] fArr, float[] fArr2, int[] iArr, int i3, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i10) {
        int i11 = i3 * 8;
        fArr[i11] = f10;
        int i12 = i11 + 1;
        fArr[i12] = f11;
        int i13 = i11 + 2;
        fArr[i13] = f12;
        int i14 = i11 + 3;
        fArr[i14] = f11;
        int i15 = i11 + 4;
        fArr[i15] = f12;
        int i16 = i11 + 5;
        fArr[i16] = f13;
        int i17 = i11 + 6;
        fArr[i17] = f10;
        int i18 = i11 + 7;
        fArr[i18] = f13;
        fArr2[i11] = f14;
        fArr2[i12] = f15;
        fArr2[i13] = f16;
        fArr2[i14] = f15;
        fArr2[i15] = f16;
        fArr2[i16] = f17;
        fArr2[i17] = f14;
        fArr2[i18] = f17;
        int i19 = i3 * 4;
        iArr[i19] = i10;
        iArr[i19 + 1] = i10;
        iArr[i19 + 2] = i10;
        iArr[i19 + 3] = i10;
    }

    public static float p(float f10) {
        double d = f10;
        double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d * d;
        return (float) Math.min(1.0d, (1.0d - (((Math.sin(sqrt) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(sqrt)) * Math.exp((-9.120752865260691d) * d))) * 1.02d);
    }

    public static float q(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public final void a(e eVar) {
        this.m = eVar;
        this.n = null;
        this.q = 2;
        this.o = 0.0f;
        this.p = 0L;
        this.E = 0L;
        this.F = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x031f, code lost:
    
        r7 = r7 + 1;
        r5 = 2400;
        r15 = 1.0f;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0a0f  */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54, types: [int] */
    /* JADX WARN: Type inference failed for: r6v98 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, float f10, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        f fVar;
        Canvas canvas2;
        boolean z10;
        byte[] bArr;
        RectF rectF;
        float f19;
        float f20;
        float f21;
        float f22;
        e eVar;
        Paint paint;
        Paint paint2;
        Rect rect;
        RectF rectF2;
        int i3;
        float f23;
        e eVar2;
        int i10;
        int i11;
        float f24;
        int i12;
        float f25;
        Rect rect2;
        int i13;
        int i14;
        e eVar3;
        int i15;
        ?? r62;
        e eVar4;
        float f26;
        float f27;
        int i16;
        int i17;
        int i18;
        int i19;
        float f28;
        float f29;
        float y9;
        float f30;
        float f31;
        float f32;
        float f33;
        float L;
        float max;
        long currentTimeMillis = System.currentTimeMillis();
        float min = this.A == 0 ? 0.016f : Math.min(0.05f, (currentTimeMillis - r3) / 1000.0f);
        this.A = currentTimeMillis;
        if (this.m == null) {
            return;
        }
        float f34 = 1.0f;
        if (this.q == 2 && this.o < 1.0f && canvas.isHardwareAccelerated() && (Build.VERSION.SDK_INT < 29 || az.o() != 2)) {
            if (this.p == 0) {
                this.p = currentTimeMillis;
            }
            this.o = 1.0f;
            this.F = false;
        }
        int i20 = this.q;
        long j10 = (i20 != 1 && i20 == 2) ? 380L : 450L;
        float f35 = this.o;
        if (f35 < 1.0f && this.p == 0) {
            this.p = currentTimeMillis;
        }
        if (i20 != 2 || (this.D < 0.0f && !this.F)) {
            f13 = 0.01f;
            if (f35 < 1.0f) {
                this.o = Math.min(1.0f, (currentTimeMillis - this.p) / j10);
            }
        } else {
            if (this.E == 0) {
                this.E = currentTimeMillis;
            }
            this.F = true;
            long j11 = currentTimeMillis - this.E;
            float[] fArr = d1.b;
            float min2 = Math.min(1.0f, j11 / Math.max(100.0f, fArr[51]));
            float f36 = fArr[53] / 100.0f;
            if (f36 > 0.01f) {
                float f37 = S;
                min2 = min2 < f36 ? (min2 * f37) / f36 : (((1.0f - f37) * (min2 - f36)) / Math.max(0.01f, 1.0f - f36)) + f37;
            }
            float p10 = p(min2 * 0.467f);
            float f38 = fArr[52];
            if (f38 > 0.0f) {
                float f39 = T;
                if (min2 > f39) {
                    float p11 = p(f39 * 0.467f);
                    float f40 = 1.0f - f39;
                    f13 = 0.01f;
                    float min3 = Math.min(((p((f39 + 0.002f) * 0.467f) - p11) / 0.002f) * f40, (1.0f - p11) * 3.0f);
                    float f41 = (min2 - f39) / f40;
                    float f42 = f41 * f41;
                    float f43 = f42 * f41;
                    float f44 = f42 * 3.0f;
                    p10 = ((((((f43 * (-2.0f)) + f44) * 1.0f) + ((((f43 - (f42 * 2.0f)) + f41) * min3) + ((((f43 * 2.0f) - f44) + 1.0f) * p11))) - p10) * f38) + p10;
                    max = Math.max(f35, min2 < 1.0f ? 1.0f : Math.min(1.0f, p10));
                    this.o = max;
                    if (max >= 1.0f) {
                        this.F = false;
                    }
                }
            }
            f13 = 0.01f;
            max = Math.max(f35, min2 < 1.0f ? 1.0f : Math.min(1.0f, p10));
            this.o = max;
            if (max >= 1.0f) {
            }
        }
        PorterDuffColorFilter porterDuffColorFilter = this.z;
        Paint paint3 = this.t;
        paint3.setColorFilter(porterDuffColorFilter);
        float f45 = f12 / 2.0f;
        this.B = f10 + f45;
        this.C = f11 + f45;
        int i21 = this.q;
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
        if (i21 == 2) {
            float f46 = this.o;
            if (f46 < 1.0f) {
                f15 = 0.92f;
                f(canvas, this.m, f10, f11, f12, f46);
                f22 = 0.0f;
                bArr = bArr2;
                rectF = rectF3;
                f19 = min;
                f16 = 3.0f;
                f20 = 1.6f;
                f21 = 255.0f;
                fVar = this;
                canvas2 = canvas;
                i19 = fVar.l - 1;
                while (i19 >= 0) {
                    float f47 = fArr5[i19] + f19;
                    fArr5[i19] = f47;
                    if (f47 >= fArr6[i19]) {
                        int i22 = fVar.l - 1;
                        fVar.l = i22;
                        fArr11[i19] = fArr11[i22];
                        fArr10[i19] = fArr10[i22];
                        fArr8[i19] = fArr8[i22];
                        fArr7[i19] = fArr7[i22];
                        fArr9[i19] = fArr9[i22];
                        fArr6[i19] = fArr6[i22];
                        fArr5[i19] = fArr5[i22];
                        fArr4[i19] = fArr4[i22];
                        fArr3[i19] = fArr3[i22];
                        fArr2[i19] = fArr2[i22];
                        bArr[i19] = bArr[i22];
                    } else {
                        boolean isNaN = Float.isNaN(fArr2[i19]);
                        Paint paint4 = fVar.u;
                        if (isNaN || fArr5[i19] >= f22) {
                            RectF rectF4 = fVar.r;
                            if (isNaN) {
                                fArr7[i19] = fArr7[i19] - (org.telegram.messenger.g0.L(20.0f) * f19);
                                f28 = f19;
                                fArr8[i19] = com.google.android.recaptcha.internal.a.B(f28, 2.4f, 1.0f, fArr8[i19]);
                                fArr7[i19] = com.google.android.recaptcha.internal.a.B(f28, f16, 1.0f, fArr7[i19]);
                                if (!rectF4.isEmpty() && fArr10[i19] < rectF4.top - org.telegram.messenger.g0.L(56.0f)) {
                                    fArr7[i19] = fArr7[i19] * 0.85f;
                                }
                            } else {
                                float max2 = Math.max(f22, 1.0f - (f19 * 6.5f));
                                fArr8[i19] = fArr8[i19] * max2;
                                fArr7[i19] = (fArr7[i19] * max2) - (org.telegram.messenger.g0.L(260.0f) * f19);
                                f28 = f19;
                            }
                            fArr11[i19] = (fArr8[i19] * f28) + fArr11[i19];
                            fArr10[i19] = (fArr7[i19] * f28) + fArr10[i19];
                            fArr4[i19] = (fArr3[i19] * f28) + fArr4[i19];
                            float f48 = fArr5[i19] / fArr6[i19];
                            if (isNaN) {
                                if (f48 < 0.08f) {
                                    f30 = f48 / 0.08f;
                                    f29 = f15;
                                    y9 = f30;
                                    if (isNaN) {
                                    }
                                    f31 = 1.0f;
                                    float f49 = f31 - f48;
                                    float f50 = fArr9[i19] * (f31 - ((f31 - (f49 * f49)) * (!isNaN ? 0.35f : 0.85f)));
                                    if (bArr[i19] == 2) {
                                    }
                                } else {
                                    f29 = f15;
                                    y9 = k5.y(f48, 0.08f, f29, 1.0f);
                                    if (isNaN) {
                                    }
                                    f31 = 1.0f;
                                    float f492 = f31 - f48;
                                    float f502 = fArr9[i19] * (f31 - ((f31 - (f492 * f492)) * (!isNaN ? 0.35f : 0.85f)));
                                    if (bArr[i19] == 2) {
                                    }
                                }
                            } else if (f48 < 0.35f) {
                                f29 = f15;
                                y9 = 1.0f;
                                if (isNaN && !rectF4.isEmpty()) {
                                    L = (rectF4.top - org.telegram.messenger.g0.L(56.0f)) - fArr10[i19];
                                    if (L > 0.0f) {
                                        f31 = 1.0f;
                                        y9 *= Math.max(0.0f, 1.0f - (L / org.telegram.messenger.g0.L(24.0f)));
                                        float f4922 = f31 - f48;
                                        float f5022 = fArr9[i19] * (f31 - ((f31 - (f4922 * f4922)) * (!isNaN ? 0.35f : 0.85f)));
                                        if (bArr[i19] == 2) {
                                            paint4.setColor(-1);
                                            float f51 = y9 * f21;
                                            paint4.setAlpha((int) (f51 * 0.9f));
                                            canvas2.drawCircle(fArr11[i19], fArr10[i19], f5022, paint4);
                                            paint4.setAlpha((int) (f51 * 0.22f));
                                            canvas2.drawCircle(fArr11[i19], fArr10[i19], f5022 * 2.6f, paint4);
                                            i19--;
                                            f19 = f28;
                                            f15 = f29;
                                            f16 = 3.0f;
                                            f22 = 0.0f;
                                        } else {
                                            if (rectF4.isEmpty()) {
                                                f32 = 0.0f;
                                                f33 = 0.0f;
                                            } else {
                                                float f52 = rectF4.left;
                                                float f53 = fArr11[i19];
                                                f32 = 0.0f;
                                                float max3 = Math.max(f52 - f53, Math.max(0.0f, f53 - rectF4.right));
                                                float f54 = rectF4.top;
                                                float f55 = fArr10[i19];
                                                f33 = Math.min(1.0f, Math.max(max3, Math.max(f54 - f55, Math.max(0.0f, f55 - rectF4.bottom))) / org.telegram.messenger.g0.L(36.0f));
                                            }
                                            paint4.setColor(f33 > f32 ? k(f33, fVar.y, -1) : fVar.y);
                                            paint4.setAlpha((int) (y9 * f21));
                                            canvas2.save();
                                            canvas2.rotate(fArr4[i19], fArr11[i19], fArr10[i19]);
                                            float f56 = fArr11[i19];
                                            float f57 = f5022 / 2.0f;
                                            float f58 = fArr10[i19];
                                            rectF.set(f56 - f57, f58 - f57, f56 + f57, f58 + f57);
                                            float f59 = f5022 * 0.3f;
                                            canvas2.drawRoundRect(rectF, f59, f59, paint4);
                                            if (bArr[i19] == 1) {
                                                float sin = (float) Math.sin(Math.min(1.0f, f48 * f20) * 3.141592653589793d);
                                                paint4.setColor(-1);
                                                paint4.setAlpha((int) (y9 * 200.0f * sin));
                                                canvas2.drawRoundRect(rectF, f59, f59, paint4);
                                            }
                                            canvas2.restore();
                                            i19--;
                                            f19 = f28;
                                            f15 = f29;
                                            f16 = 3.0f;
                                            f22 = 0.0f;
                                        }
                                    }
                                }
                                f31 = 1.0f;
                                float f49222 = f31 - f48;
                                float f50222 = fArr9[i19] * (f31 - ((f31 - (f49222 * f49222)) * (!isNaN ? 0.35f : 0.85f)));
                                if (bArr[i19] == 2) {
                                }
                            } else {
                                f30 = k5.y(f48, 0.35f, 0.65f, 1.0f);
                                f29 = f15;
                                y9 = f30;
                                if (isNaN) {
                                    L = (rectF4.top - org.telegram.messenger.g0.L(56.0f)) - fArr10[i19];
                                    if (L > 0.0f) {
                                    }
                                }
                                f31 = 1.0f;
                                float f492222 = f31 - f48;
                                float f502222 = fArr9[i19] * (f31 - ((f31 - (f492222 * f492222)) * (!isNaN ? 0.35f : 0.85f)));
                                if (bArr[i19] == 2) {
                                }
                            }
                        } else {
                            paint4.setColor(fVar.y);
                            paint4.setAlpha(hs.e4);
                            float f60 = fArr9[i19];
                            float f61 = fArr11[i19];
                            float f62 = f60 / 2.0f;
                            float f63 = fArr10[i19];
                            rectF.set(f61 - f62, f63 - f62, f61 + f62, f63 + f62);
                            float f64 = f60 * 0.3f;
                            canvas2.drawRoundRect(rectF, f64, f64, paint4);
                        }
                    }
                    f29 = f15;
                    f28 = f19;
                    i19--;
                    f19 = f28;
                    f15 = f29;
                    f16 = 3.0f;
                    f22 = 0.0f;
                }
            }
            f14 = 3.0f;
        } else {
            f14 = 3.0f;
        }
        f15 = 0.92f;
        int i23 = 2400;
        Random random = this.x;
        f16 = f14;
        if (i21 != 1 || (eVar4 = this.n) == null) {
            f17 = f10;
            f18 = f11;
            fVar = this;
            canvas2 = canvas;
            z10 = true;
        } else {
            z10 = true;
            if (this.o < 1.0f) {
                if (this.G) {
                    this.G = false;
                    float f65 = f12 / eVar4.b;
                    int i24 = 0;
                    loop1: while (i24 < eVar4.e) {
                        int i25 = 0;
                        while (true) {
                            int i26 = eVar4.e;
                            if (i25 < i26) {
                                if (!eVar4.h[(i26 * i24) + i25] || ((i25 >= (i17 = eVar4.j) && i25 < (i18 = eVar4.k) && i24 >= i17 && i24 < i18) || random.nextFloat() < 0.4f)) {
                                    f27 = f65;
                                    i16 = i25;
                                } else {
                                    int i27 = this.l;
                                    if (i27 >= i23) {
                                        i27 = -1;
                                    } else {
                                        this.l = i27 + 1;
                                    }
                                    if (i27 < 0) {
                                        break loop1;
                                    }
                                    float f66 = eVar4.g;
                                    float f67 = eVar4.f;
                                    float f68 = ((((i25 + 0.5f) * f67) + f66) * f65) + f10;
                                    float f69 = ((((i24 + 0.5f) * f67) + f66) * f65) + f11;
                                    float f70 = f68 - this.B;
                                    float max4 = Math.max(f34, Math.abs(f70));
                                    f27 = f65;
                                    float nextFloat = (random.nextFloat() * org.telegram.messenger.g0.L(900.0f)) + org.telegram.messenger.g0.L(1000.0f);
                                    i16 = i25;
                                    float radians = (float) Math.toRadians((random.nextFloat() - 0.5f) * 36.0f);
                                    bArr2[i27] = (byte) (random.nextFloat() < 0.12f ? 1 : 0);
                                    fArr11[i27] = f68;
                                    fArr10[i27] = f69;
                                    fArr9[i27] = ((random.nextFloat() * 0.6f) + 0.7f) * eVar4.f * f27;
                                    double d = radians;
                                    fArr8[i27] = (Math.min(1.0f, max4 / (f12 * 0.5f)) * Math.signum(f70) * nextFloat * 0.18f) + (((float) Math.sin(d)) * nextFloat);
                                    fArr7[i27] = (-((float) Math.cos(d))) * nextFloat;
                                    fArr6[i27] = (random.nextFloat() * 0.06f) + 0.24f;
                                    fArr5[i27] = (-(((eVar4.e - 1) - i24) / 4)) * 0.018f;
                                    fArr4[i27] = random.nextFloat() * 90.0f;
                                    fArr3[i27] = (random.nextFloat() - 0.5f) * 720.0f;
                                    fArr2[i27] = 1.0f;
                                }
                                i25 = i16 + 1;
                                f65 = f27;
                                i23 = 2400;
                                f34 = 1.0f;
                            }
                        }
                    }
                }
                float max5 = Math.max(0.0f, this.o / 0.92f);
                if (max5 > 0.0f) {
                    if (max5 >= 1.0f) {
                        f26 = 1.0f;
                    } else if (max5 < 0.45f) {
                        float f71 = 1.0f - (max5 / 0.45f);
                        f26 = ((1.0f - (f71 * f71)) * 0.12f) + 0.92f;
                    } else {
                        float f72 = (max5 - 0.45f) / 0.55f;
                        f26 = 1.04f - ((f16 - (f72 * 2.0f)) * ((0.04f * f72) * f72));
                    }
                    canvas.save();
                    canvas.scale(f26, f26, this.B, this.C);
                    f(canvas, this.m, f10, f11, f12, max5);
                    fVar = this;
                    canvas2 = canvas;
                    canvas2.restore();
                } else {
                    fVar = this;
                    canvas2 = canvas;
                }
                bArr = bArr2;
                rectF = rectF3;
                f19 = min;
                f20 = 1.6f;
                f21 = 255.0f;
                f22 = 0.0f;
                i19 = fVar.l - 1;
                while (i19 >= 0) {
                }
            }
            f17 = f10;
            f18 = f11;
            fVar = this;
            canvas2 = canvas;
        }
        float f73 = 0.5f;
        if (fVar.o >= 1.0f || (eVar = fVar.n) == null) {
            float f74 = f18;
            bArr = bArr2;
            rectF = rectF3;
            f19 = min;
            float f75 = f17;
            f20 = 1.6f;
            f21 = 255.0f;
            f22 = 0.0f;
            e eVar5 = fVar.m;
            int i28 = eVar5.b;
            rectF.set(f75, f74, f75 + f12, f74 + f12);
            canvas2.drawBitmap(eVar5.a, eVar5.c, rectF, paint3);
        } else {
            e eVar6 = fVar.m;
            m(eVar);
            int i29 = eVar.g;
            m(eVar6);
            Rect rect3 = eVar6.c;
            int i30 = eVar6.g;
            fVar.g(Math.max(eVar.m, eVar6.m));
            Bitmap bitmap = fVar.H;
            Bitmap bitmap2 = eVar.a;
            Paint paint5 = fVar.I;
            if (bitmap != bitmap2) {
                Bitmap bitmap3 = eVar.a;
                bArr = bArr2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint5.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
                fVar.H = eVar.a;
            } else {
                bArr = bArr2;
            }
            Bitmap bitmap4 = fVar.J;
            Bitmap bitmap5 = eVar6.a;
            Paint paint6 = fVar.K;
            if (bitmap4 != bitmap5) {
                Bitmap bitmap6 = eVar6.a;
                paint = paint5;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                paint6.setShader(new BitmapShader(bitmap6, tileMode2, tileMode2));
                fVar.J = eVar6.a;
            } else {
                paint = paint5;
            }
            float h = h(eVar, fVar.o);
            float h7 = h(eVar6, fVar.o);
            float f76 = f12 / eVar.b;
            float f77 = f12 / eVar6.b;
            int i31 = 0;
            int i32 = 0;
            while (true) {
                f19 = min;
                if (i31 >= eVar.m) {
                    break;
                }
                if (eVar.q[i31]) {
                    int[] iArr = eVar.r;
                    int i33 = i31 * 4;
                    int i34 = iArr[i33];
                    int i35 = iArr[i33 + 1];
                    i12 = i31;
                    int i36 = (i35 * eVar.e) + i34;
                    float f78 = (eVar.i[i36] * 3.2f) + ((r9 - 1) - i35);
                    if (h > f78) {
                        boolean[] zArr = fVar.s;
                        if (zArr[i36]) {
                            f25 = f77;
                            rect2 = rect3;
                            i13 = i30;
                        } else {
                            zArr[i36] = z10;
                            float f79 = i29;
                            float f80 = eVar.f;
                            float f81 = ((((i34 + 0.5f) * f80) + f79) * f76) + f17;
                            float f82 = ((((i35 + 0.5f) * f80) + f79) * f76) + f18;
                            float f83 = f80 * f76;
                            float f84 = f81 - fVar.B;
                            float f85 = f82 - fVar.C;
                            f25 = f77;
                            rect2 = rect3;
                            i13 = i30;
                            float max6 = Math.max(1.0f, (float) Math.hypot(f84, f85));
                            float f86 = f84 / max6;
                            float f87 = f85 / max6;
                            float nextFloat2 = random.nextFloat();
                            int i37 = (nextFloat2 > 0.12f ? 1 : (nextFloat2 == 0.12f ? 0 : -1));
                            int i38 = i37 < 0 ? 2 : nextFloat2 < 0.7f ? 3 : 5;
                            int i39 = 0;
                            while (i39 < i38) {
                                int i40 = i38;
                                int i41 = fVar.l;
                                int i42 = i37;
                                if (i41 >= 2400) {
                                    i41 = -1;
                                } else {
                                    fVar.l = i41 + 1;
                                }
                                if (i41 < 0) {
                                    break;
                                }
                                boolean z11 = (i39 <= 0 || random.nextFloat() >= 0.3f) ? false : z10;
                                if (z11) {
                                    i15 = i41;
                                    r62 = 2;
                                } else if (random.nextFloat() < 0.14f) {
                                    i15 = i41;
                                    r62 = z10;
                                } else {
                                    i15 = i41;
                                    r62 = 0;
                                }
                                bArr[i15] = (byte) r62;
                                fArr11[i15] = ((random.nextFloat() - 0.5f) * f83 * 0.5f) + f81;
                                fArr10[i15] = ((random.nextFloat() - 0.5f) * f83 * 0.5f) + f82;
                                if (z11) {
                                    fArr9[i15] = org.telegram.messenger.g0.N((random.nextFloat() * 0.9f) + 0.9f);
                                } else if (i39 != 0 || i42 >= 0) {
                                    fArr9[i15] = ((random.nextFloat() * 0.55f) + 0.3f) * f83;
                                } else {
                                    fArr9[i15] = ((random.nextFloat() * 0.45f) + 1.25f) * f83;
                                }
                                float nextFloat3 = (random.nextFloat() * org.telegram.messenger.g0.L(150.0f)) + org.telegram.messenger.g0.L(110.0f);
                                float nextFloat4 = (random.nextFloat() * 0.35f) + 0.45f;
                                fArr8[i15] = ((random.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(90.0f)) + (f86 * nextFloat3 * nextFloat4);
                                fArr7[i15] = a1.g.D(1.0f, nextFloat4, nextFloat3, (f87 * nextFloat3) * nextFloat4) - org.telegram.messenger.g0.L(30.0f);
                                fArr6[i15] = (random.nextFloat() * 0.2f) + 0.3f;
                                fArr5[i15] = 0.0f;
                                fArr4[i15] = random.nextFloat() * 90.0f;
                                fArr3[i15] = (random.nextFloat() - 0.5f) * 720.0f;
                                fArr2[i15] = Float.NaN;
                                i39++;
                                i38 = i40;
                                i37 = i42;
                                f86 = f86;
                            }
                        }
                    } else {
                        f25 = f77;
                        rect2 = rect3;
                        i13 = i30;
                        float min4 = 1.0f - Math.min(1.0f, (f78 - h) / 2.2f);
                        float N = min4 > 0.0f ? org.telegram.messenger.g0.N(1.4f) * ((float) Math.sin((fVar.o * 60.0f) + (i35 * 7) + (i34 * 13))) * min4 : 0.0f;
                        float N2 = org.telegram.messenger.g0.N(1.5f) * (-min4);
                        float f88 = i29;
                        i14 = i29;
                        float f89 = eVar.f;
                        float f90 = (i34 * f89) + f88;
                        float f91 = (i35 * f89) + f88;
                        float f92 = f90 + f89;
                        float f93 = f89 + f91;
                        eVar3 = eVar;
                        n(fVar.L, fVar.M, fVar.P, i32, t4.c.c(f90, f76, f17, N), t4.c.c(f91, f76, f18, N2), t4.c.c(f92, f76, f17, N), t4.c.c(f93, f76, f18, N2), f90, f91, f92, f93, (((int) com.google.android.recaptcha.internal.a.B(min4, 0.25f, 1.0f, 255.0f)) << 24) | fVar.o());
                        i32++;
                        i31 = i12 + 1;
                        min = f19;
                        rect3 = rect2;
                        f77 = f25;
                        i30 = i13;
                        i29 = i14;
                        eVar = eVar3;
                    }
                } else {
                    f25 = f77;
                    rect2 = rect3;
                    i13 = i30;
                    i12 = i31;
                }
                eVar3 = eVar;
                i14 = i29;
                i31 = i12 + 1;
                min = f19;
                rect3 = rect2;
                f77 = f25;
                i30 = i13;
                i29 = i14;
                eVar = eVar3;
            }
            float f94 = f77;
            Rect rect4 = rect3;
            int i43 = i30;
            f22 = 0.0f;
            float f95 = 3.2f;
            boolean z12 = z10;
            int i44 = 0;
            int i45 = 0;
            while (i44 < eVar6.m) {
                if (eVar6.q[i44]) {
                    int[] iArr2 = eVar6.r;
                    int i46 = i44 * 4;
                    int i47 = iArr2[i46];
                    int i48 = iArr2[i46 + 1];
                    float c2 = t4.c.c(eVar6.i[(i48 * eVar6.e) + i47], f95, (r7 - 1) - i48, 1.6f);
                    if (h7 <= c2) {
                        i11 = i44;
                        f24 = f94;
                        i10 = i43;
                        z12 = false;
                        f95 = 3.2f;
                    } else {
                        float min5 = Math.min(1.0f, (h7 - c2) / 2.4f);
                        i10 = i43;
                        float f96 = i10;
                        float f97 = eVar6.f;
                        float f98 = (i47 * f97) + f96;
                        float f99 = (i48 * f97) + f96;
                        float f100 = f98 + f97;
                        float f101 = f99 + f97;
                        float f102 = min5 - 1.0f;
                        f95 = 3.2f;
                        float f103 = (((f102 * 2.2f * f102) + (f102 * 3.2f * f102 * f102) + 1.0f) * 0.65f) + 0.35f;
                        if (min5 >= 1.0f || (min5 > 0.4f && Math.abs(f103 - 1.0f) < f13)) {
                            i11 = i44;
                            f24 = f94;
                            n(fVar.N, fVar.O, fVar.Q, i45, (f98 * f24) + f17, (f99 * f24) + f18, (f100 * f24) + f17, (f101 * f24) + f18, f98, f99, f100, f101, fVar.o() | (-16777216));
                            i45++;
                        } else {
                            float f104 = ((f98 + f100) * f73 * f94) + f17;
                            float f105 = ((f99 + f101) * f73 * f94) + f18;
                            f24 = f94;
                            float C = com.google.android.recaptcha.internal.a.C(eVar6.f, f73, f24, f103);
                            i11 = i44;
                            n(fVar.N, fVar.O, fVar.Q, i45, f104 - C, f105 - C, f104 + C, f105 + C, f98, f99, f100, f101, (((int) (Math.min(1.0f, min5 * 2.5f) * 255.0f)) << 24) | fVar.o());
                            i45++;
                            z12 = false;
                        }
                    }
                } else {
                    i11 = i44;
                    f24 = f94;
                    i10 = i43;
                }
                i44 = i11 + 1;
                i43 = i10;
                f94 = f24;
                f73 = 0.5f;
            }
            float f106 = f94;
            int i49 = i43;
            f21 = 255.0f;
            if (i32 == 0 && z12) {
                fVar.o = 1.0f;
                rectF3.set(f17, f18, f17 + f12, f18 + f12);
                canvas2.drawBitmap(eVar6.a, rect4, rectF3, paint3);
                rectF = rectF3;
                f20 = 1.6f;
            } else {
                if (i32 > 0) {
                    rectF2 = rectF3;
                    i3 = i49;
                    f23 = f106;
                    paint2 = paint3;
                    eVar2 = eVar6;
                    rect = rect4;
                    f20 = 1.6f;
                    canvas2.drawVertices(Canvas.VertexMode.TRIANGLES, i32 * 8, fVar.L, 0, fVar.M, 0, fVar.P, 0, fVar.R, 0, i32 * 6, paint);
                } else {
                    paint2 = paint3;
                    rect = rect4;
                    rectF2 = rectF3;
                    i3 = i49;
                    f23 = f106;
                    f20 = 1.6f;
                    eVar2 = eVar6;
                }
                if (i45 > 0) {
                    canvas2 = canvas;
                    canvas2.drawVertices(Canvas.VertexMode.TRIANGLES, i45 * 8, fVar.N, 0, fVar.O, 0, fVar.Q, 0, fVar.R, 0, i45 * 6, paint6);
                } else {
                    canvas2 = canvas;
                }
                float f107 = i3;
                float f108 = eVar2.j;
                float f109 = eVar2.f;
                float f110 = f23;
                float A = com.google.android.recaptcha.internal.a.A(f108, f109, f107, f110);
                float A2 = com.google.android.recaptcha.internal.a.A(eVar2.k, f109, f107, f110);
                canvas2.save();
                canvas2.clipRect(A + f10, A + f11, A2 + f10, A2 + f11);
                rectF = rectF2;
                rectF.set(f10, f11, f10 + f12, f11 + f12);
                canvas2.drawBitmap(eVar2.a, rect, rectF, paint2);
                canvas2.restore();
            }
        }
        i19 = fVar.l - 1;
        while (i19 >= 0) {
        }
    }

    public final void f(Canvas canvas, e eVar, float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float A;
        int i3;
        float f19;
        float f20;
        Paint paint;
        float f21;
        float y9;
        float f22 = f10;
        float f23 = f11;
        float f24 = f13;
        int i10 = this.q;
        Paint paint2 = this.t;
        RectF rectF = this.w;
        int i11 = 1;
        if (i10 != 2) {
            int i12 = 0;
            float f25 = 2.0f;
            float f26 = 0.05f;
            int i13 = eVar.b;
            int i14 = eVar.g;
            float f27 = f12 / i13;
            float f28 = (eVar.e - 1) / 2.0f;
            float f29 = 1.4142f * f28;
            int i15 = 0;
            while (i15 < eVar.e) {
                int i16 = i12;
                while (true) {
                    int i17 = eVar.e;
                    if (i16 < i17) {
                        int i18 = (i17 * i15) + i16;
                        if (!eVar.h[i18] || i(eVar, i16, i15)) {
                            f14 = f27;
                            f15 = f28;
                            f16 = f29;
                            f17 = f23;
                            f18 = f22;
                        } else {
                            float f30 = i16;
                            float f31 = i15;
                            float A2 = (f13 - ((eVar.i[i18] * 0.06f) + a1.g.A((float) Math.hypot(f30 - f28, f31 - f28), f29, 0.52f, f26))) / 0.367f;
                            if (A2 > 0.0f) {
                                if (A2 >= 1.0f) {
                                    A = 1.0f;
                                } else {
                                    float f32 = 1.0f - A2;
                                    A = f1.A(f32, f32, f32, 1.0f);
                                }
                                float l10 = this.q == 2 ? (0.6f * A) + 0.4f : l(A2);
                                if (this.q != 2) {
                                    A = Math.min(1.0f, A2 * 6.0f);
                                }
                                int i19 = eVar.j;
                                if (i16 < i19 || i16 >= (i3 = eVar.k) || i15 < i19 || i15 >= i3) {
                                    float f33 = i14;
                                    float f34 = eVar.f;
                                    int i20 = (int) ((f30 * f34) + f33);
                                    int i21 = (int) ((f31 * f34) + f33);
                                    float f35 = l10;
                                    float f36 = ((i16 + 1) * f34) + f33;
                                    float f37 = f28;
                                    f16 = f29;
                                    int ceil = (int) Math.ceil(f36);
                                    int ceil2 = (int) Math.ceil(((i15 + 1) * eVar.f) + f33);
                                    Rect rect = this.v;
                                    rect.set(i20, i21, ceil, ceil2);
                                    float f38 = i20 + ceil;
                                    f15 = f37;
                                    float f39 = f25;
                                    f18 = f10;
                                    float A3 = a1.g.A(f38, f39, f27, f18);
                                    float f40 = i21 + ceil2;
                                    f17 = f11;
                                    float A4 = a1.g.A(f40, f39, f27, f17);
                                    float f41 = ((ceil - i20) / f39) * f27 * f35;
                                    float f42 = ((ceil2 - i21) / f39) * f27 * f35;
                                    f14 = f27;
                                    rectF.set(A3 - f41, A4 - f42, A3 + f41, A4 + f42);
                                    paint2.setAlpha((int) (A * 255.0f));
                                    e eVar2 = this.n;
                                    canvas.drawBitmap(eVar.a, rect, rectF, paint2);
                                    paint2.setAlpha(hs.e4);
                                }
                            }
                            f18 = f10;
                            f14 = f27;
                            f15 = f28;
                            f16 = f29;
                            f17 = f11;
                        }
                        i16++;
                        f22 = f18;
                        f23 = f17;
                        f27 = f14;
                        f29 = f16;
                        f28 = f15;
                        f25 = 2.0f;
                        f26 = 0.05f;
                    }
                }
                i15++;
                f23 = f23;
                f28 = f28;
                i12 = 0;
                f25 = 2.0f;
                f26 = 0.05f;
            }
            float f43 = f23;
            float f44 = f22;
            float f45 = f12 / eVar.b;
            int i22 = 0;
            while (i22 < 3) {
                int i23 = i22 == i11 ? eVar.e - 7 : 0;
                int i24 = i22 == 2 ? eVar.e - 7 : 0;
                float f46 = f13 / 0.32f;
                if (f46 > 0.0f) {
                    float f47 = i14;
                    float f48 = eVar.f;
                    float f49 = (((i23 * f48) + f47) * f45) + f44;
                    float f50 = (((i24 * f48) + f47) * f45) + f43;
                    float f51 = ((((i23 + 7) * f48) + f47) * f45) + f44;
                    float f52 = ((((i24 + 7) * f48) + f47) * f45) + f43;
                    float l11 = l(f46);
                    canvas.save();
                    canvas.scale(l11, l11, (f49 + f51) / 2.0f, (f50 + f52) / 2.0f);
                    canvas.clipRect(f49 - 1.0f, f50 - 1.0f, f51 + 1.0f, f52 + 1.0f);
                    rectF.set(f44, f43, f44 + f12, f43 + f12);
                    paint2.setAlpha(hs.e4);
                    canvas.drawBitmap(eVar.a, eVar.c, rectF, paint2);
                    canvas.restore();
                }
                i22++;
                i11 = 1;
            }
            paint2.setAlpha(hs.e4);
            return;
        }
        m(eVar);
        int i25 = eVar.g;
        int i26 = eVar.m * 2;
        int i27 = eVar.e;
        g((i27 * i27) + i26);
        Bitmap bitmap = this.J;
        Bitmap bitmap2 = eVar.a;
        Paint paint3 = this.K;
        if (bitmap != bitmap2) {
            Bitmap bitmap3 = eVar.a;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint3.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
            this.J = eVar.a;
        }
        float f53 = f12 / eVar.b;
        float min = Math.min(1.0f, Math.max(0.0f, f24) / 0.1f);
        float f54 = eVar.f * 0.5f;
        float f55 = 1.0f;
        boolean z10 = true;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        while (i28 < eVar.m) {
            float f56 = (f24 - eVar.p[i28]) / 0.434f;
            if (f56 < 0.0f) {
                f56 = 0.0f;
            } else if (f56 > f55) {
                f56 = f55;
            }
            if (f56 < 0.5f) {
                f20 = com.google.android.recaptcha.internal.a.C(f56, 4.0f, f56, f56);
            } else {
                float f57 = (f56 * (-2.0f)) + 2.0f;
                f20 = f55 - (((f57 * f57) * f57) * 0.5f);
            }
            float f58 = (eVar.n[i28] * f53) + f22;
            float f59 = (eVar.o[i28] * f53) + f23;
            if (eVar.q[i28]) {
                float f60 = f20 > 0.75f ? 4.0f * (f20 - 0.75f) : 0.0f;
                paint = paint3;
                if (f60 < f55) {
                    float A5 = com.google.android.recaptcha.internal.a.A(f20, 0.8f, 0.2f, f54 * f53);
                    int min2 = Math.min(7, (int) ((f20 * 7.0f) + 0.5f));
                    float f61 = (f55 - f60) * min;
                    if (f61 > 0.004f) {
                        n(this.L, this.M, this.P, i29, f58 - A5, f59 - A5, f58 + A5, f59 + A5, min2 * 48, eVar.d, r7 + 48, r5 + 48, (((int) (f61 * 255.0f)) << 24) | o());
                        i29++;
                    }
                    z10 = false;
                }
                if (f60 > 0.0f) {
                    float f62 = i25;
                    int[] iArr = eVar.r;
                    float f63 = iArr[i28 * 4];
                    float f64 = eVar.f;
                    float f65 = (f63 * f64) + f62;
                    float f66 = (iArr[r5 + 1] * f64) + f62;
                    float f67 = f65 + f64;
                    float f68 = f66 + f64;
                    n(this.N, this.O, this.Q, i30, (f65 * f53) + f22, (f66 * f53) + f23, (f67 * f53) + f22, (f68 * f53) + f23, f65, f66, f67, f68, (((int) (min * 255.0f)) << 24) | o());
                    i30++;
                }
            } else {
                paint = paint3;
                float f69 = (f55 - f20) * 0.2f;
                boolean z11 = f20 < f55 ? false : z10;
                if (f20 < 0.7f) {
                    f21 = f69;
                    y9 = f55;
                } else {
                    f21 = f69;
                    y9 = k5.y(f20, 0.7f, 0.3f, f55);
                }
                float f70 = 0.9f * min * y9;
                if (f21 <= 0.01f || f70 <= 0.004f) {
                    z10 = z11;
                } else {
                    float f71 = f54 * f53 * f21;
                    n(this.L, this.M, this.P, i29, f58 - f71, f59 - f71, f58 + f71, f59 + f71, 0.0f, eVar.d, 48.0f, r5 + 48, (((int) (f70 * 255.0f)) << 24) | o());
                    z10 = z11;
                    i29++;
                }
            }
            i28++;
            f24 = f13;
            paint3 = paint;
            f55 = 1.0f;
        }
        Paint paint4 = paint3;
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, (f13 - 0.05f) / 0.45f));
        float A6 = f1.A(max, max, max, 1.0f);
        if (A6 > 0.0f) {
            int i31 = eVar.j;
            while (i31 < eVar.k) {
                int i32 = eVar.j;
                int i33 = i30;
                while (i32 < eVar.k) {
                    if (eVar.h[(eVar.e * i31) + i32]) {
                        float f72 = i25;
                        float f73 = eVar.f;
                        float f74 = (i32 * f73) + f72;
                        float f75 = (i31 * f73) + f72;
                        f19 = A6;
                        float f76 = f74 + f73;
                        float f77 = f75 + f73;
                        n(this.N, this.O, this.Q, i33, (f74 * f53) + f22, (f75 * f53) + f23, (f76 * f53) + f22, (f77 * f53) + f23, f74, f75, f76, f77, (((int) ((min * 255.0f) * f19)) << 24) | o());
                        i33++;
                    } else {
                        f19 = A6;
                    }
                    i32++;
                    A6 = f19;
                }
                i31++;
                i30 = i33;
            }
        }
        if (z10 && min >= 1.0f) {
            rectF.set(f22, f23, f22 + f12, f23 + f12);
            canvas.drawBitmap(eVar.a, eVar.c, rectF, paint2);
            return;
        }
        if (i29 > 0) {
            int i34 = i30 * 8;
            int i35 = i29 * 8;
            System.arraycopy(this.L, 0, this.N, i34, i35);
            System.arraycopy(this.M, 0, this.O, i34, i35);
            System.arraycopy(this.P, 0, this.Q, i30 * 4, i29 * 4);
        }
        int i36 = i30 + i29;
        if (i36 > 0) {
            canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i36 * 8, this.N, 0, this.O, 0, this.Q, 0, this.R, 0, i36 * 6, paint4);
        }
    }

    public final void g(int i3) {
        float[] fArr = this.L;
        if (fArr == null || fArr.length < i3 * 8) {
            int i10 = i3 * 8;
            this.L = new float[i10];
            this.M = new float[i10];
            int i11 = i3 * 4;
            this.P = new int[i11];
            this.N = new float[i10];
            this.O = new float[i10];
            this.Q = new int[i11];
            this.R = new short[i3 * 6];
            for (int i12 = 0; i12 < i3; i12++) {
                int i13 = i12 * 4;
                short[] sArr = this.R;
                int i14 = i12 * 6;
                short s6 = (short) i13;
                sArr[i14] = s6;
                sArr[i14 + 1] = (short) (i13 + 1);
                short s10 = (short) (i13 + 2);
                sArr[i14 + 2] = s10;
                sArr[i14 + 3] = s6;
                sArr[i14 + 4] = s10;
                sArr[i14 + 5] = (short) (i13 + 3);
            }
        }
    }

    public final int o() {
        return this.y & 16777215;
    }
}
