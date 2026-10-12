package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class s50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p60 b;

    public /* synthetic */ s50(p60 p60Var, int i10) {
        this.a = i10;
        this.b = p60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p60 p60Var = this.b;
                if (animator.equals(p60Var.L)) {
                    p60Var.L = null;
                    break;
                }
                break;
            case 1:
                p60 p60Var2 = this.b;
                if (p60Var2.l1 != null) {
                    p60Var2.l1 = null;
                    break;
                }
                break;
            default:
                p60 p60Var3 = this.b;
                if (animator.equals(p60Var3.e0)) {
                    p60Var3.c(true);
                    p60Var3.g1 = false;
                    p60Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
