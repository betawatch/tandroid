// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class jua extends Drawable {
    public final float a;
    public final Paint b;

    public jua(float f, int i) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.a = f;
        paint.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = hl.P;
        rectF.set(getBounds());
        Paint paint = this.b;
        float f = this.a;
        canvas.drawRoundRect(rectF, f, f, paint);
        hl.P(canvas, rectF, f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
