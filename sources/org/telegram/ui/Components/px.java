package org.telegram.ui.Components;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
