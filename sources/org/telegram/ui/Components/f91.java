package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.transition.TransitionValues;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.bi1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f91(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 24:
                ((org.telegram.ui.bf0) this.b).s = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                ((h91) this.b).H = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.b).view.setEnabled(true);
                break;
            case 2:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.b).p0;
                if (tVar.u0.getParent() != null) {
                    tVar.a.removeView(tVar.u0);
                    break;
                }
                break;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.b;
                if (u0Var.getParent() != null) {
                    ((ViewGroup) u0Var.getParent()).removeView(u0Var);
                    break;
                }
                break;
            case 4:
                bi1 bi1Var = (bi1) this.b;
                if (!bi1Var.a) {
                    bi1Var.S.v.P = true;
                    bi1Var.S.v.invalidate();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.b;
                n1Var.i = false;
                n1Var.l.setAlpha(35);
                n1Var.k.setAlpha(102);
                n1Var.j.setAlpha(35);
                n1Var.c();
                break;
            case 6:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.b).c;
                s1Var.L = false;
                s1Var.requestLayout();
                break;
            case 7:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.b;
                s2Var.K = 0.0f;
                s2Var.L = 0.0f;
                org.telegram.ui.Components.voip.r2 r2Var = s2Var.d;
                r2Var.setScaleX(s2Var.Q);
                r2Var.setScaleY(s2Var.Q);
                TextureView textureView = s2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(s2Var.R);
                    textureView.setScaleY(s2Var.R);
                }
                s2Var.setTranslationY(0.0f);
                s2Var.setTranslationX(0.0f);
                s2Var.T = s2Var.S;
                s2Var.V = null;
                break;
            case 8:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.b;
                v2Var.N = v2Var.M ? 1.0f : 0.0f;
                v2Var.a(v2Var.O, v2Var.P);
                break;
            case 9:
                ((org.telegram.ui.Components.voip.w2) this.b).c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.w2) this.b).a);
                if (((org.telegram.ui.Components.voip.w2) this.b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.w2) this.b).a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.w2) this.b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.w2) this.b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.voip.c3 c3Var = (org.telegram.ui.Components.voip.c3) this.b;
                c3Var.G = false;
                c3Var.Q.e = false;
                if (c3Var.R && (animatorSet = c3Var.N) != null) {
                    animatorSet.cancel();
                    c3Var.N.start();
                }
                c3Var.c();
                break;
            case 11:
                ((org.telegram.ui.Components.voip.k3) this.b).e.setVisibility(8);
                break;
            case 12:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 13:
                org.telegram.ui.gu guVar = (org.telegram.ui.gu) this.b;
                if (animator.equals(guVar.n[0])) {
                    guVar.n[0] = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.kv kvVar = (org.telegram.ui.kv) this.b;
                org.telegram.ui.mv mvVar = kvVar.n;
                org.telegram.ui.lv[] lvVarArr = mvVar.f;
                mvVar.h = null;
                if (mvVar.s) {
                    lvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.lv lvVar = lvVarArr[0];
                    lvVarArr[0] = lvVarArr[1];
                    lvVarArr[1] = lvVar;
                    lvVar.setVisibility(8);
                    mvVar.w = mvVar.f[0].f == mvVar.e.getFirstTabId();
                    mvVar.e.j(1.0f, mvVar.f[0].f);
                }
                mvVar.n = false;
                kvVar.c = false;
                kvVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.p2) mvVar).actionBar;
                kVar.setEnabled(true);
                mvVar.e.setEnabled(true);
                break;
            case 15:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) this.b;
                org.telegram.ui.qy.q1(uwVar.M, uwVar.L, 0.0f);
                break;
            case 16:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.b;
                boolean z4 = qyVar.D0;
                qyVar.E0 = z4 ? 1.0f : 0.0f;
                if (!z4) {
                    qyVar.B0.setVisibility(8);
                }
                View view = qyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.qy qyVar2 = ((org.telegram.ui.jy) this.b).B0;
                qyVar2.c3 = null;
                if (!qyVar2.g3) {
                    org.telegram.ui.py[] pyVarArr = qyVar2.b0;
                    org.telegram.ui.py pyVar = pyVarArr[0];
                    org.telegram.ui.py pyVar2 = pyVarArr[1];
                    pyVarArr[0] = pyVar2;
                    pyVarArr[1] = pyVar;
                    qyVar2.w0.g(1.0f, pyVar2.h);
                    qyVar2.T4(false);
                    qyVar2.b0[0].d.getClass();
                    qyVar2.b0[1].d.getClass();
                }
                qyVar2.b0[1].setVisibility(8);
                org.telegram.ui.qy.f1(qyVar2, true);
                qyVar2.d3 = false;
                qyVar2.j3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.p2) qyVar2).actionBar;
                kVar2.setEnabled(true);
                qyVar2.w0.setEnabled(true);
                qyVar2.r3(qyVar2.b0[0]);
                break;
            case 18:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.my) this.b).setScrollEnabled(true);
                break;
            case 19:
                t80 t80Var = (t80) this.b;
                FrameLayout frameLayout = t80Var.b;
                eg.i0 i0Var = (eg.i0) t80Var.c;
                if (i0Var.getParent() != null) {
                    frameLayout.removeView(i0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ci) t80Var.d);
                break;
            case 20:
                org.telegram.ui.e60 e60Var = ((org.telegram.ui.f50) this.b).o;
                org.telegram.ui.e60 e60Var2 = org.telegram.ui.e60.A3;
                e60Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
                viewGroup.invalidate();
                e60Var.N.invalidate();
                if (e60Var.p0) {
                    e60Var.p0 = false;
                    e60Var.O0(true);
                    break;
                }
                break;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.s50 s50Var = (org.telegram.ui.s50) this.b;
                s50Var.G = null;
                org.telegram.ui.e60 e60Var3 = s50Var.L;
                e60Var3.N.invalidate();
                e60Var3.X1.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.g3) e60Var3).containerView;
                viewGroup2.invalidate();
                org.telegram.ui.e60.J0(e60Var3);
                s50Var.H.clear();
                s50Var.I.clear();
                break;
            case 22:
                org.telegram.ui.d80 d80Var = (org.telegram.ui.d80) this.b;
                d80Var.d = null;
                d80Var.a = null;
                d80Var.b = false;
                break;
            case 23:
                org.telegram.ui.cd0 cd0Var = (org.telegram.ui.cd0) this.b;
                cd0Var.E = false;
                cd0Var.o0();
                break;
            case 24:
                org.telegram.ui.bf0 bf0Var = (org.telegram.ui.bf0) this.b;
                if (bf0Var.s != null && bf0Var.n != null) {
                    bf0Var.r.setVisibility(4);
                    bf0Var.s = null;
                    break;
                }
                break;
            case 25:
                ((org.telegram.ui.cj0) this.b).Q.setVisibility(8);
                break;
            case 26:
                org.telegram.ui.wj0 wj0Var = (org.telegram.ui.wj0) this.b;
                wj0Var.f = 1.0f;
                wj0Var.invalidate();
                break;
            case 27:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 28:
                org.telegram.ui.np0 np0Var = (org.telegram.ui.np0) this.b;
                org.telegram.ui.mc mcVar = np0Var.U;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) np0Var.U.getParent()).removeView(np0Var.U);
                    }
                    np0Var.U = null;
                }
                np0Var.W = null;
                super.onAnimationEnd(animator);
                break;
            default:
                org.telegram.ui.oq0 oq0Var = (org.telegram.ui.oq0) this.b;
                org.telegram.ui.rq0 rq0Var = oq0Var.A0;
                org.telegram.ui.pq0[] pq0VarArr = rq0Var.n;
                rq0Var.r = null;
                if (rq0Var.w) {
                    pq0VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.pq0 pq0Var = pq0VarArr[0];
                    pq0VarArr[0] = pq0VarArr[1];
                    pq0VarArr[1] = pq0Var;
                    pq0Var.setVisibility(8);
                    rq0Var.e = rq0Var.n[0].e == rq0Var.h.getFirstTabId();
                    rq0Var.h.j(1.0f, rq0Var.n[0].e);
                }
                rq0Var.s = false;
                oq0Var.v0 = false;
                oq0Var.u0 = false;
                kVar3 = ((org.telegram.ui.ActionBar.p2) rq0Var).actionBar;
                kVar3.setEnabled(true);
                rq0Var.h.setEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationStart(animator);
                ((TransitionValues) this.b).view.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
