package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class g91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ v91 c;

    public /* synthetic */ g91(v91 v91Var, boolean z9, int i7) {
        this.a = i7;
        this.c = v91Var;
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
                v91 v91Var = this.c;
                v91Var.W0(f10);
                if (!z9) {
                    Activity parentActivity = v91Var.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.f2) v91Var).classGuid;
                    org.telegram.messenger.g0.l3(parentActivity, i7);
                    v91Var.r0.setVisibility(8);
                    v91Var.U0(true);
                    break;
                } else {
                    v91Var.q0.setVisibility(8);
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
