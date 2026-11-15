package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ bv0(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.S5 = null;
                break;
            case 4:
                ProfileActivity profileActivity = this.b;
                profileActivity.O1 = false;
                profileActivity.a.P0 = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ri.q qVar;
        org.telegram.ui.ActionBar.k kVar;
        int i7 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i7) {
            case 0:
                qVar = ((org.telegram.ui.ActionBar.e2) profileActivity).glassEngine;
                qVar.g();
                kVar = ((org.telegram.ui.ActionBar.e2) profileActivity).actionBar;
                kVar.F(profileActivity.q2 ? 1090519039 : profileActivity.l6 != null ? 553648127 : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f8, profileActivity.A0), false);
                xu0 xu0Var = profileActivity.f0;
                ImageReceiver imageReceiver = xu0Var.V;
                org.telegram.ui.Components.t5 m10 = imageReceiver.m();
                if (m10 != null) {
                    m10.w(xu0Var);
                }
                imageReceiver.f();
                org.telegram.messenger.ic icVar = xu0Var.a0;
                if (icVar != null) {
                    icVar.a();
                    xu0Var.a0 = null;
                }
                xu0Var.W = 0.0f;
                xu0Var.invalidate();
                profileActivity.I0 = false;
                profileActivity.O5(false);
                break;
            case 1:
                if (profileActivity.S5 != null && !profileActivity.V5) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    profileActivity.T5 = animatorSet;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.n5, 1.0f));
                    profileActivity.T5.setDuration(100L);
                    profileActivity.T5.addListener(new xx(this, 22));
                    profileActivity.T5.start();
                }
                profileActivity.O5(false);
                profileActivity.S5 = null;
                break;
            case 2:
                super.onAnimationEnd(animator);
                RectF rectF = ProfileActivity.X6;
                profileActivity.A4(true);
                break;
            case 3:
                AnimatorSet animatorSet2 = profileActivity.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    profileActivity.w = null;
                    break;
                }
                break;
            case 4:
                profileActivity.O1 = false;
                profileActivity.a.P0 = true;
                profileActivity.k2.removeListener(this);
                profileActivity.d1.setBackgroundColor(-16777216);
                profileActivity.Y.setVisibility(8);
                profileActivity.o0.setVisibility(0);
                profileActivity.o0.setAlpha(1.0f);
                break;
            case 5:
                profileActivity.k2.removeListener(this);
                profileActivity.o0.setVisibility(8);
                profileActivity.o0.setAlpha(1.0f);
                break;
            default:
                profileActivity.x0 = null;
                profileActivity.fragmentView.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            case 4:
                ProfileActivity profileActivity = this.b;
                ProfileActivity.F3(profileActivity, false);
                profileActivity.o0.setAnimatedFileMaybe(profileActivity.f0.getImageReceiver().m());
                profileActivity.o0.L();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
