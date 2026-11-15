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
import org.telegram.ui.ec1;
import org.telegram.ui.jb1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y50(int i7, Object obj, Object obj2) {
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
                z50 z50Var = (z50) obj2;
                z50Var.removeView((f20) obj);
                z50Var.c = null;
                z50Var.e.Y1 = null;
                z50Var.a = false;
                break;
            case 1:
                ti0 ti0Var = (ti0) obj2;
                wi0 wi0Var = ti0Var.e;
                if (((ValueAnimator) wi0Var.g) != null) {
                    ((uj0) wi0Var.e).W1 = false;
                    ArrayList arrayList = ti0Var.b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        View view = (View) obj3;
                        if (view instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) view).b(false, true);
                        }
                        view.setTranslationY(0.0f);
                        ((v4.b0) wi0Var.f).getClass();
                        v4.o0.x0(view);
                        ((uj0) wi0Var.e).removeView(view);
                        c8.ma maVar = (c8.ma) wi0Var.i;
                        if (maVar != null) {
                            maVar.d(view);
                        }
                    }
                    ((uj0) wi0Var.e).setScrollEnabled(true);
                    ((uj0) wi0Var.e).setVerticalScrollBarEnabled(true);
                    boolean z10 = org.telegram.messenger.r2.a;
                    int childCount = ((uj0) wi0Var.e).getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = ((uj0) wi0Var.e).getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt).b(false, false);
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
                        if (view2 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) view2).b(false, false);
                        }
                        view2.setTranslationY(0.0f);
                    }
                    ui0 ui0Var = ti0Var.d;
                    if (ui0Var != null) {
                        ui0Var.E();
                    }
                    c8.ma maVar2 = (c8.ma) wi0Var.i;
                    if (maVar2 != null) {
                        maVar2.a();
                    }
                    ((SparseArray) wi0Var.j).clear();
                    wi0Var.g = null;
                    break;
                }
                break;
            case 2:
                pz pzVar = (pz) obj;
                pzVar.setAlpha(1.0f);
                v4.o0.x0(pzVar);
                xi0 xi0Var = (xi0) obj2;
                xi0Var.c.remove(pzVar);
                xi0Var.a.removeView(pzVar);
                break;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.xp xpVar = (org.telegram.ui.xp) obj2;
                ((xi0) xpVar.d).g.remove((AnimatorSet) obj);
                if (((xi0) xpVar.d).g.isEmpty()) {
                    ((xi0) xpVar.d).b.clear();
                    xi0 xi0Var2 = (xi0) xpVar.d;
                    xi0Var2.d = true;
                    xi0Var2.a.invalidate();
                    break;
                }
                break;
            case 4:
                fn0 fn0Var = (fn0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(fn0Var.B);
                } catch (Exception unused) {
                }
                hh0 hh0Var = fn0Var.C;
                if (hh0Var != null) {
                    org.telegram.messenger.g0.r(hh0Var);
                    break;
                }
                break;
            case 5:
                hv0 hv0Var = (hv0) obj2;
                hv0Var.b = 0.0f;
                hv0Var.invalidate();
                ((wk0) obj).invalidate();
                break;
            case 6:
                org.telegram.ui.Components.voip.f3 f3Var = (org.telegram.ui.Components.voip.f3) obj2;
                f3Var.d.setText((String) obj);
                f3Var.d.setTranslationY(0.0f);
                f3Var.d.setAlpha(1.0f);
                break;
            case 7:
                ((org.telegram.ui.Components.voip.f3) obj2).removeView((org.telegram.ui.Components.voip.e3) obj);
                break;
            case 8:
                View view3 = (View) obj;
                if (view3.getParent() != null) {
                    ((ViewGroup) view3.getParent()).removeView(view3);
                }
                ((org.telegram.ui.yw) obj2).S3 = null;
                break;
            case 9:
                org.telegram.ui.x50 x50Var = (org.telegram.ui.x50) obj2;
                x50Var.removeView((f20) obj);
                x50Var.d = null;
                x50Var.a = null;
                x50Var.b = false;
                break;
            case 10:
                xt0 xt0Var = (xt0) obj2;
                xt0Var.setVisibility(8);
                xt0Var.setX(0.0f);
                break;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                gd0 gd0Var = photoViewer.D1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = gd0Var.e;
                gd0Var.f = bitmap != null;
                imageReceiver.v0(bitmap);
                imageReceiver.G0(0, 0, false);
                AnimatorSet animatorSet = gd0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = gd0Var.w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                gd0Var.h = true;
                gd0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                gd0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(gd0Var, gd0Var.F, 0.0f, 1.0f));
                gd0Var.s.setDuration(250L);
                gd0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                gd0Var.s.addListener(new ed0(gd0Var, 0));
                gd0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.B2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.A2, photoViewer.d4, 0.0f));
                photoViewer.B2.setDuration(85L);
                photoViewer.B2.setInterpolator(er.g);
                photoViewer.B2.addListener(new org.telegram.ui.xx(this, 11));
                photoViewer.B2.start();
                break;
            case 12:
                org.telegram.ui.rs0 rs0Var = (org.telegram.ui.rs0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = rs0Var.n;
                ((View) obj).setVisibility(8);
                for (int i14 = 0; i14 < premiumPreviewFragment.V.getChildCount(); i14++) {
                    View childAt2 = premiumPreviewFragment.V.getChildAt(i14);
                    if (childAt2 != rs0Var.e) {
                        childAt2.setTranslationY(0.0f);
                    }
                }
                break;
            case 13:
                org.telegram.ui.uy0 uy0Var = (org.telegram.ui.uy0) obj2;
                if (uy0Var.h != null) {
                    uy0Var.h = null;
                    uy0Var.n.e();
                    ((org.telegram.ui.bw) obj).onTransitionAnimationEnd(true, false);
                    uy0Var.e = 1.0f;
                    uy0Var.g();
                    uy0Var.d(false);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.uq0 uq0Var = (org.telegram.ui.uq0) obj;
                if (uq0Var != null) {
                    uq0Var.a.O0(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                org.telegram.messenger.g0.h3(new org.telegram.ui.pu0(this, 13));
                break;
            case 15:
                ((org.telegram.ui.d11) obj).run();
                org.telegram.ui.n11 n11Var = (org.telegram.ui.n11) obj2;
                org.telegram.ui.d01 d01Var = n11Var.Y0;
                if (d01Var != null) {
                    d01Var.dismiss();
                    n11Var.Y0 = null;
                    break;
                }
                break;
            case 16:
                jb1 jb1Var = (jb1) obj2;
                jb1Var.removeView((f20) obj);
                jb1Var.e = null;
                jb1Var.a = null;
                jb1Var.b = false;
                UsersSelectActivity usersSelectActivity = jb1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.Q.isEmpty()) {
                    usersSelectActivity.c.t(true, true);
                    break;
                }
                break;
            case 17:
                ((Runnable) obj).run();
                ec1 ec1Var = (ec1) obj2;
                ec1Var.f0.setScaleX(1.15f);
                ec1Var.f0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ec1Var.f0.getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f);
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f);
                ec1Var.f0.setVisibility(8);
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
                ((ug.x0) obj2).w1 = false;
                ((ug.o0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                break;
            case 22:
                ug.g1 g1Var = (ug.g1) obj2;
                g1Var.D2 = false;
                g1Var.C2 = 1.0f;
                g1Var.o2.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, org.telegram.messenger.ns.e4);
                    ofInt.addUpdateListener(new v4.e(i10, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                break;
            default:
                ((wi.h) obj2).f((vg.o) obj);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 10:
                ((xt0) this.b).setVisibility(0);
                break;
            case 18:
                ((r0.m0) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ y50(Object obj, View view, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = view;
    }

    public y50(xi0 xi0Var, pz pzVar, v4.o0 o0Var) {
        this.a = 2;
        this.c = xi0Var;
        this.b = pzVar;
    }
}
