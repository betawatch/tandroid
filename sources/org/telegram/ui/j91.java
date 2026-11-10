package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ z91 c;

    public /* synthetic */ j91(z91 z91Var, boolean z9, int i7) {
        this.a = i7;
        this.c = z91Var;
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
                z91 z91Var = this.c;
                z91Var.W0(f10);
                if (!z9) {
                    Activity parentActivity = z91Var.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.f2) z91Var).classGuid;
                    org.telegram.messenger.g0.l3(parentActivity, i7);
                    z91Var.r0.setVisibility(8);
                    z91Var.U0(true);
                    break;
                } else {
                    z91Var.q0.setVisibility(8);
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
