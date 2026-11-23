package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class x20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z20 b;

    public /* synthetic */ x20(z20 z20Var, int i7) {
        this.a = i7;
        this.b = z20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z20 z20Var = this.b;
                if (z20Var.c0 == animator) {
                    z20Var.c0 = null;
                    z20Var.b();
                    break;
                }
                break;
            default:
                z20 z20Var2 = this.b;
                if (z20Var2.b0 == animator) {
                    z20Var2.b0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                y20 y20Var = this.b.a0;
                if (y20Var != null) {
                    ((org.telegram.ui.uo0) y20Var).a.f0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
