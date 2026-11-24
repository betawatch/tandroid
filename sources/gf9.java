// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class gf9 extends Drawable {
    public boolean c;
    public final Paint a = new Paint(1);
    public final ln b = new ln(new pp8(this, 29), 420, d53.h, 0);
    public int d = nm7.d4;

    public gf9(int i) {
        a(i);
    }

    public final void a(int i) {
        this.a.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float d = this.b.d(this.c);
        if (d <= 0.0f) {
            return;
        }
        Paint paint = this.a;
        paint.setAlpha((int) (this.d * d));
        paint.setShadowLayer(gm.L(12.0f) * d, 0.0f, gm.L(3.0f), cmb.p1(d, 805306368));
        Rect bounds = getBounds();
        float L = gm.L(8.0f) * d;
        float L2 = gm.L(0.0f) * d;
        float L3 = gm.L(12.0f) * d;
        canvas.drawRoundRect(bounds.left + L, bounds.top + L2, bounds.right - L, (gm.L(6.0f) * d) + (bounds.bottom - L2), L3, L3, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
