package eg;

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
import k7.d6;
import mh.fb;
import mh.gb;
import mh.p6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xk0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.qn;
import org.telegram.ui.s5;
import org.telegram.ui.up;
import org.telegram.ui.wq;
import org.telegram.ui.xn;
import org.telegram.ui.zi;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class w2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w2(int i10, Object obj, Object obj2) {
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
                    k6.sl = null;
                    actionBarLayout.f0 = null;
                    actionBarLayout.d0 = null;
                    actionBarLayout.h0 = null;
                    qn qnVar = ((e5) this.b).j;
                    if (qnVar != null) {
                        qnVar.run();
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
                mi miVar = (mi) this.c;
                animatorSet = ((org.telegram.ui.ActionBar.h3) miVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.h3) miVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.h3) miVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.h3) miVar).currentSheetAnimationType = 0;
                        break;
                    }
                }
                break;
            case 21:
                mz mzVar = (mz) this.c;
                if (animator.equals(mzVar.J0)) {
                    mzVar.J0 = null;
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
        int i11 = 1;
        int i12 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                y2 y2Var = (y2) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    y2Var.o0.b(y2Var.v0, false);
                }
                y2Var.setRotationY(0.0f);
                y2Var.w0 = 1.0f;
                return;
            case 1:
                ((fg.n1) obj2).w = false;
                ((fg.z0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 2:
                fg.d2 d2Var = (fg.d2) obj2;
                d2Var.E0 = false;
                d2Var.D0 = 1.0f;
                d2Var.p0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new bg.a(3, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 3:
                lg.j jVar2 = (lg.j) obj2;
                jVar2.removeView((p30) obj);
                jVar2.h.clear();
                jVar2.b = null;
                jVar2.c = false;
                ((lg.k) jVar2.n).b.setAllowDrawCursor(true);
                return;
            case 4:
                gb gbVar = (gb) obj2;
                gbVar.b.remove((fb) obj);
                gbVar.M();
                return;
            case 5:
                super.onAnimationEnd(animator);
                ((oh.o) obj2).V.g0 = null;
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
                        AndroidUtilities.runOnUIThread(new oh.t3(profileStoriesView, i11), 180L);
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
                l5 l5Var = kVar.n[0];
                if (l5Var != null) {
                    l5Var.setVisibility(4);
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
                    k6.sl = null;
                    actionBarLayout.f0 = null;
                    actionBarLayout.d0 = null;
                    actionBarLayout.h0 = null;
                    qn qnVar = ((e5) obj).j;
                    if (qnVar != null) {
                        qnVar.run();
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
                xn xnVar = (xn) obj2;
                xnVar.x9 = 0.0f;
                if (animator == xnVar.db) {
                    ViewGroup viewGroup = (ViewGroup) view2.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view2);
                    }
                    xnVar.W2 = null;
                    xnVar.db = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) ((ih.f) obj2).b;
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().x0 = false;
                org.telegram.ui.u0 u0Var = new org.telegram.ui.u0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((t50) obj, (Property<t50, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(t1Var, u0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new s5(this, 20));
                animatorSet4.start();
                return;
            case 12:
                up upVar = (up) obj2;
                upVar.I = 0.0f;
                upVar.H = 1.0f;
                ((View) obj).invalidate();
                upVar.Q.invalidate();
                zi ziVar = upVar.V;
                if (ziVar != null) {
                    ziVar.run();
                    upVar.V = null;
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
                ((af.b) obj).run();
                ((ChatActivityEnterView) obj2).H3.unlock();
                return;
            case 18:
                ((ChatActivityEnterView) obj2).x3 = null;
                ((id) obj).run();
                return;
            case 19:
                mi miVar = (mi) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.h3) miVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.h3) miVar).currentSheetAnimation;
                    if (!animatorSet2.equals(animator) || (jVar = miVar.m2) == null || jVar.f) {
                        return;
                    }
                    ((p6) obj).run();
                    return;
                }
                return;
            case 20:
                nu nuVar = (nu) obj2;
                if (nuVar.a.e.getVisibility() == 0) {
                    nuVar.a.e.setAlpha(1.0f);
                    nuVar.a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 21:
                tl0 tl0Var = (tl0) obj;
                mz mzVar = (mz) obj2;
                if (animator.equals(mzVar.J0)) {
                    tl0Var.setTranslationY(0.0f);
                    if (tl0Var == mzVar.A0) {
                        tl0Var.setPadding(0, 0, 0, mzVar.n2);
                    } else if (tl0Var == mzVar.M) {
                        tl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), mzVar.n2);
                    } else if (tl0Var == mzVar.e0) {
                        tl0Var.setPadding(0, mzVar.Y0, 0, mzVar.n2);
                    }
                    mzVar.J0 = null;
                    return;
                }
                return;
            case 22:
                g20 g20Var = (g20) obj2;
                g20Var.removeView((p30) obj);
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
                d70 d70Var = (d70) obj2;
                d70Var.removeView((p30) obj);
                d70Var.c = null;
                d70Var.e.a0 = null;
                d70Var.a = false;
                return;
            case 25:
                xk0 xk0Var = (xk0) obj2;
                c2.y yVar = xk0Var.e;
                if (((ValueAnimator) yVar.g) == null) {
                    return;
                }
                ((tl0) yVar.e).U1 = false;
                ArrayList arrayList2 = xk0Var.b;
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj3 = arrayList2.get(i15);
                    i15++;
                    View view3 = (View) obj3;
                    if (view3 instanceof o4) {
                        ((o4) view3).c(false, true);
                    }
                    view3.setTranslationY(0.0f);
                    ((f2.j0) yVar.f).getClass();
                    f2.w0.x0(view3);
                    ((tl0) yVar.e).removeView(view3);
                    d6 d6Var = (d6) yVar.i;
                    if (d6Var != null) {
                        d6Var.d(view3);
                    }
                }
                ((tl0) yVar.e).setScrollEnabled(true);
                ((tl0) yVar.e).setVerticalScrollBarEnabled(true);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    if (((tl0) yVar.e).e.p() != ((tl0) yVar.e).getChildCount()) {
                        throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                    }
                    if (((ArrayList) ((tl0) yVar.e).e.d).size() != 0) {
                        throw new RuntimeException("hidden child count must be 0");
                    }
                }
                int childCount = ((tl0) yVar.e).getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = ((tl0) yVar.e).getChildAt(i16);
                    if (childAt instanceof o4) {
                        ((o4) childAt).c(false, false);
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
                    if (view4 instanceof o4) {
                        ((o4) view4).c(false, false);
                    }
                    view4.setTranslationY(0.0f);
                }
                yk0 yk0Var = xk0Var.d;
                if (yk0Var != null) {
                    yk0Var.E();
                }
                d6 d6Var2 = (d6) yVar.i;
                if (d6Var2 != null) {
                    d6Var2.a();
                }
                ((SparseArray) yVar.j).clear();
                yVar.g = null;
                return;
            case 26:
                u00 u00Var = (u00) obj;
                u00Var.setAlpha(1.0f);
                f2.w0.x0(u00Var);
                al0 al0Var = (al0) obj2;
                al0Var.c.remove(u00Var);
                al0Var.a.removeView(u00Var);
                return;
            case 27:
                super.onAnimationEnd(animator);
                wq wqVar = (wq) obj2;
                ((al0) wqVar.d).g.remove((AnimatorSet) obj);
                if (((al0) wqVar.d).g.isEmpty()) {
                    ((al0) wqVar.d).b.clear();
                    al0 al0Var2 = (al0) wqVar.d;
                    al0Var2.d = true;
                    al0Var2.a.invalidate();
                    return;
                }
                return;
            case 28:
                ap0 ap0Var = (ap0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(ap0Var.B);
                } catch (Exception unused) {
                }
                a90 a90Var = ap0Var.C;
                if (a90Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(a90Var);
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

    public /* synthetic */ w2(Runnable runnable, Runnable runnable2, int i10) {
        this.a = i10;
        this.b = runnable;
        this.c = runnable2;
    }

    public w2(al0 al0Var, u00 u00Var, f2.w0 w0Var) {
        this.a = 26;
        this.c = al0Var;
        this.b = u00Var;
    }
}
