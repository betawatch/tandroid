package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class r2 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ d3 d;

    public r2(d3 d3Var, boolean z10, float f7, float f10) {
        this.d = d3Var;
        this.a = z10;
        this.b = f7;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d3 d3Var = this.d;
        v2 v2Var = d3Var.y;
        a3 a3Var = d3Var.X;
        u2 u2Var = d3Var.w;
        d3Var.i0 = false;
        boolean z10 = this.a;
        if (z10) {
            u2Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            u2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            u2Var.setSwipeOffsetY(0.0f);
        } else {
            d3Var.E();
            d3Var.H();
            float dp = AndroidUtilities.dp(24.0f);
            float f7 = this.b;
            u2Var.setForceOffsetY(f7 - dp);
            u2Var.setTopActionBarOffsetY(f7 - AndroidUtilities.dp(24.0f));
            u2Var.setSwipeOffsetY(0.0f);
        }
        float f10 = z10 ? d3Var.h0 : 1.0f - d3Var.h0;
        d3Var.g0 = f10;
        a3Var.setAlpha(1.0f - f10);
        a3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * d3Var.g0);
        d3Var.n0.setAlpha(d3Var.g0);
        if (z10) {
            a3Var.setVisibility(8);
        }
        u2Var.setSwipeOffsetAnimationDisallowed(false);
        u2Var.setTranslationX(AndroidUtilities.lerp(this.c, 0.0f, d3Var.h0));
        d3Var.m0.setTranslationX(0.0f);
        d3Var.f.invalidate();
        v2Var.setViewPortHeightOffset(0.0f);
        v2Var.n(true, true);
        d3Var.D();
    }
}
