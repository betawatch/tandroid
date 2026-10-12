package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class id1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ce1 a;

    public id1(ce1 ce1Var) {
        this.a = ce1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ce1 ce1Var = this.a;
        if (ce1Var.W0 == null) {
            ce1Var.J0[0].setVisibility(4);
        }
    }
}
