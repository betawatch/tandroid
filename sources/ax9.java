// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ax9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dx9 b;

    public /* synthetic */ ax9(dx9 dx9Var, byte b) {
        this.a = b;
        this.b = dx9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dx9 dx9Var = this.b;
        switch (b) {
            case 0:
                dx9Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx9Var.W.i0.invalidate();
                break;
            case 1:
                dx9Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx9Var.W.i0.invalidate();
                break;
            default:
                dx9Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx9Var.W.i0.invalidate();
                break;
        }
    }
}
