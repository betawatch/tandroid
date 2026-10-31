package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 13:
                ((rl) this.b).a.O = null;
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
                x5 x5Var = (x5) this.b;
                x5Var.d = null;
                x5Var.b.clear();
                break;
            case 1:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.M1 = null;
                animatedPhoneNumberEditText.K1.clear();
                break;
            case 2:
                super.onAnimationEnd(animator);
                e6 e6Var = (e6) this.b;
                e6Var.b();
                e6Var.o = null;
                e6Var.j = 0.0f;
                e6Var.m = 0.0f;
                e6Var.l = 0.0f;
                e6Var.k = 0.0f;
                e6Var.r = 0.0f;
                e6Var.q = 0.0f;
                e6Var.invalidateSelf();
                Runnable runnable = e6Var.b0;
                if (runnable != null) {
                    runnable.run();
                }
                e6Var.t = null;
                CharSequence charSequence = e6Var.u;
                if (charSequence == null) {
                    tf tfVar = e6Var.I;
                    if (tfVar != null) {
                        tfVar.run();
                        break;
                    }
                } else {
                    e6Var.t(charSequence, true, e6Var.v);
                    e6Var.u = null;
                    e6Var.v = false;
                    break;
                }
                break;
            case 3:
                g9 g9Var = (g9) this.b;
                g9Var.setVisibility(8);
                g9Var.setImageDrawable(null);
                g9Var.setAlpha(1.0f);
                break;
            case 4:
                o8 o8Var = (o8) ((org.telegram.messenger.h9) this.b).j1;
                o8Var.f = false;
                o8Var.e.setVisibility(8);
                break;
            case 5:
                t8 t8Var = (t8) this.b;
                if (t8Var.f != null) {
                    t8Var.e = 1.0f;
                    t8Var.k();
                    if (t8Var.g) {
                        t8Var.g = false;
                        Runnable runnable2 = t8Var.j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    t8Var.d();
                }
                t8Var.f = null;
                break;
            case 6:
                ((ue) this.b).f.b0.setVisibility(8);
                break;
            case 7:
                ((zf) this.b).d0 = 1.0f;
                break;
            case 8:
                ((bi) ((eh) this.b).d).q1.setVisibility(8);
                break;
            case 9:
                ((hh) this.b).d.r1.setVisibility(8);
                break;
            case 10:
                bi biVar = (bi) this.b;
                biVar.T2 = null;
                if (!biVar.k3) {
                    if (biVar.R2.getTag() == null && biVar.K2 == 0 && !biVar.N2) {
                        biVar.U2.setVisibility(4);
                    }
                    biVar.c3.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.t0 t0Var = biVar.Y2;
                    if (t0Var != null) {
                        t0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                xj xjVar = (xj) this.b;
                xjVar.s.setVisibility(8);
                xjVar.n = 0;
                lj ljVar = xjVar.r;
                ljVar.setAlpha(1.0f);
                ljVar.setScaleX(1.0f);
                ljVar.setScaleY(1.0f);
                ljVar.setTranslationX(0.0f);
                ljVar.invalidate();
                break;
            case 12:
                wj wjVar = (wj) this.b;
                if (wjVar.X.H.getTag() == null) {
                    wjVar.X.H.setVisibility(4);
                }
                wjVar.X.I = null;
                break;
            case 13:
                rl rlVar = (rl) this.b;
                if (animator.equals(rlVar.a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = rlVar.a;
                    chatAttachAlertPhotoLayout.c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    break;
                }
                break;
            case 14:
                im imVar = (im) this.b;
                jm jmVar = imVar.P;
                jmVar.J = null;
                jmVar.K = false;
                imVar.invalidate();
                break;
            case 15:
                gm gmVar = (gm) this.b;
                gmVar.b.R = true;
                gmVar.O.z.invalidate();
                break;
            case 16:
                dp dpVar = (dp) this.b;
                b11 b11Var = dpVar.H1;
                if (b11Var != null) {
                    if (b11Var.getParent() != null) {
                        ((ViewGroup) dpVar.H1.getParent()).removeView(dpVar.H1);
                    }
                    dpVar.H1 = null;
                }
                dpVar.J1 = null;
                super.onAnimationEnd(animator);
                break;
            case 17:
                b11 b11Var2 = (b11) this.b;
                b11Var2.c = null;
                b11Var2.a.setShader(null);
                b11Var2.n = null;
                b11Var2.r = null;
                b11Var2.setImageDrawable(null);
                org.telegram.messenger.i0.E2(b11Var2);
                break;
            case 18:
                CheckBox checkBox = (CheckBox) this.b;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.y) {
                    checkBox.G = null;
                    break;
                }
                break;
            case 19:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                if (animator.equals(checkBoxBase.p)) {
                    checkBoxBase.p = null;
                }
                if (!checkBoxBase.q) {
                    checkBoxBase.C = null;
                    break;
                }
                break;
            case 20:
                kq kqVar = (kq) this.b;
                kqVar.l = 1.0f;
                kqVar.o = null;
                kqVar.p = null;
                kqVar.q = null;
                View view = kqVar.H;
                if (view != null) {
                    if (kqVar.h == 0 && kqVar.G) {
                        view.setVisibility(8);
                    }
                    kqVar.H.invalidate();
                }
                kqVar.c = -1;
                break;
            case 21:
                wt wtVar = (wt) this.b;
                wtVar.O = false;
                wtVar.d.setTranslationY(0.0f);
                wtVar.d.setAlpha(0.0f);
                wtVar.c(0.0f);
                wtVar.R = 0.0f;
                wtVar.j();
                break;
            case 22:
                ((du) this.b).a.F1 = false;
                break;
            case 23:
                super.onAnimationEnd(animator);
                ((vu) this.b).d = null;
                break;
            case 24:
                ((vy) this.b).W = null;
                break;
            case 25:
                super.onAnimationEnd(animator);
                ((ey) this.b).n = null;
                break;
            case 26:
                ((rz) this.b).a();
                break;
            case 27:
                tz tzVar = (tz) this.b;
                tzVar.U = tzVar.c0;
                tzVar.b0 = tzVar.f0;
                tzVar.V = tzVar.d0;
                tzVar.W = tzVar.e0;
                tzVar.c0 = -1;
                tzVar.d0 = -1;
                tzVar.e0 = -1;
                tzVar.f0 = -1;
                break;
            case 28:
                f00 f00Var = (f00) this.b;
                f00Var.w = 1.0f;
                f00Var.invalidate();
                break;
            default:
                d50 d50Var = (d50) this.b;
                if (animator == d50Var.W) {
                    d50Var.c(true);
                    d50Var.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
