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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c51 extends aw0 {
    public ValueAnimator A0;
    public float B0;
    public final float[] C0;
    public boolean D0;
    public final /* synthetic */ d51 E0;
    public final Paint w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c51(d51 d51Var, Context context) {
        super(context, null);
        int i10;
        int i11;
        this.E0 = d51Var;
        this.w0 = new Paint(1);
        this.x0 = false;
        this.y0 = false;
        this.z0 = false;
        this.B0 = 0.0f;
        this.C0 = new float[8];
        setWillNotDraw(false);
        i10 = ((org.telegram.ui.ActionBar.h3) d51Var).backgroundPaddingLeft;
        i11 = ((org.telegram.ui.ActionBar.h3) d51Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        setDelegate(new b51(this));
    }

    public final float Z() {
        d51 d51Var = this.E0;
        return Math.min(1.0f, Math.max(0.0f, d51Var.f / (d51Var.b * 2.0f)));
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        d51 d51Var = this.E0;
        r51 r51Var = d51Var.e;
        int i12 = d51Var.b;
        GradientDrawable gradientDrawable = d51Var.c;
        float Z = Z();
        boolean z10 = Z == 0.0f && !d51Var.isDismissed();
        if (this.z0 != z10) {
            ValueAnimator valueAnimator = this.A0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.z0 = z10;
            ValueAnimator valueAnimator2 = this.A0;
            if (valueAnimator2 == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B0, z10 ? 1.0f : 0.0f);
                this.A0 = ofFloat;
                ofFloat.addUpdateListener(new q70(this, 29));
                this.A0.setDuration(200L);
            } else {
                valueAnimator2.setFloatValues(this.B0, z10 ? 1.0f : 0.0f);
            }
            this.A0.start();
        }
        boolean z11 = this.B0 > 0.5f;
        if (this.D0 != z11) {
            this.D0 = z11;
            boolean z12 = AndroidUtilities.computePerceivedBrightness(d51Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) > 0.721f;
            boolean z13 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(d51Var.getThemedColor(org.telegram.ui.ActionBar.j6.s8), 855638016)) > 0.721f;
            if (!z11) {
                z12 = z13;
            }
            AndroidUtilities.setLightStatusBar(d51Var.getWindow(), z12);
        }
        if (this.B0 > 0.0f) {
            int themedColor = d51Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5);
            Paint paint = this.w0;
            paint.setColor(themedColor);
            int max = (int) Math.max(0.0f, r51Var.getTranslationY() + (AndroidUtilities.statusBarHeight - i12) + ((1.0f - Z()) * i12) + d51Var.f + AndroidUtilities.dp(24.0f));
            i10 = ((org.telegram.ui.ActionBar.h3) d51Var).backgroundPaddingLeft;
            float lerp = AndroidUtilities.lerp(max, -AndroidUtilities.statusBarHeight, this.B0);
            int measuredWidth = getMeasuredWidth();
            i11 = ((org.telegram.ui.ActionBar.h3) d51Var).backgroundPaddingLeft;
            float f7 = measuredWidth - i11;
            float f10 = max;
            canvas2 = canvas;
            canvas2.drawRect(i10, lerp, f7, f10, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (r51Var.getTranslationY() + AndroidUtilities.statusBarHeight) - i12);
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int i13 = (int) ((1.0f - Z) * dp2 * 2.0f);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(2.0f));
        gradientDrawable.setColor(i0.a.k(d51Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii), (int) (Color.alpha(r5) * Z)));
        gradientDrawable.setBounds((getWidth() - dp) / 2, org.telegram.messenger.a2.C(10.0f, d51Var.f, i13), (getWidth() + dp) / 2, AndroidUtilities.dp(10.0f) + d51Var.f + i13 + dp2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override // android.view.View
    public final float getTranslationY() {
        return this.E0.e.getTranslationY();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AndroidUtilities.runOnUIThread(new uq0(this, 25), 200L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        int i10;
        Drawable drawable2;
        int i11;
        int i12;
        d51 d51Var = this.E0;
        GradientDrawable gradientDrawable = d51Var.c;
        d51.m(d51Var);
        super.onDraw(canvas);
        float Z = Z();
        int i13 = d51Var.b;
        int i14 = (int) ((1.0f - Z) * i13);
        int i15 = AndroidUtilities.statusBarHeight - i13;
        canvas.save();
        canvas.translate(0.0f, d51Var.e.getTranslationY() + i15);
        drawable = ((org.telegram.ui.ActionBar.h3) d51Var).shadowDrawable;
        int i16 = d51Var.f;
        i10 = ((org.telegram.ui.ActionBar.h3) d51Var).backgroundPaddingTop;
        drawable.setBounds(0, (i16 - i10) + i14, getMeasuredWidth(), getMeasuredHeight() + (i15 < 0 ? -i15 : 0));
        drawable2 = ((org.telegram.ui.ActionBar.h3) d51Var).shadowDrawable;
        drawable2.draw(canvas);
        if (Z > 0.0f && Z < 1.0f) {
            float dp = AndroidUtilities.dp(12.0f) * Z;
            gradientDrawable.setColor(d51Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
            float[] fArr = this.C0;
            fArr[3] = dp;
            fArr[2] = dp;
            fArr[1] = dp;
            fArr[0] = dp;
            gradientDrawable.setCornerRadii(fArr);
            i11 = ((org.telegram.ui.ActionBar.h3) d51Var).backgroundPaddingLeft;
            int i17 = d51Var.f + i14;
            int width = getWidth();
            i12 = ((org.telegram.ui.ActionBar.h3) d51Var).backgroundPaddingLeft;
            gradientDrawable.setBounds(i11, i17, width - i12, AndroidUtilities.dp(24.0f) + d51Var.f + i14);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            d51 d51Var = this.E0;
            if (d51Var.f != 0 && motionEvent.getY() < d51Var.f) {
                d51Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        d51 d51Var = this.E0;
        r51 r51Var = d51Var.e;
        int i16 = AndroidUtilities.statusBarHeight;
        int size = View.MeasureSpec.getSize(getMeasuredHeight()) - i16;
        int R = R();
        int i17 = (int) ((size + R) * 0.2f);
        this.y0 = true;
        if (R > AndroidUtilities.dp(20.0f)) {
            r51Var.a(true);
            d51Var.setAllowNestedScroll(false);
            this.x0 = true;
        } else {
            r51Var.a(false);
            d51Var.setAllowNestedScroll(true);
            this.x0 = false;
        }
        r51Var.setContentViewPaddingTop(i17);
        if (getPaddingTop() != i16) {
            i14 = ((org.telegram.ui.ActionBar.h3) d51Var).backgroundPaddingLeft;
            i15 = ((org.telegram.ui.ActionBar.h3) d51Var).backgroundPaddingLeft;
            setPadding(i14, i16, i15, 0);
        }
        this.y0 = false;
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.E0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.y0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        this.E0.e.setTranslationY(f7);
        invalidate();
    }
}
