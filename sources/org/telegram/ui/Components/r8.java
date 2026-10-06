package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
                ((zl) this.b).a.O = null;
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
                ((tf) this.b).f.b0.setVisibility(8);
                break;
            case 3:
                ((wg) this.b).d0 = 1.0f;
                break;
            case 4:
                ((ai) this.b).c.s.setVisibility(8);
                break;
            case 5:
                ((di) this.b).d.v.setVisibility(8);
                break;
            case 6:
                xi xiVar = (xi) this.b;
                xiVar.Z0 = null;
                if (!xiVar.q1) {
                    if (xiVar.X0.getTag() == null && xiVar.Q0 == 0 && !xiVar.T0) {
                        xiVar.a1.setVisibility(4);
                    }
                    xiVar.i1.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.v0 v0Var = xiVar.e1;
                    if (v0Var != null) {
                        v0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 7:
                super.onAnimationEnd(animator);
                rk rkVar = (rk) this.b;
                rkVar.s.setVisibility(8);
                rkVar.n = 0;
                gk gkVar = rkVar.r;
                gkVar.setAlpha(1.0f);
                gkVar.setScaleX(1.0f);
                gkVar.setScaleY(1.0f);
                gkVar.setTranslationX(0.0f);
                gkVar.invalidate();
                break;
            case 8:
                qk qkVar = (qk) this.b;
                if (qkVar.X.H.getTag() == null) {
                    qkVar.X.H.setVisibility(4);
                }
                qkVar.X.I = null;
                break;
            case 9:
                zl zlVar = (zl) this.b;
                if (animator.equals(zlVar.a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = zlVar.a;
                    chatAttachAlertPhotoLayout.c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    break;
                }
                break;
            case 10:
                sm smVar = (sm) this.b;
                tm tmVar = smVar.P;
                tmVar.J = null;
                tmVar.K = false;
                smVar.invalidate();
                break;
            case 11:
                pp ppVar = (pp) this.b;
                ci.sb sbVar = ppVar.R;
                if (sbVar != null) {
                    if (sbVar.getParent() != null) {
                        ((ViewGroup) ppVar.R.getParent()).removeView(ppVar.R);
                    }
                    ppVar.R = null;
                }
                ppVar.T = null;
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
                pq pqVar = (pq) this.b;
                if (pqVar.K == pqVar.L) {
                    pqVar.G.setVisibility(4);
                }
                pqVar.y = null;
                break;
            case 15:
                yq yqVar = (yq) this.b;
                yqVar.l = 1.0f;
                yqVar.o = null;
                yqVar.p = null;
                yqVar.q = null;
                View view = yqVar.H;
                if (view != null) {
                    if (yqVar.h == 0 && yqVar.G) {
                        view.setVisibility(8);
                    }
                    yqVar.H.invalidate();
                }
                yqVar.c = -1;
                break;
            case 16:
                mu muVar = (mu) this.b;
                muVar.O = false;
                muVar.d.setTranslationY(0.0f);
                muVar.d.setAlpha(0.0f);
                muVar.c(0.0f);
                muVar.R = 0.0f;
                muVar.j();
                break;
            case 17:
                ((vu) this.b).a.O = false;
                break;
            case 18:
                super.onAnimationEnd(animator);
                ((nv) this.b).d = null;
                break;
            case 19:
                ((nz) this.b).W = null;
                break;
            case 20:
                super.onAnimationEnd(animator);
                ((wy) this.b).n = null;
                break;
            case 21:
                ((l00) this.b).a();
                break;
            case 22:
                n00 n00Var = (n00) this.b;
                n00Var.U = n00Var.c0;
                n00Var.b0 = n00Var.f0;
                n00Var.V = n00Var.d0;
                n00Var.W = n00Var.e0;
                n00Var.c0 = -1;
                n00Var.d0 = -1;
                n00Var.e0 = -1;
                n00Var.f0 = -1;
                break;
            case 23:
                b10 b10Var = (b10) this.b;
                b10Var.s = 1.0f;
                b10Var.invalidate();
                break;
            case 24:
                e60 e60Var = (e60) this.b;
                if (animator == e60Var.W) {
                    e60Var.c(true);
                    e60Var.setVisibility(4);
                    break;
                }
                break;
            case 25:
                b80 b80Var = (b80) this.b;
                z70 z70Var = b80Var.x;
                if (z70Var != null) {
                    z70Var.setProgress(1.0f);
                    b80Var.x.invalidate();
                }
                b80Var.m0 = null;
                break;
            case 26:
                o00 o00Var = (o00) this.b;
                ((k80) o00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) o00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 27:
                y80 y80Var = (y80) this.b;
                if (!y80Var.f) {
                    y80Var.c.setVisibility(8);
                    break;
                }
                break;
            case 28:
                f90 f90Var = (f90) this.b;
                FrameLayout frameLayout = f90Var.b;
                ci.r6 r6Var = (ci.r6) f90Var.c;
                if (r6Var.getParent() != null) {
                    frameLayout.removeView(r6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) f90Var.d);
                break;
            default:
                cc0 cc0Var = (cc0) this.b;
                cc0Var.c0.h = null;
                cc0Var.e(cc0Var.S, cc0Var.R);
                break;
        }
    }
}
