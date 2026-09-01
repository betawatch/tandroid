package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ek0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rk0 b;

    public /* synthetic */ ek0(rk0 rk0Var, int i10) {
        this.a = i10;
        this.b = rk0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.I0.unlock();
                break;
            case 1:
                super.onAnimationEnd(animator);
                rk0 rk0Var = this.b;
                rk0Var.N = null;
                rk0Var.k0 = 0.0f;
                rk0Var.i0 = null;
                rk0Var.invalidate();
                break;
            default:
                AndroidUtilities.removeFromParent(this.b);
                break;
        }
    }
}
