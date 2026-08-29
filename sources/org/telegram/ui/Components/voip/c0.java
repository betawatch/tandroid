package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
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
                l0Var.F0 = null;
                l0Var.E0 = 0.0f;
                l0Var.invalidate();
                break;
            default:
                l0 l0Var2 = this.b;
                l0Var2.x0 = null;
                l0Var2.u0 = 1.0f;
                l0Var2.n0 = 0.0f;
                l0Var2.o0 = 0.0f;
                l0Var2.invalidate();
                break;
        }
    }
}
