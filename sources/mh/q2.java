package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class q2 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ c3 d;

    public q2(c3 c3Var, boolean z10, float f10, float f11) {
        this.d = c3Var;
        this.a = z10;
        this.b = f10;
        this.c = f11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        c3 c3Var = this.d;
        u2 u2Var = c3Var.x;
        z2 z2Var = c3Var.S;
        t2 t2Var = c3Var.v;
        c3Var.d0 = false;
        boolean z10 = this.a;
        if (z10) {
            t2Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            t2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            t2Var.setSwipeOffsetY(0.0f);
        } else {
            c3Var.D();
            c3Var.G();
            float dp = AndroidUtilities.dp(24.0f);
            float f10 = this.b;
            t2Var.setForceOffsetY(f10 - dp);
            t2Var.setTopActionBarOffsetY(f10 - AndroidUtilities.dp(24.0f));
            t2Var.setSwipeOffsetY(0.0f);
        }
        float f11 = z10 ? c3Var.c0 : 1.0f - c3Var.c0;
        c3Var.b0 = f11;
        z2Var.setAlpha(1.0f - f11);
        z2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * c3Var.b0);
        c3Var.i0.setAlpha(c3Var.b0);
        if (z10) {
            z2Var.setVisibility(8);
        }
        t2Var.setSwipeOffsetAnimationDisallowed(false);
        t2Var.setTranslationX(AndroidUtilities.lerp(this.c, 0.0f, c3Var.c0));
        c3Var.h0.setTranslationX(0.0f);
        c3Var.e.invalidate();
        u2Var.setViewPortHeightOffset(0.0f);
        u2Var.n(true, true);
        c3Var.C();
    }
}
