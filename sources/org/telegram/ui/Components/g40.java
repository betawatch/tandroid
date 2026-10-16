package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class g40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i40 b;

    public /* synthetic */ g40(i40 i40Var, int i10) {
        this.a = i10;
        this.b = i40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i40 i40Var = this.b;
                if (i40Var.b0 == animator) {
                    i40Var.b0 = null;
                    i40Var.b();
                    break;
                }
                break;
            default:
                i40 i40Var2 = this.b;
                if (i40Var2.a0 == animator) {
                    i40Var2.a0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                h40 h40Var = this.b.W;
                if (h40Var != null) {
                    ((org.telegram.ui.bt0) h40Var).a.e0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
