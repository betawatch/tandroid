package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
