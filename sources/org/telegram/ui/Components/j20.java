package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class j20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l20 b;

    public /* synthetic */ j20(l20 l20Var, int i7) {
        this.a = i7;
        this.b = l20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l20 l20Var = this.b;
                if (l20Var.b0 == animator) {
                    l20Var.b0 = null;
                    l20Var.b();
                    break;
                }
                break;
            default:
                l20 l20Var2 = this.b;
                if (l20Var2.a0 == animator) {
                    l20Var2.a0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                k20 k20Var = this.b.W;
                if (k20Var != null) {
                    ((org.telegram.ui.to0) k20Var).a.e0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
