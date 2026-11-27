// default package

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ch4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ch4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                eh4 eh4Var = (eh4) obj;
                eh4Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ImageView imageView = eh4Var.c;
                imageView.setAlpha(floatValue);
                float f = (floatValue * 0.5f) + 0.5f;
                imageView.setScaleX(f);
                imageView.setScaleY(f);
                View view = eh4Var.f;
                float f2 = 1.0f - floatValue;
                view.setAlpha(f2);
                float f3 = (f2 * 0.5f) + 0.5f;
                view.setScaleX(f3);
                view.setScaleY(f3);
                break;
            case 1:
                rk4 rk4Var = (rk4) obj;
                rk4Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rk4Var.i();
                break;
            case 2:
                sk4 sk4Var = (sk4) obj;
                sk4Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sk4Var.invalidate();
                break;
            case 3:
                ((xl4) obj).o.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                ((au4) obj).l1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                j95 j95Var = (j95) obj;
                j95Var.O2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j95Var.K1(true);
                j95Var.o1.invalidate();
                j95Var.J1.invalidate();
                break;
            case 6:
                x85 x85Var = (x85) obj;
                x85Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x85Var.a.invalidate();
                break;
            case 7:
                z85 z85Var = (z85) obj;
                z85Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j95 j95Var2 = z85Var.L;
                j95Var2.J1.invalidate();
                j95Var2.T3.invalidate();
                j95Var2.b.invalidate();
                j95Var2.G1();
                break;
            case 8:
                ra5 ra5Var = (ra5) obj;
                pa5 pa5Var = ra5Var.a;
                if (!ra5Var.H) {
                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    ra5Var.d0 = floatValue2;
                    ra5Var.W.setPinnedProgress(floatValue2);
                    pa5Var.setScaleX(1.0f - (ra5Var.d0 * 0.6f));
                    pa5Var.setScaleY(1.0f - (ra5Var.d0 * 0.6f));
                    if (ra5Var.Y) {
                        ra5Var.j();
                        break;
                    }
                }
                break;
            case 9:
                za5 za5Var = (za5) obj;
                za5Var.r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                za5Var.d();
                break;
            case 10:
                bd5 bd5Var = (bd5) obj;
                de0 de0Var = bd5Var.a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f4 = bd5Var.I ? 1.0f - (0.18f * floatValue3) : 0.82f + (0.18f * floatValue3);
                de0Var.setScaleX(f4);
                de0Var.setScaleY(f4);
                if (!bd5Var.I) {
                    floatValue3 = 1.0f - floatValue3;
                }
                bd5Var.J = floatValue3;
                bd5Var.invalidate();
                break;
            case 11:
                kg5 kg5Var = (kg5) obj;
                kg5Var.A0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                kg5Var.invalidate();
                break;
            case 12:
                ao5 ao5Var = (ao5) obj;
                ao5Var.getClass();
                ao5Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 13:
                lt5 lt5Var = (lt5) obj;
                lt5Var.b2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lt5Var.b.invalidate();
                break;
            case 14:
                lt5 lt5Var2 = ((kt5) obj).e;
                lt5Var2.e2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                lt5Var2.b.invalidate();
                break;
            case 15:
                ((bu5) obj).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bu5 bu5Var = ((fu5) obj).x;
                if (bu5Var != null) {
                    bu5Var.setProgress(floatValue4);
                    break;
                }
                break;
            case 17:
                nw5 nw5Var = (nw5) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nw5Var.s = floatValue5;
                nw5Var.d(floatValue5);
                break;
            case 18:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i = LimitPreviewView.p0;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.c0 = floatValue6 < 0.5f ? (floatValue6 / 0.5f) * (-7.0f) : (1.0f - ((floatValue6 - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 19:
                v86 v86Var = (v86) obj;
                v86Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v86Var.invalidateSelf();
                break;
            case 20:
                b58 b58Var = (b58) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b58Var.c.setAlpha(floatValue7);
                b58Var.a.setAlpha(hl.R1(0.0f, 0.5f, floatValue7));
                b58Var.invalidate();
                break;
            case 21:
                ((o96) obj).invalidate();
                break;
            case 22:
                h96 h96Var = (h96) obj;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = h96Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (hl.R1(h96Var.f, 1.0f, floatValue8) * 255.0f));
                    h96Var.h.invalidate();
                    break;
                }
                break;
            case 23:
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h96 h96Var2 = (h96) ((ad5) obj).b;
                Drawable drawable2 = h96Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (hl.R1(1.0f, h96Var2.f, floatValue9) * 255.0f));
                    h96Var2.h.invalidate();
                    break;
                }
                break;
            case 24:
                ((uc6) obj).u0();
                break;
            case 25:
                ((gc8) obj).L.f0.invalidate();
                break;
            case 26:
                ((mj7) obj).invalidate();
                break;
            case 27:
                lm7 lm7Var = (lm7) obj;
                lm7Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lm7Var.P0();
                break;
            case 28:
                ro7 ro7Var = (ro7) obj;
                ro7Var.f = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                ro7Var.invalidate();
                break;
            default:
                bv7 bv7Var = (bv7) obj;
                bv7Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bv7Var.invalidate();
                break;
        }
    }
}
