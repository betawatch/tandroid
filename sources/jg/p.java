package jg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.py;
import vh.b4;
import vh.y3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(ViewGroup viewGroup, Serializable serializable, int i10, int i11) {
        this.a = i11;
        this.c = viewGroup;
        this.d = serializable;
        this.b = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) this.c;
                Integer num = (Integer) this.d;
                r0Var.t1.a = i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), num.intValue(), this.b);
                n0 n0Var = r0Var.L0;
                if (n0Var != null) {
                    n0Var.invalidate();
                    break;
                }
                break;
            case 1:
                zr0 zr0Var = (zr0) this.c;
                tk0 tk0Var = (tk0) this.d;
                zr0Var.e.R1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                tk0Var.invalidate();
                break;
            case 2:
                py pyVar = (py) this.c;
                float[] fArr = (float[]) this.d;
                pyVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = 0;
                while (i10 < 3) {
                    pyVar.f[i10] = org.telegram.messenger.i0.T1(fArr[i10], i10 == this.b ? 1.0f : 0.0f, floatValue);
                    i10++;
                }
                pyVar.a();
                break;
            default:
                b4 b4Var = (b4) this.c;
                Integer num2 = (Integer) this.d;
                b4Var.j1.a = i0.b.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), num2.intValue(), this.b);
                y3 y3Var = b4Var.C0;
                if (y3Var != null) {
                    y3Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p(zr0 zr0Var, int i10, tk0 tk0Var) {
        this.a = 1;
        this.c = zr0Var;
        this.b = i10;
        this.d = tk0Var;
    }
}
