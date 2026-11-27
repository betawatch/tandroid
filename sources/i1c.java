// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i1c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k1c b;

    public /* synthetic */ i1c(k1c k1cVar, byte b) {
        this.a = b;
        this.b = k1cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        k1c k1cVar = this.b;
        switch (b) {
            case 0:
                k1cVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k1cVar.h();
                k1cVar.g();
                break;
            default:
                k1cVar.M = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                k1cVar.h.invalidate();
                break;
        }
    }
}
