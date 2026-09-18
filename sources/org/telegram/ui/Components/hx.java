package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hx extends org.telegram.ui.bo {
    @Override // org.telegram.ui.bo, org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.nk nkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (nkVar = this.Y) == null) {
            return;
        }
        nkVar.s1();
        this.Y.postDelayed(new xp(this, 13), 100L);
    }
}
