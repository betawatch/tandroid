package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class aj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ nj0 b;

    public /* synthetic */ aj0(nj0 nj0Var, int i10) {
        this.a = i10;
        this.b = nj0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.L0.e();
                break;
            default:
                super.onAnimationEnd(animator);
                nj0 nj0Var = this.b;
                nj0Var.Q = null;
                nj0Var.n0 = 0.0f;
                nj0Var.l0 = null;
                nj0Var.invalidate();
                break;
        }
    }
}
