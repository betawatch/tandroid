package bi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class t6 extends Drawable {
    public final float a;
    public final Paint b;

    public t6(float f10, int i7) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.a = f10;
        paint.setColor(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        Paint paint = this.b;
        float f10 = this.a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        org.telegram.messenger.g0.P(canvas, rectF, f10);
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
