package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class o3 extends AnimatorListenerAdapter {
    public final /* synthetic */ q3 a;

    public o3(q3 q3Var) {
        this.a = q3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q3 q3Var = this.a;
        if (q3Var.x) {
            q3Var.f.setVisibility(4);
            q3Var.h.setVisibility(4);
            q3Var.n.setVisibility(0);
        } else {
            if (q3Var.w) {
                q3Var.f.setVisibility(4);
            } else {
                q3Var.h.setVisibility(4);
            }
            q3Var.n.setVisibility(8);
        }
    }
}
