package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gx extends org.telegram.ui.zn {
    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        org.telegram.ui.lk lkVar;
        super.onTransitionAnimationEnd(z4, z10);
        if (!z4 || (lkVar = this.V) == null) {
            return;
        }
        lkVar.s1();
        this.V.postDelayed(new up(this, 13), 100L);
    }
}
