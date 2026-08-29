package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        l0Var.g0.setVisibility(8);
        l0Var.h0.setVisibility(8);
        l0Var.a0.setVisibility(8);
        l0Var.b0.setVisibility(8);
    }
}
