package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((z60) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                x70 x70Var = (x70) this.b;
                x70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x70Var.s = floatValue;
                x70Var.d(floatValue);
                break;
            case 2:
                dd0 dd0Var = ((yc0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dd0Var.L = floatValue2;
                dd0Var.f(floatValue2);
                break;
            case 3:
                ((sf0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                wg0 wg0Var = (wg0) this.b;
                wg0Var.D.E = AndroidUtilities.lerp(wg0Var.F, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 5:
                gj0 gj0Var = (gj0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gj0Var.e.setAlpha(floatValue3);
                gj0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 6:
                wj0 wj0Var = (wj0) this.b;
                wj0Var.x0 = ((Float) wj0Var.u0.getAnimatedValue()).floatValue();
                ag.y1 y1Var = wj0Var.O;
                if (y1Var != null) {
                    y1Var.invalidate();
                }
                wj0Var.invalidate();
                break;
            case 7:
                gr grVar = (gr) this.b;
                grVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                grVar.setScaleX(floatValue4);
                grVar.setScaleY(floatValue4);
                ((wj0) grVar.c).O.invalidate();
                break;
            case 8:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 9:
                uj0 uj0Var = (uj0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uj0Var.E = floatValue5;
                tj0 tj0Var = uj0Var.b;
                tj0Var.setScaleY(floatValue5 * (uj0Var.w ? 0.76f : 1.0f));
                tj0Var.setScaleX(uj0Var.E * (uj0Var.w ? 0.76f : 1.0f));
                break;
            case 10:
                el0 el0Var = (el0) this.b;
                el0Var.getClass();
                el0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                el0Var.invalidateSelf();
                break;
            case 11:
                ol0 ol0Var = (ol0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ol0Var.r = floatValue6;
                ol0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                ol0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, ol0Var.r));
                ol0Var.y.setAlpha(ol0Var.r);
                ol0Var.s.invalidate();
                ol0Var.v.invalidate();
                break;
            case 12:
                vl0 vl0Var = (vl0) this.b;
                vl0Var.getClass();
                vl0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vl0Var.j();
                break;
            case 13:
                ((vl0) ((sl0) this.b).b).invalidate();
                break;
            case 14:
                am0 am0Var = (am0) this.b;
                am0Var.getClass();
                am0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                um0 um0Var = (um0) this.b;
                um0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                um0Var.B = floatValue7;
                um0Var.setShown(floatValue7);
                um0Var.b(false);
                break;
            case 16:
                go0 go0Var = (go0) this.b;
                go0Var.getClass();
                go0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                go0Var.invalidate();
                break;
            case 17:
                uo0 uo0Var = (uo0) this.b;
                sp0 sp0Var = uo0Var.b;
                sp0Var.q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sp0Var.c.invalidate();
                uo0Var.invalidate();
                break;
            case 18:
                ((lt) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                hu0 hu0Var = (hu0) this.b;
                hu0Var.M0(hu0Var.getTabProgress());
                break;
            case 20:
                ((zs0) this.b).h.invalidate();
                break;
            case 21:
                pu0 pu0Var = (pu0) this.b;
                pu0Var.getClass();
                pu0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pu0Var.invalidate();
                break;
            case 22:
                zu0 zu0Var = (zu0) ((androidx.activity.g) this.b).c;
                zu0Var.b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu0Var.N();
                break;
            case 23:
                ((gw0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                iw0 iw0Var = (iw0) this.b;
                iw0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iw0Var.a();
                break;
            case 25:
                mx0 mx0Var = (mx0) this.b;
                mx0Var.getClass();
                mx0Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mx0Var.invalidate();
                break;
            case 26:
                px0 px0Var = (px0) this.b;
                px0Var.getClass();
                px0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                px0Var.a.invalidate();
                break;
            case 27:
                b11 b11Var = (b11) this.b;
                b11Var.getClass();
                b11Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b11Var.invalidate();
                break;
            case 28:
                d21 d21Var = (d21) this.b;
                d21Var.getClass();
                d21Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d21Var.n();
                break;
            default:
                u31 u31Var = (u31) this.b;
                u31Var.getClass();
                u31Var.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u31Var.invalidate();
                break;
        }
    }
}
