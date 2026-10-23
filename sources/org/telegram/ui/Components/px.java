package org.telegram.ui.Components;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
