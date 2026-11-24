// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lm4 extends Drawable {
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
            drawable.setBounds((int) de9.x(bounds.width(), 2.0f, f, bounds.centerX()), (int) de9.x(bounds.height(), 2.0f, f, bounds.centerY()), (int) b00.A(bounds.width(), 2.0f, f, bounds.centerX()), (int) b00.A(bounds.height(), 2.0f, f, bounds.centerY()));
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
