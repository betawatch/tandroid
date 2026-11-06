package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class dv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ dv0(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.O5 = null;
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
        oi.q qVar;
        org.telegram.ui.ActionBar.k kVar;
        int i7 = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i7) {
            case 0:
                qVar = ((org.telegram.ui.ActionBar.f2) profileActivity).glassEngine;
                qVar.g();
                kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                kVar.C(profileActivity.o2 ? 1090519039 : profileActivity.g6 != null ? 553648127 : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f8, profileActivity.z0), false);
                zu0 zu0Var = profileActivity.e0;
                ImageReceiver imageReceiver = zu0Var.U;
                org.telegram.ui.Components.v5 m10 = imageReceiver.m();
                if (m10 != null) {
                    m10.w(zu0Var);
                }
                imageReceiver.f();
                org.telegram.messenger.jc jcVar = zu0Var.W;
                if (jcVar != null) {
                    jcVar.a();
                    zu0Var.W = null;
                }
                zu0Var.V = 0.0f;
                zu0Var.invalidate();
                profileActivity.H0 = false;
                profileActivity.L5(false);
                break;
            case 1:
                if (profileActivity.O5 != null && !profileActivity.R5) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    profileActivity.P5 = animatorSet;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.j5, 1.0f));
                    profileActivity.P5.setDuration(100L);
                    profileActivity.P5.addListener(new d30(this, 21));
                    profileActivity.P5.start();
                }
                profileActivity.L5(false);
                profileActivity.O5 = null;
                break;
            case 2:
                super.onAnimationEnd(animator);
                RectF rectF = ProfileActivity.S6;
                profileActivity.y4(true);
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
                ProfileActivity.G3(profileActivity, false);
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
