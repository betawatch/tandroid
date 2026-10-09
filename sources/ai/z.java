package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.nd;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.v20;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.vd;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cj;
import org.telegram.ui.gm;
import org.telegram.ui.sn;
import org.telegram.ui.xp;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class z extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.a) {
            case 10:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.c;
                AnimatorSet animatorSet3 = kVar.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar.P = null;
                    break;
                }
                break;
            case 11:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.c;
                if (animator.equals(actionBarLayout.k0)) {
                    actionBarLayout.h0.clear();
                    actionBarLayout.b0.clear();
                    actionBarLayout.c0.clear();
                    actionBarLayout.j0.clear();
                    org.telegram.ui.ActionBar.i6.vl = null;
                    actionBarLayout.i0 = null;
                    actionBarLayout.g0 = null;
                    actionBarLayout.k0 = null;
                    sn snVar = ((org.telegram.ui.ActionBar.c5) this.b).j;
                    if (snVar != null) {
                        snVar.run();
                        break;
                    }
                }
                break;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (animator.equals(chatActivityEnterView.r2)) {
                    chatActivityEnterView.r2 = null;
                    break;
                }
                break;
            case 22:
                yi yiVar = (yi) this.c;
                animatorSet = ((org.telegram.ui.ActionBar.f3) yiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.f3) yiVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.f3) yiVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.f3) yiVar).currentSheetAnimationType = 0;
                        break;
                    }
                }
                break;
            case 24:
                a00 a00Var = (a00) this.c;
                if (animator.equals(a00Var.M0)) {
                    a00Var.M0 = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean[] zArr;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        o1.k kVar;
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                ((a0) obj2).b0.j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 1:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.s0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new a3.d(profileStoriesView, 9), 180L);
                    }
                }
                profileStoriesView.W = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 2:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((ci.c3) obj2).h.h.setVisibility(8);
                return;
            case 3:
                ci.z3 z3Var = (ci.z3) obj2;
                z3Var.c = null;
                z3Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                ci.p pVar = (ci.p) obj2;
                ((qg.c2) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 5:
                ci.ba baVar = (ci.ba) obj2;
                baVar.removeView((d40) obj);
                baVar.h.clear();
                baVar.b = null;
                baVar.c = false;
                ci.ca caVar = (ci.ca) baVar.n;
                caVar.a.setAllowDrawCursor(true);
                ci.m9 m9Var = caVar.f;
                if (m9Var != null) {
                    m9Var.run();
                }
                if (caVar.K) {
                    caVar.fullScroll(130);
                    caVar.K = false;
                    return;
                }
                return;
            case 6:
                ig.g gVar = (ig.g) obj2;
                gVar.b.clear();
                gVar.b.add((kg.d) obj);
                return;
            case 7:
                super.onAnimationEnd(animator);
                ig.g gVar2 = (ig.g) obj2;
                gVar2.c.clear();
                gVar2.c.add((kg.b) obj);
                return;
            case 8:
                ii.e2 e2Var = (ii.e2) obj2;
                e2Var.E = false;
                e2Var.v.setAlpha(1.0f);
                e2Var.v.A1.setVisibility(0);
                e2Var.x.q(AndroidUtilities.dp(22.0f));
                e2Var.x.setAlpha(255);
                hh.f fVar = e2Var.s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                return;
            case 9:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.k0 = null;
                return;
            case 10:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet3 = kVar2.P;
                if (animatorSet3 == null || !animatorSet3.equals(animator)) {
                    return;
                }
                kVar2.P = null;
                org.telegram.ui.ActionBar.j5 j5Var = kVar2.n[0];
                if (j5Var != null) {
                    j5Var.setVisibility(4);
                }
                if (kVar2.r != null && !TextUtils.isEmpty(kVar2.A0)) {
                    kVar2.r.setVisibility(4);
                }
                org.telegram.ui.ActionBar.z zVar = kVar2.E;
                if (zVar != null) {
                    zVar.setVisibility(4);
                }
                if (kVar2.Q == null) {
                    return;
                }
                while (true) {
                    View[] viewArr = kVar2.Q;
                    if (i11 >= viewArr.length) {
                        return;
                    }
                    View view2 = viewArr[i11];
                    if (view2 != null && ((zArr = (boolean[]) obj) == null || i11 >= zArr.length || zArr[i11])) {
                        view2.setVisibility(4);
                    }
                    i11++;
                }
                break;
            case 11:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.l0.unlock();
                if (animator.equals(actionBarLayout.k0)) {
                    actionBarLayout.h0.clear();
                    actionBarLayout.b0.clear();
                    actionBarLayout.c0.clear();
                    actionBarLayout.j0.clear();
                    org.telegram.ui.ActionBar.i6.vl = null;
                    actionBarLayout.i0 = null;
                    actionBarLayout.g0 = null;
                    actionBarLayout.k0 = null;
                    sn snVar = ((org.telegram.ui.ActionBar.c5) obj).j;
                    if (snVar != null) {
                        snVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((ActionBarLayout) obj2).n = false;
                ((org.telegram.ui.ActionBar.n2) obj).onPreviewOpenAnimationEnd();
                return;
            case 13:
                View view3 = (View) obj;
                zn znVar = (zn) obj2;
                znVar.A9 = 0.0f;
                if (animator == znVar.gb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    znVar.Z2 = null;
                    znVar.gb = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) ((gm) obj2).b;
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().x0 = false;
                org.telegram.ui.t0 t0Var = new org.telegram.ui.t0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((v60) obj, (Property<v60, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(u1Var, t0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new org.telegram.ui.t4(this, 21));
                animatorSet4.start();
                return;
            case 15:
                xp xpVar = (xp) obj2;
                xpVar.L = 0.0f;
                xpVar.K = 1.0f;
                ((View) obj).invalidate();
                xpVar.T.invalidate();
                cj cjVar = xpVar.Y;
                if (cjVar != null) {
                    cjVar.run();
                    xpVar.Y = null;
                    return;
                }
                return;
            case 16:
                ((rg) obj2).run();
                return;
            case 17:
                ((org.telegram.ui.Components.gb) obj2).run();
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.r2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.Z0.setVisibility(8);
                    ef efVar = chatActivityEnterView.S0;
                    if (efVar != null) {
                        efVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.r2 = null;
                    chatActivityEnterView.v2 = 0;
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.L3.unlock();
                ((vd) obj).run();
                return;
            case 20:
                ((nd) obj).run();
                ((ChatActivityEnterView) obj2).L3.unlock();
                return;
            case 21:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((vd) obj).run();
                return;
            case 22:
                yi yiVar = (yi) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.f3) yiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.f3) yiVar).currentSheetAnimation;
                    if (!animatorSet2.equals(animator) || (kVar = yiVar.s2) == null || kVar.f) {
                        return;
                    }
                    ((org.telegram.messenger.video.f) obj).run();
                    return;
                }
                return;
            case 23:
                hv hvVar = (hv) obj2;
                if (hvVar.a.e.getVisibility() == 0) {
                    hvVar.a.e.setAlpha(1.0f);
                    hvVar.a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 24:
                qm0 qm0Var = (qm0) obj;
                a00 a00Var = (a00) obj2;
                if (animator.equals(a00Var.M0)) {
                    qm0Var.setTranslationY(0.0f);
                    if (qm0Var == a00Var.D0) {
                        qm0Var.setPadding(0, 0, 0, a00Var.p2);
                    } else if (qm0Var == a00Var.P) {
                        qm0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), a00Var.p2);
                    } else if (qm0Var == a00Var.h0) {
                        qm0Var.setPadding(0, a00Var.b1, 0, a00Var.p2);
                    }
                    a00Var.M0 = null;
                    return;
                }
                return;
            case 25:
                v20 v20Var = (v20) obj2;
                v20Var.removeView((d40) obj);
                v20Var.e.clear();
                v20Var.a = null;
                v20Var.b = false;
                return;
            case 26:
                ArrayList arrayList = (ArrayList) obj;
                v20 v20Var2 = (v20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    v20Var2.removeView((View) arrayList.get(i13));
                }
                v20Var2.e.clear();
                v20Var2.a = null;
                v20Var2.b = false;
                return;
            case 27:
                c80 c80Var = (c80) obj2;
                c80Var.removeView((d40) obj);
                c80Var.c = null;
                c80Var.e.d0 = null;
                c80Var.a = false;
                return;
            case 28:
                ql0 ql0Var = (ql0) obj2;
                tl0 tl0Var = ql0Var.e;
                if (((ValueAnimator) tl0Var.g) == null) {
                    return;
                }
                ((qm0) tl0Var.e).V1 = false;
                ArrayList arrayList2 = ql0Var.b;
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = arrayList2.get(i14);
                    i14++;
                    View view4 = (View) obj3;
                    if (view4 instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) view4).c(false, true);
                    }
                    view4.setTranslationY(0.0f);
                    ((s4.d0) tl0Var.f).getClass();
                    s4.p0.x0(view4);
                    ((qm0) tl0Var.e).removeView(view4);
                    w7.y5 y5Var = (w7.y5) tl0Var.i;
                    if (y5Var != null) {
                        y5Var.d(view4);
                    }
                }
                ((qm0) tl0Var.e).setScrollEnabled(true);
                ((qm0) tl0Var.e).setVerticalScrollBarEnabled(true);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    if (((qm0) tl0Var.e).e.D() != ((qm0) tl0Var.e).getChildCount()) {
                        throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                    }
                    if (((ArrayList) ((qm0) tl0Var.e).e.d).size() != 0) {
                        throw new RuntimeException("hidden child count must be 0");
                    }
                }
                int childCount = ((qm0) tl0Var.e).getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = ((qm0) tl0Var.e).getChildAt(i15);
                    if (childAt instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) childAt).c(false, false);
                    }
                    childAt.setTranslationY(0.0f);
                }
                ArrayList arrayList3 = (ArrayList) obj;
                int size2 = arrayList3.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj4 = arrayList3.get(i16);
                    i16++;
                    View view5 = (View) obj4;
                    if (view5 instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) view5).c(false, false);
                    }
                    view5.setTranslationY(0.0f);
                }
                rl0 rl0Var = ql0Var.d;
                if (rl0Var != null) {
                    rl0Var.E();
                }
                w7.y5 y5Var2 = (w7.y5) tl0Var.i;
                if (y5Var2 != null) {
                    y5Var2.a();
                }
                ((SparseArray) tl0Var.j).clear();
                tl0Var.g = null;
                return;
            default:
                j10 j10Var = (j10) obj;
                j10Var.setAlpha(1.0f);
                s4.p0.x0(j10Var);
                vl0 vl0Var = (vl0) obj2;
                vl0Var.c.remove(j10Var);
                vl0Var.a.removeView(j10Var);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 10:
                ((org.telegram.ui.ActionBar.k) this.c).F.setVisibility(0);
                break;
            case 16:
                ((org.telegram.ui.Components.ib) this.b).run();
                break;
            case 17:
                ((org.telegram.ui.Components.ib) this.b).run();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ z(Runnable runnable, Runnable runnable2, int i10) {
        this.a = i10;
        this.b = runnable;
        this.c = runnable2;
    }

    public z(vl0 vl0Var, j10 j10Var, s4.p0 p0Var) {
        this.a = 29;
        this.c = vl0Var;
        this.b = j10Var;
    }
}
