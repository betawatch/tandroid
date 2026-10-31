package bi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class h2 extends Drawable {
    public boolean c;
    public final Paint a = new Paint(1);
    public final org.telegram.ui.Components.t5 b = new org.telegram.ui.Components.t5(new a3.d(this, 22), 420, gr.h, 0);
    public int d = zs.e4;

    public h2(int i10) {
        a(i10);
    }

    public final void a(int i10) {
        this.a.setColor(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float d = this.b.d(this.c);
        if (d <= 0.0f) {
            return;
        }
        Paint paint = this.a;
        paint.setAlpha((int) (this.d * d));
        paint.setShadowLayer(org.telegram.messenger.i0.L(12.0f) * d, 0.0f, org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.r1(d, 805306368));
        Rect bounds = getBounds();
        float L = org.telegram.messenger.i0.L(8.0f) * d;
        float L2 = org.telegram.messenger.i0.L(0.0f) * d;
        float L3 = org.telegram.messenger.i0.L(12.0f) * d;
        canvas.drawRoundRect(bounds.left + L, bounds.top + L2, bounds.right - L, (org.telegram.messenger.i0.L(6.0f) * d) + (bounds.bottom - L2), L3, L3, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
