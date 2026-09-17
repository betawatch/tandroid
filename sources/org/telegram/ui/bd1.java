package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
