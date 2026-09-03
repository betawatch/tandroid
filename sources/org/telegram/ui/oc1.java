package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
