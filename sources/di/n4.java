package di;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.w50;
import org.telegram.ui.ub1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                p4 p4Var = (p4) this.b;
                p4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p4Var.invalidate();
                break;
            case 1:
                ei.n nVar = (ei.n) this.b;
                nVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nVar.f.invalidate();
                break;
            case 2:
                fi.d0 d0Var = (fi.d0) this.b;
                d0Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.p.invalidate();
                break;
            case 3:
                jg.l1 l1Var = (jg.l1) this.b;
                l1Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l1Var.invalidate();
                int i7 = 0;
                while (i7 < 2) {
                    l1Var.c[i7].setTranslationX(org.telegram.messenger.g0.W1(l1Var.e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    l1Var.c[i7].setVisibility(0);
                    float f10 = 0.0f;
                    l1Var.c[i7].setAlpha(org.telegram.messenger.g0.T1(i7 == 0 ? 1.0f : 0.0f, i7 == 1 ? 1.0f : 0.0f, l1Var.e));
                    l1Var.d[i7].setTranslationX(org.telegram.messenger.g0.W1(l1Var.e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    l1Var.d[i7].setVisibility(0);
                    TextView textView = l1Var.d[i7];
                    float f11 = i7 == 0 ? 1.0f : 0.0f;
                    if (i7 == 1) {
                        f10 = 1.0f;
                    }
                    textView.setAlpha(org.telegram.messenger.g0.T1(f11, f10, l1Var.e));
                    i7++;
                }
                break;
            case 4:
                lg.k kVar = (lg.k) this.b;
                kVar.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.H = true;
                kVar.invalidate();
                break;
            case 5:
                lg.p pVar = (lg.p) this.b;
                pVar.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.H = true;
                pVar.invalidate();
                break;
            case 6:
                MediaController mediaController = (MediaController) this.b;
                mediaController.P1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.n0();
                break;
            case 7:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.b;
                o7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.invalidate();
                break;
            case 8:
                ((org.telegram.ui.Components.k9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 9:
                bi.q1 q1Var = ((w50) this.b).e.n1;
                int i10 = q1Var.C1;
                if (i10 != -1 && (view = q1Var.D1) != null) {
                    q1Var.k1(i10, view);
                    q1Var.invalidate();
                    break;
                }
                break;
            case 10:
                v61 v61Var = (v61) this.b;
                View[] viewArr = v61Var.e;
                if (v61Var.y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    v61Var.c = abs;
                    k61 k61Var = v61Var.M;
                    if (k61Var != null) {
                        k61Var.e(abs, v61Var.d, v61Var.b);
                    }
                }
                v61Var.x(false);
                break;
            case 11:
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.J = floatValue;
                org.telegram.ui.Components.voip.m1 m1Var = n1Var.i0;
                if (m1Var != null) {
                    ((ub1) m1Var).b.d0.d(n1Var.P, floatValue);
                }
                n1Var.invalidate();
                break;
            case 12:
                ug.p0 p0Var = (ug.p0) this.b;
                p0Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.e();
                break;
            case 13:
                ((ug.n0) this.b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((v4.u) this.b).y = valueAnimator.getAnimatedFraction();
                break;
        }
    }
}
