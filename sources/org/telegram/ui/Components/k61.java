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
import org.telegram.ui.ni1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class k61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k61(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 28:
                ((org.telegram.ui.hf0) this.b).s = null;
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
                l61 l61Var = (l61) this.b;
                if (l61Var.a.getTag() == null) {
                    l61Var.a.setVisibility(4);
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                m61 m61Var = (m61) this.b;
                m61Var.b = 0.0f;
                m61Var.setTranslationY(0.0f);
                m61Var.a = null;
                break;
            case 2:
                h81 h81Var = (h81) this.b;
                h81Var.J = false;
                h81Var.setEnabled(true);
                g81 g81Var = h81Var.y;
                if (g81Var != null) {
                    ((k2.g0) g81Var).A(1.0f);
                }
                h81Var.invalidate();
                break;
            case 3:
                ((b91) this.b).e0 = null;
                break;
            case 4:
                ((d91) this.b).K = null;
                break;
            case 5:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.b).view.setEnabled(true);
                break;
            case 6:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.b).s0;
                if (tVar.x0.getParent() != null) {
                    tVar.a.removeView(tVar.x0);
                    break;
                }
                break;
            case 7:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    break;
                }
                break;
            case 8:
                ni1 ni1Var = (ni1) this.b;
                if (!ni1Var.a) {
                    ni1Var.V.v.S = true;
                    ni1Var.V.v.invalidate();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.b;
                o1Var.i = false;
                o1Var.l.setAlpha(35);
                o1Var.k.setAlpha(102);
                o1Var.j.setAlpha(35);
                o1Var.c();
                break;
            case 10:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.b).c;
                s1Var.O = false;
                s1Var.requestLayout();
                break;
            case 11:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) this.b;
                q2Var.N = 0.0f;
                q2Var.O = 0.0f;
                org.telegram.ui.Components.voip.p2 p2Var = q2Var.d;
                p2Var.setScaleX(q2Var.T);
                p2Var.setScaleY(q2Var.T);
                TextureView textureView = q2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(q2Var.U);
                    textureView.setScaleY(q2Var.U);
                }
                q2Var.setTranslationY(0.0f);
                q2Var.setTranslationX(0.0f);
                q2Var.W = q2Var.V;
                q2Var.b0 = null;
                break;
            case 12:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.b;
                t2Var.Q = t2Var.P ? 1.0f : 0.0f;
                t2Var.a(t2Var.R, t2Var.S);
                break;
            case 13:
                ((org.telegram.ui.Components.voip.u2) this.b).c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.u2) this.b).a);
                if (((org.telegram.ui.Components.voip.u2) this.b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.u2) this.b).a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.u2) this.b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.u2) this.b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.voip.a3 a3Var = (org.telegram.ui.Components.voip.a3) this.b;
                a3Var.J = false;
                a3Var.T.e = false;
                if (a3Var.U && (animatorSet = a3Var.Q) != null) {
                    animatorSet.cancel();
                    a3Var.Q.start();
                }
                a3Var.c();
                break;
            case 15:
                ((org.telegram.ui.Components.voip.i3) this.b).e.setVisibility(8);
                break;
            case 16:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 17:
                org.telegram.ui.hu huVar = (org.telegram.ui.hu) this.b;
                if (animator.equals(huVar.n[0])) {
                    huVar.n[0] = null;
                    break;
                }
                break;
            case 18:
                org.telegram.ui.mv mvVar = (org.telegram.ui.mv) this.b;
                org.telegram.ui.ov ovVar = mvVar.n;
                org.telegram.ui.nv[] nvVarArr = ovVar.f;
                ovVar.h = null;
                if (ovVar.s) {
                    nvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.nv nvVar = nvVarArr[0];
                    nvVarArr[0] = nvVarArr[1];
                    nvVarArr[1] = nvVar;
                    nvVar.setVisibility(8);
                    ovVar.w = ovVar.f[0].f == ovVar.e.getFirstTabId();
                    ovVar.e.j(1.0f, ovVar.f[0].f);
                }
                ovVar.n = false;
                mvVar.c = false;
                mvVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
                kVar.setEnabled(true);
                ovVar.e.setEnabled(true);
                break;
            case 19:
                org.telegram.ui.xw xwVar = (org.telegram.ui.xw) this.b;
                org.telegram.ui.uy.q1(xwVar.M, xwVar.L, 0.0f);
                break;
            case 20:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.b;
                boolean z10 = uyVar.G0;
                uyVar.H0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    uyVar.E0.setVisibility(8);
                }
                View view = uyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.uy uyVar2 = ((org.telegram.ui.ny) this.b).E0;
                uyVar2.f3 = null;
                if (!uyVar2.j3) {
                    org.telegram.ui.ty[] tyVarArr = uyVar2.e0;
                    org.telegram.ui.ty tyVar = tyVarArr[0];
                    org.telegram.ui.ty tyVar2 = tyVarArr[1];
                    tyVarArr[0] = tyVar2;
                    tyVarArr[1] = tyVar;
                    uyVar2.z0.g(1.0f, tyVar2.h);
                    uyVar2.T4(false);
                    uyVar2.e0[0].d.getClass();
                    uyVar2.e0[1].d.getClass();
                }
                uyVar2.e0[1].setVisibility(8);
                org.telegram.ui.uy.f1(uyVar2, true);
                uyVar2.g3 = false;
                uyVar2.m3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar2).actionBar;
                kVar2.setEnabled(true);
                uyVar2.z0.setEnabled(true);
                uyVar2.r3(uyVar2.e0[0]);
                break;
            case 22:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.qy) this.b).setScrollEnabled(true);
                break;
            case 23:
                s80 s80Var = (s80) this.b;
                FrameLayout frameLayout = s80Var.b;
                di.r6 r6Var = (di.r6) s80Var.c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ei) s80Var.d);
                break;
            case 24:
                org.telegram.ui.j60 j60Var = ((org.telegram.ui.j50) this.b).o;
                org.telegram.ui.j60 j60Var2 = org.telegram.ui.j60.D3;
                j60Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.f3) j60Var).containerView;
                viewGroup.invalidate();
                j60Var.Q.invalidate();
                if (j60Var.s0) {
                    j60Var.s0 = false;
                    j60Var.O0(true);
                    break;
                }
                break;
            case 25:
                super.onAnimationEnd(animator);
                org.telegram.ui.x50 x50Var = (org.telegram.ui.x50) this.b;
                x50Var.G = null;
                org.telegram.ui.j60 j60Var3 = x50Var.L;
                j60Var3.Q.invalidate();
                j60Var3.a2.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) j60Var3).containerView;
                viewGroup2.invalidate();
                org.telegram.ui.j60.J0(j60Var3);
                x50Var.H.clear();
                x50Var.I.clear();
                break;
            case 26:
                org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) this.b;
                k80Var.d = null;
                k80Var.a = null;
                k80Var.b = false;
                break;
            case 27:
                org.telegram.ui.id0 id0Var = (org.telegram.ui.id0) this.b;
                id0Var.H = false;
                id0Var.o0();
                break;
            case 28:
                org.telegram.ui.hf0 hf0Var = (org.telegram.ui.hf0) this.b;
                if (hf0Var.s != null && hf0Var.n != null) {
                    hf0Var.r.setVisibility(4);
                    hf0Var.s = null;
                    break;
                }
                break;
            default:
                ((org.telegram.ui.lj0) this.b).T.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 5:
                super.onAnimationStart(animator);
                ((TransitionValues) this.b).view.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
