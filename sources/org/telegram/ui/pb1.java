package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class pb1 extends AnimatorListenerAdapter {
    public final /* synthetic */ kc1 a;

    public pb1(kc1 kc1Var) {
        this.a = kc1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kc1 kc1Var = this.a;
        kc1Var.J0[kc1Var.W0 != null ? (char) 0 : (char) 2].setVisibility(4);
    }
}
