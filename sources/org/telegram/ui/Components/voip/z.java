package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class z extends AnimatorListenerAdapter {
    public final /* synthetic */ u a;
    public final /* synthetic */ l0 b;

    public z(l0 l0Var, u uVar) {
        this.b = l0Var;
        this.a = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.b;
        l0Var.J0 = null;
        this.a.A = false;
        u uVar = l0Var.A;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                l0Var.removeView(l0Var.A);
                l0Var.A.e();
            }
            l0Var.A = null;
        }
    }
}
