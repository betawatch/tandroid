// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cp8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ cp8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 1:
                profileActivity.Z5 = null;
                break;
            case 4:
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
        sy4 sy4Var;
        a aVar;
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                sy4Var = ((d) profileActivity).glassEngine;
                sy4Var.g();
                aVar = ((d) profileActivity).actionBar;
                aVar.G(profileActivity.q2 ? 1090519039 : profileActivity.s6 != null ? 553648127 : cmb.v0(cmb.e8, profileActivity.A0), false);
                yo8 yo8Var = profileActivity.f0;
                ImageReceiver imageReceiver = yo8Var.V;
                kn m = imageReceiver.m();
                if (m != null) {
                    m.w(yo8Var);
                }
                imageReceiver.f();
                jn5 jn5Var = yo8Var.a0;
                if (jn5Var != null) {
                    jn5Var.a();
                    yo8Var.a0 = null;
                }
                yo8Var.W = 0.0f;
                yo8Var.invalidate();
                profileActivity.I0 = false;
                profileActivity.l4(false);
                break;
            case 1:
                if (profileActivity.Z5 != null && !profileActivity.c6) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    profileActivity.a6 = animatorSet;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.u5, 1.0f));
                    profileActivity.a6.setDuration(100L);
                    profileActivity.a6.addListener(new s38(this, (byte) 23));
                    profileActivity.a6.start();
                }
                profileActivity.l4(false);
                profileActivity.Z5 = null;
                break;
            case 2:
                super.onAnimationEnd(animator);
                RectF rectF = ProfileActivity.e7;
                profileActivity.Q2(true);
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
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            case 4:
                RectF rectF = ProfileActivity.e7;
                ProfileActivity profileActivity = this.b;
                profileActivity.w3(false);
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
