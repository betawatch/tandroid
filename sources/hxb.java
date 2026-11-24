// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class hxb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jxb b;

    public /* synthetic */ hxb(jxb jxbVar, byte b) {
        this.a = b;
        this.b = jxbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        jxb jxbVar = this.b;
        switch (b) {
            case 0:
                jxbVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jxbVar.h();
                jxbVar.g();
                break;
            default:
                jxbVar.M = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                jxbVar.h.invalidate();
                break;
        }
    }
}
