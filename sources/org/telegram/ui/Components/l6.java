package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class l6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 12:
                ((jm) this.b).a.O = null;
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
                r6 r6Var = (r6) this.b;
                r6Var.b();
                r6Var.o = null;
                r6Var.j = 0.0f;
                r6Var.m = 0.0f;
                r6Var.l = 0.0f;
                r6Var.k = 0.0f;
                r6Var.r = 0.0f;
                r6Var.q = 0.0f;
                r6Var.invalidateSelf();
                Runnable runnable = r6Var.b0;
                if (runnable != null) {
                    runnable.run();
                }
                r6Var.t = null;
                CharSequence charSequence = r6Var.u;
                if (charSequence == null) {
                    qg qgVar = r6Var.I;
                    if (qgVar != null) {
                        qgVar.run();
                        break;
                    }
                } else {
                    r6Var.t(charSequence, true, r6Var.v);
                    r6Var.u = null;
                    r6Var.v = false;
                    break;
                }
                break;
            case 2:
                z9 z9Var = (z9) this.b;
                z9Var.setVisibility(8);
                z9Var.setImageDrawable(null);
                z9Var.setAlpha(1.0f);
                break;
            case 3:
                h9 h9Var = ((v8) this.b).b;
                h9Var.f = false;
                h9Var.e.setVisibility(8);
                break;
            case 4:
                m9 m9Var = (m9) this.b;
                if (m9Var.f != null) {
                    m9Var.e = 1.0f;
                    m9Var.n();
                    if (m9Var.g) {
                        m9Var.g = false;
                        Runnable runnable2 = m9Var.j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    m9Var.f();
                }
                m9Var.f = null;
                break;
            case 5:
                ((tf) this.b).f.b0.setVisibility(8);
                break;
            case 6:
                ((wg) this.b).d0 = 1.0f;
                break;
            case 7:
                ((vi) ((ci) this.b).d).s.setVisibility(8);
                break;
            case 8:
                ((ei) this.b).d.v.setVisibility(8);
                break;
            case 9:
                vi viVar = (vi) this.b;
                viVar.c1 = null;
                if (!viVar.t1) {
                    if (viVar.a1.getTag() == null && viVar.T0 == 0 && !viVar.W0) {
                        viVar.d1.setVisibility(4);
                    }
                    viVar.l1.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.u0 u0Var = viVar.h1;
                    if (u0Var != null) {
                        u0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 10:
                super.onAnimationEnd(animator);
                pk pkVar = (pk) this.b;
                pkVar.s.setVisibility(8);
                pkVar.n = 0;
                ek ekVar = pkVar.r;
                ekVar.setAlpha(1.0f);
                ekVar.setScaleX(1.0f);
                ekVar.setScaleY(1.0f);
                ekVar.setTranslationX(0.0f);
                ekVar.invalidate();
                break;
            case 11:
                ok okVar = (ok) this.b;
                if (okVar.X.H.getTag() == null) {
                    okVar.X.H.setVisibility(4);
                }
                okVar.X.I = null;
                break;
            case 12:
                jm jmVar = (jm) this.b;
                if (animator.equals(jmVar.a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = jmVar.a;
                    chatAttachAlertPhotoLayout.c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    break;
                }
                break;
            case 13:
                dn dnVar = (dn) this.b;
                en enVar = dnVar.P;
                enVar.J = null;
                enVar.K = false;
                dnVar.invalidate();
                break;
            case 14:
                zp zpVar = (zp) this.b;
                di.sb sbVar = zpVar.R;
                if (sbVar != null) {
                    if (sbVar.getParent() != null) {
                        ((ViewGroup) zpVar.R.getParent()).removeView(zpVar.R);
                    }
                    zpVar.R = null;
                }
                zpVar.T = null;
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
                zq zqVar = (zq) this.b;
                if (zqVar.K == zqVar.L) {
                    zqVar.G.setVisibility(4);
                }
                zqVar.y = null;
                break;
            case 18:
                ir irVar = (ir) this.b;
                irVar.l = 1.0f;
                irVar.o = null;
                irVar.p = null;
                irVar.q = null;
                View view = irVar.H;
                if (view != null) {
                    if (irVar.h == 0 && irVar.G) {
                        view.setVisibility(8);
                    }
                    irVar.H.invalidate();
                }
                irVar.c = -1;
                break;
            case 19:
                vu vuVar = (vu) this.b;
                vuVar.O = false;
                vuVar.d.setTranslationY(0.0f);
                vuVar.d.setAlpha(0.0f);
                vuVar.c(0.0f);
                vuVar.R = 0.0f;
                vuVar.j();
                break;
            case 20:
                ((dv) this.b).a.O = false;
                break;
            case 21:
                super.onAnimationEnd(animator);
                ((vv) this.b).d = null;
                break;
            case 22:
                ((wz) this.b).W = null;
                break;
            case 23:
                super.onAnimationEnd(animator);
                ((ez) this.b).n = null;
                break;
            case 24:
                ((u00) this.b).a();
                break;
            case 25:
                w00 w00Var = (w00) this.b;
                w00Var.U = w00Var.c0;
                w00Var.b0 = w00Var.f0;
                w00Var.V = w00Var.d0;
                w00Var.W = w00Var.e0;
                w00Var.c0 = -1;
                w00Var.d0 = -1;
                w00Var.e0 = -1;
                w00Var.f0 = -1;
                break;
            case 26:
                k10 k10Var = (k10) this.b;
                k10Var.s = 1.0f;
                k10Var.invalidate();
                break;
            case 27:
                o60 o60Var = (o60) this.b;
                if (animator == o60Var.W) {
                    o60Var.c(true);
                    o60Var.setVisibility(4);
                    break;
                }
                break;
            case 28:
                l80 l80Var = (l80) this.b;
                j80 j80Var = l80Var.x;
                if (j80Var != null) {
                    j80Var.setProgress(1.0f);
                    l80Var.x.invalidate();
                }
                l80Var.m0 = null;
                break;
            default:
                x00 x00Var = (x00) this.b;
                ((v80) x00Var.e).E = false;
                TextView[] textViewArr = (TextView[]) x00Var.d;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                break;
        }
    }
}
