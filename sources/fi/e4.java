package fi;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.ox;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                ar0 ar0Var = (ar0) this.c;
                qj0 qj0Var = (qj0) this.d;
                ar0Var.e.R1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                qj0Var.invalidate();
                break;
            case 2:
                ox oxVar = (ox) this.c;
                float[] fArr = (float[]) this.d;
                oxVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = 0;
                while (i7 < 3) {
                    oxVar.f[i7] = org.telegram.messenger.g0.T1(fArr[i7], i7 == this.b ? 1.0f : 0.0f, floatValue);
                    i7++;
                }
                oxVar.a();
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

    public /* synthetic */ e4(ar0 ar0Var, int i7, qj0 qj0Var) {
        this.a = 1;
        this.c = ar0Var;
        this.b = i7;
        this.d = qj0Var;
    }
}
