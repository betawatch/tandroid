package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k3 extends AnimatorListenerAdapter {
    public final /* synthetic */ m3 a;

    public k3(m3 m3Var) {
        this.a = m3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m3 m3Var = this.a;
        if (m3Var.v) {
            m3Var.e.setVisibility(4);
            m3Var.f.setVisibility(4);
            m3Var.h.setVisibility(0);
        } else {
            if (m3Var.s) {
                m3Var.e.setVisibility(4);
            } else {
                m3Var.f.setVisibility(4);
            }
            m3Var.h.setVisibility(8);
        }
    }
}
