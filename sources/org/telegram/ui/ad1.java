package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ad1 extends AnimatorListenerAdapter {
    public final /* synthetic */ vd1 a;

    public ad1(vd1 vd1Var) {
        this.a = vd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        vd1 vd1Var = this.a;
        vd1Var.J0[vd1Var.W0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
