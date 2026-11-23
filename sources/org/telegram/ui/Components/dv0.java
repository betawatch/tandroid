package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv0 b;

    public /* synthetic */ dv0(gv0 gv0Var, int i7) {
        this.a = i7;
        this.b = gv0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                gv0 gv0Var = this.b;
                gv0Var.getClass();
                gv0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gv0Var.invalidate();
                break;
            case 1:
                gv0 gv0Var2 = this.b;
                gv0Var2.getClass();
                gv0Var2.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                gv0 gv0Var3 = this.b;
                gv0Var3.getClass();
                gv0Var3.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gv0Var3.invalidate();
                break;
        }
    }
}
