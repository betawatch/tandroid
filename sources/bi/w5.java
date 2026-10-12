package bi;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a91;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.z70;
import org.telegram.ui.ki1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class w5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                y5 y5Var = (y5) this.b;
                y5Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y5Var.invalidate();
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
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.b;
                t7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.invalidate();
                break;
            case 7:
                ((org.telegram.ui.Components.z9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 8:
                o0 o0Var = ((z70) this.b).e.d;
                int i11 = o0Var.C1;
                if (i11 != -1 && (view = o0Var.D1) != null) {
                    o0Var.i1(i11, view);
                    o0Var.invalidate();
                    break;
                }
                break;
            case 9:
                k91 k91Var = (k91) this.b;
                View[] viewArr = k91Var.e;
                if (k91Var.x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    k91Var.c = abs;
                    a91 a91Var = k91Var.M;
                    if (a91Var != null) {
                        a91Var.e(abs, k91Var.d, k91Var.b);
                    }
                }
                k91Var.w(false);
                break;
            case 10:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.J = floatValue;
                org.telegram.ui.Components.voip.r1 r1Var = s1Var.i0;
                if (r1Var != null) {
                    ((ki1) r1Var).b.d0.d(floatValue, s1Var.P);
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
                ((sg.n0) this.b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
