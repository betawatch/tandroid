package org.telegram.ui.Components;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class px extends org.telegram.ui.sn {
    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.hk hkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (hkVar = this.Y) == null) {
            return;
        }
        hkVar.q1();
        this.Y.postDelayed(new hq(this, 13), 100L);
    }
}
