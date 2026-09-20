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
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.mi1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class r81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r81(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 26:
                ((org.telegram.ui.jf0) this.b).s = null;
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
                w81 w81Var = (w81) this.b;
                w81Var.J = false;
                w81Var.setEnabled(true);
                v81 v81Var = w81Var.y;
                if (v81Var != null) {
                    ((l.d) v81Var).M(1.0f);
                }
                w81Var.invalidate();
                break;
            case 1:
                ((p91) this.b).e0 = null;
                break;
            case 2:
                ((r91) this.b).K = null;
                break;
            case 3:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.b).view.setEnabled(true);
                break;
            case 4:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.b).s0;
                if (uVar.x0.getParent() != null) {
                    uVar.a.removeView(uVar.x0);
                    break;
                }
                break;
            case 5:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.b;
                if (x0Var.getParent() != null) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    break;
                }
                break;
            case 6:
                mi1 mi1Var = (mi1) this.b;
                if (!mi1Var.a) {
                    mi1Var.V.v.S = true;
                    mi1Var.V.v.invalidate();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.b;
                q1Var.i = false;
                q1Var.l.setAlpha(35);
                q1Var.k.setAlpha(102);
                q1Var.j.setAlpha(35);
                q1Var.c();
                break;
            case 8:
                org.telegram.ui.Components.voip.u1 u1Var = ((org.telegram.ui.Components.voip.s1) this.b).c;
                u1Var.O = false;
                u1Var.requestLayout();
                break;
            case 9:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.b;
                s2Var.N = 0.0f;
                s2Var.O = 0.0f;
                org.telegram.ui.Components.voip.r2 r2Var = s2Var.d;
                r2Var.setScaleX(s2Var.T);
                r2Var.setScaleY(s2Var.T);
                TextureView textureView = s2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(s2Var.U);
                    textureView.setScaleY(s2Var.U);
                }
                s2Var.setTranslationY(0.0f);
                s2Var.setTranslationX(0.0f);
                s2Var.W = s2Var.V;
                s2Var.b0 = null;
                break;
            case 10:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.b;
                v2Var.Q = v2Var.P ? 1.0f : 0.0f;
                v2Var.a(v2Var.R, v2Var.S);
                break;
            case 11:
                ((org.telegram.ui.Components.voip.w2) this.b).c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.w2) this.b).a);
                if (((org.telegram.ui.Components.voip.w2) this.b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.w2) this.b).a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.w2) this.b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.w2) this.b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.voip.c3 c3Var = (org.telegram.ui.Components.voip.c3) this.b;
                c3Var.J = false;
                c3Var.T.e = false;
                if (c3Var.U && (animatorSet = c3Var.Q) != null) {
                    animatorSet.cancel();
                    c3Var.Q.start();
                }
                c3Var.c();
                break;
            case 13:
                ((org.telegram.ui.Components.voip.k3) this.b).e.setVisibility(8);
                break;
            case 14:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 15:
                org.telegram.ui.iu iuVar = (org.telegram.ui.iu) this.b;
                if (animator.equals(iuVar.n[0])) {
                    iuVar.n[0] = null;
                    break;
                }
                break;
            case 16:
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
            case 17:
                org.telegram.ui.xw xwVar = (org.telegram.ui.xw) this.b;
                org.telegram.ui.uy.q1(xwVar.M, xwVar.L, 0.0f);
                break;
            case 18:
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
            case 19:
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
            case 20:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.qy) this.b).setScrollEnabled(true);
                break;
            case 21:
                z80 z80Var = (z80) this.b;
                FrameLayout frameLayout = z80Var.b;
                ci.s6 s6Var = (ci.s6) z80Var.c;
                if (s6Var.getParent() != null) {
                    frameLayout.removeView(s6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.f7) z80Var.d);
                break;
            case 22:
                org.telegram.ui.i60 i60Var = ((org.telegram.ui.i50) this.b).o;
                org.telegram.ui.i60 i60Var2 = org.telegram.ui.i60.D3;
                i60Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
                viewGroup.invalidate();
                i60Var.Q.invalidate();
                if (i60Var.s0) {
                    i60Var.s0 = false;
                    i60Var.O0(true);
                    break;
                }
                break;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.w50 w50Var = (org.telegram.ui.w50) this.b;
                w50Var.G = null;
                org.telegram.ui.i60 i60Var3 = w50Var.L;
                i60Var3.Q.invalidate();
                i60Var3.a2.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) i60Var3).containerView;
                viewGroup2.invalidate();
                org.telegram.ui.i60.J0(i60Var3);
                w50Var.H.clear();
                w50Var.I.clear();
                break;
            case 24:
                org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) this.b;
                k80Var.d = null;
                k80Var.a = null;
                k80Var.b = false;
                break;
            case 25:
                org.telegram.ui.kd0 kd0Var = (org.telegram.ui.kd0) this.b;
                kd0Var.H = false;
                kd0Var.o0();
                break;
            case 26:
                org.telegram.ui.jf0 jf0Var = (org.telegram.ui.jf0) this.b;
                if (jf0Var.s != null && jf0Var.n != null) {
                    jf0Var.r.setVisibility(4);
                    jf0Var.s = null;
                    break;
                }
                break;
            case 27:
                ((org.telegram.ui.mj0) this.b).T.setVisibility(8);
                break;
            case 28:
                org.telegram.ui.hk0 hk0Var = (org.telegram.ui.hk0) this.b;
                hk0Var.f = 1.0f;
                hk0Var.invalidate();
                break;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 3:
                super.onAnimationStart(animator);
                ((TransitionValues) this.b).view.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
