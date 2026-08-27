package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ n5(t5 t5Var, int i10) {
        this.a = i10;
        this.b = t5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.a) {
            case 0:
                this.b.scaleAnimator = null;
                boolean unused = t5.lockPositionChanging = false;
                break;
            case 1:
                t5 t5Var = this.b;
                t5Var.scaleAnimator = null;
                runnable = t5Var.removedAction;
                if (runnable != null) {
                    runnable2 = t5Var.removedAction;
                    runnable2.run();
                    t5Var.removedAction = null;
                    break;
                }
                break;
            default:
                this.b.moveAnimator = null;
                break;
        }
    }
}
