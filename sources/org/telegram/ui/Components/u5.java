package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class u5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;

    public /* synthetic */ u5(a6 a6Var, int i10) {
        this.a = i10;
        this.b = a6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.a) {
            case 0:
                this.b.scaleAnimator = null;
                boolean unused = a6.lockPositionChanging = false;
                break;
            case 1:
                a6 a6Var = this.b;
                a6Var.scaleAnimator = null;
                runnable = a6Var.removedAction;
                if (runnable != null) {
                    runnable2 = a6Var.removedAction;
                    runnable2.run();
                    a6Var.removedAction = null;
                    break;
                }
                break;
            default:
                this.b.moveAnimator = null;
                break;
        }
    }
}
