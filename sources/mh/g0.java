package mh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class g0 extends Drawable {
    public final Paint a = new Paint(1);
    public final RectF b = new RectF();
    public final int c;
    public final Path d;
    public boolean e;
    public int f;
    public final y5 g;
    public final y5 h;

    public g0(int i9) {
        Path path = new Path();
        this.d = path;
        kh.f1 f1Var = new kh.f1(this, 22);
        gr grVar = gr.h;
        this.g = new y5(f1Var, 320L, grVar, 0);
        this.h = new y5(new kh.f1(this, 22), 320L, grVar, 0);
        this.c = i9;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.b;
        rectF.set(bounds);
        rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int i9 = this.c;
        Paint paint = this.a;
        canvas.drawRoundRect(rectF, i9, i9, paint);
        float e10 = this.g.e(this.e);
        float dp = (rectF.right + AndroidUtilities.dp(8.0f)) - this.h.d(this.f, false);
        if (e10 > 0.0f) {
            canvas.save();
            canvas.translate(dp, e2.c.z(1.0f, e10, AndroidUtilities.dp(6.16f), AndroidUtilities.dp(8.0f)));
            canvas.drawPath(this.d, paint);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
