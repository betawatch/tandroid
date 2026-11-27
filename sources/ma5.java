// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ma5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ra5 b;

    public /* synthetic */ ma5(ra5 ra5Var, byte b) {
        this.a = b;
        this.b = ra5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ra5 ra5Var = this.b;
        switch (b) {
            case 0:
                ra5Var.b.setVisibility(8);
                ra5Var.F = false;
                ra5Var.G = 0.0f;
                break;
            default:
                ra5Var.e.setVisibility(8);
                break;
        }
    }
}
