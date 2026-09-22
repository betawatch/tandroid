package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class pe1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ te1 b;

    public /* synthetic */ pe1(te1 te1Var, int i10) {
        this.a = i10;
        this.b = te1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                te1 te1Var = this.b;
                te1Var.v = 0;
                te1Var.n.setVisibility(8);
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
