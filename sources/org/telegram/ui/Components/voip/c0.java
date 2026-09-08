package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class c0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ c0(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                l0 l0Var = this.b;
                l0Var.J0 = null;
                l0Var.I0 = 0.0f;
                l0Var.invalidate();
                break;
            default:
                l0 l0Var2 = this.b;
                l0Var2.B0 = null;
                l0Var2.y0 = 1.0f;
                l0Var2.r0 = 0.0f;
                l0Var2.s0 = 0.0f;
                l0Var2.invalidate();
                break;
        }
    }
}
