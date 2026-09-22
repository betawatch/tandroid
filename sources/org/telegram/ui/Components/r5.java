package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class r5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5 b;

    public /* synthetic */ r5(x5 x5Var, int i10) {
        this.a = i10;
        this.b = x5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.a) {
            case 0:
                this.b.scaleAnimator = null;
                boolean unused = x5.lockPositionChanging = false;
                break;
            case 1:
                x5 x5Var = this.b;
                x5Var.scaleAnimator = null;
                runnable = x5Var.removedAction;
                if (runnable != null) {
                    runnable2 = x5Var.removedAction;
                    runnable2.run();
                    x5Var.removedAction = null;
                    break;
                }
                break;
            default:
                this.b.moveAnimator = null;
                break;
        }
    }
}
