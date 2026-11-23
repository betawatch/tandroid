package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i60 i60Var = ((h60) this.b).e;
                i60Var.f2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                i60Var.b.invalidate();
                break;
            case 1:
                x60 x60Var = (x60) this.b;
                x60Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t60 t60Var = x60Var.x;
                if (t60Var != null) {
                    t60Var.setProgress(floatValue);
                    break;
                }
                break;
            case 2:
                ((t60) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                s70 s70Var = (s70) this.b;
                s70Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s70Var.s = floatValue2;
                s70Var.d(floatValue2);
                break;
            case 4:
                oc0 oc0Var = ((ic0) this.b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oc0Var.b0 = floatValue3;
                oc0Var.h(floatValue3);
                break;
            case 5:
                bg0 bg0Var = (bg0) this.b;
                bg0Var.I.E = org.telegram.messenger.g0.T1(bg0Var.K, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 6:
                gi0 gi0Var = (gi0) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gi0Var.e.setAlpha(floatValue4);
                gi0Var.h.setAlpha(1.0f - floatValue4);
                break;
            case 7:
                xi0 xi0Var = (xi0) this.b;
                xi0Var.C0 = ((Float) xi0Var.z0.getAnimatedValue()).floatValue();
                ai.h0 h0Var = xi0Var.T;
                if (h0Var != null) {
                    h0Var.invalidate();
                }
                xi0Var.invalidate();
                break;
            case 8:
                mr mrVar = (mr) this.b;
                mrVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mrVar.setScaleX(floatValue5);
                mrVar.setScaleY(floatValue5);
                ((xi0) mrVar.c).T.invalidate();
                break;
            case 9:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 10:
                vi0 vi0Var = (vi0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi0Var.J = floatValue6;
                ui0 ui0Var = vi0Var.b;
                ui0Var.setScaleY(floatValue6 * (vi0Var.x ? 0.76f : 1.0f));
                ui0Var.setScaleX(vi0Var.J * (vi0Var.x ? 0.76f : 1.0f));
                break;
            case 11:
                mk0 mk0Var = (mk0) this.b;
                mk0Var.getClass();
                mk0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mk0Var.invalidateSelf();
                break;
            case 12:
                yk0 yk0Var = (yk0) this.b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yk0Var.r = floatValue7;
                yk0Var.E.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue7));
                yk0Var.E.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, yk0Var.r));
                yk0Var.E.setAlpha(yk0Var.r);
                yk0Var.s.invalidate();
                yk0Var.w.invalidate();
                break;
            case 13:
                gl0 gl0Var = (gl0) this.b;
                gl0Var.getClass();
                gl0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gl0Var.j();
                break;
            case 14:
                ((gl0) ((cl0) this.b).b).invalidate();
                break;
            case 15:
                kl0 kl0Var = (kl0) this.b;
                kl0Var.getClass();
                kl0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                em0 em0Var = (em0) this.b;
                em0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                em0Var.G = floatValue8;
                em0Var.setShown(floatValue8);
                em0Var.b(false);
                break;
            case 17:
                qn0 qn0Var = (qn0) this.b;
                qn0Var.getClass();
                qn0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qn0Var.invalidate();
                break;
            case 18:
                eo0 eo0Var = (eo0) this.b;
                zo0 zo0Var = eo0Var.b;
                zo0Var.q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zo0Var.n1.invalidate();
                eo0Var.invalidate();
                break;
            case 19:
                ((mt) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                it0 it0Var = (it0) this.b;
                it0Var.Z0(it0Var.getTabProgress());
                break;
            case 21:
                ((ds0) this.b).h.invalidate();
                break;
            case 22:
                tt0 tt0Var = (tt0) this.b;
                tt0Var.getClass();
                tt0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tt0Var.invalidate();
                break;
            case 23:
                ((kv0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                mv0 mv0Var = (mv0) this.b;
                mv0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mv0Var.a();
                break;
            case 25:
                qw0 qw0Var = (qw0) this.b;
                qw0Var.getClass();
                qw0Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qw0Var.invalidate();
                break;
            case 26:
                tw0 tw0Var = (tw0) this.b;
                tw0Var.getClass();
                tw0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tw0Var.a.invalidate();
                break;
            case 27:
                j01 j01Var = (j01) this.b;
                j01Var.getClass();
                j01Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j01Var.invalidate();
                break;
            case 28:
                z11 z11Var = (z11) this.b;
                z11Var.getClass();
                z11Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z11Var.p();
                break;
            default:
                u31 u31Var = (u31) this.b;
                u31Var.getClass();
                u31Var.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u31Var.invalidate();
                break;
        }
    }
}
