// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class hab extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x9b b;

    public /* synthetic */ hab(x9b x9bVar, byte b) {
        this.a = b;
        this.b = x9bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        x9b x9bVar = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                oab oabVar = x9bVar.b;
                l4b l4bVar = oabVar.u1;
                if (l4bVar != null) {
                    l4bVar.b();
                    oabVar.w.removeView(oabVar.u1);
                }
                oabVar.u1 = null;
                oabVar.U();
                break;
            default:
                super.onAnimationEnd(animator);
                l4b l4bVar2 = x9bVar.b.u1;
                if (l4bVar2 != null) {
                    l4bVar2.a(true);
                    break;
                }
                break;
        }
    }
}
