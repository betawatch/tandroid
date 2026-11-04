package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q01 b;

    public /* synthetic */ o01(q01 q01Var, int i3) {
        this.a = i3;
        this.b = q01Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.J = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.J = null;
                break;
            default:
                super.onAnimationEnd(animator);
                q01 q01Var = this.b;
                q01Var.O = 0.0f;
                q01Var.J = null;
                q01Var.N = false;
                q01Var.d(true, false);
                break;
        }
    }
}
