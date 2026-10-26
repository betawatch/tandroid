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
import org.telegram.ui.ih1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class h31 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h31(Object obj, int i10) {
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
                ((i31) this.b).setVisibility(8);
                break;
            case 1:
                di.h3 h3Var = ((z31) this.b).f;
                h3Var.setScaleX(1.0f);
                h3Var.setScaleY(1.0f);
                h3Var.invalidate();
                break;
            case 2:
                d41 d41Var = (d41) this.b;
                d41Var.L = 1.0f;
                d41Var.h.invalidate();
                break;
            case 3:
                ((p61) this.b).L = null;
                break;
            case 4:
                UndoView undoView = (UndoView) this.b;
                undoView.setVisibility(4);
                undoView.setScaleX(1.0f);
                undoView.setScaleY(1.0f);
                undoView.setAlpha(1.0f);
                break;
            case 5:
                y71 y71Var = (y71) this.b;
                if (y71Var.a.getTag() == null) {
                    y71Var.a.setVisibility(4);
                    break;
                }
                break;
            case 6:
                super.onAnimationEnd(animator);
                z71 z71Var = (z71) this.b;
                z71Var.b = 0.0f;
                z71Var.setTranslationY(0.0f);
                z71Var.a = null;
                break;
            case 7:
                t91 t91Var = (t91) this.b;
                t91Var.J = false;
                t91Var.setEnabled(true);
                s91 s91Var = t91Var.y;
                if (s91Var != null) {
                    ((jg.i) s91Var).e0(1.0f);
                }
                t91Var.invalidate();
                break;
            case 8:
                ((ma1) this.b).e0 = null;
                break;
            case 9:
                ((fc1) this.b).K = null;
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
                ih1 ih1Var = (ih1) this.b;
                if (!ih1Var.a) {
                    ih1Var.V.v.S = true;
                    ih1Var.V.v.invalidate();
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
                org.telegram.ui.ut utVar = (org.telegram.ui.ut) this.b;
                if (animator.equals(utVar.n[0])) {
                    utVar.n[0] = null;
                    break;
                }
                break;
            case 23:
                org.telegram.ui.xu xuVar = (org.telegram.ui.xu) this.b;
                org.telegram.ui.zu zuVar = xuVar.n;
                org.telegram.ui.yu[] yuVarArr = zuVar.f;
                zuVar.h = null;
                if (zuVar.s) {
                    yuVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.yu yuVar = yuVarArr[0];
                    yuVarArr[0] = yuVarArr[1];
                    yuVarArr[1] = yuVar;
                    yuVar.setVisibility(8);
                    zuVar.w = zuVar.f[0].f == zuVar.e.getFirstTabId();
                    zuVar.e.i(1.0f, zuVar.f[0].f);
                }
                zuVar.n = false;
                xuVar.c = false;
                xuVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.r2) zuVar).actionBar;
                kVar.setEnabled(true);
                zuVar.e.setEnabled(true);
                break;
            case 24:
                org.telegram.ui.cw cwVar = (org.telegram.ui.cw) this.b;
                org.telegram.ui.cy.r1(cwVar.M, cwVar.L, 0.0f);
                break;
            case 25:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) this.b;
                boolean z10 = cyVar.G0;
                cyVar.H0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    cyVar.E0.setVisibility(8);
                }
                View view = cyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.cy cyVar2 = ((org.telegram.ui.tx) this.b).t0;
                cyVar2.g3 = null;
                if (!cyVar2.k3) {
                    org.telegram.ui.ay[] ayVarArr = cyVar2.e0;
                    org.telegram.ui.ay ayVar = ayVarArr[0];
                    org.telegram.ui.ay ayVar2 = ayVarArr[1];
                    ayVarArr[0] = ayVar2;
                    ayVarArr[1] = ayVar;
                    cyVar2.z0.g(1.0f, ayVar2.h);
                    cyVar2.b5(false);
                    cyVar2.e0[0].d.getClass();
                    cyVar2.e0[1].d.getClass();
                }
                cyVar2.e0[1].setVisibility(8);
                org.telegram.ui.cy.g1(cyVar2, true);
                cyVar2.h3 = false;
                cyVar2.n3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.r2) cyVar2).actionBar;
                kVar2.setEnabled(true);
                cyVar2.z0.setEnabled(true);
                cyVar2.z3(cyVar2.e0[0]);
                break;
            case 27:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.wx) this.b).setScrollEnabled(true);
                break;
            case 28:
                n90 n90Var = (n90) this.b;
                FrameLayout frameLayout = n90Var.b;
                fi.f6 f6Var = (fi.f6) n90Var.c;
                if (f6Var.getParent() != null) {
                    frameLayout.removeView(f6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.i7) n90Var.d);
                break;
            default:
                org.telegram.ui.v50 v50Var = ((org.telegram.ui.v40) this.b).o;
                org.telegram.ui.v50 v50Var2 = org.telegram.ui.v50.D3;
                v50Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
                viewGroup.invalidate();
                v50Var.Q.invalidate();
                if (v50Var.s0) {
                    v50Var.s0 = false;
                    v50Var.O0(true);
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
