package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ((ul) this.b).a.L = null;
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
                mi miVar = (mi) this.b;
                miVar.W0 = null;
                if (!miVar.n1) {
                    if (miVar.U0.getTag() == null && miVar.N0 == 0 && !miVar.Q0) {
                        miVar.X0.setVisibility(4);
                    }
                    miVar.f1.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.w0 w0Var = miVar.b1;
                    if (w0Var != null) {
                        w0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 6:
                super.onAnimationEnd(animator);
                jk jkVar = (jk) this.b;
                jkVar.s.setVisibility(8);
                jkVar.n = 0;
                xj xjVar = jkVar.r;
                xjVar.setAlpha(1.0f);
                xjVar.setScaleX(1.0f);
                xjVar.setScaleY(1.0f);
                xjVar.setTranslationX(0.0f);
                xjVar.invalidate();
                break;
            case 7:
                ik ikVar = (ik) this.b;
                if (ikVar.U.E.getTag() == null) {
                    ikVar.U.E.setVisibility(4);
                }
                ikVar.U.F = null;
                break;
            case 8:
                ul ulVar = (ul) this.b;
                if (animator.equals(ulVar.a.L)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ulVar.a;
                    chatAttachAlertPhotoLayout.W = true;
                    chatAttachAlertPhotoLayout.L = null;
                    break;
                }
                break;
            case 9:
                om omVar = (om) this.b;
                pm pmVar = omVar.M;
                pmVar.G = null;
                pmVar.H = false;
                omVar.invalidate();
                break;
            case 10:
                mp mpVar = (mp) this.b;
                wo woVar = mpVar.O;
                if (woVar != null) {
                    if (woVar.getParent() != null) {
                        ((ViewGroup) mpVar.O.getParent()).removeView(mpVar.O);
                    }
                    mpVar.O = null;
                }
                mpVar.Q = null;
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
                mq mqVar = (mq) this.b;
                if (mqVar.H == mqVar.I) {
                    mqVar.D.setVisibility(4);
                }
                mqVar.y = null;
                break;
            case 14:
                vq vqVar = (vq) this.b;
                vqVar.l = 1.0f;
                vqVar.o = null;
                vqVar.p = null;
                vqVar.q = null;
                View view = vqVar.H;
                if (view != null) {
                    if (vqVar.h == 0 && vqVar.G) {
                        view.setVisibility(8);
                    }
                    vqVar.H.invalidate();
                }
                vqVar.c = -1;
                break;
            case 15:
                fu fuVar = (fu) this.b;
                fuVar.L = false;
                fuVar.d.setTranslationY(0.0f);
                fuVar.d.setAlpha(0.0f);
                fuVar.c(0.0f);
                fuVar.O = 0.0f;
                fuVar.j();
                break;
            case 16:
                ((nu) this.b).a.L = false;
                break;
            case 17:
                super.onAnimationEnd(animator);
                ((fv) this.b).d = null;
                break;
            case 18:
                ((mz) this.b).T = null;
                break;
            case 19:
                super.onAnimationEnd(animator);
                ((uy) this.b).n = null;
                break;
            case 20:
                ((j00) this.b).a();
                break;
            case 21:
                l00 l00Var = (l00) this.b;
                l00Var.R = l00Var.W;
                l00Var.V = l00Var.c0;
                l00Var.S = l00Var.a0;
                l00Var.T = l00Var.b0;
                l00Var.W = -1;
                l00Var.a0 = -1;
                l00Var.b0 = -1;
                l00Var.c0 = -1;
                break;
            case 22:
                z00 z00Var = (z00) this.b;
                z00Var.s = 1.0f;
                z00Var.invalidate();
                break;
            case 23:
                q70 q70Var = (q70) this.b;
                o70 o70Var = q70Var.x;
                if (o70Var != null) {
                    o70Var.setProgress(1.0f);
                    q70Var.x.invalidate();
                }
                q70Var.m0 = null;
                break;
            case 24:
                m00 m00Var = (m00) this.b;
                ((a80) m00Var.e).B = false;
                TextView[] textViewArr = (TextView[]) m00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 25:
                n80 n80Var = (n80) this.b;
                if (!n80Var.f) {
                    n80Var.c.setVisibility(8);
                    break;
                }
                break;
            case 26:
                u80 u80Var = (u80) this.b;
                FrameLayout frameLayout = u80Var.b;
                fg.i0 i0Var = (fg.i0) u80Var.c;
                if (i0Var.getParent() != null) {
                    frameLayout.removeView(i0Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.ba) u80Var.d);
                break;
            case 27:
                sb0 sb0Var = (sb0) this.b;
                sb0Var.W.h = null;
                sb0Var.e(sb0Var.P, sb0Var.O);
                break;
            case 28:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
            default:
                xd0 xd0Var = (xd0) this.b;
                xd0Var.setVisibility(8);
                xd0Var.h();
                xd0Var.M = 0.0f;
                xd0Var.f(0.0f);
                xd0Var.setAlpha(0.0f);
                break;
        }
    }
}
