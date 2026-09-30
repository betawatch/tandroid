package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u70 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((y70) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                x80 x80Var = (x80) this.b;
                x80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x80Var.s = floatValue;
                x80Var.d(floatValue);
                break;
            case 2:
                ee0 ee0Var = ((zd0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ee0Var.P = floatValue2;
                ee0Var.f(floatValue2);
                break;
            case 3:
                ((qg0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                ur urVar = (ur) this.b;
                urVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                urVar.setScaleX(floatValue4);
                urVar.setScaleY(floatValue4);
                ((sk0) urVar.c).S.invalidate();
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
                ((du) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                ((ix0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                kx0 kx0Var = (kx0) this.b;
                kx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kx0Var.a();
                break;
            case 25:
                py0 py0Var = (py0) this.b;
                py0Var.getClass();
                py0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                py0Var.invalidate();
                break;
            case 26:
                sy0 sy0Var = (sy0) this.b;
                sy0Var.getClass();
                sy0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sy0Var.a.invalidate();
                break;
            case 27:
                j21 j21Var = (j21) this.b;
                j21Var.getClass();
                j21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j21Var.invalidate();
                break;
            case 28:
                m31 m31Var = (m31) this.b;
                m31Var.getClass();
                m31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m31Var.n();
                break;
            default:
                e51 e51Var = (e51) this.b;
                e51Var.getClass();
                e51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e51Var.invalidate();
                break;
        }
    }
}
