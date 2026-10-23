package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b80 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i80 i80Var = (i80) this.b;
                i80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g80 g80Var = i80Var.x;
                if (g80Var != null) {
                    g80Var.setProgress(floatValue);
                    break;
                }
                break;
            case 1:
                ((g80) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                e90 e90Var = (e90) this.b;
                e90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e90Var.s = floatValue2;
                e90Var.d(floatValue2);
                break;
            case 3:
                me0 me0Var = ((ge0) this.b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                me0Var.a0 = floatValue3;
                me0Var.h(floatValue3);
                break;
            case 4:
                ((ah0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                fi0 fi0Var = (fi0) this.b;
                fi0Var.H.E = AndroidUtilities.lerp(fi0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 6:
                nk0 nk0Var = (nk0) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nk0Var.e.setAlpha(floatValue4);
                nk0Var.h.setAlpha(1.0f - floatValue4);
                break;
            case 7:
                dl0 dl0Var = (dl0) this.b;
                dl0Var.B0 = ((Float) dl0Var.y0.getAnimatedValue()).floatValue();
                ah.v vVar = dl0Var.S;
                if (vVar != null) {
                    vVar.invalidate();
                }
                dl0Var.invalidate();
                break;
            case 8:
                ds dsVar = (ds) this.b;
                dsVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dsVar.setScaleX(floatValue5);
                dsVar.setScaleY(floatValue5);
                ((dl0) dsVar.c).S.invalidate();
                break;
            case 9:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 10:
                bl0 bl0Var = (bl0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bl0Var.I = floatValue6;
                al0 al0Var = bl0Var.b;
                al0Var.setScaleY(floatValue6 * (bl0Var.w ? 0.76f : 1.0f));
                al0Var.setScaleX(bl0Var.I * (bl0Var.w ? 0.76f : 1.0f));
                break;
            case 11:
                om0 om0Var = (om0) this.b;
                om0Var.getClass();
                om0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                om0Var.invalidateSelf();
                break;
            case 12:
                zm0 zm0Var = (zm0) this.b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zm0Var.r = floatValue7;
                zm0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                zm0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, zm0Var.r));
                zm0Var.y.setAlpha(zm0Var.r);
                zm0Var.s.invalidate();
                zm0Var.v.invalidate();
                break;
            case 13:
                hn0 hn0Var = (hn0) this.b;
                hn0Var.getClass();
                hn0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hn0Var.j();
                break;
            case 14:
                ((hn0) ((dn0) this.b).b).invalidate();
                break;
            case 15:
                ln0 ln0Var = (ln0) this.b;
                ln0Var.getClass();
                ln0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                go0 go0Var = (go0) this.b;
                go0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                go0Var.F = floatValue8;
                go0Var.setShown(floatValue8);
                go0Var.b(false);
                break;
            case 17:
                tp0 tp0Var = (tp0) this.b;
                tp0Var.getClass();
                tp0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tp0Var.invalidate();
                break;
            case 18:
                iq0 iq0Var = (iq0) this.b;
                fr0 fr0Var = iq0Var.b;
                fr0Var.v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fr0Var.c.invalidate();
                iq0Var.invalidate();
                break;
            case 19:
                ((iu) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                uv0 uv0Var = (uv0) this.b;
                uv0Var.O0(uv0Var.getTabProgress());
                break;
            case 21:
                ((nu0) this.b).h.invalidate();
                break;
            case 22:
                bw0 bw0Var = (bw0) this.b;
                bw0Var.getClass();
                bw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bw0Var.invalidate();
                break;
            case 23:
                lw0 lw0Var = (lw0) ((androidx.activity.g) this.b).c;
                lw0Var.f0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lw0Var.N();
                break;
            case 24:
                ((rx0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 25:
                tx0 tx0Var = (tx0) this.b;
                tx0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tx0Var.a();
                break;
            case 26:
                xy0 xy0Var = (xy0) this.b;
                xy0Var.getClass();
                xy0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xy0Var.invalidate();
                break;
            case 27:
                az0 az0Var = (az0) this.b;
                az0Var.getClass();
                az0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                az0Var.a.invalidate();
                break;
            case 28:
                r21 r21Var = (r21) this.b;
                r21Var.getClass();
                r21Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r21Var.invalidate();
                break;
            default:
                s31 s31Var = (s31) this.b;
                s31Var.getClass();
                s31Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s31Var.n();
                break;
        }
    }
}
