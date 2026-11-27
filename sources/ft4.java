// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ft4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ it4 b;

    public /* synthetic */ ft4(it4 it4Var, byte b) {
        this.a = b;
        this.b = it4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        it4 it4Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                it4Var.b.d = 0.0f;
                it4Var.e0 = null;
                it4Var.j(it4Var.M);
                break;
            case 1:
                super.onAnimationEnd(animator);
                it4Var.b.d = 0.0f;
                it4Var.e0 = null;
                it4Var.j(it4Var.M);
                break;
            case 2:
                super.onAnimationEnd(animator);
                it4Var.b.d = 0.0f;
                it4Var.e0 = null;
                it4Var.j(it4Var.M);
                break;
            default:
                super.onAnimationEnd(animator);
                it4Var.b.d = 0.0f;
                it4Var.e0 = null;
                it4Var.j(it4Var.M);
                break;
        }
    }
}
