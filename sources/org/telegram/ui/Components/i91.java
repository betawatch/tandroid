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
import org.telegram.ui.pi1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class i91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i91(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 26:
                ((org.telegram.ui.gf0) this.b).s = null;
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
                n91 n91Var = (n91) this.b;
                n91Var.J = false;
                n91Var.setEnabled(true);
                m91 m91Var = n91Var.y;
                if (m91Var != null) {
                    ((m2.t) m91Var).D(1.0f);
                }
                n91Var.invalidate();
                break;
            case 1:
                ((ha1) this.b).e0 = null;
                break;
            case 2:
                ((ja1) this.b).K = null;
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
                pi1 pi1Var = (pi1) this.b;
                if (!pi1Var.a) {
                    pi1Var.V.v.S = true;
                    pi1Var.V.v.invalidate();
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
                org.telegram.ui.fu fuVar = (org.telegram.ui.fu) this.b;
                if (animator.equals(fuVar.n[0])) {
                    fuVar.n[0] = null;
                    break;
                }
                break;
            case 16:
                org.telegram.ui.kv kvVar = (org.telegram.ui.kv) this.b;
                org.telegram.ui.mv mvVar = kvVar.n;
                org.telegram.ui.lv[] lvVarArr = mvVar.f;
                mvVar.h = null;
                if (mvVar.s) {
                    lvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.lv lvVar = lvVarArr[0];
                    lvVarArr[0] = lvVarArr[1];
                    lvVarArr[1] = lvVar;
                    lvVar.setVisibility(8);
                    mvVar.w = mvVar.f[0].f == mvVar.e.getFirstTabId();
                    mvVar.e.j(1.0f, mvVar.f[0].f);
                }
                mvVar.n = false;
                kvVar.c = false;
                kvVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
                kVar.setEnabled(true);
                mvVar.e.setEnabled(true);
                break;
            case 17:
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) this.b;
                org.telegram.ui.ty.n1(wwVar.M, wwVar.L, 0.0f);
                break;
            case 18:
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) this.b;
                boolean z10 = tyVar.G0;
                tyVar.H0 = z10 ? 1.0f : 0.0f;
                if (!z10) {
                    tyVar.E0.setVisibility(8);
                }
                View view = tyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ty tyVar2 = ((org.telegram.ui.my) this.b).E0;
                tyVar2.f3 = null;
                if (!tyVar2.j3) {
                    org.telegram.ui.sy[] syVarArr = tyVar2.e0;
                    org.telegram.ui.sy syVar = syVarArr[0];
                    org.telegram.ui.sy syVar2 = syVarArr[1];
                    syVarArr[0] = syVar2;
                    syVarArr[1] = syVar;
                    tyVar2.z0.g(1.0f, syVar2.h);
                    tyVar2.Q4(false);
                    tyVar2.e0[0].d.getClass();
                    tyVar2.e0[1].d.getClass();
                }
                tyVar2.e0[1].setVisibility(8);
                org.telegram.ui.ty.c1(tyVar2, true);
                tyVar2.g3 = false;
                tyVar2.m3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.n2) tyVar2).actionBar;
                kVar2.setEnabled(true);
                tyVar2.z0.setEnabled(true);
                tyVar2.o3(tyVar2.e0[0]);
                break;
            case 20:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.py) this.b).setScrollEnabled(true);
                break;
            case 21:
                t90 t90Var = (t90) this.b;
                FrameLayout frameLayout = t90Var.b;
                ci.r6 r6Var = (ci.r6) t90Var.c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ei) t90Var.d);
                break;
            case 22:
                org.telegram.ui.g60 g60Var = ((org.telegram.ui.g50) this.b).o;
                org.telegram.ui.g60 g60Var2 = org.telegram.ui.g60.D3;
                g60Var.c1();
                viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
                viewGroup.invalidate();
                g60Var.Q.invalidate();
                if (g60Var.s0) {
                    g60Var.s0 = false;
                    g60Var.P0(true);
                    break;
                }
                break;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) this.b;
                u50Var.G = null;
                org.telegram.ui.g60 g60Var3 = u50Var.L;
                g60Var3.Q.invalidate();
                g60Var3.a2.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) g60Var3).containerView;
                viewGroup2.invalidate();
                org.telegram.ui.g60.K0(g60Var3);
                u50Var.H.clear();
                u50Var.I.clear();
                break;
            case 24:
                org.telegram.ui.k80 k80Var = (org.telegram.ui.k80) this.b;
                k80Var.d = null;
                k80Var.a = null;
                k80Var.b = false;
                break;
            case 25:
                org.telegram.ui.hd0 hd0Var = (org.telegram.ui.hd0) this.b;
                hd0Var.H = false;
                hd0Var.n0();
                break;
            case 26:
                org.telegram.ui.gf0 gf0Var = (org.telegram.ui.gf0) this.b;
                if (gf0Var.s != null && gf0Var.n != null) {
                    gf0Var.r.setVisibility(4);
                    gf0Var.s = null;
                    break;
                }
                break;
            case 27:
                ((org.telegram.ui.lj0) this.b).T.setVisibility(8);
                break;
            case 28:
                org.telegram.ui.fk0 fk0Var = (org.telegram.ui.fk0) this.b;
                fk0Var.f = 1.0f;
                fk0Var.invalidate();
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
