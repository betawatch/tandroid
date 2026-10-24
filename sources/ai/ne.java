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
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.yu;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.ln;
import org.telegram.ui.np;
import org.telegram.ui.sn;
import org.telegram.ui.yl;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class ne extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ne(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.a) {
            case 11:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.c;
                AnimatorSet animatorSet3 = kVar.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar.P = null;
                    break;
                }
                break;
            case 12:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.c;
                if (animator.equals(actionBarLayout.q0)) {
                    actionBarLayout.h0.clear();
                    actionBarLayout.b0.clear();
                    actionBarLayout.c0.clear();
                    actionBarLayout.j0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    org.telegram.ui.ActionBar.k6.vl = null;
                    actionBarLayout.i0 = null;
                    actionBarLayout.g0 = null;
                    actionBarLayout.q0 = null;
                    ln lnVar = ((org.telegram.ui.ActionBar.g5) this.b).j;
                    if (lnVar != null) {
                        lnVar.run();
                        break;
                    }
                }
                break;
            case 19:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (animator.equals(chatActivityEnterView.r2)) {
                    chatActivityEnterView.r2 = null;
                    break;
                }
                break;
            case 23:
                ti tiVar = (ti) this.c;
                animatorSet = ((org.telegram.ui.ActionBar.h3) tiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.h3) tiVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.h3) tiVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.h3) tiVar).currentSheetAnimationType = 0;
                        break;
                    }
                }
                break;
            case 25:
                tz tzVar = (tz) this.c;
                if (animator.equals(tzVar.M0)) {
                    tzVar.M0 = null;
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
                pe peVar = (pe) obj2;
                peVar.b.remove((oe) obj);
                peVar.f1();
                return;
            case 1:
                super.onAnimationEnd(animator);
                ((ci.q) obj2).b0.j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 2:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.s0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new androidx.fragment.app.d(profileStoriesView, 13), 180L);
                    }
                }
                profileStoriesView.W = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 3:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((ei.y2) obj2).s.h.setVisibility(8);
                return;
            case 4:
                ei.u3 u3Var = (ei.u3) obj2;
                u3Var.c = null;
                u3Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                ei.p pVar = (ei.p) obj2;
                ((rg.d2) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 6:
                ei.n9 n9Var = (ei.n9) obj2;
                n9Var.removeView((v30) obj);
                n9Var.h.clear();
                n9Var.b = null;
                n9Var.c = false;
                ei.o9 o9Var = (ei.o9) n9Var.n;
                o9Var.b.setAllowDrawCursor(true);
                ei.a9 a9Var = o9Var.h;
                if (a9Var != null) {
                    a9Var.run();
                }
                if (o9Var.L) {
                    o9Var.fullScroll(130);
                    o9Var.L = false;
                    return;
                }
                return;
            case 7:
                jg.g gVar = (jg.g) obj2;
                gVar.b.clear();
                gVar.b.add((lg.d) obj);
                return;
            case 8:
                super.onAnimationEnd(animator);
                jg.g gVar2 = (jg.g) obj2;
                gVar2.c.clear();
                gVar2.c.add((lg.b) obj);
                return;
            case 9:
                ki.d2 d2Var = (ki.d2) obj2;
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
            case 10:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.k0 = null;
                return;
            case 11:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet3 = kVar2.P;
                if (animatorSet3 == null || !animatorSet3.equals(animator)) {
                    return;
                }
                kVar2.P = null;
                org.telegram.ui.ActionBar.n5 n5Var = kVar2.n[0];
                if (n5Var != null) {
                    n5Var.setVisibility(4);
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
            case 12:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.r0.unlock();
                if (animator.equals(actionBarLayout.q0)) {
                    actionBarLayout.h0.clear();
                    actionBarLayout.b0.clear();
                    actionBarLayout.c0.clear();
                    actionBarLayout.j0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    org.telegram.ui.ActionBar.k6.vl = null;
                    actionBarLayout.i0 = null;
                    actionBarLayout.g0 = null;
                    actionBarLayout.q0 = null;
                    ln lnVar = ((org.telegram.ui.ActionBar.g5) obj).j;
                    if (lnVar != null) {
                        lnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((ActionBarLayout) obj2).n = false;
                ((org.telegram.ui.ActionBar.o2) obj).onPreviewOpenAnimationEnd();
                return;
            case 14:
                View view3 = (View) obj;
                sn snVar = (sn) obj2;
                snVar.M9 = 0.0f;
                if (animator == snVar.tb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    snVar.l3 = null;
                    snVar.tb = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) ((yl) obj2).b;
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().x0 = false;
                org.telegram.ui.u0 u0Var = new org.telegram.ui.u0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((p60) obj, (Property<p60, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(t1Var, u0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new m.a(this, 26));
                animatorSet4.start();
                return;
            case 16:
                np npVar = (np) obj2;
                npVar.L = 0.0f;
                npVar.K = 1.0f;
                ((View) obj).invalidate();
                npVar.T.invalidate();
                org.telegram.ui.ti tiVar = npVar.Y;
                if (tiVar != null) {
                    tiVar.run();
                    npVar.Y = null;
                    return;
                }
                return;
            case 17:
                ((pg) obj2).run();
                return;
            case 18:
                ((org.telegram.ui.Components.db) obj2).run();
                return;
            case 19:
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
                    bf bfVar = chatActivityEnterView.S0;
                    if (bfVar != null) {
                        bfVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.r2 = null;
                    chatActivityEnterView.v2 = 0;
                    return;
                }
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.L3.unlock();
                ((org.telegram.ui.Components.rd) obj).run();
                return;
            case 21:
                ((org.telegram.ui.Components.d2) obj).run();
                ((ChatActivityEnterView) obj2).L3.unlock();
                return;
            case 22:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((org.telegram.ui.Components.rd) obj).run();
                return;
            case 23:
                ti tiVar2 = (ti) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.h3) tiVar2).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.h3) tiVar2).currentSheetAnimation;
                    if (!animatorSet2.equals(animator) || (kVar = tiVar2.s2) == null || kVar.f) {
                        return;
                    }
                    ((lg) obj).run();
                    return;
                }
                return;
            case 24:
                yu yuVar = (yu) obj2;
                if (yuVar.a.e.getVisibility() == 0) {
                    yuVar.a.e.setAlpha(1.0f);
                    yuVar.a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 25:
                mm0 mm0Var = (mm0) obj;
                tz tzVar = (tz) obj2;
                if (animator.equals(tzVar.M0)) {
                    mm0Var.setTranslationY(0.0f);
                    if (mm0Var == tzVar.D0) {
                        mm0Var.setPadding(0, 0, 0, tzVar.q2);
                    } else if (mm0Var == tzVar.P) {
                        mm0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), tzVar.q2);
                    } else if (mm0Var == tzVar.h0) {
                        mm0Var.setPadding(0, tzVar.b1, 0, tzVar.q2);
                    }
                    tzVar.M0 = null;
                    return;
                }
                return;
            case 26:
                n20 n20Var = (n20) obj2;
                n20Var.removeView((v30) obj);
                n20Var.e.clear();
                n20Var.a = null;
                n20Var.b = false;
                return;
            case 27:
                ArrayList arrayList = (ArrayList) obj;
                n20 n20Var2 = (n20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    n20Var2.removeView((View) arrayList.get(i13));
                }
                n20Var2.e.clear();
                n20Var2.a = null;
                n20Var2.b = false;
                return;
            case 28:
                w70 w70Var = (w70) obj2;
                w70Var.removeView((v30) obj);
                w70Var.c = null;
                w70Var.e.d0 = null;
                w70Var.a = false;
                return;
            default:
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
                    if (view4 instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) view4).d(false, true);
                    }
                    view4.setTranslationY(0.0f);
                    ((s4.b0) pl0Var.f).getClass();
                    s4.n0.x0(view4);
                    ((mm0) pl0Var.e).removeView(view4);
                    w7.a6 a6Var = (w7.a6) pl0Var.i;
                    if (a6Var != null) {
                        a6Var.d(view4);
                    }
                }
                ((mm0) pl0Var.e).setScrollEnabled(true);
                ((mm0) pl0Var.e).setVerticalScrollBarEnabled(true);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    if (((mm0) pl0Var.e).e.D() != ((mm0) pl0Var.e).getChildCount()) {
                        throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                    }
                    if (((ArrayList) ((mm0) pl0Var.e).e.d).size() != 0) {
                        throw new RuntimeException("hidden child count must be 0");
                    }
                }
                int childCount = ((mm0) pl0Var.e).getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = ((mm0) pl0Var.e).getChildAt(i15);
                    if (childAt instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) childAt).d(false, false);
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
                    if (view5 instanceof org.telegram.ui.Cells.n4) {
                        ((org.telegram.ui.Cells.n4) view5).d(false, false);
                    }
                    view5.setTranslationY(0.0f);
                }
                nl0 nl0Var = ml0Var.d;
                if (nl0Var != null) {
                    nl0Var.E();
                }
                w7.a6 a6Var2 = (w7.a6) pl0Var.i;
                if (a6Var2 != null) {
                    a6Var2.a();
                }
                ((SparseArray) pl0Var.j).clear();
                pl0Var.g = null;
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 11:
                ((org.telegram.ui.ActionBar.k) this.c).F.setVisibility(0);
                break;
            case 17:
                ((org.telegram.ui.Components.fb) this.b).run();
                break;
            case 18:
                ((org.telegram.ui.Components.fb) this.b).run();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ ne(Runnable runnable, Runnable runnable2, int i10) {
        this.a = i10;
        this.b = runnable;
        this.c = runnable2;
    }
}
