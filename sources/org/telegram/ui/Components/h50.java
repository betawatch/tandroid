package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class h50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e60 b;

    public /* synthetic */ h50(e60 e60Var, int i10) {
        this.a = i10;
        this.b = e60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e60 e60Var = this.b;
                if (animator.equals(e60Var.L)) {
                    e60Var.L = null;
                    break;
                }
                break;
            case 1:
                e60 e60Var2 = this.b;
                if (e60Var2.g1 != null) {
                    e60Var2.g1 = null;
                    break;
                }
                break;
            default:
                e60 e60Var3 = this.b;
                if (animator.equals(e60Var3.e0)) {
                    e60Var3.c(true);
                    e60Var3.b1 = false;
                    e60Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
