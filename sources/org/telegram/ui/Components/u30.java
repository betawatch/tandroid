package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class u30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w30 b;

    public /* synthetic */ u30(w30 w30Var, int i10) {
        this.a = i10;
        this.b = w30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w30 w30Var = this.b;
                if (w30Var.b0 == animator) {
                    w30Var.b0 = null;
                    w30Var.b();
                    break;
                }
                break;
            default:
                w30 w30Var2 = this.b;
                if (w30Var2.a0 == animator) {
                    w30Var2.a0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                v30 v30Var = this.b.W;
                if (v30Var != null) {
                    ((org.telegram.ui.ns0) v30Var).a.e0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
