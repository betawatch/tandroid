package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l60 l60Var = ((k60) this.b).e;
                l60Var.f2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                l60Var.b.invalidate();
                break;
            case 1:
                a70 a70Var = (a70) this.b;
                a70Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w60 w60Var = a70Var.x;
                if (w60Var != null) {
                    w60Var.setProgress(floatValue);
                    break;
                }
                break;
            case 2:
                ((w60) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                v70 v70Var = (v70) this.b;
                v70Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v70Var.s = floatValue2;
                v70Var.d(floatValue2);
                break;
            case 4:
                qc0 qc0Var = ((kc0) this.b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc0Var.b0 = floatValue3;
                qc0Var.h(floatValue3);
                break;
            case 5:
                cg0 cg0Var = (cg0) this.b;
                cg0Var.I.E = org.telegram.messenger.g0.T1(cg0Var.K, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 6:
                gi0 gi0Var = (gi0) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gi0Var.e.setAlpha(floatValue4);
                gi0Var.h.setAlpha(1.0f - floatValue4);
                break;
            case 7:
                xi0 xi0Var = (xi0) this.b;
                xi0Var.C0 = ((Float) xi0Var.z0.getAnimatedValue()).floatValue();
                ai.l0 l0Var = xi0Var.T;
                if (l0Var != null) {
                    l0Var.invalidate();
                }
                xi0Var.invalidate();
                break;
            case 8:
                pr prVar = (pr) this.b;
                prVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                prVar.setScaleX(floatValue5);
                prVar.setScaleY(floatValue5);
                ((xi0) prVar.c).T.invalidate();
                break;
            case 9:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 10:
                vi0 vi0Var = (vi0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi0Var.J = floatValue6;
                ui0 ui0Var = vi0Var.b;
                ui0Var.setScaleY(floatValue6 * (vi0Var.x ? 0.76f : 1.0f));
                ui0Var.setScaleX(vi0Var.J * (vi0Var.x ? 0.76f : 1.0f));
                break;
            case 11:
                mk0 mk0Var = (mk0) this.b;
                mk0Var.getClass();
                mk0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mk0Var.invalidateSelf();
                break;
            case 12:
                yk0 yk0Var = (yk0) this.b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yk0Var.r = floatValue7;
                yk0Var.E.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, floatValue7));
                yk0Var.E.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, yk0Var.r));
                yk0Var.E.setAlpha(yk0Var.r);
                yk0Var.s.invalidate();
                yk0Var.w.invalidate();
                break;
            case 13:
                gl0 gl0Var = (gl0) this.b;
                gl0Var.getClass();
                gl0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gl0Var.j();
                break;
            case 14:
                ((gl0) ((cl0) this.b).b).invalidate();
                break;
            case 15:
                kl0 kl0Var = (kl0) this.b;
                kl0Var.getClass();
                kl0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                em0 em0Var = (em0) this.b;
                em0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                em0Var.G = floatValue8;
                em0Var.setShown(floatValue8);
                em0Var.b(false);
                break;
            case 17:
                rn0 rn0Var = (rn0) this.b;
                rn0Var.getClass();
                rn0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rn0Var.invalidate();
                break;
            case 18:
                fo0 fo0Var = (fo0) this.b;
                ap0 ap0Var = fo0Var.b;
                ap0Var.q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ap0Var.n1.invalidate();
                fo0Var.invalidate();
                break;
            case 19:
                ((ot) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                jt0 jt0Var = (jt0) this.b;
                jt0Var.Z0(jt0Var.getTabProgress());
                break;
            case 21:
                ((ds0) this.b).h.invalidate();
                break;
            case 22:
                ut0 ut0Var = (ut0) this.b;
                ut0Var.getClass();
                ut0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ut0Var.invalidate();
                break;
            case 23:
                ((lv0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                nv0 nv0Var = (nv0) this.b;
                nv0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nv0Var.a();
                break;
            case 25:
                rw0 rw0Var = (rw0) this.b;
                rw0Var.getClass();
                rw0Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rw0Var.invalidate();
                break;
            case 26:
                uw0 uw0Var = (uw0) this.b;
                uw0Var.getClass();
                uw0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uw0Var.a.invalidate();
                break;
            case 27:
                k01 k01Var = (k01) this.b;
                k01Var.getClass();
                k01Var.N = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k01Var.invalidate();
                break;
            case 28:
                a21 a21Var = (a21) this.b;
                a21Var.getClass();
                a21Var.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a21Var.p();
                break;
            default:
                v31 v31Var = (v31) this.b;
                v31Var.getClass();
                v31Var.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v31Var.invalidate();
                break;
        }
    }
}
