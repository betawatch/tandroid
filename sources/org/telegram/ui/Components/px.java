package org.telegram.ui.Components;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
