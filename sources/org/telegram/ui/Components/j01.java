package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v01 b;

    public /* synthetic */ j01(v01 v01Var, int i7) {
        this.a = i7;
        this.b = v01Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v01 v01Var = this.b;
                v01Var.getClass();
                v01Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v01 v01Var2 = this.b;
                v01Var2.T = floatValue;
                org.telegram.ui.b61 b61Var = v01Var2.Q;
                b61Var.setVisibility(floatValue > 0.0f ? 0 : 8);
                b61Var.setAlpha(floatValue);
                b61Var.setTranslationY((1.0f - floatValue) * (-org.telegram.messenger.g0.L(8.0f)));
                v01Var2.b(floatValue);
                int L = org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.m + ((int) (org.telegram.messenger.g0.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) v01Var2.r.getLayoutParams()).topMargin = L;
                View view = v01Var2.F;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                v01Var2.h.requestLayout();
                break;
            default:
                v01 v01Var3 = this.b;
                v01Var3.getClass();
                v01Var3.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
