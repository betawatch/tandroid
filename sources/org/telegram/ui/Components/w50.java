package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class w50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t60 b;

    public /* synthetic */ w50(t60 t60Var, int i10) {
        this.a = i10;
        this.b = t60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t60 t60Var = this.b;
                if (animator.equals(t60Var.L)) {
                    t60Var.L = null;
                    break;
                }
                break;
            case 1:
                t60 t60Var2 = this.b;
                if (t60Var2.l1 != null) {
                    t60Var2.l1 = null;
                    break;
                }
                break;
            default:
                t60 t60Var3 = this.b;
                if (animator.equals(t60Var3.e0)) {
                    t60Var3.c(true);
                    t60Var3.g1 = false;
                    t60Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
