package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q70 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((u70) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                t80 t80Var = (t80) this.b;
                t80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t80Var.s = floatValue;
                t80Var.d(floatValue);
                break;
            case 2:
                be0 be0Var = ((wd0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                be0Var.P = floatValue2;
                be0Var.f(floatValue2);
                break;
            case 3:
                ((pg0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                ci.n6 n6Var = qk0Var.S;
                if (n6Var != null) {
                    n6Var.invalidate();
                }
                qk0Var.invalidate();
                break;
            case 7:
                sr srVar = (sr) this.b;
                srVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                srVar.setScaleX(floatValue4);
                srVar.setScaleY(floatValue4);
                ((qk0) srVar.c).S.invalidate();
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
                nm0 nm0Var = (nm0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nm0Var.r = floatValue6;
                nm0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                nm0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, nm0Var.r));
                nm0Var.y.setAlpha(nm0Var.r);
                nm0Var.s.invalidate();
                nm0Var.v.invalidate();
                break;
            case 12:
                vm0 vm0Var = (vm0) this.b;
                vm0Var.getClass();
                vm0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vm0Var.j();
                break;
            case 13:
                ((vm0) ((rm0) this.b).b).invalidate();
                break;
            case 14:
                zm0 zm0Var = (zm0) this.b;
                zm0Var.getClass();
                zm0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                vn0 vn0Var = (vn0) this.b;
                vn0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vn0Var.F = floatValue7;
                vn0Var.setShown(floatValue7);
                vn0Var.b(false);
                break;
            case 16:
                kp0 kp0Var = (kp0) this.b;
                kp0Var.getClass();
                kp0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kp0Var.invalidate();
                break;
            case 17:
                zp0 zp0Var = (zp0) this.b;
                vq0 vq0Var = zp0Var.b;
                vq0Var.u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vq0Var.c.invalidate();
                zp0Var.invalidate();
                break;
            case 18:
                ((bu) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                kv0 kv0Var = (kv0) this.b;
                kv0Var.M0(kv0Var.getTabProgress());
                break;
            case 20:
                ((du0) this.b).h.invalidate();
                break;
            case 21:
                rv0 rv0Var = (rv0) this.b;
                rv0Var.getClass();
                rv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rv0Var.invalidate();
                break;
            case 22:
                bw0 bw0Var = (bw0) ((androidx.activity.g) this.b).c;
                bw0Var.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bw0Var.N();
                break;
            case 23:
                ((ix0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                kx0 kx0Var = (kx0) this.b;
                kx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kx0Var.a();
                break;
            case 25:
                py0 py0Var = (py0) this.b;
                py0Var.getClass();
                py0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                py0Var.invalidate();
                break;
            case 26:
                sy0 sy0Var = (sy0) this.b;
                sy0Var.getClass();
                sy0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sy0Var.a.invalidate();
                break;
            case 27:
                j21 j21Var = (j21) this.b;
                j21Var.getClass();
                j21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j21Var.invalidate();
                break;
            case 28:
                m31 m31Var = (m31) this.b;
                m31Var.getClass();
                m31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m31Var.n();
                break;
            default:
                e51 e51Var = (e51) this.b;
                e51Var.getClass();
                e51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e51Var.invalidate();
                break;
        }
    }
}
