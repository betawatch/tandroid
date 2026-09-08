package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class bd1 extends AnimatorListenerAdapter {
    public final /* synthetic */ wd1 a;

    public bd1(wd1 wd1Var) {
        this.a = wd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wd1 wd1Var = this.a;
        wd1Var.J0[wd1Var.W0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
