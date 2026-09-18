package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r61 b;

    public /* synthetic */ p61(r61 r61Var, int i10) {
        this.a = i10;
        this.b = r61Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            default:
                super.onAnimationEnd(animator);
                r61 r61Var = this.b;
                r61Var.N = 0.0f;
                r61Var.I = null;
                r61Var.M = false;
                r61Var.d(true, false);
                break;
        }
    }
}
