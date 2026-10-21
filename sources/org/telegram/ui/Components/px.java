package org.telegram.ui.Components;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class px extends org.telegram.ui.qn {
    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.fk fkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (fkVar = this.Y) == null) {
            return;
        }
        fkVar.p1();
        this.Y.postDelayed(new hq(this, 13), 100L);
    }
}
