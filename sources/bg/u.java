package bg;

import android.animation.ValueAnimator;
import nh.p5;
import nh.t5;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.ks0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u(ks0 ks0Var, int i10, jl0 jl0Var) {
        this.a = 2;
        this.d = ks0Var;
        this.c = i10;
        this.b = jl0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.d;
                Integer num = (Integer) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var.G1.a = i0.a.d(floatValue, num.intValue(), this.c);
                b1 b1Var = g1Var.Y0;
                if (b1Var != null) {
                    b1Var.invalidate();
                    break;
                }
                break;
            case 1:
                t5 t5Var = (t5) this.d;
                Integer num2 = (Integer) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t5Var.w1.a = i0.a.d(floatValue2, num2.intValue(), this.c);
                p5 p5Var = t5Var.P0;
                if (p5Var != null) {
                    p5Var.invalidate();
                    break;
                }
                break;
            default:
                ks0 ks0Var = (ks0) this.d;
                jl0 jl0Var = (jl0) this.b;
                ks0Var.e.K1.put(this.c, (Float) valueAnimator.getAnimatedValue());
                jl0Var.invalidate();
                break;
        }
    }

    public /* synthetic */ u(iv0 iv0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.d = iv0Var;
        this.b = num;
        this.c = i10;
    }
}
