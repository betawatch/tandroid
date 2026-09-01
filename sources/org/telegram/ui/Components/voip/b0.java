package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b0 extends AnimatorListenerAdapter {
    public final /* synthetic */ u a;
    public final /* synthetic */ l0 b;

    public b0(l0 l0Var, u uVar) {
        this.b = l0Var;
        this.a = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.b;
        l0Var.x.unlock();
        l0Var.r = null;
        this.a.r = false;
        if (!l0Var.b) {
            l0Var.d();
            l0Var.y = null;
            l0Var.d = 0L;
        }
        l0Var.c = l0Var.b ? 1.0f : 0.0f;
        l0Var.l();
        l0Var.i(false);
        if (l0Var.b) {
            return;
        }
        l0Var.h0.setVisibility(8);
        l0Var.i0.setVisibility(8);
        l0Var.b0.setVisibility(8);
        l0Var.c0.setVisibility(8);
    }
}
