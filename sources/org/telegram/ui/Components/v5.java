package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class v5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    public /* synthetic */ v5(b6 b6Var, int i10) {
        this.a = i10;
        this.b = b6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.a) {
            case 0:
                this.b.scaleAnimator = null;
                boolean unused = b6.lockPositionChanging = false;
                break;
            case 1:
                b6 b6Var = this.b;
                b6Var.scaleAnimator = null;
                runnable = b6Var.removedAction;
                if (runnable != null) {
                    runnable2 = b6Var.removedAction;
                    runnable2.run();
                    b6Var.removedAction = null;
                    break;
                }
                break;
            default:
                this.b.moveAnimator = null;
                break;
        }
    }
}
