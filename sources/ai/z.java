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
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.kd;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.q50;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.sd;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.aj;
import org.telegram.ui.em;
import org.telegram.ui.qn;
import org.telegram.ui.vp;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                    org.telegram.ui.ActionBar.h6.sl = null;
                    actionBarLayout.i0 = null;
                    actionBarLayout.g0 = null;
                    actionBarLayout.k0 = null;
                    qn qnVar = ((org.telegram.ui.ActionBar.b5) this.b).j;
                    if (qnVar != null) {
                        qnVar.run();
                        break;
                    }
                }
                break;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (animator.equals(chatActivityEnterView.q2)) {
                    chatActivityEnterView.q2 = null;
                    break;
                }
                break;
            case 22:
                wi wiVar = (wi) this.c;
                animatorSet = ((org.telegram.ui.ActionBar.f3) wiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.f3) wiVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.f3) wiVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.f3) wiVar).currentSheetAnimationType = 0;
                        break;
                    }
                }
                break;
            case 24:
                lz lzVar = (lz) this.c;
                if (animator.equals(lzVar.M0)) {
                    lzVar.M0 = null;
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
                ((ci.d3) obj2).h.h.setVisibility(8);
                return;
            case 3:
                ci.a4 a4Var = (ci.a4) obj2;
                a4Var.c = null;
                a4Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                ci.p pVar = (ci.p) obj2;
                ((qg.e2) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 5:
                ci.ba baVar = (ci.ba) obj2;
                baVar.removeView((n30) obj);
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
                e2Var.v.z1.setVisibility(0);
                e2Var.x.q(AndroidUtilities.dp(22.0f));
                e2Var.x.setAlpha(255);
                hh.g gVar3 = e2Var.s;
                gVar3.e = true;
                gVar3.invalidate();
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
                org.telegram.ui.ActionBar.i5 i5Var = kVar2.n[0];
                if (i5Var != null) {
                    i5Var.setVisibility(4);
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
                    org.telegram.ui.ActionBar.h6.sl = null;
                    actionBarLayout.i0 = null;
                    actionBarLayout.g0 = null;
                    actionBarLayout.k0 = null;
                    qn qnVar = ((org.telegram.ui.ActionBar.b5) obj).j;
                    if (qnVar != null) {
                        qnVar.run();
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
                xn xnVar = (xn) obj2;
                xnVar.A9 = 0.0f;
                if (animator == xnVar.fb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    xnVar.Z2 = null;
                    xnVar.fb = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) ((em) obj2).b;
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().x0 = false;
                org.telegram.ui.t0 t0Var = new org.telegram.ui.t0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((q50) obj, (Property<q50, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(t1Var, t0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new org.telegram.ui.u4(this, 21));
                animatorSet4.start();
                return;
            case 15:
                vp vpVar = (vp) obj2;
                vpVar.L = 0.0f;
                vpVar.K = 1.0f;
                ((View) obj).invalidate();
                vpVar.T.invalidate();
                aj ajVar = vpVar.Y;
                if (ajVar != null) {
                    ajVar.run();
                    vpVar.Y = null;
                    return;
                }
                return;
            case 16:
                ((og) obj2).run();
                return;
            case 17:
                ((org.telegram.ui.Components.db) obj2).run();
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.P0;
                if (animator.equals(chatActivityEnterView.q2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.Z0.setVisibility(8);
                    bf bfVar = chatActivityEnterView.S0;
                    if (bfVar != null) {
                        bfVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.q2 = null;
                    chatActivityEnterView.u2 = 0;
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.K3.unlock();
                ((sd) obj).run();
                return;
            case 20:
                ((kd) obj).run();
                ((ChatActivityEnterView) obj2).K3.unlock();
                return;
            case 21:
                ((ChatActivityEnterView) obj2).A3 = null;
                ((sd) obj).run();
                return;
            case 22:
                wi wiVar = (wi) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.f3) wiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.f3) wiVar).currentSheetAnimation;
                    if (!animatorSet2.equals(animator) || (kVar = wiVar.p2) == null || kVar.f) {
                        return;
                    }
                    ((org.telegram.ui.ActionBar.p) obj).run();
                    return;
                }
                return;
            case 23:
                su suVar = (su) obj2;
                if (suVar.a.e.getVisibility() == 0) {
                    suVar.a.e.setAlpha(1.0f);
                    suVar.a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 24:
                ml0 ml0Var = (ml0) obj;
                lz lzVar = (lz) obj2;
                if (animator.equals(lzVar.M0)) {
                    ml0Var.setTranslationY(0.0f);
                    if (ml0Var == lzVar.D0) {
                        ml0Var.setPadding(0, 0, 0, lzVar.p2);
                    } else if (ml0Var == lzVar.P) {
                        ml0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), lzVar.p2);
                    } else if (ml0Var == lzVar.h0) {
                        ml0Var.setPadding(0, lzVar.b1, 0, lzVar.p2);
                    }
                    lzVar.M0 = null;
                    return;
                }
                return;
            case 25:
                f20 f20Var = (f20) obj2;
                f20Var.removeView((n30) obj);
                f20Var.e.clear();
                f20Var.a = null;
                f20Var.b = false;
                return;
            case 26:
                ArrayList arrayList = (ArrayList) obj;
                f20 f20Var2 = (f20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    f20Var2.removeView((View) arrayList.get(i13));
                }
                f20Var2.e.clear();
                f20Var2.a = null;
                f20Var2.b = false;
                return;
            case 27:
                b70 b70Var = (b70) obj2;
                b70Var.removeView((n30) obj);
                b70Var.c = null;
                b70Var.e.d0 = null;
                b70Var.a = false;
                return;
            case 28:
                mk0 mk0Var = (mk0) obj2;
                pk0 pk0Var = mk0Var.e;
                if (((ValueAnimator) pk0Var.g) == null) {
                    return;
                }
                ((ml0) pk0Var.e).X1 = false;
                ArrayList arrayList2 = mk0Var.b;
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
                    ((s4.c0) pk0Var.f).getClass();
                    s4.o0.x0(view4);
                    ((ml0) pk0Var.e).removeView(view4);
                    w7.y5 y5Var = (w7.y5) pk0Var.i;
                    if (y5Var != null) {
                        y5Var.d(view4);
                    }
                }
                ((ml0) pk0Var.e).setScrollEnabled(true);
                ((ml0) pk0Var.e).setVerticalScrollBarEnabled(true);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    if (((ml0) pk0Var.e).e.C() != ((ml0) pk0Var.e).getChildCount()) {
                        throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                    }
                    if (((ArrayList) ((ml0) pk0Var.e).e.d).size() != 0) {
                        throw new RuntimeException("hidden child count must be 0");
                    }
                }
                int childCount = ((ml0) pk0Var.e).getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = ((ml0) pk0Var.e).getChildAt(i15);
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
                nk0 nk0Var = mk0Var.d;
                if (nk0Var != null) {
                    nk0Var.E();
                }
                w7.y5 y5Var2 = (w7.y5) pk0Var.i;
                if (y5Var2 != null) {
                    y5Var2.a();
                }
                ((SparseArray) pk0Var.j).clear();
                pk0Var.g = null;
                return;
            default:
                u00 u00Var = (u00) obj;
                u00Var.setAlpha(1.0f);
                s4.o0.x0(u00Var);
                rk0 rk0Var = (rk0) obj2;
                rk0Var.c.remove(u00Var);
                rk0Var.a.removeView(u00Var);
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
                ((org.telegram.ui.Components.fb) this.b).run();
                break;
            case 17:
                ((org.telegram.ui.Components.fb) this.b).run();
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

    public z(rk0 rk0Var, u00 u00Var, s4.o0 o0Var) {
        this.a = 29;
        this.c = rk0Var;
        this.b = u00Var;
    }
}
