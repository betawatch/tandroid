package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class of1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fg1 c;

    public /* synthetic */ of1(fg1 fg1Var, boolean z10, int i10) {
        this.a = i10;
        this.c = fg1Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.b;
                float f7 = z10 ? 1.0f : 0.0f;
                fg1 fg1Var = this.c;
                fg1Var.S0(f7);
                if (!z10) {
                    Activity parentActivity = fg1Var.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.o2) fg1Var).classGuid;
                    AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                    fg1Var.r0.setVisibility(8);
                    fg1Var.Q0(true);
                    break;
                } else {
                    fg1Var.q0.setVisibility(8);
                    break;
                }
            default:
                if (!this.b) {
                    this.c.o0.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
