// default package

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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class in extends View {
    public boolean a;
    public Drawable b;
    public final hn c;
    public int d;
    public int e;
    public CharSequence f;
    public boolean h;
    public boolean n;
    public boolean r;

    public in(Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(context);
        this.n = true;
        this.r = true;
        hn hnVar = new hn(z, z2, z3, z4, z5);
        this.c = hnVar;
        hnVar.setCallback(this);
        hnVar.J = new c1(this, (byte) 17);
    }

    public final void a() {
        this.c.a();
    }

    public final void b(float f, long j, k43 k43Var) {
        this.c.n(f, j, k43Var);
    }

    public final void c(CharSequence charSequence, boolean z, boolean z2) {
        boolean z3 = !this.r && z;
        this.r = false;
        hn hnVar = this.c;
        if (z3 && !TextUtils.equals(charSequence, hnVar.i)) {
            if (hnVar.K) {
                ValueAnimator valueAnimator = hnVar.t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    hnVar.t = null;
                }
            } else if (hnVar.h()) {
                this.f = charSequence;
                this.h = z2;
                return;
            }
        }
        int e = (int) hnVar.e();
        hnVar.setBounds(getPaddingLeft(), getPaddingTop(), this.d - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        hnVar.t(charSequence, z3, z2);
        float f = e;
        if (f < hnVar.e() || !(z3 || f == hnVar.e())) {
            requestLayout();
        }
    }

    public final int d() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.c.c()));
    }

    public hn getDrawable() {
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
        hn hnVar = this.c;
        if (drawable != null && (!this.a || hnVar.i() > 0.0f)) {
            int c = (int) (hnVar.c() + getPaddingLeft() + getPaddingRight());
            int i = hnVar.b & 7;
            int width = i == 5 ? getWidth() - c : i == 1 ? (getWidth() - c) / 2 : 0;
            this.b.setBounds(width, 0, c + width, getHeight());
            this.b.draw(canvas);
        }
        hnVar.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        hnVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(getText());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.e;
        if (i3 > 0) {
            size = Math.min(size, i3);
        }
        int i4 = this.d;
        hn hnVar = this.c;
        if (i4 != size && getLayoutParams().width != 0) {
            hnVar.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            hnVar.t(hnVar.i, false, true);
        }
        this.d = size;
        if (this.n && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(hnVar.e()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z) {
        this.c.K = z;
    }

    public void setEllipsizeByGradient(boolean z) {
        this.c.q(z);
    }

    public void setEmojiCacheType(int i) {
        this.c.p = i;
    }

    public void setEmojiColor(int i) {
        hn hnVar = this.c;
        if (hnVar.a0 != i) {
            hnVar.a0 = i;
            hnVar.b0 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.c.b0 = colorFilter;
        invalidate();
    }

    public void setGravity(int i) {
        this.c.b = i;
    }

    public void setHideBackgroundIfEmpty(boolean z) {
        this.a = z;
    }

    public void setIgnoreRTL(boolean z) {
        this.c.L = z;
    }

    public void setIncludeFontPadding(boolean z) {
        this.c.T = z;
    }

    public void setMaxWidth(int i) {
        this.e = i;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.c.c0 = runnable;
    }

    public void setRightPadding(float f) {
        hn hnVar = this.c;
        hnVar.O = f;
        hnVar.invalidateSelf();
    }

    public void setScaleProperty(float f) {
        this.c.B = f;
    }

    public void setSizeableBackground(Drawable drawable) {
        this.b = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, true, true);
    }

    public void setTextColor(int i) {
        this.c.u(i);
        invalidate();
    }

    public void setTextSize(float f) {
        this.c.w(f);
    }

    public void setTypeface(Typeface typeface) {
        this.c.x(typeface);
    }

    public in(Context context, boolean z, boolean z2, boolean z3) {
        this(context, z, z2, z3, false, false);
    }
}
