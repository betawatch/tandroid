// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jmc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kmc b;

    public /* synthetic */ jmc(kmc kmcVar, byte b) {
        this.a = b;
        this.b = kmcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        kmc kmcVar = this.b;
        switch (b) {
            case 0:
                kmcVar.getClass();
                kmcVar.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kmcVar.a(kmcVar.S, kmcVar.T);
                break;
            default:
                kmcVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kmcVar.invalidate();
                break;
        }
    }
}
