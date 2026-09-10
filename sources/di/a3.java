package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class a3 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ n3 d;

    public a3(n3 n3Var, boolean z10, float f7, float f10) {
        this.d = n3Var;
        this.a = z10;
        this.b = f7;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        n3 n3Var = this.d;
        e3 e3Var = n3Var.x;
        k3 k3Var = n3Var.W;
        d3 d3Var = n3Var.v;
        n3Var.h0 = false;
        boolean z10 = this.a;
        if (z10) {
            d3Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            d3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            d3Var.setSwipeOffsetY(0.0f);
        } else {
            n3Var.D();
            n3Var.G();
            float dp = AndroidUtilities.dp(24.0f);
            float f7 = this.b;
            d3Var.setForceOffsetY(f7 - dp);
            d3Var.setTopActionBarOffsetY(f7 - AndroidUtilities.dp(24.0f));
            d3Var.setSwipeOffsetY(0.0f);
        }
        float f10 = z10 ? n3Var.g0 : 1.0f - n3Var.g0;
        n3Var.f0 = f10;
        k3Var.setAlpha(1.0f - f10);
        k3Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * n3Var.f0);
        n3Var.m0.setAlpha(n3Var.f0);
        if (z10) {
            k3Var.setVisibility(8);
        }
        d3Var.setSwipeOffsetAnimationDisallowed(false);
        d3Var.setTranslationX(AndroidUtilities.lerp(this.c, 0.0f, n3Var.g0));
        n3Var.l0.setTranslationX(0.0f);
        n3Var.e.invalidate();
        e3Var.setViewPortHeightOffset(0.0f);
        e3Var.o(true, true);
        n3Var.C();
    }
}
