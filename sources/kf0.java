// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nf0 b;

    public /* synthetic */ kf0(nf0 nf0Var, byte b) {
        this.a = b;
        this.b = nf0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        nf0 nf0Var = this.b;
        switch (b) {
            case 0:
                nf0Var.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nf0Var.I = true;
                nf0Var.invalidate();
                break;
            case 1:
                nf0Var.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nf0Var.I = true;
                nf0Var.invalidate();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nf0Var.w0 = floatValue;
                nf0Var.u0.setAlpha(floatValue);
                nf0Var.invalidate();
                break;
        }
    }
}
