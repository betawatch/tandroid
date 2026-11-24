// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
