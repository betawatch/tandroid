package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fe1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ we1 c;

    public /* synthetic */ fe1(we1 we1Var, boolean z10, int i10) {
        this.a = i10;
        this.c = we1Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                we1 we1Var = this.c;
                we1Var.S0(f10);
                if (!z10) {
                    Activity parentActivity = we1Var.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) we1Var).classGuid;
                    AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                    we1Var.n0.setVisibility(8);
                    we1Var.Q0(true);
                    break;
                } else {
                    we1Var.m0.setVisibility(8);
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
