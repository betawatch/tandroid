package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class qb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ kc1 a;

    public qb1(kc1 kc1Var) {
        this.a = kc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kc1 kc1Var = this.a;
        if (kc1Var.W0 == null) {
            kc1Var.J0[0].setVisibility(4);
        }
    }
}
