package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class i91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ y91 c;

    public /* synthetic */ i91(y91 y91Var, boolean z9, int i7) {
        this.a = i7;
        this.c = y91Var;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                boolean z9 = this.b;
                float f10 = z9 ? 1.0f : 0.0f;
                y91 y91Var = this.c;
                y91Var.W0(f10);
                if (!z9) {
                    Activity parentActivity = y91Var.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.f2) y91Var).classGuid;
                    org.telegram.messenger.g0.l3(parentActivity, i7);
                    y91Var.r0.setVisibility(8);
                    y91Var.U0(true);
                    break;
                } else {
                    y91Var.q0.setVisibility(8);
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
