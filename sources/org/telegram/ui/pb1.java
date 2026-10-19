package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class pb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ kc1 a;

    public pb1(kc1 kc1Var) {
        this.a = kc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kc1 kc1Var = this.a;
        kc1Var.J0[kc1Var.W0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
