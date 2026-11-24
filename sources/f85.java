// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class f85 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h85 b;

    public /* synthetic */ f85(h85 h85Var, byte b) {
        this.a = b;
        this.b = h85Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        h85 h85Var = this.b;
        switch (b) {
            case 0:
                h85Var.F = false;
                h85Var.invalidate();
                break;
            case 1:
                g85 g85Var = h85Var.b0;
                float f = h85Var.W ? 0.0f : 1.0f;
                h85Var.a0 = f;
                g85Var.setAlpha(f);
                g85Var.setVisibility(h85Var.W ? 8 : 0);
                h85Var.a.invalidate();
                break;
            case 2:
                super.onAnimationEnd(animator);
                h85Var.H0 = null;
                d85 d85Var = h85Var.a;
                d85Var.setRotationY(0.0f);
                if (!h85Var.I0) {
                    d85Var.d.clearImage();
                    break;
                }
                break;
            case 3:
                h85Var.F = false;
                break;
            default:
                h85Var.F = false;
                break;
        }
    }
}
