package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final /* synthetic */ class w4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w4(gt0 gt0Var, int i10, yl0 yl0Var) {
        this.a = 1;
        this.c = gt0Var;
        this.b = i10;
        this.d = yl0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) this.c;
                Integer num = (Integer) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.a = i0.a.d(floatValue, num.intValue(), this.b);
                l6 l6Var = q6Var.T0;
                if (l6Var != null) {
                    l6Var.invalidate();
                    break;
                }
                break;
            case 1:
                gt0 gt0Var = (gt0) this.c;
                yl0 yl0Var = (yl0) this.d;
                gt0Var.e.O1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                yl0Var.invalidate();
                break;
            default:
                qg.n0 n0Var = (qg.n0) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.K1.a = i0.a.d(floatValue2, num2.intValue(), this.b);
                qg.l0 l0Var = n0Var.c1;
                if (l0Var != null) {
                    l0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w4(dw0 dw0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = dw0Var;
        this.d = num;
        this.b = i10;
    }
}
