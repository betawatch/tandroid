package fi;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.p9;
import org.telegram.ui.qb1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class d4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                f4 f4Var = (f4) this.b;
                f4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f4Var.invalidate();
                break;
            case 1:
                gi.m mVar = (gi.m) this.b;
                mVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mVar.f.invalidate();
                break;
            case 2:
                hi.m0 m0Var = (hi.m0) this.b;
                m0Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.p.invalidate();
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
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.b;
                o7Var.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.invalidate();
                break;
            case 8:
                ((p9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 9:
                di.b1 b1Var = ((h60) this.b).e.o1;
                int i10 = b1Var.D1;
                if (i10 != -1 && (view = b1Var.E1) != null) {
                    b1Var.k1(i10, view);
                    b1Var.invalidate();
                    break;
                }
                break;
            case 10:
                k71 k71Var = (k71) this.b;
                View[] viewArr = k71Var.e;
                if (k71Var.y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    k71Var.c = abs;
                    a71 a71Var = k71Var.N;
                    if (a71Var != null) {
                        a71Var.f(abs, k71Var.d, k71Var.b);
                    }
                }
                k71Var.u(false);
                break;
            case 11:
                org.telegram.ui.Components.voip.r1 r1Var = (org.telegram.ui.Components.voip.r1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.K = floatValue;
                org.telegram.ui.Components.voip.q1 q1Var = r1Var.j0;
                if (q1Var != null) {
                    ((qb1) q1Var).b.e0.d(r1Var.Q, floatValue);
                }
                r1Var.invalidate();
                break;
            case 12:
                ug.r0 r0Var = (ug.r0) this.b;
                r0Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.e();
                break;
            case 13:
                ((ug.p0) this.b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((v4.v) this.b).y = valueAnimator.getAnimatedFraction();
                break;
        }
    }
}
