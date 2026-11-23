package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class fv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv0 b;

    public /* synthetic */ fv0(gv0 gv0Var, int i7) {
        this.a = i7;
        this.b = gv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                gv0 gv0Var = this.b;
                gv0Var.E = 1.0f;
                gv0Var.invalidate();
                gv0Var.H = null;
                break;
            case 1:
                gv0 gv0Var2 = this.b;
                gv0Var2.m(((Float) gv0Var2.w.getAnimatedValue()).floatValue());
                gv0Var2.w = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.G = null;
                break;
        }
    }
}
