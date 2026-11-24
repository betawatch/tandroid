// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class l16 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o16 b;
    public final /* synthetic */ n16 c;

    public /* synthetic */ l16(o16 o16Var, n16 n16Var, byte b) {
        this.a = b;
        this.b = o16Var;
        this.c = n16Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        n16 n16Var = this.c;
        o16 o16Var = this.b;
        switch (b) {
            case 0:
                n16Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o16Var.invalidate();
                break;
            default:
                o16Var.getClass();
                n16Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o16Var.invalidate();
                break;
        }
    }
}
