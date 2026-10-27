package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class a3 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ m3 d;

    public a3(m3 m3Var, boolean z10, float f7, float f10) {
        this.d = m3Var;
        this.a = z10;
        this.b = f7;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m3 m3Var = this.d;
        e3 e3Var = m3Var.y;
        j3 j3Var = m3Var.X;
        d3 d3Var = m3Var.w;
        m3Var.i0 = false;
        boolean z10 = this.a;
        if (z10) {
            d3Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            d3Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            d3Var.setSwipeOffsetY(0.0f);
        } else {
            m3Var.E();
            m3Var.H();
            float dp = AndroidUtilities.dp(24.0f);
            float f7 = this.b;
            d3Var.setForceOffsetY(f7 - dp);
            d3Var.setTopActionBarOffsetY(f7 - AndroidUtilities.dp(24.0f));
            d3Var.setSwipeOffsetY(0.0f);
        }
        float f10 = z10 ? m3Var.h0 : 1.0f - m3Var.h0;
        m3Var.g0 = f10;
        j3Var.setAlpha(1.0f - f10);
        j3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * m3Var.g0);
        m3Var.n0.setAlpha(m3Var.g0);
        if (z10) {
            j3Var.setVisibility(8);
        }
        d3Var.setSwipeOffsetAnimationDisallowed(false);
        d3Var.setTranslationX(AndroidUtilities.lerp(this.c, 0.0f, m3Var.h0));
        m3Var.m0.setTranslationX(0.0f);
        m3Var.f.invalidate();
        e3Var.setViewPortHeightOffset(0.0f);
        e3Var.n(true, true);
        m3Var.D();
    }
}
