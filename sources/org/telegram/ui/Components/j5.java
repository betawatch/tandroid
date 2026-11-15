package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class j5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p5 b;

    public /* synthetic */ j5(p5 p5Var, int i7) {
        this.a = i7;
        this.b = p5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.a) {
            case 0:
                this.b.scaleAnimator = null;
                boolean unused = p5.lockPositionChanging = false;
                break;
            case 1:
                p5 p5Var = this.b;
                p5Var.scaleAnimator = null;
                runnable = p5Var.removedAction;
                if (runnable != null) {
                    runnable2 = p5Var.removedAction;
                    runnable2.run();
                    p5Var.removedAction = null;
                    break;
                }
                break;
            default:
                this.b.moveAnimator = null;
                break;
        }
    }
}
