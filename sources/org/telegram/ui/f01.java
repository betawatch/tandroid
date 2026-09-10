package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class f01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ f01(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ProfileActivity profileActivity = this.b;
                profileActivity.O1 = false;
                profileActivity.a.N0 = true;
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
                profileActivity2.O1 = false;
                profileActivity2.a.N0 = true;
                profileActivity2.j2.removeListener(this);
                profileActivity2.d1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.n0.setVisibility(0);
                profileActivity2.n0.setAlpha(1.0f);
                break;
            case 3:
                ProfileActivity profileActivity3 = this.b;
                profileActivity3.j2.removeListener(this);
                profileActivity3.n0.setVisibility(8);
                profileActivity3.n0.setAlpha(1.0f);
                break;
            default:
                ProfileActivity profileActivity4 = this.b;
                profileActivity4.w0 = null;
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
                profileActivity.n0.setAnimatedFileMaybe(profileActivity.e0.getImageReceiver().getAnimation());
                profileActivity.n0.L();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
