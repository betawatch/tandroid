package hi;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kr0;
import org.telegram.ui.qx;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z3(ViewGroup viewGroup, Serializable serializable, int i7, int i10) {
        this.a = i10;
        this.c = viewGroup;
        this.d = serializable;
        this.b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k5 k5Var = (k5) this.c;
                Integer num = (Integer) this.d;
                k5Var.k1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), num.intValue(), this.b);
                g5 g5Var = k5Var.D0;
                if (g5Var != null) {
                    g5Var.invalidate();
                    break;
                }
                break;
            case 1:
                kr0 kr0Var = (kr0) this.c;
                ek0 ek0Var = (ek0) this.d;
                kr0Var.e.S1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                ek0Var.invalidate();
                break;
            case 2:
                qx qxVar = (qx) this.c;
                float[] fArr = (float[]) this.d;
                qxVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = 0;
                while (i7 < 3) {
                    qxVar.f[i7] = org.telegram.messenger.g0.T1(fArr[i7], i7 == this.b ? 1.0f : 0.0f, floatValue);
                    i7++;
                }
                qxVar.a();
                break;
            default:
                tg.h0 h0Var = (tg.h0) this.c;
                Integer num2 = (Integer) this.d;
                h0Var.u1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), num2.intValue(), this.b);
                tg.f0 f0Var = h0Var.M0;
                if (f0Var != null) {
                    f0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z3(kr0 kr0Var, int i7, ek0 ek0Var) {
        this.a = 1;
        this.c = kr0Var;
        this.b = i7;
        this.d = ek0Var;
    }
}
