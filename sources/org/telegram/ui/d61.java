package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class d61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f61 b;

    public /* synthetic */ d61(f61 f61Var, int i10) {
        this.a = i10;
        this.b = f61Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
            default:
                super.onAnimationEnd(animator);
                f61 f61Var = this.b;
                f61Var.K = 0.0f;
                f61Var.F = null;
                f61Var.J = false;
                f61Var.d(true, false);
                break;
        }
    }
}
