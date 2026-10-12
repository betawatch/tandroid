package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class g3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i3 b;

    public /* synthetic */ g3(i3 i3Var, int i10) {
        this.a = i10;
        this.b = i3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i3 i3Var = this.b;
                i3Var.r = 0;
                i3Var.invalidate();
                break;
            default:
                i3 i3Var2 = this.b;
                i3Var2.s = 0;
                i3Var2.invalidate();
                break;
        }
    }
}
