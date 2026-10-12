package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class tx extends org.telegram.ui.fo {
    @Override // org.telegram.ui.fo, org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.sk skVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (skVar = this.Y) == null) {
            return;
        }
        skVar.q1();
        this.Y.postDelayed(new kq(this, 13), 100L);
    }
}
