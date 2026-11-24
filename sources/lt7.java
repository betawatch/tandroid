// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class lt7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wt7 b;

    public /* synthetic */ lt7(wt7 wt7Var, byte b) {
        this.a = b;
        this.b = wt7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        wt7 wt7Var = this.b;
        switch (b) {
            case 0:
                wt7Var.R1 = 0.0f;
                wt7Var.P1.setAlpha(1.0f);
                wt7Var.P1.setVisibility(8);
                wt7Var.P1.k();
                break;
            case 1:
                wt7Var.j2.setTranslationY(0.0f);
                break;
            default:
                wt7Var.m2 = false;
                wt7Var.j2.setTranslationY(0.0f);
                wt7Var.t0();
                break;
        }
    }
}
