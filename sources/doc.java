// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class doc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ foc b;

    public /* synthetic */ doc(foc focVar, byte b) {
        this.a = b;
        this.b = focVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        byte b2 = 2;
        foc focVar = this.b;
        switch (b) {
            case 0:
                focVar.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                focVar.k.invalidate();
                if (focVar.n > 1.0f && focVar.r == null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(hl.L(12.0f), 0);
                    focVar.r = ofInt;
                    ofInt.addUpdateListener(new doc(focVar, b2));
                    focVar.r.setDuration(350 - valueAnimator.getCurrentPlayTime());
                    focVar.r.start();
                    break;
                }
                break;
            case 1:
                focVar.m = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                focVar.k.invalidate();
                break;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (focVar.i <= focVar.o / 2) {
                    intValue = -intValue;
                }
                focVar.p = intValue;
                focVar.k.invalidate();
                break;
        }
    }
}
