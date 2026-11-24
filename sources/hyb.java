// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hyb extends Drawable {
    public final Paint a = new Paint(1);
    public final RectF b = new RectF();
    public final /* synthetic */ int c;
    public final /* synthetic */ oyb d;

    public hyb(oyb oybVar, int i) {
        this.d = oybVar;
        this.c = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.b;
        rectF.set(bounds);
        float f = this.c;
        rectF.inset(f, f);
        float height = rectF.height() / 2.0f;
        int v0 = cmb.v0(cmb.N5, this.d.e);
        Paint paint = this.a;
        paint.setColor(v0);
        canvas.drawRoundRect(rectF, height, height, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
