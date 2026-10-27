package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class oz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ oz0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.I5 = null;
                break;
            case 3:
                ProfileActivity profileActivity = this.b;
                profileActivity.O1 = false;
                profileActivity.a.O0 = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                if (profileActivity.I5 != null) {
                    if (profileActivity.L5) {
                        if (profileActivity.L0) {
                            profileActivity.Q0.setVisibility(8);
                        }
                        if (profileActivity.M0) {
                            profileActivity.R0.setVisibility(8);
                        }
                        if (profileActivity.N0) {
                            profileActivity.S0.setVisibility(8);
                        }
                        profileActivity.T0.setVisibility(8);
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        profileActivity.J5 = animatorSet;
                        animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.p5, 1.0f));
                        profileActivity.J5.setDuration(100L);
                        profileActivity.J5.addListener(new k50(this, 22));
                        profileActivity.J5.start();
                    }
                }
                profileActivity.x5(false);
                profileActivity.I5 = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                int i11 = ProfileActivity.R6;
                profileActivity.r4(true);
                break;
            case 2:
                AnimatorSet animatorSet2 = profileActivity.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    profileActivity.v = null;
                    break;
                }
                break;
            case 3:
                profileActivity.O1 = false;
                profileActivity.a.O0 = true;
                profileActivity.j2.removeListener(this);
                profileActivity.d1.setBackgroundColor(-16777216);
                profileActivity.X.setVisibility(8);
                profileActivity.n0.setVisibility(0);
                profileActivity.n0.setAlpha(1.0f);
                break;
            case 4:
                profileActivity.j2.removeListener(this);
                profileActivity.n0.setVisibility(8);
                profileActivity.n0.setAlpha(1.0f);
                break;
            default:
                profileActivity.w0 = null;
                profileActivity.fragmentView.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 3:
                ProfileActivity profileActivity = this.b;
                ProfileActivity.z3(profileActivity, false);
                profileActivity.n0.setAnimatedFileMaybe(profileActivity.e0.getImageReceiver().getAnimation());
                profileActivity.n0.L();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
