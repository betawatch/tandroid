package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class o61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q61 b;

    public /* synthetic */ o61(q61 q61Var, int i10) {
        this.a = i10;
        this.b = q61Var;
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
                q61 q61Var = this.b;
                q61Var.N = 0.0f;
                q61Var.I = null;
                q61Var.M = false;
                q61Var.d(true, false);
                break;
        }
    }
}
