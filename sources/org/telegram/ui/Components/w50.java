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
import org.telegram.ui.ic1;
import org.telegram.ui.nb1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class w50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w50(int i7, Object obj, Object obj2) {
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
                x50 x50Var = (x50) obj2;
                x50Var.removeView((d20) obj);
                x50Var.c = null;
                x50Var.e.U1 = null;
                x50Var.a = false;
                break;
            case 1:
                pi0 pi0Var = (pi0) obj2;
                si0 si0Var = pi0Var.e;
                if (((ValueAnimator) si0Var.g) != null) {
                    ((qj0) si0Var.e).V1 = false;
                    ArrayList arrayList = pi0Var.b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        View view = (View) obj3;
                        if (view instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) view).c(false, true);
                        }
                        view.setTranslationY(0.0f);
                        ((v4.b0) si0Var.f).getClass();
                        v4.n0.x0(view);
                        ((qj0) si0Var.e).removeView(view);
                        c8.ja jaVar = (c8.ja) si0Var.i;
                        if (jaVar != null) {
                            jaVar.d(view);
                        }
                    }
                    ((qj0) si0Var.e).setScrollEnabled(true);
                    ((qj0) si0Var.e).setVerticalScrollBarEnabled(true);
                    boolean z9 = org.telegram.messenger.r2.a;
                    int childCount = ((qj0) si0Var.e).getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = ((qj0) si0Var.e).getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt).c(false, false);
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
                            ((org.telegram.ui.Cells.p4) view2).c(false, false);
                        }
                        view2.setTranslationY(0.0f);
                    }
                    qi0 qi0Var = pi0Var.d;
                    if (qi0Var != null) {
                        qi0Var.E();
                    }
                    c8.ja jaVar2 = (c8.ja) si0Var.i;
                    if (jaVar2 != null) {
                        jaVar2.a();
                    }
                    ((SparseArray) si0Var.j).clear();
                    si0Var.g = null;
                    break;
                }
                break;
            case 2:
                mz mzVar = (mz) obj;
                mzVar.setAlpha(1.0f);
                v4.n0.x0(mzVar);
                ti0 ti0Var = (ti0) obj2;
                ti0Var.c.remove(mzVar);
                ti0Var.a.removeView(mzVar);
                break;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.xp xpVar = (org.telegram.ui.xp) obj2;
                ((ti0) xpVar.d).g.remove((AnimatorSet) obj);
                if (((ti0) xpVar.d).g.isEmpty()) {
                    ((ti0) xpVar.d).b.clear();
                    ti0 ti0Var2 = (ti0) xpVar.d;
                    ti0Var2.d = true;
                    ti0Var2.a.invalidate();
                    break;
                }
                break;
            case 4:
                cn0 cn0Var = (cn0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(cn0Var.B);
                } catch (Exception unused) {
                }
                w80 w80Var = cn0Var.C;
                if (w80Var != null) {
                    org.telegram.messenger.g0.r(w80Var);
                    break;
                }
                break;
            case 5:
                hv0 hv0Var = (hv0) obj2;
                hv0Var.b = 0.0f;
                hv0Var.invalidate();
                ((sk0) obj).invalidate();
                break;
            case 6:
                org.telegram.ui.Components.voip.b3 b3Var = (org.telegram.ui.Components.voip.b3) obj2;
                b3Var.d.setText((String) obj);
                b3Var.d.setTranslationY(0.0f);
                b3Var.d.setAlpha(1.0f);
                break;
            case 7:
                ((org.telegram.ui.Components.voip.b3) obj2).removeView((org.telegram.ui.Components.voip.a3) obj);
                break;
            case 8:
                View view3 = (View) obj;
                if (view3.getParent() != null) {
                    ((ViewGroup) view3.getParent()).removeView(view3);
                }
                ((org.telegram.ui.yw) obj2).R3 = null;
                break;
            case 9:
                org.telegram.ui.a60 a60Var = (org.telegram.ui.a60) obj2;
                a60Var.removeView((d20) obj);
                a60Var.d = null;
                a60Var.a = null;
                a60Var.b = false;
                break;
            case 10:
                yt0 yt0Var = (yt0) obj2;
                yt0Var.setVisibility(8);
                yt0Var.setX(0.0f);
                break;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                gd0 gd0Var = photoViewer.C1;
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
                animatorSet3.playTogether(ObjectAnimator.ofFloat(gd0Var, gd0Var.E, 0.0f, 1.0f));
                gd0Var.s.setDuration(250L);
                gd0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                gd0Var.s.addListener(new ed0(gd0Var, 0));
                gd0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.z2, photoViewer.c4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(xq.g);
                photoViewer.A2.addListener(new org.telegram.ui.f30(this, 10));
                photoViewer.A2.start();
                break;
            case 12:
                org.telegram.ui.ws0 ws0Var = (org.telegram.ui.ws0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = ws0Var.n;
                ((View) obj).setVisibility(8);
                for (int i14 = 0; i14 < premiumPreviewFragment.U.getChildCount(); i14++) {
                    View childAt2 = premiumPreviewFragment.U.getChildAt(i14);
                    if (childAt2 != ws0Var.e) {
                        childAt2.setTranslationY(0.0f);
                    }
                }
                break;
            case 13:
                org.telegram.ui.zy0 zy0Var = (org.telegram.ui.zy0) obj2;
                if (zy0Var.h != null) {
                    zy0Var.h = null;
                    zy0Var.n.e();
                    ((org.telegram.ui.bw) obj).onTransitionAnimationEnd(true, false);
                    zy0Var.e = 1.0f;
                    zy0Var.g();
                    zy0Var.d(false);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.yq0 yq0Var = (org.telegram.ui.yq0) obj;
                if (yq0Var != null) {
                    yq0Var.a.O0(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                org.telegram.messenger.g0.h3(new org.telegram.ui.tu0(this, 13));
                break;
            case 15:
                ((org.telegram.ui.i11) obj).run();
                org.telegram.ui.s11 s11Var = (org.telegram.ui.s11) obj2;
                org.telegram.ui.i01 i01Var = s11Var.X0;
                if (i01Var != null) {
                    i01Var.dismiss();
                    s11Var.X0 = null;
                    break;
                }
                break;
            case 16:
                nb1 nb1Var = (nb1) obj2;
                nb1Var.removeView((d20) obj);
                nb1Var.e = null;
                nb1Var.a = null;
                nb1Var.b = false;
                UsersSelectActivity usersSelectActivity = nb1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.P.isEmpty()) {
                    usersSelectActivity.c.t(true, true);
                    break;
                }
                break;
            case 17:
                ((Runnable) obj).run();
                ic1 ic1Var = (ic1) obj2;
                ic1Var.e0.setScaleX(1.15f);
                ic1Var.e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ic1Var.e0.getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f);
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f);
                ic1Var.e0.setVisibility(8);
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
                    q1Var.r0.b(q1Var.y0, false);
                }
                q1Var.setRotationY(0.0f);
                q1Var.z0 = 1.0f;
                break;
            case 21:
                ((ti.i) obj2).f((sh.b) obj);
                break;
            case 22:
                ((ug.w0) obj2).s1 = false;
                ((ug.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                break;
            default:
                ug.f1 f1Var = (ug.f1) obj2;
                f1Var.z2 = false;
                f1Var.y2 = 1.0f;
                f1Var.k2.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, org.telegram.messenger.qs.e4);
                    ofInt.addUpdateListener(new v4.e(i10, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 10:
                ((yt0) this.b).setVisibility(0);
                break;
            case 18:
                ((r0.m0) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ w50(Object obj, View view, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = view;
    }

    public w50(ti0 ti0Var, mz mzVar, v4.n0 n0Var) {
        this.a = 2;
        this.c = ti0Var;
        this.b = mzVar;
    }
}
