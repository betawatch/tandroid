package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class pw extends org.telegram.ui.bn {
    @Override // org.telegram.ui.bn, org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.rj rjVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (rjVar = this.a0) == null) {
            return;
        }
        rjVar.Y1();
        this.a0.postDelayed(new lo(this, 14), 100L);
    }
}
