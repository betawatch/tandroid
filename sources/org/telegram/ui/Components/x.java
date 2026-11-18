package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                    lg lgVar = m6Var.J;
                    if (lgVar != null) {
                        lgVar.run();
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
                q9 q9Var = (q9) this.b;
                q9Var.setVisibility(8);
                q9Var.setImageDrawable(null);
                q9Var.setAlpha(1.0f);
                break;
            case 5:
                y8 y8Var = (y8) ((org.telegram.messenger.b9) this.b).n1;
                y8Var.f = false;
                y8Var.e.setVisibility(8);
                break;
            case 6:
                d9 d9Var = (d9) this.b;
                if (d9Var.f != null) {
                    d9Var.e = 1.0f;
                    d9Var.k();
                    if (d9Var.g) {
                        d9Var.g = false;
                        Runnable runnable2 = d9Var.j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    d9Var.d();
                }
                d9Var.f = null;
                break;
            case 7:
                ((jf) this.b).f.c0.setVisibility(8);
                break;
            case 8:
                ((sg) this.b).g0 = 1.0f;
                break;
            case 9:
                ((si) ((wh) this.b).d).u1.setVisibility(8);
                break;
            case 10:
                ((zh) this.b).d.v1.setVisibility(8);
                break;
            case 11:
                si siVar = (si) this.b;
                siVar.X2 = null;
                if (!siVar.o3) {
                    if (siVar.V2.getTag() == null && siVar.O2 == 0 && !siVar.R2) {
                        siVar.Y2.setVisibility(4);
                    }
                    siVar.g3.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.r0 r0Var = siVar.c3;
                    if (r0Var != null) {
                        r0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                kk kkVar = (kk) this.b;
                kkVar.s.setVisibility(8);
                kkVar.n = 0;
                yj yjVar = kkVar.r;
                yjVar.setAlpha(1.0f);
                yjVar.setScaleX(1.0f);
                yjVar.setScaleY(1.0f);
                yjVar.setTranslationX(0.0f);
                yjVar.invalidate();
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
                lp lpVar = (lp) this.b;
                g01 g01Var = lpVar.L1;
                if (g01Var != null) {
                    if (g01Var.getParent() != null) {
                        ((ViewGroup) lpVar.L1.getParent()).removeView(lpVar.L1);
                    }
                    lpVar.L1 = null;
                }
                lpVar.N1 = null;
                super.onAnimationEnd(animator);
                break;
            case 18:
                g01 g01Var2 = (g01) this.b;
                g01Var2.c = null;
                g01Var2.a.setShader(null);
                g01Var2.n = null;
                g01Var2.r = null;
                g01Var2.setImageDrawable(null);
                org.telegram.messenger.g0.E2(g01Var2);
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
                qq qqVar = (qq) this.b;
                qqVar.l = 1.0f;
                qqVar.o = null;
                qqVar.p = null;
                qqVar.q = null;
                View view = qqVar.H;
                if (view != null) {
                    if (qqVar.h == 0 && qqVar.G) {
                        view.setVisibility(8);
                    }
                    qqVar.H.invalidate();
                }
                qqVar.c = -1;
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
                ((ry) this.b).a0 = null;
                break;
            case 26:
                super.onAnimationEnd(animator);
                ((zx) this.b).n = null;
                break;
            case 27:
                ((nz) this.b).a();
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
