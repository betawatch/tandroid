// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class isa extends Drawable {
    public final float a;
    public final Paint b;

    public isa(float f, int i) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.a = f;
        paint.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = gm.P;
        rectF.set(getBounds());
        Paint paint = this.b;
        float f = this.a;
        canvas.drawRoundRect(rectF, f, f, paint);
        gm.P(canvas, rectF, f);
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
