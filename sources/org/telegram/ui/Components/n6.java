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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class n6 extends View {
    public boolean a;
    public Drawable b;
    public final m6 c;
    public int d;
    public int e;
    public CharSequence f;
    public boolean h;
    public boolean n;
    public boolean r;

    public n6(Context context, boolean z10, boolean z11, boolean z12) {
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
        m6 m6Var = this.c;
        if (z12 && !TextUtils.equals(charSequence, m6Var.i)) {
            if (m6Var.K) {
                ValueAnimator valueAnimator = m6Var.t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    m6Var.t = null;
                }
            } else if (m6Var.h()) {
                this.f = charSequence;
                this.h = z11;
                return;
            }
        }
        int e10 = (int) m6Var.e();
        m6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        m6Var.t(charSequence, z12, z11);
        float f10 = e10;
        if (f10 < m6Var.e() || !(z12 || f10 == m6Var.e())) {
            requestLayout();
        }
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.c.c()));
    }

    public m6 getDrawable() {
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
        m6 m6Var = this.c;
        if (drawable != null && (!this.a || m6Var.i() > 0.0f)) {
            int c10 = (int) (m6Var.c() + getPaddingLeft() + getPaddingRight());
            int i7 = m6Var.b & 7;
            int width = i7 == 5 ? getWidth() - c10 : i7 == 1 ? (getWidth() - c10) / 2 : 0;
            this.b.setBounds(width, 0, c10 + width, getHeight());
            this.b.draw(canvas);
        }
        m6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        m6Var.draw(canvas);
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
        m6 m6Var = this.c;
        if (i12 != size && getLayoutParams().width != 0) {
            m6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            m6Var.t(m6Var.i, false, true);
        }
        this.d = size;
        if (this.n && View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(m6Var.e()));
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
        m6 m6Var = this.c;
        if (m6Var.a0 != i7) {
            m6Var.a0 = i7;
            m6Var.b0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
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
        m6 m6Var = this.c;
        m6Var.O = f10;
        m6Var.invalidateSelf();
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

    public n6(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(context);
        this.n = true;
        this.r = true;
        m6 m6Var = new m6(z10, z11, z12, z13, z14);
        this.c = m6Var;
        m6Var.setCallback(this);
        m6Var.J = new lg(this, 8);
    }
}
