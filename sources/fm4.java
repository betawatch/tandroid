// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
