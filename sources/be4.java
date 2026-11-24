// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class be4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ he4 b;

    public /* synthetic */ be4(he4 he4Var, byte b) {
        this.a = b;
        this.b = he4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        he4 he4Var = this.b;
        switch (b) {
            case 0:
                if (he4Var.C0 == animator) {
                    he4Var.C0 = null;
                    break;
                }
                break;
            default:
                he4Var.V = he4Var.d0;
                he4Var.c0 = he4Var.g0;
                he4Var.W = he4Var.e0;
                he4Var.a0 = he4Var.f0;
                he4Var.d0 = -1;
                he4Var.e0 = -1;
                he4Var.f0 = -1;
                he4Var.g0 = -1;
                break;
        }
    }
}
