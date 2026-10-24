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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class q6 extends View {
    public boolean a;
    public Drawable b;
    public final p6 c;
    public int d;
    public int e;
    public CharSequence f;
    public boolean h;
    public boolean n;
    public boolean r;

    public q6(Context context, boolean z10, boolean z11, boolean z12) {
        this(context, z10, z11, z12, false, false);
    }

    public final void a() {
        this.c.a();
    }

    public final void b(float f7, long j10, TimeInterpolator timeInterpolator) {
        this.c.n(f7, j10, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12 = !this.r && z10;
        this.r = false;
        p6 p6Var = this.c;
        if (z12 && !TextUtils.equals(charSequence, p6Var.i)) {
            if (p6Var.J) {
                ValueAnimator valueAnimator = p6Var.t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    p6Var.t = null;
                }
            } else if (p6Var.h()) {
                this.f = charSequence;
                this.h = z11;
                return;
            }
        }
        int e = (int) p6Var.e();
        p6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        p6Var.t(charSequence, z12, z11);
        float f7 = e;
        if (f7 < p6Var.e() || !(z12 || f7 == p6Var.e())) {
            requestLayout();
        }
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.c.c()));
    }

    public p6 getDrawable() {
        return this.c;
    }

    public TextPaint getPaint() {
        return this.c.a;
    }

    public float getRightPadding() {
        return this.c.N;
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
        p6 p6Var = this.c;
        if (drawable != null && (!this.a || p6Var.i() > 0.0f)) {
            int c10 = (int) (p6Var.c() + getPaddingLeft() + getPaddingRight());
            int i10 = p6Var.b & 7;
            int width = i10 == 5 ? getWidth() - c10 : i10 == 1 ? (getWidth() - c10) / 2 : 0;
            this.b.setBounds(width, 0, c10 + width, getHeight());
            this.b.draw(canvas);
        }
        p6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        p6Var.draw(canvas);
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
        p6 p6Var = this.c;
        if (i13 != size && getLayoutParams().width != 0) {
            p6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            p6Var.t(p6Var.i, false, true);
        }
        this.d = size;
        if (this.n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(p6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.c.J = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.c.q(z10);
    }

    public void setEmojiCacheType(int i10) {
        this.c.p = i10;
    }

    public void setEmojiColor(int i10) {
        p6 p6Var = this.c;
        if (p6Var.Z != i10) {
            p6Var.Z = i10;
            p6Var.a0 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.c.a0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i10) {
        this.c.b = i10;
    }

    public void setHideBackgroundIfEmpty(boolean z10) {
        this.a = z10;
    }

    public void setIgnoreRTL(boolean z10) {
        this.c.K = z10;
    }

    public void setIncludeFontPadding(boolean z10) {
        this.c.S = z10;
    }

    public void setMaxWidth(int i10) {
        this.e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.c.b0 = runnable;
    }

    public void setRightPadding(float f7) {
        p6 p6Var = this.c;
        p6Var.N = f7;
        p6Var.invalidateSelf();
    }

    public void setScaleProperty(float f7) {
        this.c.A = f7;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i10) {
        this.c.u(i10);
        invalidate();
    }

    public void setTextSize(float f7) {
        this.c.w(f7);
    }

    public void setTypeface(Typeface typeface) {
        this.c.x(typeface);
    }

    public q6(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(context);
        this.n = true;
        this.r = true;
        p6 p6Var = new p6(z10, z11, z12, z13, z14);
        this.c = p6Var;
        p6Var.setCallback(this);
        p6Var.I = new pg(this, 9);
    }
}
