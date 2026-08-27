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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u31 extends zu0 {
    public final /* synthetic */ v31 A0;
    public final Paint s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public ValueAnimator w0;
    public float x0;
    public final float[] y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u31(v31 v31Var, Context context) {
        super(context, null);
        int i10;
        int i11;
        this.A0 = v31Var;
        this.s0 = new Paint(1);
        this.t0 = false;
        this.u0 = false;
        this.v0 = false;
        this.x0 = 0.0f;
        this.y0 = new float[8];
        setWillNotDraw(false);
        i10 = ((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingLeft;
        i11 = ((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        setDelegate(new t31(this));
    }

    public final float Z() {
        v31 v31Var = this.A0;
        return Math.min(1.0f, Math.max(0.0f, v31Var.f / (v31Var.b * 2.0f)));
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        v31 v31Var = this.A0;
        j41 j41Var = v31Var.e;
        int i12 = v31Var.b;
        GradientDrawable gradientDrawable = v31Var.c;
        float Z = Z();
        boolean z10 = Z == 0.0f && !v31Var.isDismissed();
        if (this.v0 != z10) {
            ValueAnimator valueAnimator = this.w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.v0 = z10;
            ValueAnimator valueAnimator2 = this.w0;
            if (valueAnimator2 == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x0, z10 ? 1.0f : 0.0f);
                this.w0 = ofFloat;
                ofFloat.addUpdateListener(new v60(this, 29));
                this.w0.setDuration(200L);
            } else {
                valueAnimator2.setFloatValues(this.x0, z10 ? 1.0f : 0.0f);
            }
            this.w0.start();
        }
        boolean z11 = this.x0 > 0.5f;
        if (this.z0 != z11) {
            this.z0 = z11;
            boolean z12 = AndroidUtilities.computePerceivedBrightness(v31Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5)) > 0.721f;
            boolean z13 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(v31Var.getThemedColor(org.telegram.ui.ActionBar.g6.s8), 855638016)) > 0.721f;
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(v31Var.getWindow(), z12);
        }
        if (this.x0 > 0.0f) {
            int themedColor = v31Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5);
            Paint paint = this.s0;
            paint.setColor(themedColor);
            int max = (int) Math.max(0.0f, j41Var.getTranslationY() + (AndroidUtilities.statusBarHeight - i12) + ((1.0f - Z()) * i12) + v31Var.f + AndroidUtilities.dp(24.0f));
            i10 = ((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingLeft;
            float lerp = AndroidUtilities.lerp(max, -AndroidUtilities.statusBarHeight, this.x0);
            int measuredWidth = getMeasuredWidth();
            i11 = ((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingLeft;
            float f10 = measuredWidth - i11;
            float f11 = max;
            canvas2 = canvas;
            canvas2.drawRect(i10, lerp, f10, f11, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (j41Var.getTranslationY() + AndroidUtilities.statusBarHeight) - i12);
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int i13 = (int) ((1.0f - Z) * dp2 * 2.0f);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(2.0f));
        gradientDrawable.setColor(i0.b.k(v31Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ii), (int) (Color.alpha(r5) * Z)));
        gradientDrawable.setBounds((getWidth() - dp) / 2, org.telegram.messenger.y1.C(10.0f, v31Var.f, i13), (getWidth() + dp) / 2, AndroidUtilities.dp(10.0f) + v31Var.f + i13 + dp2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override // android.view.View
    public final float getTranslationY() {
        return this.A0.e.getTranslationY();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AndroidUtilities.runOnUIThread(new up0(this, 25), 200L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        int i10;
        Drawable drawable2;
        int i11;
        int i12;
        v31 v31Var = this.A0;
        GradientDrawable gradientDrawable = v31Var.c;
        v31.m(v31Var);
        super.onDraw(canvas);
        float Z = Z();
        int i13 = v31Var.b;
        int i14 = (int) ((1.0f - Z) * i13);
        int i15 = AndroidUtilities.statusBarHeight - i13;
        canvas.save();
        canvas.translate(0.0f, v31Var.e.getTranslationY() + i15);
        drawable = ((org.telegram.ui.ActionBar.e3) v31Var).shadowDrawable;
        int i16 = v31Var.f;
        i10 = ((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingTop;
        drawable.setBounds(0, (i16 - i10) + i14, getMeasuredWidth(), getMeasuredHeight() + (i15 < 0 ? -i15 : 0));
        drawable2 = ((org.telegram.ui.ActionBar.e3) v31Var).shadowDrawable;
        drawable2.draw(canvas);
        if (Z > 0.0f && Z < 1.0f) {
            float dp = AndroidUtilities.dp(12.0f) * Z;
            gradientDrawable.setColor(v31Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5));
            float[] fArr = this.y0;
            fArr[3] = dp;
            fArr[2] = dp;
            fArr[1] = dp;
            fArr[0] = dp;
            gradientDrawable.setCornerRadii(fArr);
            i11 = ((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingLeft;
            int i17 = v31Var.f + i14;
            int width = getWidth();
            i12 = ((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingLeft;
            gradientDrawable.setBounds(i11, i17, width - i12, AndroidUtilities.dp(24.0f) + v31Var.f + i14);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            v31 v31Var = this.A0;
            if (v31Var.f != 0 && motionEvent.getY() < v31Var.f) {
                v31Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        v31 v31Var = this.A0;
        j41 j41Var = v31Var.e;
        int i16 = AndroidUtilities.statusBarHeight;
        int size = View.MeasureSpec.getSize(getMeasuredHeight()) - i16;
        int R = R();
        int i17 = (int) ((size + R) * 0.2f);
        this.u0 = true;
        if (R > AndroidUtilities.dp(20.0f)) {
            j41Var.a(true);
            v31Var.setAllowNestedScroll(false);
            this.t0 = true;
        } else {
            j41Var.a(false);
            v31Var.setAllowNestedScroll(true);
            this.t0 = false;
        }
        j41Var.setContentViewPaddingTop(i17);
        if (getPaddingTop() != i16) {
            i14 = ((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingLeft;
            i15 = ((org.telegram.ui.ActionBar.e3) v31Var).backgroundPaddingLeft;
            setPadding(i14, i16, i15, 0);
        }
        this.u0 = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.A0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.u0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        this.A0.e.setTranslationY(f10);
        invalidate();
    }
}
