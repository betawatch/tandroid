package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class j0 extends AnimatorListenerAdapter {
    public final /* synthetic */ u a;
    public final /* synthetic */ u b;
    public final /* synthetic */ l0 c;

    public j0(l0 l0Var, u uVar, u uVar2) {
        this.c = l0Var;
        this.a = uVar;
        this.b = uVar2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.c;
        l0Var.K0 = null;
        this.a.B = false;
        u uVar = l0Var.B;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                l0Var.removeView(l0Var.B);
                this.b.e();
            }
            l0Var.B = null;
        }
    }
}
