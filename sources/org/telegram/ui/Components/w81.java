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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class w81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w81(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 25:
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
                ((d91) this.b).e0 = null;
                break;
            case 1:
                ((f91) this.b).K = null;
                break;
            case 2:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.b).view.setEnabled(true);
                break;
            case 3:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.b).s0;
                if (uVar.x0.getParent() != null) {
                    uVar.a.removeView(uVar.x0);
                    break;
                }
                break;
            case 4:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.b;
                if (x0Var.getParent() != null) {
                    ((ViewGroup) x0Var.getParent()).removeView(x0Var);
                    break;
                }
                break;
            case 5:
                mi1 mi1Var = (mi1) this.b;
                if (!mi1Var.a) {
                    mi1Var.V.v.S = true;
                    mi1Var.V.v.invalidate();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.voip.q1 q1Var = (org.telegram.ui.Components.voip.q1) this.b;
                q1Var.i = false;
                q1Var.l.setAlpha(35);
                q1Var.k.setAlpha(102);
                q1Var.j.setAlpha(35);
                q1Var.c();
                break;
            case 7:
                org.telegram.ui.Components.voip.u1 u1Var = ((org.telegram.ui.Components.voip.s1) this.b).c;
                u1Var.O = false;
                u1Var.requestLayout();
                break;
            case 8:
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
            case 9:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.b;
                v2Var.Q = v2Var.P ? 1.0f : 0.0f;
                v2Var.a(v2Var.R, v2Var.S);
                break;
            case 10:
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
            case 11:
                org.telegram.ui.Components.voip.c3 c3Var = (org.telegram.ui.Components.voip.c3) this.b;
                c3Var.J = false;
                c3Var.T.e = false;
                if (c3Var.U && (animatorSet = c3Var.Q) != null) {
                    animatorSet.cancel();
                    c3Var.Q.start();
                }
                c3Var.c();
                break;
            case 12:
                ((org.telegram.ui.Components.voip.k3) this.b).e.setVisibility(8);
                break;
            case 13:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.ju juVar = (org.telegram.ui.ju) this.b;
                if (animator.equals(juVar.n[0])) {
                    juVar.n[0] = null;
                    break;
                }
                break;
            case 15:
                org.telegram.ui.nv nvVar = (org.telegram.ui.nv) this.b;
                org.telegram.ui.pv pvVar = nvVar.n;
                org.telegram.ui.ov[] ovVarArr = pvVar.f;
                pvVar.h = null;
                if (pvVar.s) {
                    ovVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ov ovVar = ovVarArr[0];
                    ovVarArr[0] = ovVarArr[1];
                    ovVarArr[1] = ovVar;
                    ovVar.setVisibility(8);
                    pvVar.w = pvVar.f[0].f == pvVar.e.getFirstTabId();
                    pvVar.e.j(1.0f, pvVar.f[0].f);
                }
                pvVar.n = false;
                nvVar.c = false;
                nvVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.o2) pvVar).actionBar;
                kVar.setEnabled(true);
                pvVar.e.setEnabled(true);
                break;
            case 16:
                org.telegram.ui.zw zwVar = (org.telegram.ui.zw) this.b;
                org.telegram.ui.wy.q1(zwVar.M, zwVar.L, 0.0f);
                break;
            case 17:
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) this.b;
                boolean z10 = wyVar.G0;
                wyVar.H0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    wyVar.E0.setVisibility(8);
                }
                View view = wyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.wy wyVar2 = ((org.telegram.ui.py) this.b).E0;
                wyVar2.f3 = null;
                if (!wyVar2.j3) {
                    org.telegram.ui.vy[] vyVarArr = wyVar2.e0;
                    org.telegram.ui.vy vyVar = vyVarArr[0];
                    org.telegram.ui.vy vyVar2 = vyVarArr[1];
                    vyVarArr[0] = vyVar2;
                    vyVarArr[1] = vyVar;
                    wyVar2.z0.g(1.0f, vyVar2.h);
                    wyVar2.T4(false);
                    wyVar2.e0[0].d.getClass();
                    wyVar2.e0[1].d.getClass();
                }
                wyVar2.e0[1].setVisibility(8);
                org.telegram.ui.wy.f1(wyVar2, true);
                wyVar2.g3 = false;
                wyVar2.m3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.o2) wyVar2).actionBar;
                kVar2.setEnabled(true);
                wyVar2.z0.setEnabled(true);
                wyVar2.r3(wyVar2.e0[0]);
                break;
            case 19:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.sy) this.b).setScrollEnabled(true);
                break;
            case 20:
                r80 r80Var = (r80) this.b;
                FrameLayout frameLayout = r80Var.b;
                ci.s6 s6Var = (ci.s6) r80Var.c;
                if (s6Var.getParent() != null) {
                    frameLayout.removeView(s6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.g7) r80Var.d);
                break;
            case 21:
                org.telegram.ui.k60 k60Var = ((org.telegram.ui.k50) this.b).o;
                org.telegram.ui.k60 k60Var2 = org.telegram.ui.k60.D3;
                k60Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
                viewGroup.invalidate();
                k60Var.Q.invalidate();
                if (k60Var.s0) {
                    k60Var.s0 = false;
                    k60Var.O0(true);
                    break;
                }
                break;
            case 22:
                super.onAnimationEnd(animator);
                org.telegram.ui.y50 y50Var = (org.telegram.ui.y50) this.b;
                y50Var.G = null;
                org.telegram.ui.k60 k60Var3 = y50Var.L;
                k60Var3.Q.invalidate();
                k60Var3.a2.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.g3) k60Var3).containerView;
                viewGroup2.invalidate();
                org.telegram.ui.k60.J0(k60Var3);
                y50Var.H.clear();
                y50Var.I.clear();
                break;
            case 23:
                org.telegram.ui.m80 m80Var = (org.telegram.ui.m80) this.b;
                m80Var.d = null;
                m80Var.a = null;
                m80Var.b = false;
                break;
            case 24:
                org.telegram.ui.kd0 kd0Var = (org.telegram.ui.kd0) this.b;
                kd0Var.H = false;
                kd0Var.o0();
                break;
            case 25:
                org.telegram.ui.jf0 jf0Var = (org.telegram.ui.jf0) this.b;
                if (jf0Var.s != null && jf0Var.n != null) {
                    jf0Var.r.setVisibility(4);
                    jf0Var.s = null;
                    break;
                }
                break;
            case 26:
                ((org.telegram.ui.lj0) this.b).T.setVisibility(8);
                break;
            case 27:
                org.telegram.ui.gk0 gk0Var = (org.telegram.ui.gk0) this.b;
                gk0Var.f = 1.0f;
                gk0Var.invalidate();
                break;
            case 28:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            default:
                org.telegram.ui.cq0 cq0Var = (org.telegram.ui.cq0) this.b;
                org.telegram.ui.nc ncVar = cq0Var.X;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) cq0Var.X.getParent()).removeView(cq0Var.X);
                    }
                    cq0Var.X = null;
                }
                cq0Var.Z = null;
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                super.onAnimationStart(animator);
                ((TransitionValues) this.b).view.setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
