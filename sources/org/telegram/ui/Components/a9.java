package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                ((sl) this.b).a.L = null;
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
                sl slVar = (sl) this.b;
                if (animator.equals(slVar.a.L)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = slVar.a;
                    chatAttachAlertPhotoLayout.W = true;
                    chatAttachAlertPhotoLayout.L = null;
                    break;
                }
                break;
            case 9:
                mm mmVar = (mm) this.b;
                nm nmVar = mmVar.M;
                nmVar.G = null;
                nmVar.H = false;
                mmVar.invalidate();
                break;
            case 10:
                jp jpVar = (jp) this.b;
                to toVar = jpVar.O;
                if (toVar != null) {
                    if (toVar.getParent() != null) {
                        ((ViewGroup) jpVar.O.getParent()).removeView(jpVar.O);
                    }
                    jpVar.O = null;
                }
                jpVar.Q = null;
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
                jq jqVar = (jq) this.b;
                if (jqVar.H == jqVar.I) {
                    jqVar.D.setVisibility(4);
                }
                jqVar.y = null;
                break;
            case 14:
                sq sqVar = (sq) this.b;
                sqVar.l = 1.0f;
                sqVar.o = null;
                sqVar.p = null;
                sqVar.q = null;
                View view = sqVar.H;
                if (view != null) {
                    if (sqVar.h == 0 && sqVar.G) {
                        view.setVisibility(8);
                    }
                    sqVar.H.invalidate();
                }
                sqVar.c = -1;
                break;
            case 15:
                cu cuVar = (cu) this.b;
                cuVar.L = false;
                cuVar.d.setTranslationY(0.0f);
                cuVar.d.setAlpha(0.0f);
                cuVar.c(0.0f);
                cuVar.O = 0.0f;
                cuVar.j();
                break;
            case 16:
                ((ku) this.b).a.L = false;
                break;
            case 17:
                super.onAnimationEnd(animator);
                ((cv) this.b).d = null;
                break;
            case 18:
                ((kz) this.b).T = null;
                break;
            case 19:
                super.onAnimationEnd(animator);
                ((sy) this.b).n = null;
                break;
            case 20:
                ((i00) this.b).a();
                break;
            case 21:
                k00 k00Var = (k00) this.b;
                k00Var.R = k00Var.W;
                k00Var.V = k00Var.c0;
                k00Var.S = k00Var.a0;
                k00Var.T = k00Var.b0;
                k00Var.W = -1;
                k00Var.a0 = -1;
                k00Var.b0 = -1;
                k00Var.c0 = -1;
                break;
            case 22:
                z00 z00Var = (z00) this.b;
                z00Var.s = 1.0f;
                z00Var.invalidate();
                break;
            case 23:
                p70 p70Var = (p70) this.b;
                n70 n70Var = p70Var.x;
                if (n70Var != null) {
                    n70Var.setProgress(1.0f);
                    p70Var.x.invalidate();
                }
                p70Var.m0 = null;
                break;
            case 24:
                l00 l00Var = (l00) this.b;
                ((z70) l00Var.e).B = false;
                TextView[] textViewArr = (TextView[]) l00Var.d;
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
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.aa) t80Var.d);
                break;
            case 27:
                rb0 rb0Var = (rb0) this.b;
                rb0Var.W.h = null;
                rb0Var.e(rb0Var.P, rb0Var.O);
                break;
            case 28:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            default:
                wd0 wd0Var = (wd0) this.b;
                wd0Var.setVisibility(8);
                wd0Var.h();
                wd0Var.M = 0.0f;
                wd0Var.f(0.0f);
                wd0Var.setAlpha(0.0f);
                break;
        }
    }
}
