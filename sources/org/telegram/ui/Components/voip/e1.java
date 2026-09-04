package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class e1 extends AnimatorListenerAdapter {
    public final /* synthetic */ h1 a;

    public e1(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h1 h1Var = this.a;
        h1Var.b.removeViewImmediate(h1Var.d);
        h1Var.f.d.release();
        h1Var.v = null;
        h1Var.w = true;
        h1Var.x = false;
        h1Var.J = null;
        h1Var.H = false;
    }
}
