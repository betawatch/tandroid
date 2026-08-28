package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ee1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ we1 c;

    public /* synthetic */ ee1(we1 we1Var, boolean z10, int i9) {
        this.a = i9;
        this.c = we1Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i9;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                we1 we1Var = this.c;
                we1Var.S0(f10);
                if (!z10) {
                    Activity parentActivity = we1Var.getParentActivity();
                    i9 = ((org.telegram.ui.ActionBar.o2) we1Var).classGuid;
                    AndroidUtilities.setAdjustResizeToNothing(parentActivity, i9);
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
