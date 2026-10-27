package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f80 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l80 l80Var = (l80) this.b;
                l80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j80 j80Var = l80Var.x;
                if (j80Var != null) {
                    j80Var.setProgress(floatValue);
                    break;
                }
                break;
            case 1:
                ((j80) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                h90 h90Var = (h90) this.b;
                h90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h90Var.s = floatValue2;
                h90Var.d(floatValue2);
                break;
            case 3:
                me0 me0Var = ((ge0) this.b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                me0Var.a0 = floatValue3;
                me0Var.h(floatValue3);
                break;
            case 4:
                ((dh0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                ii0 ii0Var = (ii0) this.b;
                ii0Var.H.E = AndroidUtilities.lerp(ii0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 6:
                qk0 qk0Var = (qk0) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qk0Var.e.setAlpha(floatValue4);
                qk0Var.h.setAlpha(1.0f - floatValue4);
                break;
            case 7:
                gl0 gl0Var = (gl0) this.b;
                gl0Var.B0 = ((Float) gl0Var.y0.getAnimatedValue()).floatValue();
                bh.p pVar = gl0Var.S;
                if (pVar != null) {
                    pVar.invalidate();
                }
                gl0Var.invalidate();
                break;
            case 8:
                fs fsVar = (fs) this.b;
                fsVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fsVar.setScaleX(floatValue5);
                fsVar.setScaleY(floatValue5);
                ((gl0) fsVar.c).S.invalidate();
                break;
            case 9:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 10:
                el0 el0Var = (el0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                el0Var.I = floatValue6;
                dl0 dl0Var = el0Var.b;
                dl0Var.setScaleY(floatValue6 * (el0Var.w ? 0.76f : 1.0f));
                dl0Var.setScaleX(el0Var.I * (el0Var.w ? 0.76f : 1.0f));
                break;
            case 11:
                vm0 vm0Var = (vm0) this.b;
                vm0Var.getClass();
                vm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vm0Var.invalidateSelf();
                break;
            case 12:
                in0 in0Var = (in0) this.b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                in0Var.r = floatValue7;
                in0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                in0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, in0Var.r));
                in0Var.y.setAlpha(in0Var.r);
                in0Var.s.invalidate();
                in0Var.v.invalidate();
                break;
            case 13:
                qn0 qn0Var = (qn0) this.b;
                qn0Var.getClass();
                qn0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qn0Var.j();
                break;
            case 14:
                ((qn0) ((mn0) this.b).b).invalidate();
                break;
            case 15:
                un0 un0Var = (un0) this.b;
                un0Var.getClass();
                un0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                po0 po0Var = (po0) this.b;
                po0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                po0Var.F = floatValue8;
                po0Var.setShown(floatValue8);
                po0Var.b(false);
                break;
            case 17:
                dq0 dq0Var = (dq0) this.b;
                dq0Var.getClass();
                dq0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dq0Var.invalidate();
                break;
            case 18:
                rq0 rq0Var = (rq0) this.b;
                nr0 nr0Var = rq0Var.b;
                nr0Var.v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nr0Var.c.invalidate();
                rq0Var.invalidate();
                break;
            case 19:
                ((ju) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                bw0 bw0Var = (bw0) this.b;
                bw0Var.T0(bw0Var.getTabProgress());
                break;
            case 21:
                ((uu0) this.b).h.invalidate();
                break;
            case 22:
                nw0 nw0Var = (nw0) this.b;
                nw0Var.getClass();
                nw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nw0Var.invalidate();
                break;
            case 23:
                ((cy0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                fy0 fy0Var = (fy0) this.b;
                fy0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fy0Var.a();
                break;
            case 25:
                kz0 kz0Var = (kz0) this.b;
                kz0Var.getClass();
                kz0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kz0Var.invalidate();
                break;
            case 26:
                nz0 nz0Var = (nz0) this.b;
                nz0Var.getClass();
                nz0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nz0Var.a.invalidate();
                break;
            case 27:
                e31 e31Var = (e31) this.b;
                e31Var.getClass();
                e31Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var.invalidate();
                break;
            case 28:
                f41 f41Var = (f41) this.b;
                f41Var.getClass();
                f41Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f41Var.o();
                break;
            default:
                b61 b61Var = (b61) this.b;
                b61Var.getClass();
                b61Var.q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b61Var.invalidate();
                break;
        }
    }
}
