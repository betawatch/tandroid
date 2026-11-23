package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class p3 extends AnimatorListenerAdapter {
    public final /* synthetic */ r3 a;

    public p3(r3 r3Var) {
        this.a = r3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        r3 r3Var = this.a;
        if (r3Var.x) {
            r3Var.f.setVisibility(4);
            r3Var.h.setVisibility(4);
            r3Var.n.setVisibility(0);
        } else {
            if (r3Var.w) {
                r3Var.f.setVisibility(4);
            } else {
                r3Var.h.setVisibility(4);
            }
            r3Var.n.setVisibility(8);
        }
    }
}
