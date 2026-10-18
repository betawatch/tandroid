package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ed1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ id1 b;

    public /* synthetic */ ed1(id1 id1Var, int i10) {
        this.a = i10;
        this.b = id1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                id1 id1Var = this.b;
                id1Var.v = 0;
                id1Var.n.setVisibility(8);
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
