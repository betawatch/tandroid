package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class r8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((yl) this.b).a.O = null;
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
                e9 e9Var = ((s8) this.b).b;
                e9Var.f = false;
                e9Var.e.setVisibility(8);
                break;
            case 1:
                j9 j9Var = (j9) this.b;
                if (j9Var.f != null) {
                    j9Var.e = 1.0f;
                    j9Var.n();
                    if (j9Var.g) {
                        j9Var.g = false;
                        Runnable runnable = j9Var.j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    j9Var.f();
                }
                j9Var.f = null;
                break;
            case 2:
                ((sf) this.b).f.b0.setVisibility(8);
                break;
            case 3:
                ((vg) this.b).d0 = 1.0f;
                break;
            case 4:
                ((di) this.b).c.s.setVisibility(8);
                break;
            case 5:
                ((fi) this.b).d.v.setVisibility(8);
                break;
            case 6:
                wi wiVar = (wi) this.b;
                wiVar.Z0 = null;
                if (!wiVar.q1) {
                    if (wiVar.X0.getTag() == null && wiVar.Q0 == 0 && !wiVar.T0) {
                        wiVar.a1.setVisibility(4);
                    }
                    wiVar.i1.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.u0 u0Var = wiVar.e1;
                    if (u0Var != null) {
                        u0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 7:
                super.onAnimationEnd(animator);
                qk qkVar = (qk) this.b;
                qkVar.s.setVisibility(8);
                qkVar.n = 0;
                fk fkVar = qkVar.r;
                fkVar.setAlpha(1.0f);
                fkVar.setScaleX(1.0f);
                fkVar.setScaleY(1.0f);
                fkVar.setTranslationX(0.0f);
                fkVar.invalidate();
                break;
            case 8:
                pk pkVar = (pk) this.b;
                if (pkVar.X.H.getTag() == null) {
                    pkVar.X.H.setVisibility(4);
                }
                pkVar.X.I = null;
                break;
            case 9:
                yl ylVar = (yl) this.b;
                if (animator.equals(ylVar.a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ylVar.a;
                    chatAttachAlertPhotoLayout.c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    break;
                }
                break;
            case 10:
                rm rmVar = (rm) this.b;
                sm smVar = rmVar.P;
                smVar.J = null;
                smVar.K = false;
                rmVar.invalidate();
                break;
            case 11:
                op opVar = (op) this.b;
                ci.tb tbVar = opVar.R;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) opVar.R.getParent()).removeView(opVar.R);
                    }
                    opVar.R = null;
                }
                opVar.T = null;
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
                oq oqVar = (oq) this.b;
                if (oqVar.K == oqVar.L) {
                    oqVar.G.setVisibility(4);
                }
                oqVar.y = null;
                break;
            case 15:
                xq xqVar = (xq) this.b;
                xqVar.l = 1.0f;
                xqVar.o = null;
                xqVar.p = null;
                xqVar.q = null;
                View view = xqVar.H;
                if (view != null) {
                    if (xqVar.h == 0 && xqVar.G) {
                        view.setVisibility(8);
                    }
                    xqVar.H.invalidate();
                }
                xqVar.c = -1;
                break;
            case 16:
                lu luVar = (lu) this.b;
                luVar.O = false;
                luVar.d.setTranslationY(0.0f);
                luVar.d.setAlpha(0.0f);
                luVar.c(0.0f);
                luVar.R = 0.0f;
                luVar.j();
                break;
            case 17:
                ((tu) this.b).a.O = false;
                break;
            case 18:
                super.onAnimationEnd(animator);
                ((mv) this.b).d = null;
                break;
            case 19:
                ((mz) this.b).W = null;
                break;
            case 20:
                super.onAnimationEnd(animator);
                ((vy) this.b).n = null;
                break;
            case 21:
                ((k00) this.b).a();
                break;
            case 22:
                m00 m00Var = (m00) this.b;
                m00Var.U = m00Var.c0;
                m00Var.b0 = m00Var.f0;
                m00Var.V = m00Var.d0;
                m00Var.W = m00Var.e0;
                m00Var.c0 = -1;
                m00Var.d0 = -1;
                m00Var.e0 = -1;
                m00Var.f0 = -1;
                break;
            case 23:
                a10 a10Var = (a10) this.b;
                a10Var.s = 1.0f;
                a10Var.invalidate();
                break;
            case 24:
                d60 d60Var = (d60) this.b;
                if (animator == d60Var.W) {
                    d60Var.c(true);
                    d60Var.setVisibility(4);
                    break;
                }
                break;
            case 25:
                a80 a80Var = (a80) this.b;
                y70 y70Var = a80Var.x;
                if (y70Var != null) {
                    y70Var.setProgress(1.0f);
                    a80Var.x.invalidate();
                }
                a80Var.m0 = null;
                break;
            case 26:
                n00 n00Var = (n00) this.b;
                ((j80) n00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) n00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 27:
                x80 x80Var = (x80) this.b;
                if (!x80Var.f) {
                    x80Var.c.setVisibility(8);
                    break;
                }
                break;
            case 28:
                e90 e90Var = (e90) this.b;
                FrameLayout frameLayout = e90Var.b;
                ci.r6 r6Var = (ci.r6) e90Var.c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) e90Var.d);
                break;
            default:
                bc0 bc0Var = (bc0) this.b;
                bc0Var.c0.h = null;
                bc0Var.e(bc0Var.S, bc0Var.R);
                break;
        }
    }
}
