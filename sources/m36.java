// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m36 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n36 b;
    public final /* synthetic */ o36 c;

    public /* synthetic */ m36(o36 o36Var, n36 n36Var, byte b) {
        this.a = b;
        this.c = o36Var;
        this.b = n36Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        o36 o36Var = this.c;
        n36 n36Var = this.b;
        switch (b) {
            case 0:
                n36Var.f = null;
                o36Var.a();
                break;
            default:
                n36Var.f = null;
                o36Var.a();
                break;
        }
    }
}
