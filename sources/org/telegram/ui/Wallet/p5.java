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
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class p5 {
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
    public static final DispatchQueue l0 = new DispatchQueue("walletCardAssets", true, 10);
    public static final int[] o0 = {-16748837, -16747809, -16746781, -16745754, -16744728, -16743955, -16743183, -16742412, -16741643};
    public static final LruCache p0 = new LruCache(2);
    public final Paint b = new Paint(3);
    public final Paint c = new Paint(3);
    public final Paint d = new Paint(1);
    public final Matrix e = new Matrix();
    public final RectF f = new RectF(0.0f, 0.0f, 336.0f, 205.0f);
    public final RectF g = new RectF();
    public final RectF h = new RectF(-42.0f, -107.5f, 378.0f, 312.5f);
    public final float[] i = new float[152];
    public final float[] j = new float[152];
    public final float[] k = new float[152];
    public final float[] l = new float[152];
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

    public p5(Context context, int i10, int i11, Runnable runnable) {
        char c10;
        int i12;
        float f7;
        float f10;
        int i13;
        int i14;
        float f11;
        int i15 = 3;
        boolean z10 = true;
        float f12 = 336.0f;
        float f13 = 205.0f;
        int i16 = 2;
        int i17 = 8;
        int i18 = 0;
        char c11 = 6;
        float f14 = 1.0f;
        this.a = runnable;
        this.R = context;
        int i19 = 0;
        while (true) {
            c10 = 4;
            if (i19 >= 4) {
                break;
            }
            float f15 = i19 < 2 ? 310.8f : 25.2f;
            boolean z11 = z10;
            if (i19 == 0 || i19 == i15) {
                i14 = i15;
                f11 = 25.368736f;
            } else {
                i14 = i15;
                f11 = 179.63126f;
            }
            int i20 = i18;
            char c12 = c11;
            while (i18 <= 18) {
                int i21 = (i19 * 19) + i18;
                float f16 = f14;
                double radians = Math.toRadians((i18 * 5) + ((i19 * 90) - 90));
                int i22 = i17;
                int i23 = i18;
                float cos = (float) Math.cos(radians);
                float sin = (float) Math.sin(radians);
                float[] fArr = this.i;
                int i24 = i21 * 2;
                fArr[i24] = com.google.android.gms.internal.play_billing.k3.w(cos, 25.2f, f15, 336.0f);
                int i25 = i24 + 1;
                fArr[i25] = com.google.android.gms.internal.play_billing.k3.w(25.368736f, sin, f11, 205.0f);
                float[] fArr2 = this.j;
                fArr2[i24] = cos;
                fArr2[i25] = sin;
                i18 = i23 + 1;
                i17 = i22;
                f14 = f16;
            }
            i19++;
            z10 = z11;
            i15 = i14;
            i18 = i20;
            c11 = c12;
        }
        int i26 = i15;
        boolean z12 = z10;
        int i27 = i17;
        int i28 = i18;
        char c13 = c11;
        float f17 = f14;
        float f18 = 336.0f - i11;
        this.M = new RectF(f18 - 48.0f, 74.0f, f18, 110.0f);
        if (m0 == null) {
            String[] strArr = {"finish_light", "finish_dark", "groove_along", "groove_across", "qr_brush_light", "qr_brush_dark", "grain"};
            m0 = new Bitmap[7];
            for (int i29 = i28; i29 < 7; i29++) {
                try {
                    InputStream open = context.getAssets().open("wallet_card_2d/" + strArr[i29] + ".webp");
                    try {
                        m0[i29] = BitmapFactory.decodeStream(open);
                        Bitmap bitmap = m0[i29];
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        if (n0 == null) {
            int[] iArr = new int[2];
            iArr[z12 ? 1 : 0] = i27;
            iArr[i28] = 2;
            Bitmap[][] bitmapArr = (Bitmap[][]) Array.newInstance((Class<?>) Bitmap.class, iArr);
            int i30 = i28;
            while (i30 < 2) {
                int i31 = i27;
                for (int i32 = i28; i32 < i31; i32++) {
                    try {
                        InputStream open2 = context.getAssets().open("wallet_card_2d/face_" + i30 + "_" + i32 + ".webp");
                        try {
                            bitmapArr[i30][i32] = BitmapFactory.decodeStream(open2);
                            Bitmap bitmap2 = bitmapArr[i30][i32];
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                i30++;
                i27 = i31;
            }
            n0 = bitmapArr;
        }
        int[] iArr2 = new int[129];
        int[] iArr3 = new int[129];
        int i33 = i28;
        while (true) {
            i12 = 128;
            f7 = f12;
            f10 = f13;
            if (i33 > 128) {
                break;
            }
            double d = ((i33 * 3.141592653589793d) * 2.0d) / 128.0d;
            iArr2[i33] = Color.argb(Math.round(((float) Math.pow(Math.pow(Math.sin(d) / 0.64d, 2.0d) + 1.0d, -2.0d)) * 64.0f), 255, 255, 255);
            iArr3[i33] = Color.argb(Math.round(l(0.18f, 0.88f, (float) Math.abs(Math.cos(Math.atan2(Math.sin(d) / 2.0d, Math.cos(d))))) * 255.0f), 255, 255, 255);
            i33++;
            f13 = f10;
            c10 = c10;
            f12 = f7;
        }
        char c14 = c10;
        this.v = new SweepGradient(168.0f, 102.5f, iArr2, (float[]) null);
        SweepGradient sweepGradient = new SweepGradient(168.0f, 102.5f, iArr3, (float[]) null);
        this.w = sweepGradient;
        if (m0[c13] != null) {
            Bitmap bitmap3 = m0[c13];
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
            this.e.setScale(f7 / m0[c13].getWidth(), f10 / m0[c13].getHeight());
            bitmapShader.setLocalMatrix(this.e);
            this.y = new ComposeShader(bitmapShader, sweepGradient, PorterDuff.Mode.DST_IN);
        }
        int i34 = i28;
        while (i34 < i16) {
            if (m0[i34] != null) {
                Bitmap bitmap4 = m0[i34];
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                this.e.setScale(f7 / m0[i34].getWidth(), f10 / m0[i34].getHeight());
                bitmapShader2.setLocalMatrix(this.e);
                i13 = i16;
                this.x[i34] = new ComposeShader(bitmapShader2, this.w, PorterDuff.Mode.DST_IN);
            } else {
                i13 = i16;
            }
            int i35 = i34 + 2;
            if (m0[i35] != null) {
                Bitmap bitmap5 = m0[i35];
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader3 = new BitmapShader(bitmap5, tileMode3, tileMode3);
                this.e.setScale(f7 / m0[i35].getWidth(), f10 / m0[i35].getHeight());
                bitmapShader3.setLocalMatrix(this.e);
                int[] iArr4 = new int[129];
                int i36 = i28;
                while (i36 <= i12) {
                    double d10 = ((i36 * 3.141592653589793d) * 2.0d) / 128.0d;
                    float abs = (float) Math.abs(Math.cos(Math.atan2(Math.sin(d10) / 2.0d, Math.cos(d10))));
                    float l4 = l((float) Math.cos(1.350884841043611d), (float) Math.cos(0.3782477554922111d), abs);
                    float f19 = abs * abs;
                    if (i34 != 0) {
                        f19 = f17 - f19;
                    }
                    iArr4[i36] = a(l4 * f19, -1);
                    i36++;
                    i12 = 128;
                }
                this.F[i34] = new SweepGradient(168.0f, 102.5f, iArr4, (float[]) null);
                this.E[i34] = new ComposeShader(bitmapShader3, this.F[i34], PorterDuff.Mode.DST_IN);
            }
            i34++;
            i16 = i13;
            i12 = 128;
        }
        int i37 = i16;
        this.c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        this.d.setStyle(Paint.Style.STROKE);
        Random random = new Random(24560118926758988L);
        int i38 = i28;
        while (i38 < this.L.length) {
            float f20 = -1.0f;
            int i39 = i28;
            while (true) {
                if (i39 < (i38 == 0 ? z12 ? 1 : 0 : 32)) {
                    float nextFloat = random.nextFloat() * f7;
                    float nextFloat2 = random.nextFloat() * f10;
                    float f21 = Float.MAX_VALUE;
                    for (int i40 = i28; i40 < i38; i40++) {
                        float abs2 = Math.abs(nextFloat - this.L[i40][i28]);
                        float abs3 = Math.abs(nextFloat2 - this.L[i40][z12 ? 1 : 0]);
                        float min = Math.min(abs2, f7 - abs2);
                        float min2 = Math.min(abs3, f10 - abs3);
                        f21 = Math.min(f21, (min2 * min2) + (min * min));
                    }
                    if (f21 > f20) {
                        float[] fArr3 = this.L[i38];
                        fArr3[i28] = nextFloat;
                        fArr3[z12 ? 1 : 0] = nextFloat2;
                        f20 = f21;
                    }
                    i39++;
                }
            }
            this.L[i38][i37] = (((random.nextFloat() * 6.0f) + f17) * f7) / 512.0f;
            double nextFloat3 = random.nextFloat() * 3.141592653589793d * 2.0d;
            float d11 = org.telegram.ui.Cells.c1.d(random, 0.45f, 0.05f);
            float sqrt = f17 / ((float) Math.sqrt((d11 * d11) + f17));
            this.L[i38][i26] = ((float) Math.cos(nextFloat3)) * d11 * sqrt;
            this.L[i38][c14] = ((float) Math.sin(nextFloat3)) * d11 * sqrt;
            this.L[i38][5] = sqrt;
            i38++;
        }
        int[] iArr5 = new int[65];
        for (int i41 = i28; i41 <= 64; i41++) {
            iArr5[i41] = a((((float) Math.pow(Math.abs(Math.cos(((i41 * 3.141592653589793d) * 2.0d) / 64.0d)), 8.0d)) * 0.88f) + 0.12f, -1);
        }
        SweepGradient sweepGradient2 = new SweepGradient(this.M.centerX(), this.M.centerY(), iArr5, (float[]) null);
        this.d0 = sweepGradient2;
        if (m0[c14] != null) {
            Bitmap bitmap6 = m0[c14];
            Shader.TileMode tileMode4 = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader4 = new BitmapShader(bitmap6, tileMode4, tileMode4);
            this.e.setScale(this.M.width() / m0[c14].getWidth(), this.M.height() / m0[c14].getHeight());
            Matrix matrix = this.e;
            RectF rectF = this.M;
            matrix.postTranslate(rectF.left, rectF.top);
            bitmapShader4.setLocalMatrix(this.e);
            this.e0 = new ComposeShader(bitmapShader4, sweepGradient2, PorterDuff.Mode.DST_IN);
        }
        f(h(context, i10));
        this.f0 = i10;
        k(0.0f, 0.0f);
        j0 = z12;
    }

    public static int a(float f7, int i10) {
        return i0.a.o(i10, Math.round(c(f7) * 255.0f));
    }

    public static float c(float f7) {
        return Math.max(0.0f, Math.min(1.0f, f7));
    }

    public static int d(float f7, float f10, float f11, int i10, int i11) {
        float f12 = f11 * 255.0f;
        return Color.rgb(Math.min(255, Math.round((Color.red(i11) * f10) + (Color.red(i10) * f7) + f12)), Math.min(255, Math.round((Color.green(i11) * f10) + (Color.green(i10) * f7) + f12)), Math.min(255, Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f7) + f12)));
    }

    public static float g(int i10) {
        float f7 = i10 / 255.0f;
        return f7 <= 0.04045f ? f7 / 12.92f : (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4d);
    }

    public static Bitmap[] h(Context context, int i10) {
        String str;
        StringBuilder sb2;
        int i11;
        String sb3;
        Integer valueOf = Integer.valueOf(i10);
        LruCache lruCache = p0;
        Bitmap[] bitmapArr = (Bitmap[]) lruCache.get(valueOf);
        if (bitmapArr != null) {
            return bitmapArr;
        }
        if (i10 == R.drawable.wallet_card_qr) {
            str = "qr";
        } else {
            if (i10 != R.drawable.wallet_card_info) {
                throw new IllegalArgumentException(i2.e.j(i10, "Missing packaged wallet icon: "));
            }
            str = "info";
        }
        Bitmap[] bitmapArr2 = new Bitmap[17];
        for (int i12 = 0; i12 < 17; i12++) {
            if (i12 == 0) {
                sb3 = "mask";
            } else {
                if (i12 <= 8) {
                    sb2 = new StringBuilder("light_");
                    i11 = i12 - 1;
                } else {
                    sb2 = new StringBuilder("dark_");
                    i11 = i12 - 9;
                }
                sb2.append(i11);
                sb3 = sb2.toString();
            }
            try {
                InputStream open = context.getAssets().open("wallet_card_2d/icon_" + str + "_" + sb3 + ".webp");
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(open);
                    bitmapArr2[i12] = decodeStream;
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
                throw new IllegalStateException("Missing wallet icon texture", e);
            }
        }
        lruCache.put(Integer.valueOf(i10), bitmapArr2);
        return bitmapArr2;
    }

    public static float i(float f7, float f10, float f11) {
        return com.google.android.gms.internal.play_billing.k3.y(f10, f7, f11, f7);
    }

    public static float l(float f7, float f10, float f11) {
        float c10 = c((f11 - f7) / (f10 - f7));
        return com.google.android.gms.internal.play_billing.k3.B(c10, 2.0f, 3.0f, c10 * c10);
    }

    public final void b(Canvas canvas, Bitmap bitmap, RectF rectF, int i10) {
        if (bitmap == null) {
            return;
        }
        Paint paint = this.b;
        paint.setAlpha(i10);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
        paint.setAlpha(255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0500  */
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
        int f7;
        float f10;
        boolean z10;
        int f11;
        RectF rectF;
        int i10;
        int rgb;
        ComposeShader composeShader;
        BlendMode blendMode;
        boolean z11;
        int i11;
        int[] iArr4;
        int i12;
        float f12;
        int[] iArr5;
        float pow;
        boolean z12;
        int i13;
        float pow2;
        PorterDuffColorFilter[][] porterDuffColorFilterArr;
        ?? r33;
        int i14;
        int i15 = 0;
        while (true) {
            int i16 = fArr == null ? 1 : 2;
            iArr = this.D;
            iArr2 = this.K;
            iArr3 = this.J;
            paint = this.b;
            if (i15 >= i16) {
                break;
            }
            int i17 = -14184457;
            int i18 = -14456619;
            if (fArr != null) {
                int i19 = i15 * 4;
                int i20 = i19 + 10;
                if (fArr.length >= 18) {
                    float f13 = fArr[i20];
                    if (f13 >= 0.0f) {
                        int i21 = i19 + 11;
                        i18 = h7.o(-16216082, (int) f13, (int) fArr[i21]);
                        i17 = h7.o(-15291399, (int) fArr[i20], (int) fArr[i21]);
                    }
                }
                int i22 = i15 * 3;
                i18 = h7.p(fArr, -14456619, i22);
                i17 = h7.p(fArr, -14184457, i22);
            }
            boolean z13 = fArr != null && fArr.length >= 18 && fArr[(i15 * 4) + 10] >= 0.0f;
            int[][] iArr6 = this.H;
            int[] iArr7 = iArr6[i15];
            PorterDuffColorFilter[][] porterDuffColorFilterArr2 = this.I;
            boolean[] zArr = this.G;
            if (iArr7 != null && iArr3[i15] == i18 && iArr2[i15] == i17 && zArr[i15] == z13) {
                r33 = z13;
                porterDuffColorFilterArr = porterDuffColorFilterArr2;
            } else {
                iArr3[i15] = i18;
                iArr2[i15] = i17;
                zArr[i15] = z13;
                if (z13) {
                    float[] fArr2 = new float[3];
                    float[] fArr3 = new float[3];
                    int i23 = 0;
                    for (int i24 = 3; i23 < i24; i24 = 3) {
                        int i25 = 16 - (i23 * 8);
                        float g10 = g((i18 >> i25) & 255) * 0.73f;
                        float[] fArr4 = fArr2;
                        if (g10 <= 0.0031308f) {
                            pow2 = g10 * 12.92f;
                            z12 = z13;
                            i13 = i17;
                        } else {
                            z12 = z13;
                            i13 = i17;
                            pow2 = (((float) Math.pow(g10, 0.4166666567325592d)) * 1.055f) - 0.055f;
                        }
                        fArr4[i23] = pow2;
                        float g11 = g((i13 >> i25) & 255) * 0.73f;
                        fArr3[i23] = g11 <= 0.0031308f ? g11 * 12.92f : (((float) Math.pow(g11, 0.4166666567325592d)) * 1.055f) - 0.055f;
                        i23++;
                        i17 = i13;
                        fArr2 = fArr4;
                        z13 = z12;
                    }
                    z11 = z13;
                    i11 = i17;
                    float[] fArr5 = fArr2;
                    int i26 = i18;
                    float i27 = ((i(0.91f, 1.06f, 0.825f) * i(0.92f, 0.6f, 0.1066f) * com.google.android.gms.internal.play_billing.k3.A((float) Math.pow(0.68d, i(34.0f, 5.5f, 0.1066f)), 0.7832f, (((float) Math.pow(0.72d, i(18.0f, 3.5f, 0.1066f))) * 2.5191f) + (((float) Math.pow(0.571d, i(5.0f, 1.5f, 0.1066f))) * 0.1133f) + (((float) Math.pow(0.9757d, i(3.6f, 1.25f, 0.1066f))) * 0.2556f) + i(0.061f, 0.356f, l(-0.45f, 0.72f, 0.0f)), 0.82f) * 1.1f * 1.45f) + 0.136598f) * 1.0760401f * 1.02925f;
                    iArr4 = new int[9];
                    int i28 = 0;
                    while (i28 <= 8) {
                        float f14 = i28 / 8.0f;
                        int i29 = -16777216;
                        int i30 = i26;
                        int i31 = 0;
                        while (i31 < 3) {
                            int i32 = i28;
                            PorterDuffColorFilter[][] porterDuffColorFilterArr3 = porterDuffColorFilterArr2;
                            float A = com.google.android.gms.internal.play_billing.k3.A(f14, 0.2f, 0.8f, i(fArr5[i31], fArr3[i31], f14));
                            if (A <= 0.04045f) {
                                pow = A / 12.92f;
                                f12 = f14;
                                iArr5 = iArr;
                            } else {
                                double d = (A + 0.055f) / 1.055f;
                                f12 = f14;
                                iArr5 = iArr;
                                pow = (float) Math.pow(d, 2.4d);
                            }
                            float C = com.google.android.gms.internal.play_billing.k3.C(i27, 1.3f, 1.765f, pow);
                            i29 |= Math.round(((float) Math.pow(i(c(com.google.android.gms.internal.play_billing.k3.A(C, 2.51f, 0.03f, C) / ((((2.43f * C) + 0.59f) * C) + 0.14f)), c(C), 0.65f), 0.45454543828964233d)) * 255.0f) << (16 - (i31 * 8));
                            i31++;
                            iArr = iArr5;
                            i28 = i32;
                            porterDuffColorFilterArr2 = porterDuffColorFilterArr3;
                            f14 = f12;
                        }
                        int i33 = i28;
                        iArr4[i33] = i29;
                        i28 = i33 + 1;
                        i26 = i30;
                    }
                    i12 = i26;
                } else {
                    iArr4 = o0;
                    z11 = z13;
                    i11 = i17;
                    i12 = i18;
                }
                porterDuffColorFilterArr = porterDuffColorFilterArr2;
                int[] iArr8 = iArr;
                iArr6[i15] = iArr4;
                int i34 = 0;
                while (i34 < 8) {
                    int i35 = i34 + 1;
                    porterDuffColorFilterArr[i15][i34] = new PorterDuffColorFilter(iArr6[i15][i35], PorterDuff.Mode.SRC_IN);
                    i34 = i35;
                }
                float max = Math.max(1.0E-6f, Math.max((g(Color.red(i11)) + g(Color.red(i12))) * 0.5f, Math.max((g(Color.green(i11)) + g(Color.green(i12))) * 0.5f, (g(Color.blue(i11)) + g(Color.blue(i12))) * 0.5f)));
                iArr8[i15] = Color.rgb(Math.round(((float) Math.sqrt(r6 / max)) * 255.0f), Math.round(((float) Math.sqrt(r7 / max)) * 255.0f), Math.round(((float) Math.sqrt(r8 / max)) * 255.0f));
                r33 = z11;
            }
            if (fArr != null) {
                if (i15 != 0 || fArr[8] < 1.0f) {
                    i14 = 1;
                    if (i15 == 1 && fArr[8] <= 0.0f) {
                    }
                }
                i15++;
            } else {
                i14 = 1;
            }
            int save = canvas.save();
            if (i15 == i14 && fArr[9] < 0.5f && fArr[8] < 1.0f) {
                Path path = this.u;
                path.rewind();
                path.addCircle(fArr[6] * 336.0f, fArr[7] * 205.0f, fArr[8] * 336.0f * 1.2f, Path.Direction.CW);
                canvas.clipPath(path);
            }
            canvas.rotate((float) Math.toDegrees(this.U), 168.0f, 102.5f);
            int round = (i15 != 1 || fArr[9] <= 0.5f) ? 255 : Math.round(fArr[8] * 255.0f);
            RectF rectF2 = this.h;
            int saveLayerAlpha = round < 255 ? canvas.saveLayerAlpha(rectF2, round) : -1;
            paint.setShader(null);
            paint.setColorFilter(null);
            paint.setColor(iArr6[i15][0]);
            canvas.drawRect(rectF2, paint);
            for (int i36 = 0; i36 < 8; i36++) {
                Bitmap bitmap = n0[r33][i36];
                if (bitmap != null) {
                    paint.setColorFilter(porterDuffColorFilterArr[i15][i36]);
                    canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint);
                }
            }
            paint.setColorFilter(null);
            if (saveLayerAlpha != -1) {
                canvas.restoreToCount(saveLayerAlpha);
            }
            paint.setAlpha(255);
            canvas.restoreToCount(save);
            i15++;
        }
        if (fArr == null) {
            f7 = iArr3[0];
            c11 = '\b';
            c10 = 1;
        } else {
            c10 = 1;
            c11 = '\b';
            f7 = i0.a.f(fArr[8], iArr3[0], iArr3[1]);
        }
        this.g0 = f7;
        this.h0 = fArr == null ? iArr2[0] : i0.a.f(fArr[c11], iArr2[0], iArr2[c10]);
        boolean z14 = fArr != null && fArr.length >= 18 && fArr[10] >= 0.0f;
        if (fArr == null || fArr.length < 18) {
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
            if (fArr[14] >= 0.0f) {
                z10 = true;
                float c12 = (fArr != null || fArr.length < 18) ? f10 : c(fArr[8]);
                f11 = i0.a.f(c12, !z14 ? iArr[0] : -11227905, z10 ? iArr[1] : -11227905);
                if (this.C != null || this.B != f11) {
                    this.B = f11;
                    this.C = new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN);
                }
                float i37 = i(!z14 ? 0.18f : 0.25f, z10 ? 0.18f : 0.25f, c12);
                PorterDuffColorFilter porterDuffColorFilter = this.C;
                Paint paint2 = this.c;
                paint2.setColorFilter(porterDuffColorFilter);
                paint2.setShader(this.v);
                paint2.setAlpha(Math.round(((((c(this.Y) * 0.28f) + 0.72f) * 255.0f) * i37) / 0.25f));
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
                    i10 = 255;
                    paint.setAlpha(255);
                } else {
                    blendMode = BlendMode.SOFT_LIGHT;
                    paint.setBlendMode(blendMode);
                    b(canvas, m0[6], rectF, Math.round(9.817499f));
                    paint.setShader(composeShader);
                    paint.setAlpha(Math.round(53.55f));
                    canvas.drawRect(rectF, paint);
                    paint.setShader(null);
                    paint.setAlpha(255);
                    paint.setBlendMode(BlendMode.SRC_OVER);
                    i10 = 255;
                }
                rgb = fArr != null ? -13003265 : Color.rgb(Math.min(i10, Math.round(Color.red(this.h0) * 1.12f)), Math.min(i10, Math.round(Color.green(this.h0) * 1.12f)), Math.min(i10, Math.round(Color.blue(this.h0) * 1.12f)));
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
                paint2.setAlpha(255);
            }
        }
        z10 = false;
        if (fArr != null) {
        }
        f11 = i0.a.f(c12, !z14 ? iArr[0] : -11227905, z10 ? iArr[1] : -11227905);
        if (this.C != null) {
        }
        this.B = f11;
        this.C = new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN);
        float i372 = i(!z14 ? 0.18f : 0.25f, z10 ? 0.18f : 0.25f, c12);
        PorterDuffColorFilter porterDuffColorFilter2 = this.C;
        Paint paint22 = this.c;
        paint22.setColorFilter(porterDuffColorFilter2);
        paint22.setShader(this.v);
        paint22.setAlpha(Math.round(((((c(this.Y) * 0.28f) + 0.72f) * 255.0f) * i372) / 0.25f));
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
        i10 = 255;
        paint.setAlpha(255);
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
        paint22.setAlpha(255);
    }

    public final void f(Bitmap[] bitmapArr) {
        this.Q = bitmapArr[0];
        System.arraycopy(bitmapArr, 1, this.O, 0, 8);
        System.arraycopy(bitmapArr, 9, this.P, 0, 8);
    }

    public final void j(int i10) {
        if (i10 == this.f0) {
            return;
        }
        this.f0 = i10;
        Bitmap[] bitmapArr = (Bitmap[]) p0.get(Integer.valueOf(i10));
        if (bitmapArr != null) {
            f(bitmapArr);
        } else {
            l0.postRunnable(new j(this, i10, 2));
        }
    }

    public final void k(float f7, float f10) {
        if (this.i0 && this.S == f7 && this.T == f10) {
            return;
        }
        this.i0 = true;
        this.S = f7;
        this.T = f10;
        double d = f7;
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(f10);
        float sin = (float) (Math.sin(radians2) * Math.cos(radians));
        float sin2 = (float) Math.sin(radians);
        float cos = (float) (Math.cos(radians2) * Math.cos(radians));
        this.W = (float) ((sin * 0.83d) + (Math.cos(radians2) * 0.175d));
        this.X = 0.83f * sin2;
        float sin3 = (float) ((cos * 0.83d) + (Math.sin(radians2) * (-0.175d)));
        this.Y = sin3;
        float f11 = this.W;
        float f12 = this.X;
        float f13 = sin3 * sin3;
        float sqrt = (float) Math.sqrt(f13 + (f12 * f12) + (f11 * f11));
        float f14 = this.W / sqrt;
        this.W = f14;
        float f15 = this.X / sqrt;
        this.X = f15;
        float f16 = this.Y / sqrt;
        this.Y = f16;
        this.Z = f14 + sin;
        this.a0 = f15 + sin2;
        float f17 = f16 + cos;
        this.b0 = f17;
        float f18 = f17 * f17;
        float sqrt2 = (float) Math.sqrt(f18 + (r13 * r13) + (r12 * r12));
        this.Z /= sqrt2;
        this.a0 /= sqrt2;
        this.b0 /= sqrt2;
        this.U = (float) Math.toRadians(((f10 * 2.0f) + 1.72d) - (d * 1.25d));
        float f19 = (this.a0 * 4.0f) + ((this.Z - 0.103713065f) * (-2.0f));
        this.V = f19;
        float degrees = (float) Math.toDegrees(f19);
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
        float f20 = -((float) Math.sin(radians2));
        float f21 = (f20 * cos) + ((-cos3) * sin);
        float z10 = org.telegram.ui.Cells.c1.z(sin4, cos3, cos, (((-sin4) * f20) * sin) - (cos2 * sin2));
        float t10 = com.google.android.gms.internal.play_billing.k3.t(cos2, cos3, cos, ((f20 * cos2) * sin) - (sin4 * sin2));
        double d10 = z10;
        double d11 = t10;
        float c10 = c((((((float) Math.pow(Math.max(0.0d, (d11 * 0.68d) + ((0.12d * d10) + (f21 * 0.72d))), 31.15d)) * 0.7832f) + ((((float) Math.pow(Math.max(0.0d, (d11 * 0.72d) + ((0.46d * d10) + ((-f21) * 0.52d))), 16.55d)) * 2.5191f) + ((((float) Math.pow(Math.max(0.0d, (0.571d * d11) + (d10 * 0.821d)), 4.65d)) * 0.1133f) + ((((float) Math.pow(Math.max(0.0d, (0.9757d * d11) + (0.2191d * d10)), 3.365d)) * 0.2556f) + i(0.061f, 0.356f, l(-0.45f, 0.72f, z10)))))) - 0.12f) / 1.8f);
        float i10 = i(0.25f, 2.2f, c10);
        float i11 = i(0.9f, 1.2f, c10) * 0.35f;
        int i12 = 0;
        while (true) {
            int[] iArr = this.N;
            if (i12 >= iArr.length) {
                RectF rectF = this.M;
                this.c0 = new SweepGradient(rectF.centerX(), rectF.centerY(), iArr, (float[]) null);
                matrix.setRotate((float) Math.toDegrees(this.V), rectF.centerX(), rectF.centerY());
                this.c0.setLocalMatrix(matrix);
                this.d0.setLocalMatrix(matrix);
                return;
            }
            double abs = Math.abs(Math.cos(((i12 * 3.141592653589793d) * 2.0d) / 64.0d));
            double c11 = ((c(this.Y) * 0.35d) + 0.65d) * ((Math.pow(abs, 22.0d) * 13.0d) + (abs * 0.65d * abs) + (((0.4d * abs * abs) + 0.72d) * i10)) * 6.0d;
            float i13 = i(i11, 1.0f, (float) Math.pow(c11 / (1.0d + c11), 0.9545454545454545d));
            iArr[i12] = Color.rgb(Math.round(0.992f * i13 * 255.0f), Math.round(0.996f * i13 * 255.0f), Math.round(i13 * 255.0f));
            i12++;
        }
    }
}
