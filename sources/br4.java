// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class br4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ er4 b;

    public /* synthetic */ br4(er4 er4Var, byte b) {
        this.a = b;
        this.b = er4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        er4 er4Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                er4Var.b.d = 0.0f;
                er4Var.e0 = null;
                er4Var.j(er4Var.M);
                break;
            case 1:
                super.onAnimationEnd(animator);
                er4Var.b.d = 0.0f;
                er4Var.e0 = null;
                er4Var.j(er4Var.M);
                break;
            case 2:
                super.onAnimationEnd(animator);
                er4Var.b.d = 0.0f;
                er4Var.e0 = null;
                er4Var.j(er4Var.M);
                break;
            default:
                super.onAnimationEnd(animator);
                er4Var.b.d = 0.0f;
                er4Var.e0 = null;
                er4Var.j(er4Var.M);
                break;
        }
    }
}
