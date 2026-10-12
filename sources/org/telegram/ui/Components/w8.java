package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class w8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h9 b;

    public /* synthetic */ w8(h9 h9Var, int i10) {
        this.a = i10;
        this.b = h9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.f = false;
                break;
            default:
                h9 h9Var = this.b;
                h9Var.i0(h9Var.F ? 1.0f : 0.0f, false);
                h9Var.F = false;
                break;
        }
    }
}
