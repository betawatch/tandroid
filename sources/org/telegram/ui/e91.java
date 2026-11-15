package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ u91 c;

    public /* synthetic */ e91(u91 u91Var, boolean z10, int i7) {
        this.a = i7;
        this.c = u91Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                u91 u91Var = this.c;
                u91Var.W0(f10);
                if (!z10) {
                    Activity parentActivity = u91Var.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.e2) u91Var).classGuid;
                    org.telegram.messenger.g0.l3(parentActivity, i7);
                    u91Var.s0.setVisibility(8);
                    u91Var.U0(true);
                    break;
                } else {
                    u91Var.r0.setVisibility(8);
                    break;
                }
            default:
                if (!this.b) {
                    this.c.p0.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
