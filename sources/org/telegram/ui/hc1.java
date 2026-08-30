package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ cd1 a;

    public hc1(cd1 cd1Var) {
        this.a = cd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cd1 cd1Var = this.a;
        cd1Var.G0[cd1Var.T0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
