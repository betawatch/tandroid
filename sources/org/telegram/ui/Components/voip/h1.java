package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class h1 extends AnimatorListenerAdapter {
    public final /* synthetic */ k1 a;

    public h1(k1 k1Var) {
        this.a = k1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k1 k1Var = this.a;
        k1Var.b.removeViewImmediate(k1Var.d);
        k1Var.f.d.release();
        k1Var.v = null;
        k1Var.w = true;
        k1Var.x = false;
        k1Var.J = null;
        k1Var.H = false;
    }
}
