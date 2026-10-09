package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j80 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                p80 p80Var = (p80) this.b;
                p80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n80 n80Var = p80Var.x;
                if (n80Var != null) {
                    n80Var.setProgress(floatValue);
                    break;
                }
                break;
            case 1:
                ((n80) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                m90 m90Var = (m90) this.b;
                m90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m90Var.s = floatValue2;
                m90Var.d(floatValue2);
                break;
            case 3:
                te0 te0Var = ((oe0) this.b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                te0Var.T = floatValue3;
                te0Var.g(floatValue3);
                break;
            case 4:
                ((gh0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                ni0 ni0Var = (ni0) this.b;
                ni0Var.H.E = AndroidUtilities.lerp(ni0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 6:
                uk0 uk0Var = (uk0) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uk0Var.e.setAlpha(floatValue4);
                uk0Var.h.setAlpha(1.0f - floatValue4);
                break;
            case 7:
                kl0 kl0Var = (kl0) this.b;
                kl0Var.B0 = ((Float) kl0Var.y0.getAnimatedValue()).floatValue();
                ci.m6 m6Var = kl0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                kl0Var.invalidate();
                break;
            case 8:
                js jsVar = (js) this.b;
                jsVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jsVar.setScaleX(floatValue5);
                jsVar.setScaleY(floatValue5);
                ((kl0) jsVar.c).S.invalidate();
                break;
            case 9:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 10:
                il0 il0Var = (il0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                il0Var.I = floatValue6;
                hl0 hl0Var = il0Var.b;
                hl0Var.setScaleY(floatValue6 * (il0Var.w ? 0.76f : 1.0f));
                hl0Var.setScaleX(il0Var.I * (il0Var.w ? 0.76f : 1.0f));
                break;
            case 11:
                vm0 vm0Var = (vm0) this.b;
                vm0Var.getClass();
                vm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vm0Var.invalidateSelf();
                break;
            case 12:
                gn0 gn0Var = (gn0) this.b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gn0Var.r = floatValue7;
                gn0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                gn0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, gn0Var.r));
                gn0Var.y.setAlpha(gn0Var.r);
                gn0Var.s.invalidate();
                gn0Var.v.invalidate();
                break;
            case 13:
                on0 on0Var = (on0) this.b;
                on0Var.getClass();
                on0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                on0Var.j();
                break;
            case 14:
                ((on0) ((kn0) this.b).b).invalidate();
                break;
            case 15:
                sn0 sn0Var = (sn0) this.b;
                sn0Var.getClass();
                sn0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                no0 no0Var = (no0) this.b;
                no0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                no0Var.F = floatValue8;
                no0Var.setShown(floatValue8);
                no0Var.b(false);
                break;
            case 17:
                bq0 bq0Var = (bq0) this.b;
                bq0Var.getClass();
                bq0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bq0Var.invalidate();
                break;
            case 18:
                qq0 qq0Var = (qq0) this.b;
                mr0 mr0Var = qq0Var.b;
                mr0Var.u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mr0Var.c.invalidate();
                qq0Var.invalidate();
                break;
            case 19:
                ((ru) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                bw0 bw0Var = (bw0) this.b;
                bw0Var.M0(bw0Var.getTabProgress());
                break;
            case 21:
                ((uu0) this.b).h.invalidate();
                break;
            case 22:
                iw0 iw0Var = (iw0) this.b;
                iw0Var.getClass();
                iw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iw0Var.invalidate();
                break;
            case 23:
                sw0 sw0Var = (sw0) ((androidx.activity.g) this.b).c;
                sw0Var.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sw0Var.N();
                break;
            case 24:
                ((yx0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                ay0 ay0Var = (ay0) this.b;
                ay0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ay0Var.a();
                break;
            case 26:
                ez0 ez0Var = (ez0) this.b;
                ez0Var.getClass();
                ez0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ez0Var.invalidate();
                break;
            case 27:
                hz0 hz0Var = (hz0) this.b;
                hz0Var.getClass();
                hz0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hz0Var.a.invalidate();
                break;
            case 28:
                z21 z21Var = (z21) this.b;
                z21Var.getClass();
                z21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z21Var.invalidate();
                break;
            default:
                c41 c41Var = (c41) this.b;
                c41Var.getClass();
                c41Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c41Var.o();
                break;
        }
    }
}
