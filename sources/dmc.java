// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dmc extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ emc b;

    public /* synthetic */ dmc(emc emcVar, byte b) {
        this.a = b;
        this.b = emcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        emc emcVar = this.b;
        switch (b) {
            case 0:
                emcVar.b.setVisibility(8);
                break;
            default:
                emcVar.c.setVisibility(8);
                break;
        }
    }
}
