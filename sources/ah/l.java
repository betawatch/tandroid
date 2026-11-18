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
import di.nc;
import di.oc;
import hi.b8;
import hi.e3;
import hi.i3;
import hi.n8;
import hi.t2;
import java.util.ArrayList;
import oi.z1;
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.messenger.zu;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.ie;
import org.telegram.ui.Components.k7;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bh;
import org.telegram.ui.bn;
import org.telegram.ui.ii;
import org.telegram.ui.il;
import org.telegram.ui.q0;
import org.telegram.ui.um;
import org.telegram.ui.yo;
import tg.r1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                    n6.mm = null;
                    actionBarLayout.j0 = null;
                    actionBarLayout.h0 = null;
                    actionBarLayout.r0 = null;
                    um umVar = ((r4) this.b).j;
                    if (umVar != null) {
                        umVar.run();
                        break;
                    }
                }
                break;
            case 21:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                if (animator.equals(chatActivityEnterView.f3)) {
                    chatActivityEnterView.f3 = null;
                    break;
                }
                break;
            case 25:
                si siVar = (si) this.c;
                AnimatorSet animatorSet2 = siVar.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    siVar.A0 = null;
                    siVar.B0 = 0;
                    break;
                }
                break;
            case 27:
                ry ryVar = (ry) this.c;
                if (animator.equals(ryVar.N0)) {
                    ryVar.N0 = null;
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
                nVar.removeView((m20) obj);
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
                    if (bz.o() > 0) {
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
                ((e3) ((t2) obj2).c).h.setVisibility(8);
                break;
            case 5:
                i3 i3Var = (i3) obj2;
                i3Var.n1 = null;
                i3Var.p1 = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                hi.q qVar = (hi.q) obj2;
                ((r1) obj).setDraw(true);
                if (qVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) qVar.getParent()).removeView(qVar);
                    break;
                }
                break;
            case 7:
                n nVar2 = (n) obj2;
                nVar2.removeView((m20) obj);
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
                    n8Var.fullScroll(ks.O1);
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
                z1Var.w.o2.setVisibility(0);
                z1Var.y.r(g0.L(22.0f));
                z1Var.y.setAlpha(ks.e4);
                jh.f fVar = z1Var.s;
                fVar.e = true;
                fVar.invalidate();
                ((Runnable) obj).run();
                break;
            case 12:
                zu zuVar = (zu) obj2;
                zuVar.b = true;
                zuVar.f = null;
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
                    n5 n5Var = kVar.n[0];
                    if (n5Var != null) {
                        n5Var.setVisibility(4);
                    }
                    if (kVar.r != null && !TextUtils.isEmpty(kVar.B0)) {
                        kVar.r.setVisibility(4);
                    }
                    z zVar = kVar.F;
                    if (zVar != null) {
                        zVar.setVisibility(4);
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
                    n6.mm = null;
                    actionBarLayout.j0 = null;
                    actionBarLayout.h0 = null;
                    actionBarLayout.r0 = null;
                    um umVar = ((r4) obj).j;
                    if (umVar != null) {
                        umVar.run();
                        break;
                    }
                }
                break;
            case 15:
                ((ActionBarLayout) obj2).n = false;
                ((h2) obj).onPreviewOpenAnimationEnd();
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
                q1 q1Var = ((il) obj2).b;
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().y0 = false;
                q0 q0Var = new q0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((b50) obj, (Property<b50, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(q1Var, q0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new x9(this, 7));
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
                ((lg) obj2).run();
                break;
            case 20:
                ((ua) obj2).run();
                break;
            case 21:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                ImageView imageView = chatActivityEnterView.Q0;
                if (animator.equals(chatActivityEnterView.f3)) {
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
                    chatActivityEnterView.f3 = null;
                    chatActivityEnterView.j3 = 0;
                    break;
                }
                break;
            case 22:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.z4.e();
                ((dd) obj).run();
                break;
            case 23:
                ((ii) obj).run();
                ((ChatActivityEnterView) obj2).z4.e();
                break;
            case 24:
                ((ChatActivityEnterView) obj2).p4 = null;
                ((dd) obj).run();
                break;
            case 25:
                si siVar = (si) obj2;
                AnimatorSet animatorSet3 = siVar.A0;
                if (animatorSet3 != null && animatorSet3.equals(animator) && (gVar = siVar.n4) != null && !gVar.f) {
                    ((k7) obj).run();
                    break;
                }
                break;
            case 26:
                du duVar = (du) obj2;
                if (duVar.a.p1.getVisibility() == 0) {
                    duVar.a.p1.setAlpha(1.0f);
                    duVar.a.p1.setVisibility(4);
                }
                ((Runnable) obj).run();
                break;
            case 27:
                ck0 ck0Var = (ck0) obj;
                ry ryVar = (ry) obj2;
                if (animator.equals(ryVar.N0)) {
                    ck0Var.setTranslationY(0.0f);
                    if (ck0Var == ryVar.E0) {
                        ck0Var.setPadding(0, 0, 0, ryVar.r2);
                    } else if (ck0Var == ryVar.Q) {
                        ck0Var.setPadding(g0.L(5.0f), 0, g0.L(5.0f), ryVar.r2);
                    } else if (ck0Var == ryVar.i0) {
                        ck0Var.setPadding(0, ryVar.c1, 0, ryVar.r2);
                    }
                    ryVar.N0 = null;
                    break;
                }
                break;
            case 28:
                f10 f10Var = (f10) obj2;
                f10Var.removeView((m20) obj);
                f10Var.e.clear();
                f10Var.a = null;
                f10Var.b = false;
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                f10 f10Var2 = (f10) obj2;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    f10Var2.removeView((View) arrayList.get(i12));
                }
                f10Var2.e.clear();
                f10Var2.a = null;
                f10Var2.b = false;
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
