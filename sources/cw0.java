// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class cw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ow0 d;

    public cw0(ow0 ow0Var, boolean z, float f, float f2) {
        this.d = ow0Var;
        this.a = z;
        this.b = f;
        this.c = f2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f;
        ow0 ow0Var = this.d;
        gw0 gw0Var = ow0Var.E;
        lw0 lw0Var = ow0Var.Y;
        fw0 fw0Var = ow0Var.x;
        ow0Var.j0 = false;
        boolean z = this.a;
        if (z) {
            fw0Var.setForceOffsetY(-gl.L(24.0f));
            fw0Var.setTopActionBarOffsetY(-gl.L(24.0f));
            fw0Var.setSwipeOffsetY(0.0f);
            f = ow0Var.i0;
        } else {
            ow0Var.I();
            ow0Var.L();
            float L = gl.L(24.0f);
            float f2 = this.b;
            fw0Var.setForceOffsetY(f2 - L);
            fw0Var.setTopActionBarOffsetY(f2 - gl.L(24.0f));
            fw0Var.setSwipeOffsetY(0.0f);
            f = 1.0f - ow0Var.i0;
        }
        ow0Var.h0 = f;
        lw0Var.setAlpha(1.0f - f);
        lw0Var.setTranslationY((-a.getCurrentActionBarHeight()) * ow0Var.h0);
        ow0Var.o0.setAlpha(ow0Var.h0);
        if (z) {
            lw0Var.setVisibility(8);
        }
        fw0Var.setSwipeOffsetAnimationDisallowed(false);
        fw0Var.setTranslationX(gl.R1(this.c, 0.0f, ow0Var.i0));
        ow0Var.n0.setTranslationX(0.0f);
        ow0Var.f.invalidate();
        gw0Var.setViewPortHeightOffset(0.0f);
        gw0Var.l(true, true);
        ow0Var.H();
    }
}
