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
import bi.ab;
import bi.ee;
import bi.fe;
import fi.d8;
import fi.f3;
import fi.j3;
import fi.p8;
import fi.u2;
import java.util.ArrayList;
import li.b2;
import org.telegram.messenger.fv;
import org.telegram.messenger.g0;
import org.telegram.messenger.iz;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p4;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.ke;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q40;
import org.telegram.ui.Components.r2;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.xf;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.an;
import org.telegram.ui.bh;
import org.telegram.ui.hl;
import org.telegram.ui.q0;
import org.telegram.ui.tm;
import org.telegram.ui.va;
import org.telegram.ui.vo;
import tg.r1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    break;
                }
                break;
            case 14:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.c;
                if (animator.equals(actionBarLayout.q0)) {
                    actionBarLayout.h0.clear();
                    actionBarLayout.b0.clear();
                    actionBarLayout.c0.clear();
                    actionBarLayout.j0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    k6.jm = null;
                    actionBarLayout.i0 = null;
                    actionBarLayout.g0 = null;
                    actionBarLayout.q0 = null;
                    tm tmVar = ((p4) this.b).j;
                    if (tmVar != null) {
                        tmVar.run();
                        break;
                    }
                }
                break;
            case 21:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (animator.equals(chatActivityEnterView.r2)) {
                    chatActivityEnterView.r2 = null;
                    break;
                }
                break;
            case 25:
                di diVar = (di) this.c;
                AnimatorSet animatorSet2 = diVar.z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    diVar.z0 = null;
                    diVar.A0 = 0;
                    break;
                }
                break;
            case 27:
                gy gyVar = (gy) this.c;
                if (animator.equals(gyVar.M0)) {
                    gyVar.M0 = null;
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
                nVar.removeView((c20) obj);
                nVar.h.clear();
                nVar.b = null;
                nVar.c = false;
                ((o) nVar.n).b.setAllowDrawCursor(true);
                break;
            case 1:
                fe feVar = (fe) obj2;
                feVar.b.remove((ee) obj);
                feVar.f1();
                break;
            case 2:
                super.onAnimationEnd(animator);
                ((di.p) obj2).b0.j0 = null;
                g0.E2((View) obj);
                break;
            case 3:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    int i11 = ProfileStoriesView.s0;
                    if (iz.o() > 0) {
                        g0.c4(profileStoriesView);
                        g0.i3(new ab(profileStoriesView, 22), 180L);
                    }
                }
                profileStoriesView.W = 1.0f;
                profileStoriesView.invalidate();
                break;
            case 4:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(4);
                }
                ((f3) ((u2) obj2).c).h.setVisibility(8);
                break;
            case 5:
                j3 j3Var = (j3) obj2;
                j3Var.j1 = null;
                j3Var.l1 = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                fi.p pVar = (fi.p) obj2;
                ((r1) obj).setDraw(true);
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    break;
                }
                break;
            case 7:
                n nVar2 = (n) obj2;
                nVar2.removeView((c20) obj);
                nVar2.h.clear();
                nVar2.b = null;
                nVar2.c = false;
                p8 p8Var = (p8) nVar2.n;
                p8Var.b.setAllowDrawCursor(true);
                d8 d8Var = p8Var.h;
                if (d8Var != null) {
                    d8Var.run();
                }
                if (p8Var.L) {
                    p8Var.fullScroll(qs.O1);
                    p8Var.L = false;
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
                b2 b2Var = (b2) obj2;
                b2Var.E = false;
                b2Var.w.setAlpha(1.0f);
                b2Var.w.A1.setVisibility(0);
                b2Var.y.r(g0.L(22.0f));
                b2Var.y.setAlpha(qs.e4);
                jh.f fVar = b2Var.s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                break;
            case 11:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.k0 = null;
                break;
            case 12:
                fv fvVar = (fv) obj2;
                fvVar.b = true;
                fvVar.f = null;
                View view2 = (View) obj;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    k5 k5Var = kVar.n[0];
                    if (k5Var != null) {
                        k5Var.setVisibility(4);
                    }
                    if (kVar.r != null && !TextUtils.isEmpty(kVar.A0)) {
                        kVar.r.setVisibility(4);
                    }
                    y yVar = kVar.E;
                    if (yVar != null) {
                        yVar.setVisibility(4);
                    }
                    if (kVar.Q != null) {
                        while (true) {
                            View[] viewArr = kVar.Q;
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
                actionBarLayout.r0.e();
                if (animator.equals(actionBarLayout.q0)) {
                    actionBarLayout.h0.clear();
                    actionBarLayout.b0.clear();
                    actionBarLayout.c0.clear();
                    actionBarLayout.j0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    k6.jm = null;
                    actionBarLayout.i0 = null;
                    actionBarLayout.g0 = null;
                    actionBarLayout.q0 = null;
                    tm tmVar = ((p4) obj).j;
                    if (tmVar != null) {
                        tmVar.run();
                        break;
                    }
                }
                break;
            case 15:
                ((ActionBarLayout) obj2).n = false;
                ((f2) obj).onPreviewOpenAnimationEnd();
                break;
            case 16:
                View view4 = (View) obj;
                an anVar = (an) obj2;
                anVar.T9 = 0.0f;
                if (animator == anVar.Cb) {
                    ViewGroup viewGroup = (ViewGroup) view4.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view4);
                    }
                    anVar.n3 = null;
                    anVar.Cb = null;
                    break;
                }
                break;
            case 17:
                q1 q1Var = ((hl) obj2).b;
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().y0 = false;
                q0 q0Var = new q0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((q40) obj, (Property<q40, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(q1Var, q0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new va(this, 6));
                animatorSet2.start();
                break;
            case 18:
                vo voVar = (vo) obj2;
                voVar.L = 0.0f;
                voVar.K = 1.0f;
                ((View) obj).invalidate();
                voVar.T.invalidate();
                bh bhVar = voVar.Y;
                if (bhVar != null) {
                    bhVar.run();
                    voVar.Y = null;
                    break;
                }
                break;
            case 19:
                ((xf) obj2).run();
                break;
            case 20:
                ((pa) obj2).run();
                break;
            case 21:
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
                    ke keVar = chatActivityEnterView.S0;
                    if (keVar != null) {
                        keVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.r2 = null;
                    chatActivityEnterView.v2 = 0;
                    break;
                }
                break;
            case 22:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.L3.e();
                ((ad) obj).run();
                break;
            case 23:
                ((r2) obj).run();
                ((ChatActivityEnterView) obj2).L3.e();
                break;
            case 24:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((ad) obj).run();
                break;
            case 25:
                di diVar = (di) obj2;
                AnimatorSet animatorSet3 = diVar.z0;
                if (animatorSet3 != null && animatorSet3.equals(animator) && (gVar = diVar.j4) != null && !gVar.f) {
                    ((ng) obj).run();
                    break;
                }
                break;
            case 26:
                st stVar = (st) obj2;
                if (stVar.a.l1.getVisibility() == 0) {
                    stVar.a.l1.setAlpha(1.0f);
                    stVar.a.l1.setVisibility(4);
                }
                ((Runnable) obj).run();
                break;
            case 27:
                pj0 pj0Var = (pj0) obj;
                gy gyVar = (gy) obj2;
                if (animator.equals(gyVar.M0)) {
                    pj0Var.setTranslationY(0.0f);
                    if (pj0Var == gyVar.D0) {
                        pj0Var.setPadding(0, 0, 0, gyVar.q2);
                    } else if (pj0Var == gyVar.P) {
                        pj0Var.setPadding(g0.L(5.0f), 0, g0.L(5.0f), gyVar.q2);
                    } else if (pj0Var == gyVar.h0) {
                        pj0Var.setPadding(0, gyVar.b1, 0, gyVar.q2);
                    }
                    gyVar.M0 = null;
                    break;
                }
                break;
            case 28:
                u00 u00Var = (u00) obj2;
                u00Var.removeView((c20) obj);
                u00Var.e.clear();
                u00Var.a = null;
                u00Var.b = false;
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                u00 u00Var2 = (u00) obj2;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    u00Var2.removeView((View) arrayList.get(i12));
                }
                u00Var2.e.clear();
                u00Var2.a = null;
                u00Var2.b = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 13:
                ((org.telegram.ui.ActionBar.k) this.c).F.setVisibility(0);
                break;
            case 19:
                ((ra) this.b).run();
                break;
            case 20:
                ((ra) this.b).run();
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
