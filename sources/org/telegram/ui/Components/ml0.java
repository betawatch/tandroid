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
import org.telegram.ui.jh1;
import org.telegram.ui.ng1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ml0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ml0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 12:
                ((ProfileActivity) this.c).E5 = null;
                break;
            case 18:
                ((r0.m0) this.b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                b10 b10Var = (b10) obj;
                b10Var.setAlpha(1.0f);
                s4.n0.x0(b10Var);
                nl0 nl0Var = (nl0) obj2;
                nl0Var.c.remove(b10Var);
                nl0Var.a.removeView(b10Var);
                break;
            case 1:
                super.onAnimationEnd(animator);
                org.telegram.ui.qq qqVar = (org.telegram.ui.qq) obj2;
                ((nl0) qqVar.d).g.remove((AnimatorSet) obj);
                if (((nl0) qqVar.d).g.isEmpty()) {
                    ((nl0) qqVar.d).b.clear();
                    nl0 nl0Var2 = (nl0) qqVar.d;
                    nl0Var2.d = true;
                    nl0Var2.a.invalidate();
                    break;
                }
                break;
            case 2:
                rp0 rp0Var = (rp0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(rp0Var.B);
                } catch (Exception unused) {
                }
                go0 go0Var = rp0Var.C;
                if (go0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(go0Var);
                    break;
                }
                break;
            case 3:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                jw0 jw0Var = (jw0) gVar.c;
                jw0Var.f0 = 1.0f;
                jw0Var.S.add((fw0) obj);
                ((jw0) gVar.c).a0.setShader(null);
                ((jw0) gVar.c).c0.setShader(null);
                ((jw0) gVar.c).N();
                super.onAnimationEnd(animator);
                break;
            case 4:
                wx0 wx0Var = (wx0) obj2;
                wx0Var.b = 0.0f;
                wx0Var.invalidate();
                ((gn0) obj).invalidate();
                break;
            case 5:
                org.telegram.ui.Components.voip.i3 i3Var = (org.telegram.ui.Components.voip.i3) obj2;
                i3Var.d.setText((String) obj);
                i3Var.d.setTranslationY(0.0f);
                i3Var.d.setAlpha(1.0f);
                break;
            case 6:
                ((org.telegram.ui.Components.voip.i3) obj2).removeView((org.telegram.ui.Components.voip.h3) obj);
                break;
            case 7:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.ey) obj2).R3 = null;
                break;
            case 8:
                org.telegram.ui.s70 s70Var = (org.telegram.ui.s70) obj2;
                s70Var.removeView((v30) obj);
                s70Var.e = null;
                s70Var.a = null;
                s70Var.b = false;
                break;
            case 9:
                ow0 ow0Var = (ow0) obj2;
                ow0Var.setVisibility(8);
                ow0Var.setX(0.0f);
                break;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                nf0 nf0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = nf0Var.e;
                nf0Var.f = bitmap != null;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = nf0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = nf0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                nf0Var.h = true;
                nf0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                nf0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(nf0Var, nf0Var.E, 0.0f, 1.0f));
                nf0Var.s.setDuration(250L);
                nf0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                nf0Var.s.addListener(new lf0(nf0Var, 0));
                nf0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.z2, photoViewer.d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(bs.g);
                photoViewer.A2.addListener(new org.telegram.ui.bc0(this, 7));
                photoViewer.A2.start();
                break;
            case 11:
                org.telegram.ui.pw0 pw0Var = (org.telegram.ui.pw0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = pw0Var.n;
                ((View) obj).setVisibility(8);
                while (i11 < premiumPreviewFragment.U.getChildCount()) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != pw0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                    i11++;
                }
                break;
            case 12:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (profileActivity.E5 != null) {
                    if (profileActivity.H5) {
                        if (profileActivity.M0) {
                            profileActivity.R0.setVisibility(8);
                        }
                        if (profileActivity.N0) {
                            profileActivity.S0.setVisibility(8);
                        }
                        if (profileActivity.O0) {
                            profileActivity.T0.setVisibility(8);
                        }
                        profileActivity.U0.setVisibility(8);
                    } else {
                        org.telegram.ui.pz0 pz0Var = profileActivity.O;
                        if (pz0Var.u0(pz0Var.k0[0].F)) {
                            ((org.telegram.ui.ActionBar.u0) obj).setVisibility(0);
                        }
                        profileActivity.O.r0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.F5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.l5, 1.0f));
                        profileActivity.F5.setDuration(100L);
                        profileActivity.F5.addListener(new org.telegram.ui.bc0(this, 19));
                        profileActivity.F5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.E5 = null;
                break;
            case 13:
                org.telegram.ui.z21 z21Var = (org.telegram.ui.z21) obj2;
                if (z21Var.h != null) {
                    z21Var.h = null;
                    z21Var.n.unlock();
                    ((org.telegram.ui.fx) obj).onTransitionAnimationEnd(true, false);
                    z21Var.e = 1.0f;
                    z21Var.g();
                    z21Var.d(false);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.lu0 lu0Var = (org.telegram.ui.lu0) obj;
                if (lu0Var != null) {
                    lu0Var.a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.sy0(this, 12));
                break;
            case 15:
                ((org.telegram.ui.p51) obj).run();
                org.telegram.ui.z51 z51Var = (org.telegram.ui.z51) obj2;
                org.telegram.ui.o41 o41Var = z51Var.X0;
                if (o41Var != null) {
                    o41Var.dismiss();
                    z51Var.X0 = null;
                    break;
                }
                break;
            case 16:
                ng1 ng1Var = (ng1) obj2;
                ng1Var.removeView((v30) obj);
                ng1Var.e = null;
                ng1Var.a = null;
                ng1Var.b = false;
                UsersSelectActivity usersSelectActivity = ng1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.c.setHintVisible(true, true);
                    break;
                }
                break;
            case 17:
                ((Runnable) obj).run();
                jh1 jh1Var = (jh1) obj2;
                jh1Var.e0.setScaleX(1.15f);
                jh1Var.e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jh1Var.e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                jh1Var.e0.setVisibility(8);
                break;
            case 18:
                ((r0.m0) obj).c();
                break;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                break;
            case 20:
                rg.a2 a2Var = (rg.a2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a2Var.r0.b(a2Var.y0, false);
                }
                a2Var.setRotationY(0.0f);
                a2Var.z0 = 1.0f;
                break;
            case 21:
                ((sg.x0) obj2).w = false;
                ((sg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                break;
            case 22:
                sg.l1 l1Var = (sg.l1) obj2;
                l1Var.H0 = false;
                l1Var.G0 = 1.0f;
                l1Var.s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new sg.h1(i11, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                break;
            default:
                ei.n9 n9Var = (ei.n9) obj2;
                n9Var.removeView((v30) obj);
                n9Var.h.clear();
                n9Var.b = null;
                n9Var.c = false;
                ((yg.h) n9Var.n).b.setAllowDrawCursor(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 9:
                ((ow0) this.b).setVisibility(0);
                break;
            case 18:
                ((r0.m0) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ ml0(Object obj, View view, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = view;
    }

    public ml0(nl0 nl0Var, b10 b10Var, s4.n0 n0Var) {
        this.a = 0;
        this.c = nl0Var;
        this.b = b10Var;
    }
}
