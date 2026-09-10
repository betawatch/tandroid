package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class nx extends org.telegram.ui.eo {
    @Override // org.telegram.ui.eo, org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ok okVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (okVar = this.Y) == null) {
            return;
        }
        okVar.s1();
        this.Y.postDelayed(new dq(this, 13), 100L);
    }
}
