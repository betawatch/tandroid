package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b3 b;

    public /* synthetic */ a3(b3 b3Var, int i10) {
        this.a = i10;
        this.b = b3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b3 b3Var = this.b;
                Runnable runnable = b3Var.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == b3Var.e) {
                    b3Var.e = null;
                    break;
                }
                break;
            default:
                b3 b3Var2 = this.b;
                Runnable runnable2 = b3Var2.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == b3Var2.e) {
                    b3Var2.e = null;
                    break;
                }
                break;
        }
    }
}
