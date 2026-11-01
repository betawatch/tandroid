package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u3 extends AnimatorListenerAdapter {
    public final /* synthetic */ w3 a;

    public u3(w3 w3Var) {
        this.a = w3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        w3 w3Var = this.a;
        if (w3Var.r) {
            w3Var.d.setVisibility(4);
        } else {
            w3Var.e.setVisibility(4);
        }
    }
}
