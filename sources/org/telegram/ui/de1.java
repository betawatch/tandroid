package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class de1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ he1 b;

    public /* synthetic */ de1(he1 he1Var, int i10) {
        this.a = i10;
        this.b = he1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                he1 he1Var = this.b;
                he1Var.v = 0;
                he1Var.n.setVisibility(8);
                break;
            case 1:
                this.b.v = 0;
                break;
            default:
                this.b.C.setVisibility(8);
                break;
        }
    }
}
