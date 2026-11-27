// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
