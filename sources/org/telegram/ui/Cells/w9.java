package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.p40;
import org.telegram.ui.ac;
import org.telegram.ui.dl;
import org.telegram.ui.fh;
import org.telegram.ui.fl;
import org.telegram.ui.jx;
import org.telegram.ui.kb;
import org.telegram.ui.mj;
import org.telegram.ui.mw;
import org.telegram.ui.nq;
import org.telegram.ui.pc;
import org.telegram.ui.pw;
import org.telegram.ui.rb;
import org.telegram.ui.sb1;
import org.telegram.ui.to;
import org.telegram.ui.tp;
import org.telegram.ui.ts;
import org.telegram.ui.tw;
import org.telegram.ui.uw;
import org.telegram.ui.wt;
import org.telegram.ui.xg;
import org.telegram.ui.xt;
import org.telegram.ui.yt;
import org.telegram.ui.zu;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w9(Object obj, int i3) {
        this.a = i3;
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
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.b;
                ((y9) ((x9) g1Var.b).b).getTransitionParams().e();
                ((y9) ((x9) g1Var.b).b).getTransitionParams().h = false;
                ((y9) ((x9) g1Var.b).b).getTransitionParams().L1 = 1.0f;
                break;
            case 1:
                org.telegram.ui.h3 h3Var = (org.telegram.ui.h3) this.b;
                if (animator.equals(((kb) h3Var.b).S)) {
                    ((kb) h3Var.b).S = null;
                    break;
                }
                break;
            case 2:
                kb kbVar = (kb) this.b;
                if (animator.equals(kbVar.S)) {
                    kbVar.S = null;
                    break;
                }
                break;
            case 3:
                ((rb) this.b).I.setVisibility(8);
                break;
            case 4:
                pc pcVar = (pc) this.b;
                ac acVar = pcVar.n0;
                if (acVar != null) {
                    if (acVar.getParent() != null) {
                        ((ViewGroup) pcVar.n0.getParent()).removeView(pcVar.n0);
                    }
                    pcVar.n0 = null;
                }
                pcVar.p0 = null;
                super.onAnimationEnd(animator);
                break;
            case 5:
                fh fhVar = (fh) this.b;
                if (fhVar.a) {
                    fhVar.d.setTranslationY(0.0f);
                }
                if (fhVar.b) {
                    fhVar.e.setTranslationY(0.0f);
                }
                if (fhVar.f) {
                    fhVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.k9 k9Var = fhVar.c;
                if (k9Var != null) {
                    k9Var.setTranslationY(0.0f);
                }
                fhVar.n.W2[1] = null;
                break;
            case 6:
                mj mjVar = (mj) this.b;
                mjVar.setAnimatedTop(0);
                View view = mjVar.H1;
                if (view != null && view.getVisibility() == 0) {
                    mjVar.H1.setTranslationY(((1.0f - mjVar.getTopViewEnterProgress()) * mjVar.H1.getLayoutParams().height) + mjVar.U1);
                }
                mjVar.x5.J9 = null;
                break;
            case 7:
                bh.j jVar = (bh.j) this.b;
                p40 p40Var = ((dl) jVar.c).c.R.q3;
                if (p40Var != null) {
                    p40Var.setIsMessageTransition(false);
                    ((dl) jVar.c).c.R.q3.c(true);
                    ((dl) jVar.c).c.R.q3.setVisibility(4);
                    break;
                }
                break;
            case 8:
                dl dlVar = (dl) this.b;
                fl flVar = dlVar.c;
                ArrayList arrayList = flVar.R.E6;
                q1 q1Var = dlVar.b;
                arrayList.remove(q1Var);
                View view2 = flVar.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    flVar.R.A0.invalidate();
                }
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().y0 = false;
                break;
            case 9:
                to toVar = (to) this.b;
                toVar.M = 0.0f;
                toVar.L = 1.0f;
                View view3 = toVar.b0;
                if (view3 != null) {
                    view3.invalidate();
                }
                toVar.U.invalidate();
                xg xgVar = toVar.Z;
                if (xgVar != null) {
                    xgVar.run();
                    toVar.Z = null;
                    break;
                }
                break;
            case 10:
                tp tpVar = (tp) this.b;
                View view4 = tpVar.b;
                view4.setAlpha(1.0f);
                u4.o0.x0(view4);
                ((nq) tpVar.d).c.removeView(view4);
                break;
            case 11:
                org.telegram.ui.Components.voip.r rVar = ((org.telegram.ui.Components.voip.n) this.b).t0;
                if (rVar.y0.getParent() != null) {
                    rVar.a.removeView(rVar.y0);
                    break;
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.f0 f0Var = (org.telegram.ui.Components.voip.f0) this.b;
                if (f0Var.getParent() != null) {
                    ((ViewGroup) f0Var.getParent()).removeView(f0Var);
                    break;
                }
                break;
            case 13:
                sb1 sb1Var = (sb1) this.b;
                if (!sb1Var.a) {
                    sb1Var.W.w.T = true;
                    sb1Var.W.w.invalidate();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.b;
                x0Var.i = false;
                x0Var.l.setAlpha(35);
                x0Var.k.setAlpha(hs.n1);
                x0Var.j.setAlpha(35);
                x0Var.c();
                break;
            case 15:
                org.telegram.ui.Components.voip.c1 c1Var = ((org.telegram.ui.Components.voip.a1) this.b).c;
                c1Var.P = false;
                c1Var.requestLayout();
                break;
            case 16:
                org.telegram.ui.Components.voip.z1 z1Var = (org.telegram.ui.Components.voip.z1) this.b;
                z1Var.O = 0.0f;
                z1Var.P = 0.0f;
                org.telegram.ui.Components.voip.y1 y1Var = z1Var.d;
                y1Var.setScaleX(z1Var.U);
                y1Var.setScaleY(z1Var.U);
                TextureView textureView = z1Var.e;
                if (textureView != null) {
                    textureView.setScaleX(z1Var.V);
                    textureView.setScaleY(z1Var.V);
                }
                z1Var.setTranslationY(0.0f);
                z1Var.setTranslationX(0.0f);
                z1Var.a0 = z1Var.W;
                z1Var.c0 = null;
                break;
            case 17:
                org.telegram.ui.Components.voip.c2 c2Var = (org.telegram.ui.Components.voip.c2) this.b;
                c2Var.R = c2Var.Q ? 1.0f : 0.0f;
                c2Var.a(c2Var.S, c2Var.T);
                break;
            case 18:
                ((org.telegram.ui.Components.voip.d2) this.b).c.e();
                org.telegram.messenger.g0.Q3(((org.telegram.ui.Components.voip.d2) this.b).a);
                if (((org.telegram.ui.Components.voip.d2) this.b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.d2) this.b).a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.d2) this.b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.d2) this.b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.voip.j2 j2Var = (org.telegram.ui.Components.voip.j2) this.b;
                j2Var.K = false;
                j2Var.U.e = false;
                if (j2Var.V && (animatorSet = j2Var.R) != null) {
                    animatorSet.cancel();
                    j2Var.R.start();
                }
                j2Var.c();
                break;
            case 20:
                ((org.telegram.ui.Components.voip.q2) this.b).e.setVisibility(8);
                break;
            case 21:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 22:
                ts tsVar = (ts) this.b;
                if (animator.equals(tsVar.n[0])) {
                    tsVar.n[0] = null;
                    break;
                }
                break;
            case 23:
                wt wtVar = (wt) this.b;
                yt ytVar = wtVar.n;
                xt[] xtVarArr = ytVar.f;
                ytVar.h = null;
                if (ytVar.s) {
                    xtVarArr[1].setVisibility(8);
                } else {
                    xt xtVar = xtVarArr[0];
                    xtVarArr[0] = xtVarArr[1];
                    xtVarArr[1] = xtVar;
                    xtVar.setVisibility(8);
                    ytVar.x = ytVar.f[0].f == ytVar.e.getFirstTabId();
                    ytVar.e.i(1.0f, ytVar.f[0].f);
                }
                ytVar.n = false;
                wtVar.c = false;
                wtVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
                kVar.setEnabled(true);
                ytVar.e.setEnabled(true);
                break;
            case 24:
                zu zuVar = (zu) this.b;
                uw.u1(zuVar.M, zuVar.L, 0.0f);
                break;
            case 25:
                uw uwVar = (uw) this.b;
                boolean z10 = uwVar.H0;
                uwVar.I0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    uwVar.F0.setVisibility(8);
                }
                View view5 = uwVar.fragmentView;
                if (view5 != null) {
                    view5.invalidate();
                    break;
                }
                break;
            case 26:
                uw uwVar2 = ((mw) this.b).o0;
                uwVar2.h3 = null;
                if (!uwVar2.l3) {
                    tw[] twVarArr = uwVar2.f0;
                    tw twVar = twVarArr[0];
                    tw twVar2 = twVarArr[1];
                    twVarArr[0] = twVar2;
                    twVarArr[1] = twVar;
                    uwVar2.A0.g(1.0f, twVar2.h);
                    uwVar2.f5(false);
                    uwVar2.f0[0].d.getClass();
                    uwVar2.f0[1].d.getClass();
                }
                uwVar2.f0[1].setVisibility(8);
                uw.j1(uwVar2, true);
                uwVar2.i3 = false;
                uwVar2.o3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.d2) uwVar2).actionBar;
                kVar2.setEnabled(true);
                uwVar2.A0.setEnabled(true);
                uwVar2.C3(uwVar2.f0[0]);
                break;
            case 27:
                super.onAnimationEnd(animator);
                ((pw) this.b).setScrollEnabled(true);
                break;
            case 28:
                jx jxVar = (jx) this.b;
                if (jxVar.w == animator) {
                    jxVar.w = null;
                    break;
                }
                break;
            default:
                i70 i70Var = (i70) this.b;
                FrameLayout frameLayout = i70Var.b;
                gi.n5 n5Var = (gi.n5) i70Var.c;
                if (n5Var.getParent() != null) {
                    frameLayout.removeView(n5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.f7) i70Var.d);
                break;
        }
    }

    public w9(tp tpVar, u4.o0 o0Var) {
        this.a = 10;
        this.b = tpVar;
    }
}
