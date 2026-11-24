// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gyb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oyb b;

    public /* synthetic */ gyb(oyb oybVar, byte b) {
        this.a = b;
        this.b = oybVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        oyb oybVar = this.b;
        switch (b) {
            case 0:
                if (oybVar.b0 == animator) {
                    oybVar.b0 = null;
                    break;
                }
                break;
            case 1:
                if (oybVar.k0 == animator) {
                    oybVar.k0 = null;
                }
                oybVar.b(1.0f);
                break;
            default:
                if (oybVar.K == animator) {
                    oybVar.K = null;
                    break;
                }
                break;
        }
    }
}
