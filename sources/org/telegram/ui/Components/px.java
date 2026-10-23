package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
