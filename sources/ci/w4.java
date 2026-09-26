package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w4(et0 et0Var, int i10, wl0 wl0Var) {
        this.a = 1;
        this.c = et0Var;
        this.b = i10;
        this.d = wl0Var;
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
                et0 et0Var = (et0) this.c;
                wl0 wl0Var = (wl0) this.d;
                et0Var.e.O1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                wl0Var.invalidate();
                break;
            default:
                qg.n0 n0Var = (qg.n0) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.K1.a = i0.a.d(floatValue2, num2.intValue(), this.b);
                qg.l0 l0Var = n0Var.c1;
                if (l0Var != null) {
                    l0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w4(bw0 bw0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = bw0Var;
        this.d = num;
        this.b = i10;
    }
}
