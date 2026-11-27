// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bt4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bt4(Object obj, float f, float f2, float f3, byte b) {
        this.a = b;
        this.e = obj;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.d;
        float f2 = this.c;
        float f3 = this.b;
        Object obj = this.e;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ys4 ys4Var = ((it4) obj).b;
                ys4Var.d = f3 * floatValue;
                ys4Var.e = f2 * floatValue;
                ys4Var.i = floatValue * f;
                break;
            case 1:
                mb5 mb5Var = (mb5) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mb5Var.z0 = qd4.A(1.0f, floatValue2, 1.0f, f3 * floatValue2);
                mb5Var.s0 = f2 * floatValue2;
                mb5Var.t0 = f * floatValue2;
                mb5Var.invalidate();
                break;
            default:
                mkc mkcVar = (mkc) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mkcVar.f1 = qd4.A(1.0f, floatValue3, 1.0f, f3 * floatValue3);
                mkcVar.Y0 = f2 * floatValue3;
                mkcVar.Z0 = f * floatValue3;
                mkcVar.s.invalidate();
                break;
        }
    }
}
