// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class b51 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c51 b;

    public /* synthetic */ b51(c51 c51Var, byte b) {
        this.a = b;
        this.b = c51Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        c51 c51Var = this.b;
        switch (b) {
            case 0:
                c51Var.N = false;
                c51Var.e.t(null, false, true);
                break;
            default:
                c51Var.U = 1.0f;
                c51Var.invalidate();
                break;
        }
    }
}
