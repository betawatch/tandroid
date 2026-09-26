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
import org.telegram.ui.mi1;
import org.telegram.ui.qh1;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class al0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ al0(int i10, Object obj, Object obj2) {
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
                org.telegram.ui.w21 w21Var = (org.telegram.ui.w21) this.c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, w21Var.e[0], iArr[0]), i0.a.d(floatValue, w21Var.e[1], iArr[1]), i0.a.d(floatValue, w21Var.e[2], iArr[2]), i0.a.d(floatValue, w21Var.e[3], iArr[3])}, 0, w21Var.e, 0, 4);
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
                org.telegram.ui.wq wqVar = (org.telegram.ui.wq) obj2;
                ((bl0) wqVar.d).g.remove((AnimatorSet) obj);
                if (((bl0) wqVar.d).g.isEmpty()) {
                    ((bl0) wqVar.d).b.clear();
                    bl0 bl0Var = (bl0) wqVar.d;
                    bl0Var.d = true;
                    bl0Var.a.invalidate();
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
                nx0 nx0Var = (nx0) obj2;
                nx0Var.b = 0.0f;
                nx0Var.invalidate();
                ((um0) obj).invalidate();
                break;
            case 4:
                org.telegram.ui.Components.voip.l3 l3Var = (org.telegram.ui.Components.voip.l3) obj2;
                l3Var.d.setText((String) obj);
                l3Var.d.setTranslationY(0.0f);
                l3Var.d.setAlpha(1.0f);
                break;
            case 5:
                ((org.telegram.ui.Components.voip.l3) obj2).removeView((org.telegram.ui.Components.voip.k3) obj);
                break;
            case 6:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.qy) obj2).Q3 = null;
                break;
            case 7:
                org.telegram.ui.f80 f80Var = (org.telegram.ui.f80) obj2;
                f80Var.removeView((n30) obj);
                f80Var.e = null;
                f80Var.a = null;
                f80Var.b = false;
                break;
            case 8:
                fw0 fw0Var = (fw0) obj2;
                fw0Var.setVisibility(8);
                fw0Var.setX(0.0f);
                break;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                ef0 ef0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = ef0Var.e;
                ef0Var.f = bitmap != null;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = ef0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = ef0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                ef0Var.h = true;
                ef0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ef0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ef0Var, ef0Var.E, 0.0f, 1.0f));
                ef0Var.s.setDuration(250L);
                ef0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                ef0Var.s.addListener(new cf0(ef0Var, 0));
                ef0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.z2, photoViewer.d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(rr.g);
                photoViewer.A2.addListener(new org.telegram.ui.xo0(this, 2));
                photoViewer.A2.start();
                break;
            case 10:
                org.telegram.ui.ax0 ax0Var = (org.telegram.ui.ax0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = ax0Var.n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != ax0Var.e) {
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
                        org.telegram.ui.c01 c01Var = profileActivity.O;
                        if (c01Var.s0(c01Var.k0[0].F)) {
                            ((org.telegram.ui.ActionBar.u0) obj).setVisibility(0);
                        }
                        profileActivity.O.r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.xo0(this, 14));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                break;
            case 12:
                org.telegram.ui.w21 w21Var = (org.telegram.ui.w21) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, w21Var.e, 0, 4);
                }
                w21Var.n = null;
                w21Var.s = null;
                mc0 mc0Var = w21Var.h;
                mc0Var.K = 1.0f;
                mc0Var.i();
                w21Var.h.s(1.0f);
                break;
            case 13:
                org.telegram.ui.d41 d41Var = (org.telegram.ui.d41) obj2;
                if (d41Var.h != null) {
                    d41Var.h = null;
                    d41Var.n.unlock();
                    ((org.telegram.ui.rx) obj).onTransitionAnimationEnd(true, false);
                    d41Var.e = 1.0f;
                    d41Var.g();
                    d41Var.d(false);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.vu0 vu0Var = (org.telegram.ui.vu0) obj;
                if (vu0Var != null) {
                    vu0Var.a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.vz0(this, 11));
                break;
            case 15:
                ((org.telegram.ui.q61) obj).run();
                org.telegram.ui.a71 a71Var = (org.telegram.ui.a71) obj2;
                org.telegram.ui.p51 p51Var = a71Var.X0;
                if (p51Var != null) {
                    p51Var.dismiss();
                    a71Var.X0 = null;
                    break;
                }
                break;
            case 16:
                qh1 qh1Var = (qh1) obj2;
                qh1Var.removeView((n30) obj);
                qh1Var.e = null;
                qh1Var.a = null;
                qh1Var.b = false;
                UsersSelectActivity usersSelectActivity = qh1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.c.setHintVisible(true, true);
                    break;
                }
                break;
            case 17:
                ((Runnable) obj).run();
                mi1 mi1Var = (mi1) obj2;
                mi1Var.e0.setScaleX(1.15f);
                mi1Var.e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mi1Var.e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                mi1Var.e0.setVisibility(8);
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
                ci.ba baVar = (ci.ba) obj2;
                baVar.removeView((n30) obj);
                baVar.h.clear();
                baVar.b = null;
                baVar.c = false;
                ((xg.i) baVar.n).b.setAllowDrawCursor(true);
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

    public /* synthetic */ al0(Object obj, View view, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = view;
    }
}
