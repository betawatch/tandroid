package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class FabBackgroundDrawable extends Drawable {
    public final Paint a = new Paint(1);
    public final Paint b;
    public Bitmap c;

    public FabBackgroundDrawable() {
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(1275068416);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.c == null) {
            onBoundsChange(getBounds());
        }
        int min = Math.min(getBounds().width(), getBounds().height());
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().centerX() - (this.c.getWidth() / 2), getBounds().centerY() - (this.c.getHeight() / 2), this.b);
        }
        float f7 = min / 2;
        canvas.drawCircle(f7, f7, r0 - org.telegram.messenger.i0.L(4.0f), this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int L = org.telegram.messenger.i0.L(4.0f);
        rect.set(L, L, L, L);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int min = Math.min(rect.width(), rect.height());
        if (min <= 0) {
            this.c = null;
            return;
        }
        this.c = Bitmap.createBitmap(min, min, Bitmap.Config.ALPHA_8);
        float f7 = min / 2;
        new Canvas(this.c).drawCircle(f7, f7, r5 - org.telegram.messenger.i0.L(4.0f), new Paint(1));
    }

    public void setColor(int i10) {
        this.a.setColor(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
