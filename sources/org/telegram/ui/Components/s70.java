package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                ce0 ce0Var = ((xd0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ce0Var.P = floatValue2;
                ce0Var.f(floatValue2);
                break;
            case 3:
                ((og0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                th0 th0Var = (th0) this.b;
                th0Var.H.E = AndroidUtilities.lerp(th0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 5:
                ak0 ak0Var = (ak0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ak0Var.e.setAlpha(floatValue3);
                ak0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 6:
                qk0 qk0Var = (qk0) this.b;
                qk0Var.B0 = ((Float) qk0Var.y0.getAnimatedValue()).floatValue();
                ci.m6 m6Var = qk0Var.S;
                if (m6Var != null) {
                    m6Var.invalidate();
                }
                qk0Var.invalidate();
                break;
            case 7:
                tr trVar = (tr) this.b;
                trVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                trVar.setScaleX(floatValue4);
                trVar.setScaleY(floatValue4);
                ((qk0) trVar.c).S.invalidate();
                break;
            case 8:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 9:
                ok0 ok0Var = (ok0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ok0Var.I = floatValue5;
                nk0 nk0Var = ok0Var.b;
                nk0Var.setScaleY(floatValue5 * (ok0Var.w ? 0.76f : 1.0f));
                nk0Var.setScaleX(ok0Var.I * (ok0Var.w ? 0.76f : 1.0f));
                break;
            case 10:
                bm0 bm0Var = (bm0) this.b;
                bm0Var.getClass();
                bm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bm0Var.invalidateSelf();
                break;
            case 11:
                mm0 mm0Var = (mm0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mm0Var.r = floatValue6;
                mm0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                mm0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, mm0Var.r));
                mm0Var.y.setAlpha(mm0Var.r);
                mm0Var.s.invalidate();
                mm0Var.v.invalidate();
                break;
            case 12:
                um0 um0Var = (um0) this.b;
                um0Var.getClass();
                um0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                um0Var.j();
                break;
            case 13:
                ((um0) ((qm0) this.b).b).invalidate();
                break;
            case 14:
                ym0 ym0Var = (ym0) this.b;
                ym0Var.getClass();
                ym0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                un0 un0Var = (un0) this.b;
                un0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                un0Var.F = floatValue7;
                un0Var.setShown(floatValue7);
                un0Var.b(false);
                break;
            case 16:
                jp0 jp0Var = (jp0) this.b;
                jp0Var.getClass();
                jp0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jp0Var.invalidate();
                break;
            case 17:
                yp0 yp0Var = (yp0) this.b;
                uq0 uq0Var = yp0Var.b;
                uq0Var.u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uq0Var.c.invalidate();
                yp0Var.invalidate();
                break;
            case 18:
                ((cu) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                jv0 jv0Var = (jv0) this.b;
                jv0Var.M0(jv0Var.getTabProgress());
                break;
            case 20:
                ((cu0) this.b).h.invalidate();
                break;
            case 21:
                qv0 qv0Var = (qv0) this.b;
                qv0Var.getClass();
                qv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qv0Var.invalidate();
                break;
            case 22:
                aw0 aw0Var = (aw0) ((androidx.activity.g) this.b).c;
                aw0Var.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aw0Var.N();
                break;
            case 23:
                ((gx0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                ix0 ix0Var = (ix0) this.b;
                ix0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ix0Var.a();
                break;
            case 25:
                ny0 ny0Var = (ny0) this.b;
                ny0Var.getClass();
                ny0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ny0Var.invalidate();
                break;
            case 26:
                qy0 qy0Var = (qy0) this.b;
                qy0Var.getClass();
                qy0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qy0Var.a.invalidate();
                break;
            case 27:
                h21 h21Var = (h21) this.b;
                h21Var.getClass();
                h21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h21Var.invalidate();
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
