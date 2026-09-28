package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.y81;
import org.telegram.ui.uh1;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class k6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                m6 m6Var = (m6) this.b;
                m6Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m6Var.invalidate();
                break;
            case 1:
                bi.u uVar = (bi.u) this.b;
                uVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.f.invalidate();
                break;
            case 2:
                ci.d0 d0Var = (ci.d0) this.b;
                d0Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.p.invalidate();
                break;
            case 3:
                gg.n1 n1Var = (gg.n1) this.b;
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
                ig.k kVar = (ig.k) this.b;
                kVar.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.H = true;
                kVar.invalidate();
                break;
            case 5:
                ig.p pVar = (ig.p) this.b;
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
                ((org.telegram.ui.Components.w9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 8:
                w0 w0Var = ((n70) this.b).e.d;
                int i11 = w0Var.E1;
                if (i11 != -1 && (view = w0Var.F1) != null) {
                    w0Var.i1(i11, view);
                    w0Var.invalidate();
                    break;
                }
                break;
            case 9:
                y81 y81Var = (y81) this.b;
                View[] viewArr = y81Var.e;
                if (y81Var.x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    y81Var.c = abs;
                    n81 n81Var = y81Var.M;
                    if (n81Var != null) {
                        n81Var.e(abs, y81Var.d, y81Var.b);
                    }
                }
                y81Var.w(false);
                break;
            case 10:
                org.telegram.ui.Components.voip.v1 v1Var = (org.telegram.ui.Components.voip.v1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.J = floatValue;
                org.telegram.ui.Components.voip.u1 u1Var = v1Var.i0;
                if (u1Var != null) {
                    ((uh1) u1Var).b.d0.d(floatValue, v1Var.P);
                }
                v1Var.invalidate();
                break;
            case 11:
                rg.p0 p0Var = (rg.p0) this.b;
                p0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.e();
                break;
            case 12:
                ((rg.n0) this.b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((s4.u) this.b).x = valueAnimator.getAnimatedFraction();
                break;
        }
    }
}
