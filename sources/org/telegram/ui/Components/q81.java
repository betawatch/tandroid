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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class q81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q81(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 26:
                ((org.telegram.ui.bf0) this.b).s = null;
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
                v81 v81Var = (v81) this.b;
                v81Var.J = false;
                v81Var.setEnabled(true);
                u81 u81Var = v81Var.y;
                if (u81Var != null) {
                    ((l.d) u81Var).L(1.0f);
                }
                v81Var.invalidate();
                break;
            case 1:
                ((o91) this.b).e0 = null;
                break;
            case 2:
                ((q91) this.b).K = null;
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
                fi1 fi1Var = (fi1) this.b;
                if (!fi1Var.a) {
                    fi1Var.V.v.S = true;
                    fi1Var.V.v.invalidate();
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
                org.telegram.ui.cu cuVar = (org.telegram.ui.cu) this.b;
                if (animator.equals(cuVar.n[0])) {
                    cuVar.n[0] = null;
                    break;
                }
                break;
            case 16:
                org.telegram.ui.hv hvVar = (org.telegram.ui.hv) this.b;
                org.telegram.ui.jv jvVar = hvVar.n;
                org.telegram.ui.iv[] ivVarArr = jvVar.f;
                jvVar.h = null;
                if (jvVar.s) {
                    ivVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.iv ivVar = ivVarArr[0];
                    ivVarArr[0] = ivVarArr[1];
                    ivVarArr[1] = ivVar;
                    ivVar.setVisibility(8);
                    jvVar.w = jvVar.f[0].f == jvVar.e.getFirstTabId();
                    jvVar.e.j(1.0f, jvVar.f[0].f);
                }
                jvVar.n = false;
                hvVar.c = false;
                hvVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
                kVar.setEnabled(true);
                jvVar.e.setEnabled(true);
                break;
            case 17:
                org.telegram.ui.tw twVar = (org.telegram.ui.tw) this.b;
                org.telegram.ui.qy.q1(twVar.M, twVar.L, 0.0f);
                break;
            case 18:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.b;
                boolean z10 = qyVar.G0;
                qyVar.H0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    qyVar.E0.setVisibility(8);
                }
                View view = qyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.qy qyVar2 = ((org.telegram.ui.jy) this.b).E0;
                qyVar2.f3 = null;
                if (!qyVar2.j3) {
                    org.telegram.ui.py[] pyVarArr = qyVar2.e0;
                    org.telegram.ui.py pyVar = pyVarArr[0];
                    org.telegram.ui.py pyVar2 = pyVarArr[1];
                    pyVarArr[0] = pyVar2;
                    pyVarArr[1] = pyVar;
                    qyVar2.z0.g(1.0f, pyVar2.h);
                    qyVar2.T4(false);
                    qyVar2.e0[0].d.getClass();
                    qyVar2.e0[1].d.getClass();
                }
                qyVar2.e0[1].setVisibility(8);
                org.telegram.ui.qy.f1(qyVar2, true);
                qyVar2.g3 = false;
                qyVar2.m3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.m2) qyVar2).actionBar;
                kVar2.setEnabled(true);
                qyVar2.z0.setEnabled(true);
                qyVar2.r3(qyVar2.e0[0]);
                break;
            case 20:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.my) this.b).setScrollEnabled(true);
                break;
            case 21:
                c90 c90Var = (c90) this.b;
                FrameLayout frameLayout = c90Var.b;
                ci.r6 r6Var = (ci.r6) c90Var.c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.bi) c90Var.d);
                break;
            case 22:
                org.telegram.ui.d60 d60Var = ((org.telegram.ui.d50) this.b).o;
                org.telegram.ui.d60 d60Var2 = org.telegram.ui.d60.D3;
                d60Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
                viewGroup.invalidate();
                d60Var.Q.invalidate();
                if (d60Var.s0) {
                    d60Var.s0 = false;
                    d60Var.O0(true);
                    break;
                }
                break;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.r50 r50Var = (org.telegram.ui.r50) this.b;
                r50Var.G = null;
                org.telegram.ui.d60 d60Var3 = r50Var.L;
                d60Var3.Q.invalidate();
                d60Var3.a2.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) d60Var3).containerView;
                viewGroup2.invalidate();
                org.telegram.ui.d60.J0(d60Var3);
                r50Var.H.clear();
                r50Var.I.clear();
                break;
            case 24:
                org.telegram.ui.f80 f80Var = (org.telegram.ui.f80) this.b;
                f80Var.d = null;
                f80Var.a = null;
                f80Var.b = false;
                break;
            case 25:
                org.telegram.ui.cd0 cd0Var = (org.telegram.ui.cd0) this.b;
                cd0Var.H = false;
                cd0Var.o0();
                break;
            case 26:
                org.telegram.ui.bf0 bf0Var = (org.telegram.ui.bf0) this.b;
                if (bf0Var.s != null && bf0Var.n != null) {
                    bf0Var.r.setVisibility(4);
                    bf0Var.s = null;
                    break;
                }
                break;
            case 27:
                ((org.telegram.ui.ej0) this.b).T.setVisibility(8);
                break;
            case 28:
                org.telegram.ui.yj0 yj0Var = (org.telegram.ui.yj0) this.b;
                yj0Var.f = 1.0f;
                yj0Var.invalidate();
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
