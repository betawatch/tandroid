package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k70 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((o70) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                n80 n80Var = (n80) this.b;
                n80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n80Var.s = floatValue;
                n80Var.d(floatValue);
                break;
            case 2:
                xd0 xd0Var = ((rd0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd0Var.M = floatValue2;
                xd0Var.f(floatValue2);
                break;
            case 3:
                ((ng0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                rh0 rh0Var = (rh0) this.b;
                rh0Var.E.E = AndroidUtilities.lerp(rh0Var.G, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 5:
                ak0 ak0Var = (ak0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ak0Var.e.setAlpha(floatValue3);
                ak0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 6:
                rk0 rk0Var = (rk0) this.b;
                rk0Var.y0 = ((Float) rk0Var.v0.getAnimatedValue()).floatValue();
                ag.l lVar = rk0Var.P;
                if (lVar != null) {
                    lVar.invalidate();
                }
                rk0Var.invalidate();
                break;
            case 7:
                rr rrVar = (rr) this.b;
                rrVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rrVar.setScaleX(floatValue4);
                rrVar.setScaleY(floatValue4);
                ((rk0) rrVar.c).P.invalidate();
                break;
            case 8:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 9:
                pk0 pk0Var = (pk0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pk0Var.F = floatValue5;
                ok0 ok0Var = pk0Var.b;
                ok0Var.setScaleY(floatValue5 * (pk0Var.w ? 0.76f : 1.0f));
                ok0Var.setScaleX(pk0Var.F * (pk0Var.w ? 0.76f : 1.0f));
                break;
            case 10:
                zl0 zl0Var = (zl0) this.b;
                zl0Var.getClass();
                zl0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zl0Var.invalidateSelf();
                break;
            case 11:
                jm0 jm0Var = (jm0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jm0Var.r = floatValue6;
                jm0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                jm0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, jm0Var.r));
                jm0Var.y.setAlpha(jm0Var.r);
                jm0Var.s.invalidate();
                jm0Var.v.invalidate();
                break;
            case 12:
                qm0 qm0Var = (qm0) this.b;
                qm0Var.getClass();
                qm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qm0Var.j();
                break;
            case 13:
                ((qm0) ((nm0) this.b).b).invalidate();
                break;
            case 14:
                vm0 vm0Var = (vm0) this.b;
                vm0Var.getClass();
                vm0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                pn0 pn0Var = (pn0) this.b;
                pn0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pn0Var.C = floatValue7;
                pn0Var.setShown(floatValue7);
                pn0Var.b(false);
                break;
            case 16:
                bp0 bp0Var = (bp0) this.b;
                bp0Var.getClass();
                bp0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bp0Var.invalidate();
                break;
            case 17:
                pp0 pp0Var = (pp0) this.b;
                mq0 mq0Var = pp0Var.b;
                mq0Var.r0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mq0Var.c.invalidate();
                pp0Var.invalidate();
                break;
            case 18:
                ((xt) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                zu0 zu0Var = (zu0) this.b;
                zu0Var.M0(zu0Var.getTabProgress());
                break;
            case 20:
                ((rt0) this.b).h.invalidate();
                break;
            case 21:
                gv0 gv0Var = (gv0) this.b;
                gv0Var.getClass();
                gv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gv0Var.invalidate();
                break;
            case 22:
                qv0 qv0Var = (qv0) ((androidx.activity.g) this.b).c;
                qv0Var.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qv0Var.N();
                break;
            case 23:
                ((yw0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                ax0 ax0Var = (ax0) this.b;
                ax0Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ax0Var.a();
                break;
            case 25:
                gy0 gy0Var = (gy0) this.b;
                gy0Var.getClass();
                gy0Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gy0Var.invalidate();
                break;
            case 26:
                jy0 jy0Var = (jy0) this.b;
                jy0Var.getClass();
                jy0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jy0Var.a.invalidate();
                break;
            case 27:
                x11 x11Var = (x11) this.b;
                x11Var.getClass();
                x11Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x11Var.invalidate();
                break;
            case 28:
                x21 x21Var = (x21) this.b;
                x21Var.getClass();
                x21Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x21Var.n();
                break;
            default:
                q41 q41Var = (q41) this.b;
                q41Var.getClass();
                q41Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q41Var.invalidate();
                break;
        }
    }
}
