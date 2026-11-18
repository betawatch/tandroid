package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class nv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ProfileActivity c;

    public /* synthetic */ nv0(ProfileActivity profileActivity, boolean z10, int i7) {
        this.a = i7;
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
        int i7;
        org.telegram.ui.Cells.b4 b4Var;
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.c;
                boolean z10 = this.b;
                ProfileActivity.y1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.h5 h5Var = profileActivity.U0;
                    if (h5Var.G.getWidth() != 0 && !h5Var.e.isFocused()) {
                        h5Var.e.requestFocus();
                        org.telegram.messenger.g0.I3(h5Var.e);
                    }
                }
                profileActivity.B4(true);
                profileActivity.W1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.Y4 = true;
                    profileActivity.W4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.h2) profileActivity).classGuid;
                    org.telegram.messenger.g0.Z2(parentActivity, i7);
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
