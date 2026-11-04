package ii;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o2 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ a3 d;

    public o2(a3 a3Var, boolean z10, float f10, float f11) {
        this.d = a3Var;
        this.a = z10;
        this.b = f10;
        this.c = f11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a3 a3Var = this.d;
        s2 s2Var = a3Var.E;
        x2 x2Var = a3Var.Y;
        r2 r2Var = a3Var.x;
        a3Var.j0 = false;
        boolean z10 = this.a;
        if (z10) {
            r2Var.setForceOffsetY(-org.telegram.messenger.g0.L(24.0f));
            r2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            r2Var.setSwipeOffsetY(0.0f);
        } else {
            a3Var.I();
            a3Var.L();
            float L = org.telegram.messenger.g0.L(24.0f);
            float f10 = this.b;
            r2Var.setForceOffsetY(f10 - L);
            r2Var.setTopActionBarOffsetY(f10 - org.telegram.messenger.g0.L(24.0f));
            r2Var.setSwipeOffsetY(0.0f);
        }
        float f11 = z10 ? a3Var.i0 : 1.0f - a3Var.i0;
        a3Var.h0 = f11;
        x2Var.setAlpha(1.0f - f11);
        x2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * a3Var.h0);
        a3Var.o0.setAlpha(a3Var.h0);
        if (z10) {
            x2Var.setVisibility(8);
        }
        r2Var.setSwipeOffsetAnimationDisallowed(false);
        r2Var.setTranslationX(org.telegram.messenger.g0.T1(this.c, 0.0f, a3Var.i0));
        a3Var.n0.setTranslationX(0.0f);
        a3Var.f.invalidate();
        s2Var.setViewPortHeightOffset(0.0f);
        s2Var.n(true, true);
        a3Var.H();
    }
}
