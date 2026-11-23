package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ w91 c;

    public /* synthetic */ g91(w91 w91Var, boolean z10, int i7) {
        this.a = i7;
        this.c = w91Var;
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
                w91 w91Var = this.c;
                w91Var.W0(f10);
                if (!z10) {
                    Activity parentActivity = w91Var.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.g2) w91Var).classGuid;
                    org.telegram.messenger.g0.k3(parentActivity, i7);
                    w91Var.s0.setVisibility(8);
                    w91Var.U0(true);
                    break;
                } else {
                    w91Var.r0.setVisibility(8);
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
