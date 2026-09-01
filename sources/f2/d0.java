package f2;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import oh.k4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.m81;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.voip.s1;
import org.telegram.ui.Components.voip.t1;
import org.telegram.ui.kh1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class d0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                ((z) this.b).x = valueAnimator.getAnimatedFraction();
                break;
            case 1:
                fg.b1 b1Var = (fg.b1) this.b;
                b1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.e();
                break;
            case 2:
                ((fg.z0) this.b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                k4 k4Var = (k4) this.b;
                k4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k4Var.invalidate();
                break;
            case 4:
                r7 r7Var = (r7) this.b;
                r7Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var.invalidate();
                break;
            case 5:
                ((p9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 6:
                mh.d1 d1Var = ((d70) this.b).e.d;
                int i10 = d1Var.B1;
                if (i10 != -1 && (view = d1Var.C1) != null) {
                    d1Var.i1(i10, view);
                    d1Var.invalidate();
                    break;
                }
                break;
            case 7:
                m81 m81Var = (m81) this.b;
                View[] viewArr = m81Var.e;
                if (m81Var.x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    m81Var.c = abs;
                    c81 c81Var = m81Var.J;
                    if (c81Var != null) {
                        c81Var.e(abs, m81Var.d, m81Var.b);
                    }
                }
                m81Var.w(false);
                break;
            case 8:
                t1 t1Var = (t1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.G = floatValue;
                s1 s1Var = t1Var.f0;
                if (s1Var != null) {
                    ((kh1) s1Var).b.a0.d(floatValue, t1Var.M);
                }
                t1Var.invalidate();
                break;
            case 9:
                ph.l lVar = (ph.l) this.b;
                lVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar.f.invalidate();
                break;
            case 10:
                qh.x xVar = (qh.x) this.b;
                xVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar.p.invalidate();
                break;
            case 11:
                uf.x0 x0Var = (uf.x0) this.b;
                x0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x0Var.invalidate();
                int i11 = 0;
                while (i11 < 2) {
                    x0Var.c[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    x0Var.c[i11].setVisibility(0);
                    float f10 = 0.0f;
                    x0Var.c[i11].setAlpha(AndroidUtilities.lerp(i11 == 0 ? 1.0f : 0.0f, i11 == 1 ? 1.0f : 0.0f, x0Var.e));
                    x0Var.d[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    x0Var.d[i11].setVisibility(0);
                    TextView textView = x0Var.d[i11];
                    float f11 = i11 == 0 ? 1.0f : 0.0f;
                    if (i11 == 1) {
                        f10 = 1.0f;
                    }
                    textView.setAlpha(AndroidUtilities.lerp(f11, f10, x0Var.e));
                    i11++;
                }
                break;
            case 12:
                wf.k kVar = (wf.k) this.b;
                kVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.E = true;
                kVar.invalidate();
                break;
            default:
                wf.p pVar = (wf.p) this.b;
                pVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.E = true;
                pVar.invalidate();
                break;
        }
    }
}
