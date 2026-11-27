// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class mx7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx7 b;

    public /* synthetic */ mx7(nx7 nx7Var, byte b) {
        this.a = b;
        this.b = nx7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        nx7 nx7Var = this.b;
        switch (b) {
            case 0:
                nx7Var.K = null;
                nx7Var.f.f(new ge7(this, (byte) 17));
                break;
            default:
                nx7Var.f.f(new ge7(this, (byte) 18));
                break;
        }
    }
}
