package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y50 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y50(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((d60) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                b70 b70Var = (b70) this.b;
                b70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b70Var.s = floatValue;
                b70Var.d(floatValue);
                break;
            case 2:
                zb0 zb0Var = ((tb0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zb0Var.b0 = floatValue2;
                zb0Var.h(floatValue2);
                break;
            case 3:
                ((ie0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                qf0 qf0Var = (qf0) this.b;
                qf0Var.I.E = org.telegram.messenger.g0.T1(qf0Var.K, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 5:
                uh0 uh0Var = (uh0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uh0Var.e.setAlpha(floatValue3);
                uh0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 6:
                li0 li0Var = (li0) this.b;
                li0Var.C0 = ((Float) li0Var.z0.getAnimatedValue()).floatValue();
                ai.c0 c0Var = li0Var.T;
                if (c0Var != null) {
                    c0Var.invalidate();
                }
                li0Var.invalidate();
                break;
            case 7:
                zq zqVar = (zq) this.b;
                zqVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zqVar.setScaleX(floatValue4);
                zqVar.setScaleY(floatValue4);
                ((li0) zqVar.c).T.invalidate();
                break;
            case 8:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 9:
                ji0 ji0Var = (ji0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ji0Var.J = floatValue5;
                ii0 ii0Var = ji0Var.b;
                ii0Var.setScaleY(floatValue5 * (ji0Var.x ? 0.76f : 1.0f));
                ii0Var.setScaleX(ji0Var.J * (ji0Var.x ? 0.76f : 1.0f));
                break;
            case 10:
                bk0 bk0Var = (bk0) this.b;
                bk0Var.getClass();
                bk0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bk0Var.invalidateSelf();
                break;
            case 11:
                nk0 nk0Var = (nk0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nk0Var.r = floatValue6;
                nk0Var.E.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue6));
                nk0Var.E.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, nk0Var.r));
                nk0Var.E.setAlpha(nk0Var.r);
                nk0Var.s.invalidate();
                nk0Var.w.invalidate();
                break;
            case 12:
                vk0 vk0Var = (vk0) this.b;
                vk0Var.getClass();
                vk0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vk0Var.j();
                break;
            case 13:
                ((vk0) ((rk0) this.b).b).invalidate();
                break;
            case 14:
                zk0 zk0Var = (zk0) this.b;
                zk0Var.getClass();
                zk0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                tl0 tl0Var = (tl0) this.b;
                tl0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tl0Var.G = floatValue7;
                tl0Var.setShown(floatValue7);
                tl0Var.b(false);
                break;
            case 16:
                fn0 fn0Var = (fn0) this.b;
                fn0Var.getClass();
                fn0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fn0Var.invalidate();
                break;
            case 17:
                tn0 tn0Var = (tn0) this.b;
                oo0 oo0Var = tn0Var.b;
                oo0Var.n2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oo0Var.k1.invalidate();
                tn0Var.invalidate();
                break;
            case 18:
                ((xs) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                ws0 ws0Var = (ws0) this.b;
                ws0Var.X0(ws0Var.getTabProgress());
                break;
            case 20:
                ((rr0) this.b).h.invalidate();
                break;
            case 21:
                ht0 ht0Var = (ht0) this.b;
                ht0Var.getClass();
                ht0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ht0Var.invalidate();
                break;
            case 22:
                ((xu0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                zu0 zu0Var = (zu0) this.b;
                zu0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu0Var.a();
                break;
            case 24:
                ew0 ew0Var = (ew0) this.b;
                ew0Var.getClass();
                ew0Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ew0Var.invalidate();
                break;
            case 25:
                hw0 hw0Var = (hw0) this.b;
                hw0Var.getClass();
                hw0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hw0Var.a.invalidate();
                break;
            case 26:
                yz0 yz0Var = (yz0) this.b;
                yz0Var.getClass();
                yz0Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yz0Var.invalidate();
                break;
            case 27:
                n01 n01Var = (n01) this.b;
                n01Var.getClass();
                n01Var.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 28:
                g11 g11Var = (g11) this.b;
                g11Var.getClass();
                g11Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g11Var.p();
                break;
            default:
                y21 y21Var = (y21) this.b;
                y21Var.getClass();
                y21Var.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y21Var.invalidate();
                break;
        }
    }
}
