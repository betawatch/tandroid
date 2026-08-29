package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class o6 extends View {
    public boolean a;
    public Drawable b;
    public final n6 c;
    public int d;
    public int e;
    public CharSequence f;
    public boolean h;
    public boolean n;
    public boolean r;

    public o6(Context context, boolean z10, boolean z11, boolean z12) {
        super(context);
        this.n = true;
        this.r = true;
        n6 n6Var = new n6(z10, z11, z12, false);
        this.c = n6Var;
        n6Var.setCallback(this);
        n6Var.C = new ig(this, 8);
    }

    public final void a() {
        this.c.b();
    }

    public final void b(float f9, long j10, TimeInterpolator timeInterpolator) {
        this.c.k(f9, j10, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12 = !this.r && z10;
        this.r = false;
        n6 n6Var = this.c;
        if (z12 && !TextUtils.equals(charSequence, n6Var.g)) {
            if (n6Var.D) {
                ValueAnimator valueAnimator = n6Var.o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    n6Var.o = null;
                }
            } else if (n6Var.f()) {
                this.f = charSequence;
                this.h = z11;
                return;
            }
        }
        int e10 = (int) n6Var.e();
        n6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        n6Var.q(charSequence, z12, z11);
        float f9 = e10;
        if (f9 < n6Var.e() || !(z12 || f9 == n6Var.e())) {
            requestLayout();
        }
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.c.d()));
    }

    public n6 getDrawable() {
        return this.c;
    }

    public TextPaint getPaint() {
        return this.c.a;
    }

    public float getRightPadding() {
        return this.c.H;
    }

    public Drawable getSizeableBackground() {
        return this.b;
    }

    public CharSequence getText() {
        return this.c.g;
    }

    public int getTextColor() {
        return this.c.a.getColor();
    }

    public int getTextHeight() {
        return getPaint().getFontMetricsInt().descent - getPaint().getFontMetricsInt().ascent;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable = this.b;
        n6 n6Var = this.c;
        if (drawable != null && (!this.a || n6Var.g() > 0.0f)) {
            int d = (int) (n6Var.d() + getPaddingLeft() + getPaddingRight());
            if ((n6Var.b & 7) == 5) {
                this.b.setBounds(getWidth() - d, 0, getWidth(), getHeight());
            } else {
                this.b.setBounds(0, 0, d, getHeight());
            }
            this.b.draw(canvas);
        }
        n6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        n6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(getText());
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = this.e;
        if (i12 > 0) {
            size = Math.min(size, i12);
        }
        int i13 = this.d;
        n6 n6Var = this.c;
        if (i13 != size && getLayoutParams().width != 0) {
            n6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            n6Var.q(n6Var.g, false, true);
        }
        this.d = size;
        if (this.n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(n6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.c.D = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.c.n(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.c.l = i10;
    }

    public void setEmojiColor(int i10) {
        n6 n6Var = this.c;
        if (n6Var.T != i10) {
            n6Var.T = i10;
            n6Var.U = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.c.U = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.c.b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.c.E = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.c.M = z10;
    }

    public void setMaxWidth(int i10) {
        this.e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.c.V = runnable;
    }

    public void setRightPadding(float f9) {
        n6 n6Var = this.c;
        n6Var.H = f9;
        n6Var.invalidateSelf();
    }

    public void setScaleProperty(float f9) {
        this.c.v = f9;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.c.r(i10);
        invalidate();
    }

    public void setTextSize(float f9) {
        this.c.t(f9);
    }

    public void setTypeface(Typeface typeface) {
        this.c.u(typeface);
    }
}
