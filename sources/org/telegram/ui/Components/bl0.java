package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bl0 extends Drawable implements Animator.AnimatorListener {
    public final Context a;
    public ColorFilter b;
    public Drawable d;
    public Drawable e;
    public ValueAnimator f;
    public boolean r;
    public int c = 0;
    public float h = 1.0f;
    public final ArrayList n = new ArrayList();

    public bl0(Context context) {
        this.a = context;
    }

    public final void a(int i9, boolean z10) {
        if (this.c == i9) {
            return;
        }
        b(this.a.getDrawable(i9).mutate(), z10);
        this.c = i9;
    }

    public final void b(Drawable drawable, boolean z10) {
        if (drawable == null) {
            this.d = null;
            this.e = null;
            invalidateSelf();
            return;
        }
        if (getBounds() == null || getBounds().isEmpty()) {
            z10 = false;
        }
        Drawable drawable2 = this.d;
        if (drawable == drawable2) {
            drawable2.setColorFilter(this.b);
            return;
        }
        this.c = 0;
        this.e = drawable2;
        this.d = drawable;
        drawable.setColorFilter(this.b);
        c(this.d, getBounds());
        c(this.e, getBounds());
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f.cancel();
        }
        if (!z10) {
            this.h = 1.0f;
            this.e = null;
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new q60(this, 10));
        this.f.addListener(this);
        this.f.setDuration(150L);
        this.f.start();
    }

    public final void c(Drawable drawable, Rect rect) {
        int height;
        int intrinsicHeight;
        int width;
        int intrinsicWidth;
        if (drawable == null) {
            return;
        }
        if (this.r) {
            drawable.setBounds(rect);
            return;
        }
        if (drawable.getIntrinsicHeight() < 0) {
            height = rect.top;
            intrinsicHeight = rect.bottom;
        } else {
            height = ((rect.height() - drawable.getIntrinsicHeight()) / 2) + rect.top;
            intrinsicHeight = drawable.getIntrinsicHeight() + height;
        }
        if (drawable.getIntrinsicWidth() < 0) {
            width = rect.left;
            intrinsicWidth = rect.right;
        } else {
            width = ((rect.width() - drawable.getIntrinsicWidth()) / 2) + rect.left;
            intrinsicWidth = drawable.getIntrinsicWidth() + width;
        }
        drawable.setBounds(width, height, intrinsicWidth, intrinsicHeight);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        if (this.h == 1.0f || this.d == null) {
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setAlpha(255);
                this.d.draw(canvas);
            }
        } else {
            canvas.save();
            float f10 = this.h;
            canvas.scale(f10, f10, centerX, centerY);
            this.d.setAlpha((int) (this.h * 255.0f));
            this.d.draw(canvas);
            canvas.restore();
        }
        float f11 = this.h;
        if (f11 == 1.0f || this.e == null) {
            Drawable drawable2 = this.e;
            if (drawable2 != null) {
                drawable2.setAlpha(255);
                this.e.draw(canvas);
                return;
            }
            return;
        }
        float f12 = 1.0f - f11;
        canvas.save();
        canvas.scale(f12, f12, centerX, centerY);
        this.e.setAlpha((int) (f12 * 255.0f));
        this.e.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        ArrayList arrayList = this.n;
        if (arrayList != null) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((View) arrayList.get(i9)).invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(this.d, rect);
        c(this.e, rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b = colorFilter;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
    }
}
