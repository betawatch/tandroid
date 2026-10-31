package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q3 extends AnimatorListenerAdapter {
    public final /* synthetic */ s3 a;

    public q3(s3 s3Var) {
        this.a = s3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        s3 s3Var = this.a;
        if (s3Var.x) {
            s3Var.f.setVisibility(4);
            s3Var.h.setVisibility(4);
            s3Var.n.setVisibility(0);
        } else {
            if (s3Var.w) {
                s3Var.f.setVisibility(4);
            } else {
                s3Var.h.setVisibility(4);
            }
            s3Var.n.setVisibility(8);
        }
    }
}
