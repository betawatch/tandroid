package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.hc1;
import org.telegram.ui.nb1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class h60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h60(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 18:
                ((r0.m0) this.b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        int i10 = 1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i7) {
            case 0:
                i60 i60Var = (i60) obj2;
                i60Var.removeView((m20) obj);
                i60Var.c = null;
                i60Var.e.Y1 = null;
                i60Var.a = false;
                break;
            case 1:
                cj0 cj0Var = (cj0) obj2;
                org.telegram.ui.ActionBar.l5 l5Var = cj0Var.e;
                if (((ValueAnimator) l5Var.h) != null) {
                    ((ck0) l5Var.e).W1 = false;
                    ArrayList arrayList = cj0Var.b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        View view = (View) obj3;
                        if (view instanceof org.telegram.ui.Cells.q4) {
                            ((org.telegram.ui.Cells.q4) view).c(false, true);
                        }
                        view.setTranslationY(0.0f);
                        ((v4.c0) l5Var.f).getClass();
                        v4.p0.x0(view);
                        ((ck0) l5Var.e).removeView(view);
                        c8.oa oaVar = (c8.oa) l5Var.r;
                        if (oaVar != null) {
                            oaVar.d(view);
                        }
                    }
                    ((ck0) l5Var.e).setScrollEnabled(true);
                    ((ck0) l5Var.e).setVerticalScrollBarEnabled(true);
                    boolean z10 = org.telegram.messenger.s2.a;
                    int childCount = ((ck0) l5Var.e).getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = ((ck0) l5Var.e).getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.q4) {
                            ((org.telegram.ui.Cells.q4) childAt).c(false, false);
                        }
                        childAt.setTranslationY(0.0f);
                    }
                    ArrayList arrayList2 = (ArrayList) obj;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj4 = arrayList2.get(i13);
                        i13++;
                        View view2 = (View) obj4;
                        if (view2 instanceof org.telegram.ui.Cells.q4) {
                            ((org.telegram.ui.Cells.q4) view2).c(false, false);
                        }
                        view2.setTranslationY(0.0f);
                    }
                    dj0 dj0Var = cj0Var.d;
                    if (dj0Var != null) {
                        dj0Var.E();
                    }
                    c8.oa oaVar2 = (c8.oa) l5Var.r;
                    if (oaVar2 != null) {
                        oaVar2.a();
                    }
                    ((SparseArray) l5Var.s).clear();
                    l5Var.h = null;
                    break;
                }
                break;
            case 2:
                wz wzVar = (wz) obj;
                wzVar.setAlpha(1.0f);
                v4.p0.x0(wzVar);
                fj0 fj0Var = (fj0) obj2;
                fj0Var.c.remove(wzVar);
                fj0Var.a.removeView(wzVar);
                break;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.yp ypVar = (org.telegram.ui.yp) obj2;
                ((fj0) ypVar.d).g.remove((AnimatorSet) obj);
                if (((fj0) ypVar.d).g.isEmpty()) {
                    ((fj0) ypVar.d).b.clear();
                    fj0 fj0Var2 = (fj0) ypVar.d;
                    fj0Var2.d = true;
                    fj0Var2.a.invalidate();
                    break;
                }
                break;
            case 4:
                on0 on0Var = (on0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(on0Var.B);
                } catch (Exception unused) {
                }
                hn0 hn0Var = on0Var.C;
                if (hn0Var != null) {
                    org.telegram.messenger.g0.r(hn0Var);
                    break;
                }
                break;
            case 5:
                pv0 pv0Var = (pv0) obj2;
                pv0Var.b = 0.0f;
                pv0Var.invalidate();
                ((el0) obj).invalidate();
                break;
            case 6:
                org.telegram.ui.Components.voip.e3 e3Var = (org.telegram.ui.Components.voip.e3) obj2;
                e3Var.d.setText((String) obj);
                e3Var.d.setTranslationY(0.0f);
                e3Var.d.setAlpha(1.0f);
                break;
            case 7:
                ((org.telegram.ui.Components.voip.e3) obj2).removeView((org.telegram.ui.Components.voip.d3) obj);
                break;
            case 8:
                View view3 = (View) obj;
                if (view3.getParent() != null) {
                    ((ViewGroup) view3.getParent()).removeView(view3);
                }
                ((org.telegram.ui.cx) obj2).V3 = null;
                break;
            case 9:
                org.telegram.ui.z50 z50Var = (org.telegram.ui.z50) obj2;
                z50Var.removeView((m20) obj);
                z50Var.d = null;
                z50Var.a = null;
                z50Var.b = false;
                break;
            case 10:
                fu0 fu0Var = (fu0) obj2;
                fu0Var.setVisibility(8);
                fu0Var.setX(0.0f);
                break;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                qd0 qd0Var = photoViewer.D1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = qd0Var.e;
                qd0Var.f = bitmap != null;
                imageReceiver.v0(bitmap);
                imageReceiver.G0(0, 0, false);
                AnimatorSet animatorSet = qd0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = qd0Var.w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                qd0Var.h = true;
                qd0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                qd0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(qd0Var, qd0Var.F, 0.0f, 1.0f));
                qd0Var.s.setDuration(250L);
                qd0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                qd0Var.s.addListener(new od0(qd0Var, 0));
                qd0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.B2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.A2, photoViewer.d4, 0.0f));
                photoViewer.B2.setDuration(85L);
                photoViewer.B2.setInterpolator(lr.g);
                photoViewer.B2.addListener(new org.telegram.ui.ay(this, 11));
                photoViewer.B2.start();
                break;
            case 12:
                org.telegram.ui.vs0 vs0Var = (org.telegram.ui.vs0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = vs0Var.n;
                ((View) obj).setVisibility(8);
                for (int i14 = 0; i14 < premiumPreviewFragment.V.getChildCount(); i14++) {
                    View childAt2 = premiumPreviewFragment.V.getChildAt(i14);
                    if (childAt2 != vs0Var.e) {
                        childAt2.setTranslationY(0.0f);
                    }
                }
                break;
            case 13:
                org.telegram.ui.yy0 yy0Var = (org.telegram.ui.yy0) obj2;
                if (yy0Var.h != null) {
                    yy0Var.h = null;
                    yy0Var.n.e();
                    ((org.telegram.ui.ew) obj).onTransitionAnimationEnd(true, false);
                    yy0Var.e = 1.0f;
                    yy0Var.g();
                    yy0Var.d(false);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.wq0 wq0Var = (org.telegram.ui.wq0) obj;
                if (wq0Var != null) {
                    wq0Var.a.O0(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                org.telegram.messenger.g0.g3(new org.telegram.ui.ru0(this, 13));
                break;
            case 15:
                ((org.telegram.ui.h11) obj).run();
                org.telegram.ui.r11 r11Var = (org.telegram.ui.r11) obj2;
                org.telegram.ui.h01 h01Var = r11Var.Y0;
                if (h01Var != null) {
                    h01Var.dismiss();
                    r11Var.Y0 = null;
                    break;
                }
                break;
            case 16:
                nb1 nb1Var = (nb1) obj2;
                nb1Var.removeView((m20) obj);
                nb1Var.e = null;
                nb1Var.a = null;
                nb1Var.b = false;
                UsersSelectActivity usersSelectActivity = nb1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.Q.isEmpty()) {
                    usersSelectActivity.c.t(true, true);
                    break;
                }
                break;
            case 17:
                ((Runnable) obj).run();
                hc1 hc1Var = (hc1) obj2;
                hc1Var.f0.setScaleX(1.15f);
                hc1Var.f0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hc1Var.f0.getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f);
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f);
                hc1Var.f0.setVisibility(8);
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
                tg.q1 q1Var = (tg.q1) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q1Var.s0.b(q1Var.z0, false);
                }
                q1Var.setRotationY(0.0f);
                q1Var.A0 = 1.0f;
                break;
            case 21:
                ((ug.z0) obj2).w1 = false;
                ((ug.q0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                break;
            case 22:
                ug.i1 i1Var = (ug.i1) obj2;
                i1Var.D2 = false;
                i1Var.C2 = 1.0f;
                i1Var.o2.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, org.telegram.messenger.ks.e4);
                    ofInt.addUpdateListener(new v4.e(i10, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                break;
            default:
                ((wi.h) obj2).f((v4.p) obj);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 10:
                ((fu0) this.b).setVisibility(0);
                break;
            case 18:
                ((r0.m0) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ h60(Object obj, View view, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = view;
    }

    public h60(fj0 fj0Var, wz wzVar, v4.p0 p0Var) {
        this.a = 2;
        this.c = fj0Var;
        this.b = wzVar;
    }
}
