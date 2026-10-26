package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
