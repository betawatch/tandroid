package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class k0 extends AnimatorListenerAdapter {
    public final /* synthetic */ u a;
    public final /* synthetic */ u b;
    public final /* synthetic */ m0 c;

    public k0(m0 m0Var, u uVar, u uVar2) {
        this.c = m0Var;
        this.a = uVar;
        this.b = uVar2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.c;
        m0Var.N0 = null;
        this.a.E = false;
        u uVar = m0Var.E;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                m0Var.removeView(m0Var.E);
                this.b.e();
            }
            m0Var.E = null;
        }
    }
}
