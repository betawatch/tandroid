package ei;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.pt0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o4(pt0 pt0Var, int i10, jm0 jm0Var) {
        this.a = 1;
        this.c = pt0Var;
        this.b = i10;
        this.d = jm0Var;
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
                pt0 pt0Var = (pt0) this.c;
                jm0 jm0Var = (jm0) this.d;
                pt0Var.e.O1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                jm0Var.invalidate();
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

    public /* synthetic */ o4(mw0 mw0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = mw0Var;
        this.d = num;
        this.b = i10;
    }
}
