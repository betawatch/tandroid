package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gx extends org.telegram.ui.xn {
    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        org.telegram.ui.jk jkVar;
        super.onTransitionAnimationEnd(z4, z10);
        if (!z4 || (jkVar = this.V) == null) {
            return;
        }
        jkVar.s1();
        this.V.postDelayed(new vp(this, 13), 100L);
    }
}
