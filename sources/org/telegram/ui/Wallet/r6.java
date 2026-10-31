package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.bi;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r6 extends AnimatorListenerAdapter {
    public final /* synthetic */ bi a;
    public final /* synthetic */ a7 b;
    public final /* synthetic */ s6 c;

    public r6(s6 s6Var, bi biVar, a7 a7Var) {
        this.c = s6Var;
        this.a = biVar;
        this.b = a7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c.a(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a != null) {
            org.telegram.messenger.i0.v1(this.b);
        }
    }
}
