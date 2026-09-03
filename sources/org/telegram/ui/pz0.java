package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ pz0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ProfileActivity profileActivity = this.b;
                profileActivity.L1 = false;
                profileActivity.a.K0 = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.k4(true);
                break;
            case 1:
                ProfileActivity profileActivity = this.b;
                AnimatorSet animatorSet = profileActivity.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    profileActivity.w = null;
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity2 = this.b;
                profileActivity2.L1 = false;
                profileActivity2.a.K0 = true;
                profileActivity2.g2.removeListener(this);
                profileActivity2.a1.setBackgroundColor(-16777216);
                profileActivity2.V.setVisibility(8);
                profileActivity2.k0.setVisibility(0);
                profileActivity2.k0.setAlpha(1.0f);
                break;
            case 3:
                ProfileActivity profileActivity3 = this.b;
                profileActivity3.g2.removeListener(this);
                profileActivity3.k0.setVisibility(8);
                profileActivity3.k0.setAlpha(1.0f);
                break;
            default:
                ProfileActivity profileActivity4 = this.b;
                profileActivity4.t0 = null;
                profileActivity4.fragmentView.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                ProfileActivity profileActivity = this.b;
                ProfileActivity.s3(profileActivity, false);
                profileActivity.k0.setAnimatedFileMaybe(profileActivity.b0.getImageReceiver().getAnimation());
                profileActivity.k0.L();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
