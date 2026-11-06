package bi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class c6 extends Drawable {
    public Drawable g;
    public int h;
    public int i;
    public final Paint b = new Paint(1);
    public final Shader[] c = new Shader[2];
    public final Matrix d = new Matrix();
    public final org.telegram.ui.Components.w5 e = new org.telegram.ui.Components.w5(1.0f, new a3.f(this, 27), 0, 420, xq.h);
    public final RectF f = new RectF();
    public final int a = 1;

    public final void a(int i7, int i10) {
        if (this.h == i7 && this.i == i10) {
            return;
        }
        Shader[] shaderArr = this.c;
        shaderArr[0] = shaderArr[1];
        if (this.a == 0) {
            this.h = i7;
            this.i = i10;
            shaderArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            float L = org.telegram.messenger.g0.L(340.0f);
            this.h = i7;
            this.i = i10;
            shaderArr[1] = new RadialGradient(0.0f, 0.0f, L, new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.e.e(true, 0.0f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f;
        rectF.set(bounds);
        rectF.right = rectF.width() + rectF.left;
        int i7 = 0;
        float e10 = this.e.e(false, 1.0f);
        while (true) {
            Shader[] shaderArr = this.c;
            if (i7 >= shaderArr.length) {
                break;
            }
            if (shaderArr[i7] != null) {
                float pow = (float) Math.pow(1.0f - Math.abs(i7 - e10), 0.25d);
                if (pow > 0.0f) {
                    Matrix matrix = this.d;
                    matrix.reset();
                    if (this.a == 1) {
                        matrix.postTranslate(rectF.centerX(), org.telegram.messenger.g0.L(145.0f));
                    } else {
                        matrix.postScale(getBounds().width() / 100.0f, 1.0f);
                    }
                    shaderArr[i7].setLocalMatrix(matrix);
                    Shader shader = shaderArr[i7];
                    Paint paint = this.b;
                    paint.setShader(shader);
                    paint.setAlpha((int) (pow * 255.0f));
                    canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
                }
            }
            i7++;
        }
        if (this.g != null) {
            canvas.save();
            canvas.translate(rectF.centerX(), org.telegram.messenger.g0.L(145.0f));
            i1.a(canvas, 0, this.g, rectF.width(), org.telegram.messenger.g0.L(290.0f), 2.0f, 1.0f);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
