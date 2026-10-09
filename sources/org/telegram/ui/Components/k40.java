package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m40 b;

    public /* synthetic */ k40(m40 m40Var, int i10) {
        this.a = i10;
        this.b = m40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                m40 m40Var = this.b;
                if (m40Var.b0 == animator) {
                    m40Var.b0 = null;
                    m40Var.b();
                    break;
                }
                break;
            default:
                m40 m40Var2 = this.b;
                if (m40Var2.a0 == animator) {
                    m40Var2.a0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                l40 l40Var = this.b.W;
                if (l40Var != null) {
                    ((org.telegram.ui.vs0) l40Var).a.e0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
