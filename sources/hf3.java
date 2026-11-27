// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hf3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ of3 b;

    public /* synthetic */ hf3(of3 of3Var, byte b) {
        this.a = b;
        this.b = of3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        of3 of3Var = this.b;
        switch (b) {
            case 0:
                of3Var.W3 = 1.0f;
                of3Var.Z3 = null;
                of3Var.a4 = null;
                of3Var.b4 = null;
                of3Var.invalidate();
                break;
            case 1:
                of3Var.X3 = 1.0f;
                of3Var.invalidate();
                break;
            default:
                int i = (of3Var.T2 ? 1 : 0) + (of3Var.R2 ? 2 : 0) + (of3Var.S2 ? 4 : 0);
                int i2 = of3Var.w4;
                if (i2 != i) {
                    of3Var.I(i2, i);
                } else {
                    of3Var.A4 = false;
                    of3Var.y4 = i2;
                }
                of3Var.invalidate();
                break;
        }
    }
}
