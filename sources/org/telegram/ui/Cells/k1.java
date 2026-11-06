package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class k1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q1 b;

    public /* synthetic */ k1(q1 q1Var, int i7) {
        this.a = i7;
        this.b = q1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q1 q1Var = this.b;
                q1Var.P5.M0 = true;
                q1Var.invalidate();
                break;
            default:
                this.b.setSelectedBackgroundProgress(0.0f);
                break;
        }
    }
}
