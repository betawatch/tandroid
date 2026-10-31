package gg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d extends Drawable {
    public Drawable a;
    public float b;
    public int c;

    public final void a(int i10) {
        if (this.c != i10) {
            this.c = i10;
            setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        Rect bounds = getBounds();
        float f7 = this.b;
        if (f7 == 1.0f) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds((int) (bounds.centerX() - ((bounds.width() / 2.0f) * f7)), (int) (bounds.centerY() - ((bounds.height() / 2.0f) * f7)), (int) (((bounds.width() / 2.0f) * f7) + bounds.centerX()), (int) (((bounds.height() / 2.0f) * f7) + bounds.centerY()));
        }
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
