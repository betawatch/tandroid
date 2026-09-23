package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                    ((org.telegram.ui.os0) v30Var).a.e0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
