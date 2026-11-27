// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class f7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s7 b;

    public /* synthetic */ f7(s7 s7Var, byte b) {
        this.a = b;
        this.b = s7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        s7 s7Var = this.b;
        switch (b) {
            case 0:
                s7Var.s.setVisibility(4);
                s7Var.w = null;
                break;
            default:
                s7Var.w = null;
                break;
        }
    }
}
