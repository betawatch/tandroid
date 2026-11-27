// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class j62 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a72 b;

    public /* synthetic */ j62(a72 a72Var, byte b) {
        this.a = b;
        this.b = a72Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        a72 a72Var = this.b;
        switch (b) {
            case 0:
                a72Var.F.setTranslationY(0.0f);
                break;
            case 1:
                a72Var.F.setTranslationY(0.0f);
                break;
            default:
                a72Var.g1 = false;
                a72Var.F.setTranslationY(0.0f);
                a72Var.Z();
                break;
        }
    }
}
