package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ i0(t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t0 t0Var = this.b;
                t0Var.s.setVisibility(4);
                t0Var.w = null;
                break;
            default:
                this.b.w = null;
                break;
        }
    }
}
