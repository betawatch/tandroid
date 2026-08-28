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
import org.telegram.ui.fh1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y11 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y11(Object obj, int i9) {
        this.a = i9;
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
                a21 a21Var = (a21) this.b;
                a21Var.G = 1.0f;
                a21Var.h.invalidate();
                break;
            case 1:
                ((h41) this.b).H = null;
                break;
            case 2:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 3:
                p51 p51Var = (p51) this.b;
                if (p51Var.a.getTag() == null) {
                    p51Var.a.setVisibility(4);
                    break;
                }
                break;
            case 4:
                super.onAnimationEnd(animator);
                q51 q51Var = (q51) this.b;
                q51Var.b = 0.0f;
                q51Var.setTranslationY(0.0f);
                q51Var.a = null;
                break;
            case 5:
                m71 m71Var = (m71) this.b;
                m71Var.F = false;
                m71Var.setEnabled(true);
                l71 l71Var = m71Var.y;
                if (l71Var != null) {
                    ((n2.p) l71Var).F(1.0f);
                }
                m71Var.invalidate();
                break;
            case 6:
                ((g81) this.b).a0 = null;
                break;
            case 7:
                ((i81) this.b).G = null;
                break;
            case 8:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.b).view.setEnabled(true);
                break;
            case 9:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.b).o0;
                if (tVar.t0.getParent() != null) {
                    tVar.a.removeView(tVar.t0);
                    break;
                }
                break;
            case 10:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.u0 u0Var = (org.telegram.ui.Components.voip.u0) this.b;
                if (u0Var.getParent() != null) {
                    ((ViewGroup) u0Var.getParent()).removeView(u0Var);
                    break;
                }
                break;
            case 11:
                fh1 fh1Var = (fh1) this.b;
                if (!fh1Var.a) {
                    fh1Var.R.v.O = true;
                    fh1Var.R.v.invalidate();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.b;
                n1Var.i = false;
                n1Var.l.setAlpha(35);
                n1Var.k.setAlpha(102);
                n1Var.j.setAlpha(35);
                n1Var.c();
                break;
            case 13:
                org.telegram.ui.Components.voip.s1 s1Var = ((org.telegram.ui.Components.voip.q1) this.b).c;
                s1Var.K = false;
                s1Var.requestLayout();
                break;
            case 14:
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
            case 15:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.b;
                u2Var.M = u2Var.L ? 1.0f : 0.0f;
                u2Var.a(u2Var.N, u2Var.O);
                break;
            case 16:
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
            case 17:
                org.telegram.ui.Components.voip.b3 b3Var = (org.telegram.ui.Components.voip.b3) this.b;
                b3Var.F = false;
                b3Var.P.e = false;
                if (b3Var.Q && (animatorSet = b3Var.M) != null) {
                    animatorSet.cancel();
                    b3Var.M.start();
                }
                b3Var.c();
                break;
            case 18:
                ((org.telegram.ui.Components.voip.j3) this.b).e.setVisibility(8);
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
                org.telegram.ui.zu zuVar = (org.telegram.ui.zu) this.b;
                org.telegram.ui.bv bvVar = zuVar.n;
                org.telegram.ui.av[] avVarArr = bvVar.f;
                bvVar.h = null;
                if (bvVar.s) {
                    avVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.av avVar = avVarArr[0];
                    avVarArr[0] = avVarArr[1];
                    avVarArr[1] = avVar;
                    avVar.setVisibility(8);
                    bvVar.w = bvVar.f[0].f == bvVar.e.getFirstTabId();
                    bvVar.e.j(1.0f, bvVar.f[0].f);
                }
                bvVar.n = false;
                zuVar.c = false;
                zuVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.o2) bvVar).actionBar;
                kVar.setEnabled(true);
                bvVar.e.setEnabled(true);
                break;
            case 22:
                org.telegram.ui.hw hwVar = (org.telegram.ui.hw) this.b;
                org.telegram.ui.dy.q1(hwVar.M, hwVar.L, 0.0f);
                break;
            case 23:
                org.telegram.ui.dy dyVar = (org.telegram.ui.dy) this.b;
                boolean z10 = dyVar.C0;
                dyVar.D0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    dyVar.A0.setVisibility(8);
                }
                View view = dyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.dy dyVar2 = ((org.telegram.ui.vx) this.b).A0;
                dyVar2.b3 = null;
                if (!dyVar2.f3) {
                    org.telegram.ui.cy[] cyVarArr = dyVar2.a0;
                    org.telegram.ui.cy cyVar = cyVarArr[0];
                    org.telegram.ui.cy cyVar2 = cyVarArr[1];
                    cyVarArr[0] = cyVar2;
                    cyVarArr[1] = cyVar;
                    dyVar2.v0.g(1.0f, cyVar2.h);
                    dyVar2.T4(false);
                    dyVar2.a0[0].d.getClass();
                    dyVar2.a0[1].d.getClass();
                }
                dyVar2.a0[1].setVisibility(8);
                org.telegram.ui.dy.f1(dyVar2, true);
                dyVar2.c3 = false;
                dyVar2.i3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.o2) dyVar2).actionBar;
                kVar2.setEnabled(true);
                dyVar2.v0.setEnabled(true);
                dyVar2.r3(dyVar2.a0[0]);
                break;
            case 25:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.yx) this.b).setScrollEnabled(true);
                break;
            case 26:
                a80 a80Var = (a80) this.b;
                FrameLayout frameLayout = a80Var.b;
                kh.h6 h6Var = (kh.h6) a80Var.c;
                if (h6Var.getParent() != null) {
                    frameLayout.removeView(h6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.sh) a80Var.d);
                break;
            case 27:
                org.telegram.ui.o50 o50Var = ((org.telegram.ui.o40) this.b).o;
                org.telegram.ui.o50 o50Var2 = org.telegram.ui.o50.z3;
                o50Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
                viewGroup.invalidate();
                o50Var.M.invalidate();
                if (o50Var.o0) {
                    o50Var.o0 = false;
                    o50Var.O0(true);
                    break;
                }
                break;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.c50 c50Var = (org.telegram.ui.c50) this.b;
                c50Var.G = null;
                org.telegram.ui.o50 o50Var3 = c50Var.L;
                o50Var3.M.invalidate();
                o50Var3.W1.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) o50Var3).containerView;
                viewGroup2.invalidate();
                org.telegram.ui.o50.I0(o50Var3);
                c50Var.H.clear();
                c50Var.I.clear();
                break;
            default:
                org.telegram.ui.p70 p70Var = (org.telegram.ui.p70) this.b;
                p70Var.d = null;
                p70Var.a = null;
                p70Var.b = false;
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
