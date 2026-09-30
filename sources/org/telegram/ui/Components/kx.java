package org.telegram.ui.Components;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
