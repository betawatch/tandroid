package ei;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.s50;
import org.telegram.ui.ib1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n4(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                p4 p4Var = (p4) this.b;
                p4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p4Var.invalidate();
                break;
            case 1:
                fi.m mVar = (fi.m) this.b;
                mVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mVar.f.invalidate();
                break;
            case 2:
                gi.d0 d0Var = (gi.d0) this.b;
                d0Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.p.invalidate();
                break;
            case 3:
                kg.h1 h1Var = (kg.h1) this.b;
                h1Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1Var.invalidate();
                int i3 = 0;
                while (i3 < 2) {
                    h1Var.c[i3].setTranslationX(org.telegram.messenger.g0.W1(h1Var.e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    h1Var.c[i3].setVisibility(0);
                    float f10 = 0.0f;
                    h1Var.c[i3].setAlpha(org.telegram.messenger.g0.T1(i3 == 0 ? 1.0f : 0.0f, i3 == 1 ? 1.0f : 0.0f, h1Var.e));
                    h1Var.d[i3].setTranslationX(org.telegram.messenger.g0.W1(h1Var.e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    h1Var.d[i3].setVisibility(0);
                    TextView textView = h1Var.d[i3];
                    float f11 = i3 == 0 ? 1.0f : 0.0f;
                    if (i3 == 1) {
                        f10 = 1.0f;
                    }
                    textView.setAlpha(org.telegram.messenger.g0.T1(f11, f10, h1Var.e));
                    i3++;
                }
                break;
            case 4:
                mg.k kVar = (mg.k) this.b;
                kVar.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.I = true;
                kVar.invalidate();
                break;
            case 5:
                mg.p pVar = (mg.p) this.b;
                pVar.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.I = true;
                pVar.invalidate();
                break;
            case 6:
                MediaController mediaController = (MediaController) this.b;
                mediaController.Q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mediaController.n0();
                break;
            case 7:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.b;
                n7Var.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7Var.invalidate();
                break;
            case 8:
                ((org.telegram.ui.Components.k9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 9:
                ci.j1 j1Var = ((s50) this.b).e.l1;
                int i10 = j1Var.D1;
                if (i10 != -1 && (view = j1Var.E1) != null) {
                    j1Var.k1(i10, view);
                    j1Var.invalidate();
                    break;
                }
                break;
            case 10:
                n61 n61Var = (n61) this.b;
                View[] viewArr = n61Var.e;
                if (n61Var.y) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    n61Var.c = abs;
                    d61 d61Var = n61Var.N;
                    if (d61Var != null) {
                        d61Var.e(abs, n61Var.d, n61Var.b);
                    }
                }
                n61Var.v(false);
                break;
            case 11:
                org.telegram.ui.Components.voip.c1 c1Var = (org.telegram.ui.Components.voip.c1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.K = floatValue;
                org.telegram.ui.Components.voip.b1 b1Var = c1Var.j0;
                if (b1Var != null) {
                    ((ib1) b1Var).b.e0.d(c1Var.Q, floatValue);
                }
                c1Var.invalidate();
                break;
            case 12:
                ((u4.u) this.b).y = valueAnimator.getAnimatedFraction();
                break;
            case 13:
                vg.o0 o0Var = (vg.o0) this.b;
                o0Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.e();
                break;
            default:
                ((vg.m0) this.b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
