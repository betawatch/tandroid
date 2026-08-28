package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import org.telegram.ui.mh1;
import org.telegram.ui.qg1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class su0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ su0(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((ProfileActivity) this.c).y5 = null;
                break;
            case 10:
                org.telegram.ui.z11 z11Var = (org.telegram.ui.z11) this.c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, z11Var.e[0], iArr[0]), i0.a.d(floatValue, z11Var.e[1], iArr[1]), i0.a.d(floatValue, z11Var.e[2], iArr[2]), i0.a.d(floatValue, z11Var.e[3], iArr[3])}, 0, z11Var.e, 0, 4);
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
        int i9 = this.a;
        int i10 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i9) {
            case 0:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                xu0 xu0Var = (xu0) gVar.c;
                xu0Var.b0 = 1.0f;
                xu0Var.O.add((tu0) obj);
                ((xu0) gVar.c).T.setShader(null);
                ((xu0) gVar.c).V.setShader(null);
                ((xu0) gVar.c).N();
                super.onAnimationEnd(animator);
                break;
            case 1:
                lw0 lw0Var = (lw0) obj2;
                lw0Var.b = 0.0f;
                lw0Var.invalidate();
                ((sl0) obj).invalidate();
                break;
            case 2:
                org.telegram.ui.Components.voip.j3 j3Var = (org.telegram.ui.Components.voip.j3) obj2;
                j3Var.d.setText((String) obj);
                j3Var.d.setTranslationY(0.0f);
                j3Var.d.setAlpha(1.0f);
                break;
            case 3:
                ((org.telegram.ui.Components.voip.j3) obj2).removeView((org.telegram.ui.Components.voip.i3) obj);
                break;
            case 4:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.dy) obj2).N3 = null;
                break;
            case 5:
                org.telegram.ui.p70 p70Var = (org.telegram.ui.p70) obj2;
                p70Var.removeView((w20) obj);
                p70Var.e = null;
                p70Var.a = null;
                p70Var.b = false;
                break;
            case 6:
                cv0 cv0Var = (cv0) obj2;
                cv0Var.setVisibility(8);
                cv0Var.setX(0.0f);
                break;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                be0 be0Var = photoViewer.y1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = be0Var.e;
                be0Var.f = bitmap != null;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = be0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = be0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                be0Var.h = true;
                be0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                be0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(be0Var, be0Var.A, 0.0f, 1.0f));
                be0Var.s.setDuration(250L);
                be0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                be0Var.s.addListener(new zd0(be0Var, 0));
                be0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.w2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.v2, photoViewer.Z3, 0.0f));
                photoViewer.w2.setDuration(85L);
                photoViewer.w2.setInterpolator(gr.g);
                photoViewer.w2.addListener(new org.telegram.ui.bc0(this, 7));
                photoViewer.w2.start();
                break;
            case 8:
                org.telegram.ui.fw0 fw0Var = (org.telegram.ui.fw0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = fw0Var.n;
                ((View) obj).setVisibility(8);
                while (i10 < premiumPreviewFragment.Q.getChildCount()) {
                    View childAt = premiumPreviewFragment.Q.getChildAt(i10);
                    if (childAt != fw0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                    i10++;
                }
                break;
            case 9:
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
                            ((org.telegram.ui.ActionBar.w0) obj).setVisibility(0);
                        }
                        profileActivity.K.n0.setVisibility(4);
                        AnimatorSet animatorSet5 = new AnimatorSet();
                        profileActivity.z5 = animatorSet5;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.f5, 1.0f));
                        profileActivity.z5.setDuration(100L);
                        profileActivity.z5.addListener(new org.telegram.ui.bc0(this, 19));
                        profileActivity.z5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.y5 = null;
                break;
            case 10:
                org.telegram.ui.z11 z11Var = (org.telegram.ui.z11) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, z11Var.e, 0, 4);
                }
                z11Var.n = null;
                z11Var.s = null;
                jb0 jb0Var = z11Var.h;
                jb0Var.K = 1.0f;
                jb0Var.i();
                z11Var.h.s(1.0f);
                break;
            case 11:
                org.telegram.ui.h31 h31Var = (org.telegram.ui.h31) obj2;
                if (h31Var.h != null) {
                    h31Var.h = null;
                    h31Var.n.unlock();
                    ((org.telegram.ui.fx) obj).onTransitionAnimationEnd(true, false);
                    h31Var.e = 1.0f;
                    h31Var.g();
                    h31Var.d(false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.bu0 bu0Var = (org.telegram.ui.bu0) obj;
                if (bu0Var != null) {
                    bu0Var.a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ky0(this, 13));
                break;
            case 13:
                ((org.telegram.ui.r51) obj).run();
                org.telegram.ui.b61 b61Var = (org.telegram.ui.b61) obj2;
                org.telegram.ui.q41 q41Var = b61Var.T0;
                if (q41Var != null) {
                    q41Var.dismiss();
                    b61Var.T0 = null;
                    break;
                }
                break;
            case 14:
                qg1 qg1Var = (qg1) obj2;
                qg1Var.removeView((w20) obj);
                qg1Var.e = null;
                qg1Var.a = null;
                qg1Var.b = false;
                UsersSelectActivity usersSelectActivity = qg1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.K.isEmpty()) {
                    usersSelectActivity.c.setHintVisible(true, true);
                    break;
                }
                break;
            case 15:
                ((Runnable) obj).run();
                mh1 mh1Var = (mh1) obj2;
                mh1Var.a0.setScaleX(1.15f);
                mh1Var.a0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mh1Var.a0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                mh1Var.a0.setVisibility(8);
                break;
            case 16:
                qf.g gVar2 = (qf.g) obj2;
                gVar2.b.clear();
                gVar2.b.add((sf.d) obj);
                break;
            case 17:
                super.onAnimationEnd(animator);
                qf.g gVar3 = (qf.g) obj2;
                gVar3.c.clear();
                gVar3.c.add((sf.b) obj);
                break;
            case 18:
                qh.x1 x1Var = (qh.x1) obj2;
                x1Var.A = false;
                x1Var.v.setAlpha(1.0f);
                x1Var.v.v1.setVisibility(0);
                x1Var.x.p(AndroidUtilities.dp(22.0f));
                x1Var.x.setAlpha(255);
                pg.f fVar = x1Var.s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                break;
            case 19:
                r0.w0 w0Var = (r0.w0) obj;
                w0Var.a.d(1.0f);
                r0.r0.e((View) obj2, w0Var);
                break;
            case 20:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.g0 = null;
                break;
            case 21:
                yf.a2 a2Var = (yf.a2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    a2Var.n0.b(a2Var.u0, false);
                }
                a2Var.setRotationY(0.0f);
                a2Var.v0 = 1.0f;
                break;
            case 22:
                ((zf.x0) obj2).w = false;
                ((zf.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                break;
            default:
                zf.k1 k1Var = (zf.k1) obj2;
                k1Var.D0 = false;
                k1Var.C0 = 1.0f;
                k1Var.o0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new zf.h1(i10, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 6:
                ((cv0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ su0(Object obj, View view, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = view;
    }
}
