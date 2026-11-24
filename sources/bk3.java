// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bk3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ck3 b;

    public /* synthetic */ bk3(ck3 ck3Var, byte b) {
        this.a = b;
        this.b = ck3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ck3 ck3Var = this.b;
        switch (b) {
            case 0:
                Runnable runnable = ck3Var.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == ck3Var.e) {
                    ck3Var.e = null;
                    break;
                }
                break;
            default:
                Runnable runnable2 = ck3Var.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == ck3Var.e) {
                    ck3Var.e = null;
                    break;
                }
                break;
        }
    }
}
