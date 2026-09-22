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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        super(context);
        this.n = true;
        this.r = true;
        m6 m6Var = new m6(z10, z11, z12, false);
        this.c = m6Var;
        m6Var.setCallback(this);
        m6Var.C = new ng(this, 8);
    }

    public final void a() {
        this.c.b();
    }

    public final void b(float f7, long j3, TimeInterpolator timeInterpolator) {
        this.c.k(f7, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12 = !this.r && z10;
        this.r = false;
        m6 m6Var = this.c;
        if (z12 && !TextUtils.equals(charSequence, m6Var.g)) {
            if (m6Var.D) {
                ValueAnimator valueAnimator = m6Var.o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    m6Var.o = null;
                }
            } else if (m6Var.f()) {
                this.f = charSequence;
                this.h = z11;
                return;
            }
        }
        int e = (int) m6Var.e();
        m6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        m6Var.q(charSequence, z12, z11);
        float f7 = e;
        if (f7 < m6Var.e() || !(z12 || f7 == m6Var.e())) {
            requestLayout();
        }
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.c.d()));
    }

    public m6 getDrawable() {
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
        m6 m6Var = this.c;
        if (drawable != null && (!this.a || m6Var.g() > 0.0f)) {
            int d = (int) (m6Var.d() + getPaddingLeft() + getPaddingRight());
            if ((m6Var.b & 7) == 5) {
                this.b.setBounds(getWidth() - d, 0, getWidth(), getHeight());
            } else {
                this.b.setBounds(0, 0, d, getHeight());
            }
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
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = this.e;
        if (i12 > 0) {
            size = Math.min(size, i12);
        }
        int i13 = this.d;
        m6 m6Var = this.c;
        if (i13 != size && getLayoutParams().width != 0) {
            m6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            m6Var.q(m6Var.g, false, true);
        }
        this.d = size;
        if (this.n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(m6Var.e()));
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
        m6 m6Var = this.c;
        if (m6Var.T != i10) {
            m6Var.T = i10;
            m6Var.U = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
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

    public void setRightPadding(float f7) {
        m6 m6Var = this.c;
        m6Var.H = f7;
        m6Var.invalidateSelf();
    }

    public void setScaleProperty(float f7) {
        this.c.v = f7;
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

    public void setTextSize(float f7) {
        this.c.t(f7);
    }

    public void setTypeface(Typeface typeface) {
        this.c.u(typeface);
    }
}
