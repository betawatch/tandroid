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
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ti1;
import org.telegram.ui.xh1;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class zk0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zk0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 11:
                ((ProfileActivity) this.c).C5 = null;
                break;
            case 12:
                org.telegram.ui.f31 f31Var = (org.telegram.ui.f31) this.c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, f31Var.e[0], iArr[0]), i0.a.d(floatValue, f31Var.e[1], iArr[1]), i0.a.d(floatValue, f31Var.e[2], iArr[2]), i0.a.d(floatValue, f31Var.e[3], iArr[3])}, 0, f31Var.e, 0, 4);
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
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.zq zqVar = (org.telegram.ui.zq) obj2;
                ((al0) zqVar.d).g.remove((AnimatorSet) obj);
                if (((al0) zqVar.d).g.isEmpty()) {
                    ((al0) zqVar.d).b.clear();
                    al0 al0Var = (al0) zqVar.d;
                    al0Var.d = true;
                    al0Var.a.invalidate();
                    break;
                }
                break;
            case 1:
                ip0 ip0Var = (ip0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(ip0Var.B);
                } catch (Exception unused) {
                }
                wn0 wn0Var = ip0Var.C;
                if (wn0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(wn0Var);
                    break;
                }
                break;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                aw0 aw0Var = (aw0) gVar.c;
                aw0Var.f0 = 1.0f;
                aw0Var.S.add((wv0) obj);
                ((aw0) gVar.c).a0.setShader(null);
                ((aw0) gVar.c).c0.setShader(null);
                ((aw0) gVar.c).N();
                super.onAnimationEnd(animator);
                break;
            case 3:
                ox0 ox0Var = (ox0) obj2;
                ox0Var.b = 0.0f;
                ox0Var.invalidate();
                ((um0) obj).invalidate();
                break;
            case 4:
                org.telegram.ui.Components.voip.k3 k3Var = (org.telegram.ui.Components.voip.k3) obj2;
                k3Var.d.setText((String) obj);
                k3Var.d.setTranslationY(0.0f);
                k3Var.d.setAlpha(1.0f);
                break;
            case 5:
                ((org.telegram.ui.Components.voip.k3) obj2).removeView((org.telegram.ui.Components.voip.j3) obj);
                break;
            case 6:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.uy) obj2).Q3 = null;
                break;
            case 7:
                org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) obj2;
                k80Var.removeView((m30) obj);
                k80Var.e = null;
                k80Var.a = null;
                k80Var.b = false;
                break;
            case 8:
                fw0 fw0Var = (fw0) obj2;
                fw0Var.setVisibility(8);
                fw0Var.setX(0.0f);
                break;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                cf0 cf0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = cf0Var.e;
                cf0Var.f = bitmap != null;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = cf0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = cf0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                cf0Var.h = true;
                cf0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                cf0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(cf0Var, cf0Var.E, 0.0f, 1.0f));
                cf0Var.s.setDuration(250L);
                cf0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                cf0Var.s.addListener(new af0(cf0Var, 0));
                cf0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.z2, photoViewer.d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(qr.g);
                photoViewer.A2.addListener(new org.telegram.ui.gp0(this, 2));
                photoViewer.A2.start();
                break;
            case 10:
                org.telegram.ui.jx0 jx0Var = (org.telegram.ui.jx0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = jx0Var.n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != jx0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                break;
            case 11:
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
                        org.telegram.ui.l01 l01Var = profileActivity.O;
                        if (l01Var.s0(l01Var.k0[0].F)) {
                            ((org.telegram.ui.ActionBar.v0) obj).setVisibility(0);
                        }
                        profileActivity.O.r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.gp0(this, 14));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                break;
            case 12:
                org.telegram.ui.f31 f31Var = (org.telegram.ui.f31) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, f31Var.e, 0, 4);
                }
                f31Var.n = null;
                f31Var.s = null;
                kc0 kc0Var = f31Var.h;
                kc0Var.K = 1.0f;
                kc0Var.i();
                f31Var.h.s(1.0f);
                break;
            case 13:
                org.telegram.ui.m41 m41Var = (org.telegram.ui.m41) obj2;
                if (m41Var.h != null) {
                    m41Var.h = null;
                    m41Var.n.unlock();
                    ((org.telegram.ui.vx) obj).onTransitionAnimationEnd(true, false);
                    m41Var.e = 1.0f;
                    m41Var.g();
                    m41Var.d(false);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.dv0 dv0Var = (org.telegram.ui.dv0) obj;
                if (dv0Var != null) {
                    dv0Var.a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.e01(this, 11));
                break;
            case 15:
                ((org.telegram.ui.z61) obj).run();
                org.telegram.ui.j71 j71Var = (org.telegram.ui.j71) obj2;
                org.telegram.ui.y51 y51Var = j71Var.X0;
                if (y51Var != null) {
                    y51Var.dismiss();
                    j71Var.X0 = null;
                    break;
                }
                break;
            case 16:
                xh1 xh1Var = (xh1) obj2;
                xh1Var.removeView((m30) obj);
                xh1Var.e = null;
                xh1Var.a = null;
                xh1Var.b = false;
                UsersSelectActivity usersSelectActivity = xh1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.c.setHintVisible(true, true);
                    break;
                }
                break;
            case 17:
                ((Runnable) obj).run();
                ti1 ti1Var = (ti1) obj2;
                ti1Var.e0.setScaleX(1.15f);
                ti1Var.e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ti1Var.e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ti1Var.e0.setVisibility(8);
                break;
            case 18:
                qg.b2 b2Var = (qg.b2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b2Var.r0.b(b2Var.y0, false);
                }
                b2Var.setRotationY(0.0f);
                b2Var.z0 = 1.0f;
                break;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                break;
            case 20:
                ((rg.x0) obj2).w = false;
                ((rg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                break;
            case 21:
                rg.k1 k1Var = (rg.k1) obj2;
                k1Var.H0 = false;
                k1Var.G0 = 1.0f;
                k1Var.s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new ai.x(27, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                break;
            case 22:
                ci.ea eaVar = (ci.ea) obj2;
                eaVar.removeView((m30) obj);
                eaVar.h.clear();
                eaVar.b = null;
                eaVar.c = false;
                ((xg.i) eaVar.n).b.setAllowDrawCursor(true);
                break;
            default:
                yh.q8 q8Var = (yh.q8) obj2;
                q8Var.b.remove((yh.p8) obj);
                q8Var.a1();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 8:
                ((fw0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ zk0(Object obj, View view, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = view;
    }
}
