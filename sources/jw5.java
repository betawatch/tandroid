// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jw5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rw5 b;

    public /* synthetic */ jw5(rw5 rw5Var, byte b) {
        this.a = b;
        this.b = rw5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        rw5 rw5Var = this.b;
        switch (b) {
            case 0:
                rw5Var.Z1.setTranslationY(0.0f);
                break;
            default:
                rw5Var.c2 = false;
                rw5Var.Z1.setTranslationY(0.0f);
                rw5Var.j0();
                break;
        }
    }
}
