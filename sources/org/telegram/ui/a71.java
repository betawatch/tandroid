package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class a71 extends AnimatorListenerAdapter {
    public final /* synthetic */ u71 a;

    public a71(u71 u71Var) {
        this.a = u71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        u71 u71Var = this.a;
        u71Var.K0[u71Var.X0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
