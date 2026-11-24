// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fu7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gu7 b;

    public /* synthetic */ fu7(gu7 gu7Var, byte b) {
        this.a = b;
        this.b = gu7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        gu7 gu7Var = this.b;
        switch (b) {
            case 0:
                gu7Var.K = null;
                gu7Var.f.f(new oq7(this, (byte) 2));
                break;
            default:
                gu7Var.f.f(new oq7(this, (byte) 3));
                break;
        }
    }
}
