package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i70 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((m70) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                m80 m80Var = (m80) this.b;
                m80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m80Var.s = floatValue;
                m80Var.d(floatValue);
                break;
            case 2:
                vd0 vd0Var = ((pd0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vd0Var.M = floatValue2;
                vd0Var.f(floatValue2);
                break;
            case 3:
                ((lg0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                ph0 ph0Var = (ph0) this.b;
                ph0Var.E.E = AndroidUtilities.lerp(ph0Var.G, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 5:
                yj0 yj0Var = (yj0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yj0Var.e.setAlpha(floatValue3);
                yj0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 6:
                pk0 pk0Var = (pk0) this.b;
                pk0Var.y0 = ((Float) pk0Var.v0.getAnimatedValue()).floatValue();
                ah.d dVar = pk0Var.P;
                if (dVar != null) {
                    dVar.invalidate();
                }
                pk0Var.invalidate();
                break;
            case 7:
                pr prVar = (pr) this.b;
                prVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                prVar.setScaleX(floatValue4);
                prVar.setScaleY(floatValue4);
                ((pk0) prVar.c).P.invalidate();
                break;
            case 8:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 9:
                nk0 nk0Var = (nk0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nk0Var.F = floatValue5;
                mk0 mk0Var = nk0Var.b;
                mk0Var.setScaleY(floatValue5 * (nk0Var.w ? 0.76f : 1.0f));
                mk0Var.setScaleX(nk0Var.F * (nk0Var.w ? 0.76f : 1.0f));
                break;
            case 10:
                yl0 yl0Var = (yl0) this.b;
                yl0Var.getClass();
                yl0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yl0Var.invalidateSelf();
                break;
            case 11:
                im0 im0Var = (im0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                im0Var.r = floatValue6;
                im0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                im0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, im0Var.r));
                im0Var.y.setAlpha(im0Var.r);
                im0Var.s.invalidate();
                im0Var.v.invalidate();
                break;
            case 12:
                pm0 pm0Var = (pm0) this.b;
                pm0Var.getClass();
                pm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pm0Var.j();
                break;
            case 13:
                ((pm0) ((mm0) this.b).b).invalidate();
                break;
            case 14:
                um0 um0Var = (um0) this.b;
                um0Var.getClass();
                um0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                on0 on0Var = (on0) this.b;
                on0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on0Var.C = floatValue7;
                on0Var.setShown(floatValue7);
                on0Var.b(false);
                break;
            case 16:
                ap0 ap0Var = (ap0) this.b;
                ap0Var.getClass();
                ap0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ap0Var.invalidate();
                break;
            case 17:
                op0 op0Var = (op0) this.b;
                lq0 lq0Var = op0Var.b;
                lq0Var.r0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lq0Var.c.invalidate();
                op0Var.invalidate();
                break;
            case 18:
                ((vt) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                yu0 yu0Var = (yu0) this.b;
                yu0Var.M0(yu0Var.getTabProgress());
                break;
            case 20:
                ((qt0) this.b).h.invalidate();
                break;
            case 21:
                fv0 fv0Var = (fv0) this.b;
                fv0Var.getClass();
                fv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fv0Var.invalidate();
                break;
            case 22:
                qv0 qv0Var = (qv0) ((androidx.activity.g) this.b).c;
                qv0Var.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qv0Var.N();
                break;
            case 23:
                ((xw0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                zw0 zw0Var = (zw0) this.b;
                zw0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zw0Var.a();
                break;
            case 25:
                fy0 fy0Var = (fy0) this.b;
                fy0Var.getClass();
                fy0Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fy0Var.invalidate();
                break;
            case 26:
                iy0 iy0Var = (iy0) this.b;
                iy0Var.getClass();
                iy0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iy0Var.a.invalidate();
                break;
            case 27:
                w11 w11Var = (w11) this.b;
                w11Var.getClass();
                w11Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w11Var.invalidate();
                break;
            case 28:
                w21 w21Var = (w21) this.b;
                w21Var.getClass();
                w21Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w21Var.n();
                break;
            default:
                p41 p41Var = (p41) this.b;
                p41Var.getClass();
                p41Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p41Var.invalidate();
                break;
        }
    }
}
