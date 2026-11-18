package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class o3 extends AnimatorListenerAdapter {
    public final /* synthetic */ q3 a;

    public o3(q3 q3Var) {
        this.a = q3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q3 q3Var = this.a;
        if (q3Var.x) {
            q3Var.f.setVisibility(4);
            q3Var.h.setVisibility(4);
            q3Var.n.setVisibility(0);
        } else {
            if (q3Var.w) {
                q3Var.f.setVisibility(4);
            } else {
                q3Var.h.setVisibility(4);
            }
            q3Var.n.setVisibility(8);
        }
    }
}
