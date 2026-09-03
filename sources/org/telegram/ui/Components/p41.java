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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class p41 extends qv0 {
    public boolean A0;
    public final /* synthetic */ q41 B0;
    public final Paint t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public ValueAnimator x0;
    public float y0;
    public final float[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p41(q41 q41Var, Context context) {
        super(context, null);
        int i10;
        int i11;
        this.B0 = q41Var;
        this.t0 = new Paint(1);
        this.u0 = false;
        this.v0 = false;
        this.w0 = false;
        this.y0 = 0.0f;
        this.z0 = new float[8];
        setWillNotDraw(false);
        i10 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingLeft;
        i11 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        setDelegate(new o41(this));
    }

    public final float Z() {
        q41 q41Var = this.B0;
        return Math.min(1.0f, Math.max(0.0f, q41Var.f / (q41Var.b * 2.0f)));
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        q41 q41Var = this.B0;
        e51 e51Var = q41Var.e;
        int i12 = q41Var.b;
        GradientDrawable gradientDrawable = q41Var.c;
        float Z = Z();
        boolean z4 = Z == 0.0f && !q41Var.isDismissed();
        if (this.w0 != z4) {
            ValueAnimator valueAnimator = this.x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.w0 = z4;
            ValueAnimator valueAnimator2 = this.x0;
            if (valueAnimator2 == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, z4 ? 1.0f : 0.0f);
                this.x0 = ofFloat;
                ofFloat.addUpdateListener(new j70(this, 29));
                this.x0.setDuration(200L);
            } else {
                valueAnimator2.setFloatValues(this.y0, z4 ? 1.0f : 0.0f);
            }
            this.x0.start();
        }
        boolean z10 = this.y0 > 0.5f;
        if (this.A0 != z10) {
            this.A0 = z10;
            boolean z11 = AndroidUtilities.computePerceivedBrightness(q41Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) > 0.721f;
            boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(q41Var.getThemedColor(org.telegram.ui.ActionBar.j6.s8), 855638016)) > 0.721f;
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(q41Var.getWindow(), z11);
        }
        if (this.y0 > 0.0f) {
            int themedColor = q41Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5);
            Paint paint = this.t0;
            paint.setColor(themedColor);
            int max = (int) Math.max(0.0f, e51Var.getTranslationY() + (AndroidUtilities.statusBarHeight - i12) + ((1.0f - Z()) * i12) + q41Var.f + AndroidUtilities.dp(24.0f));
            i10 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingLeft;
            float lerp = AndroidUtilities.lerp(max, -AndroidUtilities.statusBarHeight, this.y0);
            int measuredWidth = getMeasuredWidth();
            i11 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingLeft;
            float f10 = measuredWidth - i11;
            float f11 = max;
            canvas2 = canvas;
            canvas2.drawRect(i10, lerp, f10, f11, paint);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas);
        canvas2.save();
        canvas2.translate(0.0f, (e51Var.getTranslationY() + AndroidUtilities.statusBarHeight) - i12);
        int dp = AndroidUtilities.dp(36.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int i13 = (int) ((1.0f - Z) * dp2 * 2.0f);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(2.0f));
        gradientDrawable.setColor(i0.a.k(q41Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii), (int) (Color.alpha(r5) * Z)));
        gradientDrawable.setBounds((getWidth() - dp) / 2, org.telegram.messenger.y3.C(10.0f, q41Var.f, i13), (getWidth() + dp) / 2, AndroidUtilities.dp(10.0f) + q41Var.f + i13 + dp2);
        gradientDrawable.draw(canvas2);
        canvas2.restore();
    }

    @Override // android.view.View
    public final float getTranslationY() {
        return this.B0.e.getTranslationY();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AndroidUtilities.runOnUIThread(new nq0(this, 25), 200L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        int i10;
        Drawable drawable2;
        int i11;
        int i12;
        q41 q41Var = this.B0;
        GradientDrawable gradientDrawable = q41Var.c;
        q41.m(q41Var);
        super.onDraw(canvas);
        float Z = Z();
        int i13 = q41Var.b;
        int i14 = (int) ((1.0f - Z) * i13);
        int i15 = AndroidUtilities.statusBarHeight - i13;
        canvas.save();
        canvas.translate(0.0f, q41Var.e.getTranslationY() + i15);
        drawable = ((org.telegram.ui.ActionBar.g3) q41Var).shadowDrawable;
        int i16 = q41Var.f;
        i10 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingTop;
        drawable.setBounds(0, (i16 - i10) + i14, getMeasuredWidth(), getMeasuredHeight() + (i15 < 0 ? -i15 : 0));
        drawable2 = ((org.telegram.ui.ActionBar.g3) q41Var).shadowDrawable;
        drawable2.draw(canvas);
        if (Z > 0.0f && Z < 1.0f) {
            float dp = AndroidUtilities.dp(12.0f) * Z;
            gradientDrawable.setColor(q41Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
            float[] fArr = this.z0;
            fArr[3] = dp;
            fArr[2] = dp;
            fArr[1] = dp;
            fArr[0] = dp;
            gradientDrawable.setCornerRadii(fArr);
            i11 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingLeft;
            int i17 = q41Var.f + i14;
            int width = getWidth();
            i12 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingLeft;
            gradientDrawable.setBounds(i11, i17, width - i12, AndroidUtilities.dp(24.0f) + q41Var.f + i14);
            gradientDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            q41 q41Var = this.B0;
            if (q41Var.f != 0 && motionEvent.getY() < q41Var.f) {
                q41Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        q41 q41Var = this.B0;
        e51 e51Var = q41Var.e;
        int i16 = AndroidUtilities.statusBarHeight;
        int size = View.MeasureSpec.getSize(getMeasuredHeight()) - i16;
        int R = R();
        int i17 = (int) ((size + R) * 0.2f);
        this.v0 = true;
        if (R > AndroidUtilities.dp(20.0f)) {
            e51Var.a(true);
            q41Var.setAllowNestedScroll(false);
            this.u0 = true;
        } else {
            e51Var.a(false);
            q41Var.setAllowNestedScroll(true);
            this.u0 = false;
        }
        e51Var.setContentViewPaddingTop(i17);
        if (getPaddingTop() != i16) {
            i14 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingLeft;
            i15 = ((org.telegram.ui.ActionBar.g3) q41Var).backgroundPaddingLeft;
            setPadding(i14, i16, i15, 0);
        }
        this.v0 = false;
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.B0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.v0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        this.B0.e.setTranslationY(f10);
        invalidate();
    }
}
