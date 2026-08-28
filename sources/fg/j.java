package fg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import c2.y;
import f2.m0;
import f2.z0;
import gh.kb;
import gh.lb;
import ih.q;
import java.util.ArrayList;
import kh.c9;
import kh.q9;
import kh.u3;
import kh.y2;
import mh.x;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.jn;
import org.telegram.ui.kp;
import org.telegram.ui.nq;
import org.telegram.ui.qn;
import org.telegram.ui.ri;
import org.telegram.ui.v0;
import yf.b2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        switch (this.a) {
            case 8:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.c;
                AnimatorSet animatorSet3 = kVar.L;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar.L = null;
                    break;
                }
                break;
            case 9:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.c;
                if (animator.equals(actionBarLayout.g0)) {
                    actionBarLayout.d0.clear();
                    actionBarLayout.U.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.f0.clear();
                    f6.sl = null;
                    actionBarLayout.e0 = null;
                    actionBarLayout.c0 = null;
                    actionBarLayout.g0 = null;
                    jn jnVar = ((a5) this.b).j;
                    if (jnVar != null) {
                        jnVar.run();
                        break;
                    }
                }
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (animator.equals(chatActivityEnterView.m2)) {
                    chatActivityEnterView.m2 = null;
                    break;
                }
                break;
            case 20:
                ki kiVar = (ki) this.c;
                animatorSet = ((f3) kiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((f3) kiVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((f3) kiVar).currentSheetAnimation = null;
                        ((f3) kiVar).currentSheetAnimationType = 0;
                        break;
                    }
                }
                break;
            case 22:
                wy wyVar = (wy) this.c;
                if (animator.equals(wyVar.I0)) {
                    wyVar.I0 = null;
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
        int i9 = this.a;
        int i10 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i9) {
            case 0:
                l lVar = (l) obj2;
                lVar.removeView((w20) obj);
                lVar.h.clear();
                lVar.b = null;
                lVar.c = false;
                ((m) lVar.n).b.setAllowDrawCursor(true);
                return;
            case 1:
                lb lbVar = (lb) obj2;
                lbVar.b.remove((kb) obj);
                lbVar.R();
                return;
            case 2:
                super.onAnimationEnd(animator);
                ((q) obj2).U.f0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i11 = ProfileStoriesView.o0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new ih.g(profileStoriesView, 7), 180L);
                    }
                }
                profileStoriesView.S = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 4:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((y2) obj2).h.h.setVisibility(8);
                return;
            case 5:
                u3 u3Var = (u3) obj2;
                u3Var.c = null;
                u3Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                kh.q qVar = (kh.q) obj2;
                ((b2) obj).setDraw(true);
                if (qVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) qVar.getParent()).removeView(qVar);
                    return;
                }
                return;
            case 7:
                l lVar2 = (l) obj2;
                lVar2.removeView((w20) obj);
                lVar2.h.clear();
                lVar2.b = null;
                lVar2.c = false;
                q9 q9Var = (q9) lVar2.n;
                q9Var.a.setAllowDrawCursor(true);
                c9 c9Var = q9Var.f;
                if (c9Var != null) {
                    c9Var.run();
                }
                if (q9Var.G) {
                    q9Var.fullScroll(130);
                    q9Var.G = false;
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet3 = kVar.L;
                if (animatorSet3 == null || !animatorSet3.equals(animator)) {
                    return;
                }
                kVar.L = null;
                h5 h5Var = kVar.n[0];
                if (h5Var != null) {
                    h5Var.setVisibility(4);
                }
                if (kVar.r != null && !TextUtils.isEmpty(kVar.w0)) {
                    kVar.r.setVisibility(4);
                }
                z zVar = kVar.A;
                if (zVar != null) {
                    zVar.setVisibility(4);
                }
                if (kVar.M == null) {
                    return;
                }
                while (true) {
                    View[] viewArr = kVar.M;
                    if (i10 >= viewArr.length) {
                        return;
                    }
                    View view2 = viewArr[i10];
                    if (view2 != null && ((zArr = (boolean[]) obj) == null || i10 >= zArr.length || zArr[i10])) {
                        view2.setVisibility(4);
                    }
                    i10++;
                }
                break;
            case 9:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.h0.unlock();
                if (animator.equals(actionBarLayout.g0)) {
                    actionBarLayout.d0.clear();
                    actionBarLayout.U.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.f0.clear();
                    f6.sl = null;
                    actionBarLayout.e0 = null;
                    actionBarLayout.c0 = null;
                    actionBarLayout.g0 = null;
                    jn jnVar = ((a5) obj).j;
                    if (jnVar != null) {
                        jnVar.run();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((ActionBarLayout) obj2).n = false;
                ((o2) obj).onPreviewOpenAnimationEnd();
                return;
            case 11:
                View view3 = (View) obj;
                qn qnVar = (qn) obj2;
                qnVar.w9 = 0.0f;
                if (animator == qnVar.cb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    qnVar.V2 = null;
                    qnVar.cb = null;
                    return;
                }
                return;
            case 12:
                t1 t1Var = (t1) ((ch.f) obj2).b;
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().x0 = false;
                v0 v0Var = new v0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((y40) obj, (Property<y40, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(t1Var, v0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new x(this, 27));
                animatorSet4.start();
                return;
            case 13:
                kp kpVar = (kp) obj2;
                kpVar.H = 0.0f;
                kpVar.G = 1.0f;
                ((View) obj).invalidate();
                kpVar.P.invalidate();
                ri riVar = kpVar.U;
                if (riVar != null) {
                    riVar.run();
                    kpVar.U = null;
                    return;
                }
                return;
            case 14:
                ((fg) obj2).run();
                return;
            case 15:
                ((ua) obj2).run();
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.L0;
                if (animator.equals(chatActivityEnterView.m2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    se seVar = chatActivityEnterView.O0;
                    if (seVar != null) {
                        seVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.m2 = null;
                    chatActivityEnterView.q2 = 0;
                    return;
                }
                return;
            case 17:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.R0 = null;
                chatActivityEnterView2.G3.unlock();
                ((hd) obj).run();
                return;
            case 18:
                ((qd) obj).run();
                ((ChatActivityEnterView) obj2).G3.unlock();
                return;
            case 19:
                ((ChatActivityEnterView) obj2).w3 = null;
                ((hd) obj).run();
                return;
            case 20:
                ki kiVar = (ki) obj2;
                animatorSet = ((f3) kiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((f3) kiVar).currentSheetAnimation;
                    if (!animatorSet2.equals(animator) || (jVar = kiVar.l2) == null || jVar.f) {
                        return;
                    }
                    ((org.telegram.messenger.video.e) obj).run();
                    return;
                }
                return;
            case 21:
                cu cuVar = (cu) obj2;
                if (cuVar.a.e.getVisibility() == 0) {
                    cuVar.a.e.setAlpha(1.0f);
                    cuVar.a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 22:
                wk0 wk0Var = (wk0) obj;
                wy wyVar = (wy) obj2;
                if (animator.equals(wyVar.I0)) {
                    wk0Var.setTranslationY(0.0f);
                    if (wk0Var == wyVar.z0) {
                        wk0Var.setPadding(0, 0, 0, wyVar.m2);
                    } else if (wk0Var == wyVar.L) {
                        wk0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), wyVar.m2);
                    } else if (wk0Var == wyVar.d0) {
                        wk0Var.setPadding(0, wyVar.X0, 0, wyVar.m2);
                    }
                    wyVar.I0 = null;
                    return;
                }
                return;
            case 23:
                p10 p10Var = (p10) obj2;
                p10Var.removeView((w20) obj);
                p10Var.e.clear();
                p10Var.a = null;
                p10Var.b = false;
                return;
            case 24:
                ArrayList arrayList = (ArrayList) obj;
                p10 p10Var2 = (p10) obj2;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    p10Var2.removeView((View) arrayList.get(i12));
                }
                p10Var2.e.clear();
                p10Var2.a = null;
                p10Var2.b = false;
                return;
            case 25:
                j60 j60Var = (j60) obj2;
                j60Var.removeView((w20) obj);
                j60Var.c = null;
                j60Var.e.Z = null;
                j60Var.a = false;
                return;
            case 26:
                ak0 ak0Var = (ak0) obj2;
                y yVar = ak0Var.e;
                if (((ValueAnimator) yVar.g) == null) {
                    return;
                }
                ((wk0) yVar.e).T1 = false;
                ArrayList arrayList2 = ak0Var.b;
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj3 = arrayList2.get(i13);
                    i13++;
                    View view4 = (View) obj3;
                    if (view4 instanceof o4) {
                        ((o4) view4).c(false, true);
                    }
                    view4.setTranslationY(0.0f);
                    ((m0) yVar.f).getClass();
                    z0.x0(view4);
                    ((wk0) yVar.e).removeView(view4);
                    g7.f6 f6Var = (g7.f6) yVar.i;
                    if (f6Var != null) {
                        f6Var.d(view4);
                    }
                }
                ((wk0) yVar.e).setScrollEnabled(true);
                ((wk0) yVar.e).setVerticalScrollBarEnabled(true);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    if (((wk0) yVar.e).e.q() != ((wk0) yVar.e).getChildCount()) {
                        throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                    }
                    if (((ArrayList) ((wk0) yVar.e).e.d).size() != 0) {
                        throw new RuntimeException("hidden child count must be 0");
                    }
                }
                int childCount = ((wk0) yVar.e).getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = ((wk0) yVar.e).getChildAt(i14);
                    if (childAt instanceof o4) {
                        ((o4) childAt).c(false, false);
                    }
                    childAt.setTranslationY(0.0f);
                }
                ArrayList arrayList3 = (ArrayList) obj;
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj4 = arrayList3.get(i15);
                    i15++;
                    View view5 = (View) obj4;
                    if (view5 instanceof o4) {
                        ((o4) view5).c(false, false);
                    }
                    view5.setTranslationY(0.0f);
                }
                bk0 bk0Var = ak0Var.d;
                if (bk0Var != null) {
                    bk0Var.E();
                }
                g7.f6 f6Var2 = (g7.f6) yVar.i;
                if (f6Var2 != null) {
                    f6Var2.a();
                }
                ((SparseArray) yVar.j).clear();
                yVar.g = null;
                return;
            case 27:
                e00 e00Var = (e00) obj;
                e00Var.setAlpha(1.0f);
                z0.x0(e00Var);
                dk0 dk0Var = (dk0) obj2;
                dk0Var.c.remove(e00Var);
                dk0Var.a.removeView(e00Var);
                return;
            case 28:
                super.onAnimationEnd(animator);
                nq nqVar = (nq) obj2;
                ((dk0) nqVar.d).g.remove((AnimatorSet) obj);
                if (((dk0) nqVar.d).g.isEmpty()) {
                    ((dk0) nqVar.d).b.clear();
                    dk0 dk0Var2 = (dk0) nqVar.d;
                    dk0Var2.d = true;
                    dk0Var2.a.invalidate();
                    return;
                }
                return;
            default:
                eo0 eo0Var = (eo0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(eo0Var.B);
                } catch (Exception unused) {
                }
                jg0 jg0Var = eo0Var.C;
                if (jg0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(jg0Var);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 8:
                ((org.telegram.ui.ActionBar.k) this.c).B.setVisibility(0);
                break;
            case 14:
                ((wa) this.b).run();
                break;
            case 15:
                ((wa) this.b).run();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ j(Runnable runnable, Runnable runnable2, int i9) {
        this.a = i9;
        this.b = runnable;
        this.c = runnable2;
    }

    public j(dk0 dk0Var, e00 e00Var, z0 z0Var) {
        this.a = 27;
        this.c = dk0Var;
        this.b = e00Var;
    }
}
