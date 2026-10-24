package org.telegram.ui.Components;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class px extends org.telegram.ui.sn {
    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.gk gkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (gkVar = this.Y) == null) {
            return;
        }
        gkVar.p1();
        this.Y.postDelayed(new zp(this, 14), 100L);
    }
}
