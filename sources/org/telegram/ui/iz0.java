package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class iz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ iz0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ProfileActivity profileActivity = this.b;
                profileActivity.P1 = false;
                profileActivity.a.O0 = true;
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
                this.b.m4(true);
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
                profileActivity2.P1 = false;
                profileActivity2.a.O0 = true;
                profileActivity2.k2.removeListener(this);
                profileActivity2.e1.setBackgroundColor(-16777216);
                profileActivity2.Y.setVisibility(8);
                profileActivity2.o0.setVisibility(0);
                profileActivity2.o0.setAlpha(1.0f);
                break;
            case 3:
                ProfileActivity profileActivity3 = this.b;
                profileActivity3.k2.removeListener(this);
                profileActivity3.o0.setVisibility(8);
                profileActivity3.o0.setAlpha(1.0f);
                break;
            default:
                ProfileActivity profileActivity4 = this.b;
                profileActivity4.x0 = null;
                profileActivity4.fragmentView.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                ProfileActivity profileActivity = this.b;
                ProfileActivity.t3(profileActivity, false);
                profileActivity.o0.setAnimatedFileMaybe(profileActivity.f0.getImageReceiver().getAnimation());
                profileActivity.o0.L();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
