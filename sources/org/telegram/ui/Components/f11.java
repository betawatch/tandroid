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
import org.telegram.ui.eh1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f11 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ((g11) this.b).setVisibility(8);
                break;
            case 1:
                jh.a3 a3Var = ((y11) this.b).f;
                a3Var.setScaleX(1.0f);
                a3Var.setScaleY(1.0f);
                a3Var.invalidate();
                break;
            case 2:
                c21 c21Var = (c21) this.b;
                c21Var.G = 1.0f;
                c21Var.h.invalidate();
                break;
            case 3:
                ((j41) this.b).H = null;
                break;
            case 4:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 5:
                r51 r51Var = (r51) this.b;
                if (r51Var.a.getTag() == null) {
                    r51Var.a.setVisibility(4);
                    break;
                }
                break;
            case 6:
                super.onAnimationEnd(animator);
                s51 s51Var = (s51) this.b;
                s51Var.b = 0.0f;
                s51Var.setTranslationY(0.0f);
                s51Var.a = null;
                break;
            case 7:
                o71 o71Var = (o71) this.b;
                o71Var.F = false;
                o71Var.setEnabled(true);
                n71 n71Var = o71Var.y;
                if (n71Var != null) {
                    ((m5.o) n71Var).x(1.0f);
                }
                o71Var.invalidate();
                break;
            case 8:
                ((i81) this.b).a0 = null;
                break;
            case 9:
                ((k81) this.b).G = null;
                break;
            case 10:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.b).view.setEnabled(true);
                break;
            case 11:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.b).o0;
                if (tVar.t0.getParent() != null) {
                    tVar.a.removeView(tVar.t0);
                    break;
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.b;
                if (u0Var.getParent() != null) {
                    ((ViewGroup) u0Var.getParent()).removeView(u0Var);
                    break;
                }
                break;
            case 13:
                eh1 eh1Var = (eh1) this.b;
                if (!eh1Var.a) {
                    eh1Var.R.v.O = true;
                    eh1Var.R.v.invalidate();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.b;
                n1Var.i = false;
                n1Var.l.setAlpha(35);
                n1Var.k.setAlpha(102);
                n1Var.j.setAlpha(35);
                n1Var.c();
                break;
            case 15:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.b).c;
                s1Var.K = false;
                s1Var.requestLayout();
                break;
            case 16:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) this.b;
                r2Var.J = 0.0f;
                r2Var.K = 0.0f;
                org.telegram.ui.Components.voip.q2 q2Var = r2Var.d;
                q2Var.setScaleX(r2Var.P);
                q2Var.setScaleY(r2Var.P);
                TextureView textureView = r2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(r2Var.Q);
                    textureView.setScaleY(r2Var.Q);
                }
                r2Var.setTranslationY(0.0f);
                r2Var.setTranslationX(0.0f);
                r2Var.S = r2Var.R;
                r2Var.U = null;
                break;
            case 17:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.b;
                u2Var.M = u2Var.L ? 1.0f : 0.0f;
                u2Var.a(u2Var.N, u2Var.O);
                break;
            case 18:
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
            case 19:
                org.telegram.ui.Components.voip.b3 b3Var = (org.telegram.ui.Components.voip.b3) this.b;
                b3Var.F = false;
                b3Var.P.e = false;
                if (b3Var.Q && (animatorSet = b3Var.M) != null) {
                    animatorSet.cancel();
                    b3Var.M.start();
                }
                b3Var.c();
                break;
            case 20:
                ((org.telegram.ui.Components.voip.j3) this.b).e.setVisibility(8);
                break;
            case 21:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 22:
                org.telegram.ui.yt ytVar = (org.telegram.ui.yt) this.b;
                if (animator.equals(ytVar.n[0])) {
                    ytVar.n[0] = null;
                    break;
                }
                break;
            case 23:
                org.telegram.ui.cv cvVar = (org.telegram.ui.cv) this.b;
                org.telegram.ui.ev evVar = cvVar.n;
                org.telegram.ui.dv[] dvVarArr = evVar.f;
                evVar.h = null;
                if (evVar.s) {
                    dvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.dv dvVar = dvVarArr[0];
                    dvVarArr[0] = dvVarArr[1];
                    dvVarArr[1] = dvVar;
                    dvVar.setVisibility(8);
                    evVar.w = evVar.f[0].f == evVar.e.getFirstTabId();
                    evVar.e.j(1.0f, evVar.f[0].f);
                }
                evVar.n = false;
                cvVar.c = false;
                cvVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.n2) evVar).actionBar;
                kVar.setEnabled(true);
                evVar.e.setEnabled(true);
                break;
            case 24:
                org.telegram.ui.kw kwVar = (org.telegram.ui.kw) this.b;
                org.telegram.ui.gy.q1(kwVar.M, kwVar.L, 0.0f);
                break;
            case 25:
                org.telegram.ui.gy gyVar = (org.telegram.ui.gy) this.b;
                boolean z10 = gyVar.C0;
                gyVar.D0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    gyVar.A0.setVisibility(8);
                }
                View view = gyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.gy gyVar2 = ((org.telegram.ui.yx) this.b).A0;
                gyVar2.b3 = null;
                if (!gyVar2.f3) {
                    org.telegram.ui.fy[] fyVarArr = gyVar2.a0;
                    org.telegram.ui.fy fyVar = fyVarArr[0];
                    org.telegram.ui.fy fyVar2 = fyVarArr[1];
                    fyVarArr[0] = fyVar2;
                    fyVarArr[1] = fyVar;
                    gyVar2.v0.g(1.0f, fyVar2.h);
                    gyVar2.T4(false);
                    gyVar2.a0[0].d.getClass();
                    gyVar2.a0[1].d.getClass();
                }
                gyVar2.a0[1].setVisibility(8);
                org.telegram.ui.gy.f1(gyVar2, true);
                gyVar2.c3 = false;
                gyVar2.i3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.n2) gyVar2).actionBar;
                kVar2.setEnabled(true);
                gyVar2.v0.setEnabled(true);
                gyVar2.r3(gyVar2.a0[0]);
                break;
            case 27:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.cy) this.b).setScrollEnabled(true);
                break;
            case 28:
                e80 e80Var = (e80) this.b;
                FrameLayout frameLayout = e80Var.b;
                ag.t0 t0Var = (ag.t0) e80Var.c;
                if (t0Var.getParent() != null) {
                    frameLayout.removeView(t0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.uh) e80Var.d);
                break;
            default:
                org.telegram.ui.s50 s50Var = ((org.telegram.ui.s40) this.b).o;
                org.telegram.ui.s50 s50Var2 = org.telegram.ui.s50.z3;
                s50Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.e3) s50Var).containerView;
                viewGroup.invalidate();
                s50Var.M.invalidate();
                if (s50Var.o0) {
                    s50Var.o0 = false;
                    s50Var.O0(true);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 10:
                super.onAnimationStart(animator);
                ((TransitionValues) this.b).view.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
