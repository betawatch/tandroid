package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class kc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ed1 a;

    public kc1(ed1 ed1Var) {
        this.a = ed1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ed1 ed1Var = this.a;
        if (ed1Var.T0 == null) {
            ed1Var.G0[0].setVisibility(4);
        }
    }
}
