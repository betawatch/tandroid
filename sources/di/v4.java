package di;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.st0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v4(st0 st0Var, int i10, mm0 mm0Var) {
        this.a = 1;
        this.c = st0Var;
        this.b = i10;
        this.d = mm0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o6 o6Var = (o6) this.c;
                Integer num = (Integer) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.A1.a = i0.a.d(floatValue, num.intValue(), this.b);
                k6 k6Var = o6Var.T0;
                if (k6Var != null) {
                    k6Var.invalidate();
                    break;
                }
                break;
            case 1:
                st0 st0Var = (st0) this.c;
                mm0 mm0Var = (mm0) this.d;
                st0Var.e.O1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                mm0Var.invalidate();
                break;
            default:
                rg.o0 o0Var = (rg.o0) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.K1.a = i0.a.d(floatValue2, num2.intValue(), this.b);
                rg.l0 l0Var = o0Var.c1;
                if (l0Var != null) {
                    l0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v4(pw0 pw0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = pw0Var;
        this.d = num;
        this.b = i10;
    }
}
