package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((k60) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                i70 i70Var = (i70) this.b;
                i70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i70Var.s = floatValue;
                i70Var.d(floatValue);
                break;
            case 2:
                fc0 fc0Var = ((zb0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fc0Var.b0 = floatValue2;
                fc0Var.h(floatValue2);
                break;
            case 3:
                qf0 qf0Var = (qf0) this.b;
                qf0Var.I.E = org.telegram.messenger.g0.T1(qf0Var.K, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 4:
                vh0 vh0Var = (vh0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vh0Var.e.setAlpha(floatValue3);
                vh0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 5:
                mi0 mi0Var = (mi0) this.b;
                mi0Var.C0 = ((Float) mi0Var.z0.getAnimatedValue()).floatValue();
                ai.j0 j0Var = mi0Var.T;
                if (j0Var != null) {
                    j0Var.invalidate();
                }
                mi0Var.invalidate();
                break;
            case 6:
                gr grVar = (gr) this.b;
                grVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                grVar.setScaleX(floatValue4);
                grVar.setScaleY(floatValue4);
                ((mi0) grVar.c).T.invalidate();
                break;
            case 7:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 8:
                ki0 ki0Var = (ki0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ki0Var.J = floatValue5;
                ji0 ji0Var = ki0Var.b;
                ji0Var.setScaleY(floatValue5 * (ki0Var.x ? 0.76f : 1.0f));
                ji0Var.setScaleX(ki0Var.J * (ki0Var.x ? 0.76f : 1.0f));
                break;
            case 9:
                ck0 ck0Var = (ck0) this.b;
                ck0Var.getClass();
                ck0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ck0Var.invalidateSelf();
                break;
            case 10:
                ok0 ok0Var = (ok0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ok0Var.r = floatValue6;
                ok0Var.E.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue6));
                ok0Var.E.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, ok0Var.r));
                ok0Var.E.setAlpha(ok0Var.r);
                ok0Var.s.invalidate();
                ok0Var.w.invalidate();
                break;
            case 11:
                wk0 wk0Var = (wk0) this.b;
                wk0Var.getClass();
                wk0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wk0Var.j();
                break;
            case 12:
                ((wk0) ((sk0) this.b).b).invalidate();
                break;
            case 13:
                al0 al0Var = (al0) this.b;
                al0Var.getClass();
                al0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 14:
                ul0 ul0Var = (ul0) this.b;
                ul0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ul0Var.G = floatValue7;
                ul0Var.setShown(floatValue7);
                ul0Var.b(false);
                break;
            case 15:
                gn0 gn0Var = (gn0) this.b;
                gn0Var.getClass();
                gn0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gn0Var.invalidate();
                break;
            case 16:
                un0 un0Var = (un0) this.b;
                po0 po0Var = un0Var.b;
                po0Var.q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                po0Var.n1.invalidate();
                un0Var.invalidate();
                break;
            case 17:
                ((ft) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                ys0 ys0Var = (ys0) this.b;
                ys0Var.Z0(ys0Var.getTabProgress());
                break;
            case 19:
                ((tr0) this.b).h.invalidate();
                break;
            case 20:
                jt0 jt0Var = (jt0) this.b;
                jt0Var.getClass();
                jt0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jt0Var.invalidate();
                break;
            case 21:
                ((av0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 22:
                cv0 cv0Var = (cv0) this.b;
                cv0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cv0Var.a();
                break;
            case 23:
                iw0 iw0Var = (iw0) this.b;
                iw0Var.getClass();
                iw0Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iw0Var.invalidate();
                break;
            case 24:
                lw0 lw0Var = (lw0) this.b;
                lw0Var.getClass();
                lw0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lw0Var.a.invalidate();
                break;
            case 25:
                b01 b01Var = (b01) this.b;
                b01Var.getClass();
                b01Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b01Var.invalidate();
                break;
            case 26:
                p11 p11Var = (p11) this.b;
                p11Var.getClass();
                p11Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p11Var.p();
                break;
            case 27:
                i31 i31Var = (i31) this.b;
                i31Var.getClass();
                i31Var.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i31Var.invalidate();
                break;
            case 28:
                v41 v41Var = (v41) this.b;
                v41Var.getClass();
                v41Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v41Var.invalidate();
                break;
            default:
                c51 c51Var = (c51) this.b;
                c51Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c51Var.b = floatValue8;
                c51Var.setTranslationY(floatValue8);
                break;
        }
    }
}
