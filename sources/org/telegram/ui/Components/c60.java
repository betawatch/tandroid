package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((i60) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                f70 f70Var = (f70) this.b;
                f70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f70Var.s = floatValue;
                f70Var.d(floatValue);
                break;
            case 2:
                ec0 ec0Var = ((yb0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ec0Var.a0 = floatValue2;
                ec0Var.h(floatValue2);
                break;
            case 3:
                nf0 nf0Var = (nf0) this.b;
                nf0Var.H.E = org.telegram.messenger.g0.T1(nf0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 4:
                rh0 rh0Var = (rh0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rh0Var.e.setAlpha(floatValue3);
                rh0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 5:
                ii0 ii0Var = (ii0) this.b;
                ii0Var.B0 = ((Float) ii0Var.y0.getAnimatedValue()).floatValue();
                bi.x5 x5Var = ii0Var.S;
                if (x5Var != null) {
                    x5Var.invalidate();
                }
                ii0Var.invalidate();
                break;
            case 6:
                yq yqVar = (yq) this.b;
                yqVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yqVar.setScaleX(floatValue4);
                yqVar.setScaleY(floatValue4);
                ((ii0) yqVar.c).S.invalidate();
                break;
            case 7:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 8:
                gi0 gi0Var = (gi0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gi0Var.I = floatValue5;
                fi0 fi0Var = gi0Var.b;
                fi0Var.setScaleY(floatValue5 * (gi0Var.x ? 0.76f : 1.0f));
                fi0Var.setScaleX(gi0Var.I * (gi0Var.x ? 0.76f : 1.0f));
                break;
            case 9:
                xj0 xj0Var = (xj0) this.b;
                xj0Var.getClass();
                xj0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xj0Var.invalidateSelf();
                break;
            case 10:
                jk0 jk0Var = (jk0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jk0Var.r = floatValue6;
                jk0Var.D.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue6));
                jk0Var.D.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, jk0Var.r));
                jk0Var.D.setAlpha(jk0Var.r);
                jk0Var.s.invalidate();
                jk0Var.w.invalidate();
                break;
            case 11:
                rk0 rk0Var = (rk0) this.b;
                rk0Var.getClass();
                rk0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rk0Var.j();
                break;
            case 12:
                ((rk0) ((nk0) this.b).b).invalidate();
                break;
            case 13:
                vk0 vk0Var = (vk0) this.b;
                vk0Var.getClass();
                vk0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                ql0 ql0Var = (ql0) this.b;
                ql0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ql0Var.F = floatValue7;
                ql0Var.setShown(floatValue7);
                ql0Var.b(false);
                break;
            case 15:
                cn0 cn0Var = (cn0) this.b;
                cn0Var.getClass();
                cn0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cn0Var.invalidate();
                break;
            case 16:
                rn0 rn0Var = (rn0) this.b;
                mo0 mo0Var = rn0Var.b;
                mo0Var.p2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mo0Var.m1.invalidate();
                rn0Var.invalidate();
                break;
            case 17:
                ((ys) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                ys0 ys0Var = (ys0) this.b;
                ys0Var.Z0(ys0Var.getTabProgress());
                break;
            case 19:
                ((tr0) this.b).h.invalidate();
                break;
            case 20:
                jt0 jt0Var = (jt0) this.b;
                jt0Var.getClass();
                jt0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jt0Var.invalidate();
                break;
            case 21:
                ((zu0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 22:
                bv0 bv0Var = (bv0) this.b;
                bv0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bv0Var.a();
                break;
            case 23:
                fw0 fw0Var = (fw0) this.b;
                fw0Var.getClass();
                fw0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fw0Var.invalidate();
                break;
            case 24:
                iw0 iw0Var = (iw0) this.b;
                iw0Var.getClass();
                iw0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iw0Var.a.invalidate();
                break;
            case 25:
                zz0 zz0Var = (zz0) this.b;
                zz0Var.getClass();
                zz0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zz0Var.invalidate();
                break;
            case 26:
                m11 m11Var = (m11) this.b;
                m11Var.getClass();
                m11Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m11Var.p();
                break;
            case 27:
                d31 d31Var = (d31) this.b;
                d31Var.getClass();
                d31Var.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d31Var.invalidate();
                break;
            case 28:
                s41 s41Var = (s41) this.b;
                s41Var.getClass();
                s41Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s41Var.invalidate();
                break;
            default:
                a51 a51Var = (a51) this.b;
                a51Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a51Var.b = floatValue8;
                a51Var.setTranslationY(floatValue8);
                break;
        }
    }
}
