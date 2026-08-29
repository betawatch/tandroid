package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class he1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ze1 c;

    public /* synthetic */ he1(ze1 ze1Var, boolean z10, int i10) {
        this.a = i10;
        this.c = ze1Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.b;
                float f9 = z10 ? 1.0f : 0.0f;
                ze1 ze1Var = this.c;
                ze1Var.S0(f9);
                if (!z10) {
                    Activity parentActivity = ze1Var.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.o2) ze1Var).classGuid;
                    AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                    ze1Var.n0.setVisibility(8);
                    ze1Var.Q0(true);
                    break;
                } else {
                    ze1Var.m0.setVisibility(8);
                    break;
                }
            default:
                if (!this.b) {
                    this.c.k0.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
