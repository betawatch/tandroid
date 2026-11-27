// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e1c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g1c b;

    public /* synthetic */ e1c(g1c g1cVar, byte b) {
        this.a = b;
        this.b = g1cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        g1c g1cVar = this.b;
        switch (b) {
            case 0:
                vl4 vl4Var = g1cVar.f;
                vl4Var.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                vl4Var.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                vl4Var.invalidate();
                break;
            default:
                g1cVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1cVar.h();
                break;
        }
    }
}
