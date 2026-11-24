// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f85 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g95 b;

    public /* synthetic */ f85(g95 g95Var, byte b) {
        this.a = b;
        this.b = g95Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        g95 g95Var = this.b;
        switch (b) {
            case 0:
                g95Var.O1.setVisibility(4);
                g95Var.P1.setVisibility(4);
                g95Var.N1.setVisibility(4);
                break;
            default:
                g95Var.a2 = null;
                break;
        }
    }
}
