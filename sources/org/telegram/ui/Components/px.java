package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
