package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class fq extends Drawable implements Drawable.Callback {
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
    public int v;
    public boolean w;
    public float x;

    public fq(Drawable drawable, Drawable drawable2, int i9, int i10) {
        this.a = drawable;
        this.b = drawable2;
        this.c = i9;
        this.d = i10;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.x, 0.0f);
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
            boolean z10 = this.w;
            int i9 = this.d;
            int i10 = this.c;
            if (z10) {
                Rect bounds2 = getBounds();
                if (i10 != 0) {
                    drawable2.setBounds(bounds2.left + i10, bounds2.top + i9, bounds2.right - i10, bounds2.bottom - i9);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.e != 0) {
                int centerX = (getBounds().centerX() - (this.e / 2)) + i10 + this.s;
                int centerY = getBounds().centerY();
                int i11 = this.f;
                int i12 = (centerY - (i11 / 2)) + i9 + this.v;
                drawable2.setBounds(centerX, i12, this.e + centerX, i11 + i12);
            } else {
                int centerX2 = (getBounds().centerX() - (drawable2.getIntrinsicWidth() / 2)) + i10;
                int centerY2 = (getBounds().centerY() - (drawable2.getIntrinsicHeight() / 2)) + i9;
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
        int i9 = this.n;
        return i9 != 0 ? i9 : this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i9 = this.h;
        return i9 != 0 ? i9 : this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        int i9 = this.n;
        return i9 != 0 ? i9 : this.a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        int i9 = this.h;
        return i9 != 0 ? i9 : this.a.getMinimumWidth();
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
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.b.setAlpha(i9);
        this.a.setAlpha(i9);
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

    public fq(Drawable drawable, Drawable drawable2) {
        this.a = drawable;
        this.b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
