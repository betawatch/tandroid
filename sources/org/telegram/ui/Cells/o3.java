package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
