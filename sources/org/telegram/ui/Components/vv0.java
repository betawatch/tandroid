package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.di1;
import org.telegram.ui.zi1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vv0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vv0(int i10, View view, Object obj) {
        this.a = i10;
        this.b = obj;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((ProfileActivity) this.c).C5 = null;
                break;
            case 10:
                org.telegram.ui.k31 k31Var = (org.telegram.ui.k31) this.c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, k31Var.e[0], iArr[0]), i0.a.d(floatValue, k31Var.e[1], iArr[1]), i0.a.d(floatValue, k31Var.e[2], iArr[2]), i0.a.d(floatValue, k31Var.e[3], iArr[3])}, 0, k31Var.e, 0, 4);
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        int i11 = 25;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                aw0 aw0Var = (aw0) gVar.c;
                aw0Var.f0 = 1.0f;
                aw0Var.S.add((wv0) obj);
                ((aw0) gVar.c).a0.setShader(null);
                ((aw0) gVar.c).c0.setShader(null);
                ((aw0) gVar.c).N();
                super.onAnimationEnd(animator);
                break;
            case 1:
                ox0 ox0Var = (ox0) obj2;
                ox0Var.b = 0.0f;
                ox0Var.invalidate();
                ((sm0) obj).invalidate();
                break;
            case 2:
                org.telegram.ui.Components.voip.k3 k3Var = (org.telegram.ui.Components.voip.k3) obj2;
                k3Var.d.setText((String) obj);
                k3Var.d.setTranslationY(0.0f);
                k3Var.d.setAlpha(1.0f);
                break;
            case 3:
                ((org.telegram.ui.Components.voip.k3) obj2).removeView((org.telegram.ui.Components.voip.j3) obj);
                break;
            case 4:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.wy) obj2).R3 = null;
                break;
            case 5:
                org.telegram.ui.j80 j80Var = (org.telegram.ui.j80) obj2;
                j80Var.removeView((w30) obj);
                j80Var.e = null;
                j80Var.a = null;
                j80Var.b = false;
                break;
            case 6:
                fw0 fw0Var = (fw0) obj2;
                fw0Var.setVisibility(8);
                fw0Var.setX(0.0f);
                break;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                df0 df0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = df0Var.e;
                df0Var.f = bitmap != null;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = df0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = df0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                df0Var.h = true;
                df0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                df0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(df0Var, df0Var.E, 0.0f, 1.0f));
                df0Var.s.setDuration(250L);
                df0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                df0Var.s.addListener(new bf0(df0Var, 0));
                df0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.z2, photoViewer.d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(wr.g);
                photoViewer.A2.addListener(new org.telegram.ui.Components.voip.v2(this, 21));
                photoViewer.A2.start();
                break;
            case 8:
                org.telegram.ui.lx0 lx0Var = (org.telegram.ui.lx0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = lx0Var.n;
                ((View) obj).setVisibility(8);
                for (int i12 = 0; i12 < premiumPreviewFragment.U.getChildCount(); i12++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i12);
                    if (childAt != lx0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                break;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (profileActivity.C5 != null) {
                    if (profileActivity.F5) {
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
                        org.telegram.ui.r01 r01Var = profileActivity.O;
                        if (r01Var.s0(r01Var.k0[0].F)) {
                            ((org.telegram.ui.ActionBar.w0) obj).setVisibility(0);
                        }
                        profileActivity.O.r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.mv0(this, 3));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                break;
            case 10:
                org.telegram.ui.k31 k31Var = (org.telegram.ui.k31) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, k31Var.e, 0, 4);
                }
                k31Var.n = null;
                k31Var.s = null;
                lc0 lc0Var = k31Var.h;
                lc0Var.K = 1.0f;
                lc0Var.i();
                k31Var.h.s(1.0f);
                break;
            case 11:
                org.telegram.ui.r41 r41Var = (org.telegram.ui.r41) obj2;
                if (r41Var.h != null) {
                    r41Var.h = null;
                    r41Var.n.unlock();
                    ((org.telegram.ui.xx) obj).onTransitionAnimationEnd(true, false);
                    r41Var.e = 1.0f;
                    r41Var.g();
                    r41Var.d(false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.ev0 ev0Var = (org.telegram.ui.ev0) obj;
                if (ev0Var != null) {
                    ev0Var.a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.k01(this, 11));
                break;
            case 13:
                ((org.telegram.ui.b71) obj).run();
                org.telegram.ui.l71 l71Var = (org.telegram.ui.l71) obj2;
                org.telegram.ui.a61 a61Var = l71Var.X0;
                if (a61Var != null) {
                    a61Var.dismiss();
                    l71Var.X0 = null;
                    break;
                }
                break;
            case 14:
                di1 di1Var = (di1) obj2;
                di1Var.removeView((w30) obj);
                di1Var.e = null;
                di1Var.a = null;
                di1Var.b = false;
                UsersSelectActivity usersSelectActivity = di1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.c.setHintVisible(true, true);
                    break;
                }
                break;
            case 15:
                ((Runnable) obj).run();
                zi1 zi1Var = (zi1) obj2;
                zi1Var.e0.setScaleX(1.15f);
                zi1Var.e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zi1Var.e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                zi1Var.e0.setVisibility(8);
                break;
            case 16:
                pg.a2 a2Var = (pg.a2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a2Var.r0.b(a2Var.y0, false);
                }
                a2Var.setRotationY(0.0f);
                a2Var.z0 = 1.0f;
                break;
            case 17:
                ((qg.a1) obj2).w = false;
                ((qg.p0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                break;
            case 18:
                qg.m1 m1Var = (qg.m1) obj2;
                m1Var.H0 = false;
                m1Var.G0 = 1.0f;
                m1Var.s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new gg.t1(i11, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                break;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                break;
            case 20:
                bi.nb nbVar = (bi.nb) obj2;
                nbVar.removeView((w30) obj);
                nbVar.h.clear();
                nbVar.b = null;
                nbVar.c = false;
                ((wg.h) nbVar.n).b.setAllowDrawCursor(true);
                break;
            case 21:
                xh.t8 t8Var = (xh.t8) obj2;
                t8Var.b.remove((xh.s8) obj);
                t8Var.a1();
                break;
            case 22:
                super.onAnimationEnd(animator);
                ((zh.k) obj2).b0.j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                break;
            default:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i13 = ProfileStoriesView.s0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new xh.x(profileStoriesView, i11), 180L);
                    }
                }
                profileStoriesView.W = 1.0f;
                profileStoriesView.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 6:
                ((fw0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ vv0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }
}
