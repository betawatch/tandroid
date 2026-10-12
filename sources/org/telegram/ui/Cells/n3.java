package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class n3 extends AnimatorListenerAdapter {
    public final /* synthetic */ p3 a;

    public n3(p3 p3Var) {
        this.a = p3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        p3 p3Var = this.a;
        if (p3Var.v) {
            p3Var.e.setVisibility(4);
            p3Var.f.setVisibility(4);
            p3Var.h.setVisibility(0);
        } else {
            if (p3Var.s) {
                p3Var.e.setVisibility(4);
            } else {
                p3Var.f.setVisibility(4);
            }
            p3Var.h.setVisibility(8);
        }
    }
}
