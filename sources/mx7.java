// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
                nx7Var.f.f(new fe7(this, (byte) 17));
                break;
            default:
                nx7Var.f.f(new fe7(this, (byte) 18));
                break;
        }
    }
}
