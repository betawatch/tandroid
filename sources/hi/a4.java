package hi;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.qx;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a4(ViewGroup viewGroup, Serializable serializable, int i7, int i10) {
        this.a = i10;
        this.c = viewGroup;
        this.d = serializable;
        this.b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l5 l5Var = (l5) this.c;
                Integer num = (Integer) this.d;
                l5Var.k1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), num.intValue(), this.b);
                h5 h5Var = l5Var.D0;
                if (h5Var != null) {
                    h5Var.invalidate();
                    break;
                }
                break;
            case 1:
                ir0 ir0Var = (ir0) this.c;
                ck0 ck0Var = (ck0) this.d;
                ir0Var.e.S1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                ck0Var.invalidate();
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
                tg.g0 g0Var = (tg.g0) this.c;
                Integer num2 = (Integer) this.d;
                g0Var.u1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), num2.intValue(), this.b);
                tg.e0 e0Var = g0Var.M0;
                if (e0Var != null) {
                    e0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a4(ir0 ir0Var, int i7, ck0 ck0Var) {
        this.a = 1;
        this.c = ir0Var;
        this.b = i7;
        this.d = ck0Var;
    }
}
