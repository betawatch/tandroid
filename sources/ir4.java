// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ir4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cm0 b;

    public /* synthetic */ ir4(cm0 cm0Var, byte b) {
        this.a = b;
        this.b = cm0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        cm0 cm0Var = this.b;
        switch (b) {
            case 0:
                ((sr4) cm0Var.c).invalidate();
                break;
            default:
                ((sr4) cm0Var.c).invalidate();
                break;
        }
    }
}
