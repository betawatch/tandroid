package fg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ w1(d2 d2Var, int i10) {
        this.a = i10;
        this.b = d2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d2 d2Var = this.b;
                d2Var.getClass();
                d2Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d2Var.container.invalidate();
                break;
            default:
                d2 d2Var2 = this.b;
                d2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d2Var2.K0.getLayoutParams().height = AndroidUtilities.lerp(d2Var2.L0[0].getHeight(), d2Var2.L0[1].getHeight(), floatValue);
                d2Var2.K0.requestLayout();
                break;
        }
    }
}
