package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
