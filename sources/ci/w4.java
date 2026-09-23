package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.ts0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class w4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w4(ts0 ts0Var, int i10, ml0 ml0Var) {
        this.a = 1;
        this.c = ts0Var;
        this.b = i10;
        this.d = ml0Var;
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
                ts0 ts0Var = (ts0) this.c;
                ml0 ml0Var = (ml0) this.d;
                ts0Var.e.O1.put(this.b, (Float) valueAnimator.getAnimatedValue());
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

    public /* synthetic */ w4(qv0 qv0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = qv0Var;
        this.d = num;
        this.b = i10;
    }
}
