package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ox extends org.telegram.ui.un {
    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.r2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.hk hkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (hkVar = this.Y) == null) {
            return;
        }
        hkVar.p1();
        this.Y.postDelayed(new bq(this, 14), 100L);
    }
}
