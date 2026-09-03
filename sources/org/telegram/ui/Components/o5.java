package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5 b;

    public /* synthetic */ o5(u5 u5Var, int i10) {
        this.a = i10;
        this.b = u5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.a) {
            case 0:
                this.b.scaleAnimator = null;
                boolean unused = u5.lockPositionChanging = false;
                break;
            case 1:
                u5 u5Var = this.b;
                u5Var.scaleAnimator = null;
                runnable = u5Var.removedAction;
                if (runnable != null) {
                    runnable2 = u5Var.removedAction;
                    runnable2.run();
                    u5Var.removedAction = null;
                    break;
                }
                break;
            default:
                this.b.moveAnimator = null;
                break;
        }
    }
}
