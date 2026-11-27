// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gh3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uj3 b;
    public final /* synthetic */ float c;

    public /* synthetic */ gh3(uj3 uj3Var, float f, byte b) {
        this.a = b;
        this.b = uj3Var;
        this.c = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.c;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                uj3Var.f4(f, valueAnimator);
                break;
            default:
                uj3Var.T3(f, valueAnimator);
                break;
        }
    }
}
