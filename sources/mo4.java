// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mo4 extends Drawable {
    public Drawable a;
    public float b;
    public int c;

    public final void a(int i) {
        if (this.c != i) {
            this.c = i;
            setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float f = this.b;
        Drawable drawable = this.a;
        if (f == 1.0f) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds((int) hg9.x(bounds.width(), 2.0f, f, bounds.centerX()), (int) hg9.x(bounds.height(), 2.0f, f, bounds.centerY()), (int) b10.A(bounds.width(), 2.0f, f, bounds.centerX()), (int) b10.A(bounds.height(), 2.0f, f, bounds.centerY()));
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
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
