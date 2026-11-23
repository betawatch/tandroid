package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 14:
                ((zl) this.b).a.P = null;
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
                y yVar = (y) this.b;
                yVar.O = null;
                yVar.M = yVar.N;
                yVar.requestLayout();
                break;
            case 1:
                f6 f6Var = (f6) this.b;
                f6Var.d = null;
                f6Var.b.clear();
                break;
            case 2:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.S1 = null;
                animatedPhoneNumberEditText.Q1.clear();
                break;
            case 3:
                super.onAnimationEnd(animator);
                m6 m6Var = (m6) this.b;
                m6Var.b();
                m6Var.o = null;
                m6Var.j = 0.0f;
                m6Var.m = 0.0f;
                m6Var.l = 0.0f;
                m6Var.k = 0.0f;
                m6Var.r = 0.0f;
                m6Var.q = 0.0f;
                m6Var.invalidateSelf();
                Runnable runnable = m6Var.c0;
                if (runnable != null) {
                    runnable.run();
                }
                m6Var.t = null;
                CharSequence charSequence = m6Var.u;
                if (charSequence == null) {
                    ng ngVar = m6Var.J;
                    if (ngVar != null) {
                        ngVar.run();
                        break;
                    }
                } else {
                    m6Var.t(charSequence, true, m6Var.v);
                    m6Var.u = null;
                    m6Var.v = false;
                    break;
                }
                break;
            case 4:
                p9 p9Var = (p9) this.b;
                p9Var.setVisibility(8);
                p9Var.setImageDrawable(null);
                p9Var.setAlpha(1.0f);
                break;
            case 5:
                x8 x8Var = (x8) ((org.telegram.messenger.b9) this.b).n1;
                x8Var.f = false;
                x8Var.e.setVisibility(8);
                break;
            case 6:
                c9 c9Var = (c9) this.b;
                if (c9Var.f != null) {
                    c9Var.e = 1.0f;
                    c9Var.k();
                    if (c9Var.g) {
                        c9Var.g = false;
                        Runnable runnable2 = c9Var.j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    c9Var.d();
                }
                c9Var.f = null;
                break;
            case 7:
                ((kf) this.b).f.c0.setVisibility(8);
                break;
            case 8:
                ((tg) this.b).g0 = 1.0f;
                break;
            case 9:
                ((ti) ((xh) this.b).d).u1.setVisibility(8);
                break;
            case 10:
                ((ai) this.b).d.v1.setVisibility(8);
                break;
            case 11:
                ti tiVar = (ti) this.b;
                tiVar.X2 = null;
                if (!tiVar.o3) {
                    if (tiVar.V2.getTag() == null && tiVar.O2 == 0 && !tiVar.R2) {
                        tiVar.Y2.setVisibility(4);
                    }
                    tiVar.g3.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.q0 q0Var = tiVar.c3;
                    if (q0Var != null) {
                        q0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                kk kkVar = (kk) this.b;
                kkVar.s.setVisibility(8);
                kkVar.n = 0;
                zj zjVar = kkVar.r;
                zjVar.setAlpha(1.0f);
                zjVar.setScaleX(1.0f);
                zjVar.setScaleY(1.0f);
                zjVar.setTranslationX(0.0f);
                zjVar.invalidate();
                break;
            case 13:
                jk jkVar = (jk) this.b;
                if (jkVar.Y.I.getTag() == null) {
                    jkVar.Y.I.setVisibility(4);
                }
                jkVar.Y.J = null;
                break;
            case 14:
                zl zlVar = (zl) this.b;
                if (animator.equals(zlVar.a.P)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = zlVar.a;
                    chatAttachAlertPhotoLayout.d0 = true;
                    chatAttachAlertPhotoLayout.P = null;
                    break;
                }
                break;
            case 15:
                om omVar = (om) this.b;
                pm pmVar = omVar.Q;
                pmVar.K = null;
                pmVar.L = false;
                omVar.invalidate();
                break;
            case 16:
                mm mmVar = (mm) this.b;
                mmVar.b.R = true;
                mmVar.O.z.invalidate();
                break;
            case 17:
                kp kpVar = (kp) this.b;
                h01 h01Var = kpVar.L1;
                if (h01Var != null) {
                    if (h01Var.getParent() != null) {
                        ((ViewGroup) kpVar.L1.getParent()).removeView(kpVar.L1);
                    }
                    kpVar.L1 = null;
                }
                kpVar.N1 = null;
                super.onAnimationEnd(animator);
                break;
            case 18:
                h01 h01Var2 = (h01) this.b;
                h01Var2.c = null;
                h01Var2.a.setShader(null);
                h01Var2.n = null;
                h01Var2.r = null;
                h01Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(h01Var2);
                break;
            case 19:
                CheckBox checkBox = (CheckBox) this.b;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.y) {
                    checkBox.H = null;
                    break;
                }
                break;
            case 20:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.b;
                if (animator.equals(checkBoxBase.p)) {
                    checkBoxBase.p = null;
                }
                if (!checkBoxBase.q) {
                    checkBoxBase.C = null;
                    break;
                }
                break;
            case 21:
                pq pqVar = (pq) this.b;
                pqVar.l = 1.0f;
                pqVar.o = null;
                pqVar.p = null;
                pqVar.q = null;
                View view = pqVar.H;
                if (view != null) {
                    if (pqVar.h == 0 && pqVar.G) {
                        view.setVisibility(8);
                    }
                    pqVar.H.invalidate();
                }
                pqVar.c = -1;
                break;
            case 22:
                wt wtVar = (wt) this.b;
                wtVar.P = false;
                wtVar.d.setTranslationY(0.0f);
                wtVar.d.setAlpha(0.0f);
                wtVar.c(0.0f);
                wtVar.S = 0.0f;
                wtVar.j();
                break;
            case 23:
                ((du) this.b).a.J1 = false;
                break;
            case 24:
                super.onAnimationEnd(animator);
                ((uu) this.b).d = null;
                break;
            case 25:
                ((qy) this.b).a0 = null;
                break;
            case 26:
                super.onAnimationEnd(animator);
                ((yx) this.b).n = null;
                break;
            case 27:
                ((mz) this.b).a();
                break;
            case 28:
                c00 c00Var = (c00) this.b;
                c00Var.w = 1.0f;
                c00Var.invalidate();
                break;
            default:
                y40 y40Var = (y40) this.b;
                if (animator == y40Var.b0) {
                    y40Var.d(true);
                    y40Var.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
