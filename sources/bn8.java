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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bn8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ bn8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 1:
                profileActivity.U5 = null;
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
        qw4 qw4Var;
        a aVar;
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                qw4Var = ((d) profileActivity).glassEngine;
                qw4Var.g();
                aVar = ((d) profileActivity).actionBar;
                aVar.G(profileActivity.q2 ? 1090519039 : profileActivity.n6 != null ? 553648127 : bkb.v0(bkb.e8, profileActivity.A0), false);
                xm8 xm8Var = profileActivity.f0;
                ImageReceiver imageReceiver = xm8Var.V;
                km m = imageReceiver.m();
                if (m != null) {
                    m.w(xm8Var);
                }
                imageReceiver.f();
                jl5 jl5Var = xm8Var.a0;
                if (jl5Var != null) {
                    jl5Var.a();
                    xm8Var.a0 = null;
                }
                xm8Var.W = 0.0f;
                xm8Var.invalidate();
                profileActivity.I0 = false;
                profileActivity.h4(false);
                break;
            case 1:
                if (profileActivity.U5 != null && !profileActivity.X5) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    profileActivity.V5 = animatorSet;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.p5, 1.0f));
                    profileActivity.V5.setDuration(100L);
                    profileActivity.V5.addListener(new l48(this, (byte) 21));
                    profileActivity.V5.start();
                }
                profileActivity.h4(false);
                profileActivity.U5 = null;
                break;
            case 2:
                super.onAnimationEnd(animator);
                RectF rectF = ProfileActivity.Z6;
                profileActivity.N2(true);
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
                RectF rectF = ProfileActivity.Z6;
                ProfileActivity profileActivity = this.b;
                profileActivity.s3(false);
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
