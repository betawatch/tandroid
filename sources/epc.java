// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
