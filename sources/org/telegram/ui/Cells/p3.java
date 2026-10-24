package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class p3 extends AnimatorListenerAdapter {
    public final /* synthetic */ r3 a;

    public p3(r3 r3Var) {
        this.a = r3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        r3 r3Var = this.a;
        if (r3Var.r) {
            r3Var.d.setVisibility(4);
        } else {
            r3Var.e.setVisibility(4);
        }
    }
}
