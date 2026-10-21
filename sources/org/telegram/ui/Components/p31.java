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
import org.telegram.ui.ah1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class p31 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p31(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
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
                r31 r31Var = (r31) this.b;
                r31Var.K = 1.0f;
                r31Var.h.invalidate();
                break;
            case 1:
                ((d61) this.b).L = null;
                break;
            case 2:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 3:
                i71 i71Var = (i71) this.b;
                if (i71Var.a.getTag() == null) {
                    i71Var.a.setVisibility(4);
                    break;
                }
                break;
            case 4:
                super.onAnimationEnd(animator);
                j71 j71Var = (j71) this.b;
                j71Var.b = 0.0f;
                j71Var.setTranslationY(0.0f);
                j71Var.a = null;
                break;
            case 5:
                d91 d91Var = (d91) this.b;
                d91Var.J = false;
                d91Var.setEnabled(true);
                c91 c91Var = d91Var.y;
                if (c91Var != null) {
                    ((l2.f) c91Var).I(1.0f);
                }
                d91Var.invalidate();
                break;
            case 6:
                ((w91) this.b).e0 = null;
                break;
            case 7:
                ((y91) this.b).K = null;
                break;
            case 8:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.b).view.setEnabled(true);
                break;
            case 9:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.b).s0;
                if (tVar.x0.getParent() != null) {
                    tVar.a.removeView(tVar.x0);
                    break;
                }
                break;
            case 10:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    break;
                }
                break;
            case 11:
                ah1 ah1Var = (ah1) this.b;
                if (!ah1Var.a) {
                    ah1Var.V.v.S = true;
                    ah1Var.V.v.invalidate();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.b;
                o1Var.i = false;
                o1Var.l.setAlpha(35);
                o1Var.k.setAlpha(102);
                o1Var.j.setAlpha(35);
                o1Var.c();
                break;
            case 13:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.b).c;
                s1Var.O = false;
                s1Var.requestLayout();
                break;
            case 14:
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
            case 15:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.b;
                t2Var.Q = t2Var.P ? 1.0f : 0.0f;
                t2Var.a(t2Var.R, t2Var.S);
                break;
            case 16:
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
            case 17:
                org.telegram.ui.Components.voip.a3 a3Var = (org.telegram.ui.Components.voip.a3) this.b;
                a3Var.J = false;
                a3Var.T.e = false;
                if (a3Var.U && (animatorSet = a3Var.Q) != null) {
                    animatorSet.cancel();
                    a3Var.Q.start();
                }
                a3Var.c();
                break;
            case 18:
                ((org.telegram.ui.Components.voip.i3) this.b).e.setVisibility(8);
                break;
            case 19:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.tt ttVar = (org.telegram.ui.tt) this.b;
                if (animator.equals(ttVar.n[0])) {
                    ttVar.n[0] = null;
                    break;
                }
                break;
            case 21:
                org.telegram.ui.yu yuVar = (org.telegram.ui.yu) this.b;
                org.telegram.ui.av avVar = yuVar.n;
                org.telegram.ui.zu[] zuVarArr = avVar.f;
                avVar.h = null;
                if (avVar.s) {
                    zuVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.zu zuVar = zuVarArr[0];
                    zuVarArr[0] = zuVarArr[1];
                    zuVarArr[1] = zuVar;
                    zuVar.setVisibility(8);
                    avVar.w = avVar.f[0].f == avVar.e.getFirstTabId();
                    avVar.e.j(1.0f, avVar.f[0].f);
                }
                avVar.n = false;
                yuVar.c = false;
                yuVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.n2) avVar).actionBar;
                kVar.setEnabled(true);
                avVar.e.setEnabled(true);
                break;
            case 22:
                org.telegram.ui.fw fwVar = (org.telegram.ui.fw) this.b;
                org.telegram.ui.cy.n1(fwVar.M, fwVar.L, 0.0f);
                break;
            case 23:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) this.b;
                boolean z10 = cyVar.G0;
                cyVar.H0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    cyVar.E0.setVisibility(8);
                }
                View view = cyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.cy cyVar2 = ((org.telegram.ui.ux) this.b).E0;
                cyVar2.g3 = null;
                if (!cyVar2.k3) {
                    org.telegram.ui.ay[] ayVarArr = cyVar2.e0;
                    org.telegram.ui.ay ayVar = ayVarArr[0];
                    org.telegram.ui.ay ayVar2 = ayVarArr[1];
                    ayVarArr[0] = ayVar2;
                    ayVarArr[1] = ayVar;
                    cyVar2.z0.g(1.0f, ayVar2.h);
                    cyVar2.R4(false);
                    cyVar2.e0[0].d.getClass();
                    cyVar2.e0[1].d.getClass();
                }
                cyVar2.e0[1].setVisibility(8);
                org.telegram.ui.cy.c1(cyVar2, true);
                cyVar2.h3 = false;
                cyVar2.n3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.n2) cyVar2).actionBar;
                kVar2.setEnabled(true);
                cyVar2.z0.setEnabled(true);
                cyVar2.p3(cyVar2.e0[0]);
                break;
            case 25:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.xx) this.b).setScrollEnabled(true);
                break;
            case 26:
                m90 m90Var = (m90) this.b;
                FrameLayout frameLayout = m90Var.b;
                ei.g6 g6Var = (ei.g6) m90Var.c;
                if (g6Var.getParent() != null) {
                    frameLayout.removeView(g6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.vh) m90Var.d);
                break;
            case 27:
                org.telegram.ui.q50 q50Var = ((org.telegram.ui.q40) this.b).o;
                org.telegram.ui.q50 q50Var2 = org.telegram.ui.q50.D3;
                q50Var.c1();
                viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
                viewGroup.invalidate();
                q50Var.Q.invalidate();
                if (q50Var.s0) {
                    q50Var.s0 = false;
                    q50Var.P0(true);
                    break;
                }
                break;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.e50 e50Var = (org.telegram.ui.e50) this.b;
                e50Var.G = null;
                org.telegram.ui.q50 q50Var3 = e50Var.L;
                q50Var3.Q.invalidate();
                q50Var3.a2.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) q50Var3).containerView;
                viewGroup2.invalidate();
                org.telegram.ui.q50.K0(q50Var3);
                e50Var.H.clear();
                e50Var.I.clear();
                break;
            default:
                org.telegram.ui.q70 q70Var = (org.telegram.ui.q70) this.b;
                q70Var.d = null;
                q70Var.a = null;
                q70Var.b = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 8:
                super.onAnimationStart(animator);
                ((TransitionValues) this.b).view.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
