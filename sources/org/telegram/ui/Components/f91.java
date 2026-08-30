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
import org.telegram.ui.th1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f91(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 24:
                ((org.telegram.ui.ze0) this.b).s = null;
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
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.a) {
            case 0:
                ((h91) this.b).H = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.b).view.setEnabled(true);
                break;
            case 2:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.b).p0;
                if (tVar.u0.getParent() != null) {
                    tVar.a.removeView(tVar.u0);
                    break;
                }
                break;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.b;
                if (u0Var.getParent() != null) {
                    ((ViewGroup) u0Var.getParent()).removeView(u0Var);
                    break;
                }
                break;
            case 4:
                th1 th1Var = (th1) this.b;
                if (!th1Var.a) {
                    th1Var.S.v.P = true;
                    th1Var.S.v.invalidate();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.b;
                n1Var.i = false;
                n1Var.l.setAlpha(35);
                n1Var.k.setAlpha(102);
                n1Var.j.setAlpha(35);
                n1Var.c();
                break;
            case 6:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.b).c;
                s1Var.L = false;
                s1Var.requestLayout();
                break;
            case 7:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) this.b;
                s2Var.K = 0.0f;
                s2Var.L = 0.0f;
                org.telegram.ui.Components.voip.r2 r2Var = s2Var.d;
                r2Var.setScaleX(s2Var.Q);
                r2Var.setScaleY(s2Var.Q);
                TextureView textureView = s2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(s2Var.R);
                    textureView.setScaleY(s2Var.R);
                }
                s2Var.setTranslationY(0.0f);
                s2Var.setTranslationX(0.0f);
                s2Var.T = s2Var.S;
                s2Var.V = null;
                break;
            case 8:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.b;
                v2Var.N = v2Var.M ? 1.0f : 0.0f;
                v2Var.a(v2Var.O, v2Var.P);
                break;
            case 9:
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
            case 10:
                org.telegram.ui.Components.voip.c3 c3Var = (org.telegram.ui.Components.voip.c3) this.b;
                c3Var.G = false;
                c3Var.Q.e = false;
                if (c3Var.R && (animatorSet = c3Var.N) != null) {
                    animatorSet.cancel();
                    c3Var.N.start();
                }
                c3Var.c();
                break;
            case 11:
                ((org.telegram.ui.Components.voip.k3) this.b).e.setVisibility(8);
                break;
            case 12:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 13:
                org.telegram.ui.eu euVar = (org.telegram.ui.eu) this.b;
                if (animator.equals(euVar.n[0])) {
                    euVar.n[0] = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.iv ivVar = (org.telegram.ui.iv) this.b;
                org.telegram.ui.kv kvVar = ivVar.n;
                org.telegram.ui.jv[] jvVarArr = kvVar.f;
                kvVar.h = null;
                if (kvVar.s) {
                    jvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.jv jvVar = jvVarArr[0];
                    jvVarArr[0] = jvVarArr[1];
                    jvVarArr[1] = jvVar;
                    jvVar.setVisibility(8);
                    kvVar.w = kvVar.f[0].f == kvVar.e.getFirstTabId();
                    kvVar.e.j(1.0f, kvVar.f[0].f);
                }
                kvVar.n = false;
                ivVar.c = false;
                ivVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.p2) kvVar).actionBar;
                kVar.setEnabled(true);
                kvVar.e.setEnabled(true);
                break;
            case 15:
                org.telegram.ui.sw swVar = (org.telegram.ui.sw) this.b;
                org.telegram.ui.oy.q1(swVar.M, swVar.L, 0.0f);
                break;
            case 16:
                org.telegram.ui.oy oyVar = (org.telegram.ui.oy) this.b;
                boolean z4 = oyVar.D0;
                oyVar.E0 = z4 ? 1.0f : 0.0f;
                if (!z4) {
                    oyVar.B0.setVisibility(8);
                }
                View view = oyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.oy oyVar2 = ((org.telegram.ui.hy) this.b).B0;
                oyVar2.c3 = null;
                if (!oyVar2.g3) {
                    org.telegram.ui.ny[] nyVarArr = oyVar2.b0;
                    org.telegram.ui.ny nyVar = nyVarArr[0];
                    org.telegram.ui.ny nyVar2 = nyVarArr[1];
                    nyVarArr[0] = nyVar2;
                    nyVarArr[1] = nyVar;
                    oyVar2.w0.g(1.0f, nyVar2.h);
                    oyVar2.T4(false);
                    oyVar2.b0[0].d.getClass();
                    oyVar2.b0[1].d.getClass();
                }
                oyVar2.b0[1].setVisibility(8);
                org.telegram.ui.oy.f1(oyVar2, true);
                oyVar2.d3 = false;
                oyVar2.j3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.p2) oyVar2).actionBar;
                kVar2.setEnabled(true);
                oyVar2.w0.setEnabled(true);
                oyVar2.r3(oyVar2.b0[0]);
                break;
            case 18:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.ky) this.b).setScrollEnabled(true);
                break;
            case 19:
                t80 t80Var = (t80) this.b;
                FrameLayout frameLayout = t80Var.b;
                eg.i0 i0Var = (eg.i0) t80Var.c;
                if (i0Var.getParent() != null) {
                    frameLayout.removeView(i0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ai) t80Var.d);
                break;
            case 20:
                org.telegram.ui.c60 c60Var = ((org.telegram.ui.d50) this.b).o;
                org.telegram.ui.c60 c60Var2 = org.telegram.ui.c60.A3;
                c60Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
                viewGroup.invalidate();
                c60Var.N.invalidate();
                if (c60Var.p0) {
                    c60Var.p0 = false;
                    c60Var.O0(true);
                    break;
                }
                break;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.q50 q50Var = (org.telegram.ui.q50) this.b;
                q50Var.G = null;
                org.telegram.ui.c60 c60Var3 = q50Var.L;
                c60Var3.N.invalidate();
                c60Var3.X1.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.g3) c60Var3).containerView;
                viewGroup2.invalidate();
                org.telegram.ui.c60.J0(c60Var3);
                q50Var.H.clear();
                q50Var.I.clear();
                break;
            case 22:
                org.telegram.ui.b80 b80Var = (org.telegram.ui.b80) this.b;
                b80Var.d = null;
                b80Var.a = null;
                b80Var.b = false;
                break;
            case 23:
                org.telegram.ui.ad0 ad0Var = (org.telegram.ui.ad0) this.b;
                ad0Var.E = false;
                ad0Var.o0();
                break;
            case 24:
                org.telegram.ui.ze0 ze0Var = (org.telegram.ui.ze0) this.b;
                if (ze0Var.s != null && ze0Var.n != null) {
                    ze0Var.r.setVisibility(4);
                    ze0Var.s = null;
                    break;
                }
                break;
            case 25:
                ((org.telegram.ui.aj0) this.b).Q.setVisibility(8);
                break;
            case 26:
                org.telegram.ui.uj0 uj0Var = (org.telegram.ui.uj0) this.b;
                uj0Var.f = 1.0f;
                uj0Var.invalidate();
                break;
            case 27:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 28:
                org.telegram.ui.gp0 gp0Var = (org.telegram.ui.gp0) this.b;
                org.telegram.ui.kc kcVar = gp0Var.L;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) gp0Var.L.getParent()).removeView(gp0Var.L);
                    }
                    gp0Var.L = null;
                }
                gp0Var.N = null;
                super.onAnimationEnd(animator);
                break;
            default:
                org.telegram.ui.hq0 hq0Var = (org.telegram.ui.hq0) this.b;
                org.telegram.ui.kq0 kq0Var = hq0Var.A0;
                org.telegram.ui.iq0[] iq0VarArr = kq0Var.n;
                kq0Var.r = null;
                if (kq0Var.w) {
                    iq0VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.iq0 iq0Var = iq0VarArr[0];
                    iq0VarArr[0] = iq0VarArr[1];
                    iq0VarArr[1] = iq0Var;
                    iq0Var.setVisibility(8);
                    kq0Var.e = kq0Var.n[0].e == kq0Var.h.getFirstTabId();
                    kq0Var.h.j(1.0f, kq0Var.n[0].e);
                }
                kq0Var.s = false;
                hq0Var.v0 = false;
                hq0Var.u0 = false;
                kVar3 = ((org.telegram.ui.ActionBar.p2) kq0Var).actionBar;
                kVar3.setEnabled(true);
                kq0Var.h.setEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationStart(animator);
                ((TransitionValues) this.b).view.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
