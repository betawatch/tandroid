package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class b0 extends AnimatorListenerAdapter {
    public final /* synthetic */ t a;
    public final /* synthetic */ l0 b;

    public b0(l0 l0Var, t tVar) {
        this.b = l0Var;
        this.a = tVar;
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
        l0Var.k0.setVisibility(8);
        l0Var.l0.setVisibility(8);
        l0Var.e0.setVisibility(8);
        l0Var.f0.setVisibility(8);
    }
}
