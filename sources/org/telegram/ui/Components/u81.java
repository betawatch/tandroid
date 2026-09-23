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
import org.telegram.ui.fi1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class u81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u81(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 25:
                ((org.telegram.ui.cf0) this.b).s = null;
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
                ((b91) this.b).e0 = null;
                break;
            case 1:
                ((d91) this.b).K = null;
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
                fi1 fi1Var = (fi1) this.b;
                if (!fi1Var.a) {
                    fi1Var.V.v.S = true;
                    fi1Var.V.v.invalidate();
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
                org.telegram.ui.du duVar = (org.telegram.ui.du) this.b;
                if (animator.equals(duVar.n[0])) {
                    duVar.n[0] = null;
                    break;
                }
                break;
            case 15:
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
                kVar = ((org.telegram.ui.ActionBar.n2) kvVar).actionBar;
                kVar.setEnabled(true);
                kvVar.e.setEnabled(true);
                break;
            case 16:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) this.b;
                org.telegram.ui.ry.q1(uwVar.M, uwVar.L, 0.0f);
                break;
            case 17:
                org.telegram.ui.ry ryVar = (org.telegram.ui.ry) this.b;
                boolean z10 = ryVar.G0;
                ryVar.H0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    ryVar.E0.setVisibility(8);
                }
                View view = ryVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.ry ryVar2 = ((org.telegram.ui.ky) this.b).E0;
                ryVar2.f3 = null;
                if (!ryVar2.j3) {
                    org.telegram.ui.qy[] qyVarArr = ryVar2.e0;
                    org.telegram.ui.qy qyVar = qyVarArr[0];
                    org.telegram.ui.qy qyVar2 = qyVarArr[1];
                    qyVarArr[0] = qyVar2;
                    qyVarArr[1] = qyVar;
                    ryVar2.z0.g(1.0f, qyVar2.h);
                    ryVar2.T4(false);
                    ryVar2.e0[0].d.getClass();
                    ryVar2.e0[1].d.getClass();
                }
                ryVar2.e0[1].setVisibility(8);
                org.telegram.ui.ry.f1(ryVar2, true);
                ryVar2.g3 = false;
                ryVar2.m3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.n2) ryVar2).actionBar;
                kVar2.setEnabled(true);
                ryVar2.z0.setEnabled(true);
                ryVar2.r3(ryVar2.e0[0]);
                break;
            case 19:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.ny) this.b).setScrollEnabled(true);
                break;
            case 20:
                s80 s80Var = (s80) this.b;
                FrameLayout frameLayout = s80Var.b;
                ci.r6 r6Var = (ci.r6) s80Var.c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.bi) s80Var.d);
                break;
            case 21:
                org.telegram.ui.f60 f60Var = ((org.telegram.ui.f50) this.b).o;
                org.telegram.ui.f60 f60Var2 = org.telegram.ui.f60.D3;
                f60Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
                viewGroup.invalidate();
                f60Var.Q.invalidate();
                if (f60Var.s0) {
                    f60Var.s0 = false;
                    f60Var.O0(true);
                    break;
                }
                break;
            case 22:
                super.onAnimationEnd(animator);
                org.telegram.ui.t50 t50Var = (org.telegram.ui.t50) this.b;
                t50Var.G = null;
                org.telegram.ui.f60 f60Var3 = t50Var.L;
                f60Var3.Q.invalidate();
                f60Var3.a2.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) f60Var3).containerView;
                viewGroup2.invalidate();
                org.telegram.ui.f60.J0(f60Var3);
                t50Var.H.clear();
                t50Var.I.clear();
                break;
            case 23:
                org.telegram.ui.h80 h80Var = (org.telegram.ui.h80) this.b;
                h80Var.d = null;
                h80Var.a = null;
                h80Var.b = false;
                break;
            case 24:
                org.telegram.ui.dd0 dd0Var = (org.telegram.ui.dd0) this.b;
                dd0Var.H = false;
                dd0Var.o0();
                break;
            case 25:
                org.telegram.ui.cf0 cf0Var = (org.telegram.ui.cf0) this.b;
                if (cf0Var.s != null && cf0Var.n != null) {
                    cf0Var.r.setVisibility(4);
                    cf0Var.s = null;
                    break;
                }
                break;
            case 26:
                ((org.telegram.ui.ej0) this.b).T.setVisibility(8);
                break;
            case 27:
                org.telegram.ui.yj0 yj0Var = (org.telegram.ui.yj0) this.b;
                yj0Var.f = 1.0f;
                yj0Var.invalidate();
                break;
            case 28:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            default:
                org.telegram.ui.up0 up0Var = (org.telegram.ui.up0) this.b;
                org.telegram.ui.kc kcVar = up0Var.X;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) up0Var.X.getParent()).removeView(up0Var.X);
                    }
                    up0Var.X = null;
                }
                up0Var.Z = null;
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
