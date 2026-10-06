package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class v70 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((z70) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                y80 y80Var = (y80) this.b;
                y80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y80Var.s = floatValue;
                y80Var.d(floatValue);
                break;
            case 2:
                ee0 ee0Var = ((zd0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee0Var.P = floatValue2;
                ee0Var.f(floatValue2);
                break;
            case 3:
                ((rg0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                vh0 vh0Var = (vh0) this.b;
                vh0Var.H.E = AndroidUtilities.lerp(vh0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 5:
                ck0 ck0Var = (ck0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ck0Var.e.setAlpha(floatValue3);
                ck0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 6:
                sk0 sk0Var = (sk0) this.b;
                sk0Var.B0 = ((Float) sk0Var.y0.getAnimatedValue()).floatValue();
                ci.m6 m6Var = sk0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                sk0Var.invalidate();
                break;
            case 7:
                vr vrVar = (vr) this.b;
                vrVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vrVar.setScaleX(floatValue4);
                vrVar.setScaleY(floatValue4);
                ((sk0) vrVar.c).S.invalidate();
                break;
            case 8:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 9:
                qk0 qk0Var = (qk0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qk0Var.I = floatValue5;
                pk0 pk0Var = qk0Var.b;
                pk0Var.setScaleY(floatValue5 * (qk0Var.w ? 0.76f : 1.0f));
                pk0Var.setScaleX(qk0Var.I * (qk0Var.w ? 0.76f : 1.0f));
                break;
            case 10:
                hm0 hm0Var = (hm0) this.b;
                hm0Var.getClass();
                hm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hm0Var.invalidateSelf();
                break;
            case 11:
                sm0 sm0Var = (sm0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm0Var.r = floatValue6;
                sm0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                sm0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, sm0Var.r));
                sm0Var.y.setAlpha(sm0Var.r);
                sm0Var.s.invalidate();
                sm0Var.v.invalidate();
                break;
            case 12:
                an0 an0Var = (an0) this.b;
                an0Var.getClass();
                an0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                an0Var.j();
                break;
            case 13:
                ((an0) ((wm0) this.b).b).invalidate();
                break;
            case 14:
                en0 en0Var = (en0) this.b;
                en0Var.getClass();
                en0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                ao0 ao0Var = (ao0) this.b;
                ao0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ao0Var.F = floatValue7;
                ao0Var.setShown(floatValue7);
                ao0Var.b(false);
                break;
            case 16:
                qp0 qp0Var = (qp0) this.b;
                qp0Var.getClass();
                qp0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qp0Var.invalidate();
                break;
            case 17:
                eq0 eq0Var = (eq0) this.b;
                br0 br0Var = eq0Var.b;
                br0Var.u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                br0Var.c.invalidate();
                eq0Var.invalidate();
                break;
            case 18:
                ((eu) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                qv0 qv0Var = (qv0) this.b;
                qv0Var.M0(qv0Var.getTabProgress());
                break;
            case 20:
                ((ju0) this.b).h.invalidate();
                break;
            case 21:
                cw0 cw0Var = (cw0) this.b;
                cw0Var.getClass();
                cw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cw0Var.invalidate();
                break;
            case 22:
                mw0 mw0Var = (mw0) ((androidx.activity.g) this.b).c;
                mw0Var.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mw0Var.N();
                break;
            case 23:
                ((sx0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                ux0 ux0Var = (ux0) this.b;
                ux0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ux0Var.a();
                break;
            case 25:
                zy0 zy0Var = (zy0) this.b;
                zy0Var.getClass();
                zy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zy0Var.invalidate();
                break;
            case 26:
                cz0 cz0Var = (cz0) this.b;
                cz0Var.getClass();
                cz0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cz0Var.a.invalidate();
                break;
            case 27:
                t21 t21Var = (t21) this.b;
                t21Var.getClass();
                t21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t21Var.invalidate();
                break;
            case 28:
                w31 w31Var = (w31) this.b;
                w31Var.getClass();
                w31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w31Var.n();
                break;
            default:
                o51 o51Var = (o51) this.b;
                o51Var.getClass();
                o51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o51Var.invalidate();
                break;
        }
    }
}
