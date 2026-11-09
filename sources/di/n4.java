package di;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.x50;
import org.telegram.ui.sb1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                ((org.telegram.ui.Components.l9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 9:
                bi.q1 q1Var = ((x50) this.b).e.k1;
                int i10 = q1Var.C1;
                if (i10 != -1 && (view = q1Var.D1) != null) {
                    q1Var.k1(i10, view);
                    q1Var.invalidate();
                    break;
                }
                break;
            case 10:
                w61 w61Var = (w61) this.b;
                View[] viewArr = w61Var.e;
                if (w61Var.y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    w61Var.c = abs;
                    l61 l61Var = w61Var.M;
                    if (l61Var != null) {
                        l61Var.e(abs, w61Var.d, w61Var.b);
                    }
                }
                w61Var.x(false);
                break;
            case 11:
                org.telegram.ui.Components.voip.n1 n1Var = (org.telegram.ui.Components.voip.n1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.J = floatValue;
                org.telegram.ui.Components.voip.m1 m1Var = n1Var.i0;
                if (m1Var != null) {
                    ((sb1) m1Var).b.d0.d(n1Var.P, floatValue);
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
