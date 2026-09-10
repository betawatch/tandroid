package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ s5(y5 y5Var, int i10) {
        this.a = i10;
        this.b = y5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.a) {
            case 0:
                this.b.scaleAnimator = null;
                boolean unused = y5.lockPositionChanging = false;
                break;
            case 1:
                y5 y5Var = this.b;
                y5Var.scaleAnimator = null;
                runnable = y5Var.removedAction;
                if (runnable != null) {
                    runnable2 = y5Var.removedAction;
                    runnable2.run();
                    y5Var.removedAction = null;
                    break;
                }
                break;
            default:
                this.b.moveAnimator = null;
                break;
        }
    }
}
