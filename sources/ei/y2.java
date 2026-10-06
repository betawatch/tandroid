package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class y2 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ l3 d;

    public y2(l3 l3Var, boolean z10, float f7, float f10) {
        this.d = l3Var;
        this.a = z10;
        this.b = f7;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l3 l3Var = this.d;
        c3 c3Var = l3Var.x;
        i3 i3Var = l3Var.W;
        b3 b3Var = l3Var.v;
        l3Var.h0 = false;
        boolean z10 = this.a;
        if (z10) {
            b3Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            b3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            b3Var.setSwipeOffsetY(0.0f);
        } else {
            l3Var.D();
            l3Var.G();
            float dp = AndroidUtilities.dp(24.0f);
            float f7 = this.b;
            b3Var.setForceOffsetY(f7 - dp);
            b3Var.setTopActionBarOffsetY(f7 - AndroidUtilities.dp(24.0f));
            b3Var.setSwipeOffsetY(0.0f);
        }
        float f10 = z10 ? l3Var.g0 : 1.0f - l3Var.g0;
        l3Var.f0 = f10;
        i3Var.setAlpha(1.0f - f10);
        i3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * l3Var.f0);
        l3Var.m0.setAlpha(l3Var.f0);
        if (z10) {
            i3Var.setVisibility(8);
        }
        b3Var.setSwipeOffsetAnimationDisallowed(false);
        b3Var.setTranslationX(AndroidUtilities.lerp(this.c, 0.0f, l3Var.g0));
        l3Var.l0.setTranslationX(0.0f);
        l3Var.e.invalidate();
        c3Var.setViewPortHeightOffset(0.0f);
        c3Var.o(true, true);
        l3Var.C();
    }
}
