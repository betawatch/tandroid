package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.w40;
import org.telegram.ui.au;
import org.telegram.ui.bc;
import org.telegram.ui.bh;
import org.telegram.ui.bu;
import org.telegram.ui.cu;
import org.telegram.ui.dv;
import org.telegram.ui.hl;
import org.telegram.ui.jh;
import org.telegram.ui.jl;
import org.telegram.ui.lb;
import org.telegram.ui.nx;
import org.telegram.ui.qc;
import org.telegram.ui.qj;
import org.telegram.ui.qq;
import org.telegram.ui.rw;
import org.telegram.ui.sb;
import org.telegram.ui.uw;
import org.telegram.ui.wo;
import org.telegram.ui.xp;
import org.telegram.ui.xw;
import org.telegram.ui.yb1;
import org.telegram.ui.ys;
import org.telegram.ui.yw;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class w9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w9(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                org.telegram.ui.ActionBar.h1 h1Var = (org.telegram.ui.ActionBar.h1) this.b;
                ((y9) ((x9) h1Var.b).b).getTransitionParams().e();
                ((y9) ((x9) h1Var.b).b).getTransitionParams().h = false;
                ((y9) ((x9) h1Var.b).b).getTransitionParams().L1 = 1.0f;
                break;
            case 1:
                org.telegram.ui.g3 g3Var = (org.telegram.ui.g3) this.b;
                if (animator.equals(((lb) g3Var.b).S)) {
                    ((lb) g3Var.b).S = null;
                    break;
                }
                break;
            case 2:
                lb lbVar = (lb) this.b;
                if (animator.equals(lbVar.S)) {
                    lbVar.S = null;
                    break;
                }
                break;
            case 3:
                ((sb) this.b).I.setVisibility(8);
                break;
            case 4:
                qc qcVar = (qc) this.b;
                bc bcVar = qcVar.n0;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) qcVar.n0.getParent()).removeView(qcVar.n0);
                    }
                    qcVar.n0 = null;
                }
                qcVar.p0 = null;
                super.onAnimationEnd(animator);
                break;
            case 5:
                jh jhVar = (jh) this.b;
                if (jhVar.a) {
                    jhVar.d.setTranslationY(0.0f);
                }
                if (jhVar.b) {
                    jhVar.e.setTranslationY(0.0f);
                }
                if (jhVar.f) {
                    jhVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.i9 i9Var = jhVar.c;
                if (i9Var != null) {
                    i9Var.setTranslationY(0.0f);
                }
                jhVar.n.W2[1] = null;
                break;
            case 6:
                qj qjVar = (qj) this.b;
                qjVar.setAnimatedTop(0);
                View view = qjVar.o2;
                if (view != null && view.getVisibility() == 0) {
                    qjVar.o2.setTranslationY(((1.0f - qjVar.getTopViewEnterProgress()) * qjVar.o2.getLayoutParams().height) + qjVar.B2);
                }
                qjVar.R6.L9 = null;
                break;
            case 7:
                ah.l lVar = (ah.l) this.b;
                w40 w40Var = ((hl) lVar.c).c.R.q3;
                if (w40Var != null) {
                    w40Var.setIsMessageTransition(false);
                    ((hl) lVar.c).c.R.q3.d(true);
                    ((hl) lVar.c).c.R.q3.setVisibility(4);
                    break;
                }
                break;
            case 8:
                hl hlVar = (hl) this.b;
                jl jlVar = hlVar.c;
                ArrayList arrayList = jlVar.R.E6;
                q1 q1Var = hlVar.b;
                arrayList.remove(q1Var);
                View view2 = jlVar.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    jlVar.R.A0.invalidate();
                }
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().y0 = false;
                break;
            case 9:
                wo woVar = (wo) this.b;
                woVar.M = 0.0f;
                woVar.L = 1.0f;
                View view3 = woVar.b0;
                if (view3 != null) {
                    view3.invalidate();
                }
                woVar.U.invalidate();
                bh bhVar = woVar.Z;
                if (bhVar != null) {
                    bhVar.run();
                    woVar.Z = null;
                    break;
                }
                break;
            case 10:
                xp xpVar = (xp) this.b;
                View view4 = xpVar.b;
                view4.setAlpha(1.0f);
                v4.o0.x0(view4);
                ((qq) xpVar.d).c.removeView(view4);
                break;
            case 11:
                org.telegram.ui.Components.voip.z zVar = ((org.telegram.ui.Components.voip.v) this.b).t0;
                if (zVar.y0.getParent() != null) {
                    zVar.a.removeView(zVar.y0);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.voip.b0 b0Var = (org.telegram.ui.Components.voip.b0) this.b;
                b0Var.s = null;
                b0Var.r = 1.0f;
                b0Var.b();
                b0Var.e();
                break;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.b;
                if (x0Var.getParent() != null) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    break;
                }
                break;
            case 14:
                yb1 yb1Var = (yb1) this.b;
                if (!yb1Var.a) {
                    yb1Var.W.w.T = true;
                    yb1Var.W.w.invalidate();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.voip.m1 m1Var = (org.telegram.ui.Components.voip.m1) this.b;
                m1Var.i = false;
                m1Var.l.setAlpha(35);
                m1Var.k.setAlpha(ns.n1);
                m1Var.j.setAlpha(35);
                m1Var.c();
                break;
            case 16:
                org.telegram.ui.Components.voip.r1 r1Var = ((org.telegram.ui.Components.voip.p1) this.b).c;
                r1Var.P = false;
                r1Var.requestLayout();
                break;
            case 17:
                org.telegram.ui.Components.voip.o2 o2Var = (org.telegram.ui.Components.voip.o2) this.b;
                o2Var.O = 0.0f;
                o2Var.P = 0.0f;
                org.telegram.ui.Components.voip.n2 n2Var = o2Var.d;
                n2Var.setScaleX(o2Var.U);
                n2Var.setScaleY(o2Var.U);
                TextureView textureView = o2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(o2Var.V);
                    textureView.setScaleY(o2Var.V);
                }
                o2Var.setTranslationY(0.0f);
                o2Var.setTranslationX(0.0f);
                o2Var.a0 = o2Var.W;
                o2Var.c0 = null;
                break;
            case 18:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) this.b;
                r2Var.R = r2Var.Q ? 1.0f : 0.0f;
                r2Var.a(r2Var.S, r2Var.T);
                break;
            case 19:
                ((org.telegram.ui.Components.voip.s2) this.b).c.e();
                org.telegram.messenger.g0.P3(((org.telegram.ui.Components.voip.s2) this.b).a);
                if (((org.telegram.ui.Components.voip.s2) this.b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.s2) this.b).a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.s2) this.b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.s2) this.b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.voip.y2 y2Var = (org.telegram.ui.Components.voip.y2) this.b;
                y2Var.K = false;
                y2Var.U.e = false;
                if (y2Var.V && (animatorSet = y2Var.R) != null) {
                    animatorSet.cancel();
                    y2Var.R.start();
                }
                y2Var.c();
                break;
            case 21:
                ((org.telegram.ui.Components.voip.f3) this.b).e.setVisibility(8);
                break;
            case 22:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 23:
                ys ysVar = (ys) this.b;
                if (animator.equals(ysVar.n[0])) {
                    ysVar.n[0] = null;
                    break;
                }
                break;
            case 24:
                au auVar = (au) this.b;
                cu cuVar = auVar.n;
                bu[] buVarArr = cuVar.f;
                cuVar.h = null;
                if (cuVar.s) {
                    buVarArr[1].setVisibility(8);
                } else {
                    bu buVar = buVarArr[0];
                    buVarArr[0] = buVarArr[1];
                    buVarArr[1] = buVar;
                    buVar.setVisibility(8);
                    cuVar.x = cuVar.f[0].f == cuVar.e.getFirstTabId();
                    cuVar.e.i(1.0f, cuVar.f[0].f);
                }
                cuVar.n = false;
                auVar.c = false;
                auVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.e2) cuVar).actionBar;
                kVar.setEnabled(true);
                cuVar.e.setEnabled(true);
                break;
            case 25:
                dv dvVar = (dv) this.b;
                yw.u1(dvVar.M, dvVar.L, 0.0f);
                break;
            case 26:
                yw ywVar = (yw) this.b;
                boolean z10 = ywVar.H0;
                ywVar.I0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    ywVar.F0.setVisibility(8);
                }
                View view5 = ywVar.fragmentView;
                if (view5 != null) {
                    view5.invalidate();
                    break;
                }
                break;
            case 27:
                yw ywVar2 = ((rw) this.b).o0;
                ywVar2.i3 = null;
                if (!ywVar2.m3) {
                    xw[] xwVarArr = ywVar2.f0;
                    xw xwVar = xwVarArr[0];
                    xw xwVar2 = xwVarArr[1];
                    xwVarArr[0] = xwVar2;
                    xwVarArr[1] = xwVar;
                    ywVar2.A0.g(1.0f, xwVar2.h);
                    ywVar2.f5(false);
                    ywVar2.f0[0].d.getClass();
                    ywVar2.f0[1].d.getClass();
                }
                ywVar2.f0[1].setVisibility(8);
                yw.j1(ywVar2, true);
                ywVar2.j3 = false;
                ywVar2.p3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.e2) ywVar2).actionBar;
                kVar2.setEnabled(true);
                ywVar2.A0.setEnabled(true);
                ywVar2.C3(ywVar2.f0[0]);
                break;
            case 28:
                super.onAnimationEnd(animator);
                ((uw) this.b).setScrollEnabled(true);
                break;
            default:
                nx nxVar = (nx) this.b;
                if (nxVar.w == animator) {
                    nxVar.w = null;
                    break;
                }
                break;
        }
    }

    public w9(xp xpVar, v4.o0 o0Var) {
        this.a = 10;
        this.b = xpVar;
    }
}
