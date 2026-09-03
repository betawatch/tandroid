package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class x30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z30 b;

    public /* synthetic */ x30(z30 z30Var, int i10) {
        this.a = i10;
        this.b = z30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z30 z30Var = this.b;
                if (z30Var.V == animator) {
                    z30Var.V = null;
                    z30Var.b();
                    break;
                }
                break;
            default:
                z30 z30Var2 = this.b;
                if (z30Var2.U == animator) {
                    z30Var2.U = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                y30 y30Var = this.b.T;
                if (y30Var != null) {
                    ((org.telegram.ui.gs0) y30Var).a.b0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
