package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c0 extends AnimatorListenerAdapter {
    public final /* synthetic */ t a;
    public final /* synthetic */ m0 b;

    public c0(m0 m0Var, t tVar) {
        this.b = m0Var;
        this.a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.b;
        m0Var.x.unlock();
        m0Var.r = null;
        this.a.r = false;
        if (!m0Var.b) {
            m0Var.d();
            m0Var.y = null;
            m0Var.d = 0L;
        }
        m0Var.c = m0Var.b ? 1.0f : 0.0f;
        m0Var.l();
        m0Var.i(false);
        if (m0Var.b) {
            return;
        }
        m0Var.k0.setVisibility(8);
        m0Var.l0.setVisibility(8);
        m0Var.e0.setVisibility(8);
        m0Var.f0.setVisibility(8);
    }
}
