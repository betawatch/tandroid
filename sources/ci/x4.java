package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x4(ft0 ft0Var, int i10, wl0 wl0Var) {
        this.a = 1;
        this.c = ft0Var;
        this.b = i10;
        this.d = wl0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r6 r6Var = (r6) this.c;
                Integer num = (Integer) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.A1.a = i0.a.d(floatValue, num.intValue(), this.b);
                m6 m6Var = r6Var.T0;
                if (m6Var != null) {
                    m6Var.invalidate();
                    break;
                }
                break;
            case 1:
                ft0 ft0Var = (ft0) this.c;
                wl0 wl0Var = (wl0) this.d;
                ft0Var.e.O1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                wl0Var.invalidate();
                break;
            default:
                qg.m0 m0Var = (qg.m0) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.a = i0.a.d(floatValue2, num2.intValue(), this.b);
                qg.k0 k0Var = m0Var.c1;
                if (k0Var != null) {
                    k0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x4(cw0 cw0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = cw0Var;
        this.d = num;
        this.b = i10;
    }
}
