package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class z extends AnimatorListenerAdapter {
    public final /* synthetic */ k0 a;

    public z(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k0 k0Var = this.a;
        k0Var.K0 = null;
        k0Var.y.B = false;
        t tVar = k0Var.B;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                k0Var.removeView(k0Var.B);
                k0Var.B.e();
            }
            k0Var.B = null;
        }
    }
}
