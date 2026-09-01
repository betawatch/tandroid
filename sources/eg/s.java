package eg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.ts0;
import qh.b5;
import qh.y4;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s(ts0 ts0Var, int i10, tl0 tl0Var) {
        this.a = 1;
        this.c = ts0Var;
        this.b = i10;
        this.d = tl0Var;
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
                ts0 ts0Var = (ts0) this.c;
                tl0 tl0Var = (tl0) this.d;
                ts0Var.e.L1.put(this.b, (Float) valueAnimator.getAnimatedValue());
                tl0Var.invalidate();
                break;
            default:
                b5 b5Var = (b5) this.c;
                Integer num2 = (Integer) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b5Var.x1.a = i0.a.d(floatValue2, num2.intValue(), this.b);
                y4 y4Var = b5Var.Q0;
                if (y4Var != null) {
                    y4Var.invalidate();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ s(sv0 sv0Var, Integer num, int i10, int i11) {
        this.a = i11;
        this.c = sv0Var;
        this.d = num;
        this.b = i10;
    }
}
