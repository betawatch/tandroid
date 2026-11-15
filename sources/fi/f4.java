package fi;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.z50;
import org.telegram.ui.pb1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class f4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                h4 h4Var = (h4) this.b;
                h4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h4Var.invalidate();
                break;
            case 1:
                gi.m mVar = (gi.m) this.b;
                mVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mVar.f.invalidate();
                break;
            case 2:
                hi.d0 d0Var = (hi.d0) this.b;
                d0Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.p.invalidate();
                break;
            case 3:
                jg.k1 k1Var = (jg.k1) this.b;
                k1Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1Var.invalidate();
                int i7 = 0;
                while (i7 < 2) {
                    k1Var.c[i7].setTranslationX(org.telegram.messenger.g0.W1(k1Var.e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    k1Var.c[i7].setVisibility(0);
                    float f10 = 0.0f;
                    k1Var.c[i7].setAlpha(org.telegram.messenger.g0.T1(i7 == 0 ? 1.0f : 0.0f, i7 == 1 ? 1.0f : 0.0f, k1Var.e));
                    k1Var.d[i7].setTranslationX(org.telegram.messenger.g0.W1(k1Var.e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    k1Var.d[i7].setVisibility(0);
                    TextView textView = k1Var.d[i7];
                    float f11 = i7 == 0 ? 1.0f : 0.0f;
                    if (i7 == 1) {
                        f10 = 1.0f;
                    }
                    textView.setAlpha(org.telegram.messenger.g0.T1(f11, f10, k1Var.e));
                    i7++;
                }
                break;
            case 4:
                lg.k kVar = (lg.k) this.b;
                kVar.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.I = true;
                kVar.invalidate();
                break;
            case 5:
                lg.p pVar = (lg.p) this.b;
                pVar.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.I = true;
                pVar.invalidate();
                break;
            case 6:
                MediaController mediaController = (MediaController) this.b;
                mediaController.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.n0();
                break;
            case 7:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.b;
                n7Var.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7Var.invalidate();
                break;
            case 8:
                ((org.telegram.ui.Components.i9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 9:
                di.c1 c1Var = ((z50) this.b).e.o1;
                int i10 = c1Var.D1;
                if (i10 != -1 && (view = c1Var.E1) != null) {
                    c1Var.k1(i10, view);
                    c1Var.invalidate();
                    break;
                }
                break;
            case 10:
                w61 w61Var = (w61) this.b;
                View[] viewArr = w61Var.e;
                if (w61Var.y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    w61Var.c = abs;
                    l61 l61Var = w61Var.N;
                    if (l61Var != null) {
                        l61Var.e(abs, w61Var.d, w61Var.b);
                    }
                }
                w61Var.u(false);
                break;
            case 11:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.K = floatValue;
                org.telegram.ui.Components.voip.q1 q1Var = r1Var.j0;
                if (q1Var != null) {
                    ((pb1) q1Var).b.e0.d(r1Var.Q, floatValue);
                }
                r1Var.invalidate();
                break;
            case 12:
                ug.q0 q0Var = (ug.q0) this.b;
                q0Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var.e();
                break;
            case 13:
                ((ug.o0) this.b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((v4.u) this.b).y = valueAnimator.getAnimatedFraction();
                break;
        }
    }
}
