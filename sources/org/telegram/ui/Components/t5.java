package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class t5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ t5(z5 z5Var, int i10) {
        this.a = i10;
        this.b = z5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.a) {
            case 0:
                this.b.scaleAnimator = null;
                boolean unused = z5.lockPositionChanging = false;
                break;
            case 1:
                z5 z5Var = this.b;
                z5Var.scaleAnimator = null;
                runnable = z5Var.removedAction;
                if (runnable != null) {
                    runnable2 = z5Var.removedAction;
                    runnable2.run();
                    z5Var.removedAction = null;
                    break;
                }
                break;
            default:
                this.b.moveAnimator = null;
                break;
        }
    }
}
