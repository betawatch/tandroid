package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class nv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ProfileActivity c;

    public /* synthetic */ nv0(ProfileActivity profileActivity, boolean z9, int i7) {
        this.a = i7;
        this.c = profileActivity;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.f0 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7;
        org.telegram.ui.Cells.b4 b4Var;
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.c;
                boolean z9 = this.b;
                ProfileActivity.y1(profileActivity, z9);
                profileActivity.X.setClickable(true);
                if (z9) {
                    org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
                    if (f5Var.F.getWidth() != 0 && !f5Var.e.isFocused()) {
                        f5Var.e.requestFocus();
                        org.telegram.messenger.g0.K3(f5Var.e);
                    }
                }
                profileActivity.y4(true);
                profileActivity.U1 = null;
                profileActivity.fragmentView.invalidate();
                if (z9) {
                    profileActivity.U4 = true;
                    profileActivity.T4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.f2) profileActivity).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity, i7);
                    profileActivity.O.setPreventMoving(false);
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity2 = this.c;
                if (profileActivity2.f0 != null && (b4Var = profileActivity2.g0) != null) {
                    if (!this.b) {
                        b4Var.setVisibility(4);
                    }
                    profileActivity2.f0 = null;
                    break;
                }
                break;
        }
    }
}
