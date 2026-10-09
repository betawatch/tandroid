package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class xx extends org.telegram.ui.zn {
    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ok okVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (okVar = this.Y) == null) {
            return;
        }
        okVar.q1();
        this.Y.postDelayed(new nq(this, 13), 100L);
    }
}
