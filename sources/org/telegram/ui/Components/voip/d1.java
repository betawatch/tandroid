package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
