package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dw extends org.telegram.ui.wm {
    @Override // org.telegram.ui.wm, org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.mj mjVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (mjVar = this.a0) == null) {
            return;
        }
        mjVar.r1();
        this.a0.postDelayed(new gp(this, 12), 100L);
    }
}
