package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g11 b;

    public /* synthetic */ s01(g11 g11Var, int i7) {
        this.a = i7;
        this.b = g11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g11 g11Var = this.b;
                g11Var.getClass();
                g11Var.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g11 g11Var2 = this.b;
                g11Var2.a0 = floatValue;
                org.telegram.ui.f61 f61Var = g11Var2.S;
                f61Var.setVisibility(floatValue > 0.0f ? 0 : 8);
                f61Var.setAlpha(floatValue);
                f61Var.setTranslationY((1.0f - floatValue) * (-org.telegram.messenger.g0.L(8.0f)));
                g11Var2.c(floatValue);
                int L = org.telegram.messenger.g0.L(100.0f) + org.telegram.messenger.g0.m + ((int) (org.telegram.messenger.g0.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) g11Var2.r.getLayoutParams()).topMargin = L;
                View view = g11Var2.F;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                g11Var2.h.requestLayout();
                break;
            default:
                g11 g11Var3 = this.b;
                g11Var3.getClass();
                g11Var3.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
