package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class t8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((nm) this.b).a.O = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g9 g9Var = ((u8) this.b).b;
                g9Var.f = false;
                g9Var.e.setVisibility(8);
                break;
            case 1:
                l9 l9Var = (l9) this.b;
                if (l9Var.f != null) {
                    l9Var.e = 1.0f;
                    l9Var.n();
                    if (l9Var.g) {
                        l9Var.g = false;
                        Runnable runnable = l9Var.j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    l9Var.f();
                }
                l9Var.f = null;
                break;
            case 2:
                ((uf) this.b).f.b0.setVisibility(8);
                break;
            case 3:
                ((xg) this.b).d0 = 1.0f;
                break;
            case 4:
                ((yi) ((fi) this.b).d).s.setVisibility(8);
                break;
            case 5:
                ((hi) this.b).d.v.setVisibility(8);
                break;
            case 6:
                yi yiVar = (yi) this.b;
                yiVar.c1 = null;
                if (!yiVar.t1) {
                    if (yiVar.a1.getTag() == null && yiVar.T0 == 0 && !yiVar.W0) {
                        yiVar.d1.setVisibility(4);
                    }
                    yiVar.l1.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.v0 v0Var = yiVar.h1;
                    if (v0Var != null) {
                        v0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 7:
                super.onAnimationEnd(animator);
                sk skVar = (sk) this.b;
                skVar.s.setVisibility(8);
                skVar.n = 0;
                hk hkVar = skVar.r;
                hkVar.setAlpha(1.0f);
                hkVar.setScaleX(1.0f);
                hkVar.setScaleY(1.0f);
                hkVar.setTranslationX(0.0f);
                hkVar.invalidate();
                break;
            case 8:
                rk rkVar = (rk) this.b;
                if (rkVar.X.H.getTag() == null) {
                    rkVar.X.H.setVisibility(4);
                }
                rkVar.X.I = null;
                break;
            case 9:
                nm nmVar = (nm) this.b;
                if (animator.equals(nmVar.a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nmVar.a;
                    chatAttachAlertPhotoLayout.c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    break;
                }
                break;
            case 10:
                gn gnVar = (gn) this.b;
                hn hnVar = gnVar.P;
                hnVar.J = null;
                hnVar.K = false;
                gnVar.invalidate();
                break;
            case 11:
                cq cqVar = (cq) this.b;
                ci.tb tbVar = cqVar.R;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) cqVar.R.getParent()).removeView(cqVar.R);
                    }
                    cqVar.R = null;
                }
                cqVar.T = null;
                super.onAnimationEnd(animator);
                break;
            case 12:
                CheckBox checkBox = (CheckBox) this.b;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.x) {
                    checkBox.G = null;
                    break;
                }
                break;
            case 13:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                if (animator.equals(checkBoxBase.p)) {
                    checkBoxBase.p = null;
                }
                if (!checkBoxBase.q) {
                    checkBoxBase.C = null;
                    break;
                }
                break;
            case 14:
                cr crVar = (cr) this.b;
                if (crVar.K == crVar.L) {
                    crVar.G.setVisibility(4);
                }
                crVar.y = null;
                break;
            case 15:
                lr lrVar = (lr) this.b;
                lrVar.l = 1.0f;
                lrVar.o = null;
                lrVar.p = null;
                lrVar.q = null;
                View view = lrVar.H;
                if (view != null) {
                    if (lrVar.h == 0 && lrVar.G) {
                        view.setVisibility(8);
                    }
                    lrVar.H.invalidate();
                }
                lrVar.c = -1;
                break;
            case 16:
                zu zuVar = (zu) this.b;
                zuVar.O = false;
                zuVar.d.setTranslationY(0.0f);
                zuVar.d.setAlpha(0.0f);
                zuVar.c(0.0f);
                zuVar.R = 0.0f;
                zuVar.j();
                break;
            case 17:
                ((hv) this.b).a.O = false;
                break;
            case 18:
                super.onAnimationEnd(animator);
                ((zv) this.b).d = null;
                break;
            case 19:
                ((a00) this.b).W = null;
                break;
            case 20:
                super.onAnimationEnd(animator);
                ((iz) this.b).n = null;
                break;
            case 21:
                ((y00) this.b).a();
                break;
            case 22:
                a10 a10Var = (a10) this.b;
                a10Var.U = a10Var.c0;
                a10Var.b0 = a10Var.f0;
                a10Var.V = a10Var.d0;
                a10Var.W = a10Var.e0;
                a10Var.c0 = -1;
                a10Var.d0 = -1;
                a10Var.e0 = -1;
                a10Var.f0 = -1;
                break;
            case 23:
                o10 o10Var = (o10) this.b;
                o10Var.s = 1.0f;
                o10Var.invalidate();
                break;
            case 24:
                s60 s60Var = (s60) this.b;
                if (animator == s60Var.W) {
                    s60Var.c(true);
                    s60Var.setVisibility(4);
                    break;
                }
                break;
            case 25:
                p80 p80Var = (p80) this.b;
                n80 n80Var = p80Var.x;
                if (n80Var != null) {
                    n80Var.setProgress(1.0f);
                    p80Var.x.invalidate();
                }
                p80Var.m0 = null;
                break;
            case 26:
                b10 b10Var = (b10) this.b;
                ((y80) b10Var.e).E = false;
                TextView[] textViewArr = (TextView[]) b10Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 27:
                m90 m90Var = (m90) this.b;
                if (!m90Var.f) {
                    m90Var.c.setVisibility(8);
                    break;
                }
                break;
            case 28:
                t90 t90Var = (t90) this.b;
                FrameLayout frameLayout = t90Var.b;
                ci.r6 r6Var = (ci.r6) t90Var.c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.da) t90Var.d);
                break;
            default:
                pc0 pc0Var = (pc0) this.b;
                pc0Var.c0.h = null;
                pc0Var.e(pc0Var.S, pc0Var.R);
                break;
        }
    }
}
