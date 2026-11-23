package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import di.nc;
import di.oc;
import hi.a8;
import hi.d3;
import hi.h3;
import hi.m8;
import hi.s2;
import oi.b2;
import org.telegram.messenger.av;
import org.telegram.messenger.cz;
import org.telegram.messenger.g0;
import org.telegram.messenger.ls;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.ie;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.zf;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bh;
import org.telegram.ui.bn;
import org.telegram.ui.ii;
import org.telegram.ui.il;
import org.telegram.ui.q0;
import org.telegram.ui.um;
import org.telegram.ui.yo;
import tg.t1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
                    m6.mm = null;
                    actionBarLayout.j0 = null;
                    actionBarLayout.h0 = null;
                    actionBarLayout.r0 = null;
                    um umVar = ((q4) this.b).j;
                    if (umVar != null) {
                        umVar.run();
                        break;
                    }
                }
                break;
            case 22:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.h3 = null;
                    break;
                }
                break;
            case 26:
                ui uiVar = (ui) this.c;
                AnimatorSet animatorSet2 = uiVar.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    uiVar.A0 = null;
                    uiVar.B0 = 0;
                    break;
                }
                break;
            case 28:
                ty tyVar = (ty) this.c;
                if (animator.equals(tyVar.N0)) {
                    tyVar.N0 = null;
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
                nVar.removeView((p20) obj);
                nVar.h.clear();
                nVar.b = null;
                nVar.c = false;
                ((o) nVar.n).b.setAllowDrawCursor(true);
                break;
            case 1:
                oc ocVar = (oc) obj2;
                ocVar.b.remove((nc) obj);
                ocVar.f1();
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
                    if (cz.o() > 0) {
                        g0.a4(profileStoriesView);
                        g0.h3(new f2.a(profileStoriesView, 9), 180L);
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
                hi.r rVar = (hi.r) obj2;
                ((t1) obj).setDraw(true);
                if (rVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) rVar.getParent()).removeView(rVar);
                    break;
                }
                break;
            case 7:
                n nVar2 = (n) obj2;
                nVar2.removeView((p20) obj);
                nVar2.h.clear();
                nVar2.b = null;
                nVar2.c = false;
                m8 m8Var = (m8) nVar2.n;
                m8Var.b.setAllowDrawCursor(true);
                a8 a8Var = m8Var.h;
                if (a8Var != null) {
                    a8Var.run();
                }
                if (m8Var.M) {
                    m8Var.fullScroll(ls.O1);
                    m8Var.M = false;
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
                b2 b2Var = (b2) obj2;
                b2Var.F = false;
                b2Var.w.setAlpha(1.0f);
                b2Var.w.q2.setVisibility(0);
                b2Var.y.r(g0.L(22.0f));
                b2Var.y.setAlpha(ls.e4);
                jh.f fVar = b2Var.s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                break;
            case 12:
                av avVar = (av) obj2;
                avVar.b = true;
                avVar.f = null;
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
                    m5 m5Var = kVar.n[0];
                    if (m5Var != null) {
                        m5Var.setVisibility(4);
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
                    m6.mm = null;
                    actionBarLayout.j0 = null;
                    actionBarLayout.h0 = null;
                    actionBarLayout.r0 = null;
                    um umVar = ((q4) obj).j;
                    if (umVar != null) {
                        umVar.run();
                        break;
                    }
                }
                break;
            case 15:
                ((ActionBarLayout) obj2).n = false;
                ((g2) obj).onPreviewOpenAnimationEnd();
                break;
            case 16:
                View view4 = (View) obj;
                bn bnVar = (bn) obj2;
                bnVar.X9 = 0.0f;
                if (animator == bnVar.Gb) {
                    ViewGroup viewGroup = (ViewGroup) view4.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view4);
                    }
                    bnVar.o3 = null;
                    bnVar.Gb = null;
                    break;
                }
                break;
            case 17:
                r1 r1Var = ((il) obj2).b;
                r1Var.setAlpha(1.0f);
                r1Var.getTransitionParams().y0 = false;
                q0 q0Var = new q0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((e50) obj, (Property<e50, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(r1Var, q0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new y9(this, 7));
                animatorSet2.start();
                break;
            case 18:
                yo yoVar = (yo) obj2;
                yoVar.M = 0.0f;
                yoVar.L = 1.0f;
                ((View) obj).invalidate();
                yoVar.U.invalidate();
                bh bhVar = yoVar.Z;
                if (bhVar != null) {
                    bhVar.run();
                    yoVar.Z = null;
                    break;
                }
                break;
            case 19:
                ((og) obj2).run();
                break;
            case 20:
                ((ua) obj2).run();
                break;
            case 21:
                ((ChatActivityEnterView) obj2).r4 = null;
                ((dd) obj).run();
                break;
            case 22:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.Q0;
                if (animator.equals(chatActivityEnterView.h3)) {
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
                    chatActivityEnterView.h3 = null;
                    chatActivityEnterView.l3 = 0;
                    break;
                }
                break;
            case 23:
                zf zfVar = (zf) obj2;
                rn0 rn0Var = zfVar.d.q0;
                if (rn0Var != null && rn0Var.getTag() == ((ValueAnimator) obj)) {
                    zfVar.d.q0.setTag(null);
                    break;
                }
                break;
            case 24:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.B4.e();
                ((dd) obj).run();
                break;
            case 25:
                ((ii) obj).run();
                ((ChatActivityEnterView) obj2).B4.e();
                break;
            case 26:
                ui uiVar = (ui) obj2;
                AnimatorSet animatorSet3 = uiVar.A0;
                if (animatorSet3 != null && animatorSet3.equals(animator) && (gVar = uiVar.n4) != null && !gVar.f) {
                    ((org.telegram.ui.Components.g) obj).run();
                    break;
                }
                break;
            case 27:
                fu fuVar = (fu) obj2;
                if (fuVar.a.p1.getVisibility() == 0) {
                    fuVar.a.p1.setAlpha(1.0f);
                    fuVar.a.p1.setVisibility(4);
                }
                ((Runnable) obj).run();
                break;
            case 28:
                ek0 ek0Var = (ek0) obj;
                ty tyVar = (ty) obj2;
                if (animator.equals(tyVar.N0)) {
                    ek0Var.setTranslationY(0.0f);
                    if (ek0Var == tyVar.E0) {
                        ek0Var.setPadding(0, 0, 0, tyVar.r2);
                    } else if (ek0Var == tyVar.Q) {
                        ek0Var.setPadding(g0.L(5.0f), 0, g0.L(5.0f), tyVar.r2);
                    } else if (ek0Var == tyVar.i0) {
                        ek0Var.setPadding(0, tyVar.c1, 0, tyVar.r2);
                    }
                    tyVar.N0 = null;
                    break;
                }
                break;
            default:
                i10 i10Var = (i10) obj2;
                i10Var.removeView((p20) obj);
                i10Var.e.clear();
                i10Var.a = null;
                i10Var.b = false;
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
                ((wa) this.b).run();
                break;
            case 20:
                ((wa) this.b).run();
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
