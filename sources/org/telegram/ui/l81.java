package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p81 b;

    public /* synthetic */ l81(p81 p81Var, int i7) {
        this.a = i7;
        this.b = p81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p81 p81Var = this.b;
                p81Var.w = 0;
                p81Var.n.setVisibility(8);
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
