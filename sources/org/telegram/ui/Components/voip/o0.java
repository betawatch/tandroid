package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o0 extends AnimatorListenerAdapter {
    public final /* synthetic */ s0 a;

    public o0(s0 s0Var) {
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
        s0Var.K = null;
        s0Var.I = false;
    }
}
