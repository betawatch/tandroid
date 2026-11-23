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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        this(context, z10, z11, z12, false, false);
    }

    public final void a() {
        this.c.a();
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        this.c.n(f10, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12 = !this.r && z10;
        this.r = false;
        n6 n6Var = this.c;
        if (z12 && !TextUtils.equals(charSequence, n6Var.i)) {
            if (n6Var.K) {
                ValueAnimator valueAnimator = n6Var.t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    n6Var.t = null;
                }
            } else if (n6Var.h()) {
                this.f = charSequence;
                this.h = z11;
                return;
            }
        }
        int e10 = (int) n6Var.e();
        n6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        n6Var.t(charSequence, z12, z11);
        float f10 = e10;
        if (f10 < n6Var.e() || !(z12 || f10 == n6Var.e())) {
            requestLayout();
        }
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.c.c()));
    }

    public n6 getDrawable() {
        return this.c;
    }

    public TextPaint getPaint() {
        return this.c.a;
    }

    public float getRightPadding() {
        return this.c.O;
    }

    public Drawable getSizeableBackground() {
        return this.b;
    }

    public CharSequence getText() {
        return this.c.i;
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
        if (drawable != null && (!this.a || n6Var.i() > 0.0f)) {
            int c10 = (int) (n6Var.c() + getPaddingLeft() + getPaddingRight());
            int i7 = n6Var.b & 7;
            int width = i7 == 5 ? getWidth() - c10 : i7 == 1 ? (getWidth() - c10) / 2 : 0;
            this.b.setBounds(width, 0, c10 + width, getHeight());
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
    public void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = this.e;
        if (i11 > 0) {
            size = Math.min(size, i11);
        }
        int i12 = this.d;
        n6 n6Var = this.c;
        if (i12 != size && getLayoutParams().width != 0) {
            n6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            n6Var.t(n6Var.i, false, true);
        }
        this.d = size;
        if (this.n && View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(n6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.c.K = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.c.q(z10);
    }

    public void setEmojiCacheType(int i7) {
        this.c.p = i7;
    }

    public void setEmojiColor(int i7) {
        n6 n6Var = this.c;
        if (n6Var.a0 != i7) {
            n6Var.a0 = i7;
            n6Var.b0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.c.b0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i7) {
        this.c.b = i7;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.c.L = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.c.T = z10;
    }

    public void setMaxWidth(int i7) {
        this.e = i7;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.c.c0 = runnable;
    }

    public void setRightPadding(float f10) {
        n6 n6Var = this.c;
        n6Var.O = f10;
        n6Var.invalidateSelf();
    }

    public void setScaleProperty(float f10) {
        this.c.B = f10;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i7) {
        this.c.u(i7);
        invalidate();
    }

    public void setTextSize(float f10) {
        this.c.w(f10);
    }

    public void setTypeface(Typeface typeface) {
        this.c.x(typeface);
    }

    public o6(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(context);
        this.n = true;
        this.r = true;
        n6 n6Var = new n6(z10, z11, z12, z13, z14);
        this.c = n6Var;
        n6Var.setCallback(this);
        n6Var.J = new og(this, 8);
    }
}
