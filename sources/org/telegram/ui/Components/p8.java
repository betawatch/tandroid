package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 9:
                ((wl) this.b).a.O = null;
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
                c9 c9Var = ((q8) this.b).b;
                c9Var.f = false;
                c9Var.e.setVisibility(8);
                break;
            case 1:
                h9 h9Var = (h9) this.b;
                if (h9Var.f != null) {
                    h9Var.e = 1.0f;
                    h9Var.n();
                    if (h9Var.g) {
                        h9Var.g = false;
                        Runnable runnable = h9Var.j;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    h9Var.f();
                }
                h9Var.f = null;
                break;
            case 2:
                ((qf) this.b).f.b0.setVisibility(8);
                break;
            case 3:
                ((tg) this.b).d0 = 1.0f;
                break;
            case 4:
                ((ci) this.b).c.s.setVisibility(8);
                break;
            case 5:
                ((ei) this.b).d.v.setVisibility(8);
                break;
            case 6:
                vi viVar = (vi) this.b;
                viVar.Z0 = null;
                if (!viVar.q1) {
                    if (viVar.X0.getTag() == null && viVar.Q0 == 0 && !viVar.T0) {
                        viVar.a1.setVisibility(4);
                    }
                    viVar.i1.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.w0 w0Var = viVar.e1;
                    if (w0Var != null) {
                        w0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 7:
                super.onAnimationEnd(animator);
                ok okVar = (ok) this.b;
                okVar.s.setVisibility(8);
                okVar.n = 0;
                dk dkVar = okVar.r;
                dkVar.setAlpha(1.0f);
                dkVar.setScaleX(1.0f);
                dkVar.setScaleY(1.0f);
                dkVar.setTranslationX(0.0f);
                dkVar.invalidate();
                break;
            case 8:
                nk nkVar = (nk) this.b;
                if (nkVar.X.H.getTag() == null) {
                    nkVar.X.H.setVisibility(4);
                }
                nkVar.X.I = null;
                break;
            case 9:
                wl wlVar = (wl) this.b;
                if (animator.equals(wlVar.a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wlVar.a;
                    chatAttachAlertPhotoLayout.c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    break;
                }
                break;
            case 10:
                pm pmVar = (pm) this.b;
                qm qmVar = pmVar.P;
                qmVar.J = null;
                qmVar.K = false;
                pmVar.invalidate();
                break;
            case 11:
                mp mpVar = (mp) this.b;
                ci.wb wbVar = mpVar.R;
                if (wbVar != null) {
                    if (wbVar.getParent() != null) {
                        ((ViewGroup) mpVar.R.getParent()).removeView(mpVar.R);
                    }
                    mpVar.R = null;
                }
                mpVar.T = null;
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
                mq mqVar = (mq) this.b;
                if (mqVar.K == mqVar.L) {
                    mqVar.G.setVisibility(4);
                }
                mqVar.y = null;
                break;
            case 15:
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
            case 16:
                ju juVar = (ju) this.b;
                juVar.O = false;
                juVar.d.setTranslationY(0.0f);
                juVar.d.setAlpha(0.0f);
                juVar.c(0.0f);
                juVar.R = 0.0f;
                juVar.j();
                break;
            case 17:
                ((ru) this.b).a.O = false;
                break;
            case 18:
                super.onAnimationEnd(animator);
                ((jv) this.b).d = null;
                break;
            case 19:
                ((kz) this.b).W = null;
                break;
            case 20:
                super.onAnimationEnd(animator);
                ((ty) this.b).n = null;
                break;
            case 21:
                ((i00) this.b).a();
                break;
            case 22:
                k00 k00Var = (k00) this.b;
                k00Var.U = k00Var.c0;
                k00Var.b0 = k00Var.f0;
                k00Var.V = k00Var.d0;
                k00Var.W = k00Var.e0;
                k00Var.c0 = -1;
                k00Var.d0 = -1;
                k00Var.e0 = -1;
                k00Var.f0 = -1;
                break;
            case 23:
                y00 y00Var = (y00) this.b;
                y00Var.s = 1.0f;
                y00Var.invalidate();
                break;
            case 24:
                n70 n70Var = (n70) this.b;
                l70 l70Var = n70Var.x;
                if (l70Var != null) {
                    l70Var.setProgress(1.0f);
                    n70Var.x.invalidate();
                }
                n70Var.m0 = null;
                break;
            case 25:
                l00 l00Var = (l00) this.b;
                ((w70) l00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) l00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            case 26:
                k80 k80Var = (k80) this.b;
                if (!k80Var.f) {
                    k80Var.c.setVisibility(8);
                    break;
                }
                break;
            case 27:
                r80 r80Var = (r80) this.b;
                FrameLayout frameLayout = r80Var.b;
                ci.s6 s6Var = (ci.s6) r80Var.c;
                if (s6Var.getParent() != null) {
                    frameLayout.removeView(s6Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Cells.fa) r80Var.d);
                break;
            case 28:
                pb0 pb0Var = (pb0) this.b;
                pb0Var.c0.h = null;
                pb0Var.e(pb0Var.S, pb0Var.R);
                break;
            default:
                NumberTextView numberTextView = (NumberTextView) this.b;
                numberTextView.d = null;
                numberTextView.b.clear();
                break;
        }
    }
}
