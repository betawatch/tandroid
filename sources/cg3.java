// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cg3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj3 b;

    public /* synthetic */ cg3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                cj3Var.T4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                cj3Var.V4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                cj3Var.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
