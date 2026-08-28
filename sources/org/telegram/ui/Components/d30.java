package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f30 b;

    public /* synthetic */ d30(f30 f30Var, int i9) {
        this.a = i9;
        this.b = f30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f30 f30Var = this.b;
                if (f30Var.U == animator) {
                    f30Var.U = null;
                    f30Var.b();
                    break;
                }
                break;
            default:
                f30 f30Var2 = this.b;
                if (f30Var2.T == animator) {
                    f30Var2.T = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                e30 e30Var = this.b.S;
                if (e30Var != null) {
                    ((org.telegram.ui.sr0) e30Var).a.a0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
