package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e3 extends Drawable {
    public final Paint a;
    public final Rect b;
    public final Rect c;

    public e3() {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Rect();
        this.c = new Rect();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setColor(-16777216);
    }

    public final void a(int i9) {
        Rect rect = this.b;
        if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == i9) {
            return;
        }
        rect.set(0, 0, 0, i9);
        onBoundsChange(getBounds());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = this.c;
        if (rect.isEmpty()) {
            return;
        }
        Paint paint = this.a;
        if (paint.getAlpha() == 0 || AndroidUtilities.makingGlobalBlurBitmap) {
            return;
        }
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rect2 = this.c;
        rect2.set(rect);
        int i9 = rect2.left;
        Rect rect3 = this.b;
        rect2.left = Math.max(0, rect3.left) + i9;
        rect2.top = Math.max(0, rect3.top) + rect2.top;
        rect2.right -= Math.max(0, rect3.right);
        rect2.bottom -= Math.max(0, rect3.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.a.setAlpha(i9);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
