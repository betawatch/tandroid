package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class k3 extends AnimatorListenerAdapter {
    public final /* synthetic */ m3 a;

    public k3(m3 m3Var) {
        this.a = m3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m3 m3Var = this.a;
        if (m3Var.w) {
            m3Var.f.setVisibility(4);
            m3Var.h.setVisibility(4);
            m3Var.n.setVisibility(0);
        } else {
            if (m3Var.v) {
                m3Var.f.setVisibility(4);
            } else {
                m3Var.h.setVisibility(4);
            }
            m3Var.n.setVisibility(8);
        }
    }
}
