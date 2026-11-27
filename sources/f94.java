// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
