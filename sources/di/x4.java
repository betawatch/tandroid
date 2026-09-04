package di;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.ss0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x4(ss0 ss0Var, int i10, ll0 ll0Var) {
        this.a = 1;
        this.c = ss0Var;
        this.b = i10;
        this.d = ll0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) this.c;
                Integer num = (Integer) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.a = i0.a.d(floatValue, num.intValue(), this.b);
                m6 m6Var = q6Var.T0;
                if (m6Var != null) {
                    m6Var.invalidate();
                    break;
                }
                break;
            case 1:
                ss0 ss0Var = (ss0) this.c;
                ll0 ll0Var = (ll0) this.d;
                ss0Var.e.O1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                ll0Var.invalidate();
                break;
            default:
                rg.o0 o0Var = (rg.o0) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.K1.a = i0.a.d(floatValue2, num2.intValue(), this.b);
                rg.m0 m0Var = o0Var.c1;
                if (m0Var != null) {
                    m0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x4(pv0 pv0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = pv0Var;
        this.d = num;
        this.b = i10;
    }
}
