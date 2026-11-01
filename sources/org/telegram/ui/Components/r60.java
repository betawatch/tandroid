package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((x60) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                y70 y70Var = (y70) this.b;
                y70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y70Var.s = floatValue;
                y70Var.d(floatValue);
                break;
            case 2:
                zc0 zc0Var = ((sc0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zc0Var.a0 = floatValue2;
                zc0Var.h(floatValue2);
                break;
            case 3:
                ((jf0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                qg0 qg0Var = (qg0) this.b;
                qg0Var.H.E = org.telegram.messenger.i0.T1(qg0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 5:
                wi0 wi0Var = (wi0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wi0Var.e.setAlpha(floatValue3);
                wi0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 6:
                nj0 nj0Var = (nj0) this.b;
                nj0Var.B0 = ((Float) nj0Var.y0.getAnimatedValue()).floatValue();
                fg.i iVar = nj0Var.S;
                if (iVar != null) {
                    iVar.invalidate();
                }
                nj0Var.invalidate();
                break;
            case 7:
                ir irVar = (ir) this.b;
                irVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                irVar.setScaleX(floatValue4);
                irVar.setScaleY(floatValue4);
                ((nj0) irVar.c).S.invalidate();
                break;
            case 8:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 9:
                lj0 lj0Var = (lj0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lj0Var.I = floatValue5;
                kj0 kj0Var = lj0Var.b;
                kj0Var.setScaleY(floatValue5 * (lj0Var.x ? 0.76f : 1.0f));
                kj0Var.setScaleX(lj0Var.I * (lj0Var.x ? 0.76f : 1.0f));
                break;
            case 10:
                cl0 cl0Var = (cl0) this.b;
                cl0Var.getClass();
                cl0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cl0Var.invalidateSelf();
                break;
            case 11:
                ol0 ol0Var = (ol0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ol0Var.r = floatValue6;
                ol0Var.D.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, floatValue6));
                ol0Var.D.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, ol0Var.r));
                ol0Var.D.setAlpha(ol0Var.r);
                ol0Var.s.invalidate();
                ol0Var.w.invalidate();
                break;
            case 12:
                vl0 vl0Var = (vl0) this.b;
                vl0Var.getClass();
                vl0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vl0Var.j();
                break;
            case 13:
                ((vl0) ((sl0) this.b).b).invalidate();
                break;
            case 14:
                zl0 zl0Var = (zl0) this.b;
                zl0Var.getClass();
                zl0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                sm0 sm0Var = (sm0) this.b;
                sm0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm0Var.F = floatValue7;
                sm0Var.setShown(floatValue7);
                sm0Var.b(false);
                break;
            case 16:
                eo0 eo0Var = (eo0) this.b;
                eo0Var.getClass();
                eo0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eo0Var.invalidate();
                break;
            case 17:
                to0 to0Var = (to0) this.b;
                pp0 pp0Var = to0Var.b;
                pp0Var.m2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pp0Var.j1.invalidate();
                to0Var.invalidate();
                break;
            case 18:
                ((mt) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                au0 au0Var = (au0) this.b;
                au0Var.V0(au0Var.getTabProgress());
                break;
            case 20:
                ((ts0) this.b).h.invalidate();
                break;
            case 21:
                mu0 mu0Var = (mu0) this.b;
                mu0Var.getClass();
                mu0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu0Var.invalidate();
                break;
            case 22:
                ((cw0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                ew0 ew0Var = (ew0) this.b;
                ew0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ew0Var.a();
                break;
            case 24:
                kx0 kx0Var = (kx0) this.b;
                kx0Var.getClass();
                kx0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kx0Var.invalidate();
                break;
            case 25:
                nx0 nx0Var = (nx0) this.b;
                nx0Var.getClass();
                nx0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nx0Var.a.invalidate();
                break;
            case 26:
                f11 f11Var = (f11) this.b;
                f11Var.getClass();
                f11Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f11Var.invalidate();
                break;
            case 27:
                u11 u11Var = (u11) this.b;
                u11Var.getClass();
                u11Var.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 28:
                p21 p21Var = (p21) this.b;
                p21Var.getClass();
                p21Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p21Var.p();
                break;
            default:
                h41 h41Var = (h41) this.b;
                h41Var.getClass();
                h41Var.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h41Var.invalidate();
                break;
        }
    }
}
