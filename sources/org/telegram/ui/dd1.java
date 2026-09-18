package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class dd1 extends AnimatorListenerAdapter {
    public final /* synthetic */ xd1 a;

    public dd1(xd1 xd1Var) {
        this.a = xd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xd1 xd1Var = this.a;
        if (xd1Var.W0 == null) {
            xd1Var.J0[0].setVisibility(4);
        }
    }
}
