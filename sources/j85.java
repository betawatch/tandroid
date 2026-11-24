// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class j85 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o85 b;

    public /* synthetic */ j85(o85 o85Var, byte b) {
        this.a = b;
        this.b = o85Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        o85 o85Var = this.b;
        switch (b) {
            case 0:
                o85Var.b.setVisibility(8);
                o85Var.F = false;
                o85Var.G = 0.0f;
                break;
            default:
                o85Var.e.setVisibility(8);
                break;
        }
    }
}
