package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l81 b;

    public /* synthetic */ h81(l81 l81Var, int i7) {
        this.a = i7;
        this.b = l81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l81 l81Var = this.b;
                l81Var.w = 0;
                l81Var.n.setVisibility(8);
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
