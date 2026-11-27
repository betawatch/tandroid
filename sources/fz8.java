// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class fz8 {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4 */
    public static boolean a(float f2, float f3, int i2, Canvas canvas, RectF rectF) {
        float f4;
        float f5;
        float f6;
        ?? r33;
        ?? r22;
        float f7;
        float f8;
        long j2;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        float f9 = 0.004f;
        boolean z = true;
        if (f3 <= 0.004f) {
            return true;
        }
        int i3 = i;
        SweepGradient[] sweepGradientArr = h;
        float[][] fArr = ehd.a;
        int i4 = 4;
        HashMap hashMap = g;
        if (i3 != 1) {
            i = 1;
            hashMap.clear();
            int i5 = 0;
            while (i5 < i4) {
                float[] fArr2 = fArr[i5];
                float f10 = f9;
                int[] iArr = new int[73];
                float[] fArr3 = new float[73];
                int i6 = 0;
                for (int i7 = 73; i6 < i7; i7 = 73) {
                    boolean z2 = z;
                    SweepGradient[] sweepGradientArr2 = sweepGradientArr;
                    double radians = Math.toRadians(i6 * 5);
                    int i8 = i4;
                    HashMap hashMap2 = hashMap;
                    float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr2[6]);
                    float f11 = (((float) Math.sin(radians)) < 0.0f ? fArr2[11] : fArr2[12]) / 100.0f;
                    iArr[i6] = ((int) ((Math.max(0.0f, Math.min(1.0f, (((fArr2[5] / 100.0f) - f11) * pow) + f11)) * 255.0f) + 0.5f)) << 24;
                    fArr3[i6] = i6 / 72.0f;
                    i6++;
                    z = z2;
                    sweepGradientArr = sweepGradientArr2;
                    i4 = i8;
                    hashMap = hashMap2;
                }
                sweepGradientArr[i5] = new SweepGradient(0.0f, 0.0f, iArr, fArr3);
                i5++;
                f9 = f10;
                z = z;
            }
        }
        float f12 = f9;
        boolean z3 = z;
        SweepGradient[] sweepGradientArr3 = sweepGradientArr;
        int i9 = i4;
        HashMap hashMap3 = hashMap;
        float[] fArr4 = fArr[i2];
        float N = hl.N(fArr4[8]);
        float f13 = rectF.left + N;
        float f14 = rectF.top + N;
        float f15 = rectF.right - N;
        float f16 = rectF.bottom - N;
        float f17 = f15 - f13;
        float f18 = f16 - f14;
        if (f17 >= 1.0f) {
            if (f18 < 1.0f) {
                return z3;
            }
            float min = Math.min(Math.max(0.0f, f2 - N), Math.min(f17, f18) / 2.0f);
            float N2 = hl.N(fArr4[i9]);
            float max = Math.max(hl.N(fArr4[0]), hl.N(fArr4[2]));
            int ceil = ((int) Math.ceil(N2)) + 2;
            int ceil2 = ((int) Math.ceil(max + min)) + 1;
            int round = Math.round(f17);
            int round2 = Math.round(f18);
            int i10 = (ceil2 << 1) + 2;
            ?? r13 = round >= i10 ? z3 ? 1 : 0 : false;
            ?? r15 = round2 >= i10 ? z3 ? 1 : 0 : false;
            if (r13 != false) {
                round = i10;
            }
            if (r15 != false) {
                round2 = i10;
            }
            ?? r12 = r15;
            long round3 = (((i2 << 56) ^ (Math.round(4.0f * min) << 32)) ^ (round << 16)) ^ round2;
            Bitmap bitmap = (Bitmap) hashMap3.get(Long.valueOf(round3));
            if (bitmap == null) {
                float[] fArr5 = fArr[i2];
                int i11 = ceil << 1;
                f4 = f13;
                bitmap = Bitmap.createBitmap(round + i11, i11 + round2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmap);
                f5 = f14;
                float f19 = ceil;
                RectF rectF2 = new RectF(f19, f19, round + ceil, round2 + ceil);
                float N3 = hl.N(fArr5[i9]);
                if (N3 > 0.05f) {
                    Matrix matrix = new Matrix();
                    f6 = f15;
                    matrix.setScale(rectF2.width() / Math.max(1.0f, rectF2.height()), 1.0f);
                    matrix.postTranslate(rectF2.centerX(), rectF2.centerY());
                    SweepGradient sweepGradient = sweepGradientArr3[i2];
                    sweepGradient.setLocalMatrix(matrix);
                    Paint paint = new Paint(z3 ? 1 : 0);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(N3);
                    paint.setShader(sweepGradient);
                    RectF rectF3 = new RectF(rectF2);
                    float f20 = (-N3) / 2.0f;
                    rectF3.inset(f20, f20);
                    float f21 = (N3 / 2.0f) + min;
                    canvas2.drawRoundRect(rectF3, f21, f21, paint);
                } else {
                    f6 = f15;
                }
                Paint paint2 = new Paint(1);
                paint2.setColor(-1);
                Path path = new Path();
                Path path2 = new Path();
                RectF rectF4 = new RectF();
                r33 = r12;
                r22 = r13;
                int i12 = 0;
                while (i12 < 2) {
                    if (i12 == 0) {
                        float N4 = hl.N(fArr5[0]);
                        f8 = fArr5[1];
                        f7 = N4;
                    } else {
                        f7 = -hl.N(fArr5[2]);
                        f8 = fArr5[3];
                    }
                    int i13 = i12;
                    float f22 = f8 / 100.0f;
                    if (f22 <= f12 || Math.abs(f7) < 0.1f) {
                        j2 = round3;
                    } else {
                        path.rewind();
                        j2 = round3;
                        Path.Direction direction = Path.Direction.CW;
                        path.addRoundRect(rectF2, min, min, direction);
                        rectF4.set(rectF2);
                        rectF4.offset(0.0f, f7);
                        path2.rewind();
                        path2.addRoundRect(rectF4, min, min, direction);
                        canvas2.save();
                        zz.d(canvas2, path2);
                        paint2.setAlpha(Math.round(Math.min(1.0f, f22) * 255.0f));
                        canvas2.drawPath(path, paint2);
                        canvas2.restore();
                    }
                    i12 = i13 + 1;
                    round3 = j2;
                }
                bitmap.prepareToDraw();
                hashMap3.put(Long.valueOf(round3), bitmap);
            } else {
                f4 = f13;
                f5 = f14;
                f6 = f15;
                r33 = r12;
                r22 = r13;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i14 = r22 != false ? 3 : 1;
            int i15 = r33 != false ? 3 : 1;
            int[] iArr2 = m;
            iArr2[0] = 0;
            float f23 = ceil;
            float[] fArr6 = o;
            fArr6[0] = f4 - f23;
            if (r22 != false) {
                iArr2[1] = ceil + ceil2;
                iArr2[2] = (width - ceil) - ceil2;
                float f24 = ceil2;
                fArr6[1] = f4 + f24;
                fArr6[2] = f6 - f24;
            }
            iArr2[i14] = width;
            fArr6[i14] = f6 + f23;
            int[] iArr3 = n;
            iArr3[0] = 0;
            float[] fArr7 = p;
            fArr7[0] = f5 - f23;
            if (r33 != false) {
                iArr3[1] = ceil + ceil2;
                iArr3[2] = (height - ceil) - ceil2;
                float f25 = ceil2;
                fArr7[1] = f5 + f25;
                fArr7[2] = f16 - f25;
            }
            iArr3[i15] = height;
            fArr7[i15] = f16 + f23;
            int min2 = (int) (Math.min(1.0f, f3) * 255.0f);
            Paint paint3 = j;
            paint3.setAlpha(min2);
            int i16 = 0;
            while (i16 < i15) {
                int i17 = 0;
                while (i17 < i14) {
                    int i18 = iArr2[i17];
                    int i19 = iArr3[i16];
                    int i20 = i17 + 1;
                    int i21 = iArr2[i20];
                    int i22 = i16 + 1;
                    int i23 = iArr3[i22];
                    int i24 = i16;
                    Rect rect = k;
                    rect.set(i18, i19, i21, i23);
                    float f26 = fArr6[i17];
                    float f27 = fArr7[i24];
                    float f28 = fArr6[i20];
                    float f29 = fArr7[i22];
                    RectF rectF5 = l;
                    rectF5.set(f26, f27, f28, f29);
                    canvas.drawBitmap(bitmap, rect, rectF5, paint3);
                    i17 = i20;
                    i16 = i24;
                }
                i16++;
            }
        }
        return true;
    }

    public static void b(Canvas canvas, RectF rectF, float f2) {
        float f3 = rectF.left;
        float f4 = rectF.top;
        float f5 = rectF.right;
        float min = Math.min(rectF.height(), hl.L(40.0f)) + f4;
        RectF rectF2 = e;
        rectF2.set(f3, f4, f5, min);
        int max = (int) (Math.max(0.0f, Math.min(1.0f, f2)) * 255.0f * 0.3125f);
        Paint paint = c;
        paint.setAlpha(max);
        canvas.drawBitmap(d(), (Rect) null, rectF2, paint);
    }

    public static void c(Canvas canvas, RectF rectF, float f2, float f3) {
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
        float min = Math.min(rectF.height(), hl.L(40.0f)) / d2.getHeight();
        Matrix matrix = f;
        matrix.setScale(width, min);
        matrix.postTranslate(rectF.left, rectF.top);
        b.setLocalMatrix(matrix);
        paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, f3)) * 255.0f * 0.3125f));
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }

    public static Bitmap d() {
        Bitmap bitmap = a;
        if (bitmap != null) {
            return bitmap;
        }
        int[] iArr = new int[64];
        for (int i2 = 0; i2 < 64; i2++) {
            iArr[i2] = (((int) (((1.0f - ((i2 + 0.5f) / 64.0f)) * 64.0f) + 0.5f)) << 24) | 16777215;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, 1, 64, Bitmap.Config.ARGB_8888);
        a = createBitmap;
        return createBitmap;
    }
}
