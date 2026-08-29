package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d70 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((h70) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                g80 g80Var = (g80) this.b;
                g80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g80Var.s = floatValue;
                g80Var.d(floatValue);
                break;
            case 2:
                nd0 nd0Var = ((id0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nd0Var.L = floatValue2;
                nd0Var.f(floatValue2);
                break;
            case 3:
                ((bg0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                eh0 eh0Var = (eh0) this.b;
                eh0Var.D.E = AndroidUtilities.lerp(eh0Var.F, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 5:
                pj0 pj0Var = (pj0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pj0Var.e.setAlpha(floatValue3);
                pj0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 6:
                fk0 fk0Var = (fk0) this.b;
                fk0Var.x0 = ((Float) fk0Var.u0.getAnimatedValue()).floatValue();
                bg.d1 d1Var = fk0Var.O;
                if (d1Var != null) {
                    d1Var.invalidate();
                }
                fk0Var.invalidate();
                break;
            case 7:
                lr lrVar = (lr) this.b;
                lrVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lrVar.setScaleX(floatValue4);
                lrVar.setScaleY(floatValue4);
                ((fk0) lrVar.c).O.invalidate();
                break;
            case 8:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 9:
                dk0 dk0Var = (dk0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dk0Var.E = floatValue5;
                ck0 ck0Var = dk0Var.b;
                ck0Var.setScaleY(floatValue5 * (dk0Var.w ? 0.76f : 1.0f));
                ck0Var.setScaleX(dk0Var.E * (dk0Var.w ? 0.76f : 1.0f));
                break;
            case 10:
                ol0 ol0Var = (ol0) this.b;
                ol0Var.getClass();
                ol0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ol0Var.invalidateSelf();
                break;
            case 11:
                yl0 yl0Var = (yl0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yl0Var.r = floatValue6;
                yl0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                yl0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, yl0Var.r));
                yl0Var.y.setAlpha(yl0Var.r);
                yl0Var.s.invalidate();
                yl0Var.v.invalidate();
                break;
            case 12:
                fm0 fm0Var = (fm0) this.b;
                fm0Var.getClass();
                fm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fm0Var.j();
                break;
            case 13:
                ((fm0) ((cm0) this.b).b).invalidate();
                break;
            case 14:
                km0 km0Var = (km0) this.b;
                km0Var.getClass();
                km0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                en0 en0Var = (en0) this.b;
                en0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                en0Var.B = floatValue7;
                en0Var.setShown(floatValue7);
                en0Var.b(false);
                break;
            case 16:
                qo0 qo0Var = (qo0) this.b;
                qo0Var.getClass();
                qo0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qo0Var.invalidate();
                break;
            case 17:
                fp0 fp0Var = (fp0) this.b;
                dq0 dq0Var = fp0Var.b;
                dq0Var.q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dq0Var.c.invalidate();
                fp0Var.invalidate();
                break;
            case 18:
                ((st) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                qu0 qu0Var = (qu0) this.b;
                qu0Var.M0(qu0Var.getTabProgress());
                break;
            case 20:
                ((it0) this.b).h.invalidate();
                break;
            case 21:
                xu0 xu0Var = (xu0) this.b;
                xu0Var.getClass();
                xu0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xu0Var.invalidate();
                break;
            case 22:
                hv0 hv0Var = (hv0) ((androidx.activity.g) this.b).c;
                hv0Var.b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hv0Var.N();
                break;
            case 23:
                ((ow0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                qw0 qw0Var = (qw0) this.b;
                qw0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qw0Var.a();
                break;
            case 25:
                vx0 vx0Var = (vx0) this.b;
                vx0Var.getClass();
                vx0Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vx0Var.invalidate();
                break;
            case 26:
                yx0 yx0Var = (yx0) this.b;
                yx0Var.getClass();
                yx0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yx0Var.a.invalidate();
                break;
            case 27:
                l11 l11Var = (l11) this.b;
                l11Var.getClass();
                l11Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l11Var.invalidate();
                break;
            case 28:
                m21 m21Var = (m21) this.b;
                m21Var.getClass();
                m21Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m21Var.n();
                break;
            default:
                d41 d41Var = (d41) this.b;
                d41Var.getClass();
                d41Var.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d41Var.invalidate();
                break;
        }
    }
}
