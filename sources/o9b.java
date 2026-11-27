// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p9b b;

    public /* synthetic */ o9b(p9b p9bVar, byte b) {
        this.a = b;
        this.b = p9bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        p9b p9bVar = this.b;
        switch (b) {
            case 0:
                p9bVar.b(valueAnimator);
                break;
            default:
                p9bVar.getClass();
                p9bVar.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
