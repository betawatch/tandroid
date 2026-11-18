package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j60 j60Var = ((i60) this.b).e;
                j60Var.f2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j60Var.b.invalidate();
                break;
            case 1:
                y60 y60Var = (y60) this.b;
                y60Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u60 u60Var = y60Var.x;
                if (u60Var != null) {
                    u60Var.setProgress(floatValue);
                    break;
                }
                break;
            case 2:
                ((u60) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                t70 t70Var = (t70) this.b;
                t70Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t70Var.s = floatValue2;
                t70Var.d(floatValue2);
                break;
            case 4:
                pc0 pc0Var = ((jc0) this.b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pc0Var.b0 = floatValue3;
                pc0Var.h(floatValue3);
                break;
            case 5:
                ag0 ag0Var = (ag0) this.b;
                ag0Var.I.E = org.telegram.messenger.g0.T1(ag0Var.K, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 6:
                ei0 ei0Var = (ei0) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei0Var.e.setAlpha(floatValue4);
                ei0Var.h.setAlpha(1.0f - floatValue4);
                break;
            case 7:
                vi0 vi0Var = (vi0) this.b;
                vi0Var.C0 = ((Float) vi0Var.z0.getAnimatedValue()).floatValue();
                ai.k0 k0Var = vi0Var.T;
                if (k0Var != null) {
                    k0Var.invalidate();
                }
                vi0Var.invalidate();
                break;
            case 8:
                nr nrVar = (nr) this.b;
                nrVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nrVar.setScaleX(floatValue5);
                nrVar.setScaleY(floatValue5);
                ((vi0) nrVar.c).T.invalidate();
                break;
            case 9:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 10:
                ti0 ti0Var = (ti0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ti0Var.J = floatValue6;
                si0 si0Var = ti0Var.b;
                si0Var.setScaleY(floatValue6 * (ti0Var.x ? 0.76f : 1.0f));
                si0Var.setScaleX(ti0Var.J * (ti0Var.x ? 0.76f : 1.0f));
                break;
            case 11:
                kk0 kk0Var = (kk0) this.b;
                kk0Var.getClass();
                kk0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kk0Var.invalidateSelf();
                break;
            case 12:
                wk0 wk0Var = (wk0) this.b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wk0Var.r = floatValue7;
                wk0Var.E.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue7));
                wk0Var.E.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, wk0Var.r));
                wk0Var.E.setAlpha(wk0Var.r);
                wk0Var.s.invalidate();
                wk0Var.w.invalidate();
                break;
            case 13:
                el0 el0Var = (el0) this.b;
                el0Var.getClass();
                el0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                el0Var.j();
                break;
            case 14:
                ((el0) ((al0) this.b).b).invalidate();
                break;
            case 15:
                il0 il0Var = (il0) this.b;
                il0Var.getClass();
                il0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                cm0 cm0Var = (cm0) this.b;
                cm0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cm0Var.G = floatValue8;
                cm0Var.setShown(floatValue8);
                cm0Var.b(false);
                break;
            case 17:
                pn0 pn0Var = (pn0) this.b;
                pn0Var.getClass();
                pn0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pn0Var.invalidate();
                break;
            case 18:
                do0 do0Var = (do0) this.b;
                yo0 yo0Var = do0Var.b;
                yo0Var.q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yo0Var.n1.invalidate();
                do0Var.invalidate();
                break;
            case 19:
                ((mt) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                gt0 gt0Var = (gt0) this.b;
                gt0Var.Z0(gt0Var.getTabProgress());
                break;
            case 21:
                ((bs0) this.b).h.invalidate();
                break;
            case 22:
                rt0 rt0Var = (rt0) this.b;
                rt0Var.getClass();
                rt0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rt0Var.invalidate();
                break;
            case 23:
                ((iv0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                kv0 kv0Var = (kv0) this.b;
                kv0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kv0Var.a();
                break;
            case 25:
                pw0 pw0Var = (pw0) this.b;
                pw0Var.getClass();
                pw0Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pw0Var.invalidate();
                break;
            case 26:
                sw0 sw0Var = (sw0) this.b;
                sw0Var.getClass();
                sw0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sw0Var.a.invalidate();
                break;
            case 27:
                j01 j01Var = (j01) this.b;
                j01Var.getClass();
                j01Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j01Var.invalidate();
                break;
            case 28:
                z11 z11Var = (z11) this.b;
                z11Var.getClass();
                z11Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z11Var.p();
                break;
            default:
                s31 s31Var = (s31) this.b;
                s31Var.getClass();
                s31Var.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s31Var.invalidate();
                break;
        }
    }
}
