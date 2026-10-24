package ei;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.st0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class o4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o4(st0 st0Var, int i10, mm0 mm0Var) {
        this.a = 1;
        this.c = st0Var;
        this.b = i10;
        this.d = mm0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.c;
                Integer num = (Integer) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.A1.a = i0.a.f(floatValue, num.intValue(), this.b);
                b6 b6Var = f6Var.T0;
                if (b6Var != null) {
                    b6Var.invalidate();
                    break;
                }
                break;
            case 1:
                st0 st0Var = (st0) this.c;
                mm0 mm0Var = (mm0) this.d;
                st0Var.e.P1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                mm0Var.invalidate();
                break;
            default:
                rg.m0 m0Var = (rg.m0) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.a = i0.a.f(floatValue2, num2.intValue(), this.b);
                rg.k0 k0Var = m0Var.c1;
                if (k0Var != null) {
                    k0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o4(pw0 pw0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = pw0Var;
        this.d = num;
        this.b = i10;
    }
}
