// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class epc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uqc b;

    public /* synthetic */ epc(uqc uqcVar, byte b) {
        this.a = b;
        this.b = uqcVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        uqc uqcVar = this.b;
        switch (b) {
            case 0:
                uqcVar.P0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                uqcVar.L0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uqcVar.X0();
                break;
        }
    }
}
