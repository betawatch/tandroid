package di;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.x70;
import org.telegram.ui.vg1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                ei.r rVar = (ei.r) this.b;
                rVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.f.invalidate();
                break;
            case 2:
                fi.d0 d0Var = (fi.d0) this.b;
                d0Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.p.invalidate();
                break;
            case 3:
                ig.m1 m1Var = (ig.m1) this.b;
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
                kg.l lVar = (kg.l) this.b;
                lVar.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar.H = true;
                lVar.invalidate();
                break;
            case 5:
                kg.q qVar = (kg.q) this.b;
                qVar.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qVar.H = true;
                qVar.invalidate();
                break;
            case 6:
                org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) this.b;
                w7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w7Var.invalidate();
                break;
            case 7:
                ((org.telegram.ui.Components.y9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 8:
                bi.r1 r1Var = ((x70) this.b).e.d;
                int i11 = r1Var.C1;
                if (i11 != -1 && (view = r1Var.D1) != null) {
                    r1Var.l1(i11, view);
                    r1Var.invalidate();
                    break;
                }
                break;
            case 9:
                u91 u91Var = (u91) this.b;
                View[] viewArr = u91Var.e;
                if (u91Var.x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    u91Var.c = abs;
                    k91 k91Var = u91Var.M;
                    if (k91Var != null) {
                        k91Var.e(abs, u91Var.d, u91Var.b);
                    }
                }
                u91Var.x(false);
                break;
            case 10:
                org.telegram.ui.Components.voip.v1 v1Var = (org.telegram.ui.Components.voip.v1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.J = floatValue;
                org.telegram.ui.Components.voip.u1 u1Var = v1Var.i0;
                if (u1Var != null) {
                    ((vg1) u1Var).b.d0.d(floatValue, v1Var.P);
                }
                v1Var.invalidate();
                break;
            case 11:
                ((s4.v) this.b).x = valueAnimator.getAnimatedFraction();
                break;
            case 12:
                tg.p0 p0Var = (tg.p0) this.b;
                p0Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.e();
                break;
            default:
                ((tg.n0) this.b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
