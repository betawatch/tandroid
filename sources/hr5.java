// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hr5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ir5 b;

    public /* synthetic */ hr5(ir5 ir5Var, byte b) {
        this.a = b;
        this.b = ir5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ir5 ir5Var = this.b;
        switch (b) {
            case 0:
                ir5Var.e.X1 = null;
                ir5Var.requestLayout();
                break;
            default:
                ir5Var.e.X1 = null;
                ir5Var.a = false;
                break;
        }
    }
}
