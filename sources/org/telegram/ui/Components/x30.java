package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                if (z30Var.b0 == animator) {
                    z30Var.b0 = null;
                    z30Var.b();
                    break;
                }
                break;
            default:
                z30 z30Var2 = this.b;
                if (z30Var2.a0 == animator) {
                    z30Var2.a0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                y30 y30Var = this.b.W;
                if (y30Var != null) {
                    ((org.telegram.ui.qs0) y30Var).a.e0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
