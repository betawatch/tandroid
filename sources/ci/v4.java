package ci;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.u70;
import org.telegram.ui.pg1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class v4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                x4 x4Var = (x4) this.b;
                x4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x4Var.invalidate();
                break;
            case 1:
                di.r rVar = (di.r) this.b;
                rVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.f.invalidate();
                break;
            case 2:
                ei.d0 d0Var = (ei.d0) this.b;
                d0Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.p.invalidate();
                break;
            case 3:
                hg.m1 m1Var = (hg.m1) this.b;
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
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) this.b;
                s7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s7Var.invalidate();
                break;
            case 7:
                ((org.telegram.ui.Components.w9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 8:
                ai.u1 u1Var = ((u70) this.b).e.d;
                int i11 = u1Var.C1;
                if (i11 != -1 && (view = u1Var.D1) != null) {
                    u1Var.i1(i11, view);
                    u1Var.invalidate();
                    break;
                }
                break;
            case 9:
                d91 d91Var = (d91) this.b;
                View[] viewArr = d91Var.e;
                if (d91Var.x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    d91Var.c = abs;
                    t81 t81Var = d91Var.M;
                    if (t81Var != null) {
                        t81Var.e(abs, d91Var.d, d91Var.b);
                    }
                }
                d91Var.w(false);
                break;
            case 10:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.J = floatValue;
                org.telegram.ui.Components.voip.r1 r1Var = s1Var.i0;
                if (r1Var != null) {
                    ((pg1) r1Var).b.d0.d(floatValue, s1Var.P);
                }
                s1Var.invalidate();
                break;
            case 11:
                ((s4.u) this.b).x = valueAnimator.getAnimatedFraction();
                break;
            case 12:
                sg.q0 q0Var = (sg.q0) this.b;
                q0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var.e();
                break;
            default:
                ((sg.o0) this.b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
