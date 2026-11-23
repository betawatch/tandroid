package hi;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.px;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j4(ViewGroup viewGroup, Serializable serializable, int i7, int i10) {
        this.a = i10;
        this.c = viewGroup;
        this.d = serializable;
        this.b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v5 v5Var = (v5) this.c;
                Integer num = (Integer) this.d;
                v5Var.k1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), num.intValue(), this.b);
                r5 r5Var = v5Var.D0;
                if (r5Var != null) {
                    r5Var.invalidate();
                    break;
                }
                break;
            case 1:
                jr0 jr0Var = (jr0) this.c;
                ek0 ek0Var = (ek0) this.d;
                jr0Var.e.S1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                ek0Var.invalidate();
                break;
            case 2:
                px pxVar = (px) this.c;
                float[] fArr = (float[]) this.d;
                pxVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = 0;
                while (i7 < 3) {
                    pxVar.f[i7] = org.telegram.messenger.g0.T1(fArr[i7], i7 == this.b ? 1.0f : 0.0f, floatValue);
                    i7++;
                }
                pxVar.a();
                break;
            default:
                tg.l0 l0Var = (tg.l0) this.c;
                Integer num2 = (Integer) this.d;
                l0Var.u1.a = i0.a.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), num2.intValue(), this.b);
                tg.j0 j0Var = l0Var.M0;
                if (j0Var != null) {
                    j0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ j4(jr0 jr0Var, int i7, ek0 ek0Var) {
        this.a = 1;
        this.c = jr0Var;
        this.b = i7;
        this.d = ek0Var;
    }
}
