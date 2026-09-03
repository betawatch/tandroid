package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
