package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.zu;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bm;
import org.telegram.ui.pn;
import org.telegram.ui.tp;
import org.telegram.ui.wn;
import org.telegram.ui.xi;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class ce extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ce(int i10, Object obj, Object obj2) {
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
                    org.telegram.ui.ActionBar.y6.vl = null;
                    actionBarLayout.i0 = null;
                    actionBarLayout.g0 = null;
                    actionBarLayout.q0 = null;
                    pn pnVar = ((org.telegram.ui.ActionBar.i5) this.b).j;
                    if (pnVar != null) {
                        pnVar.run();
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
                animatorSet = ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator)) {
                        ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimation = null;
                        ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimationType = 0;
                        break;
                    }
                }
                break;
            case 25:
                sz szVar = (sz) this.c;
                if (animator.equals(szVar.M0)) {
                    szVar.M0 = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean[] zArr;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        o1.j jVar;
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ee eeVar = (ee) obj2;
                eeVar.b.remove((de) obj);
                eeVar.f1();
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((di.q) obj2).b0.j0 = null;
                AndroidUtilities.removeFromParent((View) obj);
                break;
            case 2:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i12 = ProfileStoriesView.s0;
                    if (SharedConfig.getDevicePerformanceClass() > 0) {
                        AndroidUtilities.vibrateCursor(profileStoriesView);
                        AndroidUtilities.runOnUIThread(new u6(profileStoriesView, 20), 180L);
                    }
                }
                profileStoriesView.W = 1.0f;
                profileStoriesView.invalidate();
                break;
            case 3:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((fi.w2) obj2).b.h.setVisibility(8);
                break;
            case 4:
                fi.s3 s3Var = (fi.s3) obj2;
                s3Var.c = null;
                s3Var.e = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                fi.p pVar = (fi.p) obj2;
                ((sg.c2) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    break;
                }
                break;
            case 6:
                fi.j9 j9Var = (fi.j9) obj2;
                j9Var.removeView((x30) obj);
                j9Var.h.clear();
                j9Var.b = null;
                j9Var.c = false;
                fi.k9 k9Var = (fi.k9) j9Var.n;
                k9Var.b.setAllowDrawCursor(true);
                fi.w8 w8Var = k9Var.h;
                if (w8Var != null) {
                    w8Var.run();
                }
                if (k9Var.L) {
                    k9Var.fullScroll(130);
                    k9Var.L = false;
                    break;
                }
                break;
            case 7:
                kg.h hVar = (kg.h) obj2;
                hVar.b.clear();
                hVar.b.add((mg.d) obj);
                break;
            case 8:
                super.onAnimationEnd(animator);
                kg.h hVar2 = (kg.h) obj2;
                hVar2.c.clear();
                hVar2.c.add((mg.b) obj);
                break;
            case 9:
                li.b2 b2Var = (li.b2) obj2;
                b2Var.E = false;
                b2Var.v.setAlpha(1.0f);
                b2Var.v.A1.setVisibility(0);
                b2Var.x.x(AndroidUtilities.dp(22.0f));
                b2Var.x.setAlpha(255);
                jh.f fVar = b2Var.s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                break;
            case 10:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.k0 = null;
                break;
            case 11:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet3 = kVar.P;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kVar.P = null;
                    org.telegram.ui.ActionBar.b6 b6Var = kVar.n[0];
                    if (b6Var != null) {
                        b6Var.setVisibility(4);
                    }
                    if (kVar.r != null && !TextUtils.isEmpty(kVar.A0)) {
                        kVar.r.setVisibility(4);
                    }
                    org.telegram.ui.ActionBar.z zVar = kVar.E;
                    if (zVar != null) {
                        zVar.setVisibility(4);
                    }
                    if (kVar.Q != null) {
                        while (true) {
                            View[] viewArr = kVar.Q;
                            if (i11 >= viewArr.length) {
                                break;
                            } else {
                                View view2 = viewArr[i11];
                                if (view2 != null && ((zArr = (boolean[]) obj) == null || i11 >= zArr.length || zArr[i11])) {
                                    view2.setVisibility(4);
                                }
                                i11++;
                            }
                        }
                    }
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
                    org.telegram.ui.ActionBar.y6.vl = null;
                    actionBarLayout.i0 = null;
                    actionBarLayout.g0 = null;
                    actionBarLayout.q0 = null;
                    pn pnVar = ((org.telegram.ui.ActionBar.i5) obj).j;
                    if (pnVar != null) {
                        pnVar.run();
                        break;
                    }
                }
                break;
            case 13:
                ((ActionBarLayout) obj2).n = false;
                ((org.telegram.ui.ActionBar.r2) obj).onPreviewOpenAnimationEnd();
                break;
            case 14:
                View view3 = (View) obj;
                wn wnVar = (wn) obj2;
                wnVar.Q9 = 0.0f;
                if (animator == wnVar.Gb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    wnVar.l3 = null;
                    wnVar.Gb = null;
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) ((bm) obj2).b;
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().x0 = false;
                org.telegram.ui.s0 s0Var = new org.telegram.ui.s0("alpha", 2);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(ObjectAnimator.ofFloat((r60) obj, (Property<r60, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(s1Var, s0Var, 1.0f));
                animatorSet4.setDuration(100L);
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.addListener(new kg.e(this, 28));
                animatorSet4.start();
                break;
            case 16:
                tp tpVar = (tp) obj2;
                tpVar.L = 0.0f;
                tpVar.K = 1.0f;
                ((View) obj).invalidate();
                tpVar.T.invalidate();
                xi xiVar = tpVar.Y;
                if (xiVar != null) {
                    xiVar.run();
                    tpVar.Y = null;
                    break;
                }
                break;
            case 17:
                ((pg) obj2).run();
                break;
            case 18:
                ((org.telegram.ui.Components.db) obj2).run();
                break;
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
                    break;
                }
                break;
            case 20:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.L3.unlock();
                ((org.telegram.ui.Components.sd) obj).run();
                break;
            case 21:
                ((org.telegram.ui.Components.h2) obj).run();
                ((ChatActivityEnterView) obj2).L3.unlock();
                break;
            case 22:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((org.telegram.ui.Components.sd) obj).run();
                break;
            case 23:
                ti tiVar = (ti) obj2;
                animatorSet = ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimation;
                if (animatorSet != null) {
                    animatorSet2 = ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimation;
                    if (animatorSet2.equals(animator) && (jVar = tiVar.s2) != null && !jVar.f) {
                        ((kg) obj).run();
                        break;
                    }
                }
                break;
            case 24:
                zu zuVar = (zu) obj2;
                if (zuVar.a.e.getVisibility() == 0) {
                    zuVar.a.e.setAlpha(1.0f);
                    zuVar.a.e.setVisibility(4);
                }
                ((Runnable) obj).run();
                break;
            case 25:
                nm0 nm0Var = (nm0) obj;
                sz szVar = (sz) obj2;
                if (animator.equals(szVar.M0)) {
                    nm0Var.setTranslationY(0.0f);
                    if (nm0Var == szVar.D0) {
                        nm0Var.setPadding(0, 0, 0, szVar.q2);
                    } else if (nm0Var == szVar.P) {
                        nm0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), szVar.q2);
                    } else if (nm0Var == szVar.h0) {
                        nm0Var.setPadding(0, szVar.b1, 0, szVar.q2);
                    }
                    szVar.M0 = null;
                    break;
                }
                break;
            case 26:
                p20 p20Var = (p20) obj2;
                p20Var.removeView((x30) obj);
                p20Var.e.clear();
                p20Var.a = null;
                p20Var.b = false;
                break;
            case 27:
                ArrayList arrayList = (ArrayList) obj;
                p20 p20Var2 = (p20) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    p20Var2.removeView((View) arrayList.get(i13));
                }
                p20Var2.e.clear();
                p20Var2.a = null;
                p20Var2.b = false;
                break;
            case 28:
                y70 y70Var = (y70) obj2;
                y70Var.removeView((x30) obj);
                y70Var.c = null;
                y70Var.e.d0 = null;
                y70Var.a = false;
                break;
            default:
                ((rg0) obj2).h = null;
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
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

    public /* synthetic */ ce(Runnable runnable, Runnable runnable2, int i10) {
        this.a = i10;
        this.b = runnable;
        this.c = runnable2;
    }
}
