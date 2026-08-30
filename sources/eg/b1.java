package eg;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import nh.i4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.p9;
import org.telegram.ui.ih1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.b;
                c1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.e();
                break;
            case 1:
                ((z0) this.b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                ((f2.z) this.b).x = valueAnimator.getAnimatedFraction();
                break;
            case 3:
                i4 i4Var = (i4) this.b;
                i4Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var.invalidate();
                break;
            case 4:
                oh.r rVar = (oh.r) this.b;
                rVar.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.f.invalidate();
                break;
            case 5:
                r7 r7Var = (r7) this.b;
                r7Var.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var.invalidate();
                break;
            case 6:
                ((p9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                lh.e1 e1Var = ((b70) this.b).e.d;
                int i10 = e1Var.B1;
                if (i10 != -1 && (view = e1Var.C1) != null) {
                    e1Var.i1(i10, view);
                    e1Var.invalidate();
                    break;
                }
                break;
            case 8:
                l81 l81Var = (l81) this.b;
                View[] viewArr = l81Var.e;
                if (l81Var.x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    l81Var.c = abs;
                    a81 a81Var = l81Var.J;
                    if (a81Var != null) {
                        a81Var.e(abs, l81Var.d, l81Var.b);
                    }
                }
                l81Var.w(false);
                break;
            case 9:
                org.telegram.ui.Components.voip.s1 s1Var = (org.telegram.ui.Components.voip.s1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.G = floatValue;
                org.telegram.ui.Components.voip.r1 r1Var = s1Var.f0;
                if (r1Var != null) {
                    ((ih1) r1Var).b.a0.d(floatValue, s1Var.M);
                }
                s1Var.invalidate();
                break;
            case 10:
                ph.x xVar = (ph.x) this.b;
                xVar.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xVar.p.invalidate();
                break;
            case 11:
                tf.x0 x0Var = (tf.x0) this.b;
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
                vf.k kVar = (vf.k) this.b;
                kVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.E = true;
                kVar.invalidate();
                break;
            default:
                vf.p pVar = (vf.p) this.b;
                pVar.g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.E = true;
                pVar.invalidate();
                break;
        }
    }
}
