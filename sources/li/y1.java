package li;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class y1 extends Drawable {
    public boolean c;
    public final Paint a = new Paint(1);
    public final org.telegram.ui.Components.v5 b = new org.telegram.ui.Components.v5(new l2.a0(this, 6), 420, wq.h, 0);
    public int d = qs.e4;

    public y1(int i7) {
        a(i7);
    }

    public final void a(int i7) {
        this.a.setColor(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float d = this.b.d(this.c);
        if (d <= 0.0f) {
            return;
        }
        Paint paint = this.a;
        paint.setAlpha((int) (this.d * d));
        paint.setShadowLayer(org.telegram.messenger.g0.L(12.0f) * d, 0.0f, org.telegram.messenger.g0.L(3.0f), m6.r1(d, 805306368));
        Rect bounds = getBounds();
        float L = org.telegram.messenger.g0.L(8.0f) * d;
        float L2 = org.telegram.messenger.g0.L(0.0f) * d;
        float L3 = org.telegram.messenger.g0.L(12.0f) * d;
        canvas.drawRoundRect(bounds.left + L, bounds.top + L2, bounds.right - L, (org.telegram.messenger.g0.L(6.0f) * d) + (bounds.bottom - L2), L3, L3, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.d = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
