package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class r5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5 b;

    public /* synthetic */ r5(x5 x5Var, int i7) {
        this.a = i7;
        this.b = x5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.a) {
            case 0:
                this.b.scaleAnimator = null;
                boolean unused = x5.lockPositionChanging = false;
                break;
            case 1:
                x5 x5Var = this.b;
                x5Var.scaleAnimator = null;
                runnable = x5Var.removedAction;
                if (runnable != null) {
                    runnable2 = x5Var.removedAction;
                    runnable2.run();
                    x5Var.removedAction = null;
                    break;
                }
                break;
            default:
                this.b.moveAnimator = null;
                break;
        }
    }
}
