package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
