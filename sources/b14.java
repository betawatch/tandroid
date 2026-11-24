// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b14 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ e34 c;

    public /* synthetic */ b14(e34 e34Var, boolean z, byte b) {
        this.a = b;
        this.c = e34Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        e34 e34Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    e34Var.y.setVisibility(4);
                    break;
                }
                break;
            default:
                if (!z) {
                    e34Var.E.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
