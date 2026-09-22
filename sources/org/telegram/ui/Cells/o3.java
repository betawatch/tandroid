package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class o3 extends AnimatorListenerAdapter {
    public final /* synthetic */ q3 a;

    public o3(q3 q3Var) {
        this.a = q3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q3 q3Var = this.a;
        if (q3Var.v) {
            q3Var.e.setVisibility(4);
            q3Var.f.setVisibility(4);
            q3Var.h.setVisibility(0);
        } else {
            if (q3Var.s) {
                q3Var.e.setVisibility(4);
            } else {
                q3Var.f.setVisibility(4);
            }
            q3Var.h.setVisibility(8);
        }
    }
}
