package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                ((fg0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                ci.n6 n6Var = gk0Var.S;
                if (n6Var != null) {
                    n6Var.invalidate();
                }
                gk0Var.invalidate();
                break;
            case 7:
                sr srVar = (sr) this.b;
                srVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                srVar.setScaleX(floatValue4);
                srVar.setScaleY(floatValue4);
                ((gk0) srVar.c).S.invalidate();
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
                jn0 jn0Var = (jn0) this.b;
                jn0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jn0Var.F = floatValue7;
                jn0Var.setShown(floatValue7);
                jn0Var.b(false);
                break;
            case 16:
                xo0 xo0Var = (xo0) this.b;
                xo0Var.getClass();
                xo0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xo0Var.invalidate();
                break;
            case 17:
                mp0 mp0Var = (mp0) this.b;
                iq0 iq0Var = mp0Var.b;
                iq0Var.u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iq0Var.c.invalidate();
                mp0Var.invalidate();
                break;
            case 18:
                ((bu) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                zu0 zu0Var = (zu0) this.b;
                zu0Var.M0(zu0Var.getTabProgress());
                break;
            case 20:
                ((st0) this.b).h.invalidate();
                break;
            case 21:
                gv0 gv0Var = (gv0) this.b;
                gv0Var.getClass();
                gv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gv0Var.invalidate();
                break;
            case 22:
                qv0 qv0Var = (qv0) ((androidx.activity.g) this.b).c;
                qv0Var.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qv0Var.N();
                break;
            case 23:
                ((xw0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                zw0 zw0Var = (zw0) this.b;
                zw0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zw0Var.a();
                break;
            case 25:
                ey0 ey0Var = (ey0) this.b;
                ey0Var.getClass();
                ey0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ey0Var.invalidate();
                break;
            case 26:
                hy0 hy0Var = (hy0) this.b;
                hy0Var.getClass();
                hy0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hy0Var.a.invalidate();
                break;
            case 27:
                v11 v11Var = (v11) this.b;
                v11Var.getClass();
                v11Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v11Var.invalidate();
                break;
            case 28:
                y21 y21Var = (y21) this.b;
                y21Var.getClass();
                y21Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y21Var.n();
                break;
            default:
                q41 q41Var = (q41) this.b;
                q41Var.getClass();
                q41Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q41Var.invalidate();
                break;
        }
    }
}
