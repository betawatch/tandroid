package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class cd1 extends AnimatorListenerAdapter {
    public final /* synthetic */ wd1 a;

    public cd1(wd1 wd1Var) {
        this.a = wd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wd1 wd1Var = this.a;
        if (wd1Var.W0 == null) {
            wd1Var.J0[0].setVisibility(4);
        }
    }
}
