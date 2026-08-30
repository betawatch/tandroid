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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class k6 extends View {
    public boolean a;
    public Drawable b;
    public final j6 c;
    public int d;
    public int e;
    public CharSequence f;
    public boolean h;
    public boolean n;
    public boolean r;

    public k6(Context context, boolean z4, boolean z10, boolean z11) {
        super(context);
        this.n = true;
        this.r = true;
        j6 j6Var = new j6(z4, z10, z11, false);
        this.c = j6Var;
        j6Var.setCallback(this);
        j6Var.C = new fg(this, 8);
    }

    public final void a() {
        this.c.b();
    }

    public final void b(float f10, long j10, TimeInterpolator timeInterpolator) {
        this.c.k(f10, j10, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z4, boolean z10) {
        boolean z11 = !this.r && z4;
        this.r = false;
        j6 j6Var = this.c;
        if (z11 && !TextUtils.equals(charSequence, j6Var.g)) {
            if (j6Var.D) {
                ValueAnimator valueAnimator = j6Var.o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    j6Var.o = null;
                }
            } else if (j6Var.f()) {
                this.f = charSequence;
                this.h = z10;
                return;
            }
        }
        int e = (int) j6Var.e();
        j6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        j6Var.q(charSequence, z11, z10);
        float f10 = e;
        if (f10 < j6Var.e() || !(z11 || f10 == j6Var.e())) {
            requestLayout();
        }
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.c.d()));
    }

    public j6 getDrawable() {
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
        j6 j6Var = this.c;
        if (drawable != null && (!this.a || j6Var.g() > 0.0f)) {
            int d = (int) (j6Var.d() + getPaddingLeft() + getPaddingRight());
            if ((j6Var.b & 7) == 5) {
                this.b.setBounds(getWidth() - d, 0, getWidth(), getHeight());
            } else {
                this.b.setBounds(0, 0, d, getHeight());
            }
            this.b.draw(canvas);
        }
        j6Var.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        j6Var.draw(canvas);
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
        j6 j6Var = this.c;
        if (i13 != size && getLayoutParams().width != 0) {
            j6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            j6Var.q(j6Var.g, false, true);
        }
        this.d = size;
        if (this.n && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(j6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z4) {
        this.c.D = z4;
    }

    public void setEllipsizeByGradient(boolean z4) {
        this.c.n(z4);
    }

    public void setEmojiCacheType(int i10) {
        this.c.l = i10;
    }

    public void setEmojiColor(int i10) {
        j6 j6Var = this.c;
        if (j6Var.T != i10) {
            j6Var.T = i10;
            j6Var.U = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
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

    public void setHideBackgroundIfEmpty(boolean z4) {
        this.a = z4;
    }

    public void setIgnoreRTL(boolean z4) {
        this.c.E = z4;
    }

    public void setIncludeFontPadding(boolean z4) {
        this.c.M = z4;
    }

    public void setMaxWidth(int i10) {
        this.e = i10;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.c.V = runnable;
    }

    public void setRightPadding(float f10) {
        j6 j6Var = this.c;
        j6Var.H = f10;
        j6Var.invalidateSelf();
    }

    public void setScaleProperty(float f10) {
        this.c.v = f10;
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

    public void setTextSize(float f10) {
        this.c.t(f10);
    }

    public void setTypeface(Typeface typeface) {
        this.c.u(typeface);
    }
}
