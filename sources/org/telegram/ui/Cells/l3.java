package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l3 extends AnimatorListenerAdapter {
    public final /* synthetic */ n3 a;

    public l3(n3 n3Var) {
        this.a = n3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        n3 n3Var = this.a;
        if (n3Var.v) {
            n3Var.e.setVisibility(4);
            n3Var.f.setVisibility(4);
            n3Var.h.setVisibility(0);
        } else {
            if (n3Var.s) {
                n3Var.e.setVisibility(4);
            } else {
                n3Var.f.setVisibility(4);
            }
            n3Var.h.setVisibility(8);
        }
    }
}
