package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.wt0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v4(wt0 wt0Var, int i10, qm0 qm0Var) {
        this.a = 1;
        this.c = wt0Var;
        this.b = i10;
        this.d = qm0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) this.c;
                Integer num = (Integer) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.a = i0.a.d(floatValue, num.intValue(), this.b);
                l6 l6Var = q6Var.T0;
                if (l6Var != null) {
                    l6Var.invalidate();
                    break;
                }
                break;
            case 1:
                wt0 wt0Var = (wt0) this.c;
                qm0 qm0Var = (qm0) this.d;
                wt0Var.e.O1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                qm0Var.invalidate();
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

    public /* synthetic */ v4(tw0 tw0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = tw0Var;
        this.d = num;
        this.b = i10;
    }
}
