package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class le1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ cf1 c;

    public /* synthetic */ le1(cf1 cf1Var, boolean z10, int i10) {
        this.a = i10;
        this.c = cf1Var;
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
                cf1 cf1Var = this.c;
                cf1Var.S0(f7);
                if (!z10) {
                    Activity parentActivity = cf1Var.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.r2) cf1Var).classGuid;
                    AndroidUtilities.setAdjustResizeToNothing(parentActivity, i10);
                    cf1Var.r0.setVisibility(8);
                    cf1Var.Q0(true);
                    break;
                } else {
                    cf1Var.q0.setVisibility(8);
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
