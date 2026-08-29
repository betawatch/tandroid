package bg;

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
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import java.util.ArrayList;
import jh.eb;
import jh.fb;
import nh.b9;
import nh.o8;
import nh.q5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.i8;
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.za;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.mn;
import org.telegram.ui.np;
import org.telegram.ui.tn;
import org.telegram.ui.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c3(int i10, Object obj, Object obj2) {
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
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) this.c;
                AnimatorSet animatorSet3 = lVar.L;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    lVar.L = null;
                    break;
                }
                break;
            case 12:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.c;
                if (animator.equals(actionBarLayout.g0)) {
                    actionBarLayout.d0.clear();
                    actionBarLayout.U.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.f0.clear();
                    g6.sl = null;
                    actionBarLayout.e0 = null;
                    actionBarLayout.c0 = null;
                    actionBarLayout.g0 = null;
                    mn mnVar = ((a5) this.b).j;
                    if (mnVar != null) {
                        mnVar.run();
                        break;
                    }
                }
                break;
            case 19:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (animator.equals(chatActivityEnterView.m2)) {
                    chatActivityEnterView.m2 = null;
                    break;
                }
                break;
            case 23:
                ni niVar = (ni) this.c;
                animatorSet = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimationType = 0;
                        break;
                    }
                }
                break;
            case 25:
                fz fzVar = (fz) this.c;
                if (animator.equals(fzVar.I0)) {
                    fzVar.I0 = null;
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
        int i11 = 1;
        int i12 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                e3 e3Var = (e3) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    e3Var.n0.b(e3Var.u0, false);
                }
                e3Var.setRotationY(0.0f);
                e3Var.v0 = 1.0f;
                return;
            case 1:
                ((cg.p1) obj2).w = false;
                ((cg.a1) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 2:
                cg.f2 f2Var = (cg.f2) obj2;
                f2Var.D0 = false;
                f2Var.C0 = 1.0f;
                f2Var.o0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new b3(i11, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            case 3:
                ig.j jVar = (ig.j) obj2;
                jVar.removeView((j30) obj);
                jVar.h.clear();
                jVar.b = null;
                jVar.c = false;
                ((ig.k) jVar.n).b.setAllowDrawCursor(true);
                return;
            case 4:
                fb fbVar = (fb) obj2;
                fbVar.b.remove((eb) obj);
                fbVar.R();
                return;
            case 5:
                super.onAnimationEnd(animator);
                ((lh.o) obj2).U.f0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                return;
            case 6:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr3 = (boolean[]) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    int i13 = ProfileStoriesView.o0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new jh.o(profileStoriesView, 28), 180L);
                    }
                }
                profileStoriesView.S = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 7:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((nh.v2) obj2).h.h.setVisibility(8);
                return;
            case 8:
                nh.r3 r3Var = (nh.r3) obj2;
                r3Var.c = null;
                r3Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 9:
                nh.p pVar = (nh.p) obj2;
                ((f3) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 10:
                ig.j jVar2 = (ig.j) obj2;
                jVar2.removeView((j30) obj);
                jVar2.h.clear();
                jVar2.b = null;
                jVar2.c = false;
                b9 b9Var = (b9) jVar2.n;
                b9Var.a.setAllowDrawCursor(true);
                o8 o8Var = b9Var.f;
                if (o8Var != null) {
                    o8Var.run();
                }
                if (b9Var.G) {
                    b9Var.fullScroll(130);
                    b9Var.G = false;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj2;
                AnimatorSet animatorSet3 = lVar.L;
                if (animatorSet3 == null || !animatorSet3.equals(animator)) {
                    return;
                }
                lVar.L = null;
                h5 h5Var = lVar.n[0];
                if (h5Var != null) {
                    h5Var.setVisibility(4);
                }
                if (lVar.r != null && !TextUtils.isEmpty(lVar.w0)) {
                    lVar.r.setVisibility(4);
                }
                org.telegram.ui.ActionBar.a0 a0Var = lVar.A;
                if (a0Var != null) {
                    a0Var.setVisibility(4);
                }
                if (lVar.M == null) {
                    return;
                }
                while (true) {
                    View[] viewArr = lVar.M;
                    if (i12 >= viewArr.length) {
                        return;
                    }
                    View view2 = viewArr[i12];
                    if (view2 != null && ((zArr = (boolean[]) obj) == null || i12 >= zArr.length || zArr[i12])) {
                        view2.setVisibility(4);
                    }
                    i12++;
                }
                break;
            case 12:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.h0.unlock();
                if (animator.equals(actionBarLayout.g0)) {
                    actionBarLayout.d0.clear();
                    actionBarLayout.U.clear();
                    actionBarLayout.V.clear();
                    actionBarLayout.f0.clear();
                    g6.sl = null;
                    actionBarLayout.e0 = null;
                    actionBarLayout.c0 = null;
                    actionBarLayout.g0 = null;
                    mn mnVar = ((a5) obj).j;
                    if (mnVar != null) {
                        mnVar.run();
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
                tn tnVar = (tn) obj2;
                tnVar.w9 = 0.0f;
                if (animator == tnVar.cb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    tnVar.V2 = null;
                    tnVar.cb = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) ((fh.f) obj2).b;
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().x0 = false;
                org.telegram.ui.w0 w0Var = new org.telegram.ui.w0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((m50) obj, (Property<m50, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(s1Var, w0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new q5(this, 29));
                animatorSet4.start();
                return;
            case 16:
                np npVar = (np) obj2;
                npVar.H = 0.0f;
                npVar.G = 1.0f;
                ((View) obj).invalidate();
                npVar.P.invalidate();
                ui uiVar = npVar.U;
                if (uiVar != null) {
                    uiVar.run();
                    npVar.U = null;
                    return;
                }
                return;
            case 17:
                ((ig) obj2).run();
                return;
            case 18:
                ((za) obj2).run();
                return;
            case 19:
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
                    ve veVar = chatActivityEnterView.O0;
                    if (veVar != null) {
                        veVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.m2 = null;
                    chatActivityEnterView.q2 = 0;
                    return;
                }
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.R0 = null;
                chatActivityEnterView2.G3.unlock();
                ((ld) obj).run();
                return;
            case 21:
                ((i8) obj).run();
                ((ChatActivityEnterView) obj2).G3.unlock();
                return;
            case 22:
                ((ChatActivityEnterView) obj2).w3 = null;
                ((ld) obj).run();
                return;
            case 23:
                ni niVar = (ni) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.f3) niVar).currentSheetAnimation;
                    if (!animatorSet2.equals(animator) || (kVar = niVar.l2) == null || kVar.f) {
                        return;
                    }
                    ((org.telegram.ui.Components.g) obj).run();
                    return;
                }
                return;
            case 24:
                iu iuVar = (iu) obj2;
                if (iuVar.a.e.getVisibility() == 0) {
                    iuVar.a.e.setAlpha(1.0f);
                    iuVar.a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                return;
            case 25:
                jl0 jl0Var = (jl0) obj;
                fz fzVar = (fz) obj2;
                if (animator.equals(fzVar.I0)) {
                    jl0Var.setTranslationY(0.0f);
                    if (jl0Var == fzVar.z0) {
                        jl0Var.setPadding(0, 0, 0, fzVar.m2);
                    } else if (jl0Var == fzVar.L) {
                        jl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), fzVar.m2);
                    } else if (jl0Var == fzVar.d0) {
                        jl0Var.setPadding(0, fzVar.X0, 0, fzVar.m2);
                    }
                    fzVar.I0 = null;
                    return;
                }
                return;
            case 26:
                a20 a20Var = (a20) obj2;
                a20Var.removeView((j30) obj);
                a20Var.e.clear();
                a20Var.a = null;
                a20Var.b = false;
                return;
            case 27:
                ArrayList arrayList = (ArrayList) obj;
                a20 a20Var2 = (a20) obj2;
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    a20Var2.removeView((View) arrayList.get(i14));
                }
                a20Var2.e.clear();
                a20Var2.a = null;
                a20Var2.b = false;
                return;
            case 28:
                w60 w60Var = (w60) obj2;
                w60Var.removeView((j30) obj);
                w60Var.c = null;
                w60Var.e.Z = null;
                w60Var.a = false;
                return;
            default:
                lk0 lk0Var = (lk0) obj2;
                c2.z zVar = lk0Var.e;
                if (((ValueAnimator) zVar.g) == null) {
                    return;
                }
                ((jl0) zVar.e).T1 = false;
                ArrayList arrayList2 = lk0Var.b;
                int size = arrayList2.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj3 = arrayList2.get(i15);
                    i15++;
                    View view4 = (View) obj3;
                    if (view4 instanceof m4) {
                        ((m4) view4).b(false, true);
                    }
                    view4.setTranslationY(0.0f);
                    ((f2.j0) zVar.f).getClass();
                    f2.w0.x0(view4);
                    ((jl0) zVar.e).removeView(view4);
                    i7.g6 g6Var = (i7.g6) zVar.i;
                    if (g6Var != null) {
                        g6Var.d(view4);
                    }
                }
                ((jl0) zVar.e).setScrollEnabled(true);
                ((jl0) zVar.e).setVerticalScrollBarEnabled(true);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    if (((jl0) zVar.e).e.p() != ((jl0) zVar.e).getChildCount()) {
                        throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                    }
                    if (((ArrayList) ((jl0) zVar.e).e.d).size() != 0) {
                        throw new RuntimeException("hidden child count must be 0");
                    }
                }
                int childCount = ((jl0) zVar.e).getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = ((jl0) zVar.e).getChildAt(i16);
                    if (childAt instanceof m4) {
                        ((m4) childAt).b(false, false);
                    }
                    childAt.setTranslationY(0.0f);
                }
                ArrayList arrayList3 = (ArrayList) obj;
                int size2 = arrayList3.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj4 = arrayList3.get(i17);
                    i17++;
                    View view5 = (View) obj4;
                    if (view5 instanceof m4) {
                        ((m4) view5).b(false, false);
                    }
                    view5.setTranslationY(0.0f);
                }
                mk0 mk0Var = lk0Var.d;
                if (mk0Var != null) {
                    mk0Var.E();
                }
                i7.g6 g6Var2 = (i7.g6) zVar.i;
                if (g6Var2 != null) {
                    g6Var2.a();
                }
                ((SparseArray) zVar.j).clear();
                zVar.g = null;
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 11:
                ((org.telegram.ui.ActionBar.l) this.c).B.setVisibility(0);
                break;
            case 17:
                ((bb) this.b).run();
                break;
            case 18:
                ((bb) this.b).run();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ c3(Runnable runnable, Runnable runnable2, int i10) {
        this.a = i10;
        this.b = runnable;
        this.c = runnable2;
    }
}
