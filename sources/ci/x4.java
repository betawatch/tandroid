package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.ts0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x4(ts0 ts0Var, int i10, ll0 ll0Var) {
        this.a = 1;
        this.c = ts0Var;
        this.b = i10;
        this.d = ll0Var;
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
                ts0 ts0Var = (ts0) this.c;
                ll0 ll0Var = (ll0) this.d;
                ts0Var.e.O1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                ll0Var.invalidate();
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

    public /* synthetic */ x4(qv0 qv0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = qv0Var;
        this.d = num;
        this.b = i10;
    }
}
