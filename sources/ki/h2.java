package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class h2 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ t2 d;

    public h2(t2 t2Var, boolean z10, float f10, float f11) {
        this.d = t2Var;
        this.a = z10;
        this.b = f10;
        this.c = f11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t2 t2Var = this.d;
        l2 l2Var = t2Var.E;
        q2 q2Var = t2Var.Y;
        k2 k2Var = t2Var.x;
        t2Var.j0 = false;
        boolean z10 = this.a;
        if (z10) {
            k2Var.setForceOffsetY(-org.telegram.messenger.g0.L(24.0f));
            k2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            k2Var.setSwipeOffsetY(0.0f);
        } else {
            t2Var.I();
            t2Var.L();
            float L = org.telegram.messenger.g0.L(24.0f);
            float f10 = this.b;
            k2Var.setForceOffsetY(f10 - L);
            k2Var.setTopActionBarOffsetY(f10 - org.telegram.messenger.g0.L(24.0f));
            k2Var.setSwipeOffsetY(0.0f);
        }
        float f11 = z10 ? t2Var.i0 : 1.0f - t2Var.i0;
        t2Var.h0 = f11;
        q2Var.setAlpha(1.0f - f11);
        q2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * t2Var.h0);
        t2Var.o0.setAlpha(t2Var.h0);
        if (z10) {
            q2Var.setVisibility(8);
        }
        k2Var.setSwipeOffsetAnimationDisallowed(false);
        k2Var.setTranslationX(org.telegram.messenger.g0.T1(this.c, 0.0f, t2Var.i0));
        t2Var.n0.setTranslationX(0.0f);
        t2Var.f.invalidate();
        l2Var.setViewPortHeightOffset(0.0f);
        l2Var.n(true, true);
        t2Var.H();
    }
}
