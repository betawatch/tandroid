package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class s70 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((w70) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                v80 v80Var = (v80) this.b;
                v80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v80Var.s = floatValue;
                v80Var.d(floatValue);
                break;
            case 2:
                de0 de0Var = ((yd0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de0Var.P = floatValue2;
                de0Var.f(floatValue2);
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
                ci.n6 n6Var = sk0Var.S;
                if (n6Var != null) {
                    n6Var.invalidate();
                }
                sk0Var.invalidate();
                break;
            case 7:
                sr srVar = (sr) this.b;
                srVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                srVar.setScaleX(floatValue4);
                srVar.setScaleY(floatValue4);
                ((sk0) srVar.c).S.invalidate();
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
                dm0 dm0Var = (dm0) this.b;
                dm0Var.getClass();
                dm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dm0Var.invalidateSelf();
                break;
            case 11:
                om0 om0Var = (om0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                om0Var.r = floatValue6;
                om0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                om0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, om0Var.r));
                om0Var.y.setAlpha(om0Var.r);
                om0Var.s.invalidate();
                om0Var.v.invalidate();
                break;
            case 12:
                wm0 wm0Var = (wm0) this.b;
                wm0Var.getClass();
                wm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wm0Var.j();
                break;
            case 13:
                ((wm0) ((sm0) this.b).b).invalidate();
                break;
            case 14:
                an0 an0Var = (an0) this.b;
                an0Var.getClass();
                an0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                wn0 wn0Var = (wn0) this.b;
                wn0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wn0Var.F = floatValue7;
                wn0Var.setShown(floatValue7);
                wn0Var.b(false);
                break;
            case 16:
                lp0 lp0Var = (lp0) this.b;
                lp0Var.getClass();
                lp0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lp0Var.invalidate();
                break;
            case 17:
                aq0 aq0Var = (aq0) this.b;
                wq0 wq0Var = aq0Var.b;
                wq0Var.u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wq0Var.c.invalidate();
                aq0Var.invalidate();
                break;
            case 18:
                ((bu) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                lv0 lv0Var = (lv0) this.b;
                lv0Var.M0(lv0Var.getTabProgress());
                break;
            case 20:
                ((eu0) this.b).h.invalidate();
                break;
            case 21:
                sv0 sv0Var = (sv0) this.b;
                sv0Var.getClass();
                sv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sv0Var.invalidate();
                break;
            case 22:
                cw0 cw0Var = (cw0) ((androidx.activity.g) this.b).c;
                cw0Var.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cw0Var.N();
                break;
            case 23:
                ((jx0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                lx0 lx0Var = (lx0) this.b;
                lx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lx0Var.a();
                break;
            case 25:
                qy0 qy0Var = (qy0) this.b;
                qy0Var.getClass();
                qy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qy0Var.invalidate();
                break;
            case 26:
                ty0 ty0Var = (ty0) this.b;
                ty0Var.getClass();
                ty0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ty0Var.a.invalidate();
                break;
            case 27:
                k21 k21Var = (k21) this.b;
                k21Var.getClass();
                k21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k21Var.invalidate();
                break;
            case 28:
                n31 n31Var = (n31) this.b;
                n31Var.getClass();
                n31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n31Var.n();
                break;
            default:
                f51 f51Var = (f51) this.b;
                f51Var.getClass();
                f51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f51Var.invalidate();
                break;
        }
    }
}
