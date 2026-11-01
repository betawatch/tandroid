package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class o21 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q21 b;

    public /* synthetic */ o21(q21 q21Var, int i10) {
        this.a = i10;
        this.b = q21Var;
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
                q21 q21Var = this.b;
                q21Var.N = 0.0f;
                q21Var.I = null;
                q21Var.M = false;
                q21Var.d(true, false);
                break;
        }
    }
}
