package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class a9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 8:
                ((tl) this.b).a.L = null;
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
                c9 c9Var = (c9) this.b;
                if (c9Var.f != null) {
                    c9Var.e = 1.0f;
                    c9Var.n();
                    if (c9Var.g) {
                        c9Var.g = false;
                        Runnable runnable = c9Var.j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    c9Var.f();
                }
                c9Var.f = null;
                break;
            case 1:
                ((hf) this.b).f.V.setVisibility(8);
                break;
            case 2:
                ((lg) this.b).a0 = 1.0f;
                break;
            case 3:
                ((sh) this.b).c.s.setVisibility(8);
                break;
            case 4:
                ((uh) this.b).d.v.setVisibility(8);
                break;
            case 5:
                li liVar = (li) this.b;
                liVar.W0 = null;
                if (!liVar.n1) {
                    if (liVar.U0.getTag() == null && liVar.N0 == 0 && !liVar.Q0) {
                        liVar.X0.setVisibility(4);
                    }
                    liVar.f1.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.w0 w0Var = liVar.b1;
                    if (w0Var != null) {
                        w0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 6:
                super.onAnimationEnd(animator);
                hk hkVar = (hk) this.b;
                hkVar.s.setVisibility(8);
                hkVar.n = 0;
                vj vjVar = hkVar.r;
                vjVar.setAlpha(1.0f);
                vjVar.setScaleX(1.0f);
                vjVar.setScaleY(1.0f);
                vjVar.setTranslationX(0.0f);
                vjVar.invalidate();
                break;
            case 7:
                gk gkVar = (gk) this.b;
                if (gkVar.U.E.getTag() == null) {
                    gkVar.U.E.setVisibility(4);
                }
                gkVar.U.F = null;
                break;
            case 8:
                tl tlVar = (tl) this.b;
                if (animator.equals(tlVar.a.L)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tlVar.a;
                    chatAttachAlertPhotoLayout.W = true;
                    chatAttachAlertPhotoLayout.L = null;
                    break;
                }
                break;
            case 9:
                nm nmVar = (nm) this.b;
                om omVar = nmVar.M;
                omVar.G = null;
                omVar.H = false;
                nmVar.invalidate();
                break;
            case 10:
                kp kpVar = (kp) this.b;
                uo uoVar = kpVar.O;
                if (uoVar != null) {
                    if (uoVar.getParent() != null) {
                        ((ViewGroup) kpVar.O.getParent()).removeView(kpVar.O);
                    }
                    kpVar.O = null;
                }
                kpVar.Q = null;
                super.onAnimationEnd(animator);
                break;
            case 11:
                CheckBox checkBox = (CheckBox) this.b;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.x) {
                    checkBox.D = null;
                    break;
                }
                break;
            case 12:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                if (animator.equals(checkBoxBase.p)) {
                    checkBoxBase.p = null;
                }
                if (!checkBoxBase.q) {
                    checkBoxBase.C = null;
                    break;
                }
                break;
            case 13:
                kq kqVar = (kq) this.b;
                if (kqVar.H == kqVar.I) {
                    kqVar.D.setVisibility(4);
                }
                kqVar.y = null;
                break;
            case 14:
                tq tqVar = (tq) this.b;
                tqVar.l = 1.0f;
                tqVar.o = null;
                tqVar.p = null;
                tqVar.q = null;
                View view = tqVar.H;
                if (view != null) {
                    if (tqVar.h == 0 && tqVar.G) {
                        view.setVisibility(8);
                    }
                    tqVar.H.invalidate();
                }
                tqVar.c = -1;
                break;
            case 15:
                du duVar = (du) this.b;
                duVar.L = false;
                duVar.d.setTranslationY(0.0f);
                duVar.d.setAlpha(0.0f);
                duVar.c(0.0f);
                duVar.O = 0.0f;
                duVar.j();
                break;
            case 16:
                ((lu) this.b).a.L = false;
                break;
            case 17:
                super.onAnimationEnd(animator);
                ((dv) this.b).d = null;
                break;
            case 18:
                ((kz) this.b).T = null;
                break;
            case 19:
                super.onAnimationEnd(animator);
                ((sy) this.b).n = null;
                break;
            case 20:
                ((h00) this.b).a();
                break;
            case 21:
                j00 j00Var = (j00) this.b;
                j00Var.R = j00Var.W;
                j00Var.V = j00Var.c0;
                j00Var.S = j00Var.a0;
                j00Var.T = j00Var.b0;
                j00Var.W = -1;
                j00Var.a0 = -1;
                j00Var.b0 = -1;
                j00Var.c0 = -1;
                break;
            case 22:
                y00 y00Var = (y00) this.b;
                y00Var.s = 1.0f;
                y00Var.invalidate();
                break;
            case 23:
                o70 o70Var = (o70) this.b;
                m70 m70Var = o70Var.x;
                if (m70Var != null) {
                    m70Var.setProgress(1.0f);
                    o70Var.x.invalidate();
                }
                o70Var.m0 = null;
                break;
            case 24:
                k00 k00Var = (k00) this.b;
                ((y70) k00Var.e).B = false;
                TextView[] textViewArr = (TextView[]) k00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 25:
                m80 m80Var = (m80) this.b;
                if (!m80Var.f) {
                    m80Var.c.setVisibility(8);
                    break;
                }
                break;
            case 26:
                t80 t80Var = (t80) this.b;
                FrameLayout frameLayout = t80Var.b;
                eg.i0 i0Var = (eg.i0) t80Var.c;
                if (i0Var.getParent() != null) {
                    frameLayout.removeView(i0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ba) t80Var.d);
                break;
            case 27:
                qb0 qb0Var = (qb0) this.b;
                qb0Var.W.h = null;
                qb0Var.e(qb0Var.P, qb0Var.O);
                break;
            case 28:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            default:
                vd0 vd0Var = (vd0) this.b;
                vd0Var.setVisibility(8);
                vd0Var.h();
                vd0Var.M = 0.0f;
                vd0Var.f(0.0f);
                vd0Var.setAlpha(0.0f);
                break;
        }
    }
}
