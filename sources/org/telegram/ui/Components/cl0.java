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
import org.telegram.ui.ki1;
import org.telegram.ui.oh1;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class cl0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cl0(int i10, Object obj, Object obj2) {
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
                org.telegram.ui.y21 y21Var = (org.telegram.ui.y21) this.c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, y21Var.e[0], iArr[0]), i0.a.d(floatValue, y21Var.e[1], iArr[1]), i0.a.d(floatValue, y21Var.e[2], iArr[2]), i0.a.d(floatValue, y21Var.e[3], iArr[3])}, 0, y21Var.e, 0, 4);
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
                org.telegram.ui.yq yqVar = (org.telegram.ui.yq) obj2;
                ((dl0) yqVar.d).g.remove((AnimatorSet) obj);
                if (((dl0) yqVar.d).g.isEmpty()) {
                    ((dl0) yqVar.d).b.clear();
                    dl0 dl0Var = (dl0) yqVar.d;
                    dl0Var.d = true;
                    dl0Var.a.invalidate();
                    break;
                }
                break;
            case 1:
                pp0 pp0Var = (pp0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(pp0Var.B);
                } catch (Exception unused) {
                }
                vo0 vo0Var = pp0Var.C;
                if (vo0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(vo0Var);
                    break;
                }
                break;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                mw0 mw0Var = (mw0) gVar.c;
                mw0Var.f0 = 1.0f;
                mw0Var.S.add((iw0) obj);
                ((mw0) gVar.c).a0.setShader(null);
                ((mw0) gVar.c).c0.setShader(null);
                ((mw0) gVar.c).N();
                super.onAnimationEnd(animator);
                break;
            case 3:
                zx0 zx0Var = (zx0) obj2;
                zx0Var.b = 0.0f;
                zx0Var.invalidate();
                ((an0) obj).invalidate();
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
                ((org.telegram.ui.uy) obj2).Q3 = null;
                break;
            case 7:
                org.telegram.ui.j80 j80Var = (org.telegram.ui.j80) obj2;
                j80Var.removeView((q30) obj);
                j80Var.e = null;
                j80Var.a = null;
                j80Var.b = false;
                break;
            case 8:
                rw0 rw0Var = (rw0) obj2;
                rw0Var.setVisibility(8);
                rw0Var.setX(0.0f);
                break;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                gf0 gf0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = gf0Var.e;
                gf0Var.f = bitmap != null;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = gf0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = gf0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                gf0Var.h = true;
                gf0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                gf0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(gf0Var, gf0Var.E, 0.0f, 1.0f));
                gf0Var.s.setDuration(250L);
                gf0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                gf0Var.s.addListener(new ef0(gf0Var, 0));
                gf0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.z2, photoViewer.d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(tr.g);
                photoViewer.A2.addListener(new org.telegram.ui.ap0(this, 2));
                photoViewer.A2.start();
                break;
            case 10:
                org.telegram.ui.dx0 dx0Var = (org.telegram.ui.dx0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = dx0Var.n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != dx0Var.e) {
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
                        org.telegram.ui.e01 e01Var = profileActivity.O;
                        if (e01Var.s0(e01Var.k0[0].F)) {
                            ((org.telegram.ui.ActionBar.v0) obj).setVisibility(0);
                        }
                        profileActivity.O.r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.D5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.j5, 1.0f));
                        profileActivity.D5.setDuration(100L);
                        profileActivity.D5.addListener(new org.telegram.ui.ap0(this, 14));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                break;
            case 12:
                org.telegram.ui.y21 y21Var = (org.telegram.ui.y21) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, y21Var.e, 0, 4);
                }
                y21Var.n = null;
                y21Var.s = null;
                pc0 pc0Var = y21Var.h;
                pc0Var.K = 1.0f;
                pc0Var.i();
                y21Var.h.s(1.0f);
                break;
            case 13:
                org.telegram.ui.d41 d41Var = (org.telegram.ui.d41) obj2;
                if (d41Var.h != null) {
                    d41Var.h = null;
                    d41Var.n.unlock();
                    ((org.telegram.ui.tx) obj).onTransitionAnimationEnd(true, false);
                    d41Var.e = 1.0f;
                    d41Var.g();
                    d41Var.d(false);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.yu0 yu0Var = (org.telegram.ui.yu0) obj;
                if (yu0Var != null) {
                    yu0Var.a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.hz0(this, 12));
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
                oh1 oh1Var = (oh1) obj2;
                oh1Var.removeView((q30) obj);
                oh1Var.e = null;
                oh1Var.a = null;
                oh1Var.b = false;
                UsersSelectActivity usersSelectActivity = oh1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.c.setHintVisible(true, true);
                    break;
                }
                break;
            case 17:
                ((Runnable) obj).run();
                ki1 ki1Var = (ki1) obj2;
                ki1Var.e0.setScaleX(1.15f);
                ki1Var.e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ki1Var.e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ki1Var.e0.setVisibility(8);
                break;
            case 18:
                qg.a2 a2Var = (qg.a2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a2Var.r0.b(a2Var.y0, false);
                }
                a2Var.setRotationY(0.0f);
                a2Var.z0 = 1.0f;
                break;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                break;
            case 20:
                ((rg.y0) obj2).w = false;
                ((rg.o0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                break;
            case 21:
                rg.m1 m1Var = (rg.m1) obj2;
                m1Var.H0 = false;
                m1Var.G0 = 1.0f;
                m1Var.s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new ai.x(27, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                break;
            case 22:
                ci.aa aaVar = (ci.aa) obj2;
                aaVar.removeView((q30) obj);
                aaVar.h.clear();
                aaVar.b = null;
                aaVar.c = false;
                ((xg.i) aaVar.n).b.setAllowDrawCursor(true);
                break;
            default:
                yh.t8 t8Var = (yh.t8) obj2;
                t8Var.b.remove((yh.s8) obj);
                t8Var.a1();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 8:
                ((rw0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ cl0(Object obj, View view, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = view;
    }
}
