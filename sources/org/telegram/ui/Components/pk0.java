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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                org.telegram.ui.g31 g31Var = (org.telegram.ui.g31) this.c;
                super.onAnimationCancel(animator);
                float floatValue = ((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue();
                int[] iArr = (int[]) this.b;
                if (iArr != null) {
                    System.arraycopy(new int[]{i0.a.d(floatValue, g31Var.e[0], iArr[0]), i0.a.d(floatValue, g31Var.e[1], iArr[1]), i0.a.d(floatValue, g31Var.e[2], iArr[2]), i0.a.d(floatValue, g31Var.e[3], iArr[3])}, 0, g31Var.e, 0, 4);
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
        int i11 = 4;
        int i12 = 1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.cr crVar = (org.telegram.ui.cr) obj2;
                ((qk0) crVar.d).g.remove((AnimatorSet) obj);
                if (((qk0) crVar.d).g.isEmpty()) {
                    ((qk0) crVar.d).b.clear();
                    qk0 qk0Var = (qk0) crVar.d;
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
                jn0 jn0Var = vo0Var.C;
                if (jn0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(jn0Var);
                    break;
                }
                break;
            case 2:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                ov0 ov0Var = (ov0) gVar.c;
                ov0Var.f0 = 1.0f;
                ov0Var.S.add((kv0) obj);
                ((ov0) gVar.c).a0.setShader(null);
                ((ov0) gVar.c).c0.setShader(null);
                ((ov0) gVar.c).N();
                super.onAnimationEnd(animator);
                break;
            case 3:
                cx0 cx0Var = (cx0) obj2;
                cx0Var.b = 0.0f;
                cx0Var.invalidate();
                ((im0) obj).invalidate();
                break;
            case 4:
                org.telegram.ui.Components.voip.i3 i3Var = (org.telegram.ui.Components.voip.i3) obj2;
                i3Var.d.setText((String) obj);
                i3Var.d.setTranslationY(0.0f);
                i3Var.d.setAlpha(1.0f);
                break;
            case 5:
                ((org.telegram.ui.Components.voip.i3) obj2).removeView((org.telegram.ui.Components.voip.h3) obj);
                break;
            case 6:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.uy) obj2).R3 = null;
                break;
            case 7:
                org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) obj2;
                k80Var.removeView((m30) obj);
                k80Var.e = null;
                k80Var.a = null;
                k80Var.b = false;
                break;
            case 8:
                tv0 tv0Var = (tv0) obj2;
                tv0Var.setVisibility(8);
                tv0Var.setX(0.0f);
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
                photoViewer.A2.setInterpolator(pr.g);
                photoViewer.A2.addListener(new org.telegram.ui.gk0(this, i11));
                photoViewer.A2.start();
                break;
            case 10:
                org.telegram.ui.jx0 jx0Var = (org.telegram.ui.jx0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = jx0Var.n;
                ((View) obj).setVisibility(8);
                for (int i13 = 0; i13 < premiumPreviewFragment.U.getChildCount(); i13++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i13);
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
                        profileActivity.D5.addListener(new org.telegram.ui.gk0(this, 16));
                        profileActivity.D5.start();
                    }
                }
                profileActivity.l5(false);
                profileActivity.C5 = null;
                break;
            case 12:
                org.telegram.ui.g31 g31Var = (org.telegram.ui.g31) obj2;
                super.onAnimationEnd(animator);
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    System.arraycopy(iArr, 0, g31Var.e, 0, 4);
                }
                g31Var.n = null;
                g31Var.s = null;
                dc0 dc0Var = g31Var.h;
                dc0Var.K = 1.0f;
                dc0Var.i();
                g31Var.h.s(1.0f);
                break;
            case 13:
                org.telegram.ui.o41 o41Var = (org.telegram.ui.o41) obj2;
                if (o41Var.h != null) {
                    o41Var.h = null;
                    o41Var.n.unlock();
                    ((org.telegram.ui.vx) obj).onTransitionAnimationEnd(true, false);
                    o41Var.e = 1.0f;
                    o41Var.g();
                    o41Var.d(false);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.cv0 cv0Var = (org.telegram.ui.cv0) obj;
                if (cv0Var != null) {
                    cv0Var.a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.f01(this, 11));
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
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                break;
            case 19:
                rg.c2 c2Var = (rg.c2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    c2Var.r0.b(c2Var.y0, false);
                }
                c2Var.setRotationY(0.0f);
                c2Var.z0 = 1.0f;
                break;
            case 20:
                ((sg.a1) obj2).w = false;
                ((sg.o0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                break;
            case 21:
                sg.o1 o1Var = (sg.o1) obj2;
                o1Var.H0 = false;
                o1Var.G0 = 1.0f;
                o1Var.s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new zh.o8(i12, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                break;
            case 22:
                di.ea eaVar = (di.ea) obj2;
                eaVar.removeView((m30) obj);
                eaVar.h.clear();
                eaVar.b = null;
                eaVar.c = false;
                ((yg.i) eaVar.n).b.setAllowDrawCursor(true);
                break;
            default:
                zh.q8 q8Var = (zh.q8) obj2;
                q8Var.b.remove((zh.p8) obj);
                q8Var.a1();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 8:
                ((tv0) this.b).setVisibility(0);
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
