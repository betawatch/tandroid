package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d1 extends AnimatorListenerAdapter {
    public final /* synthetic */ g1 a;

    public d1(g1 g1Var) {
        this.a = g1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g1 g1Var = this.a;
        g1Var.b.removeViewImmediate(g1Var.d);
        g1Var.f.d.release();
        g1Var.v = null;
        g1Var.w = true;
        g1Var.x = false;
        g1Var.G = null;
        g1Var.E = false;
    }
}
