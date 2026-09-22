package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class cd1 extends AnimatorListenerAdapter {
    public final /* synthetic */ xd1 a;

    public cd1(xd1 xd1Var) {
        this.a = xd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xd1 xd1Var = this.a;
        xd1Var.J0[xd1Var.W0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
