// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class od8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pd8 b;

    public /* synthetic */ od8(pd8 pd8Var, byte b) {
        this.a = b;
        this.b = pd8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        pd8 pd8Var = this.b;
        switch (b) {
            case 0:
                pd8Var.a.n.setVisibility(8);
                break;
            default:
                pd8Var.a.h.setVisibility(8);
                break;
        }
    }
}
