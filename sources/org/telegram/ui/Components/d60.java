package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((j60) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                g70 g70Var = (g70) this.b;
                g70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g70Var.s = floatValue;
                g70Var.d(floatValue);
                break;
            case 2:
                fc0 fc0Var = ((zb0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc0Var.a0 = floatValue2;
                fc0Var.h(floatValue2);
                break;
            case 3:
                of0 of0Var = (of0) this.b;
                of0Var.H.E = org.telegram.messenger.g0.T1(of0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 4:
                sh0 sh0Var = (sh0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sh0Var.e.setAlpha(floatValue3);
                sh0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 5:
                ji0 ji0Var = (ji0) this.b;
                ji0Var.B0 = ((Float) ji0Var.y0.getAnimatedValue()).floatValue();
                bi.x5 x5Var = ji0Var.S;
                if (x5Var != null) {
                    x5Var.invalidate();
                }
                ji0Var.invalidate();
                break;
            case 6:
                zq zqVar = (zq) this.b;
                zqVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zqVar.setScaleX(floatValue4);
                zqVar.setScaleY(floatValue4);
                ((ji0) zqVar.c).S.invalidate();
                break;
            case 7:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 8:
                hi0 hi0Var = (hi0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hi0Var.I = floatValue5;
                gi0 gi0Var = hi0Var.b;
                gi0Var.setScaleY(floatValue5 * (hi0Var.x ? 0.76f : 1.0f));
                gi0Var.setScaleX(hi0Var.I * (hi0Var.x ? 0.76f : 1.0f));
                break;
            case 9:
                yj0 yj0Var = (yj0) this.b;
                yj0Var.getClass();
                yj0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yj0Var.invalidateSelf();
                break;
            case 10:
                kk0 kk0Var = (kk0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kk0Var.r = floatValue6;
                kk0Var.D.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue6));
                kk0Var.D.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, kk0Var.r));
                kk0Var.D.setAlpha(kk0Var.r);
                kk0Var.s.invalidate();
                kk0Var.w.invalidate();
                break;
            case 11:
                sk0 sk0Var = (sk0) this.b;
                sk0Var.getClass();
                sk0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sk0Var.j();
                break;
            case 12:
                ((sk0) ((ok0) this.b).b).invalidate();
                break;
            case 13:
                wk0 wk0Var = (wk0) this.b;
                wk0Var.getClass();
                wk0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                rl0 rl0Var = (rl0) this.b;
                rl0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rl0Var.F = floatValue7;
                rl0Var.setShown(floatValue7);
                rl0Var.b(false);
                break;
            case 15:
                dn0 dn0Var = (dn0) this.b;
                dn0Var.getClass();
                dn0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dn0Var.invalidate();
                break;
            case 16:
                sn0 sn0Var = (sn0) this.b;
                no0 no0Var = sn0Var.b;
                no0Var.m2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                no0Var.j1.invalidate();
                sn0Var.invalidate();
                break;
            case 17:
                ((zs) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                zs0 zs0Var = (zs0) this.b;
                zs0Var.Z0(zs0Var.getTabProgress());
                break;
            case 19:
                ((ur0) this.b).h.invalidate();
                break;
            case 20:
                kt0 kt0Var = (kt0) this.b;
                kt0Var.getClass();
                kt0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kt0Var.invalidate();
                break;
            case 21:
                ((av0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 22:
                cv0 cv0Var = (cv0) this.b;
                cv0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cv0Var.a();
                break;
            case 23:
                gw0 gw0Var = (gw0) this.b;
                gw0Var.getClass();
                gw0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gw0Var.invalidate();
                break;
            case 24:
                jw0 jw0Var = (jw0) this.b;
                jw0Var.getClass();
                jw0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jw0Var.a.invalidate();
                break;
            case 25:
                a01 a01Var = (a01) this.b;
                a01Var.getClass();
                a01Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a01Var.invalidate();
                break;
            case 26:
                n11 n11Var = (n11) this.b;
                n11Var.getClass();
                n11Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n11Var.p();
                break;
            case 27:
                e31 e31Var = (e31) this.b;
                e31Var.getClass();
                e31Var.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e31Var.invalidate();
                break;
            case 28:
                s41 s41Var = (s41) this.b;
                s41Var.getClass();
                s41Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s41Var.invalidate();
                break;
            default:
                a51 a51Var = (a51) this.b;
                a51Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a51Var.b = floatValue8;
                a51Var.setTranslationY(floatValue8);
                break;
        }
    }
}
