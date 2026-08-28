package gh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y3 extends Drawable {
    public final Paint a;
    public final LinearGradient[] b;
    public final Matrix c;
    public final org.telegram.ui.Components.y5 d;
    public final Path e;
    public final bb f;
    public int g;
    public int h;

    public y3() {
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        this.a = new Paint(1);
        this.b = new LinearGradient[2];
        this.c = new Matrix();
        this.d = new org.telegram.ui.Components.y5(1.0f, new fh.o1(this, 11), 0L, 420L, gr.h);
        this.e = new Path();
        this.f = new bb(1, 45);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(117440511);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        paint2.setStyle(style);
        paint2.setColor(301989887);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    public final void a(int i9, int i10) {
        if (this.g == i9 && this.h == i10) {
            return;
        }
        LinearGradient[] linearGradientArr = this.b;
        linearGradientArr[0] = linearGradientArr[1];
        this.g = i9;
        this.h = i10;
        linearGradientArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i9, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d.d(0.0f, true);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AndroidUtilities.rectTmp.set(getBounds());
        float dp = AndroidUtilities.dp(24.0f);
        int i9 = 0;
        float d = this.d.d(1.0f, false);
        while (true) {
            LinearGradient[] linearGradientArr = this.b;
            if (i9 >= linearGradientArr.length) {
                Path path = this.e;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                bb bbVar = this.f;
                bbVar.g(rectF);
                bbVar.h = 30.0f;
                bbVar.d();
                bbVar.a(canvas, org.telegram.ui.ActionBar.f6.l1(0.6f, -1));
                invalidateSelf();
                canvas.restore();
                AndroidUtilities.drawStroke(canvas, rectF, dp);
                return;
            }
            if (linearGradientArr[i9] != null) {
                float pow = (float) Math.pow(1.0f - Math.abs(i9 - d), 0.5d);
                if (pow > 0.0f) {
                    Matrix matrix = this.c;
                    matrix.reset();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    matrix.postScale(rectF2.width() / 100.0f, 1.0f);
                    linearGradientArr[i9].setLocalMatrix(matrix);
                    LinearGradient linearGradient = linearGradientArr[i9];
                    Paint paint = this.a;
                    paint.setShader(linearGradient);
                    paint.setAlpha((int) (pow * 255.0f));
                    canvas.drawRoundRect(rectF2, dp, dp, paint);
                }
            }
            i9++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
