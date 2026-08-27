package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class p2 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ b3 d;

    public p2(b3 b3Var, boolean z10, float f10, float f11) {
        this.d = b3Var;
        this.a = z10;
        this.b = f10;
        this.c = f11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b3 b3Var = this.d;
        t2 t2Var = b3Var.x;
        y2 y2Var = b3Var.S;
        s2 s2Var = b3Var.v;
        b3Var.d0 = false;
        boolean z10 = this.a;
        if (z10) {
            s2Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            s2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            s2Var.setSwipeOffsetY(0.0f);
        } else {
            b3Var.D();
            b3Var.G();
            float dp = AndroidUtilities.dp(24.0f);
            float f10 = this.b;
            s2Var.setForceOffsetY(f10 - dp);
            s2Var.setTopActionBarOffsetY(f10 - AndroidUtilities.dp(24.0f));
            s2Var.setSwipeOffsetY(0.0f);
        }
        float f11 = z10 ? b3Var.c0 : 1.0f - b3Var.c0;
        b3Var.b0 = f11;
        y2Var.setAlpha(1.0f - f11);
        y2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * b3Var.b0);
        b3Var.i0.setAlpha(b3Var.b0);
        if (z10) {
            y2Var.setVisibility(8);
        }
        s2Var.setSwipeOffsetAnimationDisallowed(false);
        s2Var.setTranslationX(AndroidUtilities.lerp(this.c, 0.0f, b3Var.c0));
        b3Var.h0.setTranslationX(0.0f);
        b3Var.e.invalidate();
        t2Var.setViewPortHeightOffset(0.0f);
        t2Var.n(true, true);
        b3Var.C();
    }
}
