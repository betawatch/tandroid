// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class aab extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cab b;

    public /* synthetic */ aab(cab cabVar, byte b) {
        this.a = b;
        this.b = cabVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        cab cabVar = this.b;
        switch (b) {
            case 0:
                oab oabVar = cabVar.y0;
                oabVar.Y = 0.0f;
                oabVar.V();
                break;
            default:
                oab oabVar2 = cabVar.y0;
                oabVar2.X = 0.0f;
                oabVar2.a0 = 0.0f;
                oabVar2.V();
                break;
        }
    }
}
