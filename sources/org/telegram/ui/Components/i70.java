package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                l80 l80Var = (l80) this.b;
                l80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l80Var.s = floatValue;
                l80Var.d(floatValue);
                break;
            case 2:
                sd0 sd0Var = ((nd0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sd0Var.P = floatValue2;
                sd0Var.f(floatValue2);
                break;
            case 3:
                ((eg0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                jh0 jh0Var = (jh0) this.b;
                jh0Var.H.E = AndroidUtilities.lerp(jh0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 5:
                qj0 qj0Var = (qj0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qj0Var.e.setAlpha(floatValue3);
                qj0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 6:
                gk0 gk0Var = (gk0) this.b;
                gk0Var.B0 = ((Float) gk0Var.y0.getAnimatedValue()).floatValue();
                ci.m6 m6Var = gk0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                gk0Var.invalidate();
                break;
            case 7:
                tr trVar = (tr) this.b;
                trVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                trVar.setScaleX(floatValue4);
                trVar.setScaleY(floatValue4);
                ((gk0) trVar.c).S.invalidate();
                break;
            case 8:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 9:
                ek0 ek0Var = (ek0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ek0Var.I = floatValue5;
                dk0 dk0Var = ek0Var.b;
                dk0Var.setScaleY(floatValue5 * (ek0Var.w ? 0.76f : 1.0f));
                dk0Var.setScaleX(ek0Var.I * (ek0Var.w ? 0.76f : 1.0f));
                break;
            case 10:
                rl0 rl0Var = (rl0) this.b;
                rl0Var.getClass();
                rl0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rl0Var.invalidateSelf();
                break;
            case 11:
                bm0 bm0Var = (bm0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bm0Var.r = floatValue6;
                bm0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                bm0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, bm0Var.r));
                bm0Var.y.setAlpha(bm0Var.r);
                bm0Var.s.invalidate();
                bm0Var.v.invalidate();
                break;
            case 12:
                jm0 jm0Var = (jm0) this.b;
                jm0Var.getClass();
                jm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jm0Var.j();
                break;
            case 13:
                ((jm0) ((fm0) this.b).b).invalidate();
                break;
            case 14:
                nm0 nm0Var = (nm0) this.b;
                nm0Var.getClass();
                nm0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                in0 in0Var = (in0) this.b;
                in0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                in0Var.F = floatValue7;
                in0Var.setShown(floatValue7);
                in0Var.b(false);
                break;
            case 16:
                wo0 wo0Var = (wo0) this.b;
                wo0Var.getClass();
                wo0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wo0Var.invalidate();
                break;
            case 17:
                lp0 lp0Var = (lp0) this.b;
                hq0 hq0Var = lp0Var.b;
                hq0Var.u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hq0Var.c.invalidate();
                lp0Var.invalidate();
                break;
            case 18:
                ((cu) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                yu0 yu0Var = (yu0) this.b;
                yu0Var.M0(yu0Var.getTabProgress());
                break;
            case 20:
                ((rt0) this.b).h.invalidate();
                break;
            case 21:
                fv0 fv0Var = (fv0) this.b;
                fv0Var.getClass();
                fv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fv0Var.invalidate();
                break;
            case 22:
                pv0 pv0Var = (pv0) ((androidx.activity.g) this.b).c;
                pv0Var.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pv0Var.N();
                break;
            case 23:
                ((vw0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                xw0 xw0Var = (xw0) this.b;
                xw0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xw0Var.a();
                break;
            case 25:
                cy0 cy0Var = (cy0) this.b;
                cy0Var.getClass();
                cy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cy0Var.invalidate();
                break;
            case 26:
                fy0 fy0Var = (fy0) this.b;
                fy0Var.getClass();
                fy0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fy0Var.a.invalidate();
                break;
            case 27:
                t11 t11Var = (t11) this.b;
                t11Var.getClass();
                t11Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t11Var.invalidate();
                break;
            case 28:
                w21 w21Var = (w21) this.b;
                w21Var.getClass();
                w21Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w21Var.n();
                break;
            default:
                o41 o41Var = (o41) this.b;
                o41Var.getClass();
                o41Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o41Var.invalidate();
                break;
        }
    }
}
