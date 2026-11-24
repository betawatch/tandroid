// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cx0 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dx0 b;

    public /* synthetic */ cx0(dx0 dx0Var, byte b) {
        this.a = b;
        this.b = dx0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        dx0 dx0Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = dx0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dx0Var.h = null;
                }
                kk7.e().k(99, 512);
                break;
            case 1:
                dx0Var.E = 0.0f;
                fx0 fx0Var = dx0Var.H;
                fx0Var.b.setTranslationX(0.0f);
                fx0Var.c.invalidate();
                break;
            case 2:
                fx0 fx0Var2 = dx0Var.H;
                fx0Var2.O0 = true;
                fx0Var2.b.setTranslationX(dx0Var.getMeasuredWidth());
                fx0Var2.dismiss();
                fx0Var2.c.invalidate();
                break;
            default:
                fx0 fx0Var3 = dx0Var.H;
                fx0Var3.b.setTranslationY(0.0f);
                fx0Var3.e0();
                fx0Var3.n0(fx0Var3.b.getTranslationY());
                dx0Var.invalidate();
                break;
        }
    }
}
