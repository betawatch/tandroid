// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class nic implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qic b;

    public /* synthetic */ nic(qic qicVar, byte b) {
        this.a = b;
        this.b = qicVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        qic qicVar = this.b;
        switch (b) {
            case 0:
                qicVar.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qicVar.invalidate();
                break;
            case 1:
                qicVar.x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                qicVar.invalidate();
                break;
            case 2:
                qicVar.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                qicVar.invalidate();
                break;
            default:
                qicVar.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                qicVar.invalidate();
                break;
        }
    }
}
