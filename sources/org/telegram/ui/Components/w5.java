package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class w5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c6 b;

    public /* synthetic */ w5(c6 c6Var, int i10) {
        this.a = i10;
        this.b = c6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.a) {
            case 0:
                this.b.scaleAnimator = null;
                boolean unused = c6.lockPositionChanging = false;
                break;
            case 1:
                c6 c6Var = this.b;
                c6Var.scaleAnimator = null;
                runnable = c6Var.removedAction;
                if (runnable != null) {
                    runnable2 = c6Var.removedAction;
                    runnable2.run();
                    c6Var.removedAction = null;
                    break;
                }
                break;
            default:
                this.b.moveAnimator = null;
                break;
        }
    }
}
