package hi;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.nx;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
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
                m5 m5Var = (m5) this.c;
                Integer num = (Integer) this.d;
                m5Var.k1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), num.intValue(), this.b);
                i5 i5Var = m5Var.D0;
                if (i5Var != null) {
                    i5Var.invalidate();
                    break;
                }
                break;
            case 1:
                ar0 ar0Var = (ar0) this.c;
                uj0 uj0Var = (uj0) this.d;
                ar0Var.e.S1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                uj0Var.invalidate();
                break;
            case 2:
                nx nxVar = (nx) this.c;
                float[] fArr = (float[]) this.d;
                nxVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = 0;
                while (i7 < 3) {
                    nxVar.f[i7] = org.telegram.messenger.g0.T1(fArr[i7], i7 == this.b ? 1.0f : 0.0f, floatValue);
                    i7++;
                }
                nxVar.a();
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

    public /* synthetic */ a4(ar0 ar0Var, int i7, uj0 uj0Var) {
        this.a = 1;
        this.c = ar0Var;
        this.b = i7;
        this.d = uj0Var;
    }
}
