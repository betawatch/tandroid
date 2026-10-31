package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e50 b;

    public /* synthetic */ k40(e50 e50Var, int i10) {
        this.a = i10;
        this.b = e50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e50 e50Var = this.b;
                if (animator.equals(e50Var.K)) {
                    e50Var.K = null;
                    break;
                }
                break;
            case 1:
                e50 e50Var2 = this.b;
                if (e50Var2.k1 != null) {
                    e50Var2.k1 = null;
                    break;
                }
                break;
            default:
                e50 e50Var3 = this.b;
                if (animator.equals(e50Var3.d0)) {
                    e50Var3.c(true);
                    e50Var3.f1 = false;
                    e50Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
