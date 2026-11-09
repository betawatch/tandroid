package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class t30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p40 b;

    public /* synthetic */ t30(p40 p40Var, int i7) {
        this.a = i7;
        this.b = p40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p40 p40Var = this.b;
                if (animator.equals(p40Var.K)) {
                    p40Var.K = null;
                    break;
                }
                break;
            case 1:
                p40 p40Var2 = this.b;
                if (p40Var2.k1 != null) {
                    p40Var2.k1 = null;
                    break;
                }
                break;
            default:
                p40 p40Var3 = this.b;
                if (animator.equals(p40Var3.d0)) {
                    p40Var3.d(true);
                    p40Var3.f1 = false;
                    p40Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
