package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q5 b;

    public /* synthetic */ k5(q5 q5Var, int i7) {
        this.a = i7;
        this.b = q5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.a) {
            case 0:
                this.b.scaleAnimator = null;
                boolean unused = q5.lockPositionChanging = false;
                break;
            case 1:
                q5 q5Var = this.b;
                q5Var.scaleAnimator = null;
                runnable = q5Var.removedAction;
                if (runnable != null) {
                    runnable2 = q5Var.removedAction;
                    runnable2.run();
                    q5Var.removedAction = null;
                    break;
                }
                break;
            default:
                this.b.moveAnimator = null;
                break;
        }
    }
}
