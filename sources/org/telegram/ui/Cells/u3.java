package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
