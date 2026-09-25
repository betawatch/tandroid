package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class p2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ p2(q2 q2Var, int i10) {
        this.a = i10;
        this.b = q2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.setVisibility(8);
                break;
            default:
                this.b.c.setVisibility(8);
                break;
        }
    }
}
