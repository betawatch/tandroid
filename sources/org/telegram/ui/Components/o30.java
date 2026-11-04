package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k40 b;

    public /* synthetic */ o30(k40 k40Var, int i3) {
        this.a = i3;
        this.b = k40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k40 k40Var = this.b;
                if (animator.equals(k40Var.L)) {
                    k40Var.L = null;
                    break;
                }
                break;
            case 1:
                k40 k40Var2 = this.b;
                if (k40Var2.l1 != null) {
                    k40Var2.l1 = null;
                    break;
                }
                break;
            default:
                k40 k40Var3 = this.b;
                if (animator.equals(k40Var3.e0)) {
                    k40Var3.c(true);
                    k40Var3.g1 = false;
                    k40Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
