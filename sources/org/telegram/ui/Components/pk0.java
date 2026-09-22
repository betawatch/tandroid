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
import org.telegram.ui.ui1;
import org.telegram.ui.yh1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class pk0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pk0(int i10, Object obj, Object obj2) {
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
        int i11 = 1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.br brVar = (org.telegram.ui.br) obj2;
                ((qk0) brVar.d).g.remove((AnimatorSet) obj);
                if (((qk0) brVar.d).g.isEmpty()) {
                    ((qk0) brVar.d).b.clear();
                    qk0 qk0Var = (qk0) brVar.d;
                    qk0Var.d = true;
                    qk0Var.a.invalidate();
                    break;
                }
                break;
            case 1:
                vo0 vo0Var = (vo0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(vo0Var.B);
                } catch (Exception unused) {
                }
                ny nyVar = vo0Var.C;
                if (nyVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(nyVar);
                    break;
                }
                break;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                pv0 pv0Var = (pv0) gVar.c;
                pv0Var.f0 = 1.0f;
                pv0Var.S.add((lv0) obj);
                ((pv0) gVar.c).a0.setShader(null);
                ((pv0) gVar.c).c0.setShader(null);
                ((pv0) gVar.c).N();
                super.onAnimationEnd(animator);
                break;
            case 3:
                dx0 dx0Var = (dx0) obj2;
                dx0Var.b = 0.0f;
                dx0Var.invalidate();
                ((im0) obj).invalidate();
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
                uv0 uv0Var = (uv0) obj2;
                uv0Var.setVisibility(8);
                uv0Var.setX(0.0f);
                break;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                ue0 ue0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = ue0Var.e;
                ue0Var.f = bitmap != null;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = ue0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = ue0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                ue0Var.h = true;
                ue0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ue0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ue0Var, ue0Var.E, 0.0f, 1.0f));
                ue0Var.s.setDuration(250L);
                ue0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                ue0Var.s.addListener(new se0(ue0Var, 0));
                ue0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.z2, photoViewer.d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(qr.g);
                photoViewer.A2.addListener(new org.telegram.ui.cr0(this, i11));
                photoViewer.A2.start();
                break;
            case 10:
                org.telegram.ui.jx0 jx0Var = (org.telegram.ui.jx0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = jx0Var.n;
                ((View) obj).setVisibility(8);
                for (int i12 = 0; i12 < premiumPreviewFragment.U.getChildCount(); i12++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i12);
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
                        org.telegram.ui.m01 m01Var = profileActivity.O;
                        if (m01Var.s0(m01Var.k0[0].F)) {
                            ((org.telegram.ui.ActionBar.v0) obj).setVisibility(0);
                        }
                        profileActivity.O.r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.cr0(this, 13));
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
                cc0 cc0Var = f31Var.h;
                cc0Var.K = 1.0f;
                cc0Var.i();
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.f01(this, 11));
                break;
            case 15:
                ((org.telegram.ui.x61) obj).run();
                org.telegram.ui.h71 h71Var = (org.telegram.ui.h71) obj2;
                org.telegram.ui.w51 w51Var = h71Var.X0;
                if (w51Var != null) {
                    w51Var.dismiss();
                    h71Var.X0 = null;
                    break;
                }
                break;
            case 16:
                yh1 yh1Var = (yh1) obj2;
                yh1Var.removeView((m30) obj);
                yh1Var.e = null;
                yh1Var.a = null;
                yh1Var.b = false;
                UsersSelectActivity usersSelectActivity = yh1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.c.setHintVisible(true, true);
                    break;
                }
                break;
            case 17:
                ((Runnable) obj).run();
                ui1 ui1Var = (ui1) obj2;
                ui1Var.e0.setScaleX(1.15f);
                ui1Var.e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ui1Var.e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ui1Var.e0.setVisibility(8);
                break;
            case 18:
                qg.d2 d2Var = (qg.d2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    d2Var.r0.b(d2Var.y0, false);
                }
                d2Var.setRotationY(0.0f);
                d2Var.z0 = 1.0f;
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
                yh.r8 r8Var = (yh.r8) obj2;
                r8Var.b.remove((yh.q8) obj);
                r8Var.a1();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 8:
                ((uv0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ pk0(Object obj, View view, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = view;
    }
}
