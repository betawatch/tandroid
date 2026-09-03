package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k01;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class j0 extends Drawable {
    public final float a = 0.75f;
    public final Drawable b;
    public final k01 c;

    public j0(Context context, int i10) {
        this.b = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
        k01 k01Var = new k01(l.d.j(i10, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.c = k01Var;
        k01Var.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
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
