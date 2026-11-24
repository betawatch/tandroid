// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class n72 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o72 b;

    public /* synthetic */ n72(o72 o72Var, byte b) {
        this.a = b;
        this.b = o72Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.R = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        o72 o72Var = this.b;
        switch (b) {
            case 0:
                if (o72Var.R == animator) {
                    o72Var.getSubtitleTextView().setVisibility(4);
                    o72Var.R = null;
                    break;
                }
                break;
            default:
                o72Var.R = null;
                break;
        }
    }
}
