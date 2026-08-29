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
import org.telegram.ui.oh1;
import org.telegram.ui.sg1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ok0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ok0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 12:
                ((ProfileActivity) this.c).y5 = null;
                break;
            case 13:
                org.telegram.ui.a21 a21Var = (org.telegram.ui.a21) this.c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, a21Var.e[0], iArr[0]), i0.a.d(floatValue, a21Var.e[1], iArr[1]), i0.a.d(floatValue, a21Var.e[2], iArr[2]), i0.a.d(floatValue, a21Var.e[3], iArr[3])}, 0, a21Var.e, 0, 4);
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
                p00 p00Var = (p00) obj;
                p00Var.setAlpha(1.0f);
                f2.w0.x0(p00Var);
                pk0 pk0Var = (pk0) obj2;
                pk0Var.c.remove(p00Var);
                pk0Var.a.removeView(p00Var);
                break;
            case 1:
                super.onAnimationEnd(animator);
                org.telegram.ui.pq pqVar = (org.telegram.ui.pq) obj2;
                ((pk0) pqVar.d).g.remove((AnimatorSet) obj);
                if (((pk0) pqVar.d).g.isEmpty()) {
                    ((pk0) pqVar.d).b.clear();
                    pk0 pk0Var2 = (pk0) pqVar.d;
                    pk0Var2.d = true;
                    pk0Var2.a.invalidate();
                    break;
                }
                break;
            case 2:
                po0 po0Var = (po0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(po0Var.B);
                } catch (Exception unused) {
                }
                ii0 ii0Var = po0Var.C;
                if (ii0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(ii0Var);
                    break;
                }
                break;
            case 3:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                hv0 hv0Var = (hv0) gVar.c;
                hv0Var.b0 = 1.0f;
                hv0Var.O.add((dv0) obj);
                ((hv0) gVar.c).T.setShader(null);
                ((hv0) gVar.c).V.setShader(null);
                ((hv0) gVar.c).N();
                super.onAnimationEnd(animator);
                break;
            case 4:
                vw0 vw0Var = (vw0) obj2;
                vw0Var.b = 0.0f;
                vw0Var.invalidate();
                ((fm0) obj).invalidate();
                break;
            case 5:
                org.telegram.ui.Components.voip.m3 m3Var = (org.telegram.ui.Components.voip.m3) obj2;
                m3Var.d.setText((String) obj);
                m3Var.d.setTranslationY(0.0f);
                m3Var.d.setAlpha(1.0f);
                break;
            case 6:
                ((org.telegram.ui.Components.voip.m3) obj2).removeView((org.telegram.ui.Components.voip.l3) obj);
                break;
            case 7:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.fy) obj2).N3 = null;
                break;
            case 8:
                org.telegram.ui.r70 r70Var = (org.telegram.ui.r70) obj2;
                r70Var.removeView((j30) obj);
                r70Var.e = null;
                r70Var.a = null;
                r70Var.b = false;
                break;
            case 9:
                mv0 mv0Var = (mv0) obj2;
                mv0Var.setVisibility(8);
                mv0Var.setX(0.0f);
                break;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                pe0 pe0Var = photoViewer.y1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = pe0Var.e;
                pe0Var.f = bitmap != null;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = pe0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = pe0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                pe0Var.h = true;
                pe0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                pe0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(pe0Var, pe0Var.A, 0.0f, 1.0f));
                pe0Var.s.setDuration(250L);
                pe0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                pe0Var.s.addListener(new ne0(pe0Var, 0));
                pe0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.w2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.v2, photoViewer.Z3, 0.0f));
                photoViewer.w2.setDuration(85L);
                photoViewer.w2.setInterpolator(jr.g);
                photoViewer.w2.addListener(new org.telegram.ui.e50(this, 9));
                photoViewer.w2.start();
                break;
            case 11:
                org.telegram.ui.ew0 ew0Var = (org.telegram.ui.ew0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = ew0Var.n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.Q.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.Q.getChildAt(i11);
                    if (childAt != ew0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                break;
            case 12:
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
                        profileActivity.z5.addListener(new org.telegram.ui.e50(this, 21));
                        profileActivity.z5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.y5 = null;
                break;
            case 13:
                org.telegram.ui.a21 a21Var = (org.telegram.ui.a21) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, a21Var.e, 0, 4);
                }
                a21Var.n = null;
                a21Var.s = null;
                yb0 yb0Var = a21Var.h;
                yb0Var.K = 1.0f;
                yb0Var.i();
                a21Var.h.s(1.0f);
                break;
            case 14:
                org.telegram.ui.h31 h31Var = (org.telegram.ui.h31) obj2;
                if (h31Var.h != null) {
                    h31Var.h = null;
                    h31Var.n.unlock();
                    ((org.telegram.ui.hx) obj).onTransitionAnimationEnd(true, false);
                    h31Var.e = 1.0f;
                    h31Var.g();
                    h31Var.d(false);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.zt0 zt0Var = (org.telegram.ui.zt0) obj;
                if (zt0Var != null) {
                    zt0Var.a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ky0(this, 13));
                break;
            case 16:
                ((org.telegram.ui.t51) obj).run();
                org.telegram.ui.d61 d61Var = (org.telegram.ui.d61) obj2;
                org.telegram.ui.s41 s41Var = d61Var.T0;
                if (s41Var != null) {
                    s41Var.dismiss();
                    d61Var.T0 = null;
                    break;
                }
                break;
            case 17:
                sg1 sg1Var = (sg1) obj2;
                sg1Var.removeView((j30) obj);
                sg1Var.e = null;
                sg1Var.a = null;
                sg1Var.b = false;
                UsersSelectActivity usersSelectActivity = sg1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.K.isEmpty()) {
                    usersSelectActivity.c.setHintVisible(true, true);
                    break;
                }
                break;
            case 18:
                ((Runnable) obj).run();
                oh1 oh1Var = (oh1) obj2;
                oh1Var.a0.setScaleX(1.15f);
                oh1Var.a0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) oh1Var.a0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                oh1Var.a0.setVisibility(8);
                break;
            case 19:
                r0.w0 w0Var = (r0.w0) obj;
                w0Var.a.d(1.0f);
                r0.r0.e((View) obj2, w0Var);
                break;
            case 20:
                tf.g gVar2 = (tf.g) obj2;
                gVar2.b.clear();
                gVar2.b.add((vf.d) obj);
                break;
            case 21:
                super.onAnimationEnd(animator);
                tf.g gVar3 = (tf.g) obj2;
                gVar3.c.clear();
                gVar3.c.add((vf.b) obj);
                break;
            case 22:
                th.x1 x1Var = (th.x1) obj2;
                x1Var.A = false;
                x1Var.v.setAlpha(1.0f);
                x1Var.v.v1.setVisibility(0);
                x1Var.x.p(AndroidUtilities.dp(22.0f));
                x1Var.x.setAlpha(255);
                sg.f fVar = x1Var.s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                break;
            default:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.g0 = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 9:
                ((mv0) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ ok0(Object obj, View view, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = view;
    }

    public ok0(pk0 pk0Var, p00 p00Var, f2.w0 w0Var) {
        this.a = 0;
        this.c = pk0Var;
        this.b = p00Var;
    }
}
