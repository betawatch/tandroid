package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class lx extends org.telegram.ui.yn {
    @Override // org.telegram.ui.yn, org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.jk jkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (jkVar = this.W) == null) {
            return;
        }
        jkVar.r1();
        this.W.postDelayed(new aq(this, 13), 100L);
    }
}
