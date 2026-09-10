package bi;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.ct0;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class s5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s5(ct0 ct0Var, int i10, vl0 vl0Var) {
        this.a = 1;
        this.c = ct0Var;
        this.b = i10;
        this.d = vl0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r7 r7Var = (r7) this.c;
                Integer num = (Integer) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var.A1.a = i0.a.d(floatValue, num.intValue(), this.b);
                l7 l7Var = r7Var.T0;
                if (l7Var != null) {
                    l7Var.invalidate();
                    break;
                }
                break;
            case 1:
                ct0 ct0Var = (ct0) this.c;
                vl0 vl0Var = (vl0) this.d;
                ct0Var.e.O1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                vl0Var.invalidate();
                break;
            default:
                pg.m0 m0Var = (pg.m0) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.a = i0.a.d(floatValue2, num2.intValue(), this.b);
                pg.k0 k0Var = m0Var.c1;
                if (k0Var != null) {
                    k0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ s5(bw0 bw0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = bw0Var;
        this.d = num;
        this.b = i10;
    }
}
