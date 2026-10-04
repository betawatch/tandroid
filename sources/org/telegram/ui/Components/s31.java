package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class s31 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u31 b;

    public /* synthetic */ s31(u31 u31Var, int i10) {
        this.a = i10;
        this.b = u31Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                u31 u31Var = this.b;
                u31Var.getClass();
                u31Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u31Var.h();
                u31Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                u31 u31Var2 = this.b;
                u31Var2.K = max;
                u31Var2.h.invalidate();
                break;
        }
    }
}
