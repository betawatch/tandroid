package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class t30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v30 b;

    public /* synthetic */ t30(v30 v30Var, int i10) {
        this.a = i10;
        this.b = v30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v30 v30Var = this.b;
                if (v30Var.b0 == animator) {
                    v30Var.b0 = null;
                    v30Var.b();
                    break;
                }
                break;
            default:
                v30 v30Var2 = this.b;
                if (v30Var2.a0 == animator) {
                    v30Var2.a0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                u30 u30Var = this.b.W;
                if (u30Var != null) {
                    ((org.telegram.ui.us0) u30Var).a.e0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
