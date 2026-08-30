package eg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ x1(e2 e2Var, int i10) {
        this.a = i10;
        this.b = e2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e2 e2Var = this.b;
                e2Var.getClass();
                e2Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e2Var.container.invalidate();
                break;
            default:
                e2 e2Var2 = this.b;
                e2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e2Var2.K0.getLayoutParams().height = AndroidUtilities.lerp(e2Var2.L0[0].getHeight(), e2Var2.L0[1].getHeight(), floatValue);
                e2Var2.K0.requestLayout();
                break;
        }
    }
}
