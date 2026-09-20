package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
