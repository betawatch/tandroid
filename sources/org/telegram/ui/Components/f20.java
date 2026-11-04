package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h20 b;

    public /* synthetic */ f20(h20 h20Var, int i3) {
        this.a = i3;
        this.b = h20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                h20 h20Var = this.b;
                if (h20Var.c0 == animator) {
                    h20Var.c0 = null;
                    h20Var.b();
                    break;
                }
                break;
            default:
                h20 h20Var2 = this.b;
                if (h20Var2.b0 == animator) {
                    h20Var2.b0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                g20 g20Var = this.b.a0;
                if (g20Var != null) {
                    ((org.telegram.ui.ko0) g20Var).a.f0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
