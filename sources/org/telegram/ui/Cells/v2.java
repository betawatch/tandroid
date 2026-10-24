package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class v2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ v2(w2 w2Var, int i10) {
        this.a = i10;
        this.b = w2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w2 w2Var = this.b;
                Runnable runnable = w2Var.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == w2Var.e) {
                    w2Var.e = null;
                    break;
                }
                break;
            default:
                w2 w2Var2 = this.b;
                Runnable runnable2 = w2Var2.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == w2Var2.e) {
                    w2Var2.e = null;
                    break;
                }
                break;
        }
    }
}
