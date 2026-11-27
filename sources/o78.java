// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class o78 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r78 b;

    public /* synthetic */ o78(r78 r78Var, byte b) {
        this.a = b;
        this.b = r78Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        r78 r78Var = this.b;
        switch (b) {
            case 0:
                r78Var.w1 = null;
                break;
            default:
                r78Var.x1 = null;
                break;
        }
    }
}
