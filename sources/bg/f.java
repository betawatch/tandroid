package bg;

import ag.d3;
import ag.p2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import bi.k2;
import java.util.ArrayList;
import jg.h2;
import kg.i1;
import kg.v0;
import kg.v1;
import org.telegram.messenger.i0;
import org.telegram.messenger.qv;
import org.telegram.messenger.v2;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.y;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.r4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.fe;
import org.telegram.ui.Components.g50;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.dm;
import org.telegram.ui.nn;
import org.telegram.ui.rh;
import org.telegram.ui.s0;
import org.telegram.ui.s9;
import org.telegram.ui.tp;
import org.telegram.ui.un;
import org.telegram.ui.uq;
import s4.a0;
import s4.n0;
import w7.d6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 8:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) this.b;
                AnimatorSet animatorSet = lVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lVar.P = null;
                    break;
                }
                break;
            case 9:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                if (animator.equals(actionBarLayout.q0)) {
                    actionBarLayout.h0.clear();
                    actionBarLayout.b0.clear();
                    actionBarLayout.c0.clear();
                    actionBarLayout.j0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    t6.jm = null;
                    actionBarLayout.i0 = null;
                    actionBarLayout.g0 = null;
                    actionBarLayout.q0 = null;
                    nn nnVar = ((y4) this.c).j;
                    if (nnVar != null) {
                        nnVar.run();
                        break;
                    }
                }
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                if (animator.equals(chatActivityEnterView.r2)) {
                    chatActivityEnterView.r2 = null;
                    break;
                }
                break;
            case 20:
                bi biVar = (bi) this.b;
                AnimatorSet animatorSet2 = biVar.z0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    biVar.z0 = null;
                    biVar.A0 = 0;
                    break;
                }
                break;
            case 22:
                vy vyVar = (vy) this.b;
                if (animator.equals(vyVar.M0)) {
                    vyVar.M0 = null;
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
        o1.j jVar;
        int i10 = this.a;
        int i11 = 8;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                i iVar = (i) obj2;
                iVar.b.clear();
                iVar.b.add((dg.e) obj);
                break;
            case 1:
                super.onAnimationEnd(animator);
                i iVar2 = (i) obj2;
                iVar2.c.clear();
                iVar2.c.add((dg.b) obj);
                break;
            case 2:
                k2 k2Var = (k2) obj2;
                k2Var.E = false;
                k2Var.w.setAlpha(1.0f);
                k2Var.w.A1.setVisibility(0);
                k2Var.y.q(i0.L(22.0f));
                k2Var.y.setAlpha(zs.e4);
                zg.e eVar = k2Var.s;
                eVar.e = true;
                eVar.invalidate();
                ((Runnable) obj).run();
                break;
            case 3:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.k0 = null;
                break;
            case 4:
                h2 h2Var = (h2) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    h2Var.r0.b(h2Var.y0, false);
                }
                h2Var.setRotationY(0.0f);
                h2Var.z0 = 1.0f;
                break;
            case 5:
                ((i1) obj2).s1 = false;
                ((v0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                break;
            case 6:
                v1 v1Var = (v1) obj2;
                v1Var.z2 = false;
                v1Var.y2 = 1.0f;
                v1Var.k2.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, zs.e4);
                    ofInt.addUpdateListener(new p2(i11, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                break;
            case 7:
                qv qvVar = (qv) obj2;
                qvVar.b = true;
                qvVar.f = null;
                View view = (View) obj;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj2;
                AnimatorSet animatorSet = lVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lVar.P = null;
                    u5 u5Var = lVar.n[0];
                    if (u5Var != null) {
                        u5Var.setVisibility(4);
                    }
                    if (lVar.r != null && !TextUtils.isEmpty(lVar.A0)) {
                        lVar.r.setVisibility(4);
                    }
                    y yVar = lVar.E;
                    if (yVar != null) {
                        yVar.setVisibility(4);
                    }
                    if (lVar.Q != null) {
                        while (true) {
                            View[] viewArr = lVar.Q;
                            if (i12 >= viewArr.length) {
                                break;
                            } else {
                                View view2 = viewArr[i12];
                                if (view2 != null && ((zArr = (boolean[]) obj) == null || i12 >= zArr.length || zArr[i12])) {
                                    view2.setVisibility(4);
                                }
                                i12++;
                            }
                        }
                    }
                }
                break;
            case 9:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                actionBarLayout.r0.e();
                if (animator.equals(actionBarLayout.q0)) {
                    actionBarLayout.h0.clear();
                    actionBarLayout.b0.clear();
                    actionBarLayout.c0.clear();
                    actionBarLayout.j0.clear();
                    actionBarLayout.j();
                    actionBarLayout.j();
                    t6.jm = null;
                    actionBarLayout.i0 = null;
                    actionBarLayout.g0 = null;
                    actionBarLayout.q0 = null;
                    nn nnVar = ((y4) obj).j;
                    if (nnVar != null) {
                        nnVar.run();
                        break;
                    }
                }
                break;
            case 10:
                ((ActionBarLayout) obj2).n = false;
                ((org.telegram.ui.ActionBar.k2) obj).onPreviewOpenAnimationEnd();
                break;
            case 11:
                View view3 = (View) obj;
                un unVar = (un) obj2;
                unVar.T9 = 0.0f;
                if (animator == unVar.Bb) {
                    ViewGroup viewGroup = (ViewGroup) view3.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view3);
                    }
                    unVar.n3 = null;
                    unVar.Bb = null;
                    break;
                }
                break;
            case 12:
                q1 q1Var = ((dm) obj2).b;
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().y0 = false;
                s0 s0Var = new s0("alpha", 2);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat((g50) obj, (Property<g50, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(q1Var, s0Var, 1.0f));
                animatorSet2.setDuration(100L);
                animatorSet2.setInterpolator(new DecelerateInterpolator());
                animatorSet2.addListener(new s9(this, 18));
                animatorSet2.start();
                break;
            case 13:
                tp tpVar = (tp) obj2;
                tpVar.L = 0.0f;
                tpVar.K = 1.0f;
                ((View) obj).invalidate();
                tpVar.T.invalidate();
                rh rhVar = tpVar.Y;
                if (rhVar != null) {
                    rhVar.run();
                    tpVar.Y = null;
                    break;
                }
                break;
            case 14:
                ((tf) obj2).run();
                break;
            case 15:
                ((ja) obj2).run();
                break;
            case 16:
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
                    fe feVar = chatActivityEnterView.S0;
                    if (feVar != null) {
                        feVar.setVisibility(8);
                    }
                    chatActivityEnterView.setSlowModeButtonVisible(false);
                    chatActivityEnterView.r2 = null;
                    chatActivityEnterView.v2 = 0;
                    break;
                }
                break;
            case 17:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                chatActivityEnterView2.V0 = null;
                chatActivityEnterView2.L3.e();
                ((tc) obj).run();
                break;
            case 18:
                ((d3) obj).run();
                ((ChatActivityEnterView) obj2).L3.e();
                break;
            case 19:
                ((ChatActivityEnterView) obj2).B3 = null;
                ((tc) obj).run();
                break;
            case 20:
                bi biVar = (bi) obj2;
                AnimatorSet animatorSet3 = biVar.z0;
                if (animatorSet3 != null && animatorSet3.equals(animator) && (jVar = biVar.j4) != null && !jVar.f) {
                    ((jg) obj).run();
                    break;
                }
                break;
            case 21:
                du duVar = (du) obj2;
                if (duVar.a.l1.getVisibility() == 0) {
                    duVar.a.l1.setAlpha(1.0f);
                    duVar.a.l1.setVisibility(4);
                }
                ((Runnable) obj).run();
                break;
            case 22:
                tk0 tk0Var = (tk0) obj;
                vy vyVar = (vy) obj2;
                if (animator.equals(vyVar.M0)) {
                    tk0Var.setTranslationY(0.0f);
                    if (tk0Var == vyVar.D0) {
                        tk0Var.setPadding(0, 0, 0, vyVar.q2);
                    } else if (tk0Var == vyVar.P) {
                        tk0Var.setPadding(i0.L(5.0f), 0, i0.L(5.0f), vyVar.q2);
                    } else if (tk0Var == vyVar.h0) {
                        tk0Var.setPadding(0, vyVar.b1, 0, vyVar.q2);
                    }
                    vyVar.M0 = null;
                    break;
                }
                break;
            case 23:
                k10 k10Var = (k10) obj2;
                k10Var.removeView((s20) obj);
                k10Var.e.clear();
                k10Var.a = null;
                k10Var.b = false;
                break;
            case 24:
                ArrayList arrayList = (ArrayList) obj;
                k10 k10Var2 = (k10) obj2;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    k10Var2.removeView((View) arrayList.get(i13));
                }
                k10Var2.e.clear();
                k10Var2.a = null;
                k10Var2.b = false;
                break;
            case 25:
                l60 l60Var = (l60) obj2;
                l60Var.removeView((s20) obj);
                l60Var.c = null;
                l60Var.e.U1 = null;
                l60Var.a = false;
                break;
            case 26:
                sj0 sj0Var = (sj0) obj2;
                vj0 vj0Var = sj0Var.e;
                if (((ValueAnimator) vj0Var.g) != null) {
                    ((tk0) vj0Var.e).V1 = false;
                    ArrayList arrayList2 = sj0Var.b;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        View view4 = (View) obj3;
                        if (view4 instanceof r4) {
                            ((r4) view4).b(false, true);
                        }
                        view4.setTranslationY(0.0f);
                        ((a0) vj0Var.f).getClass();
                        n0.x0(view4);
                        ((tk0) vj0Var.e).removeView(view4);
                        d6 d6Var = (d6) vj0Var.i;
                        if (d6Var != null) {
                            d6Var.d(view4);
                        }
                    }
                    ((tk0) vj0Var.e).setScrollEnabled(true);
                    ((tk0) vj0Var.e).setVerticalScrollBarEnabled(true);
                    boolean z10 = v2.a;
                    int childCount = ((tk0) vj0Var.e).getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = ((tk0) vj0Var.e).getChildAt(i15);
                        if (childAt instanceof r4) {
                            ((r4) childAt).b(false, false);
                        }
                        childAt.setTranslationY(0.0f);
                    }
                    ArrayList arrayList3 = (ArrayList) obj;
                    int size2 = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj4 = arrayList3.get(i16);
                        i16++;
                        View view5 = (View) obj4;
                        if (view5 instanceof r4) {
                            ((r4) view5).b(false, false);
                        }
                        view5.setTranslationY(0.0f);
                    }
                    tj0 tj0Var = sj0Var.d;
                    if (tj0Var != null) {
                        tj0Var.E();
                    }
                    d6 d6Var2 = (d6) vj0Var.i;
                    if (d6Var2 != null) {
                        d6Var2.a();
                    }
                    ((SparseArray) vj0Var.j).clear();
                    vj0Var.g = null;
                    break;
                }
                break;
            case 27:
                zz zzVar = (zz) obj;
                zzVar.setAlpha(1.0f);
                n0.x0(zzVar);
                wj0 wj0Var = (wj0) obj2;
                wj0Var.c.remove(zzVar);
                wj0Var.a.removeView(zzVar);
                break;
            case 28:
                super.onAnimationEnd(animator);
                uq uqVar = (uq) obj2;
                ((wj0) uqVar.d).g.remove((AnimatorSet) obj);
                if (((wj0) uqVar.d).g.isEmpty()) {
                    ((wj0) uqVar.d).b.clear();
                    wj0 wj0Var2 = (wj0) uqVar.d;
                    wj0Var2.d = true;
                    wj0Var2.a.invalidate();
                    break;
                }
                break;
            default:
                co0 co0Var = (co0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(co0Var.B);
                } catch (Exception unused) {
                }
                gi0 gi0Var = co0Var.C;
                if (gi0Var != null) {
                    i0.r(gi0Var);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 8:
                ((org.telegram.ui.ActionBar.l) this.b).F.setVisibility(0);
                break;
            case 14:
                ((la) this.c).run();
                break;
            case 15:
                ((la) this.c).run();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ f(Runnable runnable, Runnable runnable2, int i10) {
        this.a = i10;
        this.c = runnable;
        this.b = runnable2;
    }

    public f(wj0 wj0Var, zz zzVar, n0 n0Var) {
        this.a = 27;
        this.b = wj0Var;
        this.c = zzVar;
    }
}
