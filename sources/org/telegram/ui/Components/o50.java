package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class o50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n60 b;

    public /* synthetic */ o50(n60 n60Var, int i10) {
        this.a = i10;
        this.b = n60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                n60 n60Var = this.b;
                if (animator.equals(n60Var.L)) {
                    n60Var.L = null;
                    break;
                }
                break;
            case 1:
                n60 n60Var2 = this.b;
                if (n60Var2.l1 != null) {
                    n60Var2.l1 = null;
                    break;
                }
                break;
            default:
                n60 n60Var3 = this.b;
                if (animator.equals(n60Var3.e0)) {
                    n60Var3.c(true);
                    n60Var3.g1 = false;
                    n60Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
