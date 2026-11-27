// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ml1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ dl1 c;

    public /* synthetic */ ml1(zu1 zu1Var, dl1 dl1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = dl1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dl1 dl1Var = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1Var.X9 = hl.L(30.0f) * floatValue;
                zu1Var.O7();
                dl1Var.setAlpha(floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1Var.X9 = hl.L(30.0f) * floatValue2;
                zu1Var.O7();
                zu1Var.Q7();
                dl1Var.setAlpha(floatValue2);
                break;
        }
    }
}
