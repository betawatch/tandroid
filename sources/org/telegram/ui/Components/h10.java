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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class h10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h10(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 19:
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
                ArrayList arrayList = (ArrayList) obj;
                i10 i10Var = (i10) obj2;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    i10Var.removeView((View) arrayList.get(i11));
                }
                i10Var.e.clear();
                i10Var.a = null;
                i10Var.b = false;
                break;
            case 1:
                k60 k60Var = (k60) obj2;
                k60Var.removeView((p20) obj);
                k60Var.c = null;
                k60Var.e.Y1 = null;
                k60Var.a = false;
                break;
            case 2:
                ej0 ej0Var = (ej0) obj2;
                org.telegram.ui.ActionBar.k5 k5Var = ej0Var.e;
                if (((ValueAnimator) k5Var.h) != null) {
                    ((ek0) k5Var.e).W1 = false;
                    ArrayList arrayList2 = ej0Var.b;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj3 = arrayList2.get(i12);
                        i12++;
                        View view = (View) obj3;
                        if (view instanceof org.telegram.ui.Cells.q4) {
                            ((org.telegram.ui.Cells.q4) view).c(false, true);
                        }
                        view.setTranslationY(0.0f);
                        ((v4.c0) k5Var.f).getClass();
                        v4.p0.x0(view);
                        ((ek0) k5Var.e).removeView(view);
                        c8.oa oaVar = (c8.oa) k5Var.r;
                        if (oaVar != null) {
                            oaVar.d(view);
                        }
                    }
                    ((ek0) k5Var.e).setScrollEnabled(true);
                    ((ek0) k5Var.e).setVerticalScrollBarEnabled(true);
                    boolean z10 = org.telegram.messenger.s2.a;
                    int childCount = ((ek0) k5Var.e).getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = ((ek0) k5Var.e).getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.q4) {
                            ((org.telegram.ui.Cells.q4) childAt).c(false, false);
                        }
                        childAt.setTranslationY(0.0f);
                    }
                    ArrayList arrayList3 = (ArrayList) obj;
                    int size2 = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj4 = arrayList3.get(i14);
                        i14++;
                        View view2 = (View) obj4;
                        if (view2 instanceof org.telegram.ui.Cells.q4) {
                            ((org.telegram.ui.Cells.q4) view2).c(false, false);
                        }
                        view2.setTranslationY(0.0f);
                    }
                    fj0 fj0Var = ej0Var.d;
                    if (fj0Var != null) {
                        fj0Var.E();
                    }
                    c8.oa oaVar2 = (c8.oa) k5Var.r;
                    if (oaVar2 != null) {
                        oaVar2.a();
                    }
                    ((SparseArray) k5Var.s).clear();
                    k5Var.h = null;
                    break;
                }
                break;
            case 3:
                yz yzVar = (yz) obj;
                yzVar.setAlpha(1.0f);
                v4.p0.x0(yzVar);
                hj0 hj0Var = (hj0) obj2;
                hj0Var.c.remove(yzVar);
                hj0Var.a.removeView(yzVar);
                break;
            case 4:
                super.onAnimationEnd(animator);
                org.telegram.ui.yp ypVar = (org.telegram.ui.yp) obj2;
                ((hj0) ypVar.d).g.remove((AnimatorSet) obj);
                if (((hj0) ypVar.d).g.isEmpty()) {
                    ((hj0) ypVar.d).b.clear();
                    hj0 hj0Var2 = (hj0) ypVar.d;
                    hj0Var2.d = true;
                    hj0Var2.a.invalidate();
                    break;
                }
                break;
            case 5:
                qn0 qn0Var = (qn0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(qn0Var.B);
                } catch (Exception unused) {
                }
                fm0 fm0Var = qn0Var.C;
                if (fm0Var != null) {
                    org.telegram.messenger.g0.r(fm0Var);
                    break;
                }
                break;
            case 6:
                sv0 sv0Var = (sv0) obj2;
                sv0Var.b = 0.0f;
                sv0Var.invalidate();
                ((gl0) obj).invalidate();
                break;
            case 7:
                org.telegram.ui.Components.voip.e3 e3Var = (org.telegram.ui.Components.voip.e3) obj2;
                e3Var.d.setText((String) obj);
                e3Var.d.setTranslationY(0.0f);
                e3Var.d.setAlpha(1.0f);
                break;
            case 8:
                ((org.telegram.ui.Components.voip.e3) obj2).removeView((org.telegram.ui.Components.voip.d3) obj);
                break;
            case 9:
                View view3 = (View) obj;
                if (view3.getParent() != null) {
                    ((ViewGroup) view3.getParent()).removeView(view3);
                }
                ((org.telegram.ui.cx) obj2).V3 = null;
                break;
            case 10:
                org.telegram.ui.z50 z50Var = (org.telegram.ui.z50) obj2;
                z50Var.removeView((p20) obj);
                z50Var.d = null;
                z50Var.a = null;
                z50Var.b = false;
                break;
            case 11:
                iu0 iu0Var = (iu0) obj2;
                iu0Var.setVisibility(8);
                iu0Var.setX(0.0f);
                break;
            case 12:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                rd0 rd0Var = photoViewer.D1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = rd0Var.e;
                rd0Var.f = bitmap != null;
                imageReceiver.v0(bitmap);
                imageReceiver.G0(0, 0, false);
                AnimatorSet animatorSet = rd0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = rd0Var.w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                rd0Var.h = true;
                rd0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                rd0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(rd0Var, rd0Var.F, 0.0f, 1.0f));
                rd0Var.s.setDuration(250L);
                rd0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                rd0Var.s.addListener(new pd0(rd0Var, 0));
                rd0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.B2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.A2, photoViewer.d4, 0.0f));
                photoViewer.B2.setDuration(85L);
                photoViewer.B2.setInterpolator(nr.g);
                photoViewer.B2.addListener(new org.telegram.ui.ay(this, 11));
                photoViewer.B2.start();
                break;
            case 13:
                org.telegram.ui.vs0 vs0Var = (org.telegram.ui.vs0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = vs0Var.n;
                ((View) obj).setVisibility(8);
                for (int i15 = 0; i15 < premiumPreviewFragment.V.getChildCount(); i15++) {
                    View childAt2 = premiumPreviewFragment.V.getChildAt(i15);
                    if (childAt2 != vs0Var.e) {
                        childAt2.setTranslationY(0.0f);
                    }
                }
                break;
            case 14:
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
            case 15:
                org.telegram.ui.wq0 wq0Var = (org.telegram.ui.wq0) obj;
                if (wq0Var != null) {
                    wq0Var.a.O0(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                org.telegram.messenger.g0.g3(new org.telegram.ui.ru0(this, 13));
                break;
            case 16:
                ((org.telegram.ui.i11) obj).run();
                org.telegram.ui.s11 s11Var = (org.telegram.ui.s11) obj2;
                org.telegram.ui.i01 i01Var = s11Var.Y0;
                if (i01Var != null) {
                    i01Var.dismiss();
                    s11Var.Y0 = null;
                    break;
                }
                break;
            case 17:
                nb1 nb1Var = (nb1) obj2;
                nb1Var.removeView((p20) obj);
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
            case 18:
                ((Runnable) obj).run();
                hc1 hc1Var = (hc1) obj2;
                hc1Var.f0.setScaleX(1.15f);
                hc1Var.f0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hc1Var.f0.getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f);
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f);
                hc1Var.f0.setVisibility(8);
                break;
            case 19:
                ((r0.m0) obj).c();
                break;
            case 20:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                break;
            case 21:
                tg.s1 s1Var = (tg.s1) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    s1Var.s0.b(s1Var.z0, false);
                }
                s1Var.setRotationY(0.0f);
                s1Var.A0 = 1.0f;
                break;
            case 22:
                ((ug.y0) obj2).w1 = false;
                ((ug.p0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                break;
            case 23:
                ug.h1 h1Var = (ug.h1) obj2;
                h1Var.D2 = false;
                h1Var.C2 = 1.0f;
                h1Var.o2.invalidate();
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
            case 11:
                ((iu0) this.b).setVisibility(0);
                break;
            case 19:
                ((r0.m0) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ h10(Object obj, View view, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = view;
    }

    public h10(hj0 hj0Var, yz yzVar, v4.p0 p0Var) {
        this.a = 3;
        this.c = hj0Var;
        this.b = yzVar;
    }
}
