package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class w30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y30 b;

    public /* synthetic */ w30(y30 y30Var, int i10) {
        this.a = i10;
        this.b = y30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                y30 y30Var = this.b;
                if (y30Var.V == animator) {
                    y30Var.V = null;
                    y30Var.b();
                    break;
                }
                break;
            default:
                y30 y30Var2 = this.b;
                if (y30Var2.U == animator) {
                    y30Var2.U = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                x30 x30Var = this.b.T;
                if (x30Var != null) {
                    ((org.telegram.ui.gs0) x30Var).a.b0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
