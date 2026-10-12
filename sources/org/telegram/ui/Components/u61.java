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
import org.telegram.ui.wi1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class u61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u61(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 29:
                ((org.telegram.ui.mf0) this.b).s = null;
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
        switch (this.a) {
            case 0:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 1:
                n71 n71Var = (n71) this.b;
                if (n71Var.a.getTag() == null) {
                    n71Var.a.setVisibility(4);
                    break;
                }
                break;
            case 2:
                super.onAnimationEnd(animator);
                o71 o71Var = (o71) this.b;
                o71Var.b = 0.0f;
                o71Var.setTranslationY(0.0f);
                o71Var.a = null;
                break;
            case 3:
                j91 j91Var = (j91) this.b;
                j91Var.J = false;
                j91Var.setEnabled(true);
                i91 i91Var = j91Var.y;
                if (i91Var != null) {
                    ((l2.f) i91Var).j(1.0f);
                }
                j91Var.invalidate();
                break;
            case 4:
                ((ca1) this.b).e0 = null;
                break;
            case 5:
                ((ea1) this.b).K = null;
                break;
            case 6:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.b).view.setEnabled(true);
                break;
            case 7:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.b).s0;
                if (tVar.x0.getParent() != null) {
                    tVar.a.removeView(tVar.x0);
                    break;
                }
                break;
            case 8:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    break;
                }
                break;
            case 9:
                wi1 wi1Var = (wi1) this.b;
                if (!wi1Var.a) {
                    wi1Var.V.v.S = true;
                    wi1Var.V.v.invalidate();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.b;
                o1Var.i = false;
                o1Var.l.setAlpha(35);
                o1Var.k.setAlpha(102);
                o1Var.j.setAlpha(35);
                o1Var.c();
                break;
            case 11:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.b).c;
                s1Var.O = false;
                s1Var.requestLayout();
                break;
            case 12:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) this.b;
                r2Var.N = 0.0f;
                r2Var.O = 0.0f;
                org.telegram.ui.Components.voip.q2 q2Var = r2Var.d;
                q2Var.setScaleX(r2Var.T);
                q2Var.setScaleY(r2Var.T);
                TextureView textureView = r2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(r2Var.U);
                    textureView.setScaleY(r2Var.U);
                }
                r2Var.setTranslationY(0.0f);
                r2Var.setTranslationX(0.0f);
                r2Var.W = r2Var.V;
                r2Var.b0 = null;
                break;
            case 13:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.b;
                u2Var.Q = u2Var.P ? 1.0f : 0.0f;
                u2Var.a(u2Var.R, u2Var.S);
                break;
            case 14:
                ((org.telegram.ui.Components.voip.v2) this.b).c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.v2) this.b).a);
                if (((org.telegram.ui.Components.voip.v2) this.b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.v2) this.b).a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.v2) this.b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.v2) this.b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.voip.b3 b3Var = (org.telegram.ui.Components.voip.b3) this.b;
                b3Var.J = false;
                b3Var.T.e = false;
                if (b3Var.U && (animatorSet = b3Var.Q) != null) {
                    animatorSet.cancel();
                    b3Var.Q.start();
                }
                b3Var.c();
                break;
            case 16:
                ((org.telegram.ui.Components.voip.j3) this.b).e.setVisibility(8);
                break;
            case 17:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 18:
                org.telegram.ui.lu luVar = (org.telegram.ui.lu) this.b;
                if (animator.equals(luVar.n[0])) {
                    luVar.n[0] = null;
                    break;
                }
                break;
            case 19:
                org.telegram.ui.qv qvVar = (org.telegram.ui.qv) this.b;
                org.telegram.ui.sv svVar = qvVar.n;
                org.telegram.ui.rv[] rvVarArr = svVar.f;
                svVar.h = null;
                if (svVar.s) {
                    rvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.rv rvVar = rvVarArr[0];
                    rvVarArr[0] = rvVarArr[1];
                    rvVarArr[1] = rvVar;
                    rvVar.setVisibility(8);
                    svVar.w = svVar.f[0].f == svVar.e.getFirstTabId();
                    svVar.e.j(1.0f, svVar.f[0].f);
                }
                svVar.n = false;
                qvVar.c = false;
                qvVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.m2) svVar).actionBar;
                kVar.setEnabled(true);
                svVar.e.setEnabled(true);
                break;
            case 20:
                org.telegram.ui.bx bxVar = (org.telegram.ui.bx) this.b;
                org.telegram.ui.yy.n1(bxVar.M, bxVar.L, 0.0f);
                break;
            case 21:
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) this.b;
                boolean z10 = yyVar.G0;
                yyVar.H0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    yyVar.E0.setVisibility(8);
                }
                View view = yyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 22:
                org.telegram.ui.yy yyVar2 = ((org.telegram.ui.ry) this.b).E0;
                yyVar2.f3 = null;
                if (!yyVar2.j3) {
                    org.telegram.ui.xy[] xyVarArr = yyVar2.e0;
                    org.telegram.ui.xy xyVar = xyVarArr[0];
                    org.telegram.ui.xy xyVar2 = xyVarArr[1];
                    xyVarArr[0] = xyVar2;
                    xyVarArr[1] = xyVar;
                    yyVar2.z0.g(1.0f, xyVar2.h);
                    yyVar2.Q4(false);
                    yyVar2.e0[0].d.getClass();
                    yyVar2.e0[1].d.getClass();
                }
                yyVar2.e0[1].setVisibility(8);
                org.telegram.ui.yy.c1(yyVar2, true);
                yyVar2.g3 = false;
                yyVar2.m3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.m2) yyVar2).actionBar;
                kVar2.setEnabled(true);
                yyVar2.z0.setEnabled(true);
                yyVar2.o3(yyVar2.e0[0]);
                break;
            case 23:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.uy) this.b).setScrollEnabled(true);
                break;
            case 24:
                s90 s90Var = (s90) this.b;
                FrameLayout frameLayout = s90Var.b;
                di.p6 p6Var = (di.p6) s90Var.c;
                if (p6Var.getParent() != null) {
                    frameLayout.removeView(p6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ii) s90Var.d);
                break;
            case 25:
                org.telegram.ui.n60 n60Var = ((org.telegram.ui.n50) this.b).o;
                org.telegram.ui.n60 n60Var2 = org.telegram.ui.n60.D3;
                n60Var.c1();
                viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
                viewGroup.invalidate();
                n60Var.Q.invalidate();
                if (n60Var.s0) {
                    n60Var.s0 = false;
                    n60Var.P0(true);
                    break;
                }
                break;
            case 26:
                super.onAnimationEnd(animator);
                org.telegram.ui.b60 b60Var = (org.telegram.ui.b60) this.b;
                b60Var.G = null;
                org.telegram.ui.n60 n60Var3 = b60Var.L;
                n60Var3.Q.invalidate();
                n60Var3.a2.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) n60Var3).containerView;
                viewGroup2.invalidate();
                org.telegram.ui.n60.K0(n60Var3);
                b60Var.H.clear();
                b60Var.I.clear();
                break;
            case 27:
                org.telegram.ui.o80 o80Var = (org.telegram.ui.o80) this.b;
                o80Var.d = null;
                o80Var.a = null;
                o80Var.b = false;
                break;
            case 28:
                org.telegram.ui.nd0 nd0Var = (org.telegram.ui.nd0) this.b;
                nd0Var.H = false;
                nd0Var.n0();
                break;
            default:
                org.telegram.ui.mf0 mf0Var = (org.telegram.ui.mf0) this.b;
                if (mf0Var.s != null && mf0Var.n != null) {
                    mf0Var.r.setVisibility(4);
                    mf0Var.s = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 6:
                super.onAnimationStart(animator);
                ((TransitionValues) this.b).view.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
