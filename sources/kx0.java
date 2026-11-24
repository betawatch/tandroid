// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class kx0 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ wx0 d;

    public kx0(wx0 wx0Var, boolean z, float f, float f2) {
        this.d = wx0Var;
        this.a = z;
        this.b = f;
        this.c = f2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f;
        wx0 wx0Var = this.d;
        ox0 ox0Var = wx0Var.E;
        tx0 tx0Var = wx0Var.Y;
        nx0 nx0Var = wx0Var.x;
        wx0Var.j0 = false;
        boolean z = this.a;
        if (z) {
            nx0Var.setForceOffsetY(-gm.L(24.0f));
            nx0Var.setTopActionBarOffsetY(-gm.L(24.0f));
            nx0Var.setSwipeOffsetY(0.0f);
            f = wx0Var.i0;
        } else {
            wx0Var.I();
            wx0Var.L();
            float L = gm.L(24.0f);
            float f2 = this.b;
            nx0Var.setForceOffsetY(f2 - L);
            nx0Var.setTopActionBarOffsetY(f2 - gm.L(24.0f));
            nx0Var.setSwipeOffsetY(0.0f);
            f = 1.0f - wx0Var.i0;
        }
        wx0Var.h0 = f;
        tx0Var.setAlpha(1.0f - f);
        tx0Var.setTranslationY((-a.getCurrentActionBarHeight()) * wx0Var.h0);
        wx0Var.o0.setAlpha(wx0Var.h0);
        if (z) {
            tx0Var.setVisibility(8);
        }
        nx0Var.setSwipeOffsetAnimationDisallowed(false);
        nx0Var.setTranslationX(gm.R1(this.c, 0.0f, wx0Var.i0));
        wx0Var.n0.setTranslationX(0.0f);
        wx0Var.f.invalidate();
        ox0Var.setViewPortHeightOffset(0.0f);
        ox0Var.l(true, true);
        wx0Var.H();
    }
}
