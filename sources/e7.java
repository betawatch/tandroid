// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class e7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7 b;

    public /* synthetic */ e7(r7 r7Var, byte b) {
        this.a = b;
        this.b = r7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        r7 r7Var = this.b;
        switch (b) {
            case 0:
                r7Var.s.setVisibility(4);
                r7Var.w = null;
                break;
            default:
                r7Var.w = null;
                break;
        }
    }
}
