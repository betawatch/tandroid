package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.o91;
import org.telegram.ui.di1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class l6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                n6 n6Var = (n6) this.b;
                n6Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.invalidate();
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
                gg.m1 m1Var = (gg.m1) this.b;
                m1Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var.invalidate();
                int i10 = 0;
                while (i10 < 2) {
                    m1Var.c[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.e));
                    m1Var.c[i10].setVisibility(0);
                    float f7 = 0.0f;
                    m1Var.c[i10].setAlpha(AndroidUtilities.lerp(i10 == 0 ? 1.0f : 0.0f, i10 == 1 ? 1.0f : 0.0f, m1Var.e));
                    m1Var.d[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.e));
                    m1Var.d[i10].setVisibility(0);
                    TextView textView = m1Var.d[i10];
                    float f10 = i10 == 0 ? 1.0f : 0.0f;
                    if (i10 == 1) {
                        f7 = 1.0f;
                    }
                    textView.setAlpha(AndroidUtilities.lerp(f10, f7, m1Var.e));
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
                ((org.telegram.ui.Components.y9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 8:
                w0 w0Var = ((c80) this.b).e.d;
                int i11 = w0Var.C1;
                if (i11 != -1 && (view = w0Var.D1) != null) {
                    w0Var.i1(i11, view);
                    w0Var.invalidate();
                    break;
                }
                break;
            case 9:
                o91 o91Var = (o91) this.b;
                View[] viewArr = o91Var.e;
                if (o91Var.x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    o91Var.c = abs;
                    d91 d91Var = o91Var.M;
                    if (d91Var != null) {
                        d91Var.e(abs, o91Var.d, o91Var.b);
                    }
                }
                o91Var.w(false);
                break;
            case 10:
                org.telegram.ui.Components.voip.u1 u1Var = (org.telegram.ui.Components.voip.u1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.J = floatValue;
                org.telegram.ui.Components.voip.t1 t1Var = u1Var.i0;
                if (t1Var != null) {
                    ((di1) t1Var).b.d0.d(floatValue, u1Var.P);
                }
                u1Var.invalidate();
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
