package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class q70 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((u70) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                u80 u80Var = (u80) this.b;
                u80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u80Var.s = floatValue;
                u80Var.d(floatValue);
                break;
            case 2:
                be0 be0Var = ((wd0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                be0Var.P = floatValue2;
                be0Var.f(floatValue2);
                break;
            case 3:
                ((og0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                sh0 sh0Var = (sh0) this.b;
                sh0Var.H.E = AndroidUtilities.lerp(sh0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 5:
                zj0 zj0Var = (zj0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zj0Var.e.setAlpha(floatValue3);
                zj0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 6:
                pk0 pk0Var = (pk0) this.b;
                pk0Var.B0 = ((Float) pk0Var.y0.getAnimatedValue()).floatValue();
                bi.n7 n7Var = pk0Var.S;
                if (n7Var != null) {
                    n7Var.invalidate();
                }
                pk0Var.invalidate();
                break;
            case 7:
                yr yrVar = (yr) this.b;
                yrVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yrVar.setScaleX(floatValue4);
                yrVar.setScaleY(floatValue4);
                ((pk0) yrVar.c).S.invalidate();
                break;
            case 8:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 9:
                nk0 nk0Var = (nk0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nk0Var.I = floatValue5;
                mk0 mk0Var = nk0Var.b;
                mk0Var.setScaleY(floatValue5 * (nk0Var.w ? 0.76f : 1.0f));
                mk0Var.setScaleX(nk0Var.I * (nk0Var.w ? 0.76f : 1.0f));
                break;
            case 10:
                am0 am0Var = (am0) this.b;
                am0Var.getClass();
                am0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                am0Var.invalidateSelf();
                break;
            case 11:
                km0 km0Var = (km0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                km0Var.r = floatValue6;
                km0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                km0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, km0Var.r));
                km0Var.y.setAlpha(km0Var.r);
                km0Var.s.invalidate();
                km0Var.v.invalidate();
                break;
            case 12:
                sm0 sm0Var = (sm0) this.b;
                sm0Var.getClass();
                sm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm0Var.j();
                break;
            case 13:
                ((sm0) ((om0) this.b).b).invalidate();
                break;
            case 14:
                wm0 wm0Var = (wm0) this.b;
                wm0Var.getClass();
                wm0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                rn0 rn0Var = (rn0) this.b;
                rn0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rn0Var.F = floatValue7;
                rn0Var.setShown(floatValue7);
                rn0Var.b(false);
                break;
            case 16:
                hp0 hp0Var = (hp0) this.b;
                hp0Var.getClass();
                hp0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hp0Var.invalidate();
                break;
            case 17:
                vp0 vp0Var = (vp0) this.b;
                sq0 sq0Var = vp0Var.b;
                sq0Var.u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sq0Var.c.invalidate();
                vp0Var.invalidate();
                break;
            case 18:
                ((fu) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                iv0 iv0Var = (iv0) this.b;
                iv0Var.M0(iv0Var.getTabProgress());
                break;
            case 20:
                ((au0) this.b).h.invalidate();
                break;
            case 21:
                pv0 pv0Var = (pv0) this.b;
                pv0Var.getClass();
                pv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pv0Var.invalidate();
                break;
            case 22:
                aw0 aw0Var = (aw0) ((androidx.activity.g) this.b).c;
                aw0Var.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aw0Var.N();
                break;
            case 23:
                ((hx0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                jx0 jx0Var = (jx0) this.b;
                jx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jx0Var.a();
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
                i21 i21Var = (i21) this.b;
                i21Var.getClass();
                i21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i21Var.invalidate();
                break;
            case 28:
                k31 k31Var = (k31) this.b;
                k31Var.getClass();
                k31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k31Var.n();
                break;
            default:
                c51 c51Var = (c51) this.b;
                c51Var.getClass();
                c51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c51Var.invalidate();
                break;
        }
    }
}
