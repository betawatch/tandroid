// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jb5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mb5 b;

    public /* synthetic */ jb5(mb5 mb5Var, byte b) {
        this.a = b;
        this.b = mb5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        mb5 mb5Var = this.b;
        switch (b) {
            case 0:
                mb5Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mb5Var.invalidate();
                break;
            default:
                mb5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mb5Var.c = floatValue;
                j95 j95Var = mb5Var.k0;
                j95Var.u3.setAlpha(1.0f - floatValue);
                e85 e85Var = j95Var.H1;
                e85Var.setAlpha((1.0f - j95Var.T3.c) * (e85Var.getTag() != null ? 1.0f : 0.0f));
                j95Var.z1(j95Var.s2);
                mb5Var.j();
                break;
        }
    }
}
