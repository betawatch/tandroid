package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class c0 extends AnimatorListenerAdapter {
    public final /* synthetic */ u a;
    public final /* synthetic */ m0 b;

    public c0(m0 m0Var, u uVar) {
        this.b = m0Var;
        this.a = uVar;
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
