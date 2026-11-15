package ah;

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
import di.kc;
import di.lc;
import fi.c1;
import hi.b8;
import hi.d3;
import hi.h3;
import hi.n8;
import hi.s2;
import java.util.ArrayList;
import oi.z1;
import org.telegram.messenger.dv;
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n4;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.a2;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.yf;
import org.telegram.ui.Components.yt;
import org.telegram.ui.Components.zd;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.an;
import org.telegram.ui.bh;
import org.telegram.ui.hl;
import org.telegram.ui.q0;
import org.telegram.ui.tm;
import org.telegram.ui.wo;
import tg.r1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class l extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 13:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.c;
                AnimatorSet animatorSet = kVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.Q = null;
                    break;
                }
                break;
            case 14:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.c;
                if (animator.equals(actionBarLayout.r0)) {
                    actionBarLayout.i0.clear();
                    actionBarLayout.c0.clear();
                    actionBarLayout.d0.clear();
                    actionBarLayout.k0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    j6.mm = null;
                    actionBarLayout.j0 = null;
                    actionBarLayout.h0 = null;
                    actionBarLayout.r0 = null;
                    tm tmVar = ((n4) this.b).j;
                    if (tmVar != null) {
                        tmVar.run();
                        break;
                    }
                }
                break;
            case 21:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (animator.equals(chatActivityEnterView.Z2)) {
                    chatActivityEnterView.Z2 = null;
                    break;
                }
                break;
            case 25:
                ki kiVar = (ki) this.c;
                AnimatorSet animatorSet2 = kiVar.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kiVar.A0 = null;
                    kiVar.B0 = 0;
                    break;
                }
                break;
            case 27:
                ly lyVar = (ly) this.c;
                if (animator.equals(lyVar.N0)) {
                    lyVar.N0 = null;
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
        r1.g gVar;
        int i7 = this.a;
        int i10 = 0;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i7) {
            case 0:
                n nVar = (n) obj2;
                nVar.removeView((f20) obj);
                nVar.h.clear();
                nVar.b = null;
                nVar.c = false;
                ((o) nVar.n).b.setAllowDrawCursor(true);
                break;
            case 1:
                lc lcVar = (lc) obj2;
                lcVar.b.remove((kc) obj);
                lcVar.f1();
                break;
            case 2:
                super.onAnimationEnd(animator);
                ((fi.p) obj2).c0.k0 = null;
                g0.E2((View) obj);
                break;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i11 = ProfileStoriesView.t0;
                    if (gz.o() > 0) {
                        g0.b4(profileStoriesView);
                        g0.i3(new c1(profileStoriesView, 5), 180L);
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
                h3Var.n1 = null;
                h3Var.p1 = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                hi.p pVar = (hi.p) obj2;
                ((r1) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    break;
                }
                break;
            case 7:
                n nVar2 = (n) obj2;
                nVar2.removeView((f20) obj);
                nVar2.h.clear();
                nVar2.b = null;
                nVar2.c = false;
                n8 n8Var = (n8) nVar2.n;
                n8Var.b.setAllowDrawCursor(true);
                b8 b8Var = n8Var.h;
                if (b8Var != null) {
                    b8Var.run();
                }
                if (n8Var.M) {
                    n8Var.fullScroll(ns.O1);
                    n8Var.M = false;
                    break;
                }
                break;
            case 8:
                lg.g gVar2 = (lg.g) obj2;
                gVar2.b.clear();
                gVar2.b.add((ng.d) obj);
                break;
            case 9:
                super.onAnimationEnd(animator);
                lg.g gVar3 = (lg.g) obj2;
                gVar3.c.clear();
                gVar3.c.add((ng.b) obj);
                break;
            case 10:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.l0 = null;
                break;
            case 11:
                z1 z1Var = (z1) obj2;
                z1Var.F = false;
                z1Var.w.setAlpha(1.0f);
                z1Var.w.i2.setVisibility(0);
                z1Var.y.r(g0.L(22.0f));
                z1Var.y.setAlpha(ns.e4);
                jh.f fVar = z1Var.s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                break;
            case 12:
                dv dvVar = (dv) obj2;
                dvVar.b = true;
                dvVar.f = null;
                View view2 = (View) obj;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet = kVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.Q = null;
                    j5 j5Var = kVar.n[0];
                    if (j5Var != null) {
                        j5Var.setVisibility(4);
                    }
                    if (kVar.r != null && !TextUtils.isEmpty(kVar.B0)) {
                        kVar.r.setVisibility(4);
                    }
                    y yVar = kVar.F;
                    if (yVar != null) {
                        yVar.setVisibility(4);
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
            case 14:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.s0.e();
                if (animator.equals(actionBarLayout.r0)) {
                    actionBarLayout.i0.clear();
                    actionBarLayout.c0.clear();
                    actionBarLayout.d0.clear();
                    actionBarLayout.k0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    j6.mm = null;
                    actionBarLayout.j0 = null;
                    actionBarLayout.h0 = null;
                    actionBarLayout.r0 = null;
                    tm tmVar = ((n4) obj).j;
                    if (tmVar != null) {
                        tmVar.run();
                        break;
                    }
                }
                break;
            case 15:
                ((ActionBarLayout) obj2).n = false;
                ((e2) obj).onPreviewOpenAnimationEnd();
                break;
            case 16:
                View view4 = (View) obj;
                an anVar = (an) obj2;
                anVar.W9 = 0.0f;
                if (animator == anVar.Fb) {
                    ViewGroup viewGroup = (ViewGroup) view4.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view4);
                    }
                    anVar.o3 = null;
                    anVar.Fb = null;
                    break;
                }
                break;
            case 17:
                q1 q1Var = ((hl) obj2).b;
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().y0 = false;
                q0 q0Var = new q0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((t40) obj, (Property<t40, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(q1Var, q0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new w9(this, 7));
                animatorSet2.start();
                break;
            case 18:
                wo woVar = (wo) obj2;
                woVar.M = 0.0f;
                woVar.L = 1.0f;
                ((View) obj).invalidate();
                woVar.U.invalidate();
                bh bhVar = woVar.Z;
                if (bhVar != null) {
                    bhVar.run();
                    woVar.Z = null;
                    break;
                }
                break;
            case 19:
                ((dg) obj2).run();
                break;
            case 20:
                ((la) obj2).run();
                break;
            case 21:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.Q0;
                if (animator.equals(chatActivityEnterView.Z2)) {
                    if (((String) obj) != null) {
                        imageView.setVisibility(0);
                        chatActivityEnterView.getSendButtonInternal().setVisibility(8);
                    } else {
                        chatActivityEnterView.getSendButtonInternal().setVisibility(0);
                        imageView.setVisibility(8);
                    }
                    chatActivityEnterView.a1.setVisibility(8);
                    zd zdVar = chatActivityEnterView.T0;
                    if (zdVar != null) {
                        zdVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.Z2 = null;
                    chatActivityEnterView.d3 = 0;
                    break;
                }
                break;
            case 22:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.t4.e();
                ((uc) obj).run();
                break;
            case 23:
                ((a2) obj).run();
                ((ChatActivityEnterView) obj2).t4.e();
                break;
            case 24:
                ((ChatActivityEnterView) obj2).j4 = null;
                ((uc) obj).run();
                break;
            case 25:
                ki kiVar = (ki) obj2;
                AnimatorSet animatorSet3 = kiVar.A0;
                if (animatorSet3 != null && animatorSet3.equals(animator) && (gVar = kiVar.n4) != null && !gVar.f) {
                    ((yf) obj).run();
                    break;
                }
                break;
            case 26:
                yt ytVar = (yt) obj2;
                if (ytVar.a.p1.getVisibility() == 0) {
                    ytVar.a.p1.setAlpha(1.0f);
                    ytVar.a.p1.setVisibility(4);
                }
                ((Runnable) obj).run();
                break;
            case 27:
                uj0 uj0Var = (uj0) obj;
                ly lyVar = (ly) obj2;
                if (animator.equals(lyVar.N0)) {
                    uj0Var.setTranslationY(0.0f);
                    if (uj0Var == lyVar.E0) {
                        uj0Var.setPadding(0, 0, 0, lyVar.r2);
                    } else if (uj0Var == lyVar.Q) {
                        uj0Var.setPadding(g0.L(5.0f), 0, g0.L(5.0f), lyVar.r2);
                    } else if (uj0Var == lyVar.i0) {
                        uj0Var.setPadding(0, lyVar.c1, 0, lyVar.r2);
                    }
                    lyVar.N0 = null;
                    break;
                }
                break;
            case 28:
                y00 y00Var = (y00) obj2;
                y00Var.removeView((f20) obj);
                y00Var.e.clear();
                y00Var.a = null;
                y00Var.b = false;
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                y00 y00Var2 = (y00) obj2;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    y00Var2.removeView((View) arrayList.get(i12));
                }
                y00Var2.e.clear();
                y00Var2.a = null;
                y00Var2.b = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 13:
                ((org.telegram.ui.ActionBar.k) this.c).G.setVisibility(0);
                break;
            case 19:
                ((na) this.b).run();
                break;
            case 20:
                ((na) this.b).run();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ l(Runnable runnable, Runnable runnable2, int i7) {
        this.a = i7;
        this.b = runnable;
        this.c = runnable2;
    }
}
