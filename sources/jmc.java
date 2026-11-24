// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import android.util.LruCache;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class jmc {
    public static volatile boolean j0;
    public static Bitmap[] m0;
    public static Bitmap[][] n0;
    public PorterDuffColorFilter A;
    public int B;
    public PorterDuffColorFilter C;
    public final RectF M;
    public Bitmap Q;
    public final Context R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public float X;
    public float Z;
    public final Runnable a;
    public float a0;
    public SweepGradient c0;
    public final SweepGradient d0;
    public final ComposeShader e0;
    public int f0;
    public boolean i0;
    public float q;
    public boolean r;
    public final SweepGradient v;
    public final SweepGradient w;
    public final ComposeShader y;
    public int z;
    public static final AtomicBoolean k0 = new AtomicBoolean();
    public static final do3 l0 = new do3("walletCardAssets", 10);
    public static final int[] o0 = {-16748837, -16747809, -16746781, -16745754, -16744728, -16743955, -16743183, -16742412, -16741643};
    public static final LruCache p0 = new LruCache(2);
    public final Paint b = new Paint(3);
    public final Paint c = new Paint(3);
    public final Paint d = new Paint(1);
    public final Matrix e = new Matrix();
    public final RectF f = new RectF(0.0f, 0.0f, 336.0f, 205.0f);
    public final RectF g = new RectF();
    public final RectF h = new RectF(-42.0f, -107.5f, 378.0f, 312.5f);
    public final float[] i = new float[kk7.h2];
    public final float[] j = new float[kk7.h2];
    public final float[] k = new float[kk7.h2];
    public final float[] l = new float[kk7.h2];
    public final float[] m = new float[76];
    public final float[] n = new float[76];
    public final int[] o = new int[76];
    public final Path p = new Path();
    public final Path s = new Path();
    public final Path t = new Path();
    public final Path u = new Path();
    public final Shader[] x = new Shader[2];
    public final int[] D = new int[2];
    public final Shader[] E = new Shader[2];
    public final SweepGradient[] F = new SweepGradient[2];
    public final boolean[] G = new boolean[2];
    public final int[][] H = new int[2][];
    public final PorterDuffColorFilter[][] I = (PorterDuffColorFilter[][]) Array.newInstance((Class<?>) PorterDuffColorFilter.class, 2, 8);
    public final int[] J = {0, 0};
    public final int[] K = {0, 0};
    public final float[][] L = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 22, 6);
    public final int[] N = new int[65];
    public final Bitmap[] O = new Bitmap[8];
    public final Bitmap[] P = new Bitmap[8];
    public float Y = 1.0f;
    public float b0 = 1.0f;
    public int g0 = -14456619;
    public int h0 = -14184457;

    public jmc(Context context, int i, int i2, Runnable runnable) {
        double d;
        int i3;
        boolean z;
        float f;
        double d2;
        int i4;
        float f2;
        int i5 = 3;
        boolean z2 = true;
        float f3 = 336.0f;
        float f4 = 205.0f;
        int i6 = 2;
        int i7 = 8;
        int i8 = 0;
        char c = 6;
        float f5 = 1.0f;
        this.a = runnable;
        this.R = context;
        int i9 = 0;
        while (i9 < 4) {
            float f6 = i9 < i6 ? 310.8f : 25.2f;
            int i10 = i8;
            if (i9 == 0 || i9 == i5) {
                i4 = i5;
                f2 = 25.368736f;
            } else {
                i4 = i5;
                f2 = 179.63126f;
            }
            char c2 = c;
            float f7 = f5;
            int i11 = i10;
            while (i11 <= 18) {
                double radians = Math.toRadians((i11 * 5) + ((i9 * 90) - 90));
                int i12 = i7;
                float cos = (float) Math.cos(radians);
                float sin = (float) Math.sin(radians);
                float[] fArr = this.i;
                int i13 = ((i9 * 19) + i11) << 1;
                fArr[i13] = b00.y(cos, 25.2f, f6, 336.0f);
                int i14 = i13 + 1;
                fArr[i14] = b00.y(25.368736f, sin, f2, 205.0f);
                float[] fArr2 = this.j;
                fArr2[i13] = cos;
                fArr2[i14] = sin;
                i11++;
                i7 = i12;
            }
            i9++;
            i8 = i10;
            i5 = i4;
            c = c2;
            f5 = f7;
            i6 = 2;
        }
        int i15 = i5;
        int i16 = i7;
        int i17 = i8;
        char c3 = c;
        float f8 = f5;
        float f9 = 336.0f - i2;
        this.M = new RectF(f9 - 48.0f, 74.0f, f9, 110.0f);
        if (m0 == null) {
            String[] strArr = {"finish_light", "finish_dark", "groove_along", "groove_across", "qr_brush_light", "qr_brush_dark", "grain"};
            m0 = new Bitmap[7];
            for (int i18 = i17; i18 < 7; i18++) {
                try {
                    InputStream open = context.getAssets().open("wallet_card_2d/" + strArr[i18] + ".webp");
                    try {
                        m0[i18] = BitmapFactory.decodeStream(open);
                        Bitmap bitmap = m0[i18];
                        if (bitmap != null) {
                            bitmap.prepareToDraw();
                        }
                        if (open != null) {
                            open.close();
                        }
                    } catch (Throwable th) {
                        if (open != null) {
                            try {
                                open.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
        if (n0 == null) {
            int[] iArr = new int[2];
            iArr[1] = i16;
            iArr[i17] = 2;
            Bitmap[][] bitmapArr = (Bitmap[][]) Array.newInstance((Class<?>) Bitmap.class, iArr);
            int i19 = i17;
            for (int i20 = 2; i19 < i20; i20 = 2) {
                int i21 = i16;
                for (int i22 = i17; i22 < i21; i22++) {
                    try {
                        InputStream open2 = context.getAssets().open("wallet_card_2d/face_" + i19 + "_" + i22 + ".webp");
                        try {
                            bitmapArr[i19][i22] = BitmapFactory.decodeStream(open2);
                            Bitmap bitmap2 = bitmapArr[i19][i22];
                            if (bitmap2 != null) {
                                bitmap2.prepareToDraw();
                            }
                            if (open2 != null) {
                                open2.close();
                            }
                        } catch (Throwable th3) {
                            if (open2 != null) {
                                try {
                                    open2.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                            }
                            throw th3;
                        }
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                }
                i19++;
                i16 = i21;
            }
            n0 = bitmapArr;
        }
        int[] iArr2 = new int[kk7.M1];
        int[] iArr3 = new int[kk7.M1];
        int i23 = i17;
        while (true) {
            d = 128.0d;
            i3 = 128;
            z = z2;
            if (i23 > 128) {
                break;
            }
            float f10 = f3;
            double d3 = ((i23 * 3.141592653589793d) * 2.0d) / 128.0d;
            iArr2[i23] = Color.argb(Math.round(((float) Math.pow(Math.pow(Math.sin(d3) / 0.64d, 2.0d) + 1.0d, -2.0d)) * 64.0f), kk7.d4, kk7.d4, kk7.d4);
            iArr3[i23] = Color.argb(Math.round(l(0.18f, 0.88f, (float) Math.abs(Math.cos(Math.atan2(Math.sin(d3) / 2.0d, Math.cos(d3))))) * 255.0f), kk7.d4, kk7.d4, kk7.d4);
            i23++;
            z2 = z ? 1 : 0;
            f3 = f10;
            f4 = f4;
        }
        float f11 = f3;
        float f12 = f4;
        this.v = new SweepGradient(168.0f, 102.5f, iArr2, (float[]) null);
        SweepGradient sweepGradient = new SweepGradient(168.0f, 102.5f, iArr3, (float[]) null);
        this.w = sweepGradient;
        if (m0[c3] != null) {
            Bitmap bitmap3 = m0[c3];
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
            f = 0.88f;
            this.e.setScale(f11 / m0[c3].getWidth(), f12 / m0[c3].getHeight());
            bitmapShader.setLocalMatrix(this.e);
            this.y = new ComposeShader(bitmapShader, sweepGradient, PorterDuff.Mode.DST_IN);
        } else {
            f = 0.88f;
        }
        int i24 = i17;
        while (i24 < 2) {
            if (m0[i24] != null) {
                Bitmap bitmap4 = m0[i24];
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                d2 = d;
                this.e.setScale(f11 / m0[i24].getWidth(), f12 / m0[i24].getHeight());
                bitmapShader2.setLocalMatrix(this.e);
                this.x[i24] = new ComposeShader(bitmapShader2, this.w, PorterDuff.Mode.DST_IN);
            } else {
                d2 = d;
            }
            int i25 = i24 + 2;
            if (m0[i25] != null) {
                Bitmap bitmap5 = m0[i25];
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader3 = new BitmapShader(bitmap5, tileMode3, tileMode3);
                this.e.setScale(f11 / m0[i25].getWidth(), f12 / m0[i25].getHeight());
                bitmapShader3.setLocalMatrix(this.e);
                int[] iArr4 = new int[kk7.M1];
                int i26 = i17;
                while (i26 <= i3) {
                    double d4 = ((i26 * 3.141592653589793d) * 2.0d) / d2;
                    float abs = (float) Math.abs(Math.cos(Math.atan2(Math.sin(d4) / 2.0d, Math.cos(d4))));
                    float l = l(0.21814324f, 0.9293131f, abs);
                    float f13 = abs * abs;
                    if (i24 != 0) {
                        f13 = f8 - f13;
                    }
                    iArr4[i26] = a(l * f13, -1);
                    i26++;
                    i3 = 128;
                }
                this.F[i24] = new SweepGradient(168.0f, 102.5f, iArr4, (float[]) null);
                this.E[i24] = new ComposeShader(bitmapShader3, this.F[i24], PorterDuff.Mode.DST_IN);
            }
            i24++;
            d = d2;
            i3 = 128;
        }
        this.c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        this.d.setStyle(Paint.Style.STROKE);
        Random random = new Random(24560118926758988L);
        int i27 = i17;
        while (i27 < this.L.length) {
            float f14 = -1.0f;
            int i28 = i17;
            while (true) {
                if (i28 < (i27 == 0 ? z ? 1 : 0 : 32)) {
                    float nextFloat = random.nextFloat() * f11;
                    float nextFloat2 = random.nextFloat() * f12;
                    float f15 = Float.MAX_VALUE;
                    for (int i29 = i17; i29 < i27; i29++) {
                        float abs2 = Math.abs(nextFloat - this.L[i29][i17]);
                        float abs3 = Math.abs(nextFloat2 - this.L[i29][z ? 1 : 0]);
                        float min = Math.min(abs2, f11 - abs2);
                        float min2 = Math.min(abs3, f12 - abs3);
                        f15 = Math.min(f15, (min2 * min2) + (min * min));
                    }
                    if (f15 > f14) {
                        float[] fArr3 = this.L[i27];
                        fArr3[i17] = nextFloat;
                        fArr3[z ? 1 : 0] = nextFloat2;
                        f14 = f15;
                    }
                    i28++;
                }
            }
            this.L[i27][2] = (((random.nextFloat() * 6.0f) + f8) * f11) / 512.0f;
            double nextFloat3 = random.nextFloat() * 3.141592653589793d * 2.0d;
            float e3 = ug8.e(random, 0.45f, 0.05f);
            float sqrt = f8 / ((float) Math.sqrt((e3 * e3) + f8));
            this.L[i27][i15] = ((float) Math.cos(nextFloat3)) * e3 * sqrt;
            this.L[i27][4] = ((float) Math.sin(nextFloat3)) * e3 * sqrt;
            this.L[i27][5] = sqrt;
            i27++;
        }
        int[] iArr5 = new int[65];
        for (int i30 = i17; i30 <= 64; i30++) {
            iArr5[i30] = a((((float) Math.pow(Math.abs(Math.cos(((i30 * 3.141592653589793d) * 2.0d) / 64.0d)), 8.0d)) * f) + 0.12f, -1);
        }
        SweepGradient sweepGradient2 = new SweepGradient(this.M.centerX(), this.M.centerY(), iArr5, (float[]) null);
        this.d0 = sweepGradient2;
        if (m0[4] != null) {
            Bitmap bitmap6 = m0[4];
            Shader.TileMode tileMode4 = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader4 = new BitmapShader(bitmap6, tileMode4, tileMode4);
            this.e.setScale(this.M.width() / m0[4].getWidth(), this.M.height() / m0[4].getHeight());
            Matrix matrix = this.e;
            RectF rectF = this.M;
            matrix.postTranslate(rectF.left, rectF.top);
            bitmapShader4.setLocalMatrix(this.e);
            this.e0 = new ComposeShader(bitmapShader4, sweepGradient2, PorterDuff.Mode.DST_IN);
        }
        f(h(context, i));
        this.f0 = i;
        k(0.0f, 0.0f);
        j0 = z;
    }

    public static int a(float f, int i) {
        return bm2.o(i, Math.round(c(f) * 255.0f));
    }

    public static float c(float f) {
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    public static int d(float f, float f2, float f3, int i, int i2) {
        float f4 = f3 * 255.0f;
        return Color.rgb(Math.min(kk7.d4, Math.round((Color.red(i2) * f2) + (Color.red(i) * f) + f4)), Math.min(kk7.d4, Math.round((Color.green(i2) * f2) + (Color.green(i) * f) + f4)), Math.min(kk7.d4, Math.round((Color.blue(i2) * f2) + (Color.blue(i) * f) + f4)));
    }

    public static float g(int i) {
        float f = i / 255.0f;
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4d);
    }

    public static Bitmap[] h(Context context, int i) {
        String str;
        StringBuilder sb;
        int i2;
        String sb2;
        Integer valueOf = Integer.valueOf(i);
        LruCache lruCache = p0;
        Bitmap[] bitmapArr = (Bitmap[]) lruCache.get(valueOf);
        if (bitmapArr != null) {
            return bitmapArr;
        }
        if (i == R.drawable.wallet_card_qr) {
            str = "qr";
        } else {
            if (i != R.drawable.wallet_card_info) {
                w26.j(de9.k(i, "Missing packaged wallet icon: "));
                return null;
            }
            str = "info";
        }
        Bitmap[] bitmapArr2 = new Bitmap[17];
        for (int i3 = 0; i3 < 17; i3++) {
            if (i3 == 0) {
                sb2 = "mask";
            } else {
                if (i3 <= 8) {
                    sb = new StringBuilder("light_");
                    i2 = i3 - 1;
                } else {
                    sb = new StringBuilder("dark_");
                    i2 = i3 - 9;
                }
                sb.append(i2);
                sb2 = sb.toString();
            }
            try {
                InputStream open = context.getAssets().open("wallet_card_2d/icon_" + str + "_" + sb2 + ".webp");
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(open);
                    bitmapArr2[i3] = decodeStream;
                    if (decodeStream == null) {
                        throw new IllegalStateException("Invalid wallet icon texture");
                    }
                    decodeStream.prepareToDraw();
                    if (open != null) {
                        open.close();
                    }
                } finally {
                }
            } catch (IOException e) {
                k93.h("Missing wallet icon texture", e);
                return null;
            }
        }
        lruCache.put(Integer.valueOf(i), bitmapArr2);
        return bitmapArr2;
    }

    public static float i(float f, float f2, float f3) {
        return tb4.A(f2, f, f3, f);
    }

    public static float l(float f, float f2, float f3) {
        float c = c((f3 - f) / (f2 - f));
        return yjb.B(c, 2.0f, 3.0f, c * c);
    }

    public final void b(Canvas canvas, Bitmap bitmap, RectF rectF, int i) {
        if (bitmap == null) {
            return;
        }
        Paint paint = this.b;
        paint.setAlpha(i);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
        paint.setAlpha(kk7.d4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x043c  */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v8 */
    /* JADX WARN: Type inference failed for: r35v0, types: [android.graphics.Canvas] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, float[] fArr) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        Paint paint;
        char c;
        char c2;
        int f;
        float f2;
        boolean z;
        int f3;
        RectF rectF;
        int i;
        int rgb;
        PorterDuffColorFilter porterDuffColorFilter;
        ComposeShader composeShader;
        BlendMode blendMode;
        BlendMode blendMode2;
        boolean z2;
        int i2;
        int[] iArr4;
        int i3;
        float f4;
        int[] iArr5;
        float pow;
        boolean z3;
        int i4;
        float pow2;
        PorterDuffColorFilter[][] porterDuffColorFilterArr;
        ?? r33;
        int i5;
        int i6 = 0;
        while (true) {
            int i7 = fArr == null ? 1 : 2;
            iArr = this.D;
            iArr2 = this.K;
            iArr3 = this.J;
            paint = this.b;
            if (i6 >= i7) {
                break;
            }
            int i8 = -14184457;
            int i9 = -14456619;
            if (fArr != null) {
                int i10 = i6 << 2;
                int i11 = i10 + 10;
                if (fArr.length >= 18) {
                    float f5 = fArr[i11];
                    if (f5 >= 0.0f) {
                        int i12 = i10 + 11;
                        i9 = znc.o(-16216082, (int) f5, (int) fArr[i12]);
                        i8 = znc.o(-15291399, (int) fArr[i11], (int) fArr[i12]);
                    }
                }
                int i13 = i6 * 3;
                i9 = znc.p(-14456619, i13, fArr);
                i8 = znc.p(-14184457, i13, fArr);
            }
            boolean z4 = fArr != null && fArr.length >= 18 && fArr[(i6 << 2) + 10] >= 0.0f;
            int[][] iArr6 = this.H;
            int[] iArr7 = iArr6[i6];
            PorterDuffColorFilter[][] porterDuffColorFilterArr2 = this.I;
            boolean[] zArr = this.G;
            if (iArr7 != null && iArr3[i6] == i9 && iArr2[i6] == i8 && zArr[i6] == z4) {
                r33 = z4;
                porterDuffColorFilterArr = porterDuffColorFilterArr2;
            } else {
                iArr3[i6] = i9;
                iArr2[i6] = i8;
                zArr[i6] = z4;
                if (z4) {
                    float[] fArr2 = new float[3];
                    float[] fArr3 = new float[3];
                    int i14 = 0;
                    for (int i15 = 3; i14 < i15; i15 = 3) {
                        int i16 = 16 - (i14 << 3);
                        float g = g((i9 >> i16) & kk7.d4) * 0.73f;
                        float[] fArr4 = fArr2;
                        if (g <= 0.0031308f) {
                            pow2 = g * 12.92f;
                            z3 = z4;
                            i4 = i8;
                        } else {
                            z3 = z4;
                            i4 = i8;
                            pow2 = (((float) Math.pow(g, 0.4166666567325592d)) * 1.055f) - 0.055f;
                        }
                        fArr4[i14] = pow2;
                        float g2 = g((i4 >> i16) & kk7.d4) * 0.73f;
                        fArr3[i14] = g2 <= 0.0031308f ? g2 * 12.92f : (((float) Math.pow(g2, 0.4166666567325592d)) * 1.055f) - 0.055f;
                        i14++;
                        i8 = i4;
                        fArr2 = fArr4;
                        z4 = z3;
                    }
                    z2 = z4;
                    i2 = i8;
                    float[] fArr5 = fArr2;
                    int i17 = i9;
                    float i18 = ((i(0.91f, 1.06f, 0.825f) * i(0.92f, 0.6f, 0.1066f) * yjb.z((float) Math.pow(0.68d, i(34.0f, 5.5f, 0.1066f)), 0.7832f, (((float) Math.pow(0.72d, i(18.0f, 3.5f, 0.1066f))) * 2.5191f) + (((float) Math.pow(0.571d, i(5.0f, 1.5f, 0.1066f))) * 0.1133f) + (((float) Math.pow(0.9757d, i(3.6f, 1.25f, 0.1066f))) * 0.2556f) + i(0.061f, 0.356f, l(-0.45f, 0.72f, 0.0f)), 0.82f) * 1.1f * 1.45f) + 0.136598f) * 1.0760401f * 1.02925f;
                    iArr4 = new int[9];
                    int i19 = 0;
                    while (i19 <= 8) {
                        float f6 = i19 / 8.0f;
                        int i20 = -16777216;
                        int i21 = i17;
                        int i22 = 0;
                        while (i22 < 3) {
                            int i23 = i19;
                            PorterDuffColorFilter[][] porterDuffColorFilterArr3 = porterDuffColorFilterArr2;
                            float z5 = yjb.z(f6, 0.2f, 0.8f, i(fArr5[i22], fArr3[i22], f6));
                            if (z5 <= 0.04045f) {
                                pow = z5 / 12.92f;
                                f4 = f6;
                                iArr5 = iArr;
                            } else {
                                double d = (z5 + 0.055f) / 1.055f;
                                f4 = f6;
                                iArr5 = iArr;
                                pow = (float) Math.pow(d, 2.4d);
                            }
                            float C = yjb.C(i18, 1.3f, 1.765f, pow);
                            i20 |= Math.round(((float) Math.pow(i(c(yjb.z(C, 2.51f, 0.03f, C) / ((((2.43f * C) + 0.59f) * C) + 0.14f)), c(C), 0.65f), 0.45454543828964233d)) * 255.0f) << (16 - (i22 << 3));
                            i22++;
                            iArr = iArr5;
                            i19 = i23;
                            porterDuffColorFilterArr2 = porterDuffColorFilterArr3;
                            f6 = f4;
                        }
                        int i24 = i19;
                        iArr4[i24] = i20;
                        i19 = i24 + 1;
                        i17 = i21;
                    }
                    i3 = i17;
                } else {
                    iArr4 = o0;
                    z2 = z4;
                    i2 = i8;
                    i3 = i9;
                }
                porterDuffColorFilterArr = porterDuffColorFilterArr2;
                int[] iArr8 = iArr;
                iArr6[i6] = iArr4;
                int i25 = 0;
                while (i25 < 8) {
                    int i26 = i25 + 1;
                    porterDuffColorFilterArr[i6][i25] = new PorterDuffColorFilter(iArr6[i6][i26], PorterDuff.Mode.SRC_IN);
                    i25 = i26;
                }
                float max = Math.max(1.0E-6f, Math.max((g(Color.red(i2)) + g(Color.red(i3))) * 0.5f, Math.max((g(Color.green(i2)) + g(Color.green(i3))) * 0.5f, (g(Color.blue(i2)) + g(Color.blue(i3))) * 0.5f)));
                iArr8[i6] = Color.rgb(Math.round(((float) Math.sqrt(r6 / max)) * 255.0f), Math.round(((float) Math.sqrt(r7 / max)) * 255.0f), Math.round(((float) Math.sqrt(r8 / max)) * 255.0f));
                r33 = z2;
            }
            if (fArr != null) {
                if (i6 != 0 || fArr[8] < 1.0f) {
                    i5 = 1;
                    if (i6 == 1 && fArr[8] <= 0.0f) {
                    }
                }
                i6++;
            } else {
                i5 = 1;
            }
            int save = canvas.save();
            if (i6 == i5 && fArr[9] < 0.5f && fArr[8] < 1.0f) {
                Path path = this.u;
                path.rewind();
                path.addCircle(fArr[6] * 336.0f, fArr[7] * 205.0f, fArr[8] * 336.0f * 1.2f, Path.Direction.CW);
                canvas.clipPath(path);
            }
            canvas.rotate((float) Math.toDegrees(this.U), 168.0f, 102.5f);
            int round = (i6 != 1 || fArr[9] <= 0.5f) ? kk7.d4 : Math.round(fArr[8] * 255.0f);
            RectF rectF2 = this.h;
            int saveLayerAlpha = round < 255 ? canvas.saveLayerAlpha(rectF2, round) : -1;
            paint.setShader(null);
            paint.setColorFilter(null);
            paint.setColor(iArr6[i6][0]);
            canvas.drawRect(rectF2, paint);
            for (int i27 = 0; i27 < 8; i27++) {
                Bitmap bitmap = n0[r33][i27];
                if (bitmap != null) {
                    paint.setColorFilter(porterDuffColorFilterArr[i6][i27]);
                    canvas.drawBitmap(bitmap, null, rectF2, paint);
                }
            }
            paint.setColorFilter(null);
            if (saveLayerAlpha != -1) {
                canvas.restoreToCount(saveLayerAlpha);
            }
            paint.setAlpha(kk7.d4);
            canvas.restoreToCount(save);
            i6++;
        }
        if (fArr == null) {
            f = iArr3[0];
            c2 = '\b';
            c = 1;
        } else {
            c = 1;
            c2 = '\b';
            f = bm2.f(fArr[8], iArr3[0], iArr3[1]);
        }
        this.g0 = f;
        this.h0 = fArr == null ? iArr2[0] : bm2.f(fArr[c2], iArr2[0], iArr2[c]);
        boolean z6 = fArr != null && fArr.length >= 18 && fArr[10] >= 0.0f;
        if (fArr == null || fArr.length < 18) {
            f2 = 0.0f;
        } else {
            f2 = 0.0f;
            if (fArr[14] >= 0.0f) {
                z = true;
                float c3 = (fArr != null || fArr.length < 18) ? f2 : c(fArr[8]);
                f3 = bm2.f(c3, !z6 ? iArr[0] : -11227905, z ? iArr[1] : -11227905);
                if (this.C != null || this.B != f3) {
                    this.B = f3;
                    this.C = new PorterDuffColorFilter(f3, PorterDuff.Mode.SRC_IN);
                }
                float i28 = i(!z6 ? 0.18f : 0.25f, z ? 0.18f : 0.25f, c3);
                PorterDuffColorFilter porterDuffColorFilter2 = this.C;
                Paint paint2 = this.c;
                paint2.setColorFilter(porterDuffColorFilter2);
                paint2.setShader(this.v);
                paint2.setAlpha(Math.round(((((c(this.Y) * 0.28f) + 0.72f) * 255.0f) * i28) / 0.25f));
                rectF = this.f;
                canvas.drawRect(rectF, paint2);
                paint2.setColorFilter(null);
                paint2.setShader(null);
                paint.setShader(null);
                if (Build.VERSION.SDK_INT >= 29 || (composeShader = this.y) == null) {
                    b(canvas, m0[0], rectF, 5);
                    b(canvas, m0[1], rectF, 5);
                    for (Shader shader : this.x) {
                        if (shader != null) {
                            paint.setShader(shader);
                            paint.setAlpha(25);
                            canvas.drawRect(rectF, paint);
                        }
                    }
                    paint.setShader(null);
                    i = kk7.d4;
                    paint.setAlpha(kk7.d4);
                } else {
                    blendMode = BlendMode.SOFT_LIGHT;
                    paint.setBlendMode(blendMode);
                    b(canvas, m0[6], rectF, 10);
                    paint.setShader(composeShader);
                    paint.setAlpha(54);
                    canvas.drawRect(rectF, paint);
                    paint.setShader(null);
                    paint.setAlpha(kk7.d4);
                    blendMode2 = BlendMode.SRC_OVER;
                    paint.setBlendMode(blendMode2);
                    i = kk7.d4;
                }
                rgb = fArr != null ? -13003265 : Color.rgb(Math.min(i, Math.round(Color.red(this.h0) * 1.12f)), Math.min(i, Math.round(Color.green(this.h0) * 1.12f)), Math.min(i, Math.round(Color.blue(this.h0) * 1.12f)));
                porterDuffColorFilter = this.A;
                if (porterDuffColorFilter != null || this.z != rgb) {
                    this.z = rgb;
                    porterDuffColorFilter = new PorterDuffColorFilter(rgb, PorterDuff.Mode.SRC_IN);
                    this.A = porterDuffColorFilter;
                }
                paint2.setColorFilter(porterDuffColorFilter);
                for (Shader shader2 : this.E) {
                    if (shader2 != null) {
                        paint2.setShader(shader2);
                        paint2.setAlpha(41);
                        canvas.drawRect(rectF, paint2);
                    }
                }
                paint2.setColorFilter(null);
                paint2.setShader(null);
                paint2.setAlpha(kk7.d4);
            }
        }
        z = false;
        if (fArr != null) {
        }
        f3 = bm2.f(c3, !z6 ? iArr[0] : -11227905, z ? iArr[1] : -11227905);
        if (this.C != null) {
        }
        this.B = f3;
        this.C = new PorterDuffColorFilter(f3, PorterDuff.Mode.SRC_IN);
        float i282 = i(!z6 ? 0.18f : 0.25f, z ? 0.18f : 0.25f, c3);
        PorterDuffColorFilter porterDuffColorFilter22 = this.C;
        Paint paint22 = this.c;
        paint22.setColorFilter(porterDuffColorFilter22);
        paint22.setShader(this.v);
        paint22.setAlpha(Math.round(((((c(this.Y) * 0.28f) + 0.72f) * 255.0f) * i282) / 0.25f));
        rectF = this.f;
        canvas.drawRect(rectF, paint22);
        paint22.setColorFilter(null);
        paint22.setShader(null);
        paint.setShader(null);
        if (Build.VERSION.SDK_INT >= 29) {
        }
        b(canvas, m0[0], rectF, 5);
        b(canvas, m0[1], rectF, 5);
        while (r7 < r6) {
        }
        paint.setShader(null);
        i = kk7.d4;
        paint.setAlpha(kk7.d4);
        if (fArr != null) {
        }
        porterDuffColorFilter = this.A;
        if (porterDuffColorFilter != null) {
        }
        this.z = rgb;
        porterDuffColorFilter = new PorterDuffColorFilter(rgb, PorterDuff.Mode.SRC_IN);
        this.A = porterDuffColorFilter;
        paint22.setColorFilter(porterDuffColorFilter);
        while (r4 < r2) {
        }
        paint22.setColorFilter(null);
        paint22.setShader(null);
        paint22.setAlpha(kk7.d4);
    }

    public final void f(Bitmap[] bitmapArr) {
        this.Q = bitmapArr[0];
        System.arraycopy(bitmapArr, 1, this.O, 0, 8);
        System.arraycopy(bitmapArr, 9, this.P, 0, 8);
    }

    public final void j(int i) {
        if (i == this.f0) {
            return;
        }
        this.f0 = i;
        Bitmap[] bitmapArr = (Bitmap[]) p0.get(Integer.valueOf(i));
        if (bitmapArr != null) {
            f(bitmapArr);
        } else {
            l0.postRunnable(new on7((Object) this, i, (byte) 25));
        }
    }

    public final void k(float f, float f2) {
        if (this.i0 && this.S == f && this.T == f2) {
            return;
        }
        this.i0 = true;
        this.S = f;
        this.T = f2;
        double d = f;
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(f2);
        float sin = (float) (Math.sin(radians2) * Math.cos(radians));
        float sin2 = (float) Math.sin(radians);
        float cos = (float) (Math.cos(radians2) * Math.cos(radians));
        this.W = (float) ((sin * 0.83d) + (Math.cos(radians2) * 0.175d));
        this.X = 0.83f * sin2;
        float sin3 = (float) ((cos * 0.83d) + (Math.sin(radians2) * (-0.175d)));
        this.Y = sin3;
        float f3 = this.W;
        float f4 = this.X;
        float f5 = sin3 * sin3;
        float sqrt = (float) Math.sqrt(f5 + (f4 * f4) + (f3 * f3));
        float f6 = this.W / sqrt;
        this.W = f6;
        float f7 = this.X / sqrt;
        this.X = f7;
        float f8 = this.Y / sqrt;
        this.Y = f8;
        this.Z = f6 + sin;
        this.a0 = f7 + sin2;
        float f9 = f8 + cos;
        this.b0 = f9;
        float f10 = f9 * f9;
        float sqrt2 = (float) Math.sqrt(f10 + (r13 * r13) + (r12 * r12));
        this.Z /= sqrt2;
        this.a0 /= sqrt2;
        this.b0 /= sqrt2;
        this.U = (float) Math.toRadians(((f2 * 2.0f) + 1.72d) - (d * 1.25d));
        float f11 = (this.a0 * 4.0f) + ((this.Z - 0.103713065f) * (-2.0f));
        this.V = f11;
        float degrees = (float) Math.toDegrees(f11);
        Matrix matrix = this.e;
        matrix.setRotate(degrees, 168.0f, 102.5f);
        this.v.setLocalMatrix(matrix);
        this.w.setLocalMatrix(matrix);
        for (SweepGradient sweepGradient : this.F) {
            if (sweepGradient != null) {
                sweepGradient.setLocalMatrix(matrix);
            }
        }
        float cos2 = (float) Math.cos(radians);
        float sin4 = (float) Math.sin(radians);
        float cos3 = (float) Math.cos(radians2);
        float f12 = -((float) Math.sin(radians2));
        float f13 = (f12 * cos) + ((-cos3) * sin);
        float v = oo1.v(sin4, cos3, cos, (((-sin4) * f12) * sin) - (cos2 * sin2));
        float w = b00.w(cos2, cos3, cos, ((f12 * cos2) * sin) - (sin4 * sin2));
        double d2 = v;
        double d3 = w;
        float c = c((((((float) Math.pow(Math.max(0.0d, (d3 * 0.68d) + ((0.12d * d2) + (f13 * 0.72d))), 31.15d)) * 0.7832f) + ((((float) Math.pow(Math.max(0.0d, (d3 * 0.72d) + ((0.46d * d2) + ((-f13) * 0.52d))), 16.55d)) * 2.5191f) + ((((float) Math.pow(Math.max(0.0d, (0.571d * d3) + (d2 * 0.821d)), 4.65d)) * 0.1133f) + ((((float) Math.pow(Math.max(0.0d, (0.9757d * d3) + (0.2191d * d2)), 3.365d)) * 0.2556f) + i(0.061f, 0.356f, l(-0.45f, 0.72f, v)))))) - 0.12f) / 1.8f);
        float i = i(0.25f, 2.2f, c);
        float i2 = i(0.9f, 1.2f, c) * 0.35f;
        int i3 = 0;
        while (true) {
            int[] iArr = this.N;
            if (i3 >= iArr.length) {
                RectF rectF = this.M;
                this.c0 = new SweepGradient(rectF.centerX(), rectF.centerY(), iArr, (float[]) null);
                matrix.setRotate((float) Math.toDegrees(this.V), rectF.centerX(), rectF.centerY());
                this.c0.setLocalMatrix(matrix);
                this.d0.setLocalMatrix(matrix);
                return;
            }
            double abs = Math.abs(Math.cos(((i3 * 3.141592653589793d) * 2.0d) / 64.0d));
            double c2 = ((c(this.Y) * 0.35d) + 0.65d) * ((Math.pow(abs, 22.0d) * 13.0d) + (abs * 0.65d * abs) + (((0.4d * abs * abs) + 0.72d) * i)) * 6.0d;
            float i4 = i(i2, 1.0f, (float) Math.pow(c2 / (1.0d + c2), 0.9545454545454545d));
            iArr[i3] = Color.rgb(Math.round(0.992f * i4 * 255.0f), Math.round(0.996f * i4 * 255.0f), Math.round(i4 * 255.0f));
            i3++;
        }
    }
}
