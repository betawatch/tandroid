// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class fm2 extends Drawable implements Drawable.Callback {
    public Drawable a;
    public final Drawable b;
    public final int c;
    public final int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public int s;
    public int w;
    public boolean x;
    public float y;

    public fm2(Drawable drawable, Drawable drawable2, int i, int i2) {
        this.a = drawable;
        this.b = drawable2;
        this.c = i;
        this.d = i2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.y, 0.0f);
        if (this.r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.a.draw(canvas);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            boolean z = this.x;
            int i = this.d;
            int i2 = this.c;
            if (z) {
                Rect bounds2 = getBounds();
                if (i2 != 0) {
                    drawable2.setBounds(bounds2.left + i2, bounds2.top + i, bounds2.right - i2, bounds2.bottom - i);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.e != 0) {
                int centerX = (getBounds().centerX() - (this.e / 2)) + i2 + this.s;
                int centerY = getBounds().centerY();
                int i3 = this.f;
                int i4 = (centerY - (i3 / 2)) + i + this.w;
                drawable2.setBounds(centerX, i4, this.e + centerX, i3 + i4);
            } else {
                int centerX2 = (getBounds().centerX() - (drawable2.getIntrinsicWidth() / 2)) + i2;
                int centerY2 = (getBounds().centerY() - (drawable2.getIntrinsicHeight() / 2)) + i;
                drawable2.setBounds(centerX2, centerY2, drawable2.getIntrinsicWidth() + centerX2, drawable2.getIntrinsicHeight() + centerY2);
            }
            drawable2.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.n;
        return i != 0 ? i : this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.h;
        return i != 0 ? i : this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        int i = this.n;
        return i != 0 ? i : this.a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        int i = this.h;
        return i != 0 ? i : this.a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.b.getState();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.b.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        this.b.setState(iArr);
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public fm2(Drawable drawable, Drawable drawable2) {
        this.a = drawable;
        this.b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
