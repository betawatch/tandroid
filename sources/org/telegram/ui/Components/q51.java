package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class q51 extends FrameLayout {
    public ValueAnimator a;
    public float b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ s51 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q51(s51 s51Var, Context context) {
        super(context);
        this.e = s51Var;
        this.c = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        canvas.save();
        s51 s51Var = this.e;
        Drawable drawable = s51Var.h;
        RectF rectF = s51Var.x;
        int i21 = s51Var.y;
        i9 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i21 - i9);
        int i22 = s51Var.y;
        i10 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
        int dp2 = (i22 - i10) - AndroidUtilities.dp(13.0f);
        int dp3 = AndroidUtilities.dp(50.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
        int i23 = i11 + dp3;
        int i24 = AndroidUtilities.statusBarHeight;
        int i25 = dp2 + i24;
        int i26 = dp + i24;
        int i27 = i23 - i24;
        i12 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
        float translationY = getTranslationY() + i12 + i25;
        int i28 = AndroidUtilities.statusBarHeight;
        if (translationY < i28 * 2) {
            i20 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
            int min = (int) Math.min(i28, ((r8 - i25) - i20) - getTranslationY());
            i25 -= min;
            i27 += min;
            f10 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
        } else {
            f10 = 1.0f;
        }
        i13 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
        float translationY2 = getTranslationY() + i13 + i25;
        float f11 = AndroidUtilities.statusBarHeight;
        if (translationY2 < f11) {
            i19 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
            i14 = (int) Math.min(f11, ((r7 - i25) - i19) - getTranslationY());
        } else {
            i14 = 0;
        }
        drawable.setBounds(0, i25, getMeasuredWidth(), i27);
        drawable.draw(canvas);
        if (!s51Var.O) {
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.f6.t0.setColor(s51Var.B);
                i15 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingLeft;
                i16 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i17 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingLeft;
                float f12 = measuredWidth - i17;
                i18 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingTop;
                rectF.set(i15, i16 + i25, f12, AndroidUtilities.dp(24.0f) + i18 + i25);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.f6.t0);
            }
            int dp4 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, i26, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i26);
            org.telegram.ui.ActionBar.f6.t0.setColor(org.telegram.ui.ActionBar.f6.w0(null, s51Var.E, false));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.t0);
        }
        if (i14 > 0) {
            org.telegram.ui.ActionBar.f6.t0.setColor(s51Var.B);
        }
        boolean z10 = i14 > AndroidUtilities.statusBarHeight / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            boolean z11 = AndroidUtilities.computePerceivedBrightness(s51Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5)) > 0.721f;
            boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v(s51Var.getThemedColor(org.telegram.ui.ActionBar.f6.s8), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(s51Var.getWindow(), z11);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            s51 s51Var = this.e;
            if (y10 < s51Var.y) {
                s51Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.e.K();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        boolean z10;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 1;
        this.c = true;
        s51 s51Var = this.e;
        gh.f1 f1Var = s51Var.d;
        i11 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingLeft;
        int i14 = AndroidUtilities.statusBarHeight;
        i12 = ((org.telegram.ui.ActionBar.f3) s51Var).backgroundPaddingLeft;
        setPadding(i11, i14, i12, 0);
        this.c = false;
        int paddingTop = size - getPaddingTop();
        z10 = ((org.telegram.ui.ActionBar.f3) s51Var).keyboardVisible;
        if (z10) {
            dp = AndroidUtilities.dp(8.0f);
            s51Var.setAllowNestedScroll(false);
            int i15 = s51Var.y;
            if (i15 != 0) {
                float f10 = i15;
                this.b = f10;
                setTranslationY(f10);
                ValueAnimator valueAnimator = this.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b, 0.0f);
                this.a = ofFloat;
                ofFloat.addUpdateListener(new j51(i13, this));
                this.a.setDuration(250L);
                this.a.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                this.a.addListener(new y11(this, 4));
                this.a.start();
            } else if (this.a != null) {
                setTranslationY(this.b);
            }
        } else {
            dp = (paddingTop - ((paddingTop / 5) * 3)) + AndroidUtilities.dp(8.0f);
            s51Var.setAllowNestedScroll(true);
        }
        if (f1Var.getPaddingTop() != dp) {
            this.c = true;
            f1Var.setPadding(0, dp, 0, 0);
            this.c = false;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.e.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        invalidate();
    }
}
