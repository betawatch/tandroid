// default package

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class l79 extends Drawable implements Animator.AnimatorListener {
    public final Context a;
    public ColorFilter b;
    public Drawable d;
    public Drawable e;
    public ValueAnimator f;
    public boolean r;
    public int c = 0;
    public float h = 1.0f;
    public final ArrayList n = new ArrayList();

    public l79(Context context) {
        this.a = context;
    }

    public final void a(int i, boolean z) {
        if (this.c == i) {
            return;
        }
        b(this.a.getDrawable(i).mutate(), z);
        this.c = i;
    }

    public final void b(Drawable drawable, boolean z) {
        if (drawable == null) {
            this.d = null;
            this.e = null;
            invalidateSelf();
            return;
        }
        if (getBounds() == null || getBounds().isEmpty()) {
            z = false;
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
        if (!z) {
            this.h = 1.0f;
            this.e = null;
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.addUpdateListener(new u28(this, (byte) 29));
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
                drawable.setAlpha(kk7.d4);
                this.d.draw(canvas);
            }
        } else {
            canvas.save();
            float f = this.h;
            canvas.scale(f, f, centerX, centerY);
            this.d.setAlpha((int) (this.h * 255.0f));
            this.d.draw(canvas);
            canvas.restore();
        }
        float f2 = this.h;
        if (f2 == 1.0f || this.e == null) {
            Drawable drawable2 = this.e;
            if (drawable2 != null) {
                drawable2.setAlpha(kk7.d4);
                this.e.draw(canvas);
                return;
            }
            return;
        }
        float f3 = 1.0f - f2;
        canvas.save();
        canvas.scale(f3, f3, centerX, centerY);
        this.e.setAlpha((int) (f3 * 255.0f));
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
            for (int i = 0; i < arrayList.size(); i++) {
                ((View) arrayList.get(i)).invalidate();
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
    public final void setAlpha(int i) {
    }
}
