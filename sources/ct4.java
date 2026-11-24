// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ct4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ft4 b;

    public /* synthetic */ ct4(ft4 ft4Var, byte b) {
        this.a = b;
        this.b = ft4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ft4 ft4Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                ft4Var.b.d = 0.0f;
                ft4Var.e0 = null;
                ft4Var.j(ft4Var.M);
                break;
            case 1:
                super.onAnimationEnd(animator);
                ft4Var.b.d = 0.0f;
                ft4Var.e0 = null;
                ft4Var.j(ft4Var.M);
                break;
            case 2:
                super.onAnimationEnd(animator);
                ft4Var.b.d = 0.0f;
                ft4Var.e0 = null;
                ft4Var.j(ft4Var.M);
                break;
            default:
                super.onAnimationEnd(animator);
                ft4Var.b.d = 0.0f;
                ft4Var.e0 = null;
                ft4Var.j(ft4Var.M);
                break;
        }
    }
}
