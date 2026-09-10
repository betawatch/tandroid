package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gd1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ae1 a;

    public gd1(ae1 ae1Var) {
        this.a = ae1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ae1 ae1Var = this.a;
        if (ae1Var.W0 == null) {
            ae1Var.J0[0].setVisibility(4);
        }
    }
}
