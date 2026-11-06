package org.telegram.ui.Wallet;

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
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class z5 {
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
    public static final org.telegram.messenger.q5 l0 = new org.telegram.messenger.q5("walletCardAssets", 10);
    public static final int[] o0 = {-16748837, -16747809, -16746781, -16745754, -16744728, -16743955, -16743183, -16742412, -16741643};
    public static final LruCache p0 = new LruCache(2);
    public final Paint b = new Paint(3);
    public final Paint c = new Paint(3);
    public final Paint d = new Paint(1);
    public final Matrix e = new Matrix();
    public final RectF f = new RectF(0.0f, 0.0f, 336.0f, 205.0f);
    public final RectF g = new RectF();
    public final RectF h = new RectF(-42.0f, -107.5f, 378.0f, 312.5f);
    public final float[] i = new float[qs.i2];
    public final float[] j = new float[qs.i2];
    public final float[] k = new float[qs.i2];
    public final float[] l = new float[qs.i2];
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

    public z5(Context context, int i7, int i10, Runnable runnable) {
        double d;
        int i11;
        boolean z9;
        float f10;
        double d2;
        InputStream open;
        int i12;
        float f11;
        int i13 = 3;
        boolean z10 = true;
        float f12 = 336.0f;
        float f13 = 205.0f;
        int i14 = 2;
        int i15 = 8;
        int i16 = 0;
        char c10 = 6;
        float f14 = 1.0f;
        this.a = runnable;
        this.R = context;
        int i17 = 0;
        while (i17 < 4) {
            float f15 = i17 < i14 ? 310.8f : 25.2f;
            int i18 = i16;
            if (i17 == 0 || i17 == i13) {
                i12 = i13;
                f11 = 25.368736f;
            } else {
                i12 = i13;
                f11 = 179.63126f;
            }
            char c11 = c10;
            float f16 = f14;
            int i19 = i18;
            while (i19 <= 18) {
                double radians = Math.toRadians((i19 * 5) + ((i17 * 90) - 90));
                int i20 = i14;
                int i21 = i15;
                float cos = (float) Math.cos(radians);
                float sin = (float) Math.sin(radians);
                float[] fArr = this.i;
                int i22 = ((i17 * 19) + i19) * 2;
                fArr[i22] = com.google.android.recaptcha.internal.a.y(cos, 25.2f, f15, 336.0f);
                int i23 = i22 + 1;
                fArr[i23] = com.google.android.recaptcha.internal.a.y(25.368736f, sin, f11, 205.0f);
                float[] fArr2 = this.j;
                fArr2[i22] = cos;
                fArr2[i23] = sin;
                i19++;
                i14 = i20;
                i15 = i21;
            }
            i17++;
            i16 = i18;
            i13 = i12;
            c10 = c11;
            f14 = f16;
        }
        int i24 = i13;
        int i25 = i14;
        int i26 = i15;
        int i27 = i16;
        char c12 = c10;
        float f17 = f14;
        float f18 = 336.0f - i10;
        this.M = new RectF(f18 - 48.0f, 74.0f, f18, 110.0f);
        if (m0 == null) {
            String[] strArr = {"finish_light", "finish_dark", "groove_along", "groove_across", "qr_brush_light", "qr_brush_dark", "grain"};
            m0 = new Bitmap[7];
            for (int i28 = i27; i28 < 7; i28++) {
                try {
                    open = context.getAssets().open("wallet_card_2d/" + strArr[i28] + ".webp");
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                try {
                    m0[i28] = BitmapFactory.decodeStream(open);
                    Bitmap bitmap = m0[i28];
                    if (bitmap != null) {
                        bitmap.prepareToDraw();
                    }
                    if (open != null) {
                        open.close();
                    }
                } catch (Throwable th2) {
                    if (open != null) {
                        try {
                            open.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }
        if (n0 == null) {
            int[] iArr = new int[i25];
            iArr[1] = i26;
            iArr[i27] = i25;
            Bitmap[][] bitmapArr = (Bitmap[][]) Array.newInstance((Class<?>) Bitmap.class, iArr);
            int i29 = i27;
            while (i29 < i25) {
                int i30 = i26;
                for (int i31 = i27; i31 < i30; i31++) {
                    try {
                        InputStream open2 = context.getAssets().open("wallet_card_2d/face_" + i29 + "_" + i31 + ".webp");
                        try {
                            bitmapArr[i29][i31] = BitmapFactory.decodeStream(open2);
                            Bitmap bitmap2 = bitmapArr[i29][i31];
                            if (bitmap2 != null) {
                                bitmap2.prepareToDraw();
                            }
                            if (open2 != null) {
                                open2.close();
                            }
                        } catch (Throwable th4) {
                            if (open2 != null) {
                                try {
                                    open2.close();
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                }
                            }
                            throw th4;
                        }
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                i29++;
                i26 = i30;
                i25 = 2;
            }
            n0 = bitmapArr;
        }
        int[] iArr2 = new int[qs.N1];
        int[] iArr3 = new int[qs.N1];
        int i32 = i27;
        while (true) {
            d = 128.0d;
            i11 = 128;
            z9 = z10;
            if (i32 > 128) {
                break;
            }
            float f19 = f12;
            double d10 = ((i32 * 3.141592653589793d) * 2.0d) / 128.0d;
            iArr2[i32] = Color.argb(Math.round(((float) Math.pow(Math.pow(Math.sin(d10) / 0.64d, 2.0d) + 1.0d, -2.0d)) * 64.0f), qs.e4, qs.e4, qs.e4);
            iArr3[i32] = Color.argb(Math.round(l(0.18f, 0.88f, (float) Math.abs(Math.cos(Math.atan2(Math.sin(d10) / 2.0d, Math.cos(d10))))) * 255.0f), qs.e4, qs.e4, qs.e4);
            i32++;
            z10 = z9 ? 1 : 0;
            f12 = f19;
            f13 = f13;
        }
        float f20 = f12;
        float f21 = f13;
        this.v = new SweepGradient(168.0f, 102.5f, iArr2, (float[]) null);
        SweepGradient sweepGradient = new SweepGradient(168.0f, 102.5f, iArr3, (float[]) null);
        this.w = sweepGradient;
        if (m0[c12] != null) {
            Bitmap bitmap3 = m0[c12];
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
            f10 = 0.88f;
            this.e.setScale(f20 / m0[c12].getWidth(), f21 / m0[c12].getHeight());
            bitmapShader.setLocalMatrix(this.e);
            this.y = new ComposeShader(bitmapShader, sweepGradient, PorterDuff.Mode.DST_IN);
        } else {
            f10 = 0.88f;
        }
        int i33 = i27;
        while (i33 < 2) {
            if (m0[i33] != null) {
                Bitmap bitmap4 = m0[i33];
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                d2 = d;
                this.e.setScale(f20 / m0[i33].getWidth(), f21 / m0[i33].getHeight());
                bitmapShader2.setLocalMatrix(this.e);
                this.x[i33] = new ComposeShader(bitmapShader2, this.w, PorterDuff.Mode.DST_IN);
            } else {
                d2 = d;
            }
            int i34 = i33 + 2;
            if (m0[i34] != null) {
                Bitmap bitmap5 = m0[i34];
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader3 = new BitmapShader(bitmap5, tileMode3, tileMode3);
                this.e.setScale(f20 / m0[i34].getWidth(), f21 / m0[i34].getHeight());
                bitmapShader3.setLocalMatrix(this.e);
                int[] iArr4 = new int[qs.N1];
                int i35 = i27;
                while (i35 <= i11) {
                    double d11 = ((i35 * 3.141592653589793d) * 2.0d) / d2;
                    float abs = (float) Math.abs(Math.cos(Math.atan2(Math.sin(d11) / 2.0d, Math.cos(d11))));
                    float l10 = l((float) Math.cos(1.350884841043611d), (float) Math.cos(0.3782477554922111d), abs);
                    float f22 = abs * abs;
                    if (i33 != 0) {
                        f22 = f17 - f22;
                    }
                    iArr4[i35] = a(l10 * f22, -1);
                    i35++;
                    i11 = 128;
                }
                this.F[i33] = new SweepGradient(168.0f, 102.5f, iArr4, (float[]) null);
                this.E[i33] = new ComposeShader(bitmapShader3, this.F[i33], PorterDuff.Mode.DST_IN);
            }
            i33++;
            d = d2;
            i11 = 128;
        }
        this.c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        this.d.setStyle(Paint.Style.STROKE);
        Random random = new Random(24560118926758988L);
        int i36 = i27;
        while (i36 < this.L.length) {
            float f23 = -1.0f;
            int i37 = i27;
            while (true) {
                if (i37 < (i36 == 0 ? z9 ? 1 : 0 : 32)) {
                    float nextFloat = random.nextFloat() * f20;
                    float nextFloat2 = random.nextFloat() * f21;
                    float f24 = Float.MAX_VALUE;
                    for (int i38 = i27; i38 < i36; i38++) {
                        float abs2 = Math.abs(nextFloat - this.L[i38][i27]);
                        float abs3 = Math.abs(nextFloat2 - this.L[i38][z9 ? 1 : 0]);
                        float min = Math.min(abs2, f20 - abs2);
                        float min2 = Math.min(abs3, f21 - abs3);
                        f24 = Math.min(f24, (min2 * min2) + (min * min));
                    }
                    if (f24 > f23) {
                        float[] fArr3 = this.L[i36];
                        fArr3[i27] = nextFloat;
                        fArr3[z9 ? 1 : 0] = nextFloat2;
                        f23 = f24;
                    }
                    i37++;
                }
            }
            this.L[i36][2] = (((random.nextFloat() * 6.0f) + f17) * f20) / 512.0f;
            double nextFloat3 = random.nextFloat() * 3.141592653589793d * 2.0d;
            float nextFloat4 = (random.nextFloat() * 0.45f) + 0.05f;
            float sqrt = f17 / ((float) Math.sqrt((nextFloat4 * nextFloat4) + f17));
            this.L[i36][i24] = ((float) Math.cos(nextFloat3)) * nextFloat4 * sqrt;
            this.L[i36][4] = ((float) Math.sin(nextFloat3)) * nextFloat4 * sqrt;
            this.L[i36][5] = sqrt;
            i36++;
        }
        int[] iArr5 = new int[65];
        for (int i39 = i27; i39 <= 64; i39++) {
            iArr5[i39] = a((((float) Math.pow(Math.abs(Math.cos(((i39 * 3.141592653589793d) * 2.0d) / 64.0d)), 8.0d)) * f10) + 0.12f, -1);
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
        f(h(context, i7));
        this.f0 = i7;
        k(0.0f, 0.0f);
        j0 = z9;
    }

    public static int a(float f10, int i7) {
        return i0.a.o(i7, Math.round(c(f10) * 255.0f));
    }

    public static float c(float f10) {
        return Math.max(0.0f, Math.min(1.0f, f10));
    }

    public static int d(float f10, float f11, float f12, int i7, int i10) {
        float f13 = f12 * 255.0f;
        return Color.rgb(Math.min(qs.e4, Math.round((Color.red(i10) * f11) + (Color.red(i7) * f10) + f13)), Math.min(qs.e4, Math.round((Color.green(i10) * f11) + (Color.green(i7) * f10) + f13)), Math.min(qs.e4, Math.round((Color.blue(i10) * f11) + (Color.blue(i7) * f10) + f13)));
    }

    public static float g(int i7) {
        float f10 = i7 / 255.0f;
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4d);
    }

    public static Bitmap[] h(Context context, int i7) {
        String str;
        StringBuilder sb2;
        int i10;
        String sb3;
        Integer valueOf = Integer.valueOf(i7);
        LruCache lruCache = p0;
        Bitmap[] bitmapArr = (Bitmap[]) lruCache.get(valueOf);
        if (bitmapArr != null) {
            return bitmapArr;
        }
        if (i7 == R.drawable.wallet_card_qr) {
            str = "qr";
        } else {
            if (i7 != R.drawable.wallet_card_info) {
                throw new IllegalArgumentException(jg.g.j(i7, "Missing packaged wallet icon: "));
            }
            str = "info";
        }
        Bitmap[] bitmapArr2 = new Bitmap[17];
        for (int i11 = 0; i11 < 17; i11++) {
            if (i11 == 0) {
                sb3 = "mask";
            } else {
                if (i11 <= 8) {
                    sb2 = new StringBuilder("light_");
                    i10 = i11 - 1;
                } else {
                    sb2 = new StringBuilder("dark_");
                    i10 = i11 - 9;
                }
                sb2.append(i10);
                sb3 = sb2.toString();
            }
            try {
                InputStream open = context.getAssets().open("wallet_card_2d/icon_" + str + "_" + sb3 + ".webp");
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(open);
                    bitmapArr2[i11] = decodeStream;
                    if (decodeStream == null) {
                        throw new IllegalStateException("Invalid wallet icon texture");
                    }
                    decodeStream.prepareToDraw();
                    if (open != null) {
                        open.close();
                    }
                } finally {
                }
            } catch (IOException e10) {
                throw new IllegalStateException("Missing wallet icon texture", e10);
            }
        }
        lruCache.put(Integer.valueOf(i7), bitmapArr2);
        return bitmapArr2;
    }

    public static float i(float f10, float f11, float f12) {
        return com.google.android.recaptcha.internal.a.z(f11, f10, f12, f10);
    }

    public static float l(float f10, float f11, float f12) {
        float c10 = c((f12 - f10) / (f11 - f10));
        return com.google.android.recaptcha.internal.a.C(c10, 2.0f, 3.0f, c10 * c10);
    }

    public final void b(Canvas canvas, Bitmap bitmap, RectF rectF, int i7) {
        if (bitmap == null) {
            return;
        }
        Paint paint = this.b;
        paint.setAlpha(i7);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
        paint.setAlpha(qs.e4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0443  */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, float[] fArr) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        Paint paint;
        char c10;
        char c11;
        int f10;
        float f11;
        boolean z9;
        int f12;
        RectF rectF;
        int i7;
        int rgb;
        ComposeShader composeShader;
        BlendMode blendMode;
        BlendMode blendMode2;
        boolean z10;
        int i10;
        int[] iArr4;
        int i11;
        float f13;
        int[] iArr5;
        float pow;
        boolean z11;
        int i12;
        float pow2;
        PorterDuffColorFilter[][] porterDuffColorFilterArr;
        ?? r33;
        int i13;
        int i14 = 0;
        while (true) {
            int i15 = fArr == null ? 1 : 2;
            iArr = this.D;
            iArr2 = this.K;
            iArr3 = this.J;
            paint = this.b;
            if (i14 >= i15) {
                break;
            }
            int i16 = -14184457;
            int i17 = -14456619;
            if (fArr != null) {
                int i18 = i14 * 4;
                int i19 = i18 + 10;
                if (fArr.length >= 18) {
                    float f14 = fArr[i19];
                    if (f14 >= 0.0f) {
                        int i20 = i18 + 11;
                        i17 = q7.o(-16216082, (int) f14, (int) fArr[i20]);
                        i16 = q7.o(-15291399, (int) fArr[i19], (int) fArr[i20]);
                    }
                }
                int i21 = i14 * 3;
                i17 = q7.p(-14456619, i21, fArr);
                i16 = q7.p(-14184457, i21, fArr);
            }
            boolean z12 = fArr != null && fArr.length >= 18 && fArr[(i14 * 4) + 10] >= 0.0f;
            int[][] iArr6 = this.H;
            int[] iArr7 = iArr6[i14];
            PorterDuffColorFilter[][] porterDuffColorFilterArr2 = this.I;
            boolean[] zArr = this.G;
            if (iArr7 != null && iArr3[i14] == i17 && iArr2[i14] == i16 && zArr[i14] == z12) {
                r33 = z12;
                porterDuffColorFilterArr = porterDuffColorFilterArr2;
            } else {
                iArr3[i14] = i17;
                iArr2[i14] = i16;
                zArr[i14] = z12;
                if (z12) {
                    float[] fArr2 = new float[3];
                    float[] fArr3 = new float[3];
                    int i22 = 0;
                    for (int i23 = 3; i22 < i23; i23 = 3) {
                        int i24 = 16 - (i22 * 8);
                        float g10 = g((i17 >> i24) & qs.e4) * 0.73f;
                        float[] fArr4 = fArr2;
                        if (g10 <= 0.0031308f) {
                            pow2 = g10 * 12.92f;
                            z11 = z12;
                            i12 = i16;
                        } else {
                            z11 = z12;
                            i12 = i16;
                            pow2 = (((float) Math.pow(g10, 0.4166666567325592d)) * 1.055f) - 0.055f;
                        }
                        fArr4[i22] = pow2;
                        float g11 = g((i12 >> i24) & qs.e4) * 0.73f;
                        fArr3[i22] = g11 <= 0.0031308f ? g11 * 12.92f : (((float) Math.pow(g11, 0.4166666567325592d)) * 1.055f) - 0.055f;
                        i22++;
                        i16 = i12;
                        fArr2 = fArr4;
                        z12 = z11;
                    }
                    z10 = z12;
                    i10 = i16;
                    float[] fArr5 = fArr2;
                    int i25 = i17;
                    float i26 = ((i(0.91f, 1.06f, 0.825f) * i(0.92f, 0.6f, 0.1066f) * com.google.android.recaptcha.internal.a.B((float) Math.pow(0.68d, i(34.0f, 5.5f, 0.1066f)), 0.7832f, (((float) Math.pow(0.72d, i(18.0f, 3.5f, 0.1066f))) * 2.5191f) + (((float) Math.pow(0.571d, i(5.0f, 1.5f, 0.1066f))) * 0.1133f) + (((float) Math.pow(0.9757d, i(3.6f, 1.25f, 0.1066f))) * 0.2556f) + i(0.061f, 0.356f, l(-0.45f, 0.72f, 0.0f)), 0.82f) * 1.1f * 1.45f) + 0.136598f) * 1.0760401f * 1.02925f;
                    iArr4 = new int[9];
                    int i27 = 0;
                    while (i27 <= 8) {
                        float f15 = i27 / 8.0f;
                        int i28 = -16777216;
                        int i29 = i25;
                        int i30 = 0;
                        while (i30 < 3) {
                            int i31 = i27;
                            PorterDuffColorFilter[][] porterDuffColorFilterArr3 = porterDuffColorFilterArr2;
                            float B = com.google.android.recaptcha.internal.a.B(f15, 0.2f, 0.8f, i(fArr5[i30], fArr3[i30], f15));
                            if (B <= 0.04045f) {
                                pow = B / 12.92f;
                                f13 = f15;
                                iArr5 = iArr;
                            } else {
                                double d = (B + 0.055f) / 1.055f;
                                f13 = f15;
                                iArr5 = iArr;
                                pow = (float) Math.pow(d, 2.4d);
                            }
                            float D = com.google.android.recaptcha.internal.a.D(i26, 1.3f, 1.765f, pow);
                            i28 |= Math.round(((float) Math.pow(i(c(com.google.android.recaptcha.internal.a.B(D, 2.51f, 0.03f, D) / ((((2.43f * D) + 0.59f) * D) + 0.14f)), c(D), 0.65f), 0.45454543828964233d)) * 255.0f) << (16 - (i30 * 8));
                            i30++;
                            iArr = iArr5;
                            i27 = i31;
                            porterDuffColorFilterArr2 = porterDuffColorFilterArr3;
                            f15 = f13;
                        }
                        int i32 = i27;
                        iArr4[i32] = i28;
                        i27 = i32 + 1;
                        i25 = i29;
                    }
                    i11 = i25;
                } else {
                    iArr4 = o0;
                    z10 = z12;
                    i10 = i16;
                    i11 = i17;
                }
                porterDuffColorFilterArr = porterDuffColorFilterArr2;
                int[] iArr8 = iArr;
                iArr6[i14] = iArr4;
                int i33 = 0;
                while (i33 < 8) {
                    int i34 = i33 + 1;
                    porterDuffColorFilterArr[i14][i33] = new PorterDuffColorFilter(iArr6[i14][i34], PorterDuff.Mode.SRC_IN);
                    i33 = i34;
                }
                float max = Math.max(1.0E-6f, Math.max((g(Color.red(i10)) + g(Color.red(i11))) * 0.5f, Math.max((g(Color.green(i10)) + g(Color.green(i11))) * 0.5f, (g(Color.blue(i10)) + g(Color.blue(i11))) * 0.5f)));
                iArr8[i14] = Color.rgb(Math.round(((float) Math.sqrt(r6 / max)) * 255.0f), Math.round(((float) Math.sqrt(r7 / max)) * 255.0f), Math.round(((float) Math.sqrt(r8 / max)) * 255.0f));
                r33 = z10;
            }
            if (fArr != null) {
                if (i14 != 0 || fArr[8] < 1.0f) {
                    i13 = 1;
                    if (i14 == 1 && fArr[8] <= 0.0f) {
                    }
                }
                i14++;
            } else {
                i13 = 1;
            }
            int save = canvas.save();
            if (i14 == i13 && fArr[9] < 0.5f && fArr[8] < 1.0f) {
                Path path = this.u;
                path.rewind();
                path.addCircle(fArr[6] * 336.0f, fArr[7] * 205.0f, fArr[8] * 336.0f * 1.2f, Path.Direction.CW);
                canvas.clipPath(path);
            }
            canvas.rotate((float) Math.toDegrees(this.U), 168.0f, 102.5f);
            int round = (i14 != 1 || fArr[9] <= 0.5f) ? qs.e4 : Math.round(fArr[8] * 255.0f);
            RectF rectF2 = this.h;
            int saveLayerAlpha = round < 255 ? canvas.saveLayerAlpha(rectF2, round) : -1;
            paint.setShader(null);
            paint.setColorFilter(null);
            paint.setColor(iArr6[i14][0]);
            canvas.drawRect(rectF2, paint);
            for (int i35 = 0; i35 < 8; i35++) {
                Bitmap bitmap = n0[r33][i35];
                if (bitmap != null) {
                    paint.setColorFilter(porterDuffColorFilterArr[i14][i35]);
                    canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint);
                }
            }
            paint.setColorFilter(null);
            if (saveLayerAlpha != -1) {
                canvas.restoreToCount(saveLayerAlpha);
            }
            paint.setAlpha(qs.e4);
            canvas.restoreToCount(save);
            i14++;
        }
        if (fArr == null) {
            f10 = iArr3[0];
            c11 = '\b';
            c10 = 1;
        } else {
            c10 = 1;
            c11 = '\b';
            f10 = i0.a.f(fArr[8], iArr3[0], iArr3[1]);
        }
        this.g0 = f10;
        this.h0 = fArr == null ? iArr2[0] : i0.a.f(fArr[c11], iArr2[0], iArr2[c10]);
        boolean z13 = fArr != null && fArr.length >= 18 && fArr[10] >= 0.0f;
        if (fArr == null || fArr.length < 18) {
            f11 = 0.0f;
        } else {
            f11 = 0.0f;
            if (fArr[14] >= 0.0f) {
                z9 = true;
                float c12 = (fArr != null || fArr.length < 18) ? f11 : c(fArr[8]);
                f12 = i0.a.f(c12, !z13 ? iArr[0] : -11227905, z9 ? iArr[1] : -11227905);
                if (this.C != null || this.B != f12) {
                    this.B = f12;
                    this.C = new PorterDuffColorFilter(f12, PorterDuff.Mode.SRC_IN);
                }
                float i36 = i(!z13 ? 0.18f : 0.25f, z9 ? 0.18f : 0.25f, c12);
                PorterDuffColorFilter porterDuffColorFilter = this.C;
                Paint paint2 = this.c;
                paint2.setColorFilter(porterDuffColorFilter);
                paint2.setShader(this.v);
                paint2.setAlpha(Math.round(((((c(this.Y) * 0.28f) + 0.72f) * 255.0f) * i36) / 0.25f));
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
                    i7 = qs.e4;
                    paint.setAlpha(qs.e4);
                } else {
                    blendMode = BlendMode.SOFT_LIGHT;
                    paint.setBlendMode(blendMode);
                    b(canvas, m0[6], rectF, Math.round(9.817499f));
                    paint.setShader(composeShader);
                    paint.setAlpha(Math.round(53.55f));
                    canvas.drawRect(rectF, paint);
                    paint.setShader(null);
                    paint.setAlpha(qs.e4);
                    blendMode2 = BlendMode.SRC_OVER;
                    paint.setBlendMode(blendMode2);
                    i7 = qs.e4;
                }
                rgb = fArr != null ? -13003265 : Color.rgb(Math.min(i7, Math.round(Color.red(this.h0) * 1.12f)), Math.min(i7, Math.round(Color.green(this.h0) * 1.12f)), Math.min(i7, Math.round(Color.blue(this.h0) * 1.12f)));
                if (this.A != null || this.z != rgb) {
                    this.z = rgb;
                    this.A = new PorterDuffColorFilter(rgb, PorterDuff.Mode.SRC_IN);
                }
                paint2.setColorFilter(this.A);
                for (Shader shader2 : this.E) {
                    if (shader2 != null) {
                        paint2.setShader(shader2);
                        paint2.setAlpha(Math.round(41.055f));
                        canvas.drawRect(rectF, paint2);
                    }
                }
                paint2.setColorFilter(null);
                paint2.setShader(null);
                paint2.setAlpha(qs.e4);
            }
        }
        z9 = false;
        if (fArr != null) {
        }
        f12 = i0.a.f(c12, !z13 ? iArr[0] : -11227905, z9 ? iArr[1] : -11227905);
        if (this.C != null) {
        }
        this.B = f12;
        this.C = new PorterDuffColorFilter(f12, PorterDuff.Mode.SRC_IN);
        float i362 = i(!z13 ? 0.18f : 0.25f, z9 ? 0.18f : 0.25f, c12);
        PorterDuffColorFilter porterDuffColorFilter2 = this.C;
        Paint paint22 = this.c;
        paint22.setColorFilter(porterDuffColorFilter2);
        paint22.setShader(this.v);
        paint22.setAlpha(Math.round(((((c(this.Y) * 0.28f) + 0.72f) * 255.0f) * i362) / 0.25f));
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
        i7 = qs.e4;
        paint.setAlpha(qs.e4);
        if (fArr != null) {
        }
        if (this.A != null) {
        }
        this.z = rgb;
        this.A = new PorterDuffColorFilter(rgb, PorterDuff.Mode.SRC_IN);
        paint22.setColorFilter(this.A);
        while (r6 < r4) {
        }
        paint22.setColorFilter(null);
        paint22.setShader(null);
        paint22.setAlpha(qs.e4);
    }

    public final void f(Bitmap[] bitmapArr) {
        this.Q = bitmapArr[0];
        System.arraycopy(bitmapArr, 1, this.O, 0, 8);
        System.arraycopy(bitmapArr, 9, this.P, 0, 8);
    }

    public final void j(int i7) {
        if (i7 == this.f0) {
            return;
        }
        this.f0 = i7;
        Bitmap[] bitmapArr = (Bitmap[]) p0.get(Integer.valueOf(i7));
        if (bitmapArr != null) {
            f(bitmapArr);
        } else {
            l0.postRunnable(new h2(this, i7, 1));
        }
    }

    public final void k(float f10, float f11) {
        if (this.i0 && this.S == f10 && this.T == f11) {
            return;
        }
        this.i0 = true;
        this.S = f10;
        this.T = f11;
        double d = f10;
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(f11);
        float sin = (float) (Math.sin(radians2) * Math.cos(radians));
        float sin2 = (float) Math.sin(radians);
        float cos = (float) (Math.cos(radians2) * Math.cos(radians));
        this.W = (float) ((sin * 0.83d) + (Math.cos(radians2) * 0.175d));
        this.X = 0.83f * sin2;
        float sin3 = (float) ((cos * 0.83d) + (Math.sin(radians2) * (-0.175d)));
        this.Y = sin3;
        float f12 = this.W;
        float f13 = this.X;
        float f14 = sin3 * sin3;
        float sqrt = (float) Math.sqrt(f14 + (f13 * f13) + (f12 * f12));
        float f15 = this.W / sqrt;
        this.W = f15;
        float f16 = this.X / sqrt;
        this.X = f16;
        float f17 = this.Y / sqrt;
        this.Y = f17;
        this.Z = f15 + sin;
        this.a0 = f16 + sin2;
        float f18 = f17 + cos;
        this.b0 = f18;
        float f19 = f18 * f18;
        float sqrt2 = (float) Math.sqrt(f19 + (r13 * r13) + (r12 * r12));
        this.Z /= sqrt2;
        this.a0 /= sqrt2;
        this.b0 /= sqrt2;
        this.U = (float) Math.toRadians(((f11 * 2.0f) + 1.72d) - (d * 1.25d));
        float f20 = (this.a0 * 4.0f) + ((this.Z - 0.103713065f) * (-2.0f));
        this.V = f20;
        float degrees = (float) Math.toDegrees(f20);
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
        float f21 = -((float) Math.sin(radians2));
        float f22 = (f21 * cos) + ((-cos3) * sin);
        float x10 = org.telegram.ui.Cells.f1.x(sin4, cos3, cos, (((-sin4) * f21) * sin) - (cos2 * sin2));
        float x11 = com.google.android.recaptcha.internal.a.x(cos2, cos3, cos, ((f21 * cos2) * sin) - (sin4 * sin2));
        double d2 = x10;
        double d10 = x11;
        float c10 = c((((((float) Math.pow(Math.max(0.0d, (d10 * 0.68d) + ((0.12d * d2) + (f22 * 0.72d))), 31.15d)) * 0.7832f) + ((((float) Math.pow(Math.max(0.0d, (d10 * 0.72d) + ((0.46d * d2) + ((-f22) * 0.52d))), 16.55d)) * 2.5191f) + ((((float) Math.pow(Math.max(0.0d, (0.571d * d10) + (d2 * 0.821d)), 4.65d)) * 0.1133f) + ((((float) Math.pow(Math.max(0.0d, (0.9757d * d10) + (0.2191d * d2)), 3.365d)) * 0.2556f) + i(0.061f, 0.356f, l(-0.45f, 0.72f, x10)))))) - 0.12f) / 1.8f);
        float i7 = i(0.25f, 2.2f, c10);
        float i10 = i(0.9f, 1.2f, c10) * 0.35f;
        int i11 = 0;
        while (true) {
            int[] iArr = this.N;
            if (i11 >= iArr.length) {
                RectF rectF = this.M;
                this.c0 = new SweepGradient(rectF.centerX(), rectF.centerY(), iArr, (float[]) null);
                matrix.setRotate((float) Math.toDegrees(this.V), rectF.centerX(), rectF.centerY());
                this.c0.setLocalMatrix(matrix);
                this.d0.setLocalMatrix(matrix);
                return;
            }
            double abs = Math.abs(Math.cos(((i11 * 3.141592653589793d) * 2.0d) / 64.0d));
            double c11 = ((c(this.Y) * 0.35d) + 0.65d) * ((Math.pow(abs, 22.0d) * 13.0d) + (abs * 0.65d * abs) + (((0.4d * abs * abs) + 0.72d) * i7)) * 6.0d;
            float i12 = i(i10, 1.0f, (float) Math.pow(c11 / (1.0d + c11), 0.9545454545454545d));
            iArr[i11] = Color.rgb(Math.round(0.992f * i12 * 255.0f), Math.round(0.996f * i12 * 255.0f), Math.round(i12 * 255.0f));
            i11++;
        }
    }
}
