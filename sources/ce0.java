// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ce0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ce0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((mb0) obj).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 1:
                gr0 gr0Var = (gr0) obj;
                gr0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gr0Var.f.invalidate();
                break;
            case 2:
                zu1 zu1Var = (zu1) obj;
                zu1Var.Ia = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1Var.m1.invalidate();
                break;
            case 3:
                jl2 jl2Var = (jl2) obj;
                jl2Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jl2Var.p.invalidate();
                break;
            case 4:
                uj3 uj3Var = (uj3) obj;
                uj3Var.I0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = uj3Var.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 5:
                tp3 tp3Var = (tp3) obj;
                tp3Var.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tp3Var.I = true;
                tp3Var.invalidate();
                break;
            case 6:
                gw9 gw9Var = ((kt5) obj).e.n1;
                int i = gw9Var.D1;
                if (i != -1 && (view = gw9Var.E1) != null) {
                    gw9Var.m1(i, view);
                    gw9Var.invalidate();
                    break;
                }
                break;
            case 7:
                ((hu5) obj).y = valueAnimator.getAnimatedFraction();
                break;
            case 8:
                MediaController mediaController = (MediaController) obj;
                mediaController.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.p0();
                break;
            case 9:
                xc7 xc7Var = (xc7) obj;
                xc7Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xc7Var.invalidate();
                int i2 = 0;
                while (i2 < 2) {
                    xc7Var.c[i2].setTranslationX(hl.U1(xc7Var.e, 0, -hl.L(62.0f)));
                    xc7Var.c[i2].setVisibility(0);
                    float f = 0.0f;
                    xc7Var.c[i2].setAlpha(hl.R1(i2 == 0 ? 1.0f : 0.0f, i2 == 1 ? 1.0f : 0.0f, xc7Var.e));
                    xc7Var.d[i2].setTranslationX(hl.U1(xc7Var.e, 0, -hl.L(62.0f)));
                    xc7Var.d[i2].setVisibility(0);
                    TextView textView = xc7Var.d[i2];
                    float f2 = i2 == 0 ? 1.0f : 0.0f;
                    if (i2 == 1) {
                        f = 1.0f;
                    }
                    textView.setAlpha(hl.R1(f2, f, xc7Var.e));
                    i2++;
                }
                break;
            case 10:
                ok8 ok8Var = (ok8) obj;
                ok8Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ok8Var.e();
                break;
            case 11:
                ((lk8) obj).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 12:
                h3a h3aVar = (h3a) obj;
                h3aVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3aVar.invalidate();
                break;
            case 13:
                jja jjaVar = (jja) obj;
                jjaVar.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jjaVar.invalidate();
                break;
            case 14:
                fqa fqaVar = (fqa) obj;
                fqaVar.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fqaVar.I = true;
                fqaVar.invalidate();
                break;
            case 15:
                ((pqb) obj).z0.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                vic vicVar = (vic) obj;
                View[] viewArr = vicVar.e;
                if (vicVar.y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    vicVar.c = abs;
                    lic licVar = vicVar.N;
                    if (licVar != null) {
                        licVar.f(abs, vicVar.d, vicVar.b);
                    }
                }
                vicVar.y(false);
                break;
            default:
                ujc ujcVar = (ujc) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ujcVar.K = floatValue;
                tjc tjcVar = ujcVar.j0;
                if (tjcVar != null) {
                    ((wjc) tjcVar).b.e0.d(ujcVar.Q, floatValue);
                }
                ujcVar.invalidate();
                break;
        }
    }
}
