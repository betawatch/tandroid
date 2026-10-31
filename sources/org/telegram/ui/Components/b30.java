package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d30 b;

    public /* synthetic */ b30(d30 d30Var, int i10) {
        this.a = i10;
        this.b = d30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d30 d30Var = this.b;
                if (d30Var.b0 == animator) {
                    d30Var.b0 = null;
                    d30Var.b();
                    break;
                }
                break;
            default:
                d30 d30Var2 = this.b;
                if (d30Var2.a0 == animator) {
                    d30Var2.a0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                c30 c30Var = this.b.W;
                if (c30Var != null) {
                    ((org.telegram.ui.dq0) c30Var).a.e0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
