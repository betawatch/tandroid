package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ nw0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.N5 = null;
                break;
            case 4:
                ProfileActivity profileActivity = this.b;
                profileActivity.N1 = false;
                profileActivity.a.O0 = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ei.r rVar;
        org.telegram.ui.ActionBar.l lVar;
        int i10 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                rVar = ((org.telegram.ui.ActionBar.k2) profileActivity).glassEngine;
                rVar.g();
                lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                lVar.C(profileActivity.o2 ? 1090519039 : profileActivity.f6 != null ? 553648127 : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f8, profileActivity.z0), false);
                jw0 jw0Var = profileActivity.e0;
                ImageReceiver imageReceiver = jw0Var.U;
                org.telegram.ui.Components.s5 m10 = imageReceiver.m();
                if (m10 != null) {
                    m10.w(jw0Var);
                }
                imageReceiver.f();
                org.telegram.messenger.kc kcVar = jw0Var.W;
                if (kcVar != null) {
                    kcVar.a();
                    jw0Var.W = null;
                }
                jw0Var.V = 0.0f;
                jw0Var.invalidate();
                profileActivity.H0 = false;
                profileActivity.K5(false);
                break;
            case 1:
                if (profileActivity.N5 != null && !profileActivity.Q5) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    profileActivity.O5 = animatorSet;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.j5, 1.0f));
                    profileActivity.O5.setDuration(100L);
                    profileActivity.O5.addListener(new ns0(this, 2));
                    profileActivity.O5.start();
                }
                profileActivity.K5(false);
                profileActivity.N5 = null;
                break;
            case 2:
                super.onAnimationEnd(animator);
                RectF rectF = ProfileActivity.R6;
                profileActivity.x4(true);
                break;
            case 3:
                AnimatorSet animatorSet2 = profileActivity.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    profileActivity.w = null;
                    break;
                }
                break;
            case 4:
                profileActivity.N1 = false;
                profileActivity.a.O0 = true;
                profileActivity.i2.removeListener(this);
                profileActivity.c1.setBackgroundColor(-16777216);
                profileActivity.X.setVisibility(8);
                profileActivity.n0.setVisibility(0);
                profileActivity.n0.setAlpha(1.0f);
                break;
            case 5:
                profileActivity.i2.removeListener(this);
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
            case 0:
                break;
            case 4:
                ProfileActivity profileActivity = this.b;
                ProfileActivity.F3(profileActivity, false);
                profileActivity.n0.setAnimatedFileMaybe(profileActivity.e0.getImageReceiver().m());
                profileActivity.n0.L();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
