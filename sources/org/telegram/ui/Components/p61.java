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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class p61 extends FrameLayout {
    public ValueAnimator a;
    public float b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ r61 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p61(r61 r61Var, Context context) {
        super(context);
        this.e = r61Var;
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
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        canvas.save();
        r61 r61Var = this.e;
        Drawable drawable = r61Var.h;
        RectF rectF = r61Var.x;
        int i22 = r61Var.y;
        i10 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i22 - i10);
        int i23 = r61Var.y;
        i11 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
        int dp2 = (i23 - i11) - AndroidUtilities.dp(13.0f);
        int dp3 = AndroidUtilities.dp(50.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
        int i24 = i12 + dp3;
        int i25 = AndroidUtilities.statusBarHeight;
        int i26 = dp2 + i25;
        int i27 = dp + i25;
        int i28 = i24 - i25;
        i13 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
        float translationY = getTranslationY() + i13 + i26;
        int i29 = AndroidUtilities.statusBarHeight;
        if (translationY < i29 * 2) {
            i21 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
            int min = (int) Math.min(i29, ((r8 - i26) - i21) - getTranslationY());
            i26 -= min;
            i28 += min;
            f10 = 1.0f - Math.min(1.0f, (min * 2) / AndroidUtilities.statusBarHeight);
        } else {
            f10 = 1.0f;
        }
        i14 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
        float translationY2 = getTranslationY() + i14 + i26;
        float f11 = AndroidUtilities.statusBarHeight;
        if (translationY2 < f11) {
            i20 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
            i15 = (int) Math.min(f11, ((r7 - i26) - i20) - getTranslationY());
        } else {
            i15 = 0;
        }
        drawable.setBounds(0, i26, getMeasuredWidth(), i28);
        drawable.draw(canvas);
        if (!r61Var.P) {
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.k6.t0.setColor(r61Var.C);
                i16 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingLeft;
                float f12 = measuredWidth - i18;
                i19 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingTop;
                rectF.set(i16, i17 + i26, f12, AndroidUtilities.dp(24.0f) + i19 + i26);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.k6.t0);
            }
            int dp4 = AndroidUtilities.dp(36.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, i27, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i27);
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(null, r61Var.F, false));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.t0);
        }
        if (i15 > 0) {
            org.telegram.ui.ActionBar.k6.t0.setColor(r61Var.C);
        }
        boolean z4 = i15 > AndroidUtilities.statusBarHeight / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z4) {
            boolean z10 = AndroidUtilities.computePerceivedBrightness(r61Var.getThemedColor(org.telegram.ui.ActionBar.k6.h5)) > 0.721f;
            boolean z11 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v(r61Var.getThemedColor(org.telegram.ui.ActionBar.k6.s8), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z4);
            if (!z4) {
                z10 = z11;
            }
            AndroidUtilities.setLightStatusBar(r61Var.getWindow(), z10);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            r61 r61Var = this.e;
            if (y10 < r61Var.y) {
                r61Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.e.K();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean z4;
        int dp;
        int size = View.MeasureSpec.getSize(i11);
        int i14 = 1;
        this.c = true;
        r61 r61Var = this.e;
        mh.d1 d1Var = r61Var.d;
        i12 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingLeft;
        int i15 = AndroidUtilities.statusBarHeight;
        i13 = ((org.telegram.ui.ActionBar.h3) r61Var).backgroundPaddingLeft;
        setPadding(i12, i15, i13, 0);
        this.c = false;
        int paddingTop = size - getPaddingTop();
        z4 = ((org.telegram.ui.ActionBar.h3) r61Var).keyboardVisible;
        if (z4) {
            dp = AndroidUtilities.dp(8.0f);
            r61Var.setAllowNestedScroll(false);
            int i16 = r61Var.y;
            if (i16 != 0) {
                float f10 = i16;
                this.b = f10;
                setTranslationY(f10);
                ValueAnimator valueAnimator = this.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b, 0.0f);
                this.a = ofFloat;
                ofFloat.addUpdateListener(new i61(i14, this));
                this.a.setDuration(250L);
                this.a.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                this.a.addListener(new pd0(this, 27));
                this.a.start();
            } else if (this.a != null) {
                setTranslationY(this.b);
            }
        } else {
            dp = (paddingTop - ((paddingTop / 5) * 3)) + AndroidUtilities.dp(8.0f);
            r61Var.setAllowNestedScroll(true);
        }
        if (d1Var.getPaddingTop() != dp) {
            this.c = true;
            d1Var.setPadding(0, dp, 0, 0);
            this.c = false;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
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
