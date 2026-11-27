// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class e82 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f82 b;

    public /* synthetic */ e82(f82 f82Var, byte b) {
        this.a = b;
        this.b = f82Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.R = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        f82 f82Var = this.b;
        switch (b) {
            case 0:
                if (f82Var.R == animator) {
                    f82Var.getSubtitleTextView().setVisibility(4);
                    f82Var.R = null;
                    break;
                }
                break;
            default:
                f82Var.R = null;
                break;
        }
    }
}
