package dg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.ss0;
import ph.c5;
import ph.y4;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t(ss0 ss0Var, int i10, sl0 sl0Var) {
        this.a = 1;
        this.c = ss0Var;
        this.b = i10;
        this.d = sl0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e1 e1Var = (e1) this.c;
                Integer num = (Integer) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.H1.a = i0.a.d(floatValue, num.intValue(), this.b);
                a1 a1Var = e1Var.Z0;
                if (a1Var != null) {
                    a1Var.invalidate();
                    break;
                }
                break;
            case 1:
                ss0 ss0Var = (ss0) this.c;
                sl0 sl0Var = (sl0) this.d;
                ss0Var.e.L1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                sl0Var.invalidate();
                break;
            default:
                c5 c5Var = (c5) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var.x1.a = i0.a.d(floatValue2, num2.intValue(), this.b);
                y4 y4Var = c5Var.Q0;
                if (y4Var != null) {
                    y4Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t(rv0 rv0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = rv0Var;
        this.d = num;
        this.b = i10;
    }
}
