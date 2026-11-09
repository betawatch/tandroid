package ai;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.util.HashMap;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class z {
    public static Bitmap a;
    public static BitmapShader b;
    public static final Paint c = new Paint(2);
    public static final Paint d = new Paint(3);
    public static final RectF e = new RectF();
    public static final Matrix f = new Matrix();
    public static final HashMap g = new HashMap();
    public static final SweepGradient[] h = new SweepGradient[4];
    public static int i = -1;
    public static final Paint j = new Paint(2);
    public static final Rect k = new Rect();
    public static final RectF l = new RectF();
    public static final int[] m = new int[4];
    public static final int[] n = new int[4];
    public static final float[] o = new float[4];
    public static final float[] p = new float[4];

    public static boolean a(float f10, float f11, int i7, Canvas canvas, RectF rectF) {
        float f12;
        float f13;
        float f14;
        boolean z9;
        RectF rectF2;
        boolean z10;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        float f15 = 0.004f;
        boolean z11 = true;
        if (f11 <= 0.004f) {
            return true;
        }
        int i10 = i;
        SweepGradient[] sweepGradientArr = h;
        float[][] fArr = o1.a;
        int i11 = 4;
        HashMap hashMap = g;
        if (i10 != 1) {
            i = 1;
            hashMap.clear();
            int i12 = 0;
            while (i12 < i11) {
                float[] fArr2 = fArr[i12];
                float f16 = f15;
                int[] iArr = new int[73];
                float[] fArr3 = new float[73];
                int i13 = 0;
                for (int i14 = 73; i13 < i14; i14 = 73) {
                    boolean z12 = z11;
                    SweepGradient[] sweepGradientArr2 = sweepGradientArr;
                    double radians = Math.toRadians(i13 * 5);
                    int i15 = i11;
                    HashMap hashMap2 = hashMap;
                    float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr2[6]);
                    float f17 = (((float) Math.sin(radians)) < 0.0f ? fArr2[11] : fArr2[12]) / 100.0f;
                    iArr[i13] = ((int) ((Math.max(0.0f, Math.min(1.0f, (((fArr2[5] / 100.0f) - f17) * pow) + f17)) * 255.0f) + 0.5f)) << 24;
                    fArr3[i13] = i13 / 72.0f;
                    i13++;
                    z11 = z12;
                    sweepGradientArr = sweepGradientArr2;
                    i11 = i15;
                    hashMap = hashMap2;
                }
                sweepGradientArr[i12] = new SweepGradient(0.0f, 0.0f, iArr, fArr3);
                i12++;
                f15 = f16;
                z11 = z11;
            }
        }
        float f18 = f15;
        boolean z13 = z11;
        SweepGradient[] sweepGradientArr3 = sweepGradientArr;
        int i16 = i11;
        HashMap hashMap3 = hashMap;
        float[] fArr4 = fArr[i7];
        float N = org.telegram.messenger.g0.N(fArr4[8]);
        float f19 = rectF.left + N;
        float f20 = rectF.top + N;
        float f21 = rectF.right - N;
        float f22 = rectF.bottom - N;
        float f23 = f21 - f19;
        float f24 = f22 - f20;
        if (f23 >= 1.0f) {
            if (f24 < 1.0f) {
                return z13;
            }
            float min = Math.min(Math.max(0.0f, f10 - N), Math.min(f23, f24) / 2.0f);
            float N2 = org.telegram.messenger.g0.N(fArr4[i16]);
            float max = Math.max(org.telegram.messenger.g0.N(fArr4[0]), org.telegram.messenger.g0.N(fArr4[2]));
            int ceil = ((int) Math.ceil(N2)) + 2;
            int ceil2 = ((int) Math.ceil(max + min)) + 1;
            int round = Math.round(f23);
            int round2 = Math.round(f24);
            int i17 = (ceil2 * 2) + 2;
            boolean z14 = round >= i17 ? z13 ? 1 : 0 : false;
            boolean z15 = round2 >= i17 ? z13 ? 1 : 0 : false;
            if (z14) {
                round = i17;
            }
            if (z15) {
                round2 = i17;
            }
            boolean z16 = z15;
            long round3 = (((Math.round(4.0f * min) << 32) ^ (i7 << 56)) ^ (round << 16)) ^ round2;
            Bitmap bitmap = (Bitmap) hashMap3.get(Long.valueOf(round3));
            if (bitmap == null) {
                float[] fArr5 = fArr[i7];
                int i18 = ceil * 2;
                bitmap = Bitmap.createBitmap(round + i18, i18 + round2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmap);
                f12 = f19;
                float f25 = ceil;
                RectF rectF3 = new RectF(f25, f25, round + ceil, round2 + ceil);
                float N3 = org.telegram.messenger.g0.N(fArr5[i16]);
                if (N3 > 0.05f) {
                    Matrix matrix = new Matrix();
                    f13 = f20;
                    f14 = f21;
                    matrix.setScale(rectF3.width() / Math.max(1.0f, rectF3.height()), 1.0f);
                    matrix.postTranslate(rectF3.centerX(), rectF3.centerY());
                    SweepGradient sweepGradient = sweepGradientArr3[i7];
                    sweepGradient.setLocalMatrix(matrix);
                    Paint paint = new Paint(z13 ? 1 : 0);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(N3);
                    paint.setShader(sweepGradient);
                    RectF rectF4 = new RectF(rectF3);
                    float f26 = (-N3) / 2.0f;
                    rectF4.inset(f26, f26);
                    float f27 = (N3 / 2.0f) + min;
                    canvas2.drawRoundRect(rectF4, f27, f27, paint);
                } else {
                    f13 = f20;
                    f14 = f21;
                }
                Paint paint2 = new Paint(1);
                paint2.setColor(-1);
                Path path = new Path();
                Path path2 = new Path();
                RectF rectF5 = new RectF();
                int i19 = 0;
                boolean z17 = z16;
                while (i19 < 2) {
                    float N4 = i19 == 0 ? org.telegram.messenger.g0.N(fArr5[0]) : -org.telegram.messenger.g0.N(fArr5[2]);
                    int i20 = i19;
                    float f28 = (i19 == 0 ? fArr5[1] : fArr5[3]) / 100.0f;
                    if (f28 <= f18 || Math.abs(N4) < 0.1f) {
                        rectF2 = rectF3;
                        z10 = z17;
                    } else {
                        path.rewind();
                        z10 = z17;
                        Path.Direction direction = Path.Direction.CW;
                        path.addRoundRect(rectF3, min, min, direction);
                        rectF5.set(rectF3);
                        rectF2 = rectF3;
                        rectF5.offset(0.0f, N4);
                        path2.rewind();
                        path2.addRoundRect(rectF5, min, min, direction);
                        canvas2.save();
                        a0.b(canvas2, path2);
                        paint2.setAlpha(Math.round(Math.min(1.0f, f28) * 255.0f));
                        canvas2.drawPath(path, paint2);
                        canvas2.restore();
                    }
                    i19 = i20 + 1;
                    z17 = z10;
                    rectF3 = rectF2;
                }
                z9 = z17;
                bitmap.prepareToDraw();
                hashMap3.put(Long.valueOf(round3), bitmap);
            } else {
                f12 = f19;
                f13 = f20;
                f14 = f21;
                z9 = z16;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i21 = z14 ? 3 : 1;
            int i22 = z9 ? 3 : 1;
            int[] iArr2 = m;
            iArr2[0] = 0;
            float f29 = ceil;
            float[] fArr6 = o;
            fArr6[0] = f12 - f29;
            if (z14) {
                iArr2[1] = ceil + ceil2;
                iArr2[2] = (width - ceil) - ceil2;
                float f30 = ceil2;
                fArr6[1] = f12 + f30;
                fArr6[2] = f14 - f30;
            }
            iArr2[i21] = width;
            fArr6[i21] = f14 + f29;
            int[] iArr3 = n;
            iArr3[0] = 0;
            float[] fArr7 = p;
            fArr7[0] = f13 - f29;
            if (z9) {
                iArr3[1] = ceil + ceil2;
                iArr3[2] = (height - ceil) - ceil2;
                float f31 = ceil2;
                fArr7[1] = f13 + f31;
                fArr7[2] = f22 - f31;
            }
            iArr3[i22] = height;
            fArr7[i22] = f22 + f29;
            int min2 = (int) (Math.min(1.0f, f11) * 255.0f);
            Paint paint3 = j;
            paint3.setAlpha(min2);
            int i23 = 0;
            while (i23 < i22) {
                int i24 = 0;
                while (i24 < i21) {
                    int i25 = iArr2[i24];
                    int i26 = iArr3[i23];
                    int i27 = i24 + 1;
                    int i28 = iArr2[i27];
                    int i29 = i23 + 1;
                    int i30 = iArr3[i29];
                    int i31 = i23;
                    Rect rect = k;
                    rect.set(i25, i26, i28, i30);
                    float f32 = fArr6[i24];
                    float f33 = fArr7[i31];
                    float f34 = fArr6[i27];
                    float f35 = fArr7[i29];
                    RectF rectF6 = l;
                    rectF6.set(f32, f33, f34, f35);
                    canvas.drawBitmap(bitmap, rect, rectF6, paint3);
                    i24 = i27;
                    i23 = i31;
                }
                i23++;
            }
        }
        return true;
    }

    public static void b(Canvas canvas, RectF rectF, float f10) {
        float f11 = rectF.left;
        float f12 = rectF.top;
        float f13 = rectF.right;
        float min = Math.min(rectF.height(), org.telegram.messenger.g0.L(40.0f)) + f12;
        RectF rectF2 = e;
        rectF2.set(f11, f12, f13, min);
        int max = (int) (Math.max(0.0f, Math.min(1.0f, f10)) * 255.0f * 0.3125f);
        Paint paint = c;
        paint.setAlpha(max);
        canvas.drawBitmap(d(), (Rect) null, rectF2, paint);
    }

    public static void c(Canvas canvas, RectF rectF, float f10, float f11) {
        Bitmap d2 = d();
        BitmapShader bitmapShader = b;
        Paint paint = d;
        if (bitmapShader == null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(d2, tileMode, tileMode);
            b = bitmapShader2;
            paint.setShader(bitmapShader2);
        }
        float width = rectF.width() / d2.getWidth();
        float min = Math.min(rectF.height(), org.telegram.messenger.g0.L(40.0f)) / d2.getHeight();
        Matrix matrix = f;
        matrix.setScale(width, min);
        matrix.postTranslate(rectF.left, rectF.top);
        b.setLocalMatrix(matrix);
        paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, f11)) * 255.0f * 0.3125f));
        canvas.drawRoundRect(rectF, f10, f10, paint);
    }

    public static Bitmap d() {
        if (a == null) {
            int[] iArr = new int[64];
            for (int i7 = 0; i7 < 64; i7++) {
                iArr[i7] = (((int) (((1.0f - ((i7 + 0.5f) / 64.0f)) * 64.0f) + 0.5f)) << 24) | 16777215;
            }
            a = Bitmap.createBitmap(iArr, 1, 64, Bitmap.Config.ARGB_8888);
        }
        return a;
    }
}
