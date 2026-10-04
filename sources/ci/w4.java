package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class w4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w4(kt0 kt0Var, int i10, zl0 zl0Var) {
        this.a = 1;
        this.c = kt0Var;
        this.b = i10;
        this.d = zl0Var;
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
                kt0 kt0Var = (kt0) this.c;
                zl0 zl0Var = (zl0) this.d;
                kt0Var.e.O1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                zl0Var.invalidate();
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

    public /* synthetic */ w4(mw0 mw0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = mw0Var;
        this.d = num;
        this.b = i10;
    }
}
