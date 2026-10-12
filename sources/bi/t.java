package bi;

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
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.z30;
import org.telegram.ui.Components.z70;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.dq;
import org.telegram.ui.fo;
import org.telegram.ui.gj;
import org.telegram.ui.lm;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class t extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t(int i10, Object obj, Object obj2) {
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
                    org.telegram.ui.ActionBar.g6.vl = null;
                    actionBarLayout.i0 = null;
                    actionBarLayout.g0 = null;
                    actionBarLayout.k0 = null;
                    xn xnVar = ((org.telegram.ui.ActionBar.a5) this.b).j;
                    if (xnVar != null) {
                        xnVar.run();
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
                vi viVar = (vi) this.c;
                animatorSet = ((org.telegram.ui.ActionBar.e3) viVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.e3) viVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.e3) viVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.e3) viVar).currentSheetAnimationType = 0;
                        break;
                    }
                }
                break;
            case 24:
                wz wzVar = (wz) this.c;
                if (animator.equals(wzVar.M0)) {
                    wzVar.M0 = null;
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
                ((u) obj2).b0.j0 = null;
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
                        AndroidUtilities.runOnUIThread(new a3.d(profileStoriesView, 20), 180L);
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
                ((di.c3) obj2).h.h.setVisibility(8);
                return;
            case 3:
                di.z3 z3Var = (di.z3) obj2;
                z3Var.c = null;
                z3Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                di.p pVar = (di.p) obj2;
                ((rg.d2) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 5:
                di.aa aaVar = (di.aa) obj2;
                aaVar.removeView((z30) obj);
                aaVar.h.clear();
                aaVar.b = null;
                aaVar.c = false;
                di.ba baVar = (di.ba) aaVar.n;
                baVar.a.setAllowDrawCursor(true);
                di.l9 l9Var = baVar.f;
                if (l9Var != null) {
                    l9Var.run();
                }
                if (baVar.K) {
                    baVar.fullScroll(130);
                    baVar.K = false;
                    return;
                }
                return;
            case 6:
                jg.g gVar = (jg.g) obj2;
                gVar.b.clear();
                gVar.b.add((lg.d) obj);
                return;
            case 7:
                super.onAnimationEnd(animator);
                jg.g gVar2 = (jg.g) obj2;
                gVar2.c.clear();
                gVar2.c.add((lg.b) obj);
                return;
            case 8:
                ji.d2 d2Var = (ji.d2) obj2;
                d2Var.E = false;
                d2Var.v.setAlpha(1.0f);
                d2Var.v.A1.setVisibility(0);
                d2Var.x.q(AndroidUtilities.dp(22.0f));
                d2Var.x.setAlpha(255);
                ih.f fVar = d2Var.s;
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
                org.telegram.ui.ActionBar.h5 h5Var = kVar2.n[0];
                if (h5Var != null) {
                    h5Var.setVisibility(4);
                }
                if (kVar2.r != null && !TextUtils.isEmpty(kVar2.A0)) {
                    kVar2.r.setVisibility(4);
                }
                org.telegram.ui.ActionBar.y yVar = kVar2.E;
                if (yVar != null) {
                    yVar.setVisibility(4);
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
                    org.telegram.ui.ActionBar.g6.vl = null;
                    actionBarLayout.i0 = null;
                    actionBarLayout.g0 = null;
                    actionBarLayout.k0 = null;
                    xn xnVar = ((org.telegram.ui.ActionBar.a5) obj).j;
                    if (xnVar != null) {
                        xnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((ActionBarLayout) obj2).n = false;
                ((org.telegram.ui.ActionBar.m2) obj).onPreviewOpenAnimationEnd();
                return;
            case 13:
                View view3 = (View) obj;
                fo foVar = (fo) obj2;
                foVar.A9 = 0.0f;
                if (animator == foVar.gb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    foVar.Z2 = null;
                    foVar.gb = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) ((lm) obj2).b;
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().x0 = false;
                org.telegram.ui.v0 v0Var = new org.telegram.ui.v0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((r60) obj, (Property<r60, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(u1Var, v0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new org.telegram.ui.u0(this, 24));
                animatorSet4.start();
                return;
            case 15:
                dq dqVar = (dq) obj2;
                dqVar.L = 0.0f;
                dqVar.K = 1.0f;
                ((View) obj).invalidate();
                dqVar.T.invalidate();
                gj gjVar = dqVar.Y;
                if (gjVar != null) {
                    gjVar.run();
                    dqVar.Y = null;
                    return;
                }
                return;
            case 16:
                ((qg) obj2).run();
                return;
            case 17:
                ((org.telegram.ui.Components.fb) obj2).run();
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
                    df dfVar = chatActivityEnterView.S0;
                    if (dfVar != null) {
                        dfVar.setVisibility(8);
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
                ((td) obj).run();
                return;
            case 20:
                ((org.telegram.ui.Components.o8) obj).run();
                ((ChatActivityEnterView) obj2).L3.unlock();
                return;
            case 21:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((td) obj).run();
                return;
            case 22:
                vi viVar = (vi) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.e3) viVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.e3) viVar).currentSheetAnimation;
                    if (!animatorSet2.equals(animator) || (kVar = viVar.s2) == null || kVar.f) {
                        return;
                    }
                    ((n2.h) obj).run();
                    return;
                }
                return;
            case 23:
                dv dvVar = (dv) obj2;
                if (dvVar.a.e.getVisibility() == 0) {
                    dvVar.a.e.setAlpha(1.0f);
                    dvVar.a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 24:
                mm0 mm0Var = (mm0) obj;
                wz wzVar = (wz) obj2;
                if (animator.equals(wzVar.M0)) {
                    mm0Var.setTranslationY(0.0f);
                    if (mm0Var == wzVar.D0) {
                        mm0Var.setPadding(0, 0, 0, wzVar.p2);
                    } else if (mm0Var == wzVar.P) {
                        mm0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), wzVar.p2);
                    } else if (mm0Var == wzVar.h0) {
                        mm0Var.setPadding(0, wzVar.b1, 0, wzVar.p2);
                    }
                    wzVar.M0 = null;
                    return;
                }
                return;
            case 25:
                r20 r20Var = (r20) obj2;
                r20Var.removeView((z30) obj);
                r20Var.e.clear();
                r20Var.a = null;
                r20Var.b = false;
                return;
            case 26:
                ArrayList arrayList = (ArrayList) obj;
                r20 r20Var2 = (r20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    r20Var2.removeView((View) arrayList.get(i13));
                }
                r20Var2.e.clear();
                r20Var2.a = null;
                r20Var2.b = false;
                return;
            case 27:
                z70 z70Var = (z70) obj2;
                z70Var.removeView((z30) obj);
                z70Var.c = null;
                z70Var.e.d0 = null;
                z70Var.a = false;
                return;
            case 28:
                ml0 ml0Var = (ml0) obj2;
                pl0 pl0Var = ml0Var.e;
                if (((ValueAnimator) pl0Var.g) == null) {
                    return;
                }
                ((mm0) pl0Var.e).V1 = false;
                ArrayList arrayList2 = ml0Var.b;
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = arrayList2.get(i14);
                    i14++;
                    View view4 = (View) obj3;
                    if (view4 instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) view4).e(false, true);
                    }
                    view4.setTranslationY(0.0f);
                    ((s4.b0) pl0Var.f).getClass();
                    s4.n0.x0(view4);
                    ((mm0) pl0Var.e).removeView(view4);
                    w7.b6 b6Var = (w7.b6) pl0Var.i;
                    if (b6Var != null) {
                        b6Var.d(view4);
                    }
                }
                ((mm0) pl0Var.e).setScrollEnabled(true);
                ((mm0) pl0Var.e).setVerticalScrollBarEnabled(true);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    if (((mm0) pl0Var.e).e.C() != ((mm0) pl0Var.e).getChildCount()) {
                        throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                    }
                    if (((ArrayList) ((mm0) pl0Var.e).e.d).size() != 0) {
                        throw new RuntimeException("hidden child count must be 0");
                    }
                }
                int childCount = ((mm0) pl0Var.e).getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = ((mm0) pl0Var.e).getChildAt(i15);
                    if (childAt instanceof org.telegram.ui.Cells.o4) {
                        ((org.telegram.ui.Cells.o4) childAt).e(false, false);
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
                        ((org.telegram.ui.Cells.o4) view5).e(false, false);
                    }
                    view5.setTranslationY(0.0f);
                }
                nl0 nl0Var = ml0Var.d;
                if (nl0Var != null) {
                    nl0Var.E();
                }
                w7.b6 b6Var2 = (w7.b6) pl0Var.i;
                if (b6Var2 != null) {
                    b6Var2.a();
                }
                ((SparseArray) pl0Var.j).clear();
                pl0Var.g = null;
                return;
            default:
                f10 f10Var = (f10) obj;
                f10Var.setAlpha(1.0f);
                s4.n0.x0(f10Var);
                rl0 rl0Var = (rl0) obj2;
                rl0Var.c.remove(f10Var);
                rl0Var.a.removeView(f10Var);
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
                ((org.telegram.ui.Components.hb) this.b).run();
                break;
            case 17:
                ((org.telegram.ui.Components.hb) this.b).run();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ t(Runnable runnable, Runnable runnable2, int i10) {
        this.a = i10;
        this.b = runnable;
        this.c = runnable2;
    }

    public t(rl0 rl0Var, f10 f10Var, s4.n0 n0Var) {
        this.a = 29;
        this.c = rl0Var;
        this.b = f10Var;
    }
}
