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
import org.telegram.ui.di1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class b91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b91(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 26:
                ((org.telegram.ui.ff0) this.b).s = null;
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
                g91 g91Var = (g91) this.b;
                g91Var.J = false;
                g91Var.setEnabled(true);
                f91 f91Var = g91Var.y;
                if (f91Var != null) {
                    ((n2.c) f91Var).k(1.0f);
                }
                g91Var.invalidate();
                break;
            case 1:
                ((aa1) this.b).e0 = null;
                break;
            case 2:
                ((ca1) this.b).K = null;
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
                di1 di1Var = (di1) this.b;
                if (!di1Var.a) {
                    di1Var.V.v.S = true;
                    di1Var.V.v.invalidate();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.b;
                r1Var.i = false;
                r1Var.l.setAlpha(35);
                r1Var.k.setAlpha(102);
                r1Var.j.setAlpha(35);
                r1Var.c();
                break;
            case 8:
                org.telegram.ui.Components.voip.v1 v1Var = ((org.telegram.ui.Components.voip.t1) this.b).c;
                v1Var.O = false;
                v1Var.requestLayout();
                break;
            case 9:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.b;
                t2Var.N = 0.0f;
                t2Var.O = 0.0f;
                org.telegram.ui.Components.voip.s2 s2Var = t2Var.d;
                s2Var.setScaleX(t2Var.T);
                s2Var.setScaleY(t2Var.T);
                TextureView textureView = t2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(t2Var.U);
                    textureView.setScaleY(t2Var.U);
                }
                t2Var.setTranslationY(0.0f);
                t2Var.setTranslationX(0.0f);
                t2Var.W = t2Var.V;
                t2Var.b0 = null;
                break;
            case 10:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.b;
                w2Var.Q = w2Var.P ? 1.0f : 0.0f;
                w2Var.a(w2Var.R, w2Var.S);
                break;
            case 11:
                ((org.telegram.ui.Components.voip.x2) this.b).c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.x2) this.b).a);
                if (((org.telegram.ui.Components.voip.x2) this.b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.x2) this.b).a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.x2) this.b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.x2) this.b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.b;
                d3Var.J = false;
                d3Var.T.e = false;
                if (d3Var.U && (animatorSet = d3Var.Q) != null) {
                    animatorSet.cancel();
                    d3Var.Q.start();
                }
                d3Var.c();
                break;
            case 13:
                ((org.telegram.ui.Components.voip.l3) this.b).e.setVisibility(8);
                break;
            case 14:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 15:
                org.telegram.ui.hu huVar = (org.telegram.ui.hu) this.b;
                if (animator.equals(huVar.n[0])) {
                    huVar.n[0] = null;
                    break;
                }
                break;
            case 16:
                org.telegram.ui.lv lvVar = (org.telegram.ui.lv) this.b;
                org.telegram.ui.nv nvVar = lvVar.n;
                org.telegram.ui.mv[] mvVarArr = nvVar.f;
                nvVar.h = null;
                if (nvVar.s) {
                    mvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.mv mvVar = mvVarArr[0];
                    mvVarArr[0] = mvVarArr[1];
                    mvVarArr[1] = mvVar;
                    mvVar.setVisibility(8);
                    nvVar.w = nvVar.f[0].f == nvVar.e.getFirstTabId();
                    nvVar.e.j(1.0f, nvVar.f[0].f);
                }
                nvVar.n = false;
                lvVar.c = false;
                lvVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
                kVar.setEnabled(true);
                nvVar.e.setEnabled(true);
                break;
            case 17:
                org.telegram.ui.vw vwVar = (org.telegram.ui.vw) this.b;
                org.telegram.ui.uy.u1(vwVar.M, vwVar.L, 0.0f);
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
                    uyVar2.c5(false);
                    uyVar2.e0[0].d.getClass();
                    uyVar2.e0[1].d.getClass();
                }
                uyVar2.e0[1].setVisibility(8);
                org.telegram.ui.uy.j1(uyVar2, true);
                uyVar2.g3 = false;
                uyVar2.m3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar2).actionBar;
                kVar2.setEnabled(true);
                uyVar2.z0.setEnabled(true);
                uyVar2.A3(uyVar2.e0[0]);
                break;
            case 20:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.qy) this.b).setScrollEnabled(true);
                break;
            case 21:
                f90 f90Var = (f90) this.b;
                FrameLayout frameLayout = f90Var.b;
                ci.r6 r6Var = (ci.r6) f90Var.c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.g7) f90Var.d);
                break;
            case 22:
                org.telegram.ui.h60 h60Var = ((org.telegram.ui.i50) this.b).o;
                org.telegram.ui.h60 h60Var2 = org.telegram.ui.h60.D3;
                h60Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
                viewGroup.invalidate();
                h60Var.Q.invalidate();
                if (h60Var.s0) {
                    h60Var.s0 = false;
                    h60Var.O0(true);
                    break;
                }
                break;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) this.b;
                v50Var.G = null;
                org.telegram.ui.h60 h60Var3 = v50Var.L;
                h60Var3.Q.invalidate();
                h60Var3.a2.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) h60Var3).containerView;
                viewGroup2.invalidate();
                org.telegram.ui.h60.J0(h60Var3);
                v50Var.H.clear();
                v50Var.I.clear();
                break;
            case 24:
                org.telegram.ui.j80 j80Var = (org.telegram.ui.j80) this.b;
                j80Var.d = null;
                j80Var.a = null;
                j80Var.b = false;
                break;
            case 25:
                org.telegram.ui.gd0 gd0Var = (org.telegram.ui.gd0) this.b;
                gd0Var.H = false;
                gd0Var.o0();
                break;
            case 26:
                org.telegram.ui.ff0 ff0Var = (org.telegram.ui.ff0) this.b;
                if (ff0Var.s != null && ff0Var.n != null) {
                    ff0Var.r.setVisibility(4);
                    ff0Var.s = null;
                    break;
                }
                break;
            case 27:
                ((org.telegram.ui.hj0) this.b).T.setVisibility(8);
                break;
            case 28:
                org.telegram.ui.ck0 ck0Var = (org.telegram.ui.ck0) this.b;
                ck0Var.f = 1.0f;
                ck0Var.invalidate();
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
