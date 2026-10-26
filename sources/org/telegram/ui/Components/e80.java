package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e80 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k80 k80Var = (k80) this.b;
                k80Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i80 i80Var = k80Var.x;
                if (i80Var != null) {
                    i80Var.setProgress(floatValue);
                    break;
                }
                break;
            case 1:
                ((i80) this.b).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                g90 g90Var = (g90) this.b;
                g90Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g90Var.s = floatValue2;
                g90Var.d(floatValue2);
                break;
            case 3:
                le0 le0Var = ((fe0) this.b).d;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                le0Var.a0 = floatValue3;
                le0Var.h(floatValue3);
                break;
            case 4:
                ((ch0) this.b).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                hi0 hi0Var = (hi0) this.b;
                hi0Var.H.E = AndroidUtilities.lerp(hi0Var.J, 0.0f, valueAnimator.getAnimatedFraction());
                break;
            case 6:
                pk0 pk0Var = (pk0) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pk0Var.e.setAlpha(floatValue4);
                pk0Var.h.setAlpha(1.0f - floatValue4);
                break;
            case 7:
                fl0 fl0Var = (fl0) this.b;
                fl0Var.B0 = ((Float) fl0Var.y0.getAnimatedValue()).floatValue();
                bh.p pVar = fl0Var.S;
                if (pVar != null) {
                    pVar.invalidate();
                }
                fl0Var.invalidate();
                break;
            case 8:
                fs fsVar = (fs) this.b;
                fsVar.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fsVar.setScaleX(floatValue5);
                fsVar.setScaleY(floatValue5);
                ((fl0) fsVar.c).S.invalidate();
                break;
            case 9:
                ((q0.a) this.b).accept((Float) valueAnimator.getAnimatedValue());
                break;
            case 10:
                dl0 dl0Var = (dl0) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dl0Var.I = floatValue6;
                cl0 cl0Var = dl0Var.b;
                cl0Var.setScaleY(floatValue6 * (dl0Var.w ? 0.76f : 1.0f));
                cl0Var.setScaleX(dl0Var.I * (dl0Var.w ? 0.76f : 1.0f));
                break;
            case 11:
                um0 um0Var = (um0) this.b;
                um0Var.getClass();
                um0Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                um0Var.invalidateSelf();
                break;
            case 12:
                hn0 hn0Var = (hn0) this.b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hn0Var.r = floatValue7;
                hn0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, floatValue7));
                hn0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, hn0Var.r));
                hn0Var.y.setAlpha(hn0Var.r);
                hn0Var.s.invalidate();
                hn0Var.v.invalidate();
                break;
            case 13:
                pn0 pn0Var = (pn0) this.b;
                pn0Var.getClass();
                pn0Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pn0Var.j();
                break;
            case 14:
                ((pn0) ((ln0) this.b).b).invalidate();
                break;
            case 15:
                tn0 tn0Var = (tn0) this.b;
                tn0Var.getClass();
                tn0Var.setScrollX((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                oo0 oo0Var = (oo0) this.b;
                oo0Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oo0Var.F = floatValue8;
                oo0Var.setShown(floatValue8);
                oo0Var.b(false);
                break;
            case 17:
                cq0 cq0Var = (cq0) this.b;
                cq0Var.getClass();
                cq0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cq0Var.invalidate();
                break;
            case 18:
                qq0 qq0Var = (qq0) this.b;
                mr0 mr0Var = qq0Var.b;
                mr0Var.v0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mr0Var.c.invalidate();
                qq0Var.invalidate();
                break;
            case 19:
                ((ju) this.b).setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                aw0 aw0Var = (aw0) this.b;
                aw0Var.T0(aw0Var.getTabProgress());
                break;
            case 21:
                ((tu0) this.b).h.invalidate();
                break;
            case 22:
                mw0 mw0Var = (mw0) this.b;
                mw0Var.getClass();
                mw0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mw0Var.invalidate();
                break;
            case 23:
                ((by0) this.b).setCategoriesShownT(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 24:
                ey0 ey0Var = (ey0) this.b;
                ey0Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ey0Var.a();
                break;
            case 25:
                jz0 jz0Var = (jz0) this.b;
                jz0Var.getClass();
                jz0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jz0Var.invalidate();
                break;
            case 26:
                mz0 mz0Var = (mz0) this.b;
                mz0Var.getClass();
                mz0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mz0Var.a.invalidate();
                break;
            case 27:
                d31 d31Var = (d31) this.b;
                d31Var.getClass();
                d31Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d31Var.invalidate();
                break;
            case 28:
                e41 e41Var = (e41) this.b;
                e41Var.getClass();
                e41Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e41Var.o();
                break;
            default:
                a61 a61Var = (a61) this.b;
                a61Var.getClass();
                a61Var.q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a61Var.invalidate();
                break;
        }
    }
}
