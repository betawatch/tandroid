package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class e50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w50 b;

    public /* synthetic */ e50(w50 w50Var, int i10) {
        this.a = i10;
        this.b = w50Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w50 w50Var = this.b;
                if (animator.equals(w50Var.G)) {
                    w50Var.G = null;
                    break;
                }
                break;
            case 1:
                w50 w50Var2 = this.b;
                if (w50Var2.b1 != null) {
                    w50Var2.b1 = null;
                    break;
                }
                break;
            default:
                w50 w50Var3 = this.b;
                if (animator.equals(w50Var3.W)) {
                    w50Var3.h(true);
                    w50Var3.W0 = false;
                    w50Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
