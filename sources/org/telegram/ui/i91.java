package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class i91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ y91 c;

    public /* synthetic */ i91(y91 y91Var, boolean z10, int i7) {
        this.a = i7;
        this.c = y91Var;
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
                y91 y91Var = this.c;
                y91Var.W0(f10);
                if (!z10) {
                    Activity parentActivity = y91Var.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.h2) y91Var).classGuid;
                    org.telegram.messenger.g0.k3(parentActivity, i7);
                    y91Var.s0.setVisibility(8);
                    y91Var.U0(true);
                    break;
                } else {
                    y91Var.r0.setVisibility(8);
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
