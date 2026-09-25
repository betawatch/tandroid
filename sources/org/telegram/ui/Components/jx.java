package org.telegram.ui.Components;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class jx extends org.telegram.ui.wn {
    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.jk jkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (jkVar = this.Y) == null) {
            return;
        }
        jkVar.s1();
        this.Y.postDelayed(new yp(this, 13), 100L);
    }
}
