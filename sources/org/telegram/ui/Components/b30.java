package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d30 b;

    public /* synthetic */ b30(d30 d30Var, int i10) {
        this.a = i10;
        this.b = d30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d30 d30Var = this.b;
                if (d30Var.b0 == animator) {
                    d30Var.b0 = null;
                    d30Var.b();
                    break;
                }
                break;
            default:
                d30 d30Var2 = this.b;
                if (d30Var2.a0 == animator) {
                    d30Var2.a0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                c30 c30Var = this.b.W;
                if (c30Var != null) {
                    ((org.telegram.ui.bq0) c30Var).a.e0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
