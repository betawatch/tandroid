package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g40 b;

    public /* synthetic */ e40(g40 g40Var, int i10) {
        this.a = i10;
        this.b = g40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g40 g40Var = this.b;
                if (g40Var.b0 == animator) {
                    g40Var.b0 = null;
                    g40Var.b();
                    break;
                }
                break;
            default:
                g40 g40Var2 = this.b;
                if (g40Var2.a0 == animator) {
                    g40Var2.a0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                f40 f40Var = this.b.W;
                if (f40Var != null) {
                    ((org.telegram.ui.ks0) f40Var).a.e0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
