package org.telegram.ui.Components;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ix extends org.telegram.ui.co {
    @Override // org.telegram.ui.co, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.mk mkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (mkVar = this.Y) == null) {
            return;
        }
        mkVar.s1();
        this.Y.postDelayed(new wp(this, 13), 100L);
    }
}
