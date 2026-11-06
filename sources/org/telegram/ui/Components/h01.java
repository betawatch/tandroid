package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s01 b;

    public /* synthetic */ h01(s01 s01Var, int i7) {
        this.a = i7;
        this.b = s01Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                s01 s01Var = this.b;
                s01Var.getClass();
                s01Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s01 s01Var2 = this.b;
                s01Var2.S = floatValue;
                org.telegram.ui.e61 e61Var = s01Var2.P;
                e61Var.setVisibility(floatValue > 0.0f ? 0 : 8);
                e61Var.setAlpha(floatValue);
                e61Var.setTranslationY((1.0f - floatValue) * (-org.telegram.messenger.g0.L(8.0f)));
                s01Var2.b(floatValue);
                int L = org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.m + ((int) (org.telegram.messenger.g0.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) s01Var2.r.getLayoutParams()).topMargin = L;
                View view = s01Var2.E;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                s01Var2.h.requestLayout();
                break;
            default:
                s01 s01Var3 = this.b;
                s01Var3.getClass();
                s01Var3.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
