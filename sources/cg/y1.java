package cg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ y1(f2 f2Var, int i10) {
        this.a = i10;
        this.b = f2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                f2 f2Var = this.b;
                f2Var.getClass();
                f2Var.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f2Var.container.invalidate();
                break;
            default:
                f2 f2Var2 = this.b;
                f2Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f2Var2.J0.getLayoutParams().height = AndroidUtilities.lerp(f2Var2.K0[0].getHeight(), f2Var2.K0[1].getHeight(), floatValue);
                f2Var2.J0.requestLayout();
                break;
        }
    }
}
