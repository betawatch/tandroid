package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class p70 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ((t70) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                s80 s80Var = (s80) this.b;
                s80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s80Var.s = floatValue;
                s80Var.d(floatValue);
                break;
            case 2:
                ae0 ae0Var = ((vd0) this.b).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ae0Var.P = floatValue2;
                ae0Var.f(floatValue2);
                break;
            case 3:
                ((og0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                sh0 sh0Var = (sh0) this.b;
                sh0Var.H.E = AndroidUtilities.lerp(sh0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 5:
                zj0 zj0Var = (zj0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zj0Var.e.setAlpha(floatValue3);
                zj0Var.h.setAlpha(1.0f - floatValue3);
                break;
            case 6:
                pk0 pk0Var = (pk0) this.b;
                pk0Var.B0 = ((Float) pk0Var.y0.getAnimatedValue()).floatValue();
                ci.n6 n6Var = pk0Var.S;
                if (n6Var != null) {
                    n6Var.invalidate();
                }
                pk0Var.invalidate();
                break;
            case 7:
                sr srVar = (sr) this.b;
                srVar.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                srVar.setScaleX(floatValue4);
                srVar.setScaleY(floatValue4);
                ((pk0) srVar.c).S.invalidate();
                break;
            case 8:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 9:
                nk0 nk0Var = (nk0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nk0Var.I = floatValue5;
                mk0 mk0Var = nk0Var.b;
                mk0Var.setScaleY(floatValue5 * (nk0Var.w ? 0.76f : 1.0f));
                mk0Var.setScaleX(nk0Var.I * (nk0Var.w ? 0.76f : 1.0f));
                break;
            case 10:
                am0 am0Var = (am0) this.b;
                am0Var.getClass();
                am0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                am0Var.invalidateSelf();
                break;
            case 11:
                mm0 mm0Var = (mm0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mm0Var.r = floatValue6;
                mm0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue6));
                mm0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, mm0Var.r));
                mm0Var.y.setAlpha(mm0Var.r);
                mm0Var.s.invalidate();
                mm0Var.v.invalidate();
                break;
            case 12:
                um0 um0Var = (um0) this.b;
                um0Var.getClass();
                um0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                um0Var.j();
                break;
            case 13:
                ((um0) ((qm0) this.b).b).invalidate();
                break;
            case 14:
                ym0 ym0Var = (ym0) this.b;
                ym0Var.getClass();
                ym0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                un0 un0Var = (un0) this.b;
                un0Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                un0Var.F = floatValue7;
                un0Var.setShown(floatValue7);
                un0Var.b(false);
                break;
            case 16:
                jp0 jp0Var = (jp0) this.b;
                jp0Var.getClass();
                jp0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jp0Var.invalidate();
                break;
            case 17:
                yp0 yp0Var = (yp0) this.b;
                uq0 uq0Var = yp0Var.b;
                uq0Var.u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uq0Var.c.invalidate();
                yp0Var.invalidate();
                break;
            case 18:
                ((bu) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                jv0 jv0Var = (jv0) this.b;
                jv0Var.M0(jv0Var.getTabProgress());
                break;
            case 20:
                ((cu0) this.b).h.invalidate();
                break;
            case 21:
                qv0 qv0Var = (qv0) this.b;
                qv0Var.getClass();
                qv0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qv0Var.invalidate();
                break;
            case 22:
                aw0 aw0Var = (aw0) ((androidx.activity.g) this.b).c;
                aw0Var.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aw0Var.N();
                break;
            case 23:
                ((hx0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                jx0 jx0Var = (jx0) this.b;
                jx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jx0Var.a();
                break;
            case 25:
                oy0 oy0Var = (oy0) this.b;
                oy0Var.getClass();
                oy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oy0Var.invalidate();
                break;
            case 26:
                ry0 ry0Var = (ry0) this.b;
                ry0Var.getClass();
                ry0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ry0Var.a.invalidate();
                break;
            case 27:
                i21 i21Var = (i21) this.b;
                i21Var.getClass();
                i21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i21Var.invalidate();
                break;
            case 28:
                l31 l31Var = (l31) this.b;
                l31Var.getClass();
                l31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l31Var.n();
                break;
            default:
                d51 d51Var = (d51) this.b;
                d51Var.getClass();
                d51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d51Var.invalidate();
                break;
        }
    }
}
