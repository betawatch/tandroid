package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class v30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x30 b;

    public /* synthetic */ v30(x30 x30Var, int i10) {
        this.a = i10;
        this.b = x30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x30 x30Var = this.b;
                if (x30Var.V == animator) {
                    x30Var.V = null;
                    x30Var.b();
                    break;
                }
                break;
            default:
                x30 x30Var2 = this.b;
                if (x30Var2.U == animator) {
                    x30Var2.U = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                w30 w30Var = this.b.T;
                if (w30Var != null) {
                    ((org.telegram.ui.zr0) w30Var).a.b0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
