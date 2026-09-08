package ji;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class z1 extends Drawable {
    public final Paint a;
    public final org.telegram.ui.Components.e6 b;
    public boolean c;
    public int d;

    public z1(int i10) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new org.telegram.ui.Components.e6(new ig.t0(this, 10), 420L, pr.h, 0);
        this.d = 255;
        paint.setColor(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float e7 = this.b.e(this.c);
        if (e7 <= 0.0f) {
            return;
        }
        Paint paint = this.a;
        paint.setAlpha((int) (this.d * e7));
        paint.setShadowLayer(AndroidUtilities.dp(12.0f) * e7, 0.0f, AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.l1(e7, 805306368));
        Rect bounds = getBounds();
        float dp = AndroidUtilities.dp(8.0f) * e7;
        float dp2 = AndroidUtilities.dp(0.0f) * e7;
        float dp3 = AndroidUtilities.dp(12.0f) * e7;
        canvas.drawRoundRect(bounds.left + dp, bounds.top + dp2, bounds.right - dp, (AndroidUtilities.dp(6.0f) * e7) + (bounds.bottom - dp2), dp3, dp3, paint);
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
