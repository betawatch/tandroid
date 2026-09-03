package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import java.util.ArrayList;
import k7.c6;
import lh.fb;
import lh.gb;
import lh.p6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.Components.z80;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bj;
import org.telegram.ui.sn;
import org.telegram.ui.u5;
import org.telegram.ui.vp;
import org.telegram.ui.xq;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class y2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.a) {
            case 7:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.c;
                AnimatorSet animatorSet3 = kVar.M;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar.M = null;
                    break;
                }
                break;
            case 8:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.c;
                if (animator.equals(actionBarLayout.h0)) {
                    actionBarLayout.e0.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.W.clear();
                    actionBarLayout.g0.clear();
                    j6.sl = null;
                    actionBarLayout.f0 = null;
                    actionBarLayout.d0 = null;
                    actionBarLayout.h0 = null;
                    sn snVar = ((d5) this.b).j;
                    if (snVar != null) {
                        snVar.run();
                        break;
                    }
                }
                break;
            case 15:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (animator.equals(chatActivityEnterView.n2)) {
                    chatActivityEnterView.n2 = null;
                    break;
                }
                break;
            case 19:
                li liVar = (li) this.c;
                animatorSet = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimationType = 0;
                        break;
                    }
                }
                break;
            case 21:
                kz kzVar = (kz) this.c;
                if (animator.equals(kzVar.J0)) {
                    kzVar.J0 = null;
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
        o1.j jVar;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                a3 a3Var = (a3) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    a3Var.o0.b(a3Var.v0, false);
                }
                a3Var.setRotationY(0.0f);
                a3Var.w0 = 1.0f;
                return;
            case 1:
                ((eg.o1) obj2).w = false;
                ((eg.z0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 2:
                eg.e2 e2Var = (eg.e2) obj2;
                e2Var.E0 = false;
                e2Var.D0 = 1.0f;
                e2Var.p0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new ag.a(i11, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 3:
                kg.j jVar2 = (kg.j) obj2;
                jVar2.removeView((o30) obj);
                jVar2.h.clear();
                jVar2.b = null;
                jVar2.c = false;
                ((kg.k) jVar2.n).b.setAllowDrawCursor(true);
                return;
            case 4:
                gb gbVar = (gb) obj2;
                gbVar.b.remove((fb) obj);
                gbVar.M();
                return;
            case 5:
                super.onAnimationEnd(animator);
                ((nh.p) obj2).V.g0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 6:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr3 = (boolean[]) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    int i13 = ProfileStoriesView.p0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new lh.b(profileStoriesView, 28), 180L);
                    }
                }
                profileStoriesView.T = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 7:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet3 = kVar.M;
                if (animatorSet3 == null || !animatorSet3.equals(animator)) {
                    return;
                }
                kVar.M = null;
                k5 k5Var = kVar.n[0];
                if (k5Var != null) {
                    k5Var.setVisibility(4);
                }
                if (kVar.r != null && !TextUtils.isEmpty(kVar.x0)) {
                    kVar.r.setVisibility(4);
                }
                org.telegram.ui.ActionBar.z zVar = kVar.B;
                if (zVar != null) {
                    zVar.setVisibility(4);
                }
                if (kVar.N == null) {
                    return;
                }
                while (true) {
                    View[] viewArr = kVar.N;
                    if (i12 >= viewArr.length) {
                        return;
                    }
                    View view = viewArr[i12];
                    if (view != null && ((zArr = (boolean[]) obj) == null || i12 >= zArr.length || zArr[i12])) {
                        view.setVisibility(4);
                    }
                    i12++;
                }
                break;
            case 8:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.i0.unlock();
                if (animator.equals(actionBarLayout.h0)) {
                    actionBarLayout.e0.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.W.clear();
                    actionBarLayout.g0.clear();
                    j6.sl = null;
                    actionBarLayout.f0 = null;
                    actionBarLayout.d0 = null;
                    actionBarLayout.h0 = null;
                    sn snVar = ((d5) obj).j;
                    if (snVar != null) {
                        snVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((ActionBarLayout) obj2).n = false;
                ((org.telegram.ui.ActionBar.p2) obj).onPreviewOpenAnimationEnd();
                return;
            case 10:
                View view2 = (View) obj;
                zn znVar = (zn) obj2;
                znVar.x9 = 0.0f;
                if (animator == znVar.db) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view2);
                    }
                    znVar.W2 = null;
                    znVar.db = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) ((hh.f) obj2).b;
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().x0 = false;
                org.telegram.ui.w0 w0Var = new org.telegram.ui.w0("alpha", i11);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((s50) obj, (Property<s50, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(s1Var, w0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new u5(this, 20));
                animatorSet4.start();
                return;
            case 12:
                vp vpVar = (vp) obj2;
                vpVar.I = 0.0f;
                vpVar.H = 1.0f;
                ((View) obj).invalidate();
                vpVar.Q.invalidate();
                bj bjVar = vpVar.V;
                if (bjVar != null) {
                    bjVar.run();
                    vpVar.V = null;
                    return;
                }
                return;
            case 13:
                ((fg) obj2).run();
                return;
            case 14:
                ((ua) obj2).run();
                return;
            case 15:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.M0;
                if (animator.equals(chatActivityEnterView.n2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.W0.setVisibility(8);
                    se seVar = chatActivityEnterView.P0;
                    if (seVar != null) {
                        seVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.n2 = null;
                    chatActivityEnterView.r2 = 0;
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.S0 = null;
                chatActivityEnterView2.H3.unlock();
                ((id) obj).run();
                return;
            case 17:
                ((ah.b) obj).run();
                ((ChatActivityEnterView) obj2).H3.unlock();
                return;
            case 18:
                ((ChatActivityEnterView) obj2).x3 = null;
                ((id) obj).run();
                return;
            case 19:
                li liVar = (li) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimation;
                    if (!animatorSet2.equals(animator) || (jVar = liVar.m2) == null || jVar.f) {
                        return;
                    }
                    ((p6) obj).run();
                    return;
                }
                return;
            case 20:
                ku kuVar = (ku) obj2;
                if (kuVar.a.e.getVisibility() == 0) {
                    kuVar.a.e.setAlpha(1.0f);
                    kuVar.a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 21:
                rl0 rl0Var = (rl0) obj;
                kz kzVar = (kz) obj2;
                if (animator.equals(kzVar.J0)) {
                    rl0Var.setTranslationY(0.0f);
                    if (rl0Var == kzVar.A0) {
                        rl0Var.setPadding(0, 0, 0, kzVar.n2);
                    } else if (rl0Var == kzVar.M) {
                        rl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), kzVar.n2);
                    } else if (rl0Var == kzVar.e0) {
                        rl0Var.setPadding(0, kzVar.Y0, 0, kzVar.n2);
                    }
                    kzVar.J0 = null;
                    return;
                }
                return;
            case 22:
                g20 g20Var = (g20) obj2;
                g20Var.removeView((o30) obj);
                g20Var.e.clear();
                g20Var.a = null;
                g20Var.b = false;
                return;
            case 23:
                ArrayList arrayList = (ArrayList) obj;
                g20 g20Var2 = (g20) obj2;
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    g20Var2.removeView((View) arrayList.get(i14));
                }
                g20Var2.e.clear();
                g20Var2.a = null;
                g20Var2.b = false;
                return;
            case 24:
                c70 c70Var = (c70) obj2;
                c70Var.removeView((o30) obj);
                c70Var.c = null;
                c70Var.e.a0 = null;
                c70Var.a = false;
                return;
            case 25:
                vk0 vk0Var = (vk0) obj2;
                c2.z zVar2 = vk0Var.e;
                if (((ValueAnimator) zVar2.g) == null) {
                    return;
                }
                ((rl0) zVar2.e).U1 = false;
                ArrayList arrayList2 = vk0Var.b;
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj3 = arrayList2.get(i15);
                    i15++;
                    View view3 = (View) obj3;
                    if (view3 instanceof n4) {
                        ((n4) view3).c(false, true);
                    }
                    view3.setTranslationY(0.0f);
                    ((f2.i0) zVar2.f).getClass();
                    f2.v0.x0(view3);
                    ((rl0) zVar2.e).removeView(view3);
                    c6 c6Var = (c6) zVar2.i;
                    if (c6Var != null) {
                        c6Var.d(view3);
                    }
                }
                ((rl0) zVar2.e).setScrollEnabled(true);
                ((rl0) zVar2.e).setVerticalScrollBarEnabled(true);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    if (((rl0) zVar2.e).e.p() != ((rl0) zVar2.e).getChildCount()) {
                        throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                    }
                    if (((ArrayList) ((rl0) zVar2.e).e.d).size() != 0) {
                        throw new RuntimeException("hidden child count must be 0");
                    }
                }
                int childCount = ((rl0) zVar2.e).getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = ((rl0) zVar2.e).getChildAt(i16);
                    if (childAt instanceof n4) {
                        ((n4) childAt).c(false, false);
                    }
                    childAt.setTranslationY(0.0f);
                }
                ArrayList arrayList3 = (ArrayList) obj;
                int size2 = arrayList3.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj4 = arrayList3.get(i17);
                    i17++;
                    View view4 = (View) obj4;
                    if (view4 instanceof n4) {
                        ((n4) view4).c(false, false);
                    }
                    view4.setTranslationY(0.0f);
                }
                wk0 wk0Var = vk0Var.d;
                if (wk0Var != null) {
                    wk0Var.E();
                }
                c6 c6Var2 = (c6) zVar2.i;
                if (c6Var2 != null) {
                    c6Var2.a();
                }
                ((SparseArray) zVar2.j).clear();
                zVar2.g = null;
                return;
            case 26:
                u00 u00Var = (u00) obj;
                u00Var.setAlpha(1.0f);
                f2.v0.x0(u00Var);
                yk0 yk0Var = (yk0) obj2;
                yk0Var.c.remove(u00Var);
                yk0Var.a.removeView(u00Var);
                return;
            case 27:
                super.onAnimationEnd(animator);
                xq xqVar = (xq) obj2;
                ((yk0) xqVar.d).g.remove((AnimatorSet) obj);
                if (((yk0) xqVar.d).g.isEmpty()) {
                    ((yk0) xqVar.d).b.clear();
                    yk0 yk0Var2 = (yk0) xqVar.d;
                    yk0Var2.d = true;
                    yk0Var2.a.invalidate();
                    return;
                }
                return;
            case 28:
                yo0 yo0Var = (yo0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(yo0Var.B);
                } catch (Exception unused) {
                }
                z80 z80Var = yo0Var.C;
                if (z80Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(z80Var);
                    return;
                }
                return;
            default:
                androidx.activity.g gVar = (androidx.activity.g) obj2;
                qv0 qv0Var = (qv0) gVar.c;
                qv0Var.c0 = 1.0f;
                qv0Var.P.add((mv0) obj);
                ((qv0) gVar.c).U.setShader(null);
                ((qv0) gVar.c).W.setShader(null);
                ((qv0) gVar.c).N();
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 7:
                ((org.telegram.ui.ActionBar.k) this.c).C.setVisibility(0);
                break;
            case 13:
                ((wa) this.b).run();
                break;
            case 14:
                ((wa) this.b).run();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ y2(Runnable runnable, Runnable runnable2, int i10) {
        this.a = i10;
        this.b = runnable;
        this.c = runnable2;
    }

    public y2(yk0 yk0Var, u00 u00Var, f2.v0 v0Var) {
        this.a = 26;
        this.c = yk0Var;
        this.b = u00Var;
    }
}
