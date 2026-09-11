package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class x2 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ k3 d;

    public x2(k3 k3Var, boolean z10, float f7, float f10) {
        this.d = k3Var;
        this.a = z10;
        this.b = f7;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k3 k3Var = this.d;
        b3 b3Var = k3Var.x;
        h3 h3Var = k3Var.W;
        a3 a3Var = k3Var.v;
        k3Var.h0 = false;
        boolean z10 = this.a;
        if (z10) {
            a3Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            a3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            a3Var.setSwipeOffsetY(0.0f);
        } else {
            k3Var.D();
            k3Var.G();
            float dp = AndroidUtilities.dp(24.0f);
            float f7 = this.b;
            a3Var.setForceOffsetY(f7 - dp);
            a3Var.setTopActionBarOffsetY(f7 - AndroidUtilities.dp(24.0f));
            a3Var.setSwipeOffsetY(0.0f);
        }
        float f10 = z10 ? k3Var.g0 : 1.0f - k3Var.g0;
        k3Var.f0 = f10;
        h3Var.setAlpha(1.0f - f10);
        h3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * k3Var.f0);
        k3Var.m0.setAlpha(k3Var.f0);
        if (z10) {
            h3Var.setVisibility(8);
        }
        a3Var.setSwipeOffsetAnimationDisallowed(false);
        a3Var.setTranslationX(AndroidUtilities.lerp(this.c, 0.0f, k3Var.g0));
        k3Var.l0.setTranslationX(0.0f);
        k3Var.e.invalidate();
        b3Var.setViewPortHeightOffset(0.0f);
        b3Var.o(true, true);
        k3Var.C();
    }
}
