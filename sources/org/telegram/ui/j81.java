package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n81 b;

    public /* synthetic */ j81(n81 n81Var, int i7) {
        this.a = i7;
        this.b = n81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                n81 n81Var = this.b;
                n81Var.w = 0;
                n81Var.n.setVisibility(8);
                break;
            case 1:
                this.b.w = 0;
                break;
            default:
                this.b.G.setVisibility(8);
                break;
        }
    }
}
