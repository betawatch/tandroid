package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class l3 extends AnimatorListenerAdapter {
    public final /* synthetic */ n3 a;

    public l3(n3 n3Var) {
        this.a = n3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        n3 n3Var = this.a;
        if (n3Var.w) {
            n3Var.f.setVisibility(4);
            n3Var.h.setVisibility(4);
            n3Var.n.setVisibility(0);
        } else {
            if (n3Var.v) {
                n3Var.f.setVisibility(4);
            } else {
                n3Var.h.setVisibility(4);
            }
            n3Var.n.setVisibility(8);
        }
    }
}
