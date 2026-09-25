package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class x2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;

    public /* synthetic */ x2(y2 y2Var, int i10) {
        this.a = i10;
        this.b = y2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                y2 y2Var = this.b;
                Runnable runnable = y2Var.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == y2Var.e) {
                    y2Var.e = null;
                    break;
                }
                break;
            default:
                y2 y2Var2 = this.b;
                Runnable runnable2 = y2Var2.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == y2Var2.e) {
                    y2Var2.e = null;
                    break;
                }
                break;
        }
    }
}
