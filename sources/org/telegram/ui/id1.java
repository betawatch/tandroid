package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class id1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ md1 b;

    public /* synthetic */ id1(md1 md1Var, int i10) {
        this.a = i10;
        this.b = md1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                md1 md1Var = this.b;
                md1Var.v = 0;
                md1Var.n.setVisibility(8);
                break;
            case 1:
                this.b.v = 0;
                break;
            default:
                this.b.B.setVisibility(8);
                break;
        }
    }
}
