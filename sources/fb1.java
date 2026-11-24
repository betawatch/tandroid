// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fb1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lb1 b;

    public /* synthetic */ fb1(lb1 lb1Var, byte b) {
        this.a = b;
        this.b = lb1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        lb1 lb1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lb1Var.Z = floatValue;
                lb1Var.b.setAlpha(1.0f - floatValue);
                if (lb1Var.X == 3) {
                    lb1Var.c.setAlpha(1.0f - lb1Var.Z);
                }
                lb1Var.s.setAlpha(1.0f - lb1Var.Z);
                lb1Var.x = (lb1Var.Z * 0.25f) + 0.5f;
                lb1Var.fragmentView.invalidate();
                break;
            default:
                lb1Var.s.invalidate();
                break;
        }
    }
}
