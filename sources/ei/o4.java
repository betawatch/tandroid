package ei;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.nt0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o4(nt0 nt0Var, int i10, im0 im0Var) {
        this.a = 1;
        this.c = nt0Var;
        this.b = i10;
        this.d = im0Var;
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
                nt0 nt0Var = (nt0) this.c;
                im0 im0Var = (im0) this.d;
                nt0Var.e.O1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                im0Var.invalidate();
                break;
            default:
                rg.m0 m0Var = (rg.m0) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.a = i0.a.f(floatValue2, num2.intValue(), this.b);
                rg.j0 j0Var = m0Var.c1;
                if (j0Var != null) {
                    j0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o4(kw0 kw0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = kw0Var;
        this.d = num;
        this.b = i10;
    }
}
