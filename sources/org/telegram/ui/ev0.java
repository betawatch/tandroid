package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ev0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ProfileActivity c;

    public /* synthetic */ ev0(ProfileActivity profileActivity, boolean z10, int i3) {
        this.a = i3;
        this.c = profileActivity;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.g0 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i3;
        org.telegram.ui.Cells.b4 b4Var;
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.c;
                boolean z10 = this.b;
                ProfileActivity.y1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.f5 f5Var = profileActivity.U0;
                    if (f5Var.G.getWidth() != 0 && !f5Var.e.isFocused()) {
                        f5Var.e.requestFocus();
                        org.telegram.messenger.g0.K3(f5Var.e);
                    }
                }
                profileActivity.y4(true);
                profileActivity.V1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.V4 = true;
                    profileActivity.T4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i3 = ((org.telegram.ui.ActionBar.d2) profileActivity).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity, i3);
                    profileActivity.P.setPreventMoving(false);
                    break;
                }
                break;
            default:
                ProfileActivity profileActivity2 = this.c;
                if (profileActivity2.g0 != null && (b4Var = profileActivity2.h0) != null) {
                    if (!this.b) {
                        b4Var.setVisibility(4);
                    }
                    profileActivity2.g0 = null;
                    break;
                }
                break;
        }
    }
}
