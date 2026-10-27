package fi;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.xw0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n4(au0 au0Var, int i10, nm0 nm0Var) {
        this.a = 1;
        this.c = au0Var;
        this.b = i10;
        this.d = nm0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e6 e6Var = (e6) this.c;
                Integer num = (Integer) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var.p1.a = i0.a.f(floatValue, num.intValue(), this.b);
                a6 a6Var = e6Var.I0;
                if (a6Var != null) {
                    a6Var.invalidate();
                    break;
                }
                break;
            case 1:
                au0 au0Var = (au0) this.c;
                nm0 nm0Var = (nm0) this.d;
                au0Var.e.R1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                nm0Var.invalidate();
                break;
            default:
                sg.m0 m0Var = (sg.m0) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.z1.a = i0.a.f(floatValue2, num2.intValue(), this.b);
                sg.k0 k0Var = m0Var.R0;
                if (k0Var != null) {
                    k0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n4(xw0 xw0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = xw0Var;
        this.d = num;
        this.b = i10;
    }
}
