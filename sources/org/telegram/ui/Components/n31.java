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
import org.telegram.ui.ch1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class n31 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n31(Object obj, int i10) {
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
                p31 p31Var = (p31) this.b;
                p31Var.K = 1.0f;
                p31Var.h.invalidate();
                break;
            case 1:
                ((b61) this.b).L = null;
                break;
            case 2:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 3:
                g71 g71Var = (g71) this.b;
                if (g71Var.a.getTag() == null) {
                    g71Var.a.setVisibility(4);
                    break;
                }
                break;
            case 4:
                super.onAnimationEnd(animator);
                h71 h71Var = (h71) this.b;
                h71Var.b = 0.0f;
                h71Var.setTranslationY(0.0f);
                h71Var.a = null;
                break;
            case 5:
                b91 b91Var = (b91) this.b;
                b91Var.J = false;
                b91Var.setEnabled(true);
                a91 a91Var = b91Var.y;
                if (a91Var != null) {
                    ((l2.f) a91Var).z(1.0f);
                }
                b91Var.invalidate();
                break;
            case 6:
                ((u91) this.b).e0 = null;
                break;
            case 7:
                ((w91) this.b).K = null;
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
                ch1 ch1Var = (ch1) this.b;
                if (!ch1Var.a) {
                    ch1Var.V.v.S = true;
                    ch1Var.V.v.invalidate();
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
                org.telegram.ui.vt vtVar = (org.telegram.ui.vt) this.b;
                if (animator.equals(vtVar.n[0])) {
                    vtVar.n[0] = null;
                    break;
                }
                break;
            case 21:
                org.telegram.ui.av avVar = (org.telegram.ui.av) this.b;
                org.telegram.ui.cv cvVar = avVar.n;
                org.telegram.ui.bv[] bvVarArr = cvVar.f;
                cvVar.h = null;
                if (cvVar.s) {
                    bvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.bv bvVar = bvVarArr[0];
                    bvVarArr[0] = bvVarArr[1];
                    bvVarArr[1] = bvVar;
                    bvVar.setVisibility(8);
                    cvVar.w = cvVar.f[0].f == cvVar.e.getFirstTabId();
                    cvVar.e.j(1.0f, cvVar.f[0].f);
                }
                cvVar.n = false;
                avVar.c = false;
                avVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.n2) cvVar).actionBar;
                kVar.setEnabled(true);
                cvVar.e.setEnabled(true);
                break;
            case 22:
                org.telegram.ui.hw hwVar = (org.telegram.ui.hw) this.b;
                org.telegram.ui.ey.n1(hwVar.M, hwVar.L, 0.0f);
                break;
            case 23:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.b;
                boolean z10 = eyVar.G0;
                eyVar.H0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    eyVar.E0.setVisibility(8);
                }
                View view = eyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.ey eyVar2 = ((org.telegram.ui.wx) this.b).E0;
                eyVar2.g3 = null;
                if (!eyVar2.k3) {
                    org.telegram.ui.dy[] dyVarArr = eyVar2.e0;
                    org.telegram.ui.dy dyVar = dyVarArr[0];
                    org.telegram.ui.dy dyVar2 = dyVarArr[1];
                    dyVarArr[0] = dyVar2;
                    dyVarArr[1] = dyVar;
                    eyVar2.z0.g(1.0f, dyVar2.h);
                    eyVar2.R4(false);
                    eyVar2.e0[0].d.getClass();
                    eyVar2.e0[1].d.getClass();
                }
                eyVar2.e0[1].setVisibility(8);
                org.telegram.ui.ey.c1(eyVar2, true);
                eyVar2.h3 = false;
                eyVar2.n3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.n2) eyVar2).actionBar;
                kVar2.setEnabled(true);
                eyVar2.z0.setEnabled(true);
                eyVar2.p3(eyVar2.e0[0]);
                break;
            case 25:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.zx) this.b).setScrollEnabled(true);
                break;
            case 26:
                m90 m90Var = (m90) this.b;
                FrameLayout frameLayout = m90Var.b;
                ei.g6 g6Var = (ei.g6) m90Var.c;
                if (g6Var.getParent() != null) {
                    frameLayout.removeView(g6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.xh) m90Var.d);
                break;
            case 27:
                org.telegram.ui.s50 s50Var = ((org.telegram.ui.s40) this.b).o;
                org.telegram.ui.s50 s50Var2 = org.telegram.ui.s50.D3;
                s50Var.c1();
                viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
                viewGroup.invalidate();
                s50Var.Q.invalidate();
                if (s50Var.s0) {
                    s50Var.s0 = false;
                    s50Var.P0(true);
                    break;
                }
                break;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.g50 g50Var = (org.telegram.ui.g50) this.b;
                g50Var.G = null;
                org.telegram.ui.s50 s50Var3 = g50Var.L;
                s50Var3.Q.invalidate();
                s50Var3.a2.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) s50Var3).containerView;
                viewGroup2.invalidate();
                org.telegram.ui.s50.K0(s50Var3);
                g50Var.H.clear();
                g50Var.I.clear();
                break;
            default:
                org.telegram.ui.s70 s70Var = (org.telegram.ui.s70) this.b;
                s70Var.d = null;
                s70Var.a = null;
                s70Var.b = false;
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
