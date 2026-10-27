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
import org.telegram.ui.kh1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i31 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i31(Object obj, int i10) {
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
                ((j31) this.b).setVisibility(8);
                break;
            case 1:
                di.h3 h3Var = ((a41) this.b).f;
                h3Var.setScaleX(1.0f);
                h3Var.setScaleY(1.0f);
                h3Var.invalidate();
                break;
            case 2:
                e41 e41Var = (e41) this.b;
                e41Var.L = 1.0f;
                e41Var.h.invalidate();
                break;
            case 3:
                ((q61) this.b).L = null;
                break;
            case 4:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 5:
                z71 z71Var = (z71) this.b;
                if (z71Var.a.getTag() == null) {
                    z71Var.a.setVisibility(4);
                    break;
                }
                break;
            case 6:
                super.onAnimationEnd(animator);
                a81 a81Var = (a81) this.b;
                a81Var.b = 0.0f;
                a81Var.setTranslationY(0.0f);
                a81Var.a = null;
                break;
            case 7:
                u91 u91Var = (u91) this.b;
                u91Var.J = false;
                u91Var.setEnabled(true);
                t91 t91Var = u91Var.y;
                if (t91Var != null) {
                    ((jg.i) t91Var).e0(1.0f);
                }
                u91Var.invalidate();
                break;
            case 8:
                ((na1) this.b).e0 = null;
                break;
            case 9:
                ((kc1) this.b).K = null;
                break;
            case 10:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.b).view.setEnabled(true);
                break;
            case 11:
                org.telegram.ui.Components.voip.t tVar = ((org.telegram.ui.Components.voip.o) this.b).s0;
                if (tVar.x0.getParent() != null) {
                    tVar.a.removeView(tVar.x0);
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
                kh1 kh1Var = (kh1) this.b;
                if (!kh1Var.a) {
                    kh1Var.V.v.S = true;
                    kh1Var.V.v.invalidate();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.b;
                r1Var.i = false;
                r1Var.l.setAlpha(35);
                r1Var.k.setAlpha(102);
                r1Var.j.setAlpha(35);
                r1Var.c();
                break;
            case 15:
                org.telegram.ui.Components.voip.v1 v1Var = ((org.telegram.ui.Components.voip.t1) this.b).c;
                v1Var.O = false;
                v1Var.requestLayout();
                break;
            case 16:
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
            case 17:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.b;
                w2Var.Q = w2Var.P ? 1.0f : 0.0f;
                w2Var.a(w2Var.R, w2Var.S);
                break;
            case 18:
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
            case 19:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.b;
                d3Var.J = false;
                d3Var.T.e = false;
                if (d3Var.U && (animatorSet = d3Var.Q) != null) {
                    animatorSet.cancel();
                    d3Var.Q.start();
                }
                d3Var.c();
                break;
            case 20:
                ((org.telegram.ui.Components.voip.l3) this.b).e.setVisibility(8);
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
                    bvVar.e.i(1.0f, bvVar.f[0].f);
                }
                bvVar.n = false;
                zuVar.c = false;
                zuVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.r2) bvVar).actionBar;
                kVar.setEnabled(true);
                bvVar.e.setEnabled(true);
                break;
            case 24:
                org.telegram.ui.ew ewVar = (org.telegram.ui.ew) this.b;
                org.telegram.ui.ey.r1(ewVar.M, ewVar.L, 0.0f);
                break;
            case 25:
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
            case 26:
                org.telegram.ui.ey eyVar2 = ((org.telegram.ui.wx) this.b).t0;
                eyVar2.g3 = null;
                if (!eyVar2.k3) {
                    org.telegram.ui.dy[] dyVarArr = eyVar2.e0;
                    org.telegram.ui.dy dyVar = dyVarArr[0];
                    org.telegram.ui.dy dyVar2 = dyVarArr[1];
                    dyVarArr[0] = dyVar2;
                    dyVarArr[1] = dyVar;
                    eyVar2.z0.g(1.0f, dyVar2.h);
                    eyVar2.b5(false);
                    eyVar2.e0[0].d.getClass();
                    eyVar2.e0[1].d.getClass();
                }
                eyVar2.e0[1].setVisibility(8);
                org.telegram.ui.ey.g1(eyVar2, true);
                eyVar2.h3 = false;
                eyVar2.n3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.r2) eyVar2).actionBar;
                kVar2.setEnabled(true);
                eyVar2.z0.setEnabled(true);
                eyVar2.z3(eyVar2.e0[0]);
                break;
            case 27:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.zx) this.b).setScrollEnabled(true);
                break;
            case 28:
                o90 o90Var = (o90) this.b;
                FrameLayout frameLayout = o90Var.b;
                fi.f6 f6Var = (fi.f6) o90Var.c;
                if (f6Var.getParent() != null) {
                    frameLayout.removeView(f6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.i7) o90Var.d);
                break;
            default:
                org.telegram.ui.x50 x50Var = ((org.telegram.ui.x40) this.b).o;
                org.telegram.ui.x50 x50Var2 = org.telegram.ui.x50.D3;
                x50Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
                viewGroup.invalidate();
                x50Var.Q.invalidate();
                if (x50Var.s0) {
                    x50Var.s0 = false;
                    x50Var.O0(true);
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
