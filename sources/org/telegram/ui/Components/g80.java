package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class g80 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m80 m80Var = (m80) this.b;
                m80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k80 k80Var = m80Var.x;
                if (k80Var != null) {
                    k80Var.setProgress(floatValue);
                    break;
                }
                break;
            case 1:
                ((k80) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                l90 l90Var = (l90) this.b;
                l90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l90Var.s = floatValue2;
                l90Var.d(floatValue2);
                break;
            case 3:
                re0 re0Var = ((me0) this.b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                re0Var.T = floatValue3;
                re0Var.g(floatValue3);
                break;
            case 4:
                ((fh0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                ji0 ji0Var = (ji0) this.b;
                ji0Var.H.E = AndroidUtilities.lerp(ji0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
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
                ah.v vVar = gl0Var.S;
                if (vVar != null) {
                    vVar.invalidate();
                }
                gl0Var.invalidate();
                break;
            case 8:
                gs gsVar = (gs) this.b;
                gsVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gsVar.setScaleX(floatValue5);
                gsVar.setScaleY(floatValue5);
                ((gl0) gsVar.c).S.invalidate();
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
                rm0 rm0Var = (rm0) this.b;
                rm0Var.getClass();
                rm0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rm0Var.invalidateSelf();
                break;
            case 12:
                cn0 cn0Var = (cn0) this.b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cn0Var.r = floatValue7;
                cn0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                cn0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, cn0Var.r));
                cn0Var.y.setAlpha(cn0Var.r);
                cn0Var.s.invalidate();
                cn0Var.v.invalidate();
                break;
            case 13:
                kn0 kn0Var = (kn0) this.b;
                kn0Var.getClass();
                kn0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kn0Var.j();
                break;
            case 14:
                ((kn0) ((gn0) this.b).b).invalidate();
                break;
            case 15:
                on0 on0Var = (on0) this.b;
                on0Var.getClass();
                on0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                ko0 ko0Var = (ko0) this.b;
                ko0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ko0Var.F = floatValue8;
                ko0Var.setShown(floatValue8);
                ko0Var.b(false);
                break;
            case 17:
                xp0 xp0Var = (xp0) this.b;
                xp0Var.getClass();
                xp0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xp0Var.invalidate();
                break;
            case 18:
                nq0 nq0Var = (nq0) this.b;
                jr0 jr0Var = nq0Var.b;
                jr0Var.u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jr0Var.c.invalidate();
                nq0Var.invalidate();
                break;
            case 19:
                ((nu) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                xv0 xv0Var = (xv0) this.b;
                xv0Var.M0(xv0Var.getTabProgress());
                break;
            case 21:
                ((qu0) this.b).h.invalidate();
                break;
            case 22:
                ew0 ew0Var = (ew0) this.b;
                ew0Var.getClass();
                ew0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ew0Var.invalidate();
                break;
            case 23:
                ow0 ow0Var = (ow0) ((androidx.activity.g) this.b).c;
                ow0Var.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ow0Var.N();
                break;
            case 24:
                ((ux0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                wx0 wx0Var = (wx0) this.b;
                wx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wx0Var.a();
                break;
            case 26:
                az0 az0Var = (az0) this.b;
                az0Var.getClass();
                az0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                az0Var.invalidate();
                break;
            case 27:
                dz0 dz0Var = (dz0) this.b;
                dz0Var.getClass();
                dz0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dz0Var.a.invalidate();
                break;
            case 28:
                v21 v21Var = (v21) this.b;
                v21Var.getClass();
                v21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v21Var.invalidate();
                break;
            default:
                y31 y31Var = (y31) this.b;
                y31Var.getClass();
                y31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y31Var.n();
                break;
        }
    }
}
