package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a0 extends AnimatorListenerAdapter {
    public final /* synthetic */ t a;
    public final /* synthetic */ k0 b;

    public a0(k0 k0Var, t tVar) {
        this.b = k0Var;
        this.a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k0 k0Var = this.b;
        k0Var.x.unlock();
        k0Var.r = null;
        this.a.r = false;
        if (!k0Var.b) {
            k0Var.d();
            k0Var.y = null;
            k0Var.d = 0L;
        }
        k0Var.c = k0Var.b ? 1.0f : 0.0f;
        k0Var.l();
        k0Var.i(false);
        if (k0Var.b) {
            return;
        }
        k0Var.g0.setVisibility(8);
        k0Var.h0.setVisibility(8);
        k0Var.a0.setVisibility(8);
        k0Var.b0.setVisibility(8);
    }
}
