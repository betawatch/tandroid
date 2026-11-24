// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a61 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b61 b;

    public /* synthetic */ a61(b61 b61Var, byte b) {
        this.a = b;
        this.b = b61Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        b61 b61Var = this.b;
        switch (b) {
            case 0:
                b61Var.N = false;
                b61Var.e.t(null, false, true);
                break;
            default:
                b61Var.U = 1.0f;
                b61Var.invalidate();
                break;
        }
    }
}
