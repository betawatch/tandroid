package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t30 b;

    public /* synthetic */ r30(t30 t30Var, int i10) {
        this.a = i10;
        this.b = t30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t30 t30Var = this.b;
                if (t30Var.U == animator) {
                    t30Var.U = null;
                    t30Var.b();
                    break;
                }
                break;
            default:
                t30 t30Var2 = this.b;
                if (t30Var2.T == animator) {
                    t30Var2.T = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                s30 s30Var = this.b.S;
                if (s30Var != null) {
                    ((org.telegram.ui.rr0) s30Var).a.a0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
