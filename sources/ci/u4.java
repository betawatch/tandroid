package ci;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.u70;
import org.telegram.ui.rg1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class u4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                w4 w4Var = (w4) this.b;
                w4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w4Var.invalidate();
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
                c91 c91Var = (c91) this.b;
                View[] viewArr = c91Var.e;
                if (c91Var.x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    c91Var.c = abs;
                    s81 s81Var = c91Var.M;
                    if (s81Var != null) {
                        s81Var.e(abs, c91Var.d, c91Var.b);
                    }
                }
                c91Var.w(false);
                break;
            case 10:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.J = floatValue;
                org.telegram.ui.Components.voip.r1 r1Var = s1Var.i0;
                if (r1Var != null) {
                    ((rg1) r1Var).b.d0.d(floatValue, s1Var.P);
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
