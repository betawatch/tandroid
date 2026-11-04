package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ y2(z2 z2Var, int i3) {
        this.a = i3;
        this.b = z2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z2 z2Var = this.b;
                Runnable runnable = z2Var.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == z2Var.e) {
                    z2Var.e = null;
                    break;
                }
                break;
            default:
                z2 z2Var2 = this.b;
                Runnable runnable2 = z2Var2.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == z2Var2.e) {
                    z2Var2.e = null;
                    break;
                }
                break;
        }
    }
}
