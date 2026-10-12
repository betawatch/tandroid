package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class g50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n60 b;

    public /* synthetic */ g50(n60 n60Var, int i10) {
        this.a = i10;
        this.b = n60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                n60 n60Var = this.b;
                n60Var.V.setVisibility(4);
                n60Var.W.setVisibility(4);
                n60Var.U.setVisibility(4);
                break;
            case 1:
                this.b.h0 = null;
                break;
            default:
                n60 n60Var2 = this.b;
                n60Var2.h1 = null;
                n60Var2.g1.setColor(n60Var2.T1 == 3 ? -1163700 : -12761513);
                n60Var2.f1.invalidate();
                break;
        }
    }
}
