package bh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import ci.d1;
import ci.vc;
import ci.wc;
import ei.q;
import gi.c8;
import gi.d3;
import gi.h3;
import gi.q8;
import gi.s2;
import java.util.ArrayList;
import mi.c2;
import org.telegram.messenger.az;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.messenger.xu;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p4;
import org.telegram.ui.ActionBar.x;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.e7;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.ie;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.o2;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Components.y10;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.dl;
import org.telegram.ui.pm;
import org.telegram.ui.r0;
import org.telegram.ui.to;
import org.telegram.ui.wm;
import org.telegram.ui.xg;
import ug.r1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 12:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.c;
                AnimatorSet animatorSet = kVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.Q = null;
                    break;
                }
                break;
            case 13:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.c;
                if (animator.equals(actionBarLayout.r0)) {
                    actionBarLayout.i0.clear();
                    actionBarLayout.c0.clear();
                    actionBarLayout.d0.clear();
                    actionBarLayout.k0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    k6.jm = null;
                    actionBarLayout.j0 = null;
                    actionBarLayout.h0 = null;
                    actionBarLayout.r0 = null;
                    pm pmVar = ((p4) this.b).j;
                    if (pmVar != null) {
                        pmVar.run();
                        break;
                    }
                }
                break;
            case 20:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (animator.equals(chatActivityEnterView.s2)) {
                    chatActivityEnterView.s2 = null;
                    break;
                }
                break;
            case 24:
                bi biVar = (bi) this.c;
                AnimatorSet animatorSet2 = biVar.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    biVar.A0 = null;
                    biVar.B0 = 0;
                    break;
                }
                break;
            case 26:
                ey eyVar = (ey) this.c;
                if (animator.equals(eyVar.N0)) {
                    eyVar.N0 = null;
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
        q1.g gVar;
        int i3 = this.a;
        int i10 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                l lVar = (l) obj2;
                lVar.removeView((y10) obj);
                lVar.h.clear();
                lVar.b = null;
                lVar.c = false;
                ((m) lVar.n).b.setAllowDrawCursor(true);
                break;
            case 1:
                wc wcVar = (wc) obj2;
                wcVar.b.remove((vc) obj);
                wcVar.f1();
                break;
            case 2:
                super.onAnimationEnd(animator);
                ((q) obj2).c0.k0 = null;
                g0.E2((View) obj);
                break;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i11 = ProfileStoriesView.t0;
                    if (az.o() > 0) {
                        g0.c4(profileStoriesView);
                        g0.i3(new d1(profileStoriesView, 27), 180L);
                    }
                }
                profileStoriesView.a0 = 1.0f;
                profileStoriesView.invalidate();
                break;
            case 4:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((d3) ((s2) obj2).c).h.setVisibility(8);
                break;
            case 5:
                h3 h3Var = (h3) obj2;
                h3Var.k1 = null;
                h3Var.m1 = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                gi.p pVar = (gi.p) obj2;
                ((r1) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    break;
                }
                break;
            case 7:
                l lVar2 = (l) obj2;
                lVar2.removeView((y10) obj);
                lVar2.h.clear();
                lVar2.b = null;
                lVar2.c = false;
                q8 q8Var = (q8) lVar2.n;
                q8Var.b.setAllowDrawCursor(true);
                c8 c8Var = q8Var.h;
                if (c8Var != null) {
                    c8Var.run();
                }
                if (q8Var.M) {
                    q8Var.fullScroll(hs.O1);
                    q8Var.M = false;
                    break;
                }
                break;
            case 8:
                mg.g gVar2 = (mg.g) obj2;
                gVar2.b.clear();
                gVar2.b.add((og.d) obj);
                break;
            case 9:
                super.onAnimationEnd(animator);
                mg.g gVar3 = (mg.g) obj2;
                gVar3.c.clear();
                gVar3.c.add((og.b) obj);
                break;
            case 10:
                c2 c2Var = (c2) obj2;
                c2Var.F = false;
                c2Var.w.setAlpha(1.0f);
                c2Var.w.B1.setVisibility(0);
                c2Var.y.r(g0.L(22.0f));
                c2Var.y.setAlpha(hs.e4);
                kh.f fVar = c2Var.s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                break;
            case 11:
                xu xuVar = (xu) obj2;
                xuVar.b = true;
                xuVar.f = null;
                View view2 = (View) obj;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet = kVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.Q = null;
                    k5 k5Var = kVar.n[0];
                    if (k5Var != null) {
                        k5Var.setVisibility(4);
                    }
                    if (kVar.r != null && !TextUtils.isEmpty(kVar.B0)) {
                        kVar.r.setVisibility(4);
                    }
                    x xVar = kVar.F;
                    if (xVar != null) {
                        xVar.setVisibility(4);
                    }
                    if (kVar.R != null) {
                        while (true) {
                            View[] viewArr = kVar.R;
                            if (i10 >= viewArr.length) {
                                break;
                            } else {
                                View view3 = viewArr[i10];
                                if (view3 != null && ((zArr = (boolean[]) obj) == null || i10 >= zArr.length || zArr[i10])) {
                                    view3.setVisibility(4);
                                }
                                i10++;
                            }
                        }
                    }
                }
                break;
            case 13:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.s0.e();
                if (animator.equals(actionBarLayout.r0)) {
                    actionBarLayout.i0.clear();
                    actionBarLayout.c0.clear();
                    actionBarLayout.d0.clear();
                    actionBarLayout.k0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    k6.jm = null;
                    actionBarLayout.j0 = null;
                    actionBarLayout.h0 = null;
                    actionBarLayout.r0 = null;
                    pm pmVar = ((p4) obj).j;
                    if (pmVar != null) {
                        pmVar.run();
                        break;
                    }
                }
                break;
            case 14:
                ((ActionBarLayout) obj2).n = false;
                ((d2) obj).onPreviewOpenAnimationEnd();
                break;
            case 15:
                View view4 = (View) obj;
                wm wmVar = (wm) obj2;
                wmVar.U9 = 0.0f;
                if (animator == wmVar.Db) {
                    ViewGroup viewGroup = (ViewGroup) view4.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view4);
                    }
                    wmVar.o3 = null;
                    wmVar.Db = null;
                    break;
                }
                break;
            case 16:
                q1 q1Var = ((dl) obj2).b;
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().y0 = false;
                r0 r0Var = new r0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((m40) obj, (Property<m40, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(q1Var, r0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new w9(this, 7));
                animatorSet2.start();
                break;
            case 17:
                to toVar = (to) obj2;
                toVar.M = 0.0f;
                toVar.L = 1.0f;
                ((View) obj).invalidate();
                toVar.U.invalidate();
                xg xgVar = toVar.Z;
                if (xgVar != null) {
                    xgVar.run();
                    toVar.Z = null;
                    break;
                }
                break;
            case 18:
                ((vf) obj2).run();
                break;
            case 19:
                ((oa) obj2).run();
                break;
            case 20:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.Q0;
                if (animator.equals(chatActivityEnterView.s2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.a1.setVisibility(8);
                    ie ieVar = chatActivityEnterView.T0;
                    if (ieVar != null) {
                        ieVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.s2 = null;
                    chatActivityEnterView.w2 = 0;
                    break;
                }
                break;
            case 21:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.M3.e();
                ((yc) obj).run();
                break;
            case 22:
                ((o2) obj).run();
                ((ChatActivityEnterView) obj2).M3.e();
                break;
            case 23:
                ((ChatActivityEnterView) obj2).C3 = null;
                ((yc) obj).run();
                break;
            case 24:
                bi biVar = (bi) obj2;
                AnimatorSet animatorSet3 = biVar.A0;
                if (animatorSet3 != null && animatorSet3.equals(animator) && (gVar = biVar.k4) != null && !gVar.f) {
                    ((e7) obj).run();
                    break;
                }
                break;
            case 25:
                qt qtVar = (qt) obj2;
                if (qtVar.a.m1.getVisibility() == 0) {
                    qtVar.a.m1.setAlpha(1.0f);
                    qtVar.a.m1.setVisibility(4);
                }
                ((Runnable) obj).run();
                break;
            case 26:
                tj0 tj0Var = (tj0) obj;
                ey eyVar = (ey) obj2;
                if (animator.equals(eyVar.N0)) {
                    tj0Var.setTranslationY(0.0f);
                    if (tj0Var == eyVar.E0) {
                        tj0Var.setPadding(0, 0, 0, eyVar.r2);
                    } else if (tj0Var == eyVar.Q) {
                        tj0Var.setPadding(g0.L(5.0f), 0, g0.L(5.0f), eyVar.r2);
                    } else if (tj0Var == eyVar.i0) {
                        tj0Var.setPadding(0, eyVar.c1, 0, eyVar.r2);
                    }
                    eyVar.N0 = null;
                    break;
                }
                break;
            case 27:
                q00 q00Var = (q00) obj2;
                q00Var.removeView((y10) obj);
                q00Var.e.clear();
                q00Var.a = null;
                q00Var.b = false;
                break;
            case 28:
                ArrayList arrayList = (ArrayList) obj;
                q00 q00Var2 = (q00) obj2;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    q00Var2.removeView((View) arrayList.get(i12));
                }
                q00Var2.e.clear();
                q00Var2.a = null;
                q00Var2.b = false;
                break;
            default:
                s50 s50Var = (s50) obj2;
                s50Var.removeView((y10) obj);
                s50Var.c = null;
                s50Var.e.V1 = null;
                s50Var.a = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 12:
                ((org.telegram.ui.ActionBar.k) this.c).G.setVisibility(0);
                break;
            case 18:
                ((qa) this.b).run();
                break;
            case 19:
                ((qa) this.b).run();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ j(Runnable runnable, Runnable runnable2, int i3) {
        this.a = i3;
        this.b = runnable;
        this.c = runnable2;
    }
}
