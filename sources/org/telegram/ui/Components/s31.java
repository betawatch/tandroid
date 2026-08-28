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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s31 extends xu0 {
    public final /* synthetic */ t31 A0;
    public final Paint s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public ValueAnimator w0;
    public float x0;
    public final float[] y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s31(t31 t31Var, Context context) {
        super(context, null);
        int i9;
        int i10;
        this.A0 = t31Var;
        this.s0 = new Paint(1);
        this.t0 = false;
        this.u0 = false;
        this.v0 = false;
        this.x0 = 0.0f;
        this.y0 = new float[8];
        setWillNotDraw(false);
        i9 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingLeft;
        i10 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingLeft;
        setPadding(i9, 0, i10, 0);
        setDelegate(new r31(this));
    }

    public final float Z() {
        t31 t31Var = this.A0;
        return Math.min(1.0f, Math.max(0.0f, t31Var.f / (t31Var.b * 2.0f)));
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i9;
        int i10;
        t31 t31Var = this.A0;
        h41 h41Var = t31Var.e;
        int i11 = t31Var.b;
        GradientDrawable gradientDrawable = t31Var.c;
        float Z = Z();
        boolean z10 = Z == 0.0f && !t31Var.isDismissed();
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
                ofFloat.addUpdateListener(new q60(this, 29));
                this.w0.setDuration(200L);
            } else {
                valueAnimator2.setFloatValues(this.x0, z10 ? 1.0f : 0.0f);
            }
            this.w0.start();
        }
        boolean z11 = this.x0 > 0.5f;
        if (this.z0 != z11) {
            this.z0 = z11;
            boolean z12 = AndroidUtilities.computePerceivedBrightness(t31Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5)) > 0.721f;
            boolean z13 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v(t31Var.getThemedColor(org.telegram.ui.ActionBar.f6.s8), 855638016)) > 0.721f;
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(t31Var.getWindow(), z12);
        }
        if (this.x0 > 0.0f) {
            int themedColor = t31Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5);
            Paint paint = this.s0;
            paint.setColor(themedColor);
            int max = (int) Math.max(0.0f, h41Var.getTranslationY() + (AndroidUtilities.statusBarHeight - i11) + ((1.0f - Z()) * i11) + t31Var.f + AndroidUtilities.dp(24.0f));
            i9 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingLeft;
            float lerp = AndroidUtilities.lerp(max, -AndroidUtilities.statusBarHeight, this.x0);
            int measuredWidth = getMeasuredWidth();
            i10 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingLeft;
            float f10 = measuredWidth - i10;
            float f11 = max;
            canvas2 = canvas;
            canvas2.drawRect(i9, lerp, f10, f11, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (h41Var.getTranslationY() + AndroidUtilities.statusBarHeight) - i11);
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int i12 = (int) ((1.0f - Z) * dp2 * 2.0f);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(2.0f));
        gradientDrawable.setColor(i0.a.k(t31Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ii), (int) (Color.alpha(r5) * Z)));
        gradientDrawable.setBounds((getWidth() - dp) / 2, org.telegram.messenger.l0.C(10.0f, t31Var.f, i12), (getWidth() + dp) / 2, AndroidUtilities.dp(10.0f) + t31Var.f + i12 + dp2);
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
        AndroidUtilities.runOnUIThread(new tp0(this, 25), 200L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        int i9;
        Drawable drawable2;
        int i10;
        int i11;
        t31 t31Var = this.A0;
        GradientDrawable gradientDrawable = t31Var.c;
        t31.m(t31Var);
        super.onDraw(canvas);
        float Z = Z();
        int i12 = t31Var.b;
        int i13 = (int) ((1.0f - Z) * i12);
        int i14 = AndroidUtilities.statusBarHeight - i12;
        canvas.save();
        canvas.translate(0.0f, t31Var.e.getTranslationY() + i14);
        drawable = ((org.telegram.ui.ActionBar.f3) t31Var).shadowDrawable;
        int i15 = t31Var.f;
        i9 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingTop;
        drawable.setBounds(0, (i15 - i9) + i13, getMeasuredWidth(), getMeasuredHeight() + (i14 < 0 ? -i14 : 0));
        drawable2 = ((org.telegram.ui.ActionBar.f3) t31Var).shadowDrawable;
        drawable2.draw(canvas);
        if (Z > 0.0f && Z < 1.0f) {
            float dp = AndroidUtilities.dp(12.0f) * Z;
            gradientDrawable.setColor(t31Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5));
            float[] fArr = this.y0;
            fArr[3] = dp;
            fArr[2] = dp;
            fArr[1] = dp;
            fArr[0] = dp;
            gradientDrawable.setCornerRadii(fArr);
            i10 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingLeft;
            int i16 = t31Var.f + i13;
            int width = getWidth();
            i11 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingLeft;
            gradientDrawable.setBounds(i10, i16, width - i11, AndroidUtilities.dp(24.0f) + t31Var.f + i13);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            t31 t31Var = this.A0;
            if (t31Var.f != 0 && motionEvent.getY() < t31Var.f) {
                t31Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        t31 t31Var = this.A0;
        h41 h41Var = t31Var.e;
        int i15 = AndroidUtilities.statusBarHeight;
        int size = View.MeasureSpec.getSize(getMeasuredHeight()) - i15;
        int R = R();
        int i16 = (int) ((size + R) * 0.2f);
        this.u0 = true;
        if (R > AndroidUtilities.dp(20.0f)) {
            h41Var.a(true);
            t31Var.setAllowNestedScroll(false);
            this.t0 = true;
        } else {
            h41Var.a(false);
            t31Var.setAllowNestedScroll(true);
            this.t0 = false;
        }
        h41Var.setContentViewPaddingTop(i16);
        if (getPaddingTop() != i15) {
            i13 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingLeft;
            i14 = ((org.telegram.ui.ActionBar.f3) t31Var).backgroundPaddingLeft;
            setPadding(i13, i15, i14, 0);
        }
        this.u0 = false;
        super.onLayout(z10, i9, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
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
