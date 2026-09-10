package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import bi.i0;
import bi.y1;
import fg.o1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.voip.s1;
import org.telegram.ui.Components.voip.t1;
import org.telegram.ui.Components.w9;
import org.telegram.ui.hi1;
import qg.p0;
import qg.s0;
import zh.g3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class m implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.b;
                a0Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.f.invalidate();
                break;
            case 1:
                i0 i0Var = (i0) this.b;
                i0Var.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i0Var.p.invalidate();
                break;
            case 2:
                o1 o1Var = (o1) this.b;
                o1Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.invalidate();
                int i10 = 0;
                while (i10 < 2) {
                    o1Var.c[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), o1Var.e));
                    o1Var.c[i10].setVisibility(0);
                    float f7 = 0.0f;
                    o1Var.c[i10].setAlpha(AndroidUtilities.lerp(i10 == 0 ? 1.0f : 0.0f, i10 == 1 ? 1.0f : 0.0f, o1Var.e));
                    o1Var.d[i10].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), o1Var.e));
                    o1Var.d[i10].setVisibility(0);
                    TextView textView = o1Var.d[i10];
                    float f10 = i10 == 0 ? 1.0f : 0.0f;
                    if (i10 == 1) {
                        f7 = 1.0f;
                    }
                    textView.setAlpha(AndroidUtilities.lerp(f10, f7, o1Var.e));
                    i10++;
                }
                break;
            case 3:
                hg.k kVar = (hg.k) this.b;
                kVar.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar.H = true;
                kVar.invalidate();
                break;
            case 4:
                hg.p pVar = (hg.p) this.b;
                pVar.j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.H = true;
                pVar.invalidate();
                break;
            case 5:
                u7 u7Var = (u7) this.b;
                u7Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u7Var.invalidate();
                break;
            case 6:
                ((w9) this.b).setRoundRadius(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 7:
                y1 y1Var = ((j70) this.b).e.d;
                int i11 = y1Var.E1;
                if (i11 != -1 && (view = y1Var.F1) != null) {
                    y1Var.h1(i11, view);
                    y1Var.invalidate();
                    break;
                }
                break;
            case 8:
                v81 v81Var = (v81) this.b;
                View[] viewArr = v81Var.e;
                if (v81Var.x) {
                    float abs = 1.0f - (Math.abs(viewArr[0].getTranslationX()) / viewArr[0].getMeasuredWidth());
                    v81Var.c = abs;
                    l81 l81Var = v81Var.M;
                    if (l81Var != null) {
                        l81Var.e(abs, v81Var.d, v81Var.b);
                    }
                }
                v81Var.w(false);
                break;
            case 9:
                t1 t1Var = (t1) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.J = floatValue;
                s1 s1Var = t1Var.i0;
                if (s1Var != null) {
                    ((hi1) s1Var).b.d0.d(floatValue, t1Var.P);
                }
                t1Var.invalidate();
                break;
            case 10:
                s0 s0Var = (s0) this.b;
                s0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s0Var.e();
                break;
            case 11:
                ((p0) this.b).setOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 12:
                ((s4.u) this.b).x = valueAnimator.getAnimatedFraction();
                break;
            default:
                g3 g3Var = (g3) this.b;
                g3Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g3Var.invalidate();
                break;
        }
    }
}
