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
import org.telegram.ui.Components.h50;
import org.telegram.ui.bc;
import org.telegram.ui.bc1;
import org.telegram.ui.bh;
import org.telegram.ui.bx;
import org.telegram.ui.cu;
import org.telegram.ui.cx;
import org.telegram.ui.du;
import org.telegram.ui.eu;
import org.telegram.ui.gv;
import org.telegram.ui.il;
import org.telegram.ui.jh;
import org.telegram.ui.kl;
import org.telegram.ui.lb;
import org.telegram.ui.qc;
import org.telegram.ui.qx;
import org.telegram.ui.rj;
import org.telegram.ui.rq;
import org.telegram.ui.sb;
import org.telegram.ui.vw;
import org.telegram.ui.yo;
import org.telegram.ui.yp;
import org.telegram.ui.yw;
import org.telegram.ui.zs;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class y9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y9(Object obj, int i7) {
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
                ((aa) ((z9) h1Var.b).b).getTransitionParams().e();
                ((aa) ((z9) h1Var.b).b).getTransitionParams().h = false;
                ((aa) ((z9) h1Var.b).b).getTransitionParams().L1 = 1.0f;
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
                org.telegram.ui.Components.q9 q9Var = jhVar.c;
                if (q9Var != null) {
                    q9Var.setTranslationY(0.0f);
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
                h50 h50Var = ((il) lVar.c).c.R.q3;
                if (h50Var != null) {
                    h50Var.setIsMessageTransition(false);
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
                yo yoVar = (yo) this.b;
                yoVar.M = 0.0f;
                yoVar.L = 1.0f;
                View view3 = yoVar.b0;
                if (view3 != null) {
                    view3.invalidate();
                }
                yoVar.U.invalidate();
                bh bhVar = yoVar.Z;
                if (bhVar != null) {
                    bhVar.run();
                    yoVar.Z = null;
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
                org.telegram.ui.Components.voip.y yVar = ((org.telegram.ui.Components.voip.u) this.b).t0;
                if (yVar.y0.getParent() != null) {
                    yVar.a.removeView(yVar.y0);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) this.b;
                a0Var.s = null;
                a0Var.r = 1.0f;
                a0Var.b();
                a0Var.e();
                break;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) this.b;
                if (w0Var.getParent() != null) {
                    ((ViewGroup) w0Var.getParent()).removeView(w0Var);
                    break;
                }
                break;
            case 14:
                bc1 bc1Var = (bc1) this.b;
                if (!bc1Var.a) {
                    bc1Var.W.w.T = true;
                    bc1Var.W.w.invalidate();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.voip.l1 l1Var = (org.telegram.ui.Components.voip.l1) this.b;
                l1Var.i = false;
                l1Var.l.setAlpha(35);
                l1Var.k.setAlpha(ks.n1);
                l1Var.j.setAlpha(35);
                l1Var.c();
                break;
            case 16:
                org.telegram.ui.Components.voip.q1 q1Var = ((org.telegram.ui.Components.voip.o1) this.b).c;
                q1Var.P = false;
                q1Var.requestLayout();
                break;
            case 17:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) this.b;
                n2Var.O = 0.0f;
                n2Var.P = 0.0f;
                org.telegram.ui.Components.voip.m2 m2Var = n2Var.d;
                m2Var.setScaleX(n2Var.U);
                m2Var.setScaleY(n2Var.U);
                TextureView textureView = n2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(n2Var.V);
                    textureView.setScaleY(n2Var.V);
                }
                n2Var.setTranslationY(0.0f);
                n2Var.setTranslationX(0.0f);
                n2Var.a0 = n2Var.W;
                n2Var.c0 = null;
                break;
            case 18:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) this.b;
                q2Var.R = q2Var.Q ? 1.0f : 0.0f;
                q2Var.a(q2Var.S, q2Var.T);
                break;
            case 19:
                ((org.telegram.ui.Components.voip.r2) this.b).c.e();
                org.telegram.messenger.g0.O3(((org.telegram.ui.Components.voip.r2) this.b).a);
                if (((org.telegram.ui.Components.voip.r2) this.b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.r2) this.b).a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.r2) this.b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.r2) this.b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.voip.x2 x2Var = (org.telegram.ui.Components.voip.x2) this.b;
                x2Var.K = false;
                x2Var.U.e = false;
                if (x2Var.V && (animatorSet = x2Var.R) != null) {
                    animatorSet.cancel();
                    x2Var.R.start();
                }
                x2Var.c();
                break;
            case 21:
                ((org.telegram.ui.Components.voip.e3) this.b).e.setVisibility(8);
                break;
            case 22:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 23:
                zs zsVar = (zs) this.b;
                if (animator.equals(zsVar.n[0])) {
                    zsVar.n[0] = null;
                    break;
                }
                break;
            case 24:
                cu cuVar = (cu) this.b;
                eu euVar = cuVar.n;
                du[] duVarArr = euVar.f;
                euVar.h = null;
                if (euVar.s) {
                    duVarArr[1].setVisibility(8);
                } else {
                    du duVar = duVarArr[0];
                    duVarArr[0] = duVarArr[1];
                    duVarArr[1] = duVar;
                    duVar.setVisibility(8);
                    euVar.x = euVar.f[0].f == euVar.e.getFirstTabId();
                    euVar.e.i(1.0f, euVar.f[0].f);
                }
                euVar.n = false;
                cuVar.c = false;
                cuVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.g2) euVar).actionBar;
                kVar.setEnabled(true);
                euVar.e.setEnabled(true);
                break;
            case 25:
                gv gvVar = (gv) this.b;
                cx.v1(gvVar.M, gvVar.L, 0.0f);
                break;
            case 26:
                cx cxVar = (cx) this.b;
                boolean z10 = cxVar.H0;
                cxVar.I0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    cxVar.F0.setVisibility(8);
                }
                View view5 = cxVar.fragmentView;
                if (view5 != null) {
                    view5.invalidate();
                    break;
                }
                break;
            case 27:
                cx cxVar2 = ((vw) this.b).o0;
                cxVar2.i3 = null;
                if (!cxVar2.m3) {
                    bx[] bxVarArr = cxVar2.f0;
                    bx bxVar = bxVarArr[0];
                    bx bxVar2 = bxVarArr[1];
                    bxVarArr[0] = bxVar2;
                    bxVarArr[1] = bxVar;
                    cxVar2.A0.h(1.0f, bxVar2.h);
                    cxVar2.n5(false);
                    cxVar2.C5(-1, true);
                    cxVar2.f0[0].d.getClass();
                    cxVar2.f0[1].d.getClass();
                }
                cxVar2.f0[1].setVisibility(8);
                cx.i1(cxVar2, true);
                cxVar2.j3 = false;
                cxVar2.p3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.g2) cxVar2).actionBar;
                kVar2.setEnabled(true);
                cxVar2.A0.setEnabled(true);
                cxVar2.C3(cxVar2.f0[0]);
                break;
            case 28:
                super.onAnimationEnd(animator);
                ((yw) this.b).setScrollEnabled(true);
                break;
            default:
                qx qxVar = (qx) this.b;
                if (qxVar.w == animator) {
                    qxVar.w = null;
                    break;
                }
                break;
        }
    }

    public y9(yp ypVar, v4.p0 p0Var) {
        this.a = 10;
        this.b = ypVar;
    }
}
