// default package

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class e34 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e34(gha ghaVar, int i, jga jgaVar) {
        this.a = (byte) 3;
        this.c = ghaVar;
        this.b = i;
        this.d = jgaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.d;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                g34 g34Var = (g34) obj2;
                float[] fArr = (float[]) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i2 = 0;
                while (i2 < 3) {
                    g34Var.f[i2] = hl.R1(fArr[i2], i2 == i ? 1.0f : 0.0f, floatValue);
                    i2++;
                }
                g34Var.a();
                break;
            case 1:
                wy5 wy5Var = (wy5) obj2;
                wy5Var.u1.a = vm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), ((Integer) obj).intValue(), i);
                ty5 ty5Var = wy5Var.M0;
                if (ty5Var != null) {
                    ty5Var.invalidate();
                    break;
                }
                break;
            case 2:
                dx7 dx7Var = (dx7) obj2;
                dx7Var.k1.a = vm2.f(((Float) valueAnimator.getAnimatedValue()).floatValue(), ((Integer) obj).intValue(), i);
                ax7 ax7Var = dx7Var.D0;
                if (ax7Var != null) {
                    ax7Var.invalidate();
                    break;
                }
                break;
            default:
                ((gha) obj2).e.S1.put(i, (Float) valueAnimator.getAnimatedValue());
                ((jga) obj).invalidate();
                break;
        }
    }

    public /* synthetic */ e34(ViewGroup viewGroup, Serializable serializable, int i, byte b) {
        this.a = b;
        this.c = viewGroup;
        this.d = serializable;
        this.b = i;
    }
}
