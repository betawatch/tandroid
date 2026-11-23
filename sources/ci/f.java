package ci;

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
import com.google.android.gms.internal.vision.e2;
import java.util.HashMap;
import java.util.Random;
import org.telegram.messenger.cz;
import org.telegram.messenger.f3;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        int i7 = 0;
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
            if (i7 > 1000) {
                break;
            }
            float f13 = i7 / 1000.0f;
            if (p(f13 * 0.467f) >= 0.8f) {
                f11 = f13;
                break;
            }
            i7++;
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
                    for (int i7 = 0; i7 < 8; i7++) {
                        rectF.set((i7 * 48) + 1.5f, 1.5f, (r7 + 48) - 1.5f, 46.5f);
                        float f10 = (1.0f - ((i7 * 0.7f) / 7.0f)) * 22.5f;
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

    public static e c(String str, int i7, gc.b bVar, float f10, ColorDrawable colorDrawable) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(bc.b.a, bVar);
            hashMap.put(bc.b.c, 0);
            ji.s sVar = new ji.s(1);
            if (colorDrawable != null) {
                sVar.g = colorDrawable;
            }
            e eVar = new e();
            Bitmap a10 = sVar.a(str, i7, i7, hashMap, null, f10, 0, -1);
            eVar.b = a10.getWidth();
            int i10 = ((cc.c) ic.b.b(str, bVar, hashMap).f).b;
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
                    int b10 = (int) o10.b(i12, 0.5f, f13, f11);
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
            int i19 = sVar.e;
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
        return Math.max(0, Math.min(ls.e4, Math.round(f10 * 255.0f)));
    }

    public static float h(e eVar, float f10) {
        float f11 = 1.0f - f10;
        return o10.b(eVar.e, 6.0f, 1.0f - (((f11 * 0.45f) + 0.55f) * (f11 * f11)), -1.5f);
    }

    public static boolean i(e eVar, int i7, int i10) {
        if (i7 < 7 && i10 < 7) {
            return true;
        }
        int i11 = eVar.e;
        if (i7 < i11 - 7 || i10 >= 7) {
            return i7 < 7 && i10 >= i11 - 7;
        }
        return true;
    }

    public static float j(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (((float) Math.pow(f10, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int k(float f10, int i7, int i10) {
        if (f10 <= 0.0f) {
            return i7;
        }
        if (f10 >= 1.0f) {
            return i10;
        }
        float q10 = q(Color.red(i7) / 255.0f);
        float q11 = q(Color.green(i7) / 255.0f);
        float q12 = q(Color.blue(i7) / 255.0f);
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
        float z10 = e2.z(cbrt4, cbrt, f10, cbrt);
        float z11 = e2.z(cbrt5, cbrt2, f10, cbrt2);
        float z12 = e2.z(cbrt6, cbrt3, f10, cbrt3);
        float f17 = z10 * z10 * z10;
        float f18 = z11 * z11 * z11;
        float f19 = z12 * z12 * z12;
        return Color.argb((int) (((Color.alpha(i10) - Color.alpha(i7)) * f10) + Color.alpha(i7)), d(j((0.23096994f * f19) + ((4.0767417f * f17) - (3.3077116f * f18)))), d(j(((2.6097574f * f18) + ((-1.268438f) * f17)) - (0.34131938f * f19))), d(j((f19 * 1.7076147f) + ((f17 * (-0.0041960864f)) - (f18 * 0.7034186f)))));
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
        int i7;
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
                    if (i17 < i19 || i17 >= (i7 = eVar.k) || i16 < i19 || i16 >= i7) {
                        int i20 = (i18 * i16) + i17;
                        float hypot = ((float) Math.hypot(r8 - r2, r11 - r2)) / f10;
                        float f11 = eVar.i[i20] * 3.17f;
                        float floor = f11 - ((float) Math.floor(f11));
                        boolean i21 = i(eVar, i17, i16);
                        float[] fArr = eVar.n;
                        float f12 = eVar.g;
                        float f13 = eVar.f;
                        fArr[i15] = ((i17 + 0.5f) * f13) + f12;
                        eVar.o[i15] = o10.b(i16, 0.5f, f13, f12);
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

    public static void n(float[] fArr, float[] fArr2, int[] iArr, int i7, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i10) {
        int i11 = i7 * 8;
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
        int i19 = i7 * 4;
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
    public final void e(Canvas canvas, float f10, float f11, float f12) {
        float f13;
        byte[] bArr;
        float f14;
        float f15;
        f fVar;
        float f16;
        boolean z10;
        Canvas canvas2;
        RectF rectF;
        float f17;
        float f18;
        float f19;
        e eVar;
        Paint paint;
        float f20;
        RectF rectF2;
        e eVar2;
        Paint paint2;
        Rect rect;
        int i7;
        float f21;
        float f22;
        int i10;
        Paint paint3;
        float f23;
        RectF rectF3;
        e eVar3;
        float f24;
        int i11;
        e eVar4;
        int i12;
        ?? r02;
        e eVar5;
        float f25;
        float f26;
        float f27;
        int i13;
        int i14;
        int i15;
        int i16;
        float f28;
        float y10;
        float f29;
        float f30;
        float f31;
        float f32;
        float L;
        float max;
        long currentTimeMillis = System.currentTimeMillis();
        float min = this.A == 0 ? 0.016f : Math.min(0.05f, (currentTimeMillis - r3) / 1000.0f);
        this.A = currentTimeMillis;
        if (this.m == null) {
            return;
        }
        float f33 = 1.0f;
        if (this.q == 2 && this.o < 1.0f && canvas.isHardwareAccelerated() && (Build.VERSION.SDK_INT < 29 || cz.o() != 2)) {
            if (this.p == 0) {
                this.p = currentTimeMillis;
            }
            this.o = 1.0f;
            this.F = false;
        }
        int i17 = this.q;
        long j3 = (i17 != 1 && i17 == 2) ? 380L : 450L;
        float f34 = this.o;
        if (f34 < 1.0f && this.p == 0) {
            this.p = currentTimeMillis;
        }
        if (i17 != 2 || (this.D < 0.0f && !this.F)) {
            f13 = 0.01f;
            if (f34 < 1.0f) {
                this.o = Math.min(1.0f, (currentTimeMillis - this.p) / j3);
            }
        } else {
            if (this.E == 0) {
                this.E = currentTimeMillis;
            }
            this.F = true;
            long j10 = currentTimeMillis - this.E;
            float[] fArr = c1.b;
            float min2 = Math.min(1.0f, j10 / Math.max(100.0f, fArr[51]));
            float f35 = fArr[53] / 100.0f;
            if (f35 > 0.01f) {
                float f36 = S;
                min2 = min2 < f35 ? (min2 * f36) / f35 : (((1.0f - f36) * (min2 - f35)) / Math.max(0.01f, 1.0f - f35)) + f36;
            }
            float p10 = p(min2 * 0.467f);
            float f37 = fArr[52];
            if (f37 > 0.0f) {
                float f38 = T;
                if (min2 > f38) {
                    float p11 = p(f38 * 0.467f);
                    float f39 = 1.0f - f38;
                    f13 = 0.01f;
                    float min3 = Math.min(((p((f38 + 0.002f) * 0.467f) - p11) / 0.002f) * f39, (1.0f - p11) * 3.0f);
                    float f40 = (min2 - f38) / f39;
                    float f41 = f40 * f40;
                    float f42 = f41 * f40;
                    float f43 = f41 * 3.0f;
                    p10 = ((((((f42 * (-2.0f)) + f43) * 1.0f) + ((((f42 - (f41 * 2.0f)) + f40) * min3) + ((((f42 * 2.0f) - f43) + 1.0f) * p11))) - p10) * f37) + p10;
                    max = Math.max(f34, min2 < 1.0f ? 1.0f : Math.min(1.0f, p10));
                    this.o = max;
                    if (max >= 1.0f) {
                        this.F = false;
                    }
                }
            }
            f13 = 0.01f;
            max = Math.max(f34, min2 < 1.0f ? 1.0f : Math.min(1.0f, p10));
            this.o = max;
            if (max >= 1.0f) {
            }
        }
        PorterDuffColorFilter porterDuffColorFilter = this.z;
        Paint paint4 = this.t;
        paint4.setColorFilter(porterDuffColorFilter);
        float f44 = f12 / 2.0f;
        this.B = f10 + f44;
        this.C = f11 + f44;
        int i18 = this.q;
        RectF rectF4 = this.w;
        float f45 = 0.3f;
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
        if (i18 == 2) {
            float f46 = this.o;
            if (f46 < 1.0f) {
                bArr = bArr2;
                f(canvas, this.m, f10, f11, f12, f46);
                fVar = this;
                canvas2 = canvas;
                f19 = 0.0f;
                rectF = rectF4;
                f17 = min;
                f18 = 1.6f;
                i16 = fVar.l - 1;
                while (i16 >= 0) {
                    float f47 = fArr5[i16] + f17;
                    fArr5[i16] = f47;
                    if (f47 >= fArr6[i16]) {
                        int i19 = fVar.l - 1;
                        fVar.l = i19;
                        fArr11[i16] = fArr11[i19];
                        fArr10[i16] = fArr10[i19];
                        fArr8[i16] = fArr8[i19];
                        fArr7[i16] = fArr7[i19];
                        fArr9[i16] = fArr9[i19];
                        fArr6[i16] = fArr6[i19];
                        fArr5[i16] = fArr5[i19];
                        fArr4[i16] = fArr4[i19];
                        fArr3[i16] = fArr3[i19];
                        fArr2[i16] = fArr2[i19];
                        bArr[i16] = bArr[i19];
                    } else {
                        boolean isNaN = Float.isNaN(fArr2[i16]);
                        Paint paint5 = fVar.u;
                        if (isNaN || fArr5[i16] >= f19) {
                            RectF rectF5 = fVar.r;
                            if (isNaN) {
                                fArr7[i16] = fArr7[i16] - (org.telegram.messenger.g0.L(20.0f) * f17);
                                f28 = f17;
                                fArr8[i16] = e2.C(f28, 2.4f, 1.0f, fArr8[i16]);
                                fArr7[i16] = e2.C(f28, 3.0f, 1.0f, fArr7[i16]);
                                if (!rectF5.isEmpty() && fArr10[i16] < rectF5.top - org.telegram.messenger.g0.L(56.0f)) {
                                    fArr7[i16] = fArr7[i16] * 0.85f;
                                }
                            } else {
                                float max2 = Math.max(f19, 1.0f - (f17 * 6.5f));
                                fArr8[i16] = fArr8[i16] * max2;
                                fArr7[i16] = (fArr7[i16] * max2) - (org.telegram.messenger.g0.L(260.0f) * f17);
                                f28 = f17;
                            }
                            fArr11[i16] = (fArr8[i16] * f28) + fArr11[i16];
                            fArr10[i16] = (fArr7[i16] * f28) + fArr10[i16];
                            fArr4[i16] = (fArr3[i16] * f28) + fArr4[i16];
                            float f48 = fArr5[i16] / fArr6[i16];
                            if (isNaN) {
                                if (f48 < 0.08f) {
                                    f29 = f48 / 0.08f;
                                } else {
                                    y10 = f3.y(f48, 0.08f, 0.92f, 1.0f);
                                    if (isNaN) {
                                        L = (rectF5.top - org.telegram.messenger.g0.L(56.0f)) - fArr10[i16];
                                        if (L > 0.0f) {
                                        }
                                    }
                                    f30 = 1.0f;
                                    float f49 = f30 - f48;
                                    float f50 = fArr9[i16] * (f30 - ((f30 - (f49 * f49)) * (isNaN ? 0.35f : 0.85f)));
                                    if (bArr[i16] != 2) {
                                    }
                                }
                            } else if (f48 < 0.35f) {
                                y10 = 1.0f;
                                if (isNaN && !rectF5.isEmpty()) {
                                    L = (rectF5.top - org.telegram.messenger.g0.L(56.0f)) - fArr10[i16];
                                    if (L > 0.0f) {
                                        f30 = 1.0f;
                                        y10 *= Math.max(0.0f, 1.0f - (L / org.telegram.messenger.g0.L(24.0f)));
                                        float f492 = f30 - f48;
                                        float f502 = fArr9[i16] * (f30 - ((f30 - (f492 * f492)) * (isNaN ? 0.35f : 0.85f)));
                                        if (bArr[i16] != 2) {
                                            paint5.setColor(-1);
                                            float f51 = y10 * 255.0f;
                                            paint5.setAlpha((int) (f51 * 0.9f));
                                            canvas2.drawCircle(fArr11[i16], fArr10[i16], f502, paint5);
                                            paint5.setAlpha((int) (f51 * 0.22f));
                                            canvas2.drawCircle(fArr11[i16], fArr10[i16], f502 * 2.6f, paint5);
                                            i16--;
                                            f17 = f28;
                                            f19 = 0.0f;
                                        } else {
                                            if (rectF5.isEmpty()) {
                                                f31 = 0.0f;
                                                f32 = 0.0f;
                                            } else {
                                                float f52 = rectF5.left;
                                                float f53 = fArr11[i16];
                                                f31 = 0.0f;
                                                float max3 = Math.max(f52 - f53, Math.max(0.0f, f53 - rectF5.right));
                                                float f54 = rectF5.top;
                                                float f55 = fArr10[i16];
                                                f32 = Math.min(1.0f, Math.max(max3, Math.max(f54 - f55, Math.max(0.0f, f55 - rectF5.bottom))) / org.telegram.messenger.g0.L(36.0f));
                                            }
                                            paint5.setColor(f32 > f31 ? k(f32, fVar.y, -1) : fVar.y);
                                            paint5.setAlpha((int) (y10 * 255.0f));
                                            canvas2.save();
                                            canvas2.rotate(fArr4[i16], fArr11[i16], fArr10[i16]);
                                            float f56 = fArr11[i16];
                                            float f57 = f502 / 2.0f;
                                            float f58 = fArr10[i16];
                                            rectF.set(f56 - f57, f58 - f57, f56 + f57, f58 + f57);
                                            float f59 = f502 * f45;
                                            canvas2.drawRoundRect(rectF, f59, f59, paint5);
                                            if (bArr[i16] == 1) {
                                                float sin = (float) Math.sin(Math.min(1.0f, f48 * f18) * 3.141592653589793d);
                                                paint5.setColor(-1);
                                                paint5.setAlpha((int) (y10 * 200.0f * sin));
                                                canvas2.drawRoundRect(rectF, f59, f59, paint5);
                                            }
                                            canvas2.restore();
                                            i16--;
                                            f17 = f28;
                                            f19 = 0.0f;
                                        }
                                    }
                                }
                                f30 = 1.0f;
                                float f4922 = f30 - f48;
                                float f5022 = fArr9[i16] * (f30 - ((f30 - (f4922 * f4922)) * (isNaN ? 0.35f : 0.85f)));
                                if (bArr[i16] != 2) {
                                }
                            } else {
                                f29 = f3.y(f48, 0.35f, 0.65f, 1.0f);
                            }
                            y10 = f29;
                            if (isNaN) {
                            }
                            f30 = 1.0f;
                            float f49222 = f30 - f48;
                            float f50222 = fArr9[i16] * (f30 - ((f30 - (f49222 * f49222)) * (isNaN ? 0.35f : 0.85f)));
                            if (bArr[i16] != 2) {
                            }
                        } else {
                            paint5.setColor(fVar.y);
                            paint5.setAlpha(ls.e4);
                            float f60 = fArr9[i16];
                            float f61 = fArr11[i16];
                            float f62 = f60 / 2.0f;
                            float f63 = fArr10[i16];
                            rectF.set(f61 - f62, f63 - f62, f61 + f62, f63 + f62);
                            float f64 = f60 * f45;
                            canvas2.drawRoundRect(rectF, f64, f64, paint5);
                        }
                    }
                    f28 = f17;
                    i16--;
                    f17 = f28;
                    f19 = 0.0f;
                }
            }
            bArr = bArr2;
            f14 = 3.0f;
        } else {
            bArr = bArr2;
            f14 = 3.0f;
        }
        float f65 = f10;
        int i20 = 2400;
        float f66 = f14;
        Random random = this.x;
        if (i18 != 1 || (eVar5 = this.n) == null) {
            f15 = f11;
            fVar = this;
            f16 = f65;
            z10 = true;
        } else {
            z10 = true;
            if (this.o < 1.0f) {
                if (this.G) {
                    this.G = false;
                    float f67 = f12 / eVar5.b;
                    int i21 = 0;
                    loop1: while (i21 < eVar5.e) {
                        int i22 = 0;
                        while (true) {
                            int i23 = eVar5.e;
                            if (i22 < i23) {
                                f25 = 0.45f;
                                if (!eVar5.h[(i23 * i21) + i22] || ((i22 >= (i14 = eVar5.j) && i22 < (i15 = eVar5.k) && i21 >= i14 && i21 < i15) || random.nextFloat() < 0.4f)) {
                                    f27 = f67;
                                    i13 = i22;
                                } else {
                                    int i24 = this.l;
                                    if (i24 >= i20) {
                                        i24 = -1;
                                    } else {
                                        this.l = i24 + 1;
                                    }
                                    if (i24 < 0) {
                                        break loop1;
                                    }
                                    float f68 = eVar5.g;
                                    float f69 = eVar5.f;
                                    float g10 = org.telegram.ui.Cells.c0.g(i22 + 0.5f, f69, f68, f67, f65);
                                    float f70 = ((((i21 + 0.5f) * f69) + f68) * f67) + f11;
                                    float f71 = g10 - this.B;
                                    float max4 = Math.max(f33, Math.abs(f71));
                                    f27 = f67;
                                    float nextFloat = (random.nextFloat() * org.telegram.messenger.g0.L(900.0f)) + org.telegram.messenger.g0.L(1000.0f);
                                    i13 = i22;
                                    float radians = (float) Math.toRadians((random.nextFloat() - 0.5f) * 36.0f);
                                    bArr[i24] = (byte) (random.nextFloat() < 0.12f ? 1 : 0);
                                    fArr11[i24] = g10;
                                    fArr10[i24] = f70;
                                    fArr9[i24] = ((random.nextFloat() * 0.6f) + 0.7f) * eVar5.f * f27;
                                    double d = radians;
                                    fArr8[i24] = (Math.min(1.0f, max4 / (f12 * 0.5f)) * Math.signum(f71) * nextFloat * 0.18f) + (((float) Math.sin(d)) * nextFloat);
                                    fArr7[i24] = (-((float) Math.cos(d))) * nextFloat;
                                    fArr6[i24] = org.telegram.ui.Cells.c0.h(random, 0.06f, 0.24f);
                                    fArr5[i24] = (-(((eVar5.e - 1) - i21) / 4)) * 0.018f;
                                    fArr4[i24] = random.nextFloat() * 90.0f;
                                    fArr3[i24] = (random.nextFloat() - 0.5f) * 720.0f;
                                    fArr2[i24] = 1.0f;
                                }
                                i22 = i13 + 1;
                                f65 = f10;
                                f67 = f27;
                                i20 = 2400;
                                f33 = 1.0f;
                            }
                        }
                    }
                }
                f25 = 0.45f;
                float max5 = Math.max(0.0f, this.o / 0.92f);
                if (max5 > 0.0f) {
                    if (max5 >= 1.0f) {
                        f26 = 1.0f;
                    } else if (max5 < f25) {
                        float f72 = 1.0f - (max5 / f25);
                        f26 = ((1.0f - (f72 * f72)) * 0.12f) + 0.92f;
                    } else {
                        float f73 = (max5 - f25) / 0.55f;
                        f26 = 1.04f - ((f66 - (f73 * 2.0f)) * ((0.04f * f73) * f73));
                    }
                    canvas.save();
                    canvas.scale(f26, f26, this.B, this.C);
                    f(canvas, this.m, f10, f11, f12, max5);
                    fVar = this;
                    canvas.restore();
                } else {
                    fVar = this;
                }
                canvas2 = canvas;
                rectF = rectF4;
                f17 = min;
                f18 = 1.6f;
                f19 = 0.0f;
                i16 = fVar.l - 1;
                while (i16 >= 0) {
                }
            }
            f15 = f11;
            fVar = this;
            f16 = f65;
        }
        float f74 = 0.5f;
        float f75 = 0.45f;
        if (fVar.o >= 1.0f || (eVar = fVar.n) == null) {
            canvas2 = canvas;
            float f76 = f15;
            rectF = rectF4;
            f17 = min;
            float f77 = f16;
            f18 = 1.6f;
            f19 = 0.0f;
            e eVar6 = fVar.m;
            int i25 = eVar6.b;
            rectF.set(f77, f76, f77 + f12, f76 + f12);
            canvas2.drawBitmap(eVar6.a, eVar6.c, rectF, paint4);
        } else {
            e eVar7 = fVar.m;
            m(eVar);
            int i26 = eVar.g;
            m(eVar7);
            Rect rect2 = eVar7.c;
            int i27 = eVar7.g;
            fVar.g(Math.max(eVar.m, eVar7.m));
            Bitmap bitmap = fVar.H;
            Bitmap bitmap2 = eVar.a;
            Paint paint6 = fVar.I;
            if (bitmap != bitmap2) {
                Bitmap bitmap3 = eVar.a;
                f17 = min;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint6.setShader(new BitmapShader(bitmap3, tileMode, tileMode));
                fVar.H = eVar.a;
            } else {
                f17 = min;
            }
            Bitmap bitmap4 = fVar.J;
            Bitmap bitmap5 = eVar7.a;
            Paint paint7 = fVar.K;
            if (bitmap4 != bitmap5) {
                Bitmap bitmap6 = eVar7.a;
                paint = paint6;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                paint7.setShader(new BitmapShader(bitmap6, tileMode2, tileMode2));
                fVar.J = eVar7.a;
            } else {
                paint = paint6;
            }
            float h = h(eVar, fVar.o);
            float h7 = h(eVar7, fVar.o);
            float f78 = f12 / eVar.b;
            float f79 = f12 / eVar7.b;
            int i28 = 0;
            int i29 = 0;
            while (i28 < eVar.m) {
                if (eVar.q[i28]) {
                    int[] iArr = eVar.r;
                    int i30 = i28 * 4;
                    int i31 = iArr[i30];
                    int i32 = iArr[i30 + 1];
                    i10 = i28;
                    int i33 = (i32 * eVar.e) + i31;
                    float f80 = (eVar.i[i33] * 3.2f) + ((r9 - 1) - i32);
                    if (h > f80) {
                        boolean[] zArr = fVar.s;
                        if (zArr[i33]) {
                            paint3 = paint4;
                            f23 = f79;
                        } else {
                            zArr[i33] = z10;
                            float f81 = i26;
                            paint3 = paint4;
                            float f82 = eVar.f;
                            float g11 = org.telegram.ui.Cells.c0.g(i31 + 0.5f, f82, f81, f78, f16);
                            float f83 = ((((i32 + 0.5f) * f82) + f81) * f78) + f15;
                            float f84 = f82 * f78;
                            float f85 = g11 - fVar.B;
                            float f86 = f83 - fVar.C;
                            rectF3 = rectF4;
                            f23 = f79;
                            float max6 = Math.max(1.0f, (float) Math.hypot(f85, f86));
                            float f87 = f85 / max6;
                            float f88 = f86 / max6;
                            float nextFloat2 = random.nextFloat();
                            int i34 = nextFloat2 < 0.12f ? 2 : nextFloat2 < 0.7f ? 3 : 5;
                            int i35 = 0;
                            while (i35 < i34) {
                                float f89 = f88;
                                int i36 = fVar.l;
                                float f90 = f84;
                                if (i36 >= 2400) {
                                    i36 = -1;
                                } else {
                                    fVar.l = i36 + 1;
                                }
                                if (i36 < 0) {
                                    break;
                                }
                                boolean z11 = (i35 <= 0 || random.nextFloat() >= f45) ? false : z10;
                                if (z11) {
                                    i12 = i36;
                                    r02 = 2;
                                } else if (random.nextFloat() < 0.14f) {
                                    i12 = i36;
                                    r02 = z10;
                                } else {
                                    i12 = i36;
                                    r02 = 0;
                                }
                                bArr[i12] = (byte) r02;
                                fArr11[i12] = ((random.nextFloat() - 0.5f) * f90 * 0.5f) + g11;
                                fArr10[i12] = ((random.nextFloat() - 0.5f) * f90 * 0.5f) + f83;
                                if (z11) {
                                    fArr9[i12] = org.telegram.messenger.g0.N((random.nextFloat() * 0.9f) + 0.9f);
                                } else if (i35 != 0 || nextFloat2 >= 0.12f) {
                                    fArr9[i12] = ((random.nextFloat() * 0.55f) + f45) * f90;
                                } else {
                                    fArr9[i12] = ((random.nextFloat() * f75) + 1.25f) * f90;
                                }
                                float nextFloat3 = (random.nextFloat() * org.telegram.messenger.g0.L(150.0f)) + org.telegram.messenger.g0.L(110.0f);
                                float f91 = f87;
                                float h10 = org.telegram.ui.Cells.c0.h(random, 0.35f, f75);
                                fArr8[i12] = ((random.nextFloat() - 0.5f) * org.telegram.messenger.g0.L(90.0f)) + (f91 * nextFloat3 * h10);
                                fArr7[i12] = e2.t(1.0f, h10, nextFloat3, (f89 * nextFloat3) * h10) - org.telegram.messenger.g0.L(30.0f);
                                fArr6[i12] = org.telegram.ui.Cells.c0.h(random, 0.2f, f45);
                                fArr5[i12] = 0.0f;
                                fArr4[i12] = random.nextFloat() * 90.0f;
                                fArr3[i12] = (random.nextFloat() - 0.5f) * 720.0f;
                                fArr2[i12] = Float.NaN;
                                i35++;
                                i34 = i34;
                                f88 = f89;
                                f84 = f90;
                                f87 = f91;
                                f75 = 0.45f;
                            }
                            eVar4 = eVar;
                            i11 = i26;
                            i28 = i10 + 1;
                            i26 = i11;
                            paint4 = paint3;
                            rectF4 = rectF3;
                            f79 = f23;
                            eVar = eVar4;
                            f45 = 0.3f;
                            f75 = 0.45f;
                        }
                    } else {
                        paint3 = paint4;
                        f23 = f79;
                        rectF3 = rectF4;
                        float min4 = 1.0f - Math.min(1.0f, (f80 - h) / 2.2f);
                        if (min4 > 0.0f) {
                            eVar3 = eVar;
                            f24 = org.telegram.messenger.g0.N(1.4f) * ((float) Math.sin((fVar.o * 60.0f) + (i32 * 7) + (i31 * 13))) * min4;
                        } else {
                            eVar3 = eVar;
                            f24 = 0.0f;
                        }
                        float N = org.telegram.messenger.g0.N(1.5f) * (-min4);
                        float f92 = i26;
                        float f93 = i31;
                        float f94 = eVar3.f;
                        float f95 = (f93 * f94) + f92;
                        float f96 = (i32 * f94) + f92;
                        float f97 = f95 + f94;
                        i11 = i26;
                        float f98 = f96 + f94;
                        eVar4 = eVar3;
                        n(fVar.L, fVar.M, fVar.P, i29, p5.c.e(f95, f78, f16, f24), p5.c.e(f96, f78, f15, N), p5.c.e(f97, f78, f16, f24), p5.c.e(f98, f78, f15, N), f95, f96, f97, f98, (((int) e2.C(min4, 0.25f, 1.0f, 255.0f)) << 24) | fVar.o());
                        i29++;
                        i28 = i10 + 1;
                        i26 = i11;
                        paint4 = paint3;
                        rectF4 = rectF3;
                        f79 = f23;
                        eVar = eVar4;
                        f45 = 0.3f;
                        f75 = 0.45f;
                    }
                } else {
                    paint3 = paint4;
                    f23 = f79;
                    i10 = i28;
                }
                rectF3 = rectF4;
                eVar4 = eVar;
                i11 = i26;
                i28 = i10 + 1;
                i26 = i11;
                paint4 = paint3;
                rectF4 = rectF3;
                f79 = f23;
                eVar = eVar4;
                f45 = 0.3f;
                f75 = 0.45f;
            }
            Paint paint8 = paint4;
            RectF rectF6 = rectF4;
            f19 = 0.0f;
            float f99 = 3.2f;
            boolean z12 = z10;
            int i37 = 0;
            int i38 = 0;
            while (true) {
                f20 = f79;
                if (i37 >= eVar7.m) {
                    break;
                }
                if (eVar7.q[i37]) {
                    int[] iArr2 = eVar7.r;
                    int i39 = i37 * 4;
                    int i40 = iArr2[i39];
                    int i41 = iArr2[i39 + 1];
                    float e10 = p5.c.e(eVar7.i[(i41 * eVar7.e) + i40], f99, (r5 - 1) - i41, 1.6f);
                    if (h7 <= e10) {
                        f22 = f74;
                        f79 = f20;
                        z12 = false;
                        f99 = 3.2f;
                    } else {
                        float min5 = Math.min(1.0f, (h7 - e10) / 2.4f);
                        float f100 = i27;
                        float f101 = eVar7.f;
                        float f102 = (i40 * f101) + f100;
                        float f103 = (i41 * f101) + f100;
                        float f104 = f102 + f101;
                        float f105 = f103 + f101;
                        float f106 = min5 - 1.0f;
                        f99 = 3.2f;
                        float f107 = (((f106 * 2.2f * f106) + (f106 * 3.2f * f106 * f106) + 1.0f) * 0.65f) + 0.35f;
                        if (min5 >= 1.0f || (min5 > 0.4f && Math.abs(f107 - 1.0f) < f13)) {
                            f22 = f74;
                            f79 = f20;
                            n(fVar.N, fVar.O, fVar.Q, i38, (f102 * f79) + f16, (f103 * f79) + f15, (f104 * f79) + f16, (f105 * f79) + f15, f102, f103, f104, f105, fVar.o() | (-16777216));
                            i38++;
                        } else {
                            float f108 = ((f102 + f104) * f74 * f20) + f16;
                            float f109 = ((f103 + f105) * f74 * f20) + f15;
                            f22 = f74;
                            f79 = f20;
                            float D = e2.D(eVar7.f, f22, f79, f107);
                            n(fVar.N, fVar.O, fVar.Q, i38, f108 - D, f109 - D, f108 + D, f109 + D, f102, f103, f104, f105, (((int) (Math.min(1.0f, min5 * 2.5f) * 255.0f)) << 24) | fVar.o());
                            i38++;
                            z12 = false;
                        }
                    }
                } else {
                    f22 = f74;
                    f79 = f20;
                }
                i37++;
                f74 = f22;
            }
            if (i29 == 0 && z12) {
                fVar.o = 1.0f;
                rectF6.set(f16, f15, f16 + f12, f15 + f12);
                canvas.drawBitmap(eVar7.a, rect2, rectF6, paint8);
                canvas2 = canvas;
                rectF = rectF6;
                f18 = 1.6f;
                f45 = 0.3f;
            } else {
                if (i29 > 0) {
                    i7 = i27;
                    rect = rect2;
                    paint2 = paint8;
                    rectF2 = rectF6;
                    f21 = f20;
                    f18 = 1.6f;
                    f45 = 0.3f;
                    eVar2 = eVar7;
                    canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i29 * 8, fVar.L, 0, fVar.M, 0, fVar.P, 0, fVar.R, 0, i29 * 6, paint);
                } else {
                    rectF2 = rectF6;
                    eVar2 = eVar7;
                    paint2 = paint8;
                    rect = rect2;
                    i7 = i27;
                    f21 = f20;
                    f18 = 1.6f;
                    f45 = 0.3f;
                }
                if (i38 > 0) {
                    canvas2 = canvas;
                    canvas2.drawVertices(Canvas.VertexMode.TRIANGLES, i38 * 8, fVar.N, 0, fVar.O, 0, fVar.Q, 0, fVar.R, 0, i38 * 6, paint7);
                } else {
                    canvas2 = canvas;
                }
                float f110 = i7;
                float f111 = eVar2.j;
                float f112 = eVar2.f;
                float f113 = f21;
                float B = e2.B(f111, f112, f110, f113);
                float B2 = e2.B(eVar2.k, f112, f110, f113);
                canvas2.save();
                canvas2.clipRect(B + f10, B + f11, B2 + f10, B2 + f11);
                rectF = rectF2;
                rectF.set(f10, f11, f10 + f12, f11 + f12);
                canvas2.drawBitmap(eVar2.a, rect, rectF, paint2);
                canvas2.restore();
            }
        }
        i16 = fVar.l - 1;
        while (i16 >= 0) {
        }
    }

    public final void f(Canvas canvas, e eVar, float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float z10;
        int i7;
        float f19;
        float f20;
        Paint paint;
        float f21;
        float y10;
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
                            float c10 = (f13 - ((eVar.i[i18] * 0.06f) + e2.c((float) Math.hypot(f30 - f28, f31 - f28), f29, 0.52f, f26))) / 0.367f;
                            if (c10 > 0.0f) {
                                if (c10 >= 1.0f) {
                                    z10 = 1.0f;
                                } else {
                                    float f32 = 1.0f - c10;
                                    z10 = org.telegram.ui.Cells.c0.z(f32, f32, f32, 1.0f);
                                }
                                float l10 = this.q == 2 ? (0.6f * z10) + 0.4f : l(c10);
                                if (this.q != 2) {
                                    z10 = Math.min(1.0f, c10 * 6.0f);
                                }
                                int i19 = eVar.j;
                                if (i16 < i19 || i16 >= (i7 = eVar.k) || i15 < i19 || i15 >= i7) {
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
                                    float c11 = e2.c(f38, f39, f27, f18);
                                    float f40 = i21 + ceil2;
                                    f17 = f11;
                                    float c12 = e2.c(f40, f39, f27, f17);
                                    float f41 = ((ceil - i20) / f39) * f27 * f35;
                                    float f42 = ((ceil2 - i21) / f39) * f27 * f35;
                                    f14 = f27;
                                    rectF.set(c11 - f41, c12 - f42, c11 + f41, c12 + f42);
                                    paint2.setAlpha((int) (z10 * 255.0f));
                                    e eVar2 = this.n;
                                    canvas.drawBitmap(eVar.a, rect, rectF, paint2);
                                    paint2.setAlpha(ls.e4);
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
                    float g10 = org.telegram.ui.Cells.c0.g(i23, f48, f47, f45, f44);
                    float g11 = org.telegram.ui.Cells.c0.g(i24, f48, f47, f45, f43);
                    float g12 = org.telegram.ui.Cells.c0.g(i23 + 7, f48, f47, f45, f44);
                    float g13 = org.telegram.ui.Cells.c0.g(i24 + 7, f48, f47, f45, f43);
                    float l11 = l(f46);
                    canvas.save();
                    canvas.scale(l11, l11, (g10 + g12) / 2.0f, (g11 + g13) / 2.0f);
                    canvas.clipRect(g10 - 1.0f, g11 - 1.0f, g12 + 1.0f, g13 + 1.0f);
                    rectF.set(f44, f43, f44 + f12, f43 + f12);
                    paint2.setAlpha(ls.e4);
                    canvas.drawBitmap(eVar.a, eVar.c, rectF, paint2);
                    canvas.restore();
                }
                i22++;
                i11 = 1;
            }
            paint2.setAlpha(ls.e4);
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
        float f49 = f12 / eVar.b;
        float min = Math.min(1.0f, Math.max(0.0f, f24) / 0.1f);
        float f50 = eVar.f * 0.5f;
        float f51 = 1.0f;
        boolean z11 = true;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        while (i28 < eVar.m) {
            float f52 = (f24 - eVar.p[i28]) / 0.434f;
            if (f52 < 0.0f) {
                f52 = 0.0f;
            } else if (f52 > f51) {
                f52 = f51;
            }
            if (f52 < 0.5f) {
                f20 = e2.D(f52, 4.0f, f52, f52);
            } else {
                float f53 = (f52 * (-2.0f)) + 2.0f;
                f20 = f51 - (((f53 * f53) * f53) * 0.5f);
            }
            float f54 = (eVar.n[i28] * f49) + f22;
            float f55 = (eVar.o[i28] * f49) + f23;
            if (eVar.q[i28]) {
                float f56 = f20 > 0.75f ? 4.0f * (f20 - 0.75f) : 0.0f;
                paint = paint3;
                if (f56 < f51) {
                    float B = e2.B(f20, 0.8f, 0.2f, f50 * f49);
                    int min2 = Math.min(7, (int) ((f20 * 7.0f) + 0.5f));
                    float f57 = (f51 - f56) * min;
                    if (f57 > 0.004f) {
                        n(this.L, this.M, this.P, i29, f54 - B, f55 - B, f54 + B, f55 + B, min2 * 48, eVar.d, r7 + 48, r5 + 48, (((int) (f57 * 255.0f)) << 24) | o());
                        i29++;
                    }
                    z11 = false;
                }
                if (f56 > 0.0f) {
                    float f58 = i25;
                    int[] iArr = eVar.r;
                    float f59 = iArr[i28 * 4];
                    float f60 = eVar.f;
                    float f61 = (f59 * f60) + f58;
                    float f62 = (iArr[r5 + 1] * f60) + f58;
                    float f63 = f61 + f60;
                    float f64 = f62 + f60;
                    n(this.N, this.O, this.Q, i30, (f61 * f49) + f22, (f62 * f49) + f23, (f63 * f49) + f22, (f64 * f49) + f23, f61, f62, f63, f64, (((int) (min * 255.0f)) << 24) | o());
                    i30++;
                }
            } else {
                paint = paint3;
                float f65 = (f51 - f20) * 0.2f;
                boolean z12 = f20 < f51 ? false : z11;
                if (f20 < 0.7f) {
                    f21 = f65;
                    y10 = f51;
                } else {
                    f21 = f65;
                    y10 = f3.y(f20, 0.7f, 0.3f, f51);
                }
                float f66 = 0.9f * min * y10;
                if (f21 <= 0.01f || f66 <= 0.004f) {
                    z11 = z12;
                } else {
                    float f67 = f50 * f49 * f21;
                    n(this.L, this.M, this.P, i29, f54 - f67, f55 - f67, f54 + f67, f55 + f67, 0.0f, eVar.d, 48.0f, r5 + 48, (((int) (f66 * 255.0f)) << 24) | o());
                    z11 = z12;
                    i29++;
                }
            }
            i28++;
            f24 = f13;
            paint3 = paint;
            f51 = 1.0f;
        }
        Paint paint4 = paint3;
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, (f13 - 0.05f) / 0.45f));
        float z13 = org.telegram.ui.Cells.c0.z(max, max, max, 1.0f);
        if (z13 > 0.0f) {
            int i31 = eVar.j;
            while (i31 < eVar.k) {
                int i32 = eVar.j;
                int i33 = i30;
                while (i32 < eVar.k) {
                    if (eVar.h[(eVar.e * i31) + i32]) {
                        float f68 = i25;
                        float f69 = eVar.f;
                        float f70 = (i32 * f69) + f68;
                        float f71 = (i31 * f69) + f68;
                        f19 = z13;
                        float f72 = f70 + f69;
                        float f73 = f71 + f69;
                        n(this.N, this.O, this.Q, i33, (f70 * f49) + f22, (f71 * f49) + f23, (f72 * f49) + f22, (f73 * f49) + f23, f70, f71, f72, f73, (((int) ((min * 255.0f) * f19)) << 24) | o());
                        i33++;
                    } else {
                        f19 = z13;
                    }
                    i32++;
                    z13 = f19;
                }
                i31++;
                i30 = i33;
            }
        }
        if (z11 && min >= 1.0f) {
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

    public final void g(int i7) {
        float[] fArr = this.L;
        if (fArr == null || fArr.length < i7 * 8) {
            int i10 = i7 * 8;
            this.L = new float[i10];
            this.M = new float[i10];
            int i11 = i7 * 4;
            this.P = new int[i11];
            this.N = new float[i10];
            this.O = new float[i10];
            this.Q = new int[i11];
            this.R = new short[i7 * 6];
            for (int i12 = 0; i12 < i7; i12++) {
                int i13 = i12 * 4;
                short[] sArr = this.R;
                int i14 = i12 * 6;
                short s5 = (short) i13;
                sArr[i14] = s5;
                sArr[i14 + 1] = (short) (i13 + 1);
                short s9 = (short) (i13 + 2);
                sArr[i14 + 2] = s9;
                sArr[i14 + 3] = s5;
                sArr[i14 + 4] = s9;
                sArr[i14 + 5] = (short) (i13 + 3);
            }
        }
    }

    public final int o() {
        return this.y & 16777215;
    }
}
