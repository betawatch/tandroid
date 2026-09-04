package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h70 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((l70) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                k80 k80Var = (k80) this.b;
                k80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k80Var.s = floatValue;
                k80Var.d(floatValue);
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
                ih0 ih0Var = (ih0) this.b;
                ih0Var.H.E = AndroidUtilities.lerp(ih0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 5:
                pj0 pj0Var = (pj0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pj0Var.e.setAlpha(floatValue3);
                pj0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 6:
                fk0 fk0Var = (fk0) this.b;
                fk0Var.B0 = ((Float) fk0Var.y0.getAnimatedValue()).floatValue();
                ah.w wVar = fk0Var.S;
                if (wVar != null) {
                    wVar.invalidate();
                }
                fk0Var.invalidate();
                break;
            case 7:
                rr rrVar = (rr) this.b;
                rrVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rrVar.setScaleX(floatValue4);
                rrVar.setScaleY(floatValue4);
                ((fk0) rrVar.c).S.invalidate();
                break;
            case 8:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 9:
                dk0 dk0Var = (dk0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dk0Var.I = floatValue5;
                ck0 ck0Var = dk0Var.b;
                ck0Var.setScaleY(floatValue5 * (dk0Var.w ? 0.76f : 1.0f));
                ck0Var.setScaleX(dk0Var.I * (dk0Var.w ? 0.76f : 1.0f));
                break;
            case 10:
                ql0 ql0Var = (ql0) this.b;
                ql0Var.getClass();
                ql0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ql0Var.invalidateSelf();
                break;
            case 11:
                am0 am0Var = (am0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                am0Var.r = floatValue6;
                am0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                am0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, am0Var.r));
                am0Var.y.setAlpha(am0Var.r);
                am0Var.s.invalidate();
                am0Var.v.invalidate();
                break;
            case 12:
                im0 im0Var = (im0) this.b;
                im0Var.getClass();
                im0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                im0Var.j();
                break;
            case 13:
                ((im0) ((em0) this.b).b).invalidate();
                break;
            case 14:
                mm0 mm0Var = (mm0) this.b;
                mm0Var.getClass();
                mm0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                hn0 hn0Var = (hn0) this.b;
                hn0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hn0Var.F = floatValue7;
                hn0Var.setShown(floatValue7);
                hn0Var.b(false);
                break;
            case 16:
                xo0 xo0Var = (xo0) this.b;
                xo0Var.getClass();
                xo0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xo0Var.invalidate();
                break;
            case 17:
                lp0 lp0Var = (lp0) this.b;
                hq0 hq0Var = lp0Var.b;
                hq0Var.u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hq0Var.c.invalidate();
                lp0Var.invalidate();
                break;
            case 18:
                ((zt) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                xu0 xu0Var = (xu0) this.b;
                xu0Var.M0(xu0Var.getTabProgress());
                break;
            case 20:
                ((qt0) this.b).h.invalidate();
                break;
            case 21:
                ev0 ev0Var = (ev0) this.b;
                ev0Var.getClass();
                ev0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ev0Var.invalidate();
                break;
            case 22:
                ov0 ov0Var = (ov0) ((androidx.activity.g) this.b).c;
                ov0Var.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ov0Var.N();
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
