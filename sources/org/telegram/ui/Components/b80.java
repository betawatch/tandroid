package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class b80 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i80 i80Var = (i80) this.b;
                i80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g80 g80Var = i80Var.x;
                if (g80Var != null) {
                    g80Var.setProgress(floatValue);
                    break;
                }
                break;
            case 1:
                ((g80) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                e90 e90Var = (e90) this.b;
                e90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e90Var.s = floatValue2;
                e90Var.d(floatValue2);
                break;
            case 3:
                le0 le0Var = ((ge0) this.b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                le0Var.a0 = floatValue3;
                le0Var.g(floatValue3);
                break;
            case 4:
                ((zg0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                ei0 ei0Var = (ei0) this.b;
                ei0Var.H.E = AndroidUtilities.lerp(ei0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 6:
                mk0 mk0Var = (mk0) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mk0Var.e.setAlpha(floatValue4);
                mk0Var.h.setAlpha(1.0f - floatValue4);
                break;
            case 7:
                cl0 cl0Var = (cl0) this.b;
                cl0Var.B0 = ((Float) cl0Var.y0.getAnimatedValue()).floatValue();
                ah.v vVar = cl0Var.S;
                if (vVar != null) {
                    vVar.invalidate();
                }
                cl0Var.invalidate();
                break;
            case 8:
                ds dsVar = (ds) this.b;
                dsVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dsVar.setScaleX(floatValue5);
                dsVar.setScaleY(floatValue5);
                ((cl0) dsVar.c).S.invalidate();
                break;
            case 9:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 10:
                al0 al0Var = (al0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                al0Var.I = floatValue6;
                zk0 zk0Var = al0Var.b;
                zk0Var.setScaleY(floatValue6 * (al0Var.w ? 0.76f : 1.0f));
                zk0Var.setScaleX(al0Var.I * (al0Var.w ? 0.76f : 1.0f));
                break;
            case 11:
                nm0 nm0Var = (nm0) this.b;
                nm0Var.getClass();
                nm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nm0Var.invalidateSelf();
                break;
            case 12:
                ym0 ym0Var = (ym0) this.b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ym0Var.r = floatValue7;
                ym0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                ym0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, ym0Var.r));
                ym0Var.y.setAlpha(ym0Var.r);
                ym0Var.s.invalidate();
                ym0Var.v.invalidate();
                break;
            case 13:
                gn0 gn0Var = (gn0) this.b;
                gn0Var.getClass();
                gn0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gn0Var.j();
                break;
            case 14:
                ((gn0) ((cn0) this.b).b).invalidate();
                break;
            case 15:
                kn0 kn0Var = (kn0) this.b;
                kn0Var.getClass();
                kn0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                fo0 fo0Var = (fo0) this.b;
                fo0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fo0Var.F = floatValue8;
                fo0Var.setShown(floatValue8);
                fo0Var.b(false);
                break;
            case 17:
                sp0 sp0Var = (sp0) this.b;
                sp0Var.getClass();
                sp0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sp0Var.invalidate();
                break;
            case 18:
                hq0 hq0Var = (hq0) this.b;
                er0 er0Var = hq0Var.b;
                er0Var.v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                er0Var.c.invalidate();
                hq0Var.invalidate();
                break;
            case 19:
                ((iu) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                tv0 tv0Var = (tv0) this.b;
                tv0Var.O0(tv0Var.getTabProgress());
                break;
            case 21:
                ((mu0) this.b).h.invalidate();
                break;
            case 22:
                aw0 aw0Var = (aw0) this.b;
                aw0Var.getClass();
                aw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aw0Var.invalidate();
                break;
            case 23:
                kw0 kw0Var = (kw0) ((androidx.activity.g) this.b).c;
                kw0Var.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kw0Var.N();
                break;
            case 24:
                ((qx0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                sx0 sx0Var = (sx0) this.b;
                sx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sx0Var.a();
                break;
            case 26:
                wy0 wy0Var = (wy0) this.b;
                wy0Var.getClass();
                wy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wy0Var.invalidate();
                break;
            case 27:
                zy0 zy0Var = (zy0) this.b;
                zy0Var.getClass();
                zy0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zy0Var.a.invalidate();
                break;
            case 28:
                q21 q21Var = (q21) this.b;
                q21Var.getClass();
                q21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q21Var.invalidate();
                break;
            default:
                r31 r31Var = (r31) this.b;
                r31Var.getClass();
                r31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r31Var.n();
                break;
        }
    }
}
