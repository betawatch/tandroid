// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class f94 extends AnimatorListenerAdapter {
    public final /* synthetic */ h94 a;

    public f94(h94 h94Var) {
        this.a = h94Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h94 h94Var = this.a;
        if (h94Var.r) {
            h94Var.d.setVisibility(4);
        } else {
            h94Var.e.setVisibility(4);
        }
    }
}
