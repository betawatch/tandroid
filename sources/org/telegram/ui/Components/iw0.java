package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.be1;
import org.telegram.ui.gd1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class iw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iw0(int i10, View view, Object obj) {
        this.a = i10;
        this.b = obj;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 14:
                ((r0.l0) this.b).a();
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
                jw0 jw0Var = (jw0) obj2;
                jw0Var.b = 0.0f;
                jw0Var.invalidate();
                ((ul0) obj).invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) obj2;
                r2Var.d.setText((String) obj);
                r2Var.d.setTranslationY(0.0f);
                r2Var.d.setAlpha(1.0f);
                break;
            case 2:
                ((org.telegram.ui.Components.voip.r2) obj2).removeView((org.telegram.ui.Components.voip.q2) obj);
                break;
            case 3:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.ay) obj2).Q3 = null;
                break;
            case 4:
                org.telegram.ui.x60 x60Var = (org.telegram.ui.x60) obj2;
                x60Var.removeView((s20) obj);
                x60Var.d = null;
                x60Var.a = null;
                x60Var.b = false;
                break;
            case 5:
                zu0 zu0Var = (zu0) obj2;
                zu0Var.setVisibility(8);
                zu0Var.setX(0.0f);
                break;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                be0 be0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = be0Var.e;
                be0Var.f = bitmap != null;
                imageReceiver.v0(bitmap);
                imageReceiver.G0(0, 0, false);
                AnimatorSet animatorSet = be0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = be0Var.w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                be0Var.h = true;
                be0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                be0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(be0Var, be0Var.E, 0.0f, 1.0f));
                be0Var.s.setDuration(250L);
                be0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                be0Var.s.addListener(new zd0(be0Var, 0));
                be0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.z2, photoViewer.d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(gr.g);
                photoViewer.A2.addListener(new org.telegram.ui.Components.voip.h2(this, 21));
                photoViewer.A2.start();
                break;
            case 7:
                org.telegram.ui.du0 du0Var = (org.telegram.ui.du0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = du0Var.n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != du0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                break;
            case 8:
                org.telegram.ui.k01 k01Var = (org.telegram.ui.k01) obj2;
                if (k01Var.h != null) {
                    k01Var.h = null;
                    k01Var.n.e();
                    ((org.telegram.ui.ex) obj).onTransitionAnimationEnd(true, false);
                    k01Var.e = 1.0f;
                    k01Var.g();
                    k01Var.d(false);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.gs0 gs0Var = (org.telegram.ui.gs0) obj;
                if (gs0Var != null) {
                    gs0Var.a.O0(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                org.telegram.messenger.i0.g3(new org.telegram.ui.wv0(this, 15));
                break;
            case 10:
                ((org.telegram.ui.y21) obj).run();
                org.telegram.ui.i31 i31Var = (org.telegram.ui.i31) obj2;
                org.telegram.ui.y11 y11Var = i31Var.X0;
                if (y11Var != null) {
                    y11Var.dismiss();
                    i31Var.X0 = null;
                    break;
                }
                break;
            case 11:
                gd1 gd1Var = (gd1) obj2;
                gd1Var.removeView((s20) obj);
                gd1Var.e = null;
                gd1Var.a = null;
                gd1Var.b = false;
                UsersSelectActivity usersSelectActivity = gd1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.c.t(true, true);
                    break;
                }
                break;
            case 12:
                ((Runnable) obj).run();
                be1 be1Var = (be1) obj2;
                be1Var.e0.setScaleX(1.15f);
                be1Var.e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) be1Var.e0.getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.i0.L(10.0f);
                marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(10.0f);
                be1Var.e0.setVisibility(8);
                break;
            case 13:
                qg.g gVar = (qg.g) obj2;
                gVar.removeView((s20) obj);
                gVar.h.clear();
                gVar.b = null;
                gVar.c = false;
                ((qg.h) gVar.n).b.setAllowDrawCursor(true);
                break;
            case 14:
                ((r0.l0) obj).c();
                break;
            case 15:
                r0.u0 u0Var = (r0.u0) obj;
                u0Var.a.d(1.0f);
                r0.p0.e((View) obj2, u0Var);
                break;
            case 16:
                rh.a9 a9Var = (rh.a9) obj2;
                a9Var.b.remove((rh.z8) obj);
                a9Var.f1();
                break;
            case 17:
                super.onAnimationEnd(animator);
                ((th.l) obj2).b0.j0 = null;
                org.telegram.messenger.i0.E2((View) obj);
                break;
            case 18:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    int i12 = ProfileStoriesView.s0;
                    if (org.telegram.messenger.tz.o() > 0) {
                        org.telegram.messenger.i0.b4(profileStoriesView);
                        org.telegram.messenger.i0.h3(new sg.v(profileStoriesView, 9), 180L);
                    }
                }
                profileStoriesView.W = 1.0f;
                profileStoriesView.invalidate();
                break;
            case 19:
                View view2 = (View) obj;
                if (view2 != null) {
                    view2.setVisibility(4);
                }
                ((vh.k2) ((org.telegram.ui.go0) obj2).c).h.setVisibility(8);
                break;
            case 20:
                vh.n2 n2Var = (vh.n2) obj2;
                n2Var.j1 = null;
                n2Var.l1 = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 21:
                vh.n nVar = (vh.n) obj2;
                ((jg.i2) obj).setDraw(true);
                if (nVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) nVar.getParent()).removeView(nVar);
                    break;
                }
                break;
            default:
                qg.g gVar2 = (qg.g) obj2;
                gVar2.removeView((s20) obj);
                gVar2.h.clear();
                gVar2.b = null;
                gVar2.c = false;
                vh.t6 t6Var = (vh.t6) gVar2.n;
                t6Var.b.setAllowDrawCursor(true);
                vh.i6 i6Var = t6Var.h;
                if (i6Var != null) {
                    i6Var.run();
                }
                if (t6Var.L) {
                    t6Var.fullScroll(org.telegram.messenger.zs.O1);
                    t6Var.L = false;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                ((zu0) this.b).setVisibility(0);
                break;
            case 14:
                ((r0.l0) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ iw0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }
}
