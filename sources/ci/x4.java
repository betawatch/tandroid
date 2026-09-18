package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.us0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x4(us0 us0Var, int i10, ml0 ml0Var) {
        this.a = 1;
        this.c = us0Var;
        this.b = i10;
        this.d = ml0Var;
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
                us0 us0Var = (us0) this.c;
                ml0 ml0Var = (ml0) this.d;
                us0Var.e.O1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                ml0Var.invalidate();
                break;
            default:
                qg.p0 p0Var = (qg.p0) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.K1.a = i0.a.d(floatValue2, num2.intValue(), this.b);
                qg.m0 m0Var = p0Var.c1;
                if (m0Var != null) {
                    m0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x4(rv0 rv0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = rv0Var;
        this.d = num;
        this.b = i10;
    }
}
