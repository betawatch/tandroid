package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class y70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z70 b;

    public /* synthetic */ y70(z70 z70Var, int i10) {
        this.a = i10;
        this.b = z70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z70 z70Var = this.b;
                z70Var.e.d0 = null;
                z70Var.requestLayout();
                break;
            default:
                z70 z70Var2 = this.b;
                z70Var2.e.d0 = null;
                z70Var2.a = false;
                break;
        }
    }
}
