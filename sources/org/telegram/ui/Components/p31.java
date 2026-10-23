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
import org.telegram.ui.hh1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                ci.h3 h3Var = ((r31) this.b).f;
                h3Var.setScaleX(1.0f);
                h3Var.setScaleY(1.0f);
                h3Var.invalidate();
                break;
            case 1:
                v31 v31Var = (v31) this.b;
                v31Var.L = 1.0f;
                v31Var.h.invalidate();
                break;
            case 2:
                ((i61) this.b).L = null;
                break;
            case 3:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 4:
                p71 p71Var = (p71) this.b;
                if (p71Var.a.getTag() == null) {
                    p71Var.a.setVisibility(4);
                    break;
                }
                break;
            case 5:
                super.onAnimationEnd(animator);
                q71 q71Var = (q71) this.b;
                q71Var.b = 0.0f;
                q71Var.setTranslationY(0.0f);
                q71Var.a = null;
                break;
            case 6:
                k91 k91Var = (k91) this.b;
                k91Var.J = false;
                k91Var.setEnabled(true);
                j91 j91Var = k91Var.y;
                if (j91Var != null) {
                    ((l2.f) j91Var).I(1.0f);
                }
                k91Var.invalidate();
                break;
            case 7:
                ((da1) this.b).e0 = null;
                break;
            case 8:
                ((fa1) this.b).K = null;
                break;
            case 9:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.b).view.setEnabled(true);
                break;
            case 10:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.b).s0;
                if (tVar.x0.getParent() != null) {
                    tVar.a.removeView(tVar.x0);
                    break;
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    break;
                }
                break;
            case 12:
                hh1 hh1Var = (hh1) this.b;
                if (!hh1Var.a) {
                    hh1Var.V.v.S = true;
                    hh1Var.V.v.invalidate();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.b;
                o1Var.i = false;
                o1Var.l.setAlpha(35);
                o1Var.k.setAlpha(102);
                o1Var.j.setAlpha(35);
                o1Var.c();
                break;
            case 14:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.b).c;
                s1Var.O = false;
                s1Var.requestLayout();
                break;
            case 15:
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
            case 16:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.b;
                t2Var.Q = t2Var.P ? 1.0f : 0.0f;
                t2Var.a(t2Var.R, t2Var.S);
                break;
            case 17:
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
            case 18:
                org.telegram.ui.Components.voip.a3 a3Var = (org.telegram.ui.Components.voip.a3) this.b;
                a3Var.J = false;
                a3Var.T.e = false;
                if (a3Var.U && (animatorSet = a3Var.Q) != null) {
                    animatorSet.cancel();
                    a3Var.Q.start();
                }
                a3Var.c();
                break;
            case 19:
                ((org.telegram.ui.Components.voip.i3) this.b).e.setVisibility(8);
                break;
            case 20:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 21:
                org.telegram.ui.wt wtVar = (org.telegram.ui.wt) this.b;
                if (animator.equals(wtVar.n[0])) {
                    wtVar.n[0] = null;
                    break;
                }
                break;
            case 22:
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
                    cvVar.e.i(1.0f, cvVar.f[0].f);
                }
                cvVar.n = false;
                avVar.c = false;
                avVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
                kVar.setEnabled(true);
                cvVar.e.setEnabled(true);
                break;
            case 23:
                org.telegram.ui.hw hwVar = (org.telegram.ui.hw) this.b;
                org.telegram.ui.ey.m1(hwVar.M, hwVar.L, 0.0f);
                break;
            case 24:
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
            case 25:
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
                org.telegram.ui.ey.b1(eyVar2, true);
                eyVar2.h3 = false;
                eyVar2.n3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.o2) eyVar2).actionBar;
                kVar2.setEnabled(true);
                eyVar2.z0.setEnabled(true);
                eyVar2.p3(eyVar2.e0[0]);
                break;
            case 26:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.zx) this.b).setScrollEnabled(true);
                break;
            case 27:
                n90 n90Var = (n90) this.b;
                FrameLayout frameLayout = n90Var.b;
                ei.g6 g6Var = (ei.g6) n90Var.c;
                if (g6Var.getParent() != null) {
                    frameLayout.removeView(g6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.vh) n90Var.d);
                break;
            case 28:
                org.telegram.ui.u50 u50Var = ((org.telegram.ui.t40) this.b).o;
                org.telegram.ui.u50 u50Var2 = org.telegram.ui.u50.D3;
                u50Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
                viewGroup.invalidate();
                u50Var.Q.invalidate();
                if (u50Var.s0) {
                    u50Var.s0 = false;
                    u50Var.O0(true);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                org.telegram.ui.i50 i50Var = (org.telegram.ui.i50) this.b;
                i50Var.G = null;
                org.telegram.ui.u50 u50Var3 = i50Var.L;
                u50Var3.Q.invalidate();
                u50Var3.a2.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) u50Var3).containerView;
                viewGroup2.invalidate();
                org.telegram.ui.u50.J0(u50Var3);
                i50Var.H.clear();
                i50Var.I.clear();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 9:
                super.onAnimationStart(animator);
                ((TransitionValues) this.b).view.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
