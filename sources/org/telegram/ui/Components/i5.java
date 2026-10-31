package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ i5(o5 o5Var, int i10) {
        this.a = i10;
        this.b = o5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.a) {
            case 0:
                this.b.scaleAnimator = null;
                boolean unused = o5.lockPositionChanging = false;
                break;
            case 1:
                o5 o5Var = this.b;
                o5Var.scaleAnimator = null;
                runnable = o5Var.removedAction;
                if (runnable != null) {
                    runnable2 = o5Var.removedAction;
                    runnable2.run();
                    o5Var.removedAction = null;
                    break;
                }
                break;
            default:
                this.b.moveAnimator = null;
                break;
        }
    }
}
