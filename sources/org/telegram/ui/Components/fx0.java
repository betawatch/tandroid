package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ci1;
import org.telegram.ui.gh1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fx0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fx0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 8:
                ((ProfileActivity) this.c).z5 = null;
                break;
            case 9:
                org.telegram.ui.o21 o21Var = (org.telegram.ui.o21) this.c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, o21Var.e[0], iArr[0]), i0.a.d(floatValue, o21Var.e[1], iArr[1]), i0.a.d(floatValue, o21Var.e[2], iArr[2]), i0.a.d(floatValue, o21Var.e[3], iArr[3])}, 0, o21Var.e, 0, 4);
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
        int i11 = 12;
        int i12 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                gx0 gx0Var = (gx0) obj2;
                gx0Var.b = 0.0f;
                gx0Var.invalidate();
                ((qm0) obj).invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.l3 l3Var = (org.telegram.ui.Components.voip.l3) obj2;
                l3Var.d.setText((String) obj);
                l3Var.d.setTranslationY(0.0f);
                l3Var.d.setAlpha(1.0f);
                break;
            case 2:
                ((org.telegram.ui.Components.voip.l3) obj2).removeView((org.telegram.ui.Components.voip.k3) obj);
                break;
            case 3:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.py) obj2).O3 = null;
                break;
            case 4:
                org.telegram.ui.c80 c80Var = (org.telegram.ui.c80) obj2;
                c80Var.removeView((p30) obj);
                c80Var.e = null;
                c80Var.a = null;
                c80Var.b = false;
                break;
            case 5:
                wv0 wv0Var = (wv0) obj2;
                wv0Var.setVisibility(8);
                wv0Var.setX(0.0f);
                break;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                af0 af0Var = photoViewer.z1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = af0Var.e;
                af0Var.f = bitmap != null;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = af0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = af0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                af0Var.h = true;
                af0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                af0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(af0Var, af0Var.B, 0.0f, 1.0f));
                af0Var.s.setDuration(250L);
                af0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                af0Var.s.addListener(new ye0(af0Var, 0));
                af0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.x2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.w2, photoViewer.a4, 0.0f));
                photoViewer.x2.setDuration(85L);
                photoViewer.x2.setInterpolator(pr.g);
                photoViewer.x2.addListener(new org.telegram.ui.ns0(this, i12));
                photoViewer.x2.start();
                break;
            case 7:
                org.telegram.ui.qw0 qw0Var = (org.telegram.ui.qw0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = qw0Var.n;
                ((View) obj).setVisibility(8);
                while (i12 < premiumPreviewFragment.R.getChildCount()) {
                    View childAt = premiumPreviewFragment.R.getChildAt(i12);
                    if (childAt != qw0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                    i12++;
                }
                break;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (profileActivity.z5 != null) {
                    if (profileActivity.C5) {
                        if (profileActivity.I0) {
                            profileActivity.N0.setVisibility(8);
                        }
                        if (profileActivity.J0) {
                            profileActivity.O0.setVisibility(8);
                        }
                        if (profileActivity.K0) {
                            profileActivity.P0.setVisibility(8);
                        }
                        profileActivity.Q0.setVisibility(8);
                    } else {
                        org.telegram.ui.uz0 uz0Var = profileActivity.L;
                        if (uz0Var.s0(uz0Var.h0[0].C)) {
                            ((org.telegram.ui.ActionBar.w0) obj).setVisibility(0);
                        }
                        profileActivity.L.o0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.A5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.g5, 1.0f));
                        profileActivity.A5.setDuration(100L);
                        profileActivity.A5.addListener(new org.telegram.ui.ns0(this, i11));
                        profileActivity.A5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.z5 = null;
                break;
            case 9:
                org.telegram.ui.o21 o21Var = (org.telegram.ui.o21) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, o21Var.e, 0, 4);
                }
                o21Var.n = null;
                o21Var.s = null;
                fc0 fc0Var = o21Var.h;
                fc0Var.K = 1.0f;
                fc0Var.i();
                o21Var.h.s(1.0f);
                break;
            case 10:
                org.telegram.ui.v31 v31Var = (org.telegram.ui.v31) obj2;
                if (v31Var.h != null) {
                    v31Var.h = null;
                    v31Var.n.unlock();
                    ((org.telegram.ui.rx) obj).onTransitionAnimationEnd(true, false);
                    v31Var.e = 1.0f;
                    v31Var.g();
                    v31Var.d(false);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.lu0 lu0Var = (org.telegram.ui.lu0) obj;
                if (lu0Var != null) {
                    lu0Var.a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.xy0(this, i11));
                break;
            case 12:
                ((org.telegram.ui.h61) obj).run();
                org.telegram.ui.r61 r61Var = (org.telegram.ui.r61) obj2;
                org.telegram.ui.g51 g51Var = r61Var.U0;
                if (g51Var != null) {
                    g51Var.dismiss();
                    r61Var.U0 = null;
                    break;
                }
                break;
            case 13:
                gh1 gh1Var = (gh1) obj2;
                gh1Var.removeView((p30) obj);
                gh1Var.e = null;
                gh1Var.a = null;
                gh1Var.b = false;
                UsersSelectActivity usersSelectActivity = gh1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.L.isEmpty()) {
                    usersSelectActivity.c.setHintVisible(true, true);
                    break;
                }
                break;
            case 14:
                ((Runnable) obj).run();
                ci1 ci1Var = (ci1) obj2;
                ci1Var.b0.setScaleX(1.15f);
                ci1Var.b0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ci1Var.b0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ci1Var.b0.setVisibility(8);
                break;
            case 15:
                View view2 = (View) obj;
                if (view2 != null) {
                    view2.setVisibility(4);
                }
                ((qh.k2) obj2).h.h.setVisibility(8);
                break;
            case 16:
                qh.d3 d3Var = (qh.d3) obj2;
                d3Var.c = null;
                d3Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 17:
                qh.n nVar = (qh.n) obj2;
                ((eg.z2) obj).setDraw(true);
                if (nVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) nVar.getParent()).removeView(nVar);
                    break;
                }
                break;
            case 18:
                lg.j jVar = (lg.j) obj2;
                jVar.removeView((p30) obj);
                jVar.h.clear();
                jVar.b = null;
                jVar.c = false;
                qh.a8 a8Var = (qh.a8) jVar.n;
                a8Var.a.setAllowDrawCursor(true);
                qh.p7 p7Var = a8Var.f;
                if (p7Var != null) {
                    p7Var.run();
                }
                if (a8Var.H) {
                    a8Var.fullScroll(130);
                    a8Var.H = false;
                    break;
                }
                break;
            case 19:
                r0.w0 w0Var = (r0.w0) obj;
                w0Var.a.d(1.0f);
                r0.r0.e((View) obj2, w0Var);
                break;
            case 20:
                wf.g gVar = (wf.g) obj2;
                gVar.b.clear();
                gVar.b.add((yf.d) obj);
                break;
            case 21:
                super.onAnimationEnd(animator);
                wf.g gVar2 = (wf.g) obj2;
                gVar2.c.clear();
                gVar2.c.add((yf.b) obj);
                break;
            case 22:
                wh.z1 z1Var = (wh.z1) obj2;
                z1Var.B = false;
                z1Var.v.setAlpha(1.0f);
                z1Var.v.w1.setVisibility(0);
                z1Var.x.p(AndroidUtilities.dp(22.0f));
                z1Var.x.setAlpha(255);
                vg.f fVar = z1Var.s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                break;
            default:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.h0 = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                ((wv0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ fx0(Object obj, View view, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = view;
    }
}
