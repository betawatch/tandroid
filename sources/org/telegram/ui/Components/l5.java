package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class l5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5 b;

    public /* synthetic */ l5(r5 r5Var, int i7) {
        this.a = i7;
        this.b = r5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.a) {
            case 0:
                this.b.scaleAnimator = null;
                boolean unused = r5.lockPositionChanging = false;
                break;
            case 1:
                r5 r5Var = this.b;
                r5Var.scaleAnimator = null;
                runnable = r5Var.removedAction;
                if (runnable != null) {
                    runnable2 = r5Var.removedAction;
                    runnable2.run();
                    r5Var.removedAction = null;
                    break;
                }
                break;
            default:
                this.b.moveAnimator = null;
                break;
        }
    }
}
