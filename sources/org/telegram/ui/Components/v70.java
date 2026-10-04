package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                pp0 pp0Var = (pp0) this.b;
                pp0Var.getClass();
                pp0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pp0Var.invalidate();
                break;
            case 17:
                dq0 dq0Var = (dq0) this.b;
                zq0 zq0Var = dq0Var.b;
                zq0Var.u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zq0Var.c.invalidate();
                dq0Var.invalidate();
                break;
            case 18:
                ((eu) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                pv0 pv0Var = (pv0) this.b;
                pv0Var.M0(pv0Var.getTabProgress());
                break;
            case 20:
                ((iu0) this.b).h.invalidate();
                break;
            case 21:
                bw0 bw0Var = (bw0) this.b;
                bw0Var.getClass();
                bw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bw0Var.invalidate();
                break;
            case 22:
                lw0 lw0Var = (lw0) ((androidx.activity.g) this.b).c;
                lw0Var.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lw0Var.N();
                break;
            case 23:
                ((rx0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                tx0 tx0Var = (tx0) this.b;
                tx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tx0Var.a();
                break;
            case 25:
                yy0 yy0Var = (yy0) this.b;
                yy0Var.getClass();
                yy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yy0Var.invalidate();
                break;
            case 26:
                bz0 bz0Var = (bz0) this.b;
                bz0Var.getClass();
                bz0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bz0Var.a.invalidate();
                break;
            case 27:
                s21 s21Var = (s21) this.b;
                s21Var.getClass();
                s21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s21Var.invalidate();
                break;
            case 28:
                v31 v31Var = (v31) this.b;
                v31Var.getClass();
                v31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v31Var.n();
                break;
            default:
                n51 n51Var = (n51) this.b;
                n51Var.getClass();
                n51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n51Var.invalidate();
                break;
        }
    }
}
