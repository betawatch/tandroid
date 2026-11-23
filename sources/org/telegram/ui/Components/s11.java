package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v11 b;

    public /* synthetic */ s11(v11 v11Var, int i7) {
        this.a = i7;
        this.b = v11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                fi.u2 u2Var = this.b.f;
                u2Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                u2Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                u2Var.invalidate();
                break;
            default:
                v11 v11Var = this.b;
                v11Var.getClass();
                v11Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v11Var.h();
                break;
        }
    }
}
