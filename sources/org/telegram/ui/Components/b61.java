package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b61 extends ww0 {
    public final Paint l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public ValueAnimator p0;
    public float q0;
    public final float[] r0;
    public boolean s0;
    public final /* synthetic */ c61 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b61(c61 c61Var, Context context) {
        super(context, null);
        int i10;
        int i11;
        this.t0 = c61Var;
        this.l0 = new Paint(1);
        this.m0 = false;
        this.n0 = false;
        this.o0 = false;
        this.q0 = 0.0f;
        this.r0 = new float[8];
        setWillNotDraw(false);
        i10 = ((org.telegram.ui.ActionBar.k3) c61Var).backgroundPaddingLeft;
        i11 = ((org.telegram.ui.ActionBar.k3) c61Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        setDelegate(new a61(this));
    }

    public final float X() {
        c61 c61Var = this.t0;
        return Math.min(1.0f, Math.max(0.0f, c61Var.e / (c61Var.b * 2.0f)));
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        c61 c61Var = this.t0;
        q61 q61Var = c61Var.d;
        int i12 = c61Var.b;
        GradientDrawable gradientDrawable = c61Var.c;
        float X = X();
        boolean z10 = X == 0.0f && !c61Var.isDismissed();
        if (this.o0 != z10) {
            ValueAnimator valueAnimator = this.p0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.o0 = z10;
            ValueAnimator valueAnimator2 = this.p0;
            if (valueAnimator2 == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.q0, z10 ? 1.0f : 0.0f);
                this.p0 = ofFloat;
                ofFloat.addUpdateListener(new f80(this, 29));
                this.p0.setDuration(200L);
            } else {
                valueAnimator2.setFloatValues(this.q0, z10 ? 1.0f : 0.0f);
            }
            this.p0.start();
        }
        boolean z11 = this.q0 > 0.5f;
        if (this.s0 != z11) {
            this.s0 = z11;
            boolean z12 = AndroidUtilities.computePerceivedBrightness(c61Var.getThemedColor(org.telegram.ui.ActionBar.y6.h5)) > 0.721f;
            boolean z13 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.v(c61Var.getThemedColor(org.telegram.ui.ActionBar.y6.s8), 855638016)) > 0.721f;
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(c61Var.getWindow(), z12);
        }
        if (this.q0 > 0.0f) {
            int themedColor = c61Var.getThemedColor(org.telegram.ui.ActionBar.y6.h5);
            Paint paint = this.l0;
            paint.setColor(themedColor);
            int max = (int) Math.max(0.0f, q61Var.getTranslationY() + (AndroidUtilities.statusBarHeight - i12) + ((1.0f - X()) * i12) + c61Var.e + AndroidUtilities.dp(24.0f));
            i10 = ((org.telegram.ui.ActionBar.k3) c61Var).backgroundPaddingLeft;
            float lerp = AndroidUtilities.lerp(max, -AndroidUtilities.statusBarHeight, this.q0);
            int measuredWidth = getMeasuredWidth();
            i11 = ((org.telegram.ui.ActionBar.k3) c61Var).backgroundPaddingLeft;
            float f7 = measuredWidth - i11;
            float f10 = max;
            canvas2 = canvas;
            canvas2.drawRect(i10, lerp, f7, f10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (q61Var.getTranslationY() + AndroidUtilities.statusBarHeight) - i12);
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int i13 = (int) ((1.0f - X) * dp2 * 2.0f);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(2.0f));
        gradientDrawable.setColor(i0.a.o(c61Var.getThemedColor(org.telegram.ui.ActionBar.y6.Ii), (int) (Color.alpha(r5) * X)));
        gradientDrawable.setBounds((getWidth() - dp) / 2, org.telegram.messenger.t.D(10.0f, c61Var.e, i13), (getWidth() + dp) / 2, AndroidUtilities.dp(10.0f) + c61Var.e + i13 + dp2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override // android.view.View
    public final float getTranslationY() {
        return this.t0.d.getTranslationY();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AndroidUtilities.runOnUIThread(new t51(this, 1), 200L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        int i10;
        Drawable drawable2;
        int i11;
        int i12;
        c61 c61Var = this.t0;
        GradientDrawable gradientDrawable = c61Var.c;
        c61.m(c61Var);
        super.onDraw(canvas);
        float X = X();
        int i13 = c61Var.b;
        int i14 = (int) ((1.0f - X) * i13);
        int i15 = AndroidUtilities.statusBarHeight - i13;
        canvas.save();
        canvas.translate(0.0f, c61Var.d.getTranslationY() + i15);
        drawable = ((org.telegram.ui.ActionBar.k3) c61Var).shadowDrawable;
        int i16 = c61Var.e;
        i10 = ((org.telegram.ui.ActionBar.k3) c61Var).backgroundPaddingTop;
        drawable.setBounds(0, (i16 - i10) + i14, getMeasuredWidth(), getMeasuredHeight() + (i15 < 0 ? -i15 : 0));
        drawable2 = ((org.telegram.ui.ActionBar.k3) c61Var).shadowDrawable;
        drawable2.draw(canvas);
        if (X > 0.0f && X < 1.0f) {
            float dp = AndroidUtilities.dp(12.0f) * X;
            gradientDrawable.setColor(c61Var.getThemedColor(org.telegram.ui.ActionBar.y6.h5));
            float[] fArr = this.r0;
            fArr[3] = dp;
            fArr[2] = dp;
            fArr[1] = dp;
            fArr[0] = dp;
            gradientDrawable.setCornerRadii(fArr);
            i11 = ((org.telegram.ui.ActionBar.k3) c61Var).backgroundPaddingLeft;
            int i17 = c61Var.e + i14;
            int width = getWidth();
            i12 = ((org.telegram.ui.ActionBar.k3) c61Var).backgroundPaddingLeft;
            gradientDrawable.setBounds(i11, i17, width - i12, AndroidUtilities.dp(24.0f) + c61Var.e + i14);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            c61 c61Var = this.t0;
            if (c61Var.e != 0 && motionEvent.getY() < c61Var.e) {
                c61Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ww0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        c61 c61Var = this.t0;
        q61 q61Var = c61Var.d;
        int i16 = AndroidUtilities.statusBarHeight;
        int size = View.MeasureSpec.getSize(getMeasuredHeight()) - i16;
        int Q = Q();
        int i17 = (int) ((size + Q) * 0.2f);
        this.n0 = true;
        if (Q > AndroidUtilities.dp(20.0f)) {
            q61Var.a(true);
            c61Var.setAllowNestedScroll(false);
            this.m0 = true;
        } else {
            q61Var.a(false);
            c61Var.setAllowNestedScroll(true);
            this.m0 = false;
        }
        q61Var.setContentViewPaddingTop(i17);
        if (getPaddingTop() != i16) {
            i14 = ((org.telegram.ui.ActionBar.k3) c61Var).backgroundPaddingLeft;
            i15 = ((org.telegram.ui.ActionBar.k3) c61Var).backgroundPaddingLeft;
            setPadding(i14, i16, i15, 0);
        }
        this.n0 = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.t0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.n0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        this.t0.d.setTranslationY(f7);
        invalidate();
    }
}
