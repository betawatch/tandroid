package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class uw extends org.telegram.ui.rn {
    @Override // org.telegram.ui.rn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ck ckVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (ckVar = this.U) == null) {
            return;
        }
        ckVar.r1();
        this.U.postDelayed(new lp(this, 13), 100L);
    }
}
