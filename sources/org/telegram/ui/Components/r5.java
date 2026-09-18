package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
