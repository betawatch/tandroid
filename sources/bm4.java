// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bm4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fm4 b;

    public /* synthetic */ bm4(fm4 fm4Var, byte b) {
        this.a = b;
        this.b = fm4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                nm7.f(z8c.t0).d(new a14((Object) this, (byte) 28));
                break;
            default:
                nm7.f(z8c.t0).d(new a14((Object) this, (byte) 29));
                break;
        }
    }
}
