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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class h6 extends View {
    public boolean a;
    public Drawable b;
    public final g6 c;
    public int d;
    public int e;
    public CharSequence f;
    public boolean h;
    public boolean n;
    public boolean r;

    public h6(Context context, boolean z10, boolean z11, boolean z12) {
        this(context, z10, z11, z12, false, false);
    }

    public final void a() {
        this.c.a();
    }

    public final void b(float f10, long j10, TimeInterpolator timeInterpolator) {
        this.c.n(f10, j10, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12 = !this.r && z10;
        this.r = false;
        g6 g6Var = this.c;
        if (z12 && !TextUtils.equals(charSequence, g6Var.i)) {
            if (g6Var.J) {
                ValueAnimator valueAnimator = g6Var.t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    g6Var.t = null;
                }
            } else if (g6Var.h()) {
                this.f = charSequence;
                this.h = z11;
                return;
            }
        }
        int e10 = (int) g6Var.e();
        g6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        g6Var.t(charSequence, z12, z11);
        float f10 = e10;
        if (f10 < g6Var.e() || !(z12 || f10 == g6Var.e())) {
            requestLayout();
        }
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.c.c()));
    }

    public g6 getDrawable() {
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
        g6 g6Var = this.c;
        if (drawable != null && (!this.a || g6Var.i() > 0.0f)) {
            int c2 = (int) (g6Var.c() + getPaddingLeft() + getPaddingRight());
            int i3 = g6Var.b & 7;
            int width = i3 == 5 ? getWidth() - c2 : i3 == 1 ? (getWidth() - c2) / 2 : 0;
            this.b.setBounds(width, 0, c2 + width, getHeight());
            this.b.draw(canvas);
        }
        g6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        g6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(getText());
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = this.e;
        if (i11 > 0) {
            size = Math.min(size, i11);
        }
        int i12 = this.d;
        g6 g6Var = this.c;
        if (i12 != size && getLayoutParams().width != 0) {
            g6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            g6Var.t(g6Var.i, false, true);
        }
        this.d = size;
        if (this.n && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(g6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.c.J = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.c.q(z10);
    }

    public void setEmojiCacheType(int i3) {
        this.c.p = i3;
    }

    public void setEmojiColor(int i3) {
        g6 g6Var = this.c;
        if (g6Var.Z != i3) {
            g6Var.Z = i3;
            g6Var.a0 = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.c.a0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i3) {
        this.c.b = i3;
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

    public void setMaxWidth(int i3) {
        this.e = i3;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.c.b0 = runnable;
    }

    public void setRightPadding(float f10) {
        g6 g6Var = this.c;
        g6Var.N = f10;
        g6Var.invalidateSelf();
    }

    public void setScaleProperty(float f10) {
        this.c.A = f10;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i3) {
        this.c.u(i3);
        invalidate();
    }

    public void setTextSize(float f10) {
        this.c.w(f10);
    }

    public void setTypeface(Typeface typeface) {
        this.c.x(typeface);
    }

    public h6(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(context);
        this.n = true;
        this.r = true;
        g6 g6Var = new g6(z10, z11, z12, z13, z14);
        this.c = g6Var;
        g6Var.setCallback(this);
        g6Var.I = new vf(this, 8);
    }
}
