package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uw extends org.telegram.ui.qn {
    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.ak akVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || (akVar = this.U) == null) {
            return;
        }
        akVar.s1();
        this.U.postDelayed(new np(this, 13), 100L);
    }
}
