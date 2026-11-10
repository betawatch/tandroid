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
import org.telegram.ui.jc1;
import org.telegram.ui.ob1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v50(int i7, Object obj, Object obj2) {
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
                w50 w50Var = (w50) obj2;
                w50Var.removeView((c20) obj);
                w50Var.c = null;
                w50Var.e.X1 = null;
                w50Var.a = false;
                break;
            case 1:
                oi0 oi0Var = (oi0) obj2;
                ri0 ri0Var = oi0Var.e;
                if (((ValueAnimator) ri0Var.g) != null) {
                    ((pj0) ri0Var.e).V1 = false;
                    ArrayList arrayList = oi0Var.b;
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
                        ((v4.b0) ri0Var.f).getClass();
                        v4.n0.x0(view);
                        ((pj0) ri0Var.e).removeView(view);
                        c8.ja jaVar = (c8.ja) ri0Var.i;
                        if (jaVar != null) {
                            jaVar.d(view);
                        }
                    }
                    ((pj0) ri0Var.e).setScrollEnabled(true);
                    ((pj0) ri0Var.e).setVerticalScrollBarEnabled(true);
                    boolean z9 = org.telegram.messenger.r2.a;
                    int childCount = ((pj0) ri0Var.e).getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = ((pj0) ri0Var.e).getChildAt(i12);
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
                    pi0 pi0Var = oi0Var.d;
                    if (pi0Var != null) {
                        pi0Var.E();
                    }
                    c8.ja jaVar2 = (c8.ja) ri0Var.i;
                    if (jaVar2 != null) {
                        jaVar2.a();
                    }
                    ((SparseArray) ri0Var.j).clear();
                    ri0Var.g = null;
                    break;
                }
                break;
            case 2:
                lz lzVar = (lz) obj;
                lzVar.setAlpha(1.0f);
                v4.n0.x0(lzVar);
                si0 si0Var = (si0) obj2;
                si0Var.c.remove(lzVar);
                si0Var.a.removeView(lzVar);
                break;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.xp xpVar = (org.telegram.ui.xp) obj2;
                ((si0) xpVar.d).g.remove((AnimatorSet) obj);
                if (((si0) xpVar.d).g.isEmpty()) {
                    ((si0) xpVar.d).b.clear();
                    si0 si0Var2 = (si0) xpVar.d;
                    si0Var2.d = true;
                    si0Var2.a.invalidate();
                    break;
                }
                break;
            case 4:
                bn0 bn0Var = (bn0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(bn0Var.B);
                } catch (Exception unused) {
                }
                r80 r80Var = bn0Var.C;
                if (r80Var != null) {
                    org.telegram.messenger.g0.r(r80Var);
                    break;
                }
                break;
            case 5:
                gv0 gv0Var = (gv0) obj2;
                gv0Var.b = 0.0f;
                gv0Var.invalidate();
                ((rk0) obj).invalidate();
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
                ((org.telegram.ui.zw) obj2).R3 = null;
                break;
            case 9:
                org.telegram.ui.b60 b60Var = (org.telegram.ui.b60) obj2;
                b60Var.removeView((c20) obj);
                b60Var.d = null;
                b60Var.a = null;
                b60Var.b = false;
                break;
            case 10:
                xt0 xt0Var = (xt0) obj2;
                xt0Var.setVisibility(8);
                xt0Var.setX(0.0f);
                break;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                fd0 fd0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = fd0Var.e;
                fd0Var.f = bitmap != null;
                imageReceiver.v0(bitmap);
                imageReceiver.G0(0, 0, false);
                AnimatorSet animatorSet = fd0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = fd0Var.w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                fd0Var.h = true;
                fd0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                fd0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(fd0Var, fd0Var.E, 0.0f, 1.0f));
                fd0Var.s.setDuration(250L);
                fd0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                fd0Var.s.addListener(new dd0(fd0Var, 0));
                fd0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.z2, photoViewer.c4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(wq.g);
                photoViewer.A2.addListener(new org.telegram.ui.g30(this, 10));
                photoViewer.A2.start();
                break;
            case 12:
                org.telegram.ui.xs0 xs0Var = (org.telegram.ui.xs0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = xs0Var.n;
                ((View) obj).setVisibility(8);
                for (int i14 = 0; i14 < premiumPreviewFragment.U.getChildCount(); i14++) {
                    View childAt2 = premiumPreviewFragment.U.getChildAt(i14);
                    if (childAt2 != xs0Var.e) {
                        childAt2.setTranslationY(0.0f);
                    }
                }
                break;
            case 13:
                org.telegram.ui.az0 az0Var = (org.telegram.ui.az0) obj2;
                if (az0Var.h != null) {
                    az0Var.h = null;
                    az0Var.n.e();
                    ((org.telegram.ui.cw) obj).onTransitionAnimationEnd(true, false);
                    az0Var.e = 1.0f;
                    az0Var.g();
                    az0Var.d(false);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.zq0 zq0Var = (org.telegram.ui.zq0) obj;
                if (zq0Var != null) {
                    zq0Var.a.O0(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                org.telegram.messenger.g0.h3(new org.telegram.ui.uu0(this, 13));
                break;
            case 15:
                ((org.telegram.ui.j11) obj).run();
                org.telegram.ui.t11 t11Var = (org.telegram.ui.t11) obj2;
                org.telegram.ui.j01 j01Var = t11Var.X0;
                if (j01Var != null) {
                    j01Var.dismiss();
                    t11Var.X0 = null;
                    break;
                }
                break;
            case 16:
                ob1 ob1Var = (ob1) obj2;
                ob1Var.removeView((c20) obj);
                ob1Var.e = null;
                ob1Var.a = null;
                ob1Var.b = false;
                UsersSelectActivity usersSelectActivity = ob1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.P.isEmpty()) {
                    usersSelectActivity.c.t(true, true);
                    break;
                }
                break;
            case 17:
                ((Runnable) obj).run();
                jc1 jc1Var = (jc1) obj2;
                jc1Var.e0.setScaleX(1.15f);
                jc1Var.e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jc1Var.e0.getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f);
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f);
                jc1Var.e0.setVisibility(8);
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
                ((ug.w0) obj2).v1 = false;
                ((ug.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                break;
            default:
                ug.f1 f1Var = (ug.f1) obj2;
                f1Var.C2 = false;
                f1Var.B2 = 1.0f;
                f1Var.n2.invalidate();
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

    public /* synthetic */ v50(Object obj, View view, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = view;
    }

    public v50(si0 si0Var, lz lzVar, v4.n0 n0Var) {
        this.a = 2;
        this.c = si0Var;
        this.b = lzVar;
    }
}
