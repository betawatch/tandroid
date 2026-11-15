package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class l2 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ x2 d;

    public l2(x2 x2Var, boolean z10, float f10, float f11) {
        this.d = x2Var;
        this.a = z10;
        this.b = f10;
        this.c = f11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        x2 x2Var = this.d;
        p2 p2Var = x2Var.E;
        u2 u2Var = x2Var.Y;
        o2 o2Var = x2Var.x;
        x2Var.j0 = false;
        boolean z10 = this.a;
        if (z10) {
            o2Var.setForceOffsetY(-org.telegram.messenger.g0.L(24.0f));
            o2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            o2Var.setSwipeOffsetY(0.0f);
        } else {
            x2Var.I();
            x2Var.L();
            float L = org.telegram.messenger.g0.L(24.0f);
            float f10 = this.b;
            o2Var.setForceOffsetY(f10 - L);
            o2Var.setTopActionBarOffsetY(f10 - org.telegram.messenger.g0.L(24.0f));
            o2Var.setSwipeOffsetY(0.0f);
        }
        float f11 = z10 ? x2Var.i0 : 1.0f - x2Var.i0;
        x2Var.h0 = f11;
        u2Var.setAlpha(1.0f - f11);
        u2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * x2Var.h0);
        x2Var.o0.setAlpha(x2Var.h0);
        if (z10) {
            u2Var.setVisibility(8);
        }
        o2Var.setSwipeOffsetAnimationDisallowed(false);
        o2Var.setTranslationX(org.telegram.messenger.g0.T1(this.c, 0.0f, x2Var.i0));
        x2Var.n0.setTranslationX(0.0f);
        x2Var.f.invalidate();
        p2Var.setViewPortHeightOffset(0.0f);
        p2Var.n(true, true);
        x2Var.H();
    }
}
