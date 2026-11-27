// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
