package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p0 extends AnimatorListenerAdapter {
    public final /* synthetic */ s0 a;

    public p0(s0 s0Var) {
        this.a = s0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        s0 s0Var = this.a;
        s0Var.b.removeViewImmediate(s0Var.d);
        s0Var.f.d.release();
        s0Var.w = null;
        s0Var.x = true;
        s0Var.y = false;
        s0Var.J = null;
        s0Var.H = false;
    }
}
