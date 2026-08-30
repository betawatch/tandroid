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
import org.telegram.ui.ai1;
import org.telegram.ui.eh1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ex0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ex0(int i10, Object obj, Object obj2) {
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
                org.telegram.ui.m21 m21Var = (org.telegram.ui.m21) this.c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, m21Var.e[0], iArr[0]), i0.a.d(floatValue, m21Var.e[1], iArr[1]), i0.a.d(floatValue, m21Var.e[2], iArr[2]), i0.a.d(floatValue, m21Var.e[3], iArr[3])}, 0, m21Var.e, 0, 4);
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
        int i11 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                fx0 fx0Var = (fx0) obj2;
                fx0Var.b = 0.0f;
                fx0Var.invalidate();
                ((pm0) obj).invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.k3 k3Var = (org.telegram.ui.Components.voip.k3) obj2;
                k3Var.d.setText((String) obj);
                k3Var.d.setTranslationY(0.0f);
                k3Var.d.setAlpha(1.0f);
                break;
            case 2:
                ((org.telegram.ui.Components.voip.k3) obj2).removeView((org.telegram.ui.Components.voip.j3) obj);
                break;
            case 3:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.oy) obj2).O3 = null;
                break;
            case 4:
                org.telegram.ui.b80 b80Var = (org.telegram.ui.b80) obj2;
                b80Var.removeView((n30) obj);
                b80Var.e = null;
                b80Var.a = null;
                b80Var.b = false;
                break;
            case 5:
                vv0 vv0Var = (vv0) obj2;
                vv0Var.setVisibility(8);
                vv0Var.setX(0.0f);
                break;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                ye0 ye0Var = photoViewer.z1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = ye0Var.e;
                ye0Var.f = bitmap != null;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = ye0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = ye0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                ye0Var.h = true;
                ye0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ye0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ye0Var, ye0Var.B, 0.0f, 1.0f));
                ye0Var.s.setDuration(250L);
                ye0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                ye0Var.s.addListener(new we0(ye0Var, 0));
                ye0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.x2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.w2, photoViewer.a4, 0.0f));
                photoViewer.x2.setDuration(85L);
                photoViewer.x2.setInterpolator(nr.g);
                photoViewer.x2.addListener(new org.telegram.ui.ls0(this, i11));
                photoViewer.x2.start();
                break;
            case 7:
                org.telegram.ui.ow0 ow0Var = (org.telegram.ui.ow0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = ow0Var.n;
                ((View) obj).setVisibility(8);
                while (i11 < premiumPreviewFragment.R.getChildCount()) {
                    View childAt = premiumPreviewFragment.R.getChildAt(i11);
                    if (childAt != ow0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                    i11++;
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
                        org.telegram.ui.sz0 sz0Var = profileActivity.L;
                        if (sz0Var.s0(sz0Var.h0[0].C)) {
                            ((org.telegram.ui.ActionBar.w0) obj).setVisibility(0);
                        }
                        profileActivity.L.o0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.A5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.g5, 1.0f));
                        profileActivity.A5.setDuration(100L);
                        profileActivity.A5.addListener(new org.telegram.ui.ls0(this, 12));
                        profileActivity.A5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.z5 = null;
                break;
            case 9:
                org.telegram.ui.m21 m21Var = (org.telegram.ui.m21) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, m21Var.e, 0, 4);
                }
                m21Var.n = null;
                m21Var.s = null;
                dc0 dc0Var = m21Var.h;
                dc0Var.K = 1.0f;
                dc0Var.i();
                m21Var.h.s(1.0f);
                break;
            case 10:
                org.telegram.ui.t31 t31Var = (org.telegram.ui.t31) obj2;
                if (t31Var.h != null) {
                    t31Var.h = null;
                    t31Var.n.unlock();
                    ((org.telegram.ui.qx) obj).onTransitionAnimationEnd(true, false);
                    t31Var.e = 1.0f;
                    t31Var.g();
                    t31Var.d(false);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ju0 ju0Var = (org.telegram.ui.ju0) obj;
                if (ju0Var != null) {
                    ju0Var.a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.vy0(this, 13));
                break;
            case 12:
                ((org.telegram.ui.f61) obj).run();
                org.telegram.ui.q61 q61Var = (org.telegram.ui.q61) obj2;
                org.telegram.ui.e51 e51Var = q61Var.U0;
                if (e51Var != null) {
                    e51Var.dismiss();
                    q61Var.U0 = null;
                    break;
                }
                break;
            case 13:
                eh1 eh1Var = (eh1) obj2;
                eh1Var.removeView((n30) obj);
                eh1Var.e = null;
                eh1Var.a = null;
                eh1Var.b = false;
                UsersSelectActivity usersSelectActivity = eh1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.L.isEmpty()) {
                    usersSelectActivity.c.setHintVisible(true, true);
                    break;
                }
                break;
            case 14:
                ((Runnable) obj).run();
                ai1 ai1Var = (ai1) obj2;
                ai1Var.b0.setScaleX(1.15f);
                ai1Var.b0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ai1Var.b0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ai1Var.b0.setVisibility(8);
                break;
            case 15:
                View view2 = (View) obj;
                if (view2 != null) {
                    view2.setVisibility(4);
                }
                ((ph.k2) obj2).h.h.setVisibility(8);
                break;
            case 16:
                ph.d3 d3Var = (ph.d3) obj2;
                d3Var.c = null;
                d3Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 17:
                ph.n nVar = (ph.n) obj2;
                ((dg.b3) obj).setDraw(true);
                if (nVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) nVar.getParent()).removeView(nVar);
                    break;
                }
                break;
            case 18:
                kg.j jVar = (kg.j) obj2;
                jVar.removeView((n30) obj);
                jVar.h.clear();
                jVar.b = null;
                jVar.c = false;
                ph.c8 c8Var = (ph.c8) jVar.n;
                c8Var.a.setAllowDrawCursor(true);
                ph.r7 r7Var = c8Var.f;
                if (r7Var != null) {
                    r7Var.run();
                }
                if (c8Var.H) {
                    c8Var.fullScroll(130);
                    c8Var.H = false;
                    break;
                }
                break;
            case 19:
                r0.w0 w0Var = (r0.w0) obj;
                w0Var.a.d(1.0f);
                r0.r0.e((View) obj2, w0Var);
                break;
            case 20:
                vf.g gVar = (vf.g) obj2;
                gVar.b.clear();
                gVar.b.add((xf.d) obj);
                break;
            case 21:
                super.onAnimationEnd(animator);
                vf.g gVar2 = (vf.g) obj2;
                gVar2.c.clear();
                gVar2.c.add((xf.b) obj);
                break;
            case 22:
                vh.y1 y1Var = (vh.y1) obj2;
                y1Var.B = false;
                y1Var.v.setAlpha(1.0f);
                y1Var.v.w1.setVisibility(0);
                y1Var.x.p(AndroidUtilities.dp(22.0f));
                y1Var.x.setAlpha(255);
                ug.f fVar = y1Var.s;
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
                ((vv0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ ex0(Object obj, View view, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = view;
    }
}
