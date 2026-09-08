package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f01;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class u0 extends Drawable {
    public final float a = 0.75f;
    public final Drawable b;
    public final f01 c;

    public u0(Context context, int i10) {
        this.b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        f01 f01Var = new f01(i2.g.i(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.c = f01Var;
        f01Var.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
        Drawable drawable = this.b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        this.c.c(bounds.centerX() - (this.c.c / 2.0f), AndroidUtilities.dp(0.15f) + bounds.centerY(), drawable.getAlpha() / 255.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) (this.b.getIntrinsicHeight() * this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (this.b.getIntrinsicWidth() * this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
