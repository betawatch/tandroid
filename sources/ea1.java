// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ea1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ la1 b;

    public /* synthetic */ ea1(la1 la1Var, byte b) {
        this.a = b;
        this.b = la1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        la1 la1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                la1Var.Z = floatValue;
                la1Var.b.setAlpha(1.0f - floatValue);
                if (la1Var.X == 3) {
                    la1Var.c.setAlpha(1.0f - la1Var.Z);
                }
                la1Var.s.setAlpha(1.0f - la1Var.Z);
                la1Var.x = (la1Var.Z * 0.25f) + 0.5f;
                la1Var.fragmentView.invalidate();
                break;
            default:
                la1Var.s.invalidate();
                break;
        }
    }
}
