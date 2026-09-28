package org.telegram.ui.Components;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class kx extends org.telegram.ui.wn {
    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.jk jkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (jkVar = this.Y) == null) {
            return;
        }
        jkVar.s1();
        this.Y.postDelayed(new zp(this, 13), 100L);
    }
}
