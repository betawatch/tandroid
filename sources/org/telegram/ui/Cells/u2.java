package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ u2(v2 v2Var, int i10) {
        this.a = i10;
        this.b = v2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v2 v2Var = this.b;
                Runnable runnable = v2Var.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == v2Var.e) {
                    v2Var.e = null;
                    break;
                }
                break;
            default:
                v2 v2Var2 = this.b;
                Runnable runnable2 = v2Var2.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == v2Var2.e) {
                    v2Var2.e = null;
                    break;
                }
                break;
        }
    }
}
