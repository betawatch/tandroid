package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bx extends org.telegram.ui.tn {
    @Override // org.telegram.ui.tn, org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.dk dkVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (dkVar = this.U) == null) {
            return;
        }
        dkVar.s1();
        this.U.postDelayed(new rp(this, 13), 100L);
    }
}
