package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
