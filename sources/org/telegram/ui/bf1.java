package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bf1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ sf1 c;

    public /* synthetic */ bf1(sf1 sf1Var, boolean z4, int i10) {
        this.a = i10;
        this.c = sf1Var;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z4 = this.b;
                float f10 = z4 ? 1.0f : 0.0f;
                sf1 sf1Var = this.c;
                sf1Var.S0(f10);
                if (!z4) {
                    Activity parentActivity = sf1Var.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.p2) sf1Var).classGuid;
                    AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                    sf1Var.o0.setVisibility(8);
                    sf1Var.Q0(true);
                    break;
                } else {
                    sf1Var.n0.setVisibility(8);
                    break;
                }
            default:
                if (!this.b) {
                    this.c.l0.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
