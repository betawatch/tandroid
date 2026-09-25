package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
