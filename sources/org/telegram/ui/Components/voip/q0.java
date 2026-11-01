package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class q0 extends AnimatorListenerAdapter {
    public final /* synthetic */ t0 a;

    public q0(t0 t0Var) {
        this.a = t0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t0 t0Var = this.a;
        t0Var.b.removeViewImmediate(t0Var.d);
        t0Var.f.d.release();
        t0Var.w = null;
        t0Var.x = true;
        t0Var.y = false;
        t0Var.J = null;
        t0Var.H = false;
    }
}
