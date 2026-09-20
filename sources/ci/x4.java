package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x4(et0 et0Var, int i10, vl0 vl0Var) {
        this.a = 1;
        this.c = et0Var;
        this.b = i10;
        this.d = vl0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r6 r6Var = (r6) this.c;
                Integer num = (Integer) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.A1.a = i0.a.d(floatValue, num.intValue(), this.b);
                m6 m6Var = r6Var.T0;
                if (m6Var != null) {
                    m6Var.invalidate();
                    break;
                }
                break;
            case 1:
                et0 et0Var = (et0) this.c;
                vl0 vl0Var = (vl0) this.d;
                et0Var.e.O1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                vl0Var.invalidate();
                break;
            default:
                qg.n0 n0Var = (qg.n0) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.K1.a = i0.a.d(floatValue2, num2.intValue(), this.b);
                qg.l0 l0Var = n0Var.c1;
                if (l0Var != null) {
                    l0Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x4(bw0 bw0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = bw0Var;
        this.d = num;
        this.b = i10;
    }
}
