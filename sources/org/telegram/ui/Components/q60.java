package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q60(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((v60) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                t70 t70Var = (t70) this.b;
                t70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t70Var.s = floatValue;
                t70Var.d(floatValue);
                break;
            case 2:
                yc0 yc0Var = ((tc0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yc0Var.L = floatValue2;
                yc0Var.f(floatValue2);
                break;
            case 3:
                ((pf0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                ug0 ug0Var = (ug0) this.b;
                ug0Var.D.E = AndroidUtilities.lerp(ug0Var.F, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 5:
                ej0 ej0Var = (ej0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ej0Var.e.setAlpha(floatValue3);
                ej0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 6:
                uj0 uj0Var = (uj0) this.b;
                uj0Var.x0 = ((Float) uj0Var.u0.getAnimatedValue()).floatValue();
                fh.v vVar = uj0Var.O;
                if (vVar != null) {
                    vVar.invalidate();
                }
                uj0Var.invalidate();
                break;
            case 7:
                ir irVar = (ir) this.b;
                irVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                irVar.setScaleX(floatValue4);
                irVar.setScaleY(floatValue4);
                ((uj0) irVar.c).O.invalidate();
                break;
            case 8:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 9:
                sj0 sj0Var = (sj0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sj0Var.E = floatValue5;
                rj0 rj0Var = sj0Var.b;
                rj0Var.setScaleY(floatValue5 * (sj0Var.w ? 0.76f : 1.0f));
                rj0Var.setScaleX(sj0Var.E * (sj0Var.w ? 0.76f : 1.0f));
                break;
            case 10:
                bl0 bl0Var = (bl0) this.b;
                bl0Var.getClass();
                bl0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bl0Var.invalidateSelf();
                break;
            case 11:
                ll0 ll0Var = (ll0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ll0Var.r = floatValue6;
                ll0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                ll0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, ll0Var.r));
                ll0Var.y.setAlpha(ll0Var.r);
                ll0Var.s.invalidate();
                ll0Var.v.invalidate();
                break;
            case 12:
                sl0 sl0Var = (sl0) this.b;
                sl0Var.getClass();
                sl0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sl0Var.j();
                break;
            case 13:
                ((sl0) ((pl0) this.b).b).invalidate();
                break;
            case 14:
                xl0 xl0Var = (xl0) this.b;
                xl0Var.getClass();
                xl0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                sm0 sm0Var = (sm0) this.b;
                sm0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sm0Var.B = floatValue7;
                sm0Var.setShown(floatValue7);
                sm0Var.b(false);
                break;
            case 16:
                fo0 fo0Var = (fo0) this.b;
                fo0Var.getClass();
                fo0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fo0Var.invalidate();
                break;
            case 17:
                uo0 uo0Var = (uo0) this.b;
                rp0 rp0Var = uo0Var.b;
                rp0Var.q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rp0Var.c.invalidate();
                uo0Var.invalidate();
                break;
            case 18:
                ((mt) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                eu0 eu0Var = (eu0) this.b;
                eu0Var.M0(eu0Var.getTabProgress());
                break;
            case 20:
                ((xs0) this.b).h.invalidate();
                break;
            case 21:
                mu0 mu0Var = (mu0) this.b;
                mu0Var.getClass();
                mu0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu0Var.invalidate();
                break;
            case 22:
                xu0 xu0Var = (xu0) ((androidx.activity.g) this.b).c;
                xu0Var.b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xu0Var.N();
                break;
            case 23:
                ((ew0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                gw0 gw0Var = (gw0) this.b;
                gw0Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gw0Var.a();
                break;
            case 25:
                kx0 kx0Var = (kx0) this.b;
                kx0Var.getClass();
                kx0Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kx0Var.invalidate();
                break;
            case 26:
                nx0 nx0Var = (nx0) this.b;
                nx0Var.getClass();
                nx0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nx0Var.a.invalidate();
                break;
            case 27:
                a11 a11Var = (a11) this.b;
                a11Var.getClass();
                a11Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a11Var.invalidate();
                break;
            case 28:
                b21 b21Var = (b21) this.b;
                b21Var.getClass();
                b21Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b21Var.n();
                break;
            default:
                s31 s31Var = (s31) this.b;
                s31Var.getClass();
                s31Var.x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s31Var.invalidate();
                break;
        }
    }
}
