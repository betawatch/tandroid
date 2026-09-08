package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class q3 extends AnimatorListenerAdapter {
    public final /* synthetic */ r3 a;

    public q3(r3 r3Var) {
        this.a = r3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        r3 r3Var = this.a;
        if (r3Var.r) {
            r3Var.d.setVisibility(4);
        } else {
            r3Var.e.setVisibility(4);
        }
    }
}
