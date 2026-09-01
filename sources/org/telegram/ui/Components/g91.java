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
import org.telegram.ui.vh1;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class g91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g91(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 24:
                ((org.telegram.ui.af0) this.b).s = null;
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
                ((i91) this.b).H = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((TransitionValues) this.b).view.setEnabled(true);
                break;
            case 2:
                org.telegram.ui.Components.voip.u uVar = ((org.telegram.ui.Components.voip.p) this.b).p0;
                if (uVar.u0.getParent() != null) {
                    uVar.a.removeView(uVar.u0);
                    break;
                }
                break;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.b;
                if (v0Var.getParent() != null) {
                    ((ViewGroup) v0Var.getParent()).removeView(v0Var);
                    break;
                }
                break;
            case 4:
                vh1 vh1Var = (vh1) this.b;
                if (!vh1Var.a) {
                    vh1Var.S.v.P = true;
                    vh1Var.S.v.invalidate();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.voip.o1 o1Var = (org.telegram.ui.Components.voip.o1) this.b;
                o1Var.i = false;
                o1Var.l.setAlpha(35);
                o1Var.k.setAlpha(102);
                o1Var.j.setAlpha(35);
                o1Var.c();
                break;
            case 6:
                org.telegram.ui.Components.voip.t1 t1Var = ((org.telegram.ui.Components.voip.r1) this.b).c;
                t1Var.L = false;
                t1Var.requestLayout();
                break;
            case 7:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.b;
                t2Var.K = 0.0f;
                t2Var.L = 0.0f;
                org.telegram.ui.Components.voip.s2 s2Var = t2Var.d;
                s2Var.setScaleX(t2Var.Q);
                s2Var.setScaleY(t2Var.Q);
                TextureView textureView = t2Var.e;
                if (textureView != null) {
                    textureView.setScaleX(t2Var.R);
                    textureView.setScaleY(t2Var.R);
                }
                t2Var.setTranslationY(0.0f);
                t2Var.setTranslationX(0.0f);
                t2Var.T = t2Var.S;
                t2Var.V = null;
                break;
            case 8:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.b;
                w2Var.N = w2Var.M ? 1.0f : 0.0f;
                w2Var.a(w2Var.O, w2Var.P);
                break;
            case 9:
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
            case 10:
                org.telegram.ui.Components.voip.d3 d3Var = (org.telegram.ui.Components.voip.d3) this.b;
                d3Var.G = false;
                d3Var.Q.e = false;
                if (d3Var.R && (animatorSet = d3Var.N) != null) {
                    animatorSet.cancel();
                    d3Var.N.start();
                }
                d3Var.c();
                break;
            case 11:
                ((org.telegram.ui.Components.voip.l3) this.b).e.setVisibility(8);
                break;
            case 12:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 13:
                org.telegram.ui.fu fuVar = (org.telegram.ui.fu) this.b;
                if (animator.equals(fuVar.n[0])) {
                    fuVar.n[0] = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.jv jvVar = (org.telegram.ui.jv) this.b;
                org.telegram.ui.lv lvVar = jvVar.n;
                org.telegram.ui.kv[] kvVarArr = lvVar.f;
                lvVar.h = null;
                if (lvVar.s) {
                    kvVarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.kv kvVar = kvVarArr[0];
                    kvVarArr[0] = kvVarArr[1];
                    kvVarArr[1] = kvVar;
                    kvVar.setVisibility(8);
                    lvVar.w = lvVar.f[0].f == lvVar.e.getFirstTabId();
                    lvVar.e.j(1.0f, lvVar.f[0].f);
                }
                lvVar.n = false;
                jvVar.c = false;
                jvVar.b = false;
                kVar = ((org.telegram.ui.ActionBar.p2) lvVar).actionBar;
                kVar.setEnabled(true);
                lvVar.e.setEnabled(true);
                break;
            case 15:
                org.telegram.ui.tw twVar = (org.telegram.ui.tw) this.b;
                org.telegram.ui.py.q1(twVar.M, twVar.L, 0.0f);
                break;
            case 16:
                org.telegram.ui.py pyVar = (org.telegram.ui.py) this.b;
                boolean z4 = pyVar.D0;
                pyVar.E0 = z4 ? 1.0f : 0.0f;
                if (!z4) {
                    pyVar.B0.setVisibility(8);
                }
                View view = pyVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.py pyVar2 = ((org.telegram.ui.iy) this.b).B0;
                pyVar2.c3 = null;
                if (!pyVar2.g3) {
                    org.telegram.ui.oy[] oyVarArr = pyVar2.b0;
                    org.telegram.ui.oy oyVar = oyVarArr[0];
                    org.telegram.ui.oy oyVar2 = oyVarArr[1];
                    oyVarArr[0] = oyVar2;
                    oyVarArr[1] = oyVar;
                    pyVar2.w0.g(1.0f, oyVar2.h);
                    pyVar2.T4(false);
                    pyVar2.b0[0].d.getClass();
                    pyVar2.b0[1].d.getClass();
                }
                pyVar2.b0[1].setVisibility(8);
                org.telegram.ui.py.f1(pyVar2, true);
                pyVar2.d3 = false;
                pyVar2.j3 = false;
                kVar2 = ((org.telegram.ui.ActionBar.p2) pyVar2).actionBar;
                kVar2.setEnabled(true);
                pyVar2.w0.setEnabled(true);
                pyVar2.r3(pyVar2.b0[0]);
                break;
            case 18:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.ly) this.b).setScrollEnabled(true);
                break;
            case 19:
                u80 u80Var = (u80) this.b;
                FrameLayout frameLayout = u80Var.b;
                fg.i0 i0Var = (fg.i0) u80Var.c;
                if (i0Var.getParent() != null) {
                    frameLayout.removeView(i0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.ai) u80Var.d);
                break;
            case 20:
                org.telegram.ui.d60 d60Var = ((org.telegram.ui.e50) this.b).o;
                org.telegram.ui.d60 d60Var2 = org.telegram.ui.d60.A3;
                d60Var.b1();
                viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
                viewGroup.invalidate();
                d60Var.N.invalidate();
                if (d60Var.p0) {
                    d60Var.p0 = false;
                    d60Var.O0(true);
                    break;
                }
                break;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.r50 r50Var = (org.telegram.ui.r50) this.b;
                r50Var.G = null;
                org.telegram.ui.d60 d60Var3 = r50Var.L;
                d60Var3.N.invalidate();
                d60Var3.X1.invalidate();
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) d60Var3).containerView;
                viewGroup2.invalidate();
                org.telegram.ui.d60.J0(d60Var3);
                r50Var.H.clear();
                r50Var.I.clear();
                break;
            case 22:
                org.telegram.ui.c80 c80Var = (org.telegram.ui.c80) this.b;
                c80Var.d = null;
                c80Var.a = null;
                c80Var.b = false;
                break;
            case 23:
                org.telegram.ui.bd0 bd0Var = (org.telegram.ui.bd0) this.b;
                bd0Var.E = false;
                bd0Var.o0();
                break;
            case 24:
                org.telegram.ui.af0 af0Var = (org.telegram.ui.af0) this.b;
                if (af0Var.s != null && af0Var.n != null) {
                    af0Var.r.setVisibility(4);
                    af0Var.s = null;
                    break;
                }
                break;
            case 25:
                ((org.telegram.ui.bj0) this.b).Q.setVisibility(8);
                break;
            case 26:
                org.telegram.ui.wj0 wj0Var = (org.telegram.ui.wj0) this.b;
                wj0Var.f = 1.0f;
                wj0Var.invalidate();
                break;
            case 27:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.b;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    break;
                }
                break;
            case 28:
                org.telegram.ui.ip0 ip0Var = (org.telegram.ui.ip0) this.b;
                org.telegram.ui.kc kcVar = ip0Var.L;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) ip0Var.L.getParent()).removeView(ip0Var.L);
                    }
                    ip0Var.L = null;
                }
                ip0Var.N = null;
                super.onAnimationEnd(animator);
                break;
            default:
                org.telegram.ui.jq0 jq0Var = (org.telegram.ui.jq0) this.b;
                org.telegram.ui.mq0 mq0Var = jq0Var.A0;
                org.telegram.ui.kq0[] kq0VarArr = mq0Var.n;
                mq0Var.r = null;
                if (mq0Var.w) {
                    kq0VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.kq0 kq0Var = kq0VarArr[0];
                    kq0VarArr[0] = kq0VarArr[1];
                    kq0VarArr[1] = kq0Var;
                    kq0Var.setVisibility(8);
                    mq0Var.e = mq0Var.n[0].e == mq0Var.h.getFirstTabId();
                    mq0Var.h.j(1.0f, mq0Var.n[0].e);
                }
                mq0Var.s = false;
                jq0Var.v0 = false;
                jq0Var.u0 = false;
                kVar3 = ((org.telegram.ui.ActionBar.p2) mq0Var).actionBar;
                kVar3.setEnabled(true);
                mq0Var.h.setEnabled(true);
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
