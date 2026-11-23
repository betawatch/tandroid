package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f11 b;

    public /* synthetic */ r01(f11 f11Var, int i7) {
        this.a = i7;
        this.b = f11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f11 f11Var = this.b;
                f11Var.getClass();
                f11Var.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f11 f11Var2 = this.b;
                f11Var2.a0 = floatValue;
                org.telegram.ui.d61 d61Var = f11Var2.S;
                d61Var.setVisibility(floatValue > 0.0f ? 0 : 8);
                d61Var.setAlpha(floatValue);
                d61Var.setTranslationY((1.0f - floatValue) * (-org.telegram.messenger.g0.L(8.0f)));
                f11Var2.c(floatValue);
                int L = org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.m + ((int) (org.telegram.messenger.g0.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) f11Var2.r.getLayoutParams()).topMargin = L;
                View view = f11Var2.F;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                f11Var2.h.requestLayout();
                break;
            default:
                f11 f11Var3 = this.b;
                f11Var3.getClass();
                f11Var3.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
