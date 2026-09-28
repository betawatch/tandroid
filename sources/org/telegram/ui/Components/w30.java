package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
                if (y30Var.b0 == animator) {
                    y30Var.b0 = null;
                    y30Var.b();
                    break;
                }
                break;
            default:
                y30 y30Var2 = this.b;
                if (y30Var2.a0 == animator) {
                    y30Var2.a0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                x30 x30Var = this.b.W;
                if (x30Var != null) {
                    ((org.telegram.ui.ns0) x30Var).a.e0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
