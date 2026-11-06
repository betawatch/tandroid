package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class vh0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ii0 b;

    public /* synthetic */ vh0(ii0 ii0Var, int i7) {
        this.a = i7;
        this.b = ii0Var;
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
                ii0 ii0Var = this.b;
                ii0Var.Q = null;
                ii0Var.n0 = 0.0f;
                ii0Var.l0 = null;
                ii0Var.invalidate();
                break;
        }
    }
}
