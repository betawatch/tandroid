package fi;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.mx;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e4(ViewGroup viewGroup, Serializable serializable, int i7, int i10) {
        this.a = i10;
        this.c = viewGroup;
        this.d = serializable;
        this.b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o5 o5Var = (o5) this.c;
                Integer num = (Integer) this.d;
                o5Var.j1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), num.intValue(), this.b);
                k5 k5Var = o5Var.C0;
                if (k5Var != null) {
                    k5Var.invalidate();
                    break;
                }
                break;
            case 1:
                yq0 yq0Var = (yq0) this.c;
                pj0 pj0Var = (pj0) this.d;
                yq0Var.e.R1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                pj0Var.invalidate();
                break;
            case 2:
                mx mxVar = (mx) this.c;
                float[] fArr = (float[]) this.d;
                mxVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = 0;
                while (i7 < 3) {
                    mxVar.f[i7] = org.telegram.messenger.g0.T1(fArr[i7], i7 == this.b ? 1.0f : 0.0f, floatValue);
                    i7++;
                }
                mxVar.a();
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.c;
                Integer num2 = (Integer) this.d;
                g0Var.t1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), num2.intValue(), this.b);
                tg.e0 e0Var = g0Var.L0;
                if (e0Var != null) {
                    e0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e4(yq0 yq0Var, int i7, pj0 pj0Var) {
        this.a = 1;
        this.c = yq0Var;
        this.b = i7;
        this.d = pj0Var;
    }
}
