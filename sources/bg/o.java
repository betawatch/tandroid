package bg;

import ag.b1;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import kg.v0;
import kg.x0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.i0;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.voip.a1;
import org.telegram.ui.Components.w71;
import org.telegram.ui.kd1;
import th.f3;
import vh.w;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                p pVar = (p) this.b;
                pVar.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.H = true;
                pVar.invalidate();
                break;
            case 1:
                u uVar = (u) this.b;
                uVar.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.H = true;
                uVar.invalidate();
                break;
            case 2:
                x0 x0Var = (x0) this.b;
                x0Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x0Var.e();
                break;
            case 3:
                ((v0) this.b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                MediaController mediaController = (MediaController) this.b;
                mediaController.O1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.n0();
                break;
            case 5:
                s7 s7Var = (s7) this.b;
                s7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s7Var.invalidate();
                break;
            case 6:
                ((g9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                b1 b1Var = ((l60) this.b).e.k1;
                int i10 = b1Var.C1;
                if (i10 != -1 && (view = b1Var.D1) != null) {
                    b1Var.k1(i10, view);
                    b1Var.invalidate();
                    break;
                }
                break;
            case 8:
                w71 w71Var = (w71) this.b;
                View[] viewArr = w71Var.e;
                if (w71Var.y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    w71Var.c = abs;
                    m71 m71Var = w71Var.M;
                    if (m71Var != null) {
                        m71Var.e(abs, w71Var.d, w71Var.b);
                    }
                }
                w71Var.x(false);
                break;
            case 9:
                org.telegram.ui.Components.voip.b1 b1Var2 = (org.telegram.ui.Components.voip.b1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var2.J = floatValue;
                a1 a1Var = b1Var2.i0;
                if (a1Var != null) {
                    ((kd1) a1Var).b.d0.d(b1Var2.P, floatValue);
                }
                b1Var2.invalidate();
                break;
            case 10:
                ((s4.t) this.b).y = valueAnimator.getAnimatedFraction();
                break;
            case 11:
                f3 f3Var = (f3) this.b;
                f3Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var.invalidate();
                break;
            case 12:
                uh.i iVar = (uh.i) this.b;
                iVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iVar.f.invalidate();
                break;
            case 13:
                w wVar = (w) this.b;
                wVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar.p.invalidate();
                break;
            default:
                zf.a1 a1Var2 = (zf.a1) this.b;
                a1Var2.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a1Var2.invalidate();
                int i11 = 0;
                while (i11 < 2) {
                    a1Var2.c[i11].setTranslationX(i0.W1(a1Var2.e, 0, -i0.L(62.0f)));
                    a1Var2.c[i11].setVisibility(0);
                    float f7 = 0.0f;
                    a1Var2.c[i11].setAlpha(i0.T1(i11 == 0 ? 1.0f : 0.0f, i11 == 1 ? 1.0f : 0.0f, a1Var2.e));
                    a1Var2.d[i11].setTranslationX(i0.W1(a1Var2.e, 0, -i0.L(62.0f)));
                    a1Var2.d[i11].setVisibility(0);
                    TextView textView = a1Var2.d[i11];
                    float f10 = i11 == 0 ? 1.0f : 0.0f;
                    if (i11 == 1) {
                        f7 = 1.0f;
                    }
                    textView.setAlpha(i0.T1(f10, f7, a1Var2.e));
                    i11++;
                }
                break;
        }
    }
}
