package gh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h4 extends Drawable {
    public Drawable g;
    public int h;
    public int i;
    public final Paint b = new Paint(1);
    public final Shader[] c = new Shader[2];
    public final Matrix d = new Matrix();
    public final org.telegram.ui.Components.y5 e = new org.telegram.ui.Components.y5(1.0f, new fh.o1(this, 14), 0, 420, gr.h);
    public final RectF f = new RectF();
    public final int a = 1;

    public final void a(int i9, int i10) {
        if (this.h == i9 && this.i == i10) {
            return;
        }
        Shader[] shaderArr = this.c;
        shaderArr[0] = shaderArr[1];
        if (this.a == 0) {
            this.h = i9;
            this.i = i10;
            shaderArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i9, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            float dp = AndroidUtilities.dp(340.0f);
            this.h = i9;
            this.i = i10;
            shaderArr[1] = new RadialGradient(0.0f, 0.0f, dp, new int[]{i9, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.e.d(0.0f, true);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f;
        rectF.set(bounds);
        rectF.right = rectF.width() + rectF.left;
        int i9 = 0;
        float d = this.e.d(1.0f, false);
        while (true) {
            Shader[] shaderArr = this.c;
            if (i9 >= shaderArr.length) {
                break;
            }
            if (shaderArr[i9] != null) {
                float pow = (float) Math.pow(1.0f - Math.abs(i9 - d), 0.25d);
                if (pow > 0.0f) {
                    Matrix matrix = this.d;
                    matrix.reset();
                    if (this.a == 1) {
                        matrix.postTranslate(rectF.centerX(), AndroidUtilities.dp(145.0f));
                    } else {
                        matrix.postScale(getBounds().width() / 100.0f, 1.0f);
                    }
                    shaderArr[i9].setLocalMatrix(matrix);
                    Shader shader = shaderArr[i9];
                    Paint paint = this.b;
                    paint.setShader(shader);
                    paint.setAlpha((int) (pow * 255.0f));
                    canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
                }
            }
            i9++;
        }
        if (this.g != null) {
            canvas.save();
            canvas.translate(rectF.centerX(), AndroidUtilities.dp(145.0f));
            y0.a(canvas, 0, this.g, rectF.width(), AndroidUtilities.dp(290.0f), 2.0f, 1.0f);
            canvas.restore();
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
