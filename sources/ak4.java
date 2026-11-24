// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ak4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ek4 b;

    public /* synthetic */ ak4(ek4 ek4Var, byte b) {
        this.a = b;
        this.b = ek4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                kk7.f(y6c.t0).d(new s54((Object) this, (byte) 21));
                break;
            default:
                kk7.f(y6c.t0).d(new s54((Object) this, (byte) 22));
                break;
        }
    }
}
