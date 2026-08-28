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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public j6(Context context, boolean z10, boolean z11, boolean z12) {
        super(context);
        this.n = true;
        this.r = true;
        i6 i6Var = new i6(z10, z11, z12, false);
        this.c = i6Var;
        i6Var.setCallback(this);
        i6Var.C = new fg(this, 8);
    }

    public final void a() {
        this.c.b();
    }

    public final void b(float f10, long j10, TimeInterpolator timeInterpolator) {
        this.c.k(f10, j10, timeInterpolator);
    }

    public final void c(CharSequence charSequence, boolean z10, boolean z11) {
        boolean z12 = !this.r && z10;
        this.r = false;
        i6 i6Var = this.c;
        if (z12 && !TextUtils.equals(charSequence, i6Var.g)) {
            if (i6Var.D) {
                ValueAnimator valueAnimator = i6Var.o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    i6Var.o = null;
                }
            } else if (i6Var.f()) {
                this.f = charSequence;
                this.h = z11;
                return;
            }
        }
        int e10 = (int) i6Var.e();
        i6Var.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        i6Var.q(charSequence, z12, z11);
        float f10 = e10;
        if (f10 < i6Var.e() || !(z12 || f10 == i6Var.e())) {
            requestLayout();
        }
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.c.d()));
    }

    public i6 getDrawable() {
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
        i6 i6Var = this.c;
        if (drawable != null && (!this.a || i6Var.g() > 0.0f)) {
            int d = (int) (i6Var.d() + getPaddingLeft() + getPaddingRight());
            if ((i6Var.b & 7) == 5) {
                this.b.setBounds(getWidth() - d, 0, getWidth(), getHeight());
            } else {
                this.b.setBounds(0, 0, d, getHeight());
            }
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
    public void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = this.e;
        if (i11 > 0) {
            size = Math.min(size, i11);
        }
        int i12 = this.d;
        i6 i6Var = this.c;
        if (i12 != size && getLayoutParams().width != 0) {
            i6Var.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            i6Var.q(i6Var.g, false, true);
        }
        this.d = size;
        if (this.n && View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(i6Var.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z10) {
        this.c.D = z10;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.c.n(z10);
    }

    public void setEmojiCacheType(int i9) {
        this.c.l = i9;
    }

    public void setEmojiColor(int i9) {
        i6 i6Var = this.c;
        if (i6Var.T != i9) {
            i6Var.T = i9;
            i6Var.U = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.c.U = colorFilter;
        invalidate();
    }

    public void setGravity(int i9) {
        this.c.b = i9;
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

    public void setMaxWidth(int i9) {
        this.e = i9;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.c.V = runnable;
    }

    public void setRightPadding(float f10) {
        i6 i6Var = this.c;
        i6Var.H = f10;
        i6Var.invalidateSelf();
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

    public void setTextColor(int i9) {
        this.c.r(i9);
        invalidate();
    }

    public void setTextSize(float f10) {
        this.c.t(f10);
    }

    public void setTypeface(Typeface typeface) {
        this.c.u(typeface);
    }
}
