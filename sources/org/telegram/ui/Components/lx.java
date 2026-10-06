package org.telegram.ui.Components;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
