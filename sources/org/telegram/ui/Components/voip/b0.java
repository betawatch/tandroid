package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class b0 extends AnimatorListenerAdapter {
    public final /* synthetic */ m0 a;

    public b0(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.a;
        m0Var.N0 = null;
        m0Var.y.E = false;
        u uVar = m0Var.E;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                m0Var.removeView(m0Var.E);
                m0Var.E.e();
            }
            m0Var.E = null;
        }
    }
}
