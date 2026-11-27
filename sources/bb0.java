// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class bb0 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ob0 b;

    public /* synthetic */ bb0(ob0 ob0Var, byte b) {
        this.a = b;
        this.b = ob0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ob0 ob0Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                ob0Var.f = false;
                break;
            default:
                ob0Var.m0(false, ob0Var.G ? 1.0f : 0.0f);
                ob0Var.G = false;
                break;
        }
    }
}
