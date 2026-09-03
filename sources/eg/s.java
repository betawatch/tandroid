package eg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.ss0;
import qh.a5;
import qh.x4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s(ss0 ss0Var, int i10, sl0 sl0Var) {
        this.a = 1;
        this.c = ss0Var;
        this.b = i10;
        this.d = sl0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.c;
                Integer num = (Integer) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.H1.a = i0.a.d(floatValue, num.intValue(), this.b);
                y0 y0Var = c1Var.Z0;
                if (y0Var != null) {
                    y0Var.invalidate();
                    break;
                }
                break;
            case 1:
                ss0 ss0Var = (ss0) this.c;
                sl0 sl0Var = (sl0) this.d;
                ss0Var.e.L1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                sl0Var.invalidate();
                break;
            default:
                a5 a5Var = (a5) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a5Var.x1.a = i0.a.d(floatValue2, num2.intValue(), this.b);
                x4 x4Var = a5Var.Q0;
                if (x4Var != null) {
                    x4Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ s(rv0 rv0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = rv0Var;
        this.d = num;
        this.b = i10;
    }
}
