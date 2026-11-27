// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class mt4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cm0 b;

    public /* synthetic */ mt4(cm0 cm0Var, byte b) {
        this.a = b;
        this.b = cm0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        cm0 cm0Var = this.b;
        switch (b) {
            case 0:
                ((wt4) cm0Var.c).invalidate();
                break;
            default:
                ((wt4) cm0Var.c).invalidate();
                break;
        }
    }
}
