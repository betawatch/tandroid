package fi;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.zt0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n4(zt0 zt0Var, int i10, mm0 mm0Var) {
        this.a = 1;
        this.c = zt0Var;
        this.b = i10;
        this.d = mm0Var;
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
                zt0 zt0Var = (zt0) this.c;
                mm0 mm0Var = (mm0) this.d;
                zt0Var.e.R1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                mm0Var.invalidate();
                break;
            default:
                sg.n0 n0Var = (sg.n0) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.z1.a = i0.a.f(floatValue2, num2.intValue(), this.b);
                sg.l0 l0Var = n0Var.R0;
                if (l0Var != null) {
                    l0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n4(ww0 ww0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = ww0Var;
        this.d = num;
        this.b = i10;
    }
}
