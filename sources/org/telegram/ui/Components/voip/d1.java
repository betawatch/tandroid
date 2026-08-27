package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
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
        g1Var.F = null;
        g1Var.D = false;
    }
}
