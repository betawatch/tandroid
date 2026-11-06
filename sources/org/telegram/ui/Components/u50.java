package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class u50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w50 b;

    public /* synthetic */ u50(w50 w50Var, int i7) {
        this.a = i7;
        this.b = w50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w50 w50Var = this.b;
                w50Var.e.U1 = null;
                w50Var.requestLayout();
                break;
            default:
                w50 w50Var2 = this.b;
                w50Var2.e.U1 = null;
                w50Var2.a = false;
                break;
        }
    }
}
