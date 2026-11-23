package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z11 b;

    public /* synthetic */ x11(z11 z11Var, int i7) {
        this.a = i7;
        this.b = z11Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z11 z11Var = this.b;
                z11Var.getClass();
                z11Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z11Var.h();
                z11Var.g();
                break;
            default:
                float max = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                z11 z11Var2 = this.b;
                z11Var2.M = max;
                z11Var2.h.invalidate();
                break;
        }
    }
}
