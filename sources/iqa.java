// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class iqa extends Drawable {
    public final float a;
    public final Paint b;

    public iqa(float f, int i) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.a = f;
        paint.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = gl.P;
        rectF.set(getBounds());
        Paint paint = this.b;
        float f = this.a;
        canvas.drawRoundRect(rectF, f, f, paint);
        gl.P(canvas, rectF, f);
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
