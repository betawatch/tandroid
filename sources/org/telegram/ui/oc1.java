package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class oc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ jd1 a;

    public oc1(jd1 jd1Var) {
        this.a = jd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jd1 jd1Var = this.a;
        jd1Var.G0[jd1Var.T0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
