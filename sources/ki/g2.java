package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class g2 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ s2 d;

    public g2(s2 s2Var, boolean z10, float f10, float f11) {
        this.d = s2Var;
        this.a = z10;
        this.b = f10;
        this.c = f11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        s2 s2Var = this.d;
        k2 k2Var = s2Var.E;
        p2 p2Var = s2Var.Y;
        j2 j2Var = s2Var.x;
        s2Var.j0 = false;
        boolean z10 = this.a;
        if (z10) {
            j2Var.setForceOffsetY(-org.telegram.messenger.g0.L(24.0f));
            j2Var.setTopActionBarOffsetY(-org.telegram.messenger.g0.L(24.0f));
            j2Var.setSwipeOffsetY(0.0f);
        } else {
            s2Var.I();
            s2Var.L();
            float L = org.telegram.messenger.g0.L(24.0f);
            float f10 = this.b;
            j2Var.setForceOffsetY(f10 - L);
            j2Var.setTopActionBarOffsetY(f10 - org.telegram.messenger.g0.L(24.0f));
            j2Var.setSwipeOffsetY(0.0f);
        }
        float f11 = z10 ? s2Var.i0 : 1.0f - s2Var.i0;
        s2Var.h0 = f11;
        p2Var.setAlpha(1.0f - f11);
        p2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * s2Var.h0);
        s2Var.o0.setAlpha(s2Var.h0);
        if (z10) {
            p2Var.setVisibility(8);
        }
        j2Var.setSwipeOffsetAnimationDisallowed(false);
        j2Var.setTranslationX(org.telegram.messenger.g0.T1(this.c, 0.0f, s2Var.i0));
        s2Var.n0.setTranslationX(0.0f);
        s2Var.f.invalidate();
        k2Var.setViewPortHeightOffset(0.0f);
        k2Var.n(true, true);
        s2Var.H();
    }
}
