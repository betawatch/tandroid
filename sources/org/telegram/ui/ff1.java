package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ff1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wf1 c;

    public /* synthetic */ ff1(wf1 wf1Var, boolean z10, int i10) {
        this.a = i10;
        this.c = wf1Var;
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
                wf1 wf1Var = this.c;
                wf1Var.S0(f7);
                if (!z10) {
                    Activity parentActivity = wf1Var.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) wf1Var).classGuid;
                    AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                    wf1Var.r0.setVisibility(8);
                    wf1Var.Q0(true);
                    break;
                } else {
                    wf1Var.q0.setVisibility(8);
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
