// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fm4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jm4 b;

    public /* synthetic */ fm4(jm4 jm4Var, byte b) {
        this.a = b;
        this.b = jm4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                jn7.f(yac.t0).d(new rj4(this, (byte) 5));
                break;
            default:
                jn7.f(yac.t0).d(new rj4(this, (byte) 6));
                break;
        }
    }
}
