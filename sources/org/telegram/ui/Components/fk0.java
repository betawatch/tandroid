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
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.lh1;
import org.telegram.ui.pg1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fk0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fk0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 11:
                ((ProfileActivity) this.c).y5 = null;
                break;
            case 12:
                org.telegram.ui.y11 y11Var = (org.telegram.ui.y11) this.c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.b.d(floatValue, y11Var.e[0], iArr[0]), i0.b.d(floatValue, y11Var.e[1], iArr[1]), i0.b.d(floatValue, y11Var.e[2], iArr[2]), i0.b.d(floatValue, y11Var.e[3], iArr[3])}, 0, y11Var.e, 0, 4);
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
                org.telegram.ui.pq pqVar = (org.telegram.ui.pq) obj2;
                ((gk0) pqVar.d).g.remove((AnimatorSet) obj);
                if (((gk0) pqVar.d).g.isEmpty()) {
                    ((gk0) pqVar.d).b.clear();
                    gk0 gk0Var = (gk0) pqVar.d;
                    gk0Var.d = true;
                    gk0Var.a.invalidate();
                    break;
                }
                break;
            case 1:
                fo0 fo0Var = (fo0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(fo0Var.B);
                } catch (Exception unused) {
                }
                lg0 lg0Var = fo0Var.C;
                if (lg0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(lg0Var);
                    break;
                }
                break;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                zu0 zu0Var = (zu0) gVar.c;
                zu0Var.b0 = 1.0f;
                zu0Var.O.add((vu0) obj);
                ((zu0) gVar.c).T.setShader(null);
                ((zu0) gVar.c).V.setShader(null);
                ((zu0) gVar.c).N();
                super.onAnimationEnd(animator);
                break;
            case 3:
                nw0 nw0Var = (nw0) obj2;
                nw0Var.b = 0.0f;
                nw0Var.invalidate();
                ((vl0) obj).invalidate();
                break;
            case 4:
                org.telegram.ui.Components.voip.j3 j3Var = (org.telegram.ui.Components.voip.j3) obj2;
                j3Var.d.setText((String) obj);
                j3Var.d.setTranslationY(0.0f);
                j3Var.d.setAlpha(1.0f);
                break;
            case 5:
                ((org.telegram.ui.Components.voip.j3) obj2).removeView((org.telegram.ui.Components.voip.i3) obj);
                break;
            case 6:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.gy) obj2).N3 = null;
                break;
            case 7:
                org.telegram.ui.s70 s70Var = (org.telegram.ui.s70) obj2;
                s70Var.removeView((a30) obj);
                s70Var.e = null;
                s70Var.a = null;
                s70Var.b = false;
                break;
            case 8:
                ev0 ev0Var = (ev0) obj2;
                ev0Var.setVisibility(8);
                ev0Var.setX(0.0f);
                break;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                ge0 ge0Var = photoViewer.y1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = ge0Var.e;
                ge0Var.f = bitmap != null;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = ge0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = ge0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                ge0Var.h = true;
                ge0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ge0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ge0Var, ge0Var.A, 0.0f, 1.0f));
                ge0Var.s.setDuration(250L);
                ge0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                ge0Var.s.addListener(new ee0(ge0Var, 0));
                ge0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.w2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.v2, photoViewer.Z3, 0.0f));
                photoViewer.w2.setDuration(85L);
                photoViewer.w2.setInterpolator(er.g);
                photoViewer.w2.addListener(new org.telegram.ui.f50(this, 9));
                photoViewer.w2.start();
                break;
            case 10:
                org.telegram.ui.fw0 fw0Var = (org.telegram.ui.fw0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = fw0Var.n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.Q.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.Q.getChildAt(i11);
                    if (childAt != fw0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                break;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                if (profileActivity.y5 != null) {
                    if (profileActivity.B5) {
                        if (profileActivity.H0) {
                            profileActivity.M0.setVisibility(8);
                        }
                        if (profileActivity.I0) {
                            profileActivity.N0.setVisibility(8);
                        }
                        if (profileActivity.J0) {
                            profileActivity.O0.setVisibility(8);
                        }
                        profileActivity.P0.setVisibility(8);
                    } else {
                        org.telegram.ui.hz0 hz0Var = profileActivity.K;
                        if (hz0Var.s0(hz0Var.g0[0].B)) {
                            ((org.telegram.ui.ActionBar.v0) obj).setVisibility(0);
                        }
                        profileActivity.K.n0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.z5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f5, 1.0f));
                        profileActivity.z5.setDuration(100L);
                        profileActivity.z5.addListener(new org.telegram.ui.f50(this, 21));
                        profileActivity.z5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.y5 = null;
                break;
            case 12:
                org.telegram.ui.y11 y11Var = (org.telegram.ui.y11) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, y11Var.e, 0, 4);
                }
                y11Var.n = null;
                y11Var.s = null;
                nb0 nb0Var = y11Var.h;
                nb0Var.K = 1.0f;
                nb0Var.i();
                y11Var.h.s(1.0f);
                break;
            case 13:
                org.telegram.ui.g31 g31Var = (org.telegram.ui.g31) obj2;
                if (g31Var.h != null) {
                    g31Var.h = null;
                    g31Var.n.unlock();
                    ((org.telegram.ui.ix) obj).onTransitionAnimationEnd(true, false);
                    g31Var.e = 1.0f;
                    g31Var.g();
                    g31Var.d(false);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.cu0 cu0Var = (org.telegram.ui.cu0) obj;
                if (cu0Var != null) {
                    cu0Var.a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ky0(this, 13));
                break;
            case 15:
                ((org.telegram.ui.q51) obj).run();
                org.telegram.ui.a61 a61Var = (org.telegram.ui.a61) obj2;
                org.telegram.ui.p41 p41Var = a61Var.T0;
                if (p41Var != null) {
                    p41Var.dismiss();
                    a61Var.T0 = null;
                    break;
                }
                break;
            case 16:
                pg1 pg1Var = (pg1) obj2;
                pg1Var.removeView((a30) obj);
                pg1Var.e = null;
                pg1Var.a = null;
                pg1Var.b = false;
                UsersSelectActivity usersSelectActivity = pg1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.K.isEmpty()) {
                    usersSelectActivity.c.setHintVisible(true, true);
                    break;
                }
                break;
            case 17:
                ((Runnable) obj).run();
                lh1 lh1Var = (lh1) obj2;
                lh1Var.a0.setScaleX(1.15f);
                lh1Var.a0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lh1Var.a0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                lh1Var.a0.setVisibility(8);
                break;
            case 18:
                r0.w0 w0Var = (r0.w0) obj;
                w0Var.a.d(1.0f);
                r0.r0.e((View) obj2, w0Var);
                break;
            case 19:
                rf.g gVar2 = (rf.g) obj2;
                gVar2.b.clear();
                gVar2.b.add((tf.d) obj);
                break;
            case 20:
                super.onAnimationEnd(animator);
                rf.g gVar3 = (rf.g) obj2;
                gVar3.c.clear();
                gVar3.c.add((tf.b) obj);
                break;
            case 21:
                rh.x1 x1Var = (rh.x1) obj2;
                x1Var.A = false;
                x1Var.v.setAlpha(1.0f);
                x1Var.v.v1.setVisibility(0);
                x1Var.x.p(AndroidUtilities.dp(22.0f));
                x1Var.x.setAlpha(255);
                qg.g gVar4 = x1Var.s;
                gVar4.e = true;
                gVar4.invalidate();
                ((Runnable) obj).run();
                break;
            case 22:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.g0 = null;
                break;
            default:
                zf.b2 b2Var = (zf.b2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b2Var.n0.b(b2Var.u0, false);
                }
                b2Var.setRotationY(0.0f);
                b2Var.v0 = 1.0f;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 8:
                ((ev0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ fk0(Object obj, View view, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = view;
    }
}
