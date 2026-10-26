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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ph1;
import org.telegram.ui.rg1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ll0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ll0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 17:
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
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ml0 ml0Var = (ml0) obj2;
                pl0 pl0Var = ml0Var.e;
                if (((ValueAnimator) pl0Var.g) == null) {
                    return;
                }
                ((mm0) pl0Var.e).V1 = false;
                ArrayList arrayList = ml0Var.b;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    View view = (View) obj3;
                    if (view instanceof org.telegram.ui.Cells.s4) {
                        ((org.telegram.ui.Cells.s4) view).b(false, true);
                    }
                    view.setTranslationY(0.0f);
                    ((s4.c0) pl0Var.f).getClass();
                    s4.p0.x0(view);
                    ((mm0) pl0Var.e).removeView(view);
                    gb1 gb1Var = (gb1) pl0Var.i;
                    if (gb1Var != null) {
                        gb1Var.S(view);
                    }
                }
                ((mm0) pl0Var.e).setScrollEnabled(true);
                ((mm0) pl0Var.e).setVerticalScrollBarEnabled(true);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    if (((mm0) pl0Var.e).e.k() != ((mm0) pl0Var.e).getChildCount()) {
                        throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                    }
                    if (((ArrayList) ((mm0) pl0Var.e).e.d).size() != 0) {
                        throw new RuntimeException("hidden child count must be 0");
                    }
                }
                int childCount = ((mm0) pl0Var.e).getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = ((mm0) pl0Var.e).getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.s4) {
                        ((org.telegram.ui.Cells.s4) childAt).b(false, false);
                    }
                    childAt.setTranslationY(0.0f);
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj4 = arrayList2.get(i14);
                    i14++;
                    View view2 = (View) obj4;
                    if (view2 instanceof org.telegram.ui.Cells.s4) {
                        ((org.telegram.ui.Cells.s4) view2).b(false, false);
                    }
                    view2.setTranslationY(0.0f);
                }
                nl0 nl0Var = ml0Var.d;
                if (nl0Var != null) {
                    nl0Var.E();
                }
                gb1 gb1Var2 = (gb1) pl0Var.i;
                if (gb1Var2 != null) {
                    gb1Var2.N();
                }
                ((SparseArray) pl0Var.j).clear();
                pl0Var.g = null;
                return;
            case 1:
                c10 c10Var = (c10) obj;
                c10Var.setAlpha(1.0f);
                s4.p0.x0(c10Var);
                ql0 ql0Var = (ql0) obj2;
                ql0Var.c.remove(c10Var);
                ql0Var.a.removeView(c10Var);
                return;
            case 2:
                super.onAnimationEnd(animator);
                org.telegram.ui.rq rqVar = (org.telegram.ui.rq) obj2;
                ((ql0) rqVar.d).g.remove((AnimatorSet) obj);
                if (((ql0) rqVar.d).g.isEmpty()) {
                    ((ql0) rqVar.d).b.clear();
                    ql0 ql0Var2 = (ql0) rqVar.d;
                    ql0Var2.d = true;
                    ql0Var2.a.invalidate();
                    return;
                }
                return;
            case 3:
                bq0 bq0Var = (bq0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(bq0Var.B);
                } catch (Exception unused) {
                }
                t90 t90Var = bq0Var.C;
                if (t90Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(t90Var);
                    return;
                }
                return;
            case 4:
                jy0 jy0Var = (jy0) obj2;
                jy0Var.b = 0.0f;
                jy0Var.invalidate();
                ((pn0) obj).invalidate();
                return;
            case 5:
                org.telegram.ui.Components.voip.l3 l3Var = (org.telegram.ui.Components.voip.l3) obj2;
                l3Var.d.setText((String) obj);
                l3Var.d.setTranslationY(0.0f);
                l3Var.d.setAlpha(1.0f);
                return;
            case 6:
                ((org.telegram.ui.Components.voip.l3) obj2).removeView((org.telegram.ui.Components.voip.k3) obj);
                return;
            case 7:
                View view3 = (View) obj;
                if (view3.getParent() != null) {
                    ((ViewGroup) view3.getParent()).removeView(view3);
                }
                ((org.telegram.ui.cy) obj2).R3 = null;
                return;
            case 8:
                org.telegram.ui.v70 v70Var = (org.telegram.ui.v70) obj2;
                v70Var.removeView((x30) obj);
                v70Var.d = null;
                v70Var.a = null;
                v70Var.b = false;
                return;
            case 9:
                ax0 ax0Var = (ax0) obj2;
                ax0Var.setVisibility(8);
                ax0Var.setX(0.0f);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                of0 of0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = of0Var.e;
                of0Var.f = bitmap != null;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = of0Var.s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = of0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                of0Var.h = true;
                of0Var.n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                of0Var.s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(of0Var, of0Var.E, 0.0f, 1.0f));
                of0Var.s.setDuration(250L);
                of0Var.s.setInterpolator(new OvershootInterpolator(1.01f));
                of0Var.s.addListener(new mf0(of0Var, 0));
                of0Var.s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.z2, photoViewer.d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(ds.g);
                photoViewer.A2.addListener(new org.telegram.ui.i50(this, 10));
                photoViewer.A2.start();
                return;
            case 11:
                org.telegram.ui.vw0 vw0Var = (org.telegram.ui.vw0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = vw0Var.n;
                ((View) obj).setVisibility(8);
                while (i11 < premiumPreviewFragment.U.getChildCount()) {
                    View childAt2 = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt2 != vw0Var.e) {
                        childAt2.setTranslationY(0.0f);
                    }
                    i11++;
                }
                return;
            case 12:
                org.telegram.ui.e31 e31Var = (org.telegram.ui.e31) obj2;
                if (e31Var.h == null) {
                    return;
                }
                e31Var.h = null;
                e31Var.n.unlock();
                ((org.telegram.ui.ax) obj).onTransitionAnimationEnd(true, false);
                e31Var.e = 1.0f;
                e31Var.g();
                e31Var.d(false);
                return;
            case 13:
                org.telegram.ui.qu0 qu0Var = (org.telegram.ui.qu0) obj;
                if (qu0Var != null) {
                    qu0Var.a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.my0(this, 14));
                return;
            case 14:
                ((org.telegram.ui.s51) obj).run();
                org.telegram.ui.c61 c61Var = (org.telegram.ui.c61) obj2;
                org.telegram.ui.r41 r41Var = c61Var.X0;
                if (r41Var != null) {
                    r41Var.dismiss();
                    c61Var.X0 = null;
                    return;
                }
                return;
            case 15:
                rg1 rg1Var = (rg1) obj2;
                rg1Var.removeView((x30) obj);
                rg1Var.e = null;
                rg1Var.a = null;
                rg1Var.b = false;
                UsersSelectActivity usersSelectActivity = rg1Var.f;
                usersSelectActivity.c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.c.setHintVisible(true, true);
                    return;
                }
                return;
            case 16:
                ((Runnable) obj).run();
                ph1 ph1Var = (ph1) obj2;
                ph1Var.e0.setScaleX(1.15f);
                ph1Var.e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ph1Var.e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                ph1Var.e0.setVisibility(8);
                return;
            case 17:
                ((r0.m0) obj).c();
                return;
            case 18:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 19:
                sg.c2 c2Var = (sg.c2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    c2Var.r0.b(c2Var.y0, false);
                }
                c2Var.setRotationY(0.0f);
                c2Var.z0 = 1.0f;
                return;
            case 20:
                ((tg.y0) obj2).w = false;
                ((tg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 21:
                tg.m1 m1Var = (tg.m1) obj2;
                m1Var.H0 = false;
                m1Var.G0 = 1.0f;
                m1Var.s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new tg.i1(i11, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            default:
                fi.j9 j9Var = (fi.j9) obj2;
                j9Var.removeView((x30) obj);
                j9Var.h.clear();
                j9Var.b = null;
                j9Var.c = false;
                ((zg.i) j9Var.n).b.setAllowDrawCursor(true);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 9:
                ((ax0) this.b).setVisibility(0);
                break;
            case 17:
                ((r0.m0) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ ll0(Object obj, View view, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = view;
    }

    public ll0(ql0 ql0Var, c10 c10Var, s4.p0 p0Var) {
        this.a = 1;
        this.c = ql0Var;
        this.b = c10Var;
    }
}
