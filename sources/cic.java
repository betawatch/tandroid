// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class cic implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dic b;

    public /* synthetic */ cic(dic dicVar, byte b) {
        this.a = b;
        this.b = dicVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dic dicVar = this.b;
        switch (b) {
            case 0:
                dicVar.getClass();
                dicVar.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dicVar.a(dicVar.S, dicVar.T);
                break;
            default:
                dicVar.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dicVar.invalidate();
                break;
        }
    }
}
