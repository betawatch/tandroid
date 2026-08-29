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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p11 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet animatorSet;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ((q11) this.b).setVisibility(8);
                break;
            case 1:
                lh.z2 z2Var = ((h21) this.b).f;
                z2Var.setScaleX(1.0f);
                z2Var.setScaleY(1.0f);
                z2Var.invalidate();
                break;
            case 2:
                l21 l21Var = (l21) this.b;
                l21Var.G = 1.0f;
                l21Var.h.invalidate();
                break;
            case 3:
                ((s41) this.b).H = null;
                break;
            case 4:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 5:
                c61 c61Var = (c61) this.b;
                if (c61Var.a.getTag() == null) {
                    c61Var.a.setVisibility(4);
                    break;
                }
                break;
            case 6:
                super.onAnimationEnd(animator);
                d61 d61Var = (d61) this.b;
                d61Var.b = 0.0f;
                d61Var.setTranslationY(0.0f);
                d61Var.a = null;
                break;
            case 7:
                y71 y71Var = (y71) this.b;
                y71Var.F = false;
                y71Var.setEnabled(true);
                x71 x71Var = y71Var.y;
                if (x71Var != null) {
                    ((n) x71Var).j(1.0f);
                }
                y71Var.invalidate();
                break;
            case 8:
                ((s81) this.b).a0 = null;
                break;
            case 9:
                ((u81) this.b).G = null;
                break;
            case 10:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.b).view.setEnabled(true);
                break;
            case 11:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.b).o0;
                if (uVar.t0.getParent() != null) {
                    uVar.a.removeView(uVar.t0);
                    break;
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    break;
                }
                break;
            case 13:
                hh1 hh1Var = (hh1) this.b;
                if (!hh1Var.a) {
                    hh1Var.R.v.O = true;
                    hh1Var.R.v.invalidate();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.b;
                o1Var.i = false;
                o1Var.l.setAlpha(35);
                o1Var.k.setAlpha(102);
                o1Var.j.setAlpha(35);
                o1Var.c();
                break;
            case 15:
                org.telegram.ui.Components.voip.t1 t1Var = ((org.telegram.ui.Components.voip.r1) this.b).c;
                t1Var.K = false;
                t1Var.requestLayout();
                break;
            case 16:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.b;
                u2Var.J = 0.0f;
                u2Var.K = 0.0f;
                org.telegram.ui.Components.voip.t2 t2Var = u2Var.d;
                t2Var.setScaleX(u2Var.P);
                t2Var.setScaleY(u2Var.P);
                TextureView textureView = u2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(u2Var.Q);
                    textureView.setScaleY(u2Var.Q);
                }
                u2Var.setTranslationY(0.0f);
                u2Var.setTranslationX(0.0f);
                u2Var.S = u2Var.R;
                u2Var.U = null;
                break;
            case 17:
                org.telegram.ui.Components.voip.x2 x2Var = (org.telegram.ui.Components.voip.x2) this.b;
                x2Var.M = x2Var.L ? 1.0f : 0.0f;
                x2Var.a(x2Var.N, x2Var.O);
                break;
            case 18:
                ((org.telegram.ui.Components.voip.y2) this.b).c.unlock();
                AndroidUtilities.unlockOrientation(((org.telegram.ui.Components.voip.y2) this.b).a);
                if (((org.telegram.ui.Components.voip.y2) this.b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.y2) this.b).a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.y2) this.b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.y2) this.b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.voip.e3 e3Var = (org.telegram.ui.Components.voip.e3) this.b;
                e3Var.F = false;
                e3Var.P.e = false;
                if (e3Var.Q && (animatorSet = e3Var.M) != null) {
                    animatorSet.cancel();
                    e3Var.M.start();
                }
                e3Var.c();
                break;
            case 20:
                ((org.telegram.ui.Components.voip.m3) this.b).e.setVisibility(8);
                break;
            case 21:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 22:
                org.telegram.ui.wt wtVar = (org.telegram.ui.wt) this.b;
                if (animator.equals(wtVar.n[0])) {
                    wtVar.n[0] = null;
                    break;
                }
                break;
            case 23:
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
                lVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
                lVar.setEnabled(true);
                cvVar.e.setEnabled(true);
                break;
            case 24:
                org.telegram.ui.jw jwVar = (org.telegram.ui.jw) this.b;
                org.telegram.ui.fy.q1(jwVar.M, jwVar.L, 0.0f);
                break;
            case 25:
                org.telegram.ui.fy fyVar = (org.telegram.ui.fy) this.b;
                boolean z10 = fyVar.C0;
                fyVar.D0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    fyVar.A0.setVisibility(8);
                }
                View view = fyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.fy fyVar2 = ((org.telegram.ui.xx) this.b).A0;
                fyVar2.b3 = null;
                if (!fyVar2.f3) {
                    org.telegram.ui.ey[] eyVarArr = fyVar2.a0;
                    org.telegram.ui.ey eyVar = eyVarArr[0];
                    org.telegram.ui.ey eyVar2 = eyVarArr[1];
                    eyVarArr[0] = eyVar2;
                    eyVarArr[1] = eyVar;
                    fyVar2.v0.g(1.0f, eyVar2.h);
                    fyVar2.T4(false);
                    fyVar2.a0[0].d.getClass();
                    fyVar2.a0[1].d.getClass();
                }
                fyVar2.a0[1].setVisibility(8);
                org.telegram.ui.fy.f1(fyVar2, true);
                fyVar2.c3 = false;
                fyVar2.i3 = false;
                lVar2 = ((org.telegram.ui.ActionBar.o2) fyVar2).actionBar;
                lVar2.setEnabled(true);
                fyVar2.v0.setEnabled(true);
                fyVar2.r3(fyVar2.a0[0]);
                break;
            case 27:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.ay) this.b).setScrollEnabled(true);
                break;
            case 28:
                n80 n80Var = (n80) this.b;
                FrameLayout frameLayout = n80Var.b;
                cg.i0 i0Var = (cg.i0) n80Var.c;
                if (i0Var.getParent() != null) {
                    frameLayout.removeView(i0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.vh) n80Var.d);
                break;
            default:
                org.telegram.ui.r50 r50Var = ((org.telegram.ui.r40) this.b).o;
                org.telegram.ui.r50 r50Var2 = org.telegram.ui.r50.z3;
                r50Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
                viewGroup.invalidate();
                r50Var.M.invalidate();
                if (r50Var.o0) {
                    r50Var.o0 = false;
                    r50Var.O0(true);
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
