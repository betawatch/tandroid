package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class y2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    public /* synthetic */ y2(z2 z2Var, int i7) {
        this.a = i7;
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
