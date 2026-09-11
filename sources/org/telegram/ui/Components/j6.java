package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class j6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 12:
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
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.n = null;
                animatedPhoneNumberEditText.f.clear();
                break;
            case 1:
                super.onAnimationEnd(animator);
                p6 p6Var = (p6) this.b;
                p6Var.c();
                p6Var.k = null;
                p6Var.h = 0.0f;
                p6Var.m = 0.0f;
                p6Var.invalidateSelf();
                Runnable runnable = p6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                p6Var.o = null;
                CharSequence charSequence = p6Var.p;
                if (charSequence == null) {
                    pg pgVar = p6Var.C;
                    if (pgVar != null) {
                        pgVar.run();
                        break;
                    }
                } else {
                    p6Var.q(charSequence, true, p6Var.q);
                    p6Var.p = null;
                    p6Var.q = false;
                    break;
                }
                break;
            case 2:
                x9 x9Var = (x9) this.b;
                x9Var.setVisibility(8);
                x9Var.setImageDrawable(null);
                x9Var.setAlpha(1.0f);
                break;
            case 3:
                f9 f9Var = ((t8) this.b).b;
                f9Var.f = false;
                f9Var.e.setVisibility(8);
                break;
            case 4:
                k9 k9Var = (k9) this.b;
                if (k9Var.f != null) {
                    k9Var.e = 1.0f;
                    k9Var.n();
                    if (k9Var.g) {
                        k9Var.g = false;
                        Runnable runnable2 = k9Var.j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    k9Var.f();
                }
                k9Var.f = null;
                break;
            case 5:
                ((sf) this.b).f.b0.setVisibility(8);
                break;
            case 6:
                ((vg) this.b).d0 = 1.0f;
                break;
            case 7:
                ((ci) this.b).c.s.setVisibility(8);
                break;
            case 8:
                ((ei) this.b).d.v.setVisibility(8);
                break;
            case 9:
                vi viVar = (vi) this.b;
                viVar.Z0 = null;
                if (!viVar.q1) {
                    if (viVar.X0.getTag() == null && viVar.Q0 == 0 && !viVar.T0) {
                        viVar.a1.setVisibility(4);
                    }
                    viVar.i1.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.v0 v0Var = viVar.e1;
                    if (v0Var != null) {
                        v0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 10:
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
            case 11:
                nk nkVar = (nk) this.b;
                if (nkVar.X.H.getTag() == null) {
                    nkVar.X.H.setVisibility(4);
                }
                nkVar.X.I = null;
                break;
            case 12:
                wl wlVar = (wl) this.b;
                if (animator.equals(wlVar.a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wlVar.a;
                    chatAttachAlertPhotoLayout.c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    break;
                }
                break;
            case 13:
                pm pmVar = (pm) this.b;
                qm qmVar = pmVar.P;
                qmVar.J = null;
                qmVar.K = false;
                pmVar.invalidate();
                break;
            case 14:
                lp lpVar = (lp) this.b;
                di.xb xbVar = lpVar.R;
                if (xbVar != null) {
                    if (xbVar.getParent() != null) {
                        ((ViewGroup) lpVar.R.getParent()).removeView(lpVar.R);
                    }
                    lpVar.R = null;
                }
                lpVar.T = null;
                super.onAnimationEnd(animator);
                break;
            case 15:
                CheckBox checkBox = (CheckBox) this.b;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.x) {
                    checkBox.G = null;
                    break;
                }
                break;
            case 16:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                if (animator.equals(checkBoxBase.p)) {
                    checkBoxBase.p = null;
                }
                if (!checkBoxBase.q) {
                    checkBoxBase.C = null;
                    break;
                }
                break;
            case 17:
                lq lqVar = (lq) this.b;
                if (lqVar.K == lqVar.L) {
                    lqVar.G.setVisibility(4);
                }
                lqVar.y = null;
                break;
            case 18:
                uq uqVar = (uq) this.b;
                uqVar.l = 1.0f;
                uqVar.o = null;
                uqVar.p = null;
                uqVar.q = null;
                View view = uqVar.H;
                if (view != null) {
                    if (uqVar.h == 0 && uqVar.G) {
                        view.setVisibility(8);
                    }
                    uqVar.H.invalidate();
                }
                uqVar.c = -1;
                break;
            case 19:
                hu huVar = (hu) this.b;
                huVar.O = false;
                huVar.d.setTranslationY(0.0f);
                huVar.d.setAlpha(0.0f);
                huVar.c(0.0f);
                huVar.R = 0.0f;
                huVar.j();
                break;
            case 20:
                ((pu) this.b).a.O = false;
                break;
            case 21:
                super.onAnimationEnd(animator);
                ((iv) this.b).d = null;
                break;
            case 22:
                ((kz) this.b).W = null;
                break;
            case 23:
                super.onAnimationEnd(animator);
                ((ty) this.b).n = null;
                break;
            case 24:
                ((i00) this.b).a();
                break;
            case 25:
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
            case 26:
                y00 y00Var = (y00) this.b;
                y00Var.s = 1.0f;
                y00Var.invalidate();
                break;
            case 27:
                n70 n70Var = (n70) this.b;
                l70 l70Var = n70Var.x;
                if (l70Var != null) {
                    l70Var.setProgress(1.0f);
                    n70Var.x.invalidate();
                }
                n70Var.m0 = null;
                break;
            case 28:
                l00 l00Var = (l00) this.b;
                ((w70) l00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) l00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
            default:
                k80 k80Var = (k80) this.b;
                if (!k80Var.f) {
                    k80Var.c.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
