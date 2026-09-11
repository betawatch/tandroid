package bi;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.y71;
import org.telegram.ui.ci1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class u5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                w5 w5Var = (w5) this.b;
                w5Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.invalidate();
                break;
            case 1:
                ci.t tVar = (ci.t) this.b;
                tVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.f.invalidate();
                break;
            case 2:
                di.d0 d0Var = (di.d0) this.b;
                d0Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.p.invalidate();
                break;
            case 3:
                hg.n1 n1Var = (hg.n1) this.b;
                n1Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.invalidate();
                int i10 = 0;
                while (i10 < 2) {
                    n1Var.c[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.e));
                    n1Var.c[i10].setVisibility(0);
                    float f7 = 0.0f;
                    n1Var.c[i10].setAlpha(AndroidUtilities.lerp(i10 == 0 ? 1.0f : 0.0f, i10 == 1 ? 1.0f : 0.0f, n1Var.e));
                    n1Var.d[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.e));
                    n1Var.d[i10].setVisibility(0);
                    TextView textView = n1Var.d[i10];
                    float f10 = i10 == 0 ? 1.0f : 0.0f;
                    if (i10 == 1) {
                        f7 = 1.0f;
                    }
                    textView.setAlpha(AndroidUtilities.lerp(f10, f7, n1Var.e));
                    i10++;
                }
                break;
            case 4:
                jg.k kVar = (jg.k) this.b;
                kVar.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.H = true;
                kVar.invalidate();
                break;
            case 5:
                jg.p pVar = (jg.p) this.b;
                pVar.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.H = true;
                pVar.invalidate();
                break;
            case 6:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.b;
                t7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.invalidate();
                break;
            case 7:
                ((org.telegram.ui.Components.x9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 8:
                o0 o0Var = ((a70) this.b).e.d;
                int i11 = o0Var.E1;
                if (i11 != -1 && (view = o0Var.F1) != null) {
                    o0Var.h1(i11, view);
                    o0Var.invalidate();
                    break;
                }
                break;
            case 9:
                i81 i81Var = (i81) this.b;
                View[] viewArr = i81Var.e;
                if (i81Var.x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    i81Var.c = abs;
                    y71 y71Var = i81Var.M;
                    if (y71Var != null) {
                        y71Var.e(abs, i81Var.d, i81Var.b);
                    }
                }
                i81Var.w(false);
                break;
            case 10:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.J = floatValue;
                org.telegram.ui.Components.voip.r1 r1Var = s1Var.i0;
                if (r1Var != null) {
                    ((ci1) r1Var).b.d0.d(floatValue, s1Var.P);
                }
                s1Var.invalidate();
                break;
            case 11:
                ((s4.u) this.b).x = valueAnimator.getAnimatedFraction();
                break;
            case 12:
                sg.r0 r0Var = (sg.r0) this.b;
                r0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.e();
                break;
            default:
                ((sg.o0) this.b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
