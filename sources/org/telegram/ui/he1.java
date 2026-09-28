package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class he1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ le1 b;

    public /* synthetic */ he1(le1 le1Var, int i10) {
        this.a = i10;
        this.b = le1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                le1 le1Var = this.b;
                le1Var.v = 0;
                le1Var.n.setVisibility(8);
                break;
            case 1:
                this.b.v = 0;
                break;
            default:
                this.b.F.setVisibility(8);
                break;
        }
    }
}
