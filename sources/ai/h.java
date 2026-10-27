package ai;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.b10;
import org.telegram.ui.d3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h {
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
    public g m;
    public g n;
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
        float f7;
        float f10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            f7 = 0.5f;
            if (i11 > 1000) {
                break;
            }
            float f11 = i11 / 1000.0f;
            if (p(f11 * 0.467f) >= 0.5f) {
                f7 = f11;
                break;
            }
            i11++;
        }
        while (true) {
            f10 = 0.8f;
            if (i10 > 1000) {
                break;
            }
            float f12 = i10 / 1000.0f;
            if (p(f12 * 0.467f) >= 0.8f) {
                f10 = f12;
                break;
            }
            i10++;
        }
        S = f7;
        T = f10;
    }

    public static synchronized Bitmap b() {
        Bitmap bitmap;
        synchronized (h.class) {
            try {
                if (U == null) {
                    U = Bitmap.createBitmap(384, 48, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(U);
                    Paint paint = new Paint(1);
                    paint.setColor(-1);
                    RectF rectF = new RectF();
                    for (int i10 = 0; i10 < 8; i10++) {
                        rectF.set((i10 * 48) + 1.5f, 1.5f, (r7 + 48) - 1.5f, 46.5f);
                        float f7 = (1.0f - ((i10 * 0.7f) / 7.0f)) * 22.5f;
                        canvas.drawRoundRect(rectF, f7, f7, paint);
                    }
                }
                bitmap = U;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmap;
    }

    public static g c(String str, int i10, jc.c cVar, float f7, ColorDrawable colorDrawable) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(ec.b.a, cVar);
            hashMap.put(ec.b.c, 0);
            TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
            if (colorDrawable != null) {
                telegramQRCodeWriter.setCenterDrawable(colorDrawable);
            }
            g gVar = new g();
            Bitmap encode = telegramQRCodeWriter.encode(str, i10, i10, hashMap, null, f7, 0, -1);
            gVar.b = encode.getWidth();
            int i11 = ((lc.b) lc.c.b(str, cVar, hashMap).f).b;
            gVar.e = i11;
            gVar.f = (gVar.b - (gVar.g * 2.0f)) / i11;
            int i12 = i11 * i11;
            gVar.h = new boolean[i12];
            gVar.i = new float[i12];
            Random random = new Random(str.hashCode());
            for (int i13 = 0; i13 < gVar.e; i13++) {
                for (int i14 = 0; i14 < gVar.e; i14++) {
                    float f10 = gVar.g;
                    float f11 = i14 + 0.5f;
                    float f12 = gVar.f;
                    int i15 = (int) ((f11 * f12) + f10);
                    int a2 = (int) wh.a(i13, 0.5f, f12, f10);
                    boolean z10 = false;
                    for (int i16 = -1; i16 <= 1 && !z10; i16++) {
                        z10 = Color.alpha(encode.getPixel(Math.max(0, Math.min(gVar.b - 1, ((int) ((((float) i16) * gVar.f) * 0.3f)) + i15)), a2)) > 40;
                    }
                    boolean[] zArr = gVar.h;
                    int i17 = (gVar.e * i13) + i14;
                    zArr[i17] = z10;
                    gVar.i[i17] = random.nextFloat();
                }
            }
            Bitmap b10 = b();
            int i18 = gVar.b;
            gVar.d = i18 + 2;
            gVar.a = Bitmap.createBitmap(Math.max(i18, b10.getWidth()), gVar.d + b10.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(gVar.a);
            canvas.drawBitmap(encode, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(b10, 0.0f, gVar.d, (Paint) null);
            encode.recycle();
            gVar.a.prepareToDraw();
            Rect rect = gVar.c;
            int i19 = gVar.b;
            rect.set(0, 0, i19, i19);
            gVar.l = telegramQRCodeWriter.getImageSize();
            int round = Math.round(telegramQRCodeWriter.getImageSize() / gVar.f) + 2;
            int i20 = (gVar.e - round) / 2;
            gVar.j = i20;
            gVar.k = i20 + round;
            return gVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int d(float f7) {
        return Math.max(0, Math.min(255, Math.round(f7 * 255.0f)));
    }

    public static float h(g gVar, float f7) {
        float f10 = 1.0f - f7;
        return wh.a(gVar.e, 6.0f, 1.0f - (((f10 * 0.45f) + 0.55f) * (f10 * f10)), -1.5f);
    }

    public static boolean i(g gVar, int i10, int i11) {
        if (i10 < 7 && i11 < 7) {
            return true;
        }
        int i12 = gVar.e;
        if (i10 < i12 - 7 || i11 >= 7) {
            return i10 < 7 && i11 >= i12 - 7;
        }
        return true;
    }

    public static float j(float f7) {
        return f7 <= 0.0031308f ? f7 * 12.92f : (((float) Math.pow(f7, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int k(float f7, int i10, int i11) {
        if (f7 <= 0.0f) {
            return i10;
        }
        if (f7 >= 1.0f) {
            return i11;
        }
        float q5 = q(Color.red(i10) / 255.0f);
        float q9 = q(Color.green(i10) / 255.0f);
        float q10 = q(Color.blue(i10) / 255.0f);
        float q11 = q(Color.red(i11) / 255.0f);
        float q12 = q(Color.green(i11) / 255.0f);
        float q13 = q(Color.blue(i11) / 255.0f);
        float f10 = q10 * 0.051445995f;
        float cbrt = (float) Math.cbrt(f10 + (q9 * 0.53633255f) + (q5 * 0.41222146f));
        float f11 = q10 * 0.10739696f;
        float cbrt2 = (float) Math.cbrt(f11 + (q9 * 0.6806995f) + (q5 * 0.2119035f));
        float f12 = q10 * 0.6299787f;
        float cbrt3 = (float) Math.cbrt(f12 + (q9 * 0.28171885f) + (q5 * 0.08830246f));
        float f13 = 0.051445995f * q13;
        float cbrt4 = (float) Math.cbrt(f13 + (0.53633255f * q12) + (0.41222146f * q11));
        float f14 = 0.10739696f * q13;
        float cbrt5 = (float) Math.cbrt(f14 + (0.6806995f * q12) + (0.2119035f * q11));
        float f15 = q13 * 0.6299787f;
        float cbrt6 = (float) Math.cbrt(f15 + (q12 * 0.28171885f) + (q11 * 0.08830246f));
        float z10 = c3.h0.z(cbrt4, cbrt, f7, cbrt);
        float z11 = c3.h0.z(cbrt5, cbrt2, f7, cbrt2);
        float z12 = c3.h0.z(cbrt6, cbrt3, f7, cbrt3);
        float f16 = z10 * z10 * z10;
        float f17 = z11 * z11 * z11;
        float f18 = z12 * z12 * z12;
        return Color.argb((int) (((Color.alpha(i11) - Color.alpha(i10)) * f7) + Color.alpha(i10)), d(j((0.23096994f * f18) + ((4.0767417f * f16) - (3.3077116f * f17)))), d(j(((2.6097574f * f17) + ((-1.268438f) * f16)) - (0.34131938f * f18))), d(j((f18 * 1.7076147f) + ((f16 * (-0.0041960864f)) - (f17 * 0.7034186f)))));
    }

    public static float l(float f7) {
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        if (f7 < 0.6f) {
            float f10 = 1.0f - (f7 / 0.6f);
            return (1.0f - ((f10 * f10) * f10)) * 1.08f;
        }
        float f11 = (f7 - 0.6f) / 0.4f;
        return 1.08f - ((3.0f - (f11 * 2.0f)) * ((0.08f * f11) * f11));
    }

    public static void m(g gVar) {
        int i10;
        int i11;
        if (gVar.n != null) {
            return;
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= gVar.e) {
                break;
            }
            for (int i14 = 0; i14 < gVar.e; i14++) {
                int i15 = gVar.j;
                if (i14 < i15 || i14 >= (i11 = gVar.k) || i12 < i15 || i12 >= i11) {
                    i13++;
                }
            }
            i12++;
        }
        gVar.m = i13;
        gVar.n = new float[i13];
        gVar.o = new float[i13];
        gVar.p = new float[i13];
        gVar.q = new boolean[i13];
        gVar.r = new int[i13 * 4];
        float f7 = 1.4142f * ((r4 - 1) / 2.0f);
        int i16 = 0;
        for (int i17 = 0; i17 < gVar.e; i17++) {
            int i18 = 0;
            while (true) {
                int i19 = gVar.e;
                if (i18 < i19) {
                    int i20 = gVar.j;
                    if (i18 < i20 || i18 >= (i10 = gVar.k) || i17 < i20 || i17 >= i10) {
                        int i21 = (i19 * i17) + i18;
                        float hypot = ((float) Math.hypot(r8 - r2, r11 - r2)) / f7;
                        float f10 = gVar.i[i21] * 3.17f;
                        float floor = f10 - ((float) Math.floor(f10));
                        boolean i22 = i(gVar, i18, i17);
                        float[] fArr = gVar.n;
                        float f11 = gVar.g;
                        float f12 = gVar.f;
                        fArr[i16] = ((i18 + 0.5f) * f12) + f11;
                        gVar.o[i16] = wh.a(i17, 0.5f, f12, f11);
                        float f13 = hypot * 0.5f;
                        gVar.p[i16] = i22 ? f13 * 0.85f : f13 + (floor * 0.06f);
                        gVar.q[i16] = gVar.h[i21];
                        int[] iArr = gVar.r;
                        int i23 = i16 * 4;
                        iArr[i23] = i18;
                        iArr[i23 + 1] = i17;
                        i16++;
                    }
                    i18++;
                }
            }
        }
    }

    public static void n(float[] fArr, float[] fArr2, int[] iArr, int i10, float f7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i11) {
        int i12 = i10 * 8;
        fArr[i12] = f7;
        int i13 = i12 + 1;
        fArr[i13] = f10;
        int i14 = i12 + 2;
        fArr[i14] = f11;
        int i15 = i12 + 3;
        fArr[i15] = f10;
        int i16 = i12 + 4;
        fArr[i16] = f11;
        int i17 = i12 + 5;
        fArr[i17] = f12;
        int i18 = i12 + 6;
        fArr[i18] = f7;
        int i19 = i12 + 7;
        fArr[i19] = f12;
        fArr2[i12] = f13;
        fArr2[i13] = f14;
        fArr2[i14] = f15;
        fArr2[i15] = f14;
        fArr2[i16] = f15;
        fArr2[i17] = f16;
        fArr2[i18] = f13;
        fArr2[i19] = f16;
        int i20 = i10 * 4;
        iArr[i20] = i11;
        iArr[i20 + 1] = i11;
        iArr[i20 + 2] = i11;
        iArr[i20 + 3] = i11;
    }

    public static float p(float f7) {
        double d = f7;
        double sqrt = Math.sqrt(0.18999999999999995d) * 10.134169850289656d * d;
        return (float) Math.min(1.0d, (1.0d - (((Math.sin(sqrt) * (0.9d / Math.sqrt(0.18999999999999995d))) + Math.cos(sqrt)) * Math.exp((-9.120752865260691d) * d))) * 1.02d);
    }

    public static float q(float f7) {
        return f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public final void a(g gVar) {
        this.m = gVar;
        this.n = null;
        this.q = 2;
        this.o = 0.0f;
        this.p = 0L;
        this.E = 0L;
        this.F = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x031b, code lost:
    
        r7 = r7 + 1;
        r5 = r90;
        r9 = 2400;
        r15 = 1.0f;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0a27  */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r0v77 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, float f7, float f10, float f11) {
        float f12;
        byte[] bArr;
        float f13;
        float f14;
        h hVar;
        float f15;
        boolean z10;
        Canvas canvas2;
        RectF rectF;
        float f16;
        float f17;
        float f18;
        g gVar;
        Paint paint;
        float f19;
        RectF rectF2;
        g gVar2;
        Paint paint2;
        Rect rect;
        int i10;
        float f20;
        float f21;
        int i11;
        Paint paint3;
        float f22;
        RectF rectF3;
        g gVar3;
        float f23;
        int i12;
        g gVar4;
        int i13;
        ?? r02;
        g gVar5;
        float f24;
        float f25;
        float f26;
        int i14;
        int i15;
        int i16;
        int i17;
        float f27;
        float y3;
        float f28;
        float f29;
        float f30;
        float f31;
        float dp;
        float max;
        long currentTimeMillis = System.currentTimeMillis();
        float min = this.A == 0 ? 0.016f : Math.min(0.05f, (currentTimeMillis - r3) / 1000.0f);
        this.A = currentTimeMillis;
        if (this.m == null) {
            return;
        }
        float f32 = 1.0f;
        if (this.q == 2 && this.o < 1.0f && canvas.isHardwareAccelerated() && (Build.VERSION.SDK_INT < 29 || SharedConfig.getDevicePerformanceClass() != 2)) {
            if (this.p == 0) {
                this.p = currentTimeMillis;
            }
            this.o = 1.0f;
            this.F = false;
        }
        int i18 = this.q;
        long j10 = (i18 != 1 && i18 == 2) ? 380L : 450L;
        float f33 = this.o;
        if (f33 < 1.0f && this.p == 0) {
            this.p = currentTimeMillis;
        }
        if (i18 != 2 || (this.D < 0.0f && !this.F)) {
            f12 = 0.01f;
            if (f33 < 1.0f) {
                this.o = Math.min(1.0f, (currentTimeMillis - this.p) / j10);
            }
        } else {
            if (this.E == 0) {
                this.E = currentTimeMillis;
            }
            this.F = true;
            long j11 = currentTimeMillis - this.E;
            float[] fArr = w1.b;
            float min2 = Math.min(1.0f, j11 / Math.max(100.0f, fArr[51]));
            float f34 = fArr[53] / 100.0f;
            if (f34 > 0.01f) {
                float f35 = S;
                min2 = min2 < f34 ? (min2 * f35) / f34 : (((1.0f - f35) * (min2 - f34)) / Math.max(0.01f, 1.0f - f34)) + f35;
            }
            float p10 = p(min2 * 0.467f);
            float f36 = fArr[52];
            if (f36 > 0.0f) {
                float f37 = T;
                if (min2 > f37) {
                    float p11 = p(f37 * 0.467f);
                    float f38 = 1.0f - f37;
                    f12 = 0.01f;
                    float min3 = Math.min(((p((f37 + 0.002f) * 0.467f) - p11) / 0.002f) * f38, (1.0f - p11) * 3.0f);
                    float f39 = (min2 - f37) / f38;
                    float f40 = f39 * f39;
                    float f41 = f40 * f39;
                    float f42 = f40 * 3.0f;
                    p10 = ((((((f41 * (-2.0f)) + f42) * 1.0f) + ((((f41 - (f40 * 2.0f)) + f39) * min3) + ((((f41 * 2.0f) - f42) + 1.0f) * p11))) - p10) * f36) + p10;
                    max = Math.max(f33, min2 < 1.0f ? 1.0f : Math.min(1.0f, p10));
                    this.o = max;
                    if (max >= 1.0f) {
                        this.F = false;
                    }
                }
            }
            f12 = 0.01f;
            max = Math.max(f33, min2 < 1.0f ? 1.0f : Math.min(1.0f, p10));
            this.o = max;
            if (max >= 1.0f) {
            }
        }
        PorterDuffColorFilter porterDuffColorFilter = this.z;
        Paint paint4 = this.t;
        paint4.setColorFilter(porterDuffColorFilter);
        float f43 = f11 / 2.0f;
        this.B = f7 + f43;
        this.C = f10 + f43;
        int i19 = this.q;
        RectF rectF4 = this.w;
        float f44 = 0.3f;
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
        if (i19 == 2) {
            float f45 = this.o;
            if (f45 < 1.0f) {
                bArr = bArr2;
                f(canvas, this.m, f7, f10, f11, f45);
                hVar = this;
                canvas2 = canvas;
                f18 = 0.0f;
                rectF = rectF4;
                f16 = min;
                f17 = 1.6f;
                i17 = hVar.l - 1;
                while (i17 >= 0) {
                    float f46 = fArr5[i17] + f16;
                    fArr5[i17] = f46;
                    if (f46 >= fArr6[i17]) {
                        int i20 = hVar.l - 1;
                        hVar.l = i20;
                        fArr11[i17] = fArr11[i20];
                        fArr10[i17] = fArr10[i20];
                        fArr8[i17] = fArr8[i20];
                        fArr7[i17] = fArr7[i20];
                        fArr9[i17] = fArr9[i20];
                        fArr6[i17] = fArr6[i20];
                        fArr5[i17] = fArr5[i20];
                        fArr4[i17] = fArr4[i20];
                        fArr3[i17] = fArr3[i20];
                        fArr2[i17] = fArr2[i20];
                        bArr[i17] = bArr[i20];
                    } else {
                        boolean isNaN = Float.isNaN(fArr2[i17]);
                        Paint paint5 = hVar.u;
                        if (isNaN || fArr5[i17] >= f18) {
                            RectF rectF5 = hVar.r;
                            if (isNaN) {
                                fArr7[i17] = fArr7[i17] - (AndroidUtilities.dp(20.0f) * f16);
                                f27 = f16;
                                fArr8[i17] = c3.h0.D(f27, 2.4f, 1.0f, fArr8[i17]);
                                fArr7[i17] = c3.h0.D(f27, 3.0f, 1.0f, fArr7[i17]);
                                if (!rectF5.isEmpty() && fArr10[i17] < rectF5.top - AndroidUtilities.dp(56.0f)) {
                                    fArr7[i17] = fArr7[i17] * 0.85f;
                                }
                            } else {
                                float max2 = Math.max(f18, 1.0f - (f16 * 6.5f));
                                fArr8[i17] = fArr8[i17] * max2;
                                fArr7[i17] = (fArr7[i17] * max2) - (AndroidUtilities.dp(260.0f) * f16);
                                f27 = f16;
                            }
                            fArr11[i17] = (fArr8[i17] * f27) + fArr11[i17];
                            fArr10[i17] = (fArr7[i17] * f27) + fArr10[i17];
                            fArr4[i17] = (fArr3[i17] * f27) + fArr4[i17];
                            float f47 = fArr5[i17] / fArr6[i17];
                            if (isNaN) {
                                if (f47 < 0.08f) {
                                    f28 = f47 / 0.08f;
                                } else {
                                    y3 = org.telegram.messenger.t.y(f47, 0.08f, 0.92f, 1.0f);
                                    if (isNaN) {
                                        dp = (rectF5.top - AndroidUtilities.dp(56.0f)) - fArr10[i17];
                                        if (dp > 0.0f) {
                                        }
                                    }
                                    f29 = 1.0f;
                                    float f48 = f29 - f47;
                                    float f49 = fArr9[i17] * (f29 - ((f29 - (f48 * f48)) * (isNaN ? 0.35f : 0.85f)));
                                    if (bArr[i17] != 2) {
                                    }
                                }
                            } else if (f47 < 0.35f) {
                                y3 = 1.0f;
                                if (isNaN && !rectF5.isEmpty()) {
                                    dp = (rectF5.top - AndroidUtilities.dp(56.0f)) - fArr10[i17];
                                    if (dp > 0.0f) {
                                        f29 = 1.0f;
                                        y3 *= Math.max(0.0f, 1.0f - (dp / AndroidUtilities.dp(24.0f)));
                                        float f482 = f29 - f47;
                                        float f492 = fArr9[i17] * (f29 - ((f29 - (f482 * f482)) * (isNaN ? 0.35f : 0.85f)));
                                        if (bArr[i17] != 2) {
                                            paint5.setColor(-1);
                                            float f50 = y3 * 255.0f;
                                            paint5.setAlpha((int) (f50 * 0.9f));
                                            canvas2.drawCircle(fArr11[i17], fArr10[i17], f492, paint5);
                                            paint5.setAlpha((int) (f50 * 0.22f));
                                            canvas2.drawCircle(fArr11[i17], fArr10[i17], f492 * 2.6f, paint5);
                                            i17--;
                                            f16 = f27;
                                            f18 = 0.0f;
                                        } else {
                                            if (rectF5.isEmpty()) {
                                                f30 = 0.0f;
                                                f31 = 0.0f;
                                            } else {
                                                float f51 = rectF5.left;
                                                float f52 = fArr11[i17];
                                                f30 = 0.0f;
                                                float max3 = Math.max(f51 - f52, Math.max(0.0f, f52 - rectF5.right));
                                                float f53 = rectF5.top;
                                                float f54 = fArr10[i17];
                                                f31 = Math.min(1.0f, Math.max(max3, Math.max(f53 - f54, Math.max(0.0f, f54 - rectF5.bottom))) / AndroidUtilities.dp(36.0f));
                                            }
                                            paint5.setColor(f31 > f30 ? k(f31, hVar.y, -1) : hVar.y);
                                            paint5.setAlpha((int) (y3 * 255.0f));
                                            canvas2.save();
                                            canvas2.rotate(fArr4[i17], fArr11[i17], fArr10[i17]);
                                            float f55 = fArr11[i17];
                                            float f56 = f492 / 2.0f;
                                            float f57 = fArr10[i17];
                                            rectF.set(f55 - f56, f57 - f56, f55 + f56, f57 + f56);
                                            float f58 = f492 * f44;
                                            canvas2.drawRoundRect(rectF, f58, f58, paint5);
                                            if (bArr[i17] == 1) {
                                                float sin = (float) Math.sin(Math.min(1.0f, f47 * f17) * 3.141592653589793d);
                                                paint5.setColor(-1);
                                                paint5.setAlpha((int) (y3 * 200.0f * sin));
                                                canvas2.drawRoundRect(rectF, f58, f58, paint5);
                                            }
                                            canvas2.restore();
                                            i17--;
                                            f16 = f27;
                                            f18 = 0.0f;
                                        }
                                    }
                                }
                                f29 = 1.0f;
                                float f4822 = f29 - f47;
                                float f4922 = fArr9[i17] * (f29 - ((f29 - (f4822 * f4822)) * (isNaN ? 0.35f : 0.85f)));
                                if (bArr[i17] != 2) {
                                }
                            } else {
                                f28 = org.telegram.messenger.t.y(f47, 0.35f, 0.65f, 1.0f);
                            }
                            y3 = f28;
                            if (isNaN) {
                            }
                            f29 = 1.0f;
                            float f48222 = f29 - f47;
                            float f49222 = fArr9[i17] * (f29 - ((f29 - (f48222 * f48222)) * (isNaN ? 0.35f : 0.85f)));
                            if (bArr[i17] != 2) {
                            }
                        } else {
                            paint5.setColor(hVar.y);
                            paint5.setAlpha(255);
                            float f59 = fArr9[i17];
                            float f60 = fArr11[i17];
                            float f61 = f59 / 2.0f;
                            float f62 = fArr10[i17];
                            rectF.set(f60 - f61, f62 - f61, f60 + f61, f62 + f61);
                            float f63 = f59 * f44;
                            canvas2.drawRoundRect(rectF, f63, f63, paint5);
                        }
                    }
                    f27 = f16;
                    i17--;
                    f16 = f27;
                    f18 = 0.0f;
                }
            }
            bArr = bArr2;
            f13 = 3.0f;
        } else {
            bArr = bArr2;
            f13 = 3.0f;
        }
        float f64 = f7;
        int i21 = 2400;
        float f65 = f13;
        Random random = this.x;
        if (i19 != 1 || (gVar5 = this.n) == null) {
            f14 = f10;
            hVar = this;
            f15 = f64;
            z10 = true;
        } else {
            z10 = true;
            if (this.o < 1.0f) {
                if (this.G) {
                    this.G = false;
                    float f66 = f11 / gVar5.b;
                    int i22 = 0;
                    loop1: while (i22 < gVar5.e) {
                        int i23 = 0;
                        while (true) {
                            int i24 = gVar5.e;
                            if (i23 < i24) {
                                f24 = 0.45f;
                                if (!gVar5.h[(i24 * i22) + i23] || ((i23 >= (i15 = gVar5.j) && i23 < (i16 = gVar5.k) && i22 >= i15 && i22 < i16) || random.nextFloat() < 0.4f)) {
                                    f26 = f66;
                                    i14 = i23;
                                } else {
                                    int i25 = this.l;
                                    if (i25 >= i21) {
                                        i25 = -1;
                                    } else {
                                        this.l = i25 + 1;
                                    }
                                    if (i25 < 0) {
                                        break loop1;
                                    }
                                    float f67 = gVar5.g;
                                    float f68 = gVar5.f;
                                    float e = d3.e(i23 + 0.5f, f68, f67, f66, f64);
                                    float f69 = ((((i22 + 0.5f) * f68) + f67) * f66) + f10;
                                    float f70 = e - this.B;
                                    float max4 = Math.max(f32, Math.abs(f70));
                                    f26 = f66;
                                    float nextFloat = (random.nextFloat() * AndroidUtilities.dp(900.0f)) + AndroidUtilities.dp(1000.0f);
                                    i14 = i23;
                                    float radians = (float) Math.toRadians((random.nextFloat() - 0.5f) * 36.0f);
                                    bArr[i25] = (byte) (random.nextFloat() < 0.12f ? 1 : 0);
                                    fArr11[i25] = e;
                                    fArr10[i25] = f69;
                                    fArr9[i25] = ((random.nextFloat() * 0.6f) + 0.7f) * gVar5.f * f26;
                                    double d = radians;
                                    fArr8[i25] = (Math.min(1.0f, max4 / (f11 * 0.5f)) * Math.signum(f70) * nextFloat * 0.18f) + (((float) Math.sin(d)) * nextFloat);
                                    fArr7[i25] = (-((float) Math.cos(d))) * nextFloat;
                                    fArr6[i25] = d3.f(random, 0.06f, 0.24f);
                                    fArr5[i25] = (-(((gVar5.e - 1) - i22) / 4)) * 0.018f;
                                    fArr4[i25] = random.nextFloat() * 90.0f;
                                    fArr3[i25] = (random.nextFloat() - 0.5f) * 720.0f;
                                    fArr2[i25] = 1.0f;
                                }
                                i23 = i14 + 1;
                                f64 = f7;
                                f66 = f26;
                                i21 = 2400;
                                f32 = 1.0f;
                            }
                        }
                    }
                }
                f24 = 0.45f;
                float max5 = Math.max(0.0f, this.o / 0.92f);
                if (max5 > 0.0f) {
                    if (max5 >= 1.0f) {
                        f25 = 1.0f;
                    } else if (max5 < f24) {
                        float f71 = 1.0f - (max5 / f24);
                        f25 = ((1.0f - (f71 * f71)) * 0.12f) + 0.92f;
                    } else {
                        float f72 = (max5 - f24) / 0.55f;
                        f25 = 1.04f - ((f65 - (f72 * 2.0f)) * ((0.04f * f72) * f72));
                    }
                    canvas.save();
                    canvas.scale(f25, f25, this.B, this.C);
                    f(canvas, this.m, f7, f10, f11, max5);
                    hVar = this;
                    canvas.restore();
                } else {
                    hVar = this;
                }
                canvas2 = canvas;
                rectF = rectF4;
                f16 = min;
                f17 = 1.6f;
                f18 = 0.0f;
                i17 = hVar.l - 1;
                while (i17 >= 0) {
                }
            }
            f14 = f10;
            hVar = this;
            f15 = f64;
        }
        float f73 = 0.5f;
        float f74 = 0.45f;
        if (hVar.o >= 1.0f || (gVar = hVar.n) == null) {
            canvas2 = canvas;
            float f75 = f14;
            rectF = rectF4;
            f16 = min;
            float f76 = f15;
            f17 = 1.6f;
            f18 = 0.0f;
            g gVar6 = hVar.m;
            int i26 = gVar6.b;
            rectF.set(f76, f75, f76 + f11, f75 + f11);
            canvas2.drawBitmap(gVar6.a, gVar6.c, rectF, paint4);
        } else {
            g gVar7 = hVar.m;
            m(gVar);
            int i27 = gVar.g;
            m(gVar7);
            Rect rect2 = gVar7.c;
            int i28 = gVar7.g;
            hVar.g(Math.max(gVar.m, gVar7.m));
            Bitmap bitmap = hVar.H;
            Bitmap bitmap2 = gVar.a;
            Paint paint6 = hVar.I;
            if (bitmap != bitmap2) {
                Bitmap bitmap3 = gVar.a;
                f16 = min;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint6.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
                hVar.H = gVar.a;
            } else {
                f16 = min;
            }
            Bitmap bitmap4 = hVar.J;
            Bitmap bitmap5 = gVar7.a;
            Paint paint7 = hVar.K;
            if (bitmap4 != bitmap5) {
                Bitmap bitmap6 = gVar7.a;
                paint = paint6;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                paint7.setShader(new BitmapShader(bitmap6, tileMode2, tileMode2));
                hVar.J = gVar7.a;
            } else {
                paint = paint6;
            }
            float h = h(gVar, hVar.o);
            float h10 = h(gVar7, hVar.o);
            float f77 = f11 / gVar.b;
            float f78 = f11 / gVar7.b;
            int i29 = 0;
            int i30 = 0;
            while (i29 < gVar.m) {
                if (gVar.q[i29]) {
                    int[] iArr = gVar.r;
                    int i31 = i29 * 4;
                    int i32 = iArr[i31];
                    int i33 = iArr[i31 + 1];
                    i11 = i29;
                    int i34 = (i33 * gVar.e) + i32;
                    float f79 = (gVar.i[i34] * 3.2f) + ((r9 - 1) - i33);
                    if (h > f79) {
                        boolean[] zArr = hVar.s;
                        if (zArr[i34]) {
                            paint3 = paint4;
                            f22 = f78;
                        } else {
                            zArr[i34] = z10;
                            float f80 = i27;
                            paint3 = paint4;
                            float f81 = gVar.f;
                            float e10 = d3.e(i32 + 0.5f, f81, f80, f77, f15);
                            float f82 = ((((i33 + 0.5f) * f81) + f80) * f77) + f14;
                            float f83 = f81 * f77;
                            float f84 = e10 - hVar.B;
                            float f85 = f82 - hVar.C;
                            rectF3 = rectF4;
                            f22 = f78;
                            float max6 = Math.max(1.0f, (float) Math.hypot(f84, f85));
                            float f86 = f84 / max6;
                            float f87 = f85 / max6;
                            float nextFloat2 = random.nextFloat();
                            int i35 = nextFloat2 < 0.12f ? 2 : nextFloat2 < 0.7f ? 3 : 5;
                            int i36 = 0;
                            while (i36 < i35) {
                                float f88 = f87;
                                int i37 = hVar.l;
                                float f89 = f83;
                                if (i37 >= 2400) {
                                    i37 = -1;
                                } else {
                                    hVar.l = i37 + 1;
                                }
                                if (i37 < 0) {
                                    break;
                                }
                                boolean z11 = (i36 <= 0 || random.nextFloat() >= f44) ? false : z10;
                                if (z11) {
                                    i13 = i37;
                                    r02 = 2;
                                } else if (random.nextFloat() < 0.14f) {
                                    i13 = i37;
                                    r02 = z10;
                                } else {
                                    i13 = i37;
                                    r02 = 0;
                                }
                                bArr[i13] = (byte) r02;
                                fArr11[i13] = ((random.nextFloat() - 0.5f) * f89 * 0.5f) + e10;
                                fArr10[i13] = ((random.nextFloat() - 0.5f) * f89 * 0.5f) + f82;
                                if (z11) {
                                    fArr9[i13] = AndroidUtilities.dpf2((random.nextFloat() * 0.9f) + 0.9f);
                                } else if (i36 != 0 || nextFloat2 >= 0.12f) {
                                    fArr9[i13] = ((random.nextFloat() * 0.55f) + f44) * f89;
                                } else {
                                    fArr9[i13] = ((random.nextFloat() * f74) + 1.25f) * f89;
                                }
                                float nextFloat3 = (random.nextFloat() * AndroidUtilities.dp(150.0f)) + AndroidUtilities.dp(110.0f);
                                float f90 = f86;
                                float f91 = d3.f(random, 0.35f, f74);
                                fArr8[i13] = ((random.nextFloat() - 0.5f) * AndroidUtilities.dp(90.0f)) + (f90 * nextFloat3 * f91);
                                fArr7[i13] = ic.a.d(1.0f, f91, nextFloat3, (f88 * nextFloat3) * f91) - AndroidUtilities.dp(30.0f);
                                fArr6[i13] = d3.f(random, 0.2f, f44);
                                fArr5[i13] = 0.0f;
                                fArr4[i13] = random.nextFloat() * 90.0f;
                                fArr3[i13] = (random.nextFloat() - 0.5f) * 720.0f;
                                fArr2[i13] = Float.NaN;
                                i36++;
                                i35 = i35;
                                f87 = f88;
                                f83 = f89;
                                f86 = f90;
                                f74 = 0.45f;
                            }
                            gVar4 = gVar;
                            i12 = i27;
                            i29 = i11 + 1;
                            i27 = i12;
                            paint4 = paint3;
                            rectF4 = rectF3;
                            f78 = f22;
                            gVar = gVar4;
                            f44 = 0.3f;
                            f74 = 0.45f;
                        }
                    } else {
                        paint3 = paint4;
                        f22 = f78;
                        rectF3 = rectF4;
                        float min4 = 1.0f - Math.min(1.0f, (f79 - h) / 2.2f);
                        if (min4 > 0.0f) {
                            gVar3 = gVar;
                            f23 = AndroidUtilities.dpf2(1.4f) * ((float) Math.sin((hVar.o * 60.0f) + (i33 * 7) + (i32 * 13))) * min4;
                        } else {
                            gVar3 = gVar;
                            f23 = 0.0f;
                        }
                        float dpf2 = AndroidUtilities.dpf2(1.5f) * (-min4);
                        float f92 = i27;
                        float f93 = i32;
                        float f94 = gVar3.f;
                        float f95 = (f93 * f94) + f92;
                        float f96 = (i33 * f94) + f92;
                        float f97 = f95 + f94;
                        i12 = i27;
                        float f98 = f96 + f94;
                        gVar4 = gVar3;
                        n(hVar.L, hVar.M, hVar.P, i30, b10.e(f95, f77, f15, f23), b10.e(f96, f77, f14, dpf2), b10.e(f97, f77, f15, f23), b10.e(f98, f77, f14, dpf2), f95, f96, f97, f98, (((int) c3.h0.D(min4, 0.25f, 1.0f, 255.0f)) << 24) | hVar.o());
                        i30++;
                        i29 = i11 + 1;
                        i27 = i12;
                        paint4 = paint3;
                        rectF4 = rectF3;
                        f78 = f22;
                        gVar = gVar4;
                        f44 = 0.3f;
                        f74 = 0.45f;
                    }
                } else {
                    paint3 = paint4;
                    f22 = f78;
                    i11 = i29;
                }
                rectF3 = rectF4;
                gVar4 = gVar;
                i12 = i27;
                i29 = i11 + 1;
                i27 = i12;
                paint4 = paint3;
                rectF4 = rectF3;
                f78 = f22;
                gVar = gVar4;
                f44 = 0.3f;
                f74 = 0.45f;
            }
            Paint paint8 = paint4;
            RectF rectF6 = rectF4;
            f18 = 0.0f;
            float f99 = 3.2f;
            boolean z12 = z10;
            int i38 = 0;
            int i39 = 0;
            while (true) {
                f19 = f78;
                if (i38 >= gVar7.m) {
                    break;
                }
                if (gVar7.q[i38]) {
                    int[] iArr2 = gVar7.r;
                    int i40 = i38 * 4;
                    int i41 = iArr2[i40];
                    int i42 = iArr2[i40 + 1];
                    float e11 = b10.e(gVar7.i[(i42 * gVar7.e) + i41], f99, (r5 - 1) - i42, 1.6f);
                    if (h10 <= e11) {
                        f21 = f73;
                        f78 = f19;
                        z12 = false;
                        f99 = 3.2f;
                    } else {
                        float min5 = Math.min(1.0f, (h10 - e11) / 2.4f);
                        float f100 = i28;
                        float f101 = gVar7.f;
                        float f102 = (i41 * f101) + f100;
                        float f103 = (i42 * f101) + f100;
                        float f104 = f102 + f101;
                        float f105 = f103 + f101;
                        float f106 = min5 - 1.0f;
                        f99 = 3.2f;
                        float f107 = (((f106 * 2.2f * f106) + (f106 * 3.2f * f106 * f106) + 1.0f) * 0.65f) + 0.35f;
                        if (min5 >= 1.0f || (min5 > 0.4f && Math.abs(f107 - 1.0f) < f12)) {
                            f21 = f73;
                            f78 = f19;
                            n(hVar.N, hVar.O, hVar.Q, i39, (f102 * f78) + f15, (f103 * f78) + f14, (f104 * f78) + f15, (f105 * f78) + f14, f102, f103, f104, f105, hVar.o() | (-16777216));
                            i39++;
                        } else {
                            float f108 = ((f102 + f104) * f73 * f19) + f15;
                            float f109 = ((f103 + f105) * f73 * f19) + f14;
                            f21 = f73;
                            f78 = f19;
                            float E = c3.h0.E(gVar7.f, f21, f78, f107);
                            n(hVar.N, hVar.O, hVar.Q, i39, f108 - E, f109 - E, f108 + E, f109 + E, f102, f103, f104, f105, (((int) (Math.min(1.0f, min5 * 2.5f) * 255.0f)) << 24) | hVar.o());
                            i39++;
                            z12 = false;
                        }
                    }
                } else {
                    f21 = f73;
                    f78 = f19;
                }
                i38++;
                f73 = f21;
            }
            if (i30 == 0 && z12) {
                hVar.o = 1.0f;
                rectF6.set(f15, f14, f15 + f11, f14 + f11);
                canvas.drawBitmap(gVar7.a, rect2, rectF6, paint8);
                canvas2 = canvas;
                rectF = rectF6;
                f17 = 1.6f;
                f44 = 0.3f;
            } else {
                if (i30 > 0) {
                    i10 = i28;
                    rect = rect2;
                    paint2 = paint8;
                    rectF2 = rectF6;
                    f20 = f19;
                    f17 = 1.6f;
                    f44 = 0.3f;
                    gVar2 = gVar7;
                    canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i30 * 8, hVar.L, 0, hVar.M, 0, hVar.P, 0, hVar.R, 0, i30 * 6, paint);
                } else {
                    rectF2 = rectF6;
                    gVar2 = gVar7;
                    paint2 = paint8;
                    rect = rect2;
                    i10 = i28;
                    f20 = f19;
                    f17 = 1.6f;
                    f44 = 0.3f;
                }
                if (i39 > 0) {
                    canvas2 = canvas;
                    canvas2.drawVertices(Canvas.VertexMode.TRIANGLES, i39 * 8, hVar.N, 0, hVar.O, 0, hVar.Q, 0, hVar.R, 0, i39 * 6, paint7);
                } else {
                    canvas2 = canvas;
                }
                float f110 = i10;
                float f111 = gVar2.j;
                float f112 = gVar2.f;
                float f113 = f20;
                float C = c3.h0.C(f111, f112, f110, f113);
                float C2 = c3.h0.C(gVar2.k, f112, f110, f113);
                canvas2.save();
                canvas2.clipRect(C + f7, C + f10, C2 + f7, C2 + f10);
                rectF = rectF2;
                rectF.set(f7, f10, f7 + f11, f10 + f11);
                canvas2.drawBitmap(gVar2.a, rect, rectF, paint2);
                canvas2.restore();
            }
        }
        i17 = hVar.l - 1;
        while (i17 >= 0) {
        }
    }

    public final void f(Canvas canvas, g gVar, float f7, float f10, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float A;
        int i10;
        float f18;
        float f19;
        Paint paint;
        float f20;
        float y3;
        float f21 = f7;
        float f22 = f10;
        float f23 = f12;
        int i11 = this.q;
        Paint paint2 = this.t;
        RectF rectF = this.w;
        int i12 = 1;
        if (i11 != 2) {
            int i13 = 0;
            float f24 = 2.0f;
            float f25 = 0.05f;
            int i14 = gVar.b;
            int i15 = gVar.g;
            float f26 = f11 / i14;
            float f27 = (gVar.e - 1) / 2.0f;
            float f28 = 1.4142f * f27;
            int i16 = 0;
            while (i16 < gVar.e) {
                int i17 = i13;
                while (true) {
                    int i18 = gVar.e;
                    if (i17 < i18) {
                        int i19 = (i18 * i16) + i17;
                        if (!gVar.h[i19] || i(gVar, i17, i16)) {
                            f13 = f26;
                            f14 = f27;
                            f15 = f28;
                            f16 = f22;
                            f17 = f21;
                        } else {
                            float f29 = i17;
                            float f30 = i16;
                            float c10 = (f12 - ((gVar.i[i19] * 0.06f) + a1.g.c((float) Math.hypot(f29 - f27, f30 - f27), f28, 0.52f, f25))) / 0.367f;
                            if (c10 > 0.0f) {
                                if (c10 >= 1.0f) {
                                    A = 1.0f;
                                } else {
                                    float f31 = 1.0f - c10;
                                    A = d3.A(f31, f31, f31, 1.0f);
                                }
                                float l4 = this.q == 2 ? (0.6f * A) + 0.4f : l(c10);
                                if (this.q != 2) {
                                    A = Math.min(1.0f, c10 * 6.0f);
                                }
                                int i20 = gVar.j;
                                if (i17 < i20 || i17 >= (i10 = gVar.k) || i16 < i20 || i16 >= i10) {
                                    float f32 = i15;
                                    float f33 = gVar.f;
                                    int i21 = (int) ((f29 * f33) + f32);
                                    int i22 = (int) ((f30 * f33) + f32);
                                    float f34 = l4;
                                    float f35 = ((i17 + 1) * f33) + f32;
                                    float f36 = f27;
                                    f15 = f28;
                                    int ceil = (int) Math.ceil(f35);
                                    int ceil2 = (int) Math.ceil(((i16 + 1) * gVar.f) + f32);
                                    Rect rect = this.v;
                                    rect.set(i21, i22, ceil, ceil2);
                                    float f37 = i21 + ceil;
                                    f14 = f36;
                                    float f38 = f24;
                                    f17 = f7;
                                    float c11 = a1.g.c(f37, f38, f26, f17);
                                    float f39 = i22 + ceil2;
                                    f16 = f10;
                                    float c12 = a1.g.c(f39, f38, f26, f16);
                                    float f40 = ((ceil - i21) / f38) * f26 * f34;
                                    float f41 = ((ceil2 - i22) / f38) * f26 * f34;
                                    f13 = f26;
                                    rectF.set(c11 - f40, c12 - f41, c11 + f40, c12 + f41);
                                    paint2.setAlpha((int) (A * 255.0f));
                                    g gVar2 = this.n;
                                    canvas.drawBitmap(gVar.a, rect, rectF, paint2);
                                    paint2.setAlpha(255);
                                }
                            }
                            f17 = f7;
                            f13 = f26;
                            f14 = f27;
                            f15 = f28;
                            f16 = f10;
                        }
                        i17++;
                        f21 = f17;
                        f22 = f16;
                        f26 = f13;
                        f28 = f15;
                        f27 = f14;
                        f24 = 2.0f;
                        f25 = 0.05f;
                    }
                }
                i16++;
                f22 = f22;
                f27 = f27;
                i13 = 0;
                f24 = 2.0f;
                f25 = 0.05f;
            }
            float f42 = f22;
            float f43 = f21;
            float f44 = f11 / gVar.b;
            int i23 = 0;
            while (i23 < 3) {
                int i24 = i23 == i12 ? gVar.e - 7 : 0;
                int i25 = i23 == 2 ? gVar.e - 7 : 0;
                float f45 = f12 / 0.32f;
                if (f45 > 0.0f) {
                    float f46 = i15;
                    float f47 = gVar.f;
                    float e = d3.e(i24, f47, f46, f44, f43);
                    float e10 = d3.e(i25, f47, f46, f44, f42);
                    float e11 = d3.e(i24 + 7, f47, f46, f44, f43);
                    float e12 = d3.e(i25 + 7, f47, f46, f44, f42);
                    float l10 = l(f45);
                    canvas.save();
                    canvas.scale(l10, l10, (e + e11) / 2.0f, (e10 + e12) / 2.0f);
                    canvas.clipRect(e - 1.0f, e10 - 1.0f, e11 + 1.0f, e12 + 1.0f);
                    rectF.set(f43, f42, f43 + f11, f42 + f11);
                    paint2.setAlpha(255);
                    canvas.drawBitmap(gVar.a, gVar.c, rectF, paint2);
                    canvas.restore();
                }
                i23++;
                i12 = 1;
            }
            paint2.setAlpha(255);
            return;
        }
        m(gVar);
        int i26 = gVar.g;
        int i27 = gVar.m * 2;
        int i28 = gVar.e;
        g((i28 * i28) + i27);
        Bitmap bitmap = this.J;
        Bitmap bitmap2 = gVar.a;
        Paint paint3 = this.K;
        if (bitmap != bitmap2) {
            Bitmap bitmap3 = gVar.a;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint3.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
            this.J = gVar.a;
        }
        float f48 = f11 / gVar.b;
        float min = Math.min(1.0f, Math.max(0.0f, f23) / 0.1f);
        float f49 = gVar.f * 0.5f;
        float f50 = 1.0f;
        boolean z10 = true;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        while (i29 < gVar.m) {
            float f51 = (f23 - gVar.p[i29]) / 0.434f;
            if (f51 < 0.0f) {
                f51 = 0.0f;
            } else if (f51 > f50) {
                f51 = f50;
            }
            if (f51 < 0.5f) {
                f19 = c3.h0.E(f51, 4.0f, f51, f51);
            } else {
                float f52 = (f51 * (-2.0f)) + 2.0f;
                f19 = f50 - (((f52 * f52) * f52) * 0.5f);
            }
            float f53 = (gVar.n[i29] * f48) + f21;
            float f54 = (gVar.o[i29] * f48) + f22;
            if (gVar.q[i29]) {
                float f55 = f19 > 0.75f ? 4.0f * (f19 - 0.75f) : 0.0f;
                paint = paint3;
                if (f55 < f50) {
                    float C = c3.h0.C(f19, 0.8f, 0.2f, f49 * f48);
                    int min2 = Math.min(7, (int) ((f19 * 7.0f) + 0.5f));
                    float f56 = (f50 - f55) * min;
                    if (f56 > 0.004f) {
                        n(this.L, this.M, this.P, i30, f53 - C, f54 - C, f53 + C, f54 + C, min2 * 48, gVar.d, r7 + 48, r5 + 48, (((int) (f56 * 255.0f)) << 24) | o());
                        i30++;
                    }
                    z10 = false;
                }
                if (f55 > 0.0f) {
                    float f57 = i26;
                    int[] iArr = gVar.r;
                    float f58 = iArr[i29 * 4];
                    float f59 = gVar.f;
                    float f60 = (f58 * f59) + f57;
                    float f61 = (iArr[r5 + 1] * f59) + f57;
                    float f62 = f60 + f59;
                    float f63 = f61 + f59;
                    n(this.N, this.O, this.Q, i31, (f60 * f48) + f21, (f61 * f48) + f22, (f62 * f48) + f21, (f63 * f48) + f22, f60, f61, f62, f63, (((int) (min * 255.0f)) << 24) | o());
                    i31++;
                }
            } else {
                paint = paint3;
                float f64 = (f50 - f19) * 0.2f;
                boolean z11 = f19 < f50 ? false : z10;
                if (f19 < 0.7f) {
                    f20 = f64;
                    y3 = f50;
                } else {
                    f20 = f64;
                    y3 = org.telegram.messenger.t.y(f19, 0.7f, 0.3f, f50);
                }
                float f65 = 0.9f * min * y3;
                if (f20 <= 0.01f || f65 <= 0.004f) {
                    z10 = z11;
                } else {
                    float f66 = f49 * f48 * f20;
                    n(this.L, this.M, this.P, i30, f53 - f66, f54 - f66, f53 + f66, f54 + f66, 0.0f, gVar.d, 48.0f, r5 + 48, (((int) (f65 * 255.0f)) << 24) | o());
                    z10 = z11;
                    i30++;
                }
            }
            i29++;
            f23 = f12;
            paint3 = paint;
            f50 = 1.0f;
        }
        Paint paint4 = paint3;
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, (f12 - 0.05f) / 0.45f));
        float A2 = d3.A(max, max, max, 1.0f);
        if (A2 > 0.0f) {
            int i32 = gVar.j;
            while (i32 < gVar.k) {
                int i33 = gVar.j;
                int i34 = i31;
                while (i33 < gVar.k) {
                    if (gVar.h[(gVar.e * i32) + i33]) {
                        float f67 = i26;
                        float f68 = gVar.f;
                        float f69 = (i33 * f68) + f67;
                        float f70 = (i32 * f68) + f67;
                        f18 = A2;
                        float f71 = f69 + f68;
                        float f72 = f70 + f68;
                        n(this.N, this.O, this.Q, i34, (f69 * f48) + f21, (f70 * f48) + f22, (f71 * f48) + f21, (f72 * f48) + f22, f69, f70, f71, f72, (((int) ((min * 255.0f) * f18)) << 24) | o());
                        i34++;
                    } else {
                        f18 = A2;
                    }
                    i33++;
                    A2 = f18;
                }
                i32++;
                i31 = i34;
            }
        }
        if (z10 && min >= 1.0f) {
            rectF.set(f21, f22, f21 + f11, f22 + f11);
            canvas.drawBitmap(gVar.a, gVar.c, rectF, paint2);
            return;
        }
        if (i30 > 0) {
            int i35 = i31 * 8;
            int i36 = i30 * 8;
            System.arraycopy(this.L, 0, this.N, i35, i36);
            System.arraycopy(this.M, 0, this.O, i35, i36);
            System.arraycopy(this.P, 0, this.Q, i31 * 4, i30 * 4);
        }
        int i37 = i31 + i30;
        if (i37 > 0) {
            canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i37 * 8, this.N, 0, this.O, 0, this.Q, 0, this.R, 0, i37 * 6, paint4);
        }
    }

    public final void g(int i10) {
        float[] fArr = this.L;
        if (fArr == null || fArr.length < i10 * 8) {
            int i11 = i10 * 8;
            this.L = new float[i11];
            this.M = new float[i11];
            int i12 = i10 * 4;
            this.P = new int[i12];
            this.N = new float[i11];
            this.O = new float[i11];
            this.Q = new int[i12];
            this.R = new short[i10 * 6];
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 4;
                short[] sArr = this.R;
                int i15 = i13 * 6;
                short s10 = (short) i14;
                sArr[i15] = s10;
                sArr[i15 + 1] = (short) (i14 + 1);
                short s11 = (short) (i14 + 2);
                sArr[i15 + 2] = s11;
                sArr[i15 + 3] = s10;
                sArr[i15 + 4] = s11;
                sArr[i15 + 5] = (short) (i14 + 3);
            }
        }
    }

    public final int o() {
        return this.y & 16777215;
    }
}
