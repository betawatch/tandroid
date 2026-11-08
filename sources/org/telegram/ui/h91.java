package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ w91 c;

    public /* synthetic */ h91(w91 w91Var, boolean z9, int i7) {
        this.a = i7;
        this.c = w91Var;
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
                w91 w91Var = this.c;
                w91Var.W0(f10);
                if (!z9) {
                    Activity parentActivity = w91Var.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.f2) w91Var).classGuid;
                    org.telegram.messenger.g0.l3(parentActivity, i7);
                    w91Var.r0.setVisibility(8);
                    w91Var.U0(true);
                    break;
                } else {
                    w91Var.q0.setVisibility(8);
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
