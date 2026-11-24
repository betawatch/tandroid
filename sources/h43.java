// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class h43 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m43 b;

    public /* synthetic */ h43(m43 m43Var, byte b) {
        this.a = b;
        this.b = m43Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        m43 m43Var = this.b;
        switch (b) {
            case 0:
                m43Var.getClass();
                m43Var.a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                m43Var.a.invalidate();
                break;
        }
    }
}
