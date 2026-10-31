package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((x60) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                y70 y70Var = (y70) this.b;
                y70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y70Var.s = floatValue;
                y70Var.d(floatValue);
                break;
            case 2:
                zc0 zc0Var = ((sc0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zc0Var.a0 = floatValue2;
                zc0Var.h(floatValue2);
                break;
            case 3:
                ((jf0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                pg0 pg0Var = (pg0) this.b;
                pg0Var.H.E = org.telegram.messenger.i0.T1(pg0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 5:
                vi0 vi0Var = (vi0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi0Var.e.setAlpha(floatValue3);
                vi0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 6:
                mj0 mj0Var = (mj0) this.b;
                mj0Var.B0 = ((Float) mj0Var.y0.getAnimatedValue()).floatValue();
                fg.i iVar = mj0Var.S;
                if (iVar != null) {
                    iVar.invalidate();
                }
                mj0Var.invalidate();
                break;
            case 7:
                ir irVar = (ir) this.b;
                irVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                irVar.setScaleX(floatValue4);
                irVar.setScaleY(floatValue4);
                ((mj0) irVar.c).S.invalidate();
                break;
            case 8:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 9:
                kj0 kj0Var = (kj0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kj0Var.I = floatValue5;
                jj0 jj0Var = kj0Var.b;
                jj0Var.setScaleY(floatValue5 * (kj0Var.x ? 0.76f : 1.0f));
                jj0Var.setScaleX(kj0Var.I * (kj0Var.x ? 0.76f : 1.0f));
                break;
            case 10:
                bl0 bl0Var = (bl0) this.b;
                bl0Var.getClass();
                bl0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bl0Var.invalidateSelf();
                break;
            case 11:
                nl0 nl0Var = (nl0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nl0Var.r = floatValue6;
                nl0Var.D.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, floatValue6));
                nl0Var.D.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, nl0Var.r));
                nl0Var.D.setAlpha(nl0Var.r);
                nl0Var.s.invalidate();
                nl0Var.w.invalidate();
                break;
            case 12:
                ul0 ul0Var = (ul0) this.b;
                ul0Var.getClass();
                ul0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ul0Var.j();
                break;
            case 13:
                ((ul0) ((rl0) this.b).b).invalidate();
                break;
            case 14:
                yl0 yl0Var = (yl0) this.b;
                yl0Var.getClass();
                yl0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                rm0 rm0Var = (rm0) this.b;
                rm0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rm0Var.F = floatValue7;
                rm0Var.setShown(floatValue7);
                rm0Var.b(false);
                break;
            case 16:
                do0 do0Var = (do0) this.b;
                do0Var.getClass();
                do0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                do0Var.invalidate();
                break;
            case 17:
                so0 so0Var = (so0) this.b;
                op0 op0Var = so0Var.b;
                op0Var.m2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                op0Var.j1.invalidate();
                so0Var.invalidate();
                break;
            case 18:
                ((mt) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                zt0 zt0Var = (zt0) this.b;
                zt0Var.U0(zt0Var.getTabProgress());
                break;
            case 20:
                ((ss0) this.b).h.invalidate();
                break;
            case 21:
                lu0 lu0Var = (lu0) this.b;
                lu0Var.getClass();
                lu0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lu0Var.invalidate();
                break;
            case 22:
                ((bw0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 23:
                dw0 dw0Var = (dw0) this.b;
                dw0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dw0Var.a();
                break;
            case 24:
                jx0 jx0Var = (jx0) this.b;
                jx0Var.getClass();
                jx0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jx0Var.invalidate();
                break;
            case 25:
                mx0 mx0Var = (mx0) this.b;
                mx0Var.getClass();
                mx0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mx0Var.a.invalidate();
                break;
            case 26:
                e11 e11Var = (e11) this.b;
                e11Var.getClass();
                e11Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e11Var.invalidate();
                break;
            case 27:
                t11 t11Var = (t11) this.b;
                t11Var.getClass();
                t11Var.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 28:
                o21 o21Var = (o21) this.b;
                o21Var.getClass();
                o21Var.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o21Var.p();
                break;
            default:
                g41 g41Var = (g41) this.b;
                g41Var.getClass();
                g41Var.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g41Var.invalidate();
                break;
        }
    }
}
