package ii;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class b2 extends Drawable {
    public final Paint a;
    public final org.telegram.ui.Components.g6 b;
    public boolean c;
    public int d;

    public b2(int i10) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new org.telegram.ui.Components.g6(new i2.h0(this, 5), 420L, hs.h, 0);
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
        paint.setShadowLayer(AndroidUtilities.dp(12.0f) * e7, 0.0f, AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.i6.m1(e7, 805306368));
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
