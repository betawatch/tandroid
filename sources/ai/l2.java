package ai;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class l2 {
    public static final Paint a;
    public static final LinearGradient b;
    public static final Matrix c;
    public static final RectF d;
    public static int e;
    public static int f;
    public static final ColorFilter[][] g;

    static {
        Paint paint = new Paint(1);
        a = paint;
        Paint paint2 = new Paint(1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 16777215, -1, tileMode);
        b = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-637534209, 872415231, 234881023, 654311423}, new float[]{0.0f, 0.4f, 0.75f, 1.0f}, tileMode);
        c = new Matrix();
        d = new RectF();
        paint.setShader(linearGradient);
        paint2.setShader(linearGradient2);
        paint2.setStyle(Paint.Style.STROKE);
        e = -16733772;
        f = -14774554;
        g = (ColorFilter[][]) Array.newInstance((Class<?>) ColorFilter.class, 2, 49);
    }

    public static void a(Canvas canvas, float f10, float f11, float f12, float f13, float f14, boolean z10, float f15, float f16) {
        if (f15 <= 0.01f) {
            return;
        }
        int round = Math.round(((((float) Math.sin(((SystemClock.uptimeMillis() / 1000.0d) * 0.9d) + 1.3d)) * 0.5f) + 0.5f) * 48.0f);
        ColorFilter[][] colorFilterArr = g;
        ColorFilter colorFilter = colorFilterArr[z10 ? 1 : 0][round];
        if (colorFilter == null) {
            float f17 = round / 48.0f;
            int e10 = z10 ? u0.e(i0.a.f(f17, -14717953, -7447553)) : i0.a.f(f17, e, f);
            ColorFilter[] colorFilterArr2 = colorFilterArr[z10 ? 1 : 0];
            colorFilter = new PorterDuffColorFilter(e10, PorterDuff.Mode.SRC_IN);
            colorFilterArr2[round] = colorFilter;
        }
        Paint paint = a;
        paint.setColorFilter(colorFilter);
        float f18 = f13 - f11;
        Matrix matrix = c;
        matrix.setScale(1.0f, 0.65f * f18);
        matrix.postTranslate(0.0f, (f18 * 0.35f) + f11);
        b.setLocalMatrix(matrix);
        paint.setAlpha((int) (Math.min(1.0f, (f16 * 0.11f) + (z10 ? 0.26f : 0.2f)) * f15 * 255.0f));
        RectF rectF = d;
        rectF.set(f10, f11, f12, f13);
        canvas.drawRoundRect(rectF, f14, f14, paint);
    }
}
