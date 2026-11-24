// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n4 b;

    public /* synthetic */ j4(n4 n4Var, byte b) {
        this.a = b;
        this.b = n4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        n4 n4Var = this.b;
        switch (b) {
            case 0:
                n4Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n4Var.invalidate();
                n4Var.P = null;
                break;
            case 1:
                n4Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n4Var.invalidate();
                n4Var.Q = null;
                break;
            default:
                n4Var.a0.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
