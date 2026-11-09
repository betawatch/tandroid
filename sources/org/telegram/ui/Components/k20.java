package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m20 b;

    public /* synthetic */ k20(m20 m20Var, int i7) {
        this.a = i7;
        this.b = m20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                m20 m20Var = this.b;
                if (m20Var.b0 == animator) {
                    m20Var.b0 = null;
                    m20Var.b();
                    break;
                }
                break;
            default:
                m20 m20Var2 = this.b;
                if (m20Var2.a0 == animator) {
                    m20Var2.a0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                l20 l20Var = this.b.W;
                if (l20Var != null) {
                    ((org.telegram.ui.vo0) l20Var).a.e0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
