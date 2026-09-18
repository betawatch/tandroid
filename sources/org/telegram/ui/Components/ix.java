package org.telegram.ui.Components;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ix extends org.telegram.ui.zn {
    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.lk lkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (lkVar = this.Y) == null) {
            return;
        }
        lkVar.r1();
        this.Y.postDelayed(new xp(this, 13), 100L);
    }
}
