package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class g1 extends AnimatorListenerAdapter {
    public final /* synthetic */ j1 a;

    public g1(j1 j1Var) {
        this.a = j1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j1 j1Var = this.a;
        j1Var.b.removeViewImmediate(j1Var.d);
        j1Var.f.d.release();
        j1Var.v = null;
        j1Var.w = true;
        j1Var.x = false;
        j1Var.J = null;
        j1Var.H = false;
    }
}
