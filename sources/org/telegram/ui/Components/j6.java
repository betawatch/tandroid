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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class j6 extends View {
    public boolean a;
    public Drawable b;
    public final i6 c;
    public int d;
    public int e;
    public CharSequence f;
    public boolean h;
    public boolean n;
    public boolean r;

    public j6(Context context, boolean z9, boolean z10, boolean z11) {
        this(context, z9, z10, z11, false, false);
    }

    public final void a() {
        this.c.a();
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        this.c.n(f10, j3, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z9, boolean z10) {
        boolean z11 = !this.r && z9;
        this.r = false;
        i6 i6Var = this.c;
        if (z11 && !TextUtils.equals(charSequence, i6Var.i)) {
            if (i6Var.J) {
                ValueAnimator valueAnimator = i6Var.t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    i6Var.t = null;
                }
            } else if (i6Var.h()) {
                this.f = charSequence;
                this.h = z10;
                return;
            }
        }
        int e10 = (int) i6Var.e();
        i6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        i6Var.t(charSequence, z11, z10);
        float f10 = e10;
        if (f10 < i6Var.e() || !(z11 || f10 == i6Var.e())) {
            requestLayout();
        }
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.c.c()));
    }

    public i6 getDrawable() {
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
        i6 i6Var = this.c;
        if (drawable != null && (!this.a || i6Var.i() > 0.0f)) {
            int c10 = (int) (i6Var.c() + getPaddingLeft() + getPaddingRight());
            int i7 = i6Var.b & 7;
            int width = i7 == 5 ? getWidth() - c10 : i7 == 1 ? (getWidth() - c10) / 2 : 0;
            this.b.setBounds(width, 0, c10 + width, getHeight());
            this.b.draw(canvas);
        }
        i6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        i6Var.draw(canvas);
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
        i6 i6Var = this.c;
        if (i12 != size && getLayoutParams().width != 0) {
            i6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            i6Var.t(i6Var.i, false, true);
        }
        this.d = size;
        if (this.n && View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(i6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z9) {
        this.c.J = z9;
    }

    public void setEllipsizeByGradient(boolean z9) {
        this.c.q(z9);
    }

    public void setEmojiCacheType(int i7) {
        this.c.p = i7;
    }

    public void setEmojiColor(int i7) {
        i6 i6Var = this.c;
        if (i6Var.Z != i7) {
            i6Var.Z = i7;
            i6Var.a0 = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.c.a0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i7) {
        this.c.b = i7;
    }

    public void setHideBackgroundIfEmpty(boolean z9) {
        this.a = z9;
    }

    public void setIgnoreRTL(boolean z9) {
        this.c.K = z9;
    }

    public void setIncludeFontPadding(boolean z9) {
        this.c.S = z9;
    }

    public void setMaxWidth(int i7) {
        this.e = i7;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.c.b0 = runnable;
    }

    public void setRightPadding(float f10) {
        i6 i6Var = this.c;
        i6Var.N = f10;
        i6Var.invalidateSelf();
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

    public j6(Context context, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(context);
        this.n = true;
        this.r = true;
        i6 i6Var = new i6(z9, z10, z11, z12, z13);
        this.c = i6Var;
        i6Var.setCallback(this);
        i6Var.I = new xf(this, 8);
    }
}
