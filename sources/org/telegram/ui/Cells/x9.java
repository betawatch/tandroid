package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.e50;
import org.telegram.ui.ax;
import org.telegram.ui.bc;
import org.telegram.ui.bu;
import org.telegram.ui.bx;
import org.telegram.ui.ch;
import org.telegram.ui.cu;
import org.telegram.ui.du;
import org.telegram.ui.fv;
import org.telegram.ui.il;
import org.telegram.ui.jh;
import org.telegram.ui.kl;
import org.telegram.ui.lb;
import org.telegram.ui.px;
import org.telegram.ui.qc;
import org.telegram.ui.rj;
import org.telegram.ui.rq;
import org.telegram.ui.sb;
import org.telegram.ui.uw;
import org.telegram.ui.xo;
import org.telegram.ui.xw;
import org.telegram.ui.yp;
import org.telegram.ui.ys;
import org.telegram.ui.zb1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x9(Object obj, int i7) {
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
                ((z9) ((y9) h1Var.b).b).getTransitionParams().e();
                ((z9) ((y9) h1Var.b).b).getTransitionParams().h = false;
                ((z9) ((y9) h1Var.b).b).getTransitionParams().L1 = 1.0f;
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
                org.telegram.ui.Components.p9 p9Var = jhVar.c;
                if (p9Var != null) {
                    p9Var.setTranslationY(0.0f);
                }
                jhVar.n.W2[1] = null;
                break;
            case 6:
                rj rjVar = (rj) this.b;
                rjVar.setAnimatedTop(0);
                View view = rjVar.w2;
                if (view != null && view.getVisibility() == 0) {
                    rjVar.w2.setTranslationY(((1.0f - rjVar.getTopViewEnterProgress()) * rjVar.w2.getLayoutParams().height) + rjVar.J2);
                }
                rjVar.w7.M9 = null;
                break;
            case 7:
                ah.l lVar = (ah.l) this.b;
                e50 e50Var = ((il) lVar.c).c.R.q3;
                if (e50Var != null) {
                    e50Var.setIsMessageTransition(false);
                    ((il) lVar.c).c.R.q3.d(true);
                    ((il) lVar.c).c.R.q3.setVisibility(4);
                    break;
                }
                break;
            case 8:
                il ilVar = (il) this.b;
                kl klVar = ilVar.c;
                ArrayList arrayList = klVar.R.F6;
                r1 r1Var = ilVar.b;
                arrayList.remove(r1Var);
                View view2 = klVar.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    klVar.R.A0.invalidate();
                }
                r1Var.setAlpha(1.0f);
                r1Var.getTransitionParams().y0 = false;
                break;
            case 9:
                xo xoVar = (xo) this.b;
                xoVar.M = 0.0f;
                xoVar.L = 1.0f;
                View view3 = xoVar.b0;
                if (view3 != null) {
                    view3.invalidate();
                }
                xoVar.U.invalidate();
                ch chVar = xoVar.Z;
                if (chVar != null) {
                    chVar.run();
                    xoVar.Z = null;
                    break;
                }
                break;
            case 10:
                yp ypVar = (yp) this.b;
                View view4 = ypVar.b;
                view4.setAlpha(1.0f);
                v4.p0.x0(view4);
                ((rq) ypVar.d).c.removeView(view4);
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
                zb1 zb1Var = (zb1) this.b;
                if (!zb1Var.a) {
                    zb1Var.W.w.T = true;
                    zb1Var.W.w.invalidate();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.voip.m1 m1Var = (org.telegram.ui.Components.voip.m1) this.b;
                m1Var.i = false;
                m1Var.l.setAlpha(35);
                m1Var.k.setAlpha(ks.n1);
                m1Var.j.setAlpha(35);
                m1Var.c();
                break;
            case 16:
                org.telegram.ui.Components.voip.r1 r1Var2 = ((org.telegram.ui.Components.voip.p1) this.b).c;
                r1Var2.P = false;
                r1Var2.requestLayout();
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
                org.telegram.messenger.g0.O3(((org.telegram.ui.Components.voip.s2) this.b).a);
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
                bu buVar = (bu) this.b;
                du duVar = buVar.n;
                cu[] cuVarArr = duVar.f;
                duVar.h = null;
                if (duVar.s) {
                    cuVarArr[1].setVisibility(8);
                } else {
                    cu cuVar = cuVarArr[0];
                    cuVarArr[0] = cuVarArr[1];
                    cuVarArr[1] = cuVar;
                    cuVar.setVisibility(8);
                    duVar.x = duVar.f[0].f == duVar.e.getFirstTabId();
                    duVar.e.i(1.0f, duVar.f[0].f);
                }
                duVar.n = false;
                buVar.c = false;
                buVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
                kVar.setEnabled(true);
                duVar.e.setEnabled(true);
                break;
            case 25:
                fv fvVar = (fv) this.b;
                bx.v1(fvVar.M, fvVar.L, 0.0f);
                break;
            case 26:
                bx bxVar = (bx) this.b;
                boolean z10 = bxVar.H0;
                bxVar.I0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    bxVar.F0.setVisibility(8);
                }
                View view5 = bxVar.fragmentView;
                if (view5 != null) {
                    view5.invalidate();
                    break;
                }
                break;
            case 27:
                bx bxVar2 = ((uw) this.b).o0;
                bxVar2.i3 = null;
                if (!bxVar2.m3) {
                    ax[] axVarArr = bxVar2.f0;
                    ax axVar = axVarArr[0];
                    ax axVar2 = axVarArr[1];
                    axVarArr[0] = axVar2;
                    axVarArr[1] = axVar;
                    bxVar2.A0.h(1.0f, axVar2.h);
                    bxVar2.n5(false);
                    bxVar2.C5(-1, true);
                    bxVar2.f0[0].d.getClass();
                    bxVar2.f0[1].d.getClass();
                }
                bxVar2.f0[1].setVisibility(8);
                bx.i1(bxVar2, true);
                bxVar2.j3 = false;
                bxVar2.p3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.g2) bxVar2).actionBar;
                kVar2.setEnabled(true);
                bxVar2.A0.setEnabled(true);
                bxVar2.C3(bxVar2.f0[0]);
                break;
            case 28:
                super.onAnimationEnd(animator);
                ((xw) this.b).setScrollEnabled(true);
                break;
            default:
                px pxVar = (px) this.b;
                if (pxVar.w == animator) {
                    pxVar.w = null;
                    break;
                }
                break;
        }
    }

    public x9(yp ypVar, v4.p0 p0Var) {
        this.a = 10;
        this.b = ypVar;
    }
}
