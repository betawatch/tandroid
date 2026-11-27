// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class aha implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zha b;
    public final /* synthetic */ eja c;

    public /* synthetic */ aha(eja ejaVar, zha zhaVar, byte b) {
        this.a = b;
        this.c = ejaVar;
        this.b = zhaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        zha zhaVar = this.b;
        eja ejaVar = this.c;
        switch (b) {
            case 0:
                ejaVar.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zhaVar.h.invalidate();
                break;
            default:
                ejaVar.q1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zhaVar.h.invalidate();
                break;
        }
    }
}
