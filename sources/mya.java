// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mya implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pya b;

    public /* synthetic */ mya(pya pyaVar, byte b) {
        this.a = b;
        this.b = pyaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        pya pyaVar = this.b;
        switch (b) {
            case 0:
                pyaVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pyaVar.invalidate();
                break;
            case 1:
                pyaVar.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                pyaVar.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pyaVar.invalidate();
                break;
        }
    }
}
