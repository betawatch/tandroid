package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fr extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public float c;
    public float d = 255.0f;
    public ValueAnimator e;

    public fr(Drawable drawable, Drawable drawable2) {
        this.a = drawable;
        this.b = drawable2;
        if (drawable != null) {
            drawable.setCallback(new er(this, 0));
        }
        if (drawable2 != null) {
            drawable2.setCallback(new er(this, 1));
        }
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c, f10);
        this.e = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 15));
        this.e.setDuration((long) (Math.abs(this.c - f10) * 200.0f));
        this.e.setInterpolator(gr.f);
        this.e.start();
    }

    public final void b(float f10) {
        this.c = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i9 = (int) ((1.0f - this.c) * this.d);
        Drawable drawable = this.a;
        drawable.setAlpha(i9);
        int i10 = (int) (this.d * this.c);
        Drawable drawable2 = this.b;
        drawable2.setAlpha(i10);
        if (i9 > 0) {
            drawable.draw(canvas);
        }
        if (i10 > 0) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
        this.b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.d = i9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
